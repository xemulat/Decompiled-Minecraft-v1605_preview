/*     */ package paulscode.sound.libraries;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.LinkedList;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import paulscode.sound.Channel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ChannelLWJGLOpenAL
/*     */   extends Channel
/*     */ {
/*     */   public IntBuffer ALSource;
/*     */   public int ALformat;
/*     */   public int sampleRate;
/*     */   ByteBuffer bufferBuffer;
/*     */   
/*     */   public void cleanup() {
/*     */     if (this.ALSource != null) {
/*     */       try {
/*     */         AL10.alSourceStop(this.ALSource);
/*     */         AL10.alGetError();
/*     */       } catch (Exception exception) {}
/*     */       try {
/*     */         AL10.alDeleteSources(this.ALSource);
/*     */         AL10.alGetError();
/*     */       } catch (Exception exception) {}
/*     */       this.ALSource.clear();
/*     */     } 
/*     */     this.ALSource = null;
/*     */     super.cleanup();
/*     */   }
/*     */   
/*     */   public ChannelLWJGLOpenAL(int paramInt, IntBuffer paramIntBuffer) {
/* 118 */     super(paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     this.bufferBuffer = BufferUtils.createByteBuffer(5242880);
/*     */     this.libraryType = LibraryLWJGLOpenAL.class;
/*     */     this.ALSource = paramIntBuffer;
/*     */   } public boolean attachBuffer(IntBuffer paramIntBuffer) { if (errorCheck((this.channelType != 0), "Sound buffers may only be attached to normal sources."))
/*     */       return false; 
/*     */     AL10.alSourcei(this.ALSource.get(0), 4105, paramIntBuffer.get(0));
/* 251 */     return checkALError(); } public boolean preLoadBuffers(LinkedList<byte[]> paramLinkedList) { if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources."))
/*     */     {
/* 253 */       return false;
/*     */     }
/* 255 */     if (errorCheck((paramLinkedList == null), "Buffer List null in method 'preLoadBuffers'"))
/*     */     {
/* 257 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 262 */     boolean bool = playing();
/*     */     
/* 264 */     if (bool) {
/*     */       
/* 266 */       AL10.alSourceStop(this.ALSource.get(0));
/* 267 */       checkALError();
/*     */     } 
/*     */     
/* 270 */     int i = AL10.alGetSourcei(this.ALSource.get(0), 4118);
/*     */     
/* 272 */     if (i > 0) {
/*     */       
/* 274 */       IntBuffer intBuffer1 = BufferUtils.createIntBuffer(i);
/* 275 */       AL10.alGenBuffers(intBuffer1);
/* 276 */       if (errorCheck(checkALError(), "Error clearing stream buffers in method 'preLoadBuffers'"))
/*     */       {
/* 278 */         return false; } 
/* 279 */       AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer1);
/* 280 */       if (errorCheck(checkALError(), "Error unqueuing stream buffers in method 'preLoadBuffers'"))
/*     */       {
/* 282 */         return false;
/*     */       }
/*     */     } 
/* 285 */     if (bool) {
/*     */       
/* 287 */       AL10.alSourcePlay(this.ALSource.get(0));
/* 288 */       checkALError();
/*     */     } 
/*     */     
/* 291 */     IntBuffer intBuffer = BufferUtils.createIntBuffer(paramLinkedList.size());
/* 292 */     AL10.alGenBuffers(intBuffer);
/* 293 */     if (errorCheck(checkALError(), "Error generating stream buffers in method 'preLoadBuffers'"))
/*     */     {
/* 295 */       return false;
/*     */     }
/* 297 */     for (byte b = 0; b < paramLinkedList.size(); b++) {
/*     */       
/* 299 */       this.bufferBuffer.clear();
/* 300 */       this.bufferBuffer.put(paramLinkedList.get(b), 0, ((byte[])paramLinkedList.get(b)).length);
/* 301 */       this.bufferBuffer.flip();
/*     */       
/*     */       try {
/* 304 */         AL10.alBufferData(intBuffer.get(b), this.ALformat, this.bufferBuffer, this.sampleRate);
/*     */       
/*     */       }
/* 307 */       catch (Exception exception) {
/*     */         
/* 309 */         errorMessage("Error creating buffers in method 'preLoadBuffers'");
/*     */         
/* 311 */         printStackTrace(exception);
/* 312 */         return false;
/*     */       } 
/* 314 */       if (errorCheck(checkALError(), "Error creating buffers in method 'preLoadBuffers'"))
/*     */       {
/* 316 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*     */     try {
/* 321 */       AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
/*     */     }
/* 323 */     catch (Exception exception) {
/*     */       
/* 325 */       errorMessage("Error queuing buffers in method 'preLoadBuffers'");
/* 326 */       printStackTrace(exception);
/* 327 */       return false;
/*     */     } 
/* 329 */     if (errorCheck(checkALError(), "Error queuing buffers in method 'preLoadBuffers'"))
/*     */     {
/* 331 */       return false;
/*     */     }
/* 333 */     AL10.alSourcePlay(this.ALSource.get(0));
/* 334 */     if (errorCheck(checkALError(), "Error playing source in method 'preLoadBuffers'"))
/*     */     {
/* 336 */       return false;
/*     */     }
/*     */     
/* 339 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean queueBuffer(byte[] paramArrayOfbyte) {
/* 351 */     if (errorCheck((this.channelType != 1), "Buffers may only be queued for streaming sources."))
/*     */     {
/* 353 */       return false;
/*     */     }
/*     */     
/* 356 */     this.bufferBuffer.clear();
/* 357 */     this.bufferBuffer.put(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/* 358 */     this.bufferBuffer.flip();
/*     */     
/* 360 */     IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
/*     */     
/* 362 */     AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
/* 363 */     if (checkALError()) {
/* 364 */       return false;
/*     */     }
/* 366 */     AL10.alBufferData(intBuffer.get(0), this.ALformat, this.bufferBuffer, this.sampleRate);
/* 367 */     if (checkALError()) {
/* 368 */       return false;
/*     */     }
/* 370 */     AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
/* 371 */     if (checkALError()) {
/* 372 */       return false;
/*     */     }
/* 374 */     return true;
/*     */   }
/*     */   public void setAudioFormat(AudioFormat paramAudioFormat) { char c = Character.MIN_VALUE; if (paramAudioFormat.getChannels() == 1) { if (paramAudioFormat.getSampleSizeInBits() == 8) { c = 'ᄀ'; }
/*     */       else if (paramAudioFormat.getSampleSizeInBits() == 16) { c = 'ᄁ'; }
/*     */       else { errorMessage("Illegal sample size in method 'setAudioFormat'"); return; }
/*     */        }
/*     */     else if (paramAudioFormat.getChannels() == 2) { if (paramAudioFormat.getSampleSizeInBits() == 8) { c = 'ᄂ'; }
/*     */       else if (paramAudioFormat.getSampleSizeInBits() == 16) { c = 'ᄃ'; }
/*     */       else { errorMessage("Illegal sample size in method 'setAudioFormat'"); return; }
/*     */        }
/*     */     else
/*     */     { errorMessage("Audio data neither mono nor stereo in method 'setAudioFormat'"); return; }
/* 386 */      this.ALformat = c; this.sampleRate = (int)paramAudioFormat.getSampleRate(); } public void setFormat(int paramInt1, int paramInt2) { this.ALformat = paramInt1; this.sampleRate = paramInt2; } public int feedRawAudioData(byte[] paramArrayOfbyte) { IntBuffer intBuffer; if (errorCheck((this.channelType != 1), "Raw audio data can only be fed to streaming sources."))
/*     */     {
/* 388 */       return -1;
/*     */     }
/* 390 */     ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     int i = AL10.alGetSourcei(this.ALSource.get(0), 4118);
/*     */     
/* 397 */     if (i > 0) {
/*     */       
/* 399 */       intBuffer = BufferUtils.createIntBuffer(i);
/* 400 */       AL10.alGenBuffers(intBuffer);
/* 401 */       if (errorCheck(checkALError(), "Error clearing stream buffers in method 'feedRawAudioData'"))
/*     */       {
/* 403 */         return -1; } 
/* 404 */       AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
/* 405 */       if (errorCheck(checkALError(), "Error unqueuing stream buffers in method 'feedRawAudioData'"))
/*     */       {
/* 407 */         return -1;
/*     */       }
/*     */     } else {
/*     */       
/* 411 */       intBuffer = BufferUtils.createIntBuffer(1);
/* 412 */       AL10.alGenBuffers(intBuffer);
/* 413 */       if (errorCheck(checkALError(), "Error generating stream buffers in method 'preLoadBuffers'"))
/*     */       {
/* 415 */         return -1;
/*     */       }
/*     */     } 
/* 418 */     AL10.alBufferData(intBuffer.get(0), this.ALformat, byteBuffer, this.sampleRate);
/* 419 */     if (checkALError()) {
/* 420 */       return -1;
/*     */     }
/* 422 */     AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
/* 423 */     if (checkALError()) {
/* 424 */       return -1;
/*     */     }
/* 426 */     if (this.attachedSource != null && this.attachedSource.channel == this && this.attachedSource.active())
/*     */     {
/*     */ 
/*     */       
/* 430 */       if (!playing()) {
/*     */         
/* 432 */         AL10.alSourcePlay(this.ALSource.get(0));
/* 433 */         checkALError();
/*     */       } 
/*     */     }
/*     */     
/* 437 */     return i; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int buffersProcessed() {
/* 448 */     if (this.channelType != 1) {
/* 449 */       return 0;
/*     */     }
/*     */     
/* 452 */     int i = AL10.alGetSourcei(this.ALSource.get(0), 4118);
/*     */ 
/*     */ 
/*     */     
/* 456 */     if (checkALError()) {
/* 457 */       return 0;
/*     */     }
/*     */     
/* 460 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void flush() {
/* 471 */     if (this.channelType != 1) {
/*     */       return;
/*     */     }
/*     */     
/* 475 */     int i = AL10.alGetSourcei(this.ALSource.get(0), 4117);
/*     */ 
/*     */     
/* 478 */     if (checkALError()) {
/*     */       return;
/*     */     }
/* 481 */     IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
/* 482 */     while (i > 0) {
/*     */ 
/*     */       
/*     */       try {
/* 486 */         AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
/*     */       }
/* 488 */       catch (Exception exception) {
/*     */         return;
/*     */       } 
/*     */       
/* 492 */       if (checkALError())
/*     */         return; 
/* 494 */       i--;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*     */     try {
/* 506 */       AL10.alSourceStop(this.ALSource.get(0));
/* 507 */       AL10.alGetError();
/*     */     }
/* 509 */     catch (Exception exception) {}
/*     */ 
/*     */     
/* 512 */     if (this.channelType == 1) {
/* 513 */       flush();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void play() {
/* 523 */     AL10.alSourcePlay(this.ALSource.get(0));
/* 524 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void pause() {
/* 533 */     AL10.alSourcePause(this.ALSource.get(0));
/* 534 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() {
/* 544 */     AL10.alSourceStop(this.ALSource.get(0));
/* 545 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void rewind() {
/* 556 */     if (this.channelType == 1) {
/*     */       return;
/*     */     }
/* 559 */     AL10.alSourceRewind(this.ALSource.get(0));
/* 560 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean playing() {
/* 573 */     int i = AL10.alGetSourcei(this.ALSource.get(0), 4112);
/*     */     
/* 575 */     if (checkALError()) {
/* 576 */       return false;
/*     */     }
/* 578 */     return (i == 4114);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean checkALError() {
/* 587 */     switch (AL10.alGetError()) {
/*     */       
/*     */       case 0:
/* 590 */         return false;
/*     */       case 40961:
/* 592 */         errorMessage("Invalid name parameter.");
/* 593 */         return true;
/*     */       case 40962:
/* 595 */         errorMessage("Invalid parameter.");
/* 596 */         return true;
/*     */       case 40963:
/* 598 */         errorMessage("Invalid enumerated parameter value.");
/* 599 */         return true;
/*     */       case 40964:
/* 601 */         errorMessage("Illegal call.");
/* 602 */         return true;
/*     */       case 40965:
/* 604 */         errorMessage("Unable to allocate memory.");
/* 605 */         return true;
/*     */     } 
/* 607 */     errorMessage("An unrecognized error occurred.");
/* 608 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\libraries\ChannelLWJGLOpenAL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */