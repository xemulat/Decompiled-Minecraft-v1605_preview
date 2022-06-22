/*      */ package paulscode.sound;
/*      */ 
/*      */ import java.net.URL;
/*      */ import java.util.LinkedList;
/*      */ import java.util.ListIterator;
/*      */ import javax.sound.sampled.AudioFormat;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Source
/*      */ {
/*   54 */   protected Class libraryType = Library.class;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final boolean GET = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final boolean SET = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final boolean XXX = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private SoundSystemLogger logger;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean rawDataStream = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   86 */   public AudioFormat rawDataFormat = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean temporary = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean priority = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean toStream = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean toLoop = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean toPlay = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  119 */   public String sourcename = "";
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  124 */   public FilenameURL filenameURL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Vector3D position;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  134 */   public int attModel = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  139 */   public float distOrRoll = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  146 */   public float gain = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  151 */   public float sourceVolume = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  156 */   protected float pitch = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  161 */   public float distanceFromListener = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  166 */   public Channel channel = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean active = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean stopped = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean paused = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  186 */   protected SoundBuffer soundBuffer = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  191 */   protected ICodec codec = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean reverseByteOrder = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  201 */   protected LinkedList soundSequenceQueue = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  206 */   protected final Object soundSequenceLock = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean preLoad = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  218 */   protected float fadeOutGain = -1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  224 */   protected float fadeInGain = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  229 */   protected long fadeOutMilis = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  234 */   protected long fadeInMilis = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  239 */   protected long lastFadeCheck = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Source(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/*  262 */     this.logger = SoundSystemConfig.getLogger();
/*      */     
/*  264 */     this.priority = paramBoolean1;
/*  265 */     this.toStream = paramBoolean2;
/*  266 */     this.toLoop = paramBoolean3;
/*  267 */     this.sourcename = paramString;
/*  268 */     this.filenameURL = paramFilenameURL;
/*  269 */     this.soundBuffer = paramSoundBuffer;
/*  270 */     this.position = new Vector3D(paramFloat1, paramFloat2, paramFloat3);
/*  271 */     this.attModel = paramInt;
/*  272 */     this.distOrRoll = paramFloat4;
/*  273 */     this.temporary = paramBoolean4;
/*      */     
/*  275 */     if (paramBoolean2 && paramFilenameURL != null) {
/*  276 */       this.codec = SoundSystemConfig.getCodec(paramFilenameURL.getFilename());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Source(Source paramSource, SoundBuffer paramSoundBuffer) {
/*  287 */     this.logger = SoundSystemConfig.getLogger();
/*      */     
/*  289 */     this.priority = paramSource.priority;
/*  290 */     this.toStream = paramSource.toStream;
/*  291 */     this.toLoop = paramSource.toLoop;
/*  292 */     this.sourcename = paramSource.sourcename;
/*  293 */     this.filenameURL = paramSource.filenameURL;
/*  294 */     this.position = paramSource.position.clone();
/*  295 */     this.attModel = paramSource.attModel;
/*  296 */     this.distOrRoll = paramSource.distOrRoll;
/*  297 */     this.temporary = paramSource.temporary;
/*      */     
/*  299 */     this.sourceVolume = paramSource.sourceVolume;
/*      */     
/*  301 */     this.rawDataStream = paramSource.rawDataStream;
/*  302 */     this.rawDataFormat = paramSource.rawDataFormat;
/*      */     
/*  304 */     this.soundBuffer = paramSoundBuffer;
/*      */     
/*  306 */     if (this.toStream && this.filenameURL != null) {
/*  307 */       this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Source(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  326 */     this.logger = SoundSystemConfig.getLogger();
/*      */     
/*  328 */     this.priority = paramBoolean;
/*  329 */     this.toStream = true;
/*  330 */     this.toLoop = false;
/*  331 */     this.sourcename = paramString;
/*  332 */     this.filenameURL = null;
/*  333 */     this.soundBuffer = null;
/*  334 */     this.position = new Vector3D(paramFloat1, paramFloat2, paramFloat3);
/*  335 */     this.attModel = paramInt;
/*  336 */     this.distOrRoll = paramFloat4;
/*  337 */     this.temporary = false;
/*      */     
/*  339 */     this.rawDataStream = true;
/*  340 */     this.rawDataFormat = paramAudioFormat;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cleanup() {
/*  349 */     if (this.codec != null) {
/*  350 */       this.codec.cleanup();
/*      */     }
/*  352 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  354 */       if (this.soundSequenceQueue != null)
/*  355 */         this.soundSequenceQueue.clear(); 
/*  356 */       this.soundSequenceQueue = null;
/*      */     } 
/*      */     
/*  359 */     this.sourcename = null;
/*  360 */     this.filenameURL = null;
/*  361 */     this.position = null;
/*  362 */     this.soundBuffer = null;
/*  363 */     this.codec = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void queueSound(FilenameURL paramFilenameURL) {
/*  374 */     if (!this.toStream) {
/*      */       
/*  376 */       errorMessage("Method 'queueSound' may only be used for streaming and MIDI sources.");
/*      */       
/*      */       return;
/*      */     } 
/*  380 */     if (paramFilenameURL == null) {
/*      */       
/*  382 */       errorMessage("File not specified in method 'queueSound'");
/*      */       
/*      */       return;
/*      */     } 
/*  386 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  388 */       if (this.soundSequenceQueue == null)
/*  389 */         this.soundSequenceQueue = new LinkedList(); 
/*  390 */       this.soundSequenceQueue.add(paramFilenameURL);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dequeueSound(String paramString) {
/*  402 */     if (!this.toStream) {
/*      */       
/*  404 */       errorMessage("Method 'dequeueSound' may only be used for streaming and MIDI sources.");
/*      */       
/*      */       return;
/*      */     } 
/*  408 */     if (paramString == null || paramString.equals("")) {
/*      */       
/*  410 */       errorMessage("Filename not specified in method 'dequeueSound'");
/*      */       
/*      */       return;
/*      */     } 
/*  414 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  416 */       if (this.soundSequenceQueue != null)
/*  417 */         this.soundSequenceQueue.remove(paramString); 
/*      */     } 
/*  419 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  421 */       if (this.soundSequenceQueue != null) {
/*      */         
/*  423 */         ListIterator<FilenameURL> listIterator = this.soundSequenceQueue.listIterator();
/*  424 */         while (listIterator.hasNext()) {
/*      */           
/*  426 */           if (((FilenameURL)listIterator.next()).getFilename().equals(paramString)) {
/*      */             
/*  428 */             listIterator.remove();
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fadeOut(FilenameURL paramFilenameURL, long paramLong) {
/*  449 */     if (!this.toStream) {
/*      */       
/*  451 */       errorMessage("Method 'fadeOut' may only be used for streaming and MIDI sources.");
/*      */       
/*      */       return;
/*      */     } 
/*  455 */     if (paramLong < 0L) {
/*      */       
/*  457 */       errorMessage("Miliseconds may not be negative in method 'fadeOut'.");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  462 */     this.fadeOutMilis = paramLong;
/*  463 */     this.fadeInMilis = 0L;
/*  464 */     this.fadeOutGain = 1.0F;
/*  465 */     this.lastFadeCheck = System.currentTimeMillis();
/*      */     
/*  467 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  469 */       if (this.soundSequenceQueue != null) {
/*  470 */         this.soundSequenceQueue.clear();
/*      */       }
/*  472 */       if (paramFilenameURL != null) {
/*      */         
/*  474 */         if (this.soundSequenceQueue == null)
/*  475 */           this.soundSequenceQueue = new LinkedList(); 
/*  476 */         this.soundSequenceQueue.add(paramFilenameURL);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fadeOutIn(FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
/*  496 */     if (!this.toStream) {
/*      */       
/*  498 */       errorMessage("Method 'fadeOutIn' may only be used for streaming and MIDI sources.");
/*      */       
/*      */       return;
/*      */     } 
/*  502 */     if (paramFilenameURL == null) {
/*      */       
/*  504 */       errorMessage("Filename/URL not specified in method 'fadeOutIn'.");
/*      */       return;
/*      */     } 
/*  507 */     if (paramLong1 < 0L || paramLong2 < 0L) {
/*      */       
/*  509 */       errorMessage("Miliseconds may not be negative in method 'fadeOutIn'.");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  514 */     this.fadeOutMilis = paramLong1;
/*  515 */     this.fadeInMilis = paramLong2;
/*  516 */     this.fadeOutGain = 1.0F;
/*  517 */     this.lastFadeCheck = System.currentTimeMillis();
/*      */     
/*  519 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  521 */       if (this.soundSequenceQueue == null)
/*  522 */         this.soundSequenceQueue = new LinkedList(); 
/*  523 */       this.soundSequenceQueue.clear();
/*  524 */       this.soundSequenceQueue.add(paramFilenameURL);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean checkFadeOut() {
/*  537 */     if (!this.toStream) {
/*  538 */       return false;
/*      */     }
/*  540 */     if (this.fadeOutGain == -1.0F && this.fadeInGain == 1.0F) {
/*  541 */       return false;
/*      */     }
/*  543 */     long l1 = System.currentTimeMillis();
/*  544 */     long l2 = l1 - this.lastFadeCheck;
/*  545 */     this.lastFadeCheck = l1;
/*      */     
/*  547 */     if (this.fadeOutGain >= 0.0F) {
/*      */       
/*  549 */       if (this.fadeOutMilis == 0L) {
/*      */         
/*  551 */         this.fadeOutGain = 0.0F;
/*  552 */         this.fadeInGain = 0.0F;
/*  553 */         if (!incrementSoundSequence())
/*  554 */           stop(); 
/*  555 */         positionChanged();
/*  556 */         this.preLoad = true;
/*  557 */         return false;
/*      */       } 
/*      */ 
/*      */       
/*  561 */       float f = (float)l2 / (float)this.fadeOutMilis;
/*  562 */       this.fadeOutGain -= f;
/*  563 */       if (this.fadeOutGain <= 0.0F) {
/*      */         
/*  565 */         this.fadeOutGain = -1.0F;
/*  566 */         this.fadeInGain = 0.0F;
/*  567 */         if (!incrementSoundSequence())
/*  568 */           stop(); 
/*  569 */         positionChanged();
/*  570 */         this.preLoad = true;
/*  571 */         return false;
/*      */       } 
/*      */       
/*  574 */       positionChanged();
/*  575 */       return true;
/*      */     } 
/*      */     
/*  578 */     if (this.fadeInGain < 1.0F) {
/*      */       
/*  580 */       this.fadeOutGain = -1.0F;
/*  581 */       if (this.fadeInMilis == 0L) {
/*      */         
/*  583 */         this.fadeOutGain = -1.0F;
/*  584 */         this.fadeInGain = 1.0F;
/*      */       }
/*      */       else {
/*      */         
/*  588 */         float f = (float)l2 / (float)this.fadeInMilis;
/*  589 */         this.fadeInGain += f;
/*  590 */         if (this.fadeInGain >= 1.0F) {
/*      */           
/*  592 */           this.fadeOutGain = -1.0F;
/*  593 */           this.fadeInGain = 1.0F;
/*      */         } 
/*      */       } 
/*  596 */       positionChanged();
/*  597 */       return true;
/*      */     } 
/*  599 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean incrementSoundSequence() {
/*  611 */     if (!this.toStream) {
/*      */       
/*  613 */       errorMessage("Method 'incrementSoundSequence' may only be used for streaming and MIDI sources.");
/*      */       
/*  615 */       return false;
/*      */     } 
/*      */     
/*  618 */     synchronized (this.soundSequenceLock) {
/*      */       
/*  620 */       if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
/*      */         
/*  622 */         this.filenameURL = this.soundSequenceQueue.remove(0);
/*  623 */         if (this.codec != null)
/*  624 */           this.codec.cleanup(); 
/*  625 */         this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
/*  626 */         return true;
/*      */       } 
/*      */     } 
/*  629 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTemporary(boolean paramBoolean) {
/*  638 */     this.temporary = paramBoolean;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void listenerMoved() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  655 */     this.position.x = paramFloat1;
/*  656 */     this.position.y = paramFloat2;
/*  657 */     this.position.z = paramFloat3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void positionChanged() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPriority(boolean paramBoolean) {
/*  674 */     this.priority = paramBoolean;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLooping(boolean paramBoolean) {
/*  683 */     this.toLoop = paramBoolean;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttenuation(int paramInt) {
/*  692 */     this.attModel = paramInt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDistOrRoll(float paramFloat) {
/*  702 */     this.distOrRoll = paramFloat;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getDistanceFromListener() {
/*  711 */     return this.distanceFromListener;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPitch(float paramFloat) {
/*  720 */     float f = paramFloat;
/*  721 */     if (f < 0.5F) {
/*  722 */       f = 0.5F;
/*  723 */     } else if (f > 2.0F) {
/*  724 */       f = 2.0F;
/*  725 */     }  this.pitch = f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getPitch() {
/*  734 */     return this.pitch;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean reverseByteOrderRequired() {
/*  744 */     return this.reverseByteOrder;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void changeSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, SoundBuffer paramSoundBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/*  767 */     this.priority = paramBoolean1;
/*  768 */     this.toStream = paramBoolean2;
/*  769 */     this.toLoop = paramBoolean3;
/*  770 */     this.sourcename = paramString;
/*  771 */     this.filenameURL = paramFilenameURL;
/*  772 */     this.soundBuffer = paramSoundBuffer;
/*  773 */     this.position.x = paramFloat1;
/*  774 */     this.position.y = paramFloat2;
/*  775 */     this.position.z = paramFloat3;
/*  776 */     this.attModel = paramInt;
/*  777 */     this.distOrRoll = paramFloat4;
/*  778 */     this.temporary = paramBoolean4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int feedRawAudioData(Channel paramChannel, byte[] paramArrayOfbyte) {
/*  789 */     if (!active(false, false)) {
/*      */       
/*  791 */       this.toPlay = true;
/*  792 */       return -1;
/*      */     } 
/*  794 */     if (this.channel != paramChannel) {
/*      */       
/*  796 */       this.channel = paramChannel;
/*  797 */       this.channel.close();
/*  798 */       this.channel.setAudioFormat(this.rawDataFormat);
/*  799 */       positionChanged();
/*      */     } 
/*      */ 
/*      */     
/*  803 */     stopped(true, false);
/*  804 */     paused(true, false);
/*      */     
/*  806 */     return this.channel.feedRawAudioData(paramArrayOfbyte);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void play(Channel paramChannel) {
/*  815 */     if (!active(false, false)) {
/*      */       
/*  817 */       if (this.toLoop)
/*  818 */         this.toPlay = true; 
/*      */       return;
/*      */     } 
/*  821 */     if (this.channel != paramChannel) {
/*      */       
/*  823 */       this.channel = paramChannel;
/*  824 */       this.channel.close();
/*      */     } 
/*      */     
/*  827 */     stopped(true, false);
/*  828 */     paused(true, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean stream() {
/*  838 */     if (this.channel == null) {
/*  839 */       return false;
/*      */     }
/*  841 */     if (this.preLoad)
/*      */     {
/*  843 */       if (this.rawDataStream) {
/*  844 */         this.preLoad = false;
/*      */       } else {
/*  846 */         return preLoad();
/*      */       } 
/*      */     }
/*  849 */     if (this.rawDataStream) {
/*      */       
/*  851 */       if (stopped() || paused())
/*  852 */         return true; 
/*  853 */       if (this.channel.buffersProcessed() > 0) {
/*  854 */         this.channel.processBuffer();
/*      */       }
/*      */     } else {
/*      */       
/*  858 */       if (this.codec == null)
/*  859 */         return false; 
/*  860 */       if (stopped()) {
/*  861 */         return false;
/*      */       }
/*  863 */       if (paused()) {
/*  864 */         return true;
/*      */       }
/*  866 */       int i = this.channel.buffersProcessed();
/*      */       
/*  868 */       SoundBuffer soundBuffer = null;
/*  869 */       for (byte b = 0; b < i; b++) {
/*      */         
/*  871 */         soundBuffer = this.codec.read();
/*  872 */         if (soundBuffer != null) {
/*      */           
/*  874 */           if (soundBuffer.audioData != null)
/*      */           {
/*  876 */             this.channel.queueBuffer(soundBuffer.audioData);
/*      */           }
/*  878 */           soundBuffer.cleanup();
/*  879 */           soundBuffer = null;
/*      */         } 
/*  881 */         if (this.codec.endOfStream())
/*  882 */           return false; 
/*      */       } 
/*      */     } 
/*  885 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean preLoad() {
/*  894 */     if (this.channel == null) {
/*  895 */       return false;
/*      */     }
/*  897 */     if (this.codec == null) {
/*  898 */       return false;
/*      */     }
/*  900 */     URL uRL = this.filenameURL.getURL();
/*      */     
/*  902 */     this.codec.initialize(uRL);
/*  903 */     SoundBuffer soundBuffer = null;
/*  904 */     for (byte b = 0; b < SoundSystemConfig.getNumberStreamingBuffers(); b++) {
/*      */       
/*  906 */       soundBuffer = this.codec.read();
/*  907 */       if (soundBuffer != null) {
/*      */         
/*  909 */         if (this.soundBuffer.audioData != null)
/*  910 */           this.channel.queueBuffer(this.soundBuffer.audioData); 
/*  911 */         soundBuffer.cleanup();
/*  912 */         soundBuffer = null;
/*      */       } 
/*      */     } 
/*      */     
/*  916 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void pause() {
/*  924 */     this.toPlay = false;
/*  925 */     paused(true, true);
/*  926 */     if (this.channel != null) {
/*  927 */       this.channel.pause();
/*      */     } else {
/*  929 */       errorMessage("Channel null in method 'pause'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void stop() {
/*  937 */     this.toPlay = false;
/*  938 */     stopped(true, true);
/*  939 */     paused(true, false);
/*  940 */     if (this.channel != null) {
/*  941 */       this.channel.stop();
/*      */     } else {
/*  943 */       errorMessage("Channel null in method 'stop'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rewind() {
/*  951 */     if (paused(false, false))
/*      */     {
/*  953 */       stop();
/*      */     }
/*  955 */     if (this.channel != null) {
/*      */       
/*  957 */       boolean bool = playing();
/*  958 */       this.channel.rewind();
/*  959 */       if (this.toStream && bool) {
/*      */         
/*  961 */         stop();
/*  962 */         play(this.channel);
/*      */       } 
/*      */     } else {
/*      */       
/*  966 */       errorMessage("Channel null in method 'rewind'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void flush() {
/*  974 */     if (this.channel != null) {
/*  975 */       this.channel.flush();
/*      */     } else {
/*  977 */       errorMessage("Channel null in method 'flush'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cull() {
/*  986 */     if (!active(false, false))
/*      */       return; 
/*  988 */     if (playing() && this.toLoop)
/*  989 */       this.toPlay = true; 
/*  990 */     if (this.rawDataStream)
/*  991 */       this.toPlay = true; 
/*  992 */     active(true, false);
/*  993 */     if (this.channel != null)
/*  994 */       this.channel.close(); 
/*  995 */     this.channel = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void activate() {
/* 1003 */     active(true, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean active() {
/* 1012 */     return active(false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean playing() {
/* 1021 */     if (this.channel == null || this.channel.attachedSource != this)
/* 1022 */       return false; 
/* 1023 */     if (paused() || stopped()) {
/* 1024 */       return false;
/*      */     }
/* 1026 */     return this.channel.playing();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean stopped() {
/* 1035 */     return stopped(false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean paused() {
/* 1044 */     return paused(false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private synchronized boolean active(boolean paramBoolean1, boolean paramBoolean2) {
/* 1053 */     if (paramBoolean1 == true)
/* 1054 */       this.active = paramBoolean2; 
/* 1055 */     return this.active;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private synchronized boolean stopped(boolean paramBoolean1, boolean paramBoolean2) {
/* 1064 */     if (paramBoolean1 == true)
/* 1065 */       this.stopped = paramBoolean2; 
/* 1066 */     return this.stopped;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private synchronized boolean paused(boolean paramBoolean1, boolean paramBoolean2) {
/* 1075 */     if (paramBoolean1 == true)
/* 1076 */       this.paused = paramBoolean2; 
/* 1077 */     return this.paused;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getClassName() {
/* 1086 */     String str = SoundSystemConfig.getLibraryTitle(this.libraryType);
/*      */     
/* 1088 */     if (str.equals("No Sound")) {
/* 1089 */       return "Source";
/*      */     }
/* 1091 */     return "Source" + str;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void message(String paramString) {
/* 1099 */     this.logger.message(paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void importantMessage(String paramString) {
/* 1108 */     this.logger.importantMessage(paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean errorCheck(boolean paramBoolean, String paramString) {
/* 1119 */     return this.logger.errorCheck(paramBoolean, getClassName(), paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void errorMessage(String paramString) {
/* 1128 */     this.logger.errorMessage(getClassName(), paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void printStackTrace(Exception paramException) {
/* 1137 */     this.logger.printStackTrace(paramException, 1);
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\Source.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */