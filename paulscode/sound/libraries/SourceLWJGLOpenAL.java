/*     */ package paulscode.sound.libraries;
/*     */ 
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.LinkedList;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import paulscode.sound.Channel;
/*     */ import paulscode.sound.FilenameURL;
/*     */ import paulscode.sound.SoundBuffer;
/*     */ import paulscode.sound.SoundSystemConfig;
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
/*     */ public class SourceLWJGLOpenAL
/*     */   extends Source
/*     */ {
/*  97 */   private ChannelLWJGLOpenAL channelOpenAL = (ChannelLWJGLOpenAL)this.channel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private IntBuffer myBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FloatBuffer listenerPosition;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FloatBuffer sourcePosition;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FloatBuffer sourceVelocity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SourceLWJGLOpenAL(FloatBuffer paramFloatBuffer, IntBuffer paramIntBuffer, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/* 144 */     super(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramSoundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4);
/*     */     
/* 146 */     this.reverseByteOrder = true;
/* 147 */     if (this.codec != null)
/* 148 */       this.codec.reverseByteOrder(true); 
/* 149 */     this.listenerPosition = paramFloatBuffer;
/* 150 */     this.myBuffer = paramIntBuffer;
/* 151 */     this.libraryType = LibraryLWJGLOpenAL.class;
/* 152 */     this.pitch = 1.0F;
/* 153 */     resetALInformation();
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
/*     */   public SourceLWJGLOpenAL(FloatBuffer paramFloatBuffer, IntBuffer paramIntBuffer, Source paramSource, SoundBuffer paramSoundBuffer) {
/* 166 */     super(paramSource, paramSoundBuffer);
/* 167 */     this.reverseByteOrder = true;
/* 168 */     if (this.codec != null)
/* 169 */       this.codec.reverseByteOrder(true); 
/* 170 */     this.listenerPosition = paramFloatBuffer;
/* 171 */     this.myBuffer = paramIntBuffer;
/* 172 */     this.libraryType = LibraryLWJGLOpenAL.class;
/* 173 */     this.pitch = 1.0F;
/* 174 */     resetALInformation();
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
/*     */   public SourceLWJGLOpenAL(FloatBuffer paramFloatBuffer, AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/* 195 */     super(paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4);
/*     */     
/* 197 */     this.reverseByteOrder = true;
/* 198 */     this.listenerPosition = paramFloatBuffer;
/* 199 */     this.libraryType = LibraryLWJGLOpenAL.class;
/* 200 */     this.pitch = 1.0F;
/* 201 */     resetALInformation();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanup() {
/* 211 */     super.cleanup();
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
/*     */ 
/*     */   
/*     */   public void changeSource(FloatBuffer paramFloatBuffer, IntBuffer paramIntBuffer, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/* 239 */     changeSource(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramSoundBuffer, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4);
/*     */ 
/*     */     
/* 242 */     this.reverseByteOrder = true;
/* 243 */     this.listenerPosition = paramFloatBuffer;
/* 244 */     this.myBuffer = paramIntBuffer;
/* 245 */     this.pitch = 1.0F;
/* 246 */     resetALInformation();
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
/*     */   public boolean incrementSoundSequence() {
/* 259 */     if (!this.toStream) {
/*     */       
/* 261 */       errorMessage("Method 'incrementSoundSequence' may only be used for streaming sources.");
/*     */       
/* 263 */       return false;
/*     */     } 
/* 265 */     synchronized (this.soundSequenceLock) {
/*     */       
/* 267 */       if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
/*     */         
/* 269 */         this.filenameURL = this.soundSequenceQueue.remove(0);
/* 270 */         if (this.codec != null)
/* 271 */           this.codec.cleanup(); 
/* 272 */         this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
/* 273 */         if (this.codec != null) {
/*     */           
/* 275 */           this.codec.reverseByteOrder(true);
/* 276 */           if (this.codec.getAudioFormat() == null) {
/* 277 */             this.codec.initialize(this.filenameURL.getURL());
/*     */           }
/* 279 */           AudioFormat audioFormat = this.codec.getAudioFormat();
/*     */           
/* 281 */           if (audioFormat == null) {
/*     */             
/* 283 */             errorMessage("Audio Format null in method 'incrementSoundSequence'");
/*     */             
/* 285 */             return false;
/*     */           } 
/*     */           
/* 288 */           char c = Character.MIN_VALUE;
/* 289 */           if (audioFormat.getChannels() == 1) {
/*     */             
/* 291 */             if (audioFormat.getSampleSizeInBits() == 8)
/*     */             {
/* 293 */               c = 'ᄀ';
/*     */             }
/* 295 */             else if (audioFormat.getSampleSizeInBits() == 16)
/*     */             {
/* 297 */               c = 'ᄁ';
/*     */             }
/*     */             else
/*     */             {
/* 301 */               errorMessage("Illegal sample size in method 'incrementSoundSequence'");
/*     */               
/* 303 */               return false;
/*     */             }
/*     */           
/* 306 */           } else if (audioFormat.getChannels() == 2) {
/*     */             
/* 308 */             if (audioFormat.getSampleSizeInBits() == 8)
/*     */             {
/* 310 */               c = 'ᄂ';
/*     */             }
/* 312 */             else if (audioFormat.getSampleSizeInBits() == 16)
/*     */             {
/* 314 */               c = 'ᄃ';
/*     */             }
/*     */             else
/*     */             {
/* 318 */               errorMessage("Illegal sample size in method 'incrementSoundSequence'");
/*     */               
/* 320 */               return false;
/*     */             }
/*     */           
/*     */           } else {
/*     */             
/* 325 */             errorMessage("Audio data neither mono nor stereo in method 'incrementSoundSequence'");
/*     */             
/* 327 */             return false;
/*     */           } 
/*     */ 
/*     */           
/* 331 */           this.channelOpenAL.setFormat(c, (int)audioFormat.getSampleRate());
/*     */           
/* 333 */           this.preLoad = true;
/*     */         } 
/* 335 */         return true;
/*     */       } 
/*     */     } 
/* 338 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void listenerMoved() {
/* 347 */     positionChanged();
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
/*     */   public void setPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 359 */     super.setPosition(paramFloat1, paramFloat2, paramFloat3);
/*     */ 
/*     */     
/* 362 */     if (this.sourcePosition == null) {
/* 363 */       resetALInformation();
/*     */     } else {
/* 365 */       positionChanged();
/*     */     } 
/*     */     
/* 368 */     this.sourcePosition.put(0, paramFloat1);
/* 369 */     this.sourcePosition.put(1, paramFloat2);
/* 370 */     this.sourcePosition.put(2, paramFloat3);
/*     */ 
/*     */     
/* 373 */     if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */ 
/*     */ 
/*     */       
/* 377 */       AL10.alSource(this.channelOpenAL.ALSource.get(0), 4100, this.sourcePosition);
/*     */       
/* 379 */       checkALError();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void positionChanged() {
/* 389 */     calculateDistance();
/* 390 */     calculateGain();
/*     */     
/* 392 */     if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */ 
/*     */       
/* 395 */       AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4106, this.gain * this.sourceVolume * Math.abs(this.fadeOutGain) * this.fadeInGain);
/*     */ 
/*     */ 
/*     */       
/* 399 */       checkALError();
/*     */     } 
/* 401 */     checkPitch();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void checkPitch() {
/* 409 */     if (this.channel != null && this.channel.attachedSource == this && LibraryLWJGLOpenAL.alPitchSupported() && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */ 
/*     */ 
/*     */       
/* 413 */       AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4099, this.pitch);
/*     */       
/* 415 */       checkALError();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLooping(boolean paramBoolean) {
/* 426 */     super.setLooping(paramBoolean);
/*     */ 
/*     */     
/* 429 */     if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */ 
/*     */       
/* 432 */       if (paramBoolean) {
/* 433 */         AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 1);
/*     */       } else {
/*     */         
/* 436 */         AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 0);
/*     */       } 
/* 438 */       checkALError();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttenuation(int paramInt) {
/* 449 */     super.setAttenuation(paramInt);
/*     */     
/* 451 */     if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */ 
/*     */ 
/*     */       
/* 455 */       if (paramInt == 1) {
/* 456 */         AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, this.distOrRoll);
/*     */       } else {
/*     */         
/* 459 */         AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, 0.0F);
/*     */       } 
/* 461 */       checkALError();
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
/*     */   public void setDistOrRoll(float paramFloat) {
/* 473 */     super.setDistOrRoll(paramFloat);
/*     */     
/* 475 */     if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */ 
/*     */ 
/*     */       
/* 479 */       if (this.attModel == 1) {
/* 480 */         AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, paramFloat);
/*     */       } else {
/*     */         
/* 483 */         AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, 0.0F);
/*     */       } 
/* 485 */       checkALError();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPitch(float paramFloat) {
/* 496 */     super.setPitch(paramFloat);
/* 497 */     checkPitch();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void play(Channel paramChannel) {
/* 507 */     if (!active()) {
/*     */       
/* 509 */       if (this.toLoop) {
/* 510 */         this.toPlay = true;
/*     */       }
/*     */       return;
/*     */     } 
/* 514 */     if (paramChannel == null) {
/*     */       
/* 516 */       errorMessage("Unable to play source, because channel was null");
/*     */       
/*     */       return;
/*     */     } 
/* 520 */     boolean bool = (this.channel != paramChannel) ? true : false;
/* 521 */     if (this.channel != null && this.channel.attachedSource != this) {
/* 522 */       bool = true;
/*     */     }
/* 524 */     boolean bool1 = paused();
/*     */     
/* 526 */     super.play(paramChannel);
/*     */     
/* 528 */     this.channelOpenAL = (ChannelLWJGLOpenAL)this.channel;
/*     */ 
/*     */ 
/*     */     
/* 532 */     if (bool) {
/*     */       
/* 534 */       setPosition(this.position.x, this.position.y, this.position.z);
/* 535 */       checkPitch();
/*     */ 
/*     */       
/* 538 */       if (this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
/*     */         
/* 540 */         if (LibraryLWJGLOpenAL.alPitchSupported()) {
/*     */           
/* 542 */           AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4099, this.pitch);
/*     */           
/* 544 */           checkALError();
/*     */         } 
/* 546 */         AL10.alSource(this.channelOpenAL.ALSource.get(0), 4100, this.sourcePosition);
/*     */         
/* 548 */         checkALError();
/* 549 */         AL10.alSource(this.channelOpenAL.ALSource.get(0), 4102, this.sourceVelocity);
/*     */         
/* 551 */         checkALError();
/* 552 */         if (this.attModel == 1) {
/* 553 */           AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, this.distOrRoll);
/*     */         } else {
/*     */           
/* 556 */           AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, 0.0F);
/*     */         } 
/* 558 */         checkALError();
/* 559 */         if (this.toLoop && !this.toStream) {
/* 560 */           AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 1);
/*     */         } else {
/*     */           
/* 563 */           AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 0);
/*     */         } 
/* 565 */         checkALError();
/*     */       } 
/* 567 */       if (!this.toStream) {
/*     */ 
/*     */ 
/*     */         
/* 571 */         if (this.myBuffer == null) {
/*     */           
/* 573 */           errorMessage("No sound buffer to play");
/*     */           
/*     */           return;
/*     */         } 
/* 577 */         this.channelOpenAL.attachBuffer(this.myBuffer);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 582 */     if (!playing()) {
/*     */       
/* 584 */       if (this.toStream && !bool1) {
/*     */         
/* 586 */         if (this.codec == null) {
/*     */           
/* 588 */           errorMessage("Decoder null in method 'play'");
/*     */           return;
/*     */         } 
/* 591 */         if (this.codec.getAudioFormat() == null) {
/* 592 */           this.codec.initialize(this.filenameURL.getURL());
/*     */         }
/* 594 */         AudioFormat audioFormat = this.codec.getAudioFormat();
/*     */         
/* 596 */         if (audioFormat == null) {
/*     */           
/* 598 */           errorMessage("Audio Format null in method 'play'");
/*     */           
/*     */           return;
/*     */         } 
/* 602 */         char c = Character.MIN_VALUE;
/* 603 */         if (audioFormat.getChannels() == 1) {
/*     */           
/* 605 */           if (audioFormat.getSampleSizeInBits() == 8) {
/*     */             
/* 607 */             c = 'ᄀ';
/*     */           }
/* 609 */           else if (audioFormat.getSampleSizeInBits() == 16) {
/*     */             
/* 611 */             c = 'ᄁ';
/*     */           }
/*     */           else {
/*     */             
/* 615 */             errorMessage("Illegal sample size in method 'play'");
/*     */             
/*     */             return;
/*     */           } 
/* 619 */         } else if (audioFormat.getChannels() == 2) {
/*     */           
/* 621 */           if (audioFormat.getSampleSizeInBits() == 8) {
/*     */             
/* 623 */             c = 'ᄂ';
/*     */           }
/* 625 */           else if (audioFormat.getSampleSizeInBits() == 16) {
/*     */             
/* 627 */             c = 'ᄃ';
/*     */           }
/*     */           else {
/*     */             
/* 631 */             errorMessage("Illegal sample size in method 'play'");
/*     */ 
/*     */             
/*     */             return;
/*     */           } 
/*     */         } else {
/* 637 */           errorMessage("Audio data neither mono nor stereo in method 'play'");
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 643 */         this.channelOpenAL.setFormat(c, (int)audioFormat.getSampleRate());
/*     */         
/* 645 */         this.preLoad = true;
/*     */       } 
/* 647 */       this.channel.play();
/* 648 */       if (this.pitch != 1.0F) {
/* 649 */         checkPitch();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean preLoad() {
/* 660 */     if (this.codec == null) {
/* 661 */       return false;
/*     */     }
/* 663 */     this.codec.initialize(this.filenameURL.getURL());
/* 664 */     LinkedList<byte[]> linkedList = new LinkedList();
/* 665 */     for (byte b = 0; b < SoundSystemConfig.getNumberStreamingBuffers(); b++) {
/*     */       
/* 667 */       this.soundBuffer = this.codec.read();
/*     */       
/* 669 */       if (this.soundBuffer == null || this.soundBuffer.audioData == null) {
/*     */         break;
/*     */       }
/* 672 */       linkedList.add(this.soundBuffer.audioData);
/*     */     } 
/* 674 */     positionChanged();
/*     */     
/* 676 */     this.channel.preLoadBuffers(linkedList);
/*     */     
/* 678 */     this.preLoad = false;
/* 679 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void resetALInformation() {
/* 688 */     this.sourcePosition = BufferUtils.createFloatBuffer(3).put(new float[] { this.position.x, this.position.y, this.position.z });
/*     */     
/* 690 */     this.sourceVelocity = BufferUtils.createFloatBuffer(3).put(new float[] { 0.0F, 0.0F, 0.0F });
/*     */ 
/*     */ 
/*     */     
/* 694 */     this.sourcePosition.flip();
/* 695 */     this.sourceVelocity.flip();
/*     */     
/* 697 */     positionChanged();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void calculateDistance() {
/* 705 */     if (this.listenerPosition != null) {
/*     */ 
/*     */       
/* 708 */       double d1 = (this.position.x - this.listenerPosition.get(0));
/* 709 */       double d2 = (this.position.y - this.listenerPosition.get(1));
/* 710 */       double d3 = (this.position.z - this.listenerPosition.get(2));
/* 711 */       this.distanceFromListener = (float)Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void calculateGain() {
/* 722 */     if (this.attModel == 2) {
/*     */       
/* 724 */       if (this.distanceFromListener <= 0.0F) {
/*     */         
/* 726 */         this.gain = 1.0F;
/*     */       }
/* 728 */       else if (this.distanceFromListener >= this.distOrRoll) {
/*     */         
/* 730 */         this.gain = 0.0F;
/*     */       }
/*     */       else {
/*     */         
/* 734 */         this.gain = 1.0F - this.distanceFromListener / this.distOrRoll;
/*     */       } 
/* 736 */       if (this.gain > 1.0F)
/* 737 */         this.gain = 1.0F; 
/* 738 */       if (this.gain < 0.0F) {
/* 739 */         this.gain = 0.0F;
/*     */       }
/*     */     } else {
/*     */       
/* 743 */       this.gain = 1.0F;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean checkALError() {
/* 753 */     switch (AL10.alGetError()) {
/*     */       
/*     */       case 0:
/* 756 */         return false;
/*     */       case 40961:
/* 758 */         errorMessage("Invalid name parameter.");
/* 759 */         return true;
/*     */       case 40962:
/* 761 */         errorMessage("Invalid parameter.");
/* 762 */         return true;
/*     */       case 40963:
/* 764 */         errorMessage("Invalid enumerated parameter value.");
/* 765 */         return true;
/*     */       case 40964:
/* 767 */         errorMessage("Illegal call.");
/* 768 */         return true;
/*     */       case 40965:
/* 770 */         errorMessage("Unable to allocate memory.");
/* 771 */         return true;
/*     */     } 
/* 773 */     errorMessage("An unrecognized error occurred.");
/* 774 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\libraries\SourceLWJGLOpenAL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */