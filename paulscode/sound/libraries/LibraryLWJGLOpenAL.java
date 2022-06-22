/*     */ package paulscode.sound.libraries;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.LWJGLException;
/*     */ import org.lwjgl.openal.AL;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import paulscode.sound.Channel;
/*     */ import paulscode.sound.FilenameURL;
/*     */ import paulscode.sound.ICodec;
/*     */ import paulscode.sound.Library;
/*     */ import paulscode.sound.ListenerData;
/*     */ import paulscode.sound.SoundBuffer;
/*     */ import paulscode.sound.SoundSystemConfig;
/*     */ import paulscode.sound.SoundSystemException;
/*     */ import paulscode.sound.Source;
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
/*     */ public class LibraryLWJGLOpenAL
/*     */   extends Library
/*     */ {
/*     */   private static final boolean GET = false;
/*     */   private static final boolean SET = true;
/*     */   private static final boolean XXX = false;
/* 121 */   private FloatBuffer listenerPositionAL = null;
/*     */ 
/*     */ 
/*     */   
/* 125 */   private FloatBuffer listenerOrientation = null;
/*     */ 
/*     */ 
/*     */   
/* 129 */   private FloatBuffer listenerVelocity = null;
/*     */ 
/*     */ 
/*     */   
/* 133 */   private HashMap ALBufferMap = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean alPitchSupported = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LibraryLWJGLOpenAL() {
/* 148 */     this.ALBufferMap = new HashMap<Object, Object>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void init() {
/* 157 */     boolean bool = false;
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 162 */       AL.create();
/* 163 */       bool = checkALError();
/*     */     }
/* 165 */     catch (LWJGLException lWJGLException) {
/*     */ 
/*     */       
/* 168 */       errorMessage("Unable to initialize OpenAL.  Probable cause: OpenAL not supported.");
/*     */       
/* 170 */       printStackTrace((Exception)lWJGLException);
/* 171 */       throw new SoundSystemException(lWJGLException.getMessage(), 6);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 176 */     if (bool) {
/* 177 */       importantMessage("OpenAL did not initialize properly!");
/*     */     } else {
/* 179 */       message("OpenAL initialized.");
/*     */     } 
/*     */     
/* 182 */     this.listenerPositionAL = BufferUtils.createFloatBuffer(3).put(new float[] { this.listener.position.x, this.listener.position.y, this.listener.position.z });
/*     */ 
/*     */ 
/*     */     
/* 186 */     this.listenerOrientation = BufferUtils.createFloatBuffer(6).put(new float[] { this.listener.lookAt.x, this.listener.lookAt.y, this.listener.lookAt.z, this.listener.up.x, this.listener.up.y, this.listener.up.z });
/*     */ 
/*     */ 
/*     */     
/* 190 */     this.listenerVelocity = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0F, 0.0F, 0.0F });
/*     */ 
/*     */ 
/*     */     
/* 194 */     this.listenerPositionAL.flip();
/* 195 */     this.listenerOrientation.flip();
/* 196 */     this.listenerVelocity.flip();
/*     */ 
/*     */     
/* 199 */     AL10.alListener(4100, this.listenerPositionAL);
/* 200 */     bool = (checkALError() || bool);
/* 201 */     AL10.alListener(4111, this.listenerOrientation);
/* 202 */     bool = (checkALError() || bool);
/* 203 */     AL10.alListener(4102, this.listenerVelocity);
/* 204 */     bool = (checkALError() || bool);
/*     */ 
/*     */     
/* 207 */     if (bool) {
/*     */       
/* 209 */       importantMessage("OpenAL did not initialize properly!");
/* 210 */       throw new SoundSystemException("Problem encountered while loading OpenAL or creating the listener.  Probably cause:  OpenAL not supported", 6);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     super.init();
/*     */ 
/*     */     
/* 220 */     ChannelLWJGLOpenAL channelLWJGLOpenAL = this.normalChannels.get(1);
/*     */ 
/*     */     
/*     */     try {
/* 224 */       AL10.alSourcef(channelLWJGLOpenAL.ALSource.get(0), 4099, 1.0F);
/*     */       
/* 226 */       if (checkALError()) {
/*     */         
/* 228 */         alPitchSupported(true, false);
/* 229 */         throw new SoundSystemException("OpenAL: AL_PITCH not supported.", 13);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 234 */       alPitchSupported(true, true);
/*     */     
/*     */     }
/* 237 */     catch (Exception exception) {
/*     */       
/* 239 */       alPitchSupported(true, false);
/* 240 */       throw new SoundSystemException("OpenAL: AL_PITCH not supported.", 13);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean libraryCompatible() {
/* 251 */     if (AL.isCreated()) {
/* 252 */       return true;
/*     */     }
/*     */     
/*     */     try {
/* 256 */       AL.create();
/*     */     }
/* 258 */     catch (Exception exception) {
/*     */       
/* 260 */       return false;
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 265 */       AL.destroy();
/*     */     }
/* 267 */     catch (Exception exception) {}
/*     */ 
/*     */     
/* 270 */     return true;
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
/*     */ 
/*     */   
/*     */   protected Channel createChannel(int paramInt) {
/* 285 */     IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
/*     */     
/*     */     try {
/* 288 */       AL10.alGenSources(intBuffer);
/*     */     }
/* 290 */     catch (Exception exception) {
/*     */       
/* 292 */       AL10.alGetError();
/* 293 */       return null;
/*     */     } 
/*     */     
/* 296 */     if (AL10.alGetError() != 0) {
/* 297 */       return null;
/*     */     }
/* 299 */     return new ChannelLWJGLOpenAL(paramInt, intBuffer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanup() {
/* 310 */     super.cleanup();
/*     */     
/* 312 */     Set set = this.bufferMap.keySet();
/* 313 */     Iterator<String> iterator = set.iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 318 */     while (iterator.hasNext()) {
/*     */       
/* 320 */       String str = iterator.next();
/* 321 */       IntBuffer intBuffer = (IntBuffer)this.ALBufferMap.get(str);
/* 322 */       if (intBuffer != null) {
/*     */         
/* 324 */         AL10.alDeleteBuffers(intBuffer);
/* 325 */         checkALError();
/* 326 */         intBuffer.clear();
/*     */       } 
/*     */     } 
/*     */     
/* 330 */     this.bufferMap.clear();
/* 331 */     AL.destroy();
/*     */     
/* 333 */     this.bufferMap = null;
/* 334 */     this.listenerPositionAL = null;
/* 335 */     this.listenerOrientation = null;
/* 336 */     this.listenerVelocity = null;
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
/*     */   public boolean loadSound(FilenameURL paramFilenameURL) {
/* 348 */     if (this.bufferMap == null) {
/*     */       
/* 350 */       this.bufferMap = new HashMap<Object, Object>();
/* 351 */       importantMessage("Buffer Map was null in method 'loadSound'");
/*     */     } 
/*     */     
/* 354 */     if (this.ALBufferMap == null) {
/*     */       
/* 356 */       this.ALBufferMap = new HashMap<Object, Object>();
/* 357 */       importantMessage("Open AL Buffer Map was null in method'loadSound'");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 362 */     if (errorCheck((paramFilenameURL == null), "Filename/URL not specified in method 'loadSound'"))
/*     */     {
/* 364 */       return false;
/*     */     }
/*     */     
/* 367 */     if (this.bufferMap.get(paramFilenameURL.getFilename()) != null) {
/* 368 */       return true;
/*     */     }
/* 370 */     ICodec iCodec = SoundSystemConfig.getCodec(paramFilenameURL.getFilename());
/* 371 */     if (errorCheck((iCodec == null), "No codec found for file '" + paramFilenameURL.getFilename() + "' in method 'loadSound'"))
/*     */     {
/*     */       
/* 374 */       return false;
/*     */     }
/* 376 */     iCodec.initialize(paramFilenameURL.getURL());
/* 377 */     SoundBuffer soundBuffer = iCodec.readAll();
/* 378 */     iCodec.cleanup();
/* 379 */     iCodec = null;
/* 380 */     if (errorCheck((soundBuffer == null), "Sound buffer null in method 'loadSound'"))
/*     */     {
/* 382 */       return false;
/*     */     }
/* 384 */     this.bufferMap.put(paramFilenameURL.getFilename(), soundBuffer);
/*     */     
/* 386 */     AudioFormat audioFormat = soundBuffer.audioFormat;
/* 387 */     char c = Character.MIN_VALUE;
/* 388 */     if (audioFormat.getChannels() == 1) {
/*     */       
/* 390 */       if (audioFormat.getSampleSizeInBits() == 8)
/*     */       {
/* 392 */         c = 'ᄀ';
/*     */       }
/* 394 */       else if (audioFormat.getSampleSizeInBits() == 16)
/*     */       {
/* 396 */         c = 'ᄁ';
/*     */       }
/*     */       else
/*     */       {
/* 400 */         errorMessage("Illegal sample size in method 'loadSound'");
/* 401 */         return false;
/*     */       }
/*     */     
/* 404 */     } else if (audioFormat.getChannels() == 2) {
/*     */       
/* 406 */       if (audioFormat.getSampleSizeInBits() == 8)
/*     */       {
/* 408 */         c = 'ᄂ';
/*     */       }
/* 410 */       else if (audioFormat.getSampleSizeInBits() == 16)
/*     */       {
/* 412 */         c = 'ᄃ';
/*     */       }
/*     */       else
/*     */       {
/* 416 */         errorMessage("Illegal sample size in method 'loadSound'");
/* 417 */         return false;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 422 */       errorMessage("File neither mono nor stereo in method 'loadSound'");
/*     */       
/* 424 */       return false;
/*     */     } 
/*     */     
/* 427 */     IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
/* 428 */     AL10.alGenBuffers(intBuffer);
/* 429 */     if (errorCheck((AL10.alGetError() != 0), "alGenBuffers error when loading " + paramFilenameURL.getFilename()))
/*     */     {
/*     */       
/* 432 */       return false;
/*     */     }
/* 434 */     ByteBuffer byteBuffer = BufferUtils.createByteBuffer(soundBuffer.audioData.length);
/* 435 */     byteBuffer.clear();
/* 436 */     byteBuffer.put(soundBuffer.audioData);
/* 437 */     byteBuffer.flip();
/*     */ 
/*     */     
/* 440 */     AL10.alBufferData(intBuffer.get(0), c, byteBuffer, (int)audioFormat.getSampleRate());
/*     */ 
/*     */     
/* 443 */     if (errorCheck((AL10.alGetError() != 0), "alBufferData error when loading " + paramFilenameURL.getFilename()))
/*     */     {
/*     */ 
/*     */       
/* 447 */       if (errorCheck((intBuffer == null), "Sound buffer was not created for " + paramFilenameURL.getFilename()))
/*     */       {
/*     */         
/* 450 */         return false; } 
/*     */     }
/* 452 */     this.ALBufferMap.put(paramFilenameURL.getFilename(), intBuffer);
/*     */     
/* 454 */     return true;
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
/*     */   public void unloadSound(String paramString) {
/* 467 */     this.ALBufferMap.remove(paramString);
/* 468 */     super.unloadSound(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMasterVolume(float paramFloat) {
/* 478 */     super.setMasterVolume(paramFloat);
/*     */     
/* 480 */     AL10.alListenerf(4106, paramFloat);
/* 481 */     checkALError();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void newSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/* 502 */     IntBuffer intBuffer = null;
/* 503 */     if (!paramBoolean2) {
/*     */ 
/*     */       
/* 506 */       intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
/*     */ 
/*     */       
/* 509 */       if (intBuffer == null)
/*     */       {
/* 511 */         if (!loadSound(paramFilenameURL)) {
/*     */           
/* 513 */           errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 521 */       intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 523 */       if (intBuffer == null) {
/*     */         
/* 525 */         errorMessage("Source '" + paramString + "' was not created " + "because a sound buffer was not found for " + paramFilenameURL.getFilename());
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 531 */     SoundBuffer soundBuffer = null;
/*     */     
/* 533 */     if (!paramBoolean2) {
/*     */ 
/*     */       
/* 536 */       soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 538 */       if (soundBuffer == null)
/*     */       {
/* 540 */         if (!loadSound(paramFilenameURL)) {
/*     */           
/* 542 */           errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */       
/* 549 */       soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 551 */       if (soundBuffer == null) {
/*     */         
/* 553 */         errorMessage("Source '" + paramString + "' was not created " + "because audio data was not found for " + paramFilenameURL.getFilename());
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 560 */     this.sourceMap.put(paramString, new SourceLWJGLOpenAL(this.listenerPositionAL, intBuffer, paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, soundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false));
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
/*     */   public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/* 584 */     this.sourceMap.put(paramString, new SourceLWJGLOpenAL(this.listenerPositionAL, paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
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
/*     */   public void quickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/* 610 */     IntBuffer intBuffer = null;
/* 611 */     if (!paramBoolean2) {
/*     */ 
/*     */       
/* 614 */       intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 616 */       if (intBuffer == null) {
/* 617 */         loadSound(paramFilenameURL);
/*     */       }
/* 619 */       intBuffer = (IntBuffer)this.ALBufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 621 */       if (intBuffer == null) {
/*     */         
/* 623 */         errorMessage("Sound buffer was not created for " + paramFilenameURL.getFilename());
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 629 */     SoundBuffer soundBuffer = null;
/*     */     
/* 631 */     if (!paramBoolean2) {
/*     */ 
/*     */       
/* 634 */       soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 636 */       if (soundBuffer == null)
/*     */       {
/* 638 */         if (!loadSound(paramFilenameURL)) {
/*     */           
/* 640 */           errorMessage("Source '" + paramString + "' was not created " + "because an error occurred while loading " + paramFilenameURL.getFilename());
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */       
/* 647 */       soundBuffer = (SoundBuffer)this.bufferMap.get(paramFilenameURL.getFilename());
/*     */       
/* 649 */       if (soundBuffer == null) {
/*     */         
/* 651 */         errorMessage("Source '" + paramString + "' was not created " + "because audio data was not found for " + paramFilenameURL.getFilename());
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 657 */     SourceLWJGLOpenAL sourceLWJGLOpenAL = new SourceLWJGLOpenAL(this.listenerPositionAL, intBuffer, paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, soundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 665 */     this.sourceMap.put(paramString, sourceLWJGLOpenAL);
/* 666 */     play(sourceLWJGLOpenAL);
/* 667 */     if (paramBoolean4) {
/* 668 */       sourceLWJGLOpenAL.setTemporary(true);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void copySources(HashMap paramHashMap) {
/* 678 */     if (paramHashMap == null)
/*     */       return; 
/* 680 */     Set set = paramHashMap.keySet();
/* 681 */     Iterator<String> iterator = set.iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 686 */     if (this.bufferMap == null) {
/*     */       
/* 688 */       this.bufferMap = new HashMap<Object, Object>();
/* 689 */       importantMessage("Buffer Map was null in method 'copySources'");
/*     */     } 
/*     */     
/* 692 */     if (this.ALBufferMap == null) {
/*     */       
/* 694 */       this.ALBufferMap = new HashMap<Object, Object>();
/* 695 */       importantMessage("Open AL Buffer Map was null in method'copySources'");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 700 */     this.sourceMap.clear();
/*     */ 
/*     */ 
/*     */     
/* 704 */     while (iterator.hasNext()) {
/*     */       
/* 706 */       String str = iterator.next();
/* 707 */       Source source = (Source)paramHashMap.get(str);
/* 708 */       if (source != null) {
/*     */         
/* 710 */         SoundBuffer soundBuffer = null;
/* 711 */         if (!source.toStream) {
/*     */           
/* 713 */           loadSound(source.filenameURL);
/* 714 */           soundBuffer = (SoundBuffer)this.bufferMap.get(source.filenameURL.getFilename());
/*     */         } 
/* 716 */         if (source.toStream || soundBuffer != null) {
/* 717 */           this.sourceMap.put(str, new SourceLWJGLOpenAL(this.listenerPositionAL, (IntBuffer)this.ALBufferMap.get(source.filenameURL.getFilename()), source, soundBuffer));
/*     */         }
/*     */       } 
/*     */     } 
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
/*     */ 
/*     */   
/*     */   public void setListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 735 */     super.setListenerPosition(paramFloat1, paramFloat2, paramFloat3);
/*     */     
/* 737 */     this.listenerPositionAL.put(0, paramFloat1);
/* 738 */     this.listenerPositionAL.put(1, paramFloat2);
/* 739 */     this.listenerPositionAL.put(2, paramFloat3);
/*     */ 
/*     */     
/* 742 */     AL10.alListener(4100, this.listenerPositionAL);
/*     */     
/* 744 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListenerAngle(float paramFloat) {
/* 755 */     super.setListenerAngle(paramFloat);
/*     */     
/* 757 */     this.listenerOrientation.put(0, this.listener.lookAt.x);
/* 758 */     this.listenerOrientation.put(2, this.listener.lookAt.z);
/*     */ 
/*     */     
/* 761 */     AL10.alListener(4111, this.listenerOrientation);
/*     */     
/* 763 */     checkALError();
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 779 */     super.setListenerOrientation(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 780 */     this.listenerOrientation.put(0, paramFloat1);
/* 781 */     this.listenerOrientation.put(1, paramFloat2);
/* 782 */     this.listenerOrientation.put(2, paramFloat3);
/* 783 */     this.listenerOrientation.put(3, paramFloat4);
/* 784 */     this.listenerOrientation.put(4, paramFloat5);
/* 785 */     this.listenerOrientation.put(5, paramFloat6);
/* 786 */     AL10.alListener(4111, this.listenerOrientation);
/* 787 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListenerData(ListenerData paramListenerData) {
/* 798 */     super.setListenerData(paramListenerData);
/*     */     
/* 800 */     this.listenerPositionAL.put(0, paramListenerData.position.x);
/* 801 */     this.listenerPositionAL.put(1, paramListenerData.position.y);
/* 802 */     this.listenerPositionAL.put(2, paramListenerData.position.z);
/* 803 */     AL10.alListener(4100, this.listenerPositionAL);
/*     */     
/* 805 */     this.listenerOrientation.put(0, paramListenerData.lookAt.x);
/* 806 */     this.listenerOrientation.put(1, paramListenerData.lookAt.y);
/* 807 */     this.listenerOrientation.put(2, paramListenerData.lookAt.z);
/* 808 */     this.listenerOrientation.put(3, paramListenerData.up.x);
/* 809 */     this.listenerOrientation.put(4, paramListenerData.up.y);
/* 810 */     this.listenerOrientation.put(5, paramListenerData.up.z);
/* 811 */     AL10.alListener(4111, this.listenerOrientation);
/*     */     
/* 813 */     checkALError();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean checkALError() {
/* 822 */     switch (AL10.alGetError()) {
/*     */       
/*     */       case 0:
/* 825 */         return false;
/*     */       case 40961:
/* 827 */         errorMessage("Invalid name parameter.");
/* 828 */         return true;
/*     */       case 40962:
/* 830 */         errorMessage("Invalid parameter.");
/* 831 */         return true;
/*     */       case 40963:
/* 833 */         errorMessage("Invalid enumerated parameter value.");
/* 834 */         return true;
/*     */       case 40964:
/* 836 */         errorMessage("Illegal call.");
/* 837 */         return true;
/*     */       case 40965:
/* 839 */         errorMessage("Unable to allocate memory.");
/* 840 */         return true;
/*     */     } 
/* 842 */     errorMessage("An unrecognized error occurred.");
/* 843 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean alPitchSupported() {
/* 853 */     return alPitchSupported(false, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static synchronized boolean alPitchSupported(boolean paramBoolean1, boolean paramBoolean2) {
/* 864 */     if (paramBoolean1 == true)
/* 865 */       alPitchSupported = paramBoolean2; 
/* 866 */     return alPitchSupported;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getTitle() {
/* 875 */     return "LWJGL OpenAL";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getDescription() {
/* 884 */     return "The LWJGL binding of OpenAL.  For more information, see http://www.lwjgl.org";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClassName() {
/* 895 */     return "LibraryLWJGLOpenAL";
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\libraries\LibraryLWJGLOpenAL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */