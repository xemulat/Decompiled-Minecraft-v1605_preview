/*      */ package paulscode.sound;
/*      */ 
/*      */ import java.io.IOException;
/*      */ import java.net.URL;
/*      */ import java.util.LinkedList;
/*      */ import java.util.ListIterator;
/*      */ import javax.sound.midi.InvalidMidiDataException;
/*      */ import javax.sound.midi.MetaEventListener;
/*      */ import javax.sound.midi.MetaMessage;
/*      */ import javax.sound.midi.MidiDevice;
/*      */ import javax.sound.midi.MidiSystem;
/*      */ import javax.sound.midi.MidiUnavailableException;
/*      */ import javax.sound.midi.Receiver;
/*      */ import javax.sound.midi.Sequence;
/*      */ import javax.sound.midi.Sequencer;
/*      */ import javax.sound.midi.ShortMessage;
/*      */ import javax.sound.midi.Synthesizer;
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
/*      */ public class MidiChannel
/*      */   implements MetaEventListener
/*      */ {
/*      */   private SoundSystemLogger logger;
/*      */   private FilenameURL filenameURL;
/*      */   private String sourcename;
/*      */   private static final int CHANGE_VOLUME = 7;
/*      */   private static final int END_OF_TRACK = 47;
/*      */   private static final boolean GET = false;
/*      */   private static final boolean SET = true;
/*      */   private static final boolean XXX = false;
/*  105 */   private Sequencer sequencer = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  110 */   private Synthesizer synthesizer = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  115 */   private MidiDevice synthDevice = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  120 */   private Sequence sequence = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean toLoop = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  130 */   private float gain = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean loading = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  140 */   private LinkedList sequenceQueue = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  145 */   private final Object sequenceQueueLock = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  151 */   protected float fadeOutGain = -1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  157 */   protected float fadeInGain = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  162 */   protected long fadeOutMilis = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  167 */   protected long fadeInMilis = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  172 */   protected long lastFadeCheck = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  177 */   private MidiChannel$FadeThread fadeThread = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MidiChannel(boolean paramBoolean, String paramString1, String paramString2) {
/*  188 */     loading(true, true);
/*      */ 
/*      */     
/*  191 */     this.logger = SoundSystemConfig.getLogger();
/*      */ 
/*      */     
/*  194 */     filenameURL(true, new FilenameURL(paramString2));
/*  195 */     sourcename(true, paramString1);
/*  196 */     setLooping(paramBoolean);
/*      */ 
/*      */     
/*  199 */     init();
/*      */ 
/*      */     
/*  202 */     loading(true, false);
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
/*      */   public MidiChannel(boolean paramBoolean, String paramString1, URL paramURL, String paramString2) {
/*  218 */     loading(true, true);
/*      */ 
/*      */     
/*  221 */     this.logger = SoundSystemConfig.getLogger();
/*      */ 
/*      */     
/*  224 */     filenameURL(true, new FilenameURL(paramURL, paramString2));
/*  225 */     sourcename(true, paramString1);
/*  226 */     setLooping(paramBoolean);
/*      */ 
/*      */     
/*  229 */     init();
/*      */ 
/*      */     
/*  232 */     loading(true, false);
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
/*      */   public MidiChannel(boolean paramBoolean, String paramString, FilenameURL paramFilenameURL) {
/*  245 */     loading(true, true);
/*      */ 
/*      */     
/*  248 */     this.logger = SoundSystemConfig.getLogger();
/*      */ 
/*      */     
/*  251 */     filenameURL(true, paramFilenameURL);
/*  252 */     sourcename(true, paramString);
/*  253 */     setLooping(paramBoolean);
/*      */ 
/*      */     
/*  256 */     init();
/*      */ 
/*      */     
/*  259 */     loading(true, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void init() {
/*  268 */     getSequencer();
/*      */ 
/*      */     
/*  271 */     setSequence(filenameURL(false, null).getURL());
/*      */ 
/*      */     
/*  274 */     getSynthesizer();
/*      */ 
/*      */ 
/*      */     
/*  278 */     resetGain();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cleanup() {
/*  286 */     loading(true, true);
/*  287 */     setLooping(true);
/*      */     
/*  289 */     if (this.sequencer != null) {
/*      */       
/*      */       try {
/*      */         
/*  293 */         this.sequencer.stop();
/*  294 */         this.sequencer.close();
/*  295 */         this.sequencer.removeMetaEventListener(this);
/*      */       }
/*  297 */       catch (Exception exception) {}
/*      */     }
/*      */ 
/*      */     
/*  301 */     this.logger = null;
/*  302 */     this.sequencer = null;
/*  303 */     this.synthesizer = null;
/*  304 */     this.sequence = null;
/*      */     
/*  306 */     synchronized (this.sequenceQueueLock) {
/*      */       
/*  308 */       if (this.sequenceQueue != null)
/*  309 */         this.sequenceQueue.clear(); 
/*  310 */       this.sequenceQueue = null;
/*      */     } 
/*      */ 
/*      */     
/*  314 */     if (this.fadeThread != null) {
/*      */       
/*  316 */       boolean bool = false;
/*      */       
/*      */       try {
/*  319 */         this.fadeThread.kill();
/*  320 */         this.fadeThread.interrupt();
/*      */       }
/*  322 */       catch (Exception exception) {
/*      */         
/*  324 */         bool = true;
/*      */       } 
/*      */       
/*  327 */       if (!bool)
/*      */       {
/*      */         
/*  330 */         for (byte b = 0; b < 50; b++) {
/*      */           
/*  332 */           if (!this.fadeThread.alive())
/*      */             break;  
/*  334 */           try { Thread.sleep(100L); } catch (InterruptedException interruptedException) {}
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/*  339 */       if (bool || this.fadeThread.alive()) {
/*      */         
/*  341 */         errorMessage("MIDI fade effects thread did not die!");
/*  342 */         message("Ignoring errors... continuing clean-up.");
/*      */       } 
/*      */     } 
/*      */     
/*  346 */     this.fadeThread = null;
/*      */     
/*  348 */     loading(true, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void queueSound(FilenameURL paramFilenameURL) {
/*  357 */     if (paramFilenameURL == null) {
/*      */       
/*  359 */       errorMessage("Filename/URL not specified in method 'queueSound'");
/*      */       
/*      */       return;
/*      */     } 
/*  363 */     synchronized (this.sequenceQueueLock) {
/*      */       
/*  365 */       if (this.sequenceQueue == null)
/*  366 */         this.sequenceQueue = new LinkedList(); 
/*  367 */       this.sequenceQueue.add(paramFilenameURL);
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
/*  379 */     if (paramString == null || paramString.equals("")) {
/*      */       
/*  381 */       errorMessage("Filename not specified in method 'dequeueSound'");
/*      */       
/*      */       return;
/*      */     } 
/*  385 */     synchronized (this.sequenceQueueLock) {
/*      */       
/*  387 */       if (this.sequenceQueue != null) {
/*      */         
/*  389 */         ListIterator<FilenameURL> listIterator = this.sequenceQueue.listIterator();
/*  390 */         while (listIterator.hasNext()) {
/*      */           
/*  392 */           if (((FilenameURL)listIterator.next()).getFilename().equals(paramString)) {
/*      */             
/*  394 */             listIterator.remove();
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
/*  415 */     if (paramLong < 0L) {
/*      */       
/*  417 */       errorMessage("Miliseconds may not be negative in method 'fadeOut'.");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  422 */     this.fadeOutMilis = paramLong;
/*  423 */     this.fadeInMilis = 0L;
/*  424 */     this.fadeOutGain = 1.0F;
/*  425 */     this.lastFadeCheck = System.currentTimeMillis();
/*      */     
/*  427 */     synchronized (this.sequenceQueueLock) {
/*      */       
/*  429 */       if (this.sequenceQueue != null) {
/*  430 */         this.sequenceQueue.clear();
/*      */       }
/*  432 */       if (paramFilenameURL != null) {
/*      */         
/*  434 */         if (this.sequenceQueue == null)
/*  435 */           this.sequenceQueue = new LinkedList(); 
/*  436 */         this.sequenceQueue.add(paramFilenameURL);
/*      */       } 
/*      */     } 
/*  439 */     if (this.fadeThread == null) {
/*      */       
/*  441 */       this.fadeThread = new MidiChannel$FadeThread(this, null);
/*  442 */       this.fadeThread.start();
/*      */     } 
/*  444 */     this.fadeThread.interrupt();
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
/*  462 */     if (paramFilenameURL == null) {
/*      */       
/*  464 */       errorMessage("Filename/URL not specified in method 'fadeOutIn'.");
/*      */       return;
/*      */     } 
/*  467 */     if (paramLong1 < 0L || paramLong2 < 0L) {
/*      */       
/*  469 */       errorMessage("Miliseconds may not be negative in method 'fadeOutIn'.");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  474 */     this.fadeOutMilis = paramLong1;
/*  475 */     this.fadeInMilis = paramLong2;
/*  476 */     this.fadeOutGain = 1.0F;
/*  477 */     this.lastFadeCheck = System.currentTimeMillis();
/*      */     
/*  479 */     synchronized (this.sequenceQueueLock) {
/*      */       
/*  481 */       if (this.sequenceQueue == null)
/*  482 */         this.sequenceQueue = new LinkedList(); 
/*  483 */       this.sequenceQueue.clear();
/*  484 */       this.sequenceQueue.add(paramFilenameURL);
/*      */     } 
/*  486 */     if (this.fadeThread == null) {
/*      */       
/*  488 */       this.fadeThread = new MidiChannel$FadeThread(this, null);
/*  489 */       this.fadeThread.start();
/*      */     } 
/*  491 */     this.fadeThread.interrupt();
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
/*      */   private synchronized boolean checkFadeOut() {
/*  503 */     if (this.fadeOutGain == -1.0F && this.fadeInGain == 1.0F) {
/*  504 */       return false;
/*      */     }
/*  506 */     long l1 = System.currentTimeMillis();
/*  507 */     long l2 = l1 - this.lastFadeCheck;
/*  508 */     this.lastFadeCheck = l1;
/*      */     
/*  510 */     if (this.fadeOutGain >= 0.0F) {
/*      */       
/*  512 */       if (this.fadeOutMilis == 0L) {
/*      */         
/*  514 */         this.fadeOutGain = 0.0F;
/*  515 */         this.fadeInGain = 0.0F;
/*  516 */         if (!incrementSequence())
/*  517 */           stop(); 
/*  518 */         rewind();
/*  519 */         resetGain();
/*  520 */         return false;
/*      */       } 
/*      */ 
/*      */       
/*  524 */       float f = (float)l2 / (float)this.fadeOutMilis;
/*      */       
/*  526 */       this.fadeOutGain -= f;
/*  527 */       if (this.fadeOutGain <= 0.0F) {
/*      */         
/*  529 */         this.fadeOutGain = -1.0F;
/*  530 */         this.fadeInGain = 0.0F;
/*  531 */         if (!incrementSequence())
/*  532 */           stop(); 
/*  533 */         rewind();
/*  534 */         resetGain();
/*  535 */         return false;
/*      */       } 
/*      */       
/*  538 */       resetGain();
/*  539 */       return true;
/*      */     } 
/*      */     
/*  542 */     if (this.fadeInGain < 1.0F) {
/*      */       
/*  544 */       this.fadeOutGain = -1.0F;
/*  545 */       if (this.fadeInMilis == 0L) {
/*      */         
/*  547 */         this.fadeOutGain = -1.0F;
/*  548 */         this.fadeInGain = 1.0F;
/*      */       }
/*      */       else {
/*      */         
/*  552 */         float f = (float)l2 / (float)this.fadeInMilis;
/*  553 */         this.fadeInGain += f;
/*  554 */         if (this.fadeInGain >= 1.0F) {
/*      */           
/*  556 */           this.fadeOutGain = -1.0F;
/*  557 */           this.fadeInGain = 1.0F;
/*      */         } 
/*      */       } 
/*  560 */       resetGain();
/*      */     } 
/*      */     
/*  563 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean incrementSequence() {
/*  572 */     synchronized (this.sequenceQueueLock) {
/*      */ 
/*      */       
/*  575 */       if (this.sequenceQueue != null && this.sequenceQueue.size() > 0) {
/*      */ 
/*      */         
/*  578 */         filenameURL(true, this.sequenceQueue.remove(0));
/*      */ 
/*      */         
/*  581 */         loading(true, true);
/*      */ 
/*      */         
/*  584 */         if (this.sequencer == null) {
/*      */ 
/*      */           
/*  587 */           getSequencer();
/*      */         
/*      */         }
/*      */         else {
/*      */           
/*  592 */           this.sequencer.stop();
/*      */           
/*  594 */           this.sequencer.setMicrosecondPosition(0L);
/*      */           
/*  596 */           this.sequencer.removeMetaEventListener(this);
/*      */           
/*  598 */           try { Thread.sleep(100L); } catch (InterruptedException interruptedException) {}
/*      */         } 
/*      */         
/*  601 */         if (this.sequencer == null) {
/*      */           
/*  603 */           errorMessage("Unable to set the sequence in method 'incrementSequence', because there wasn't a sequencer to use.");
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  608 */           loading(true, false);
/*      */ 
/*      */           
/*  611 */           return false;
/*      */         } 
/*      */         
/*  614 */         setSequence(filenameURL(false, null).getURL());
/*      */         
/*  616 */         this.sequencer.start();
/*      */ 
/*      */         
/*  619 */         resetGain();
/*      */         
/*  621 */         this.sequencer.addMetaEventListener(this);
/*      */ 
/*      */         
/*  624 */         loading(true, false);
/*      */ 
/*      */         
/*  627 */         return true;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  632 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void play() {
/*  641 */     if (!loading()) {
/*      */ 
/*      */       
/*  644 */       if (this.sequencer == null) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/*      */       try {
/*  650 */         this.sequencer.start();
/*      */         
/*  652 */         this.sequencer.addMetaEventListener(this);
/*      */       }
/*  654 */       catch (Exception exception) {
/*      */         
/*  656 */         errorMessage("Exception in method 'play'");
/*  657 */         printStackTrace(exception);
/*  658 */         SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
/*      */         
/*  660 */         SoundSystem.setException(soundSystemException);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void stop() {
/*  670 */     if (!loading()) {
/*      */ 
/*      */       
/*  673 */       if (this.sequencer == null) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/*      */       try {
/*  679 */         this.sequencer.stop();
/*      */         
/*  681 */         this.sequencer.setMicrosecondPosition(0L);
/*      */         
/*  683 */         this.sequencer.removeMetaEventListener(this);
/*      */       }
/*  685 */       catch (Exception exception) {
/*      */         
/*  687 */         errorMessage("Exception in method 'stop'");
/*  688 */         printStackTrace(exception);
/*  689 */         SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
/*      */         
/*  691 */         SoundSystem.setException(soundSystemException);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void pause() {
/*  701 */     if (!loading()) {
/*      */ 
/*      */       
/*  704 */       if (this.sequencer == null) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/*      */       try {
/*  710 */         this.sequencer.stop();
/*      */       }
/*  712 */       catch (Exception exception) {
/*      */         
/*  714 */         errorMessage("Exception in method 'pause'");
/*  715 */         printStackTrace(exception);
/*  716 */         SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
/*      */         
/*  718 */         SoundSystem.setException(soundSystemException);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rewind() {
/*  728 */     if (!loading()) {
/*      */ 
/*      */       
/*  731 */       if (this.sequencer == null) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/*      */       try {
/*  737 */         this.sequencer.setMicrosecondPosition(0L);
/*      */       }
/*  739 */       catch (Exception exception) {
/*      */         
/*  741 */         errorMessage("Exception in method 'rewind'");
/*  742 */         printStackTrace(exception);
/*  743 */         SoundSystemException soundSystemException = new SoundSystemException(exception.getMessage());
/*      */         
/*  745 */         SoundSystem.setException(soundSystemException);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVolume(float paramFloat) {
/*  756 */     this.gain = paramFloat;
/*  757 */     resetGain();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getVolume() {
/*  766 */     return this.gain;
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
/*      */   public void switchSource(boolean paramBoolean, String paramString1, String paramString2) {
/*  781 */     loading(true, true);
/*      */ 
/*      */     
/*  784 */     filenameURL(true, new FilenameURL(paramString2));
/*  785 */     sourcename(true, paramString1);
/*  786 */     setLooping(paramBoolean);
/*      */     
/*  788 */     reset();
/*      */ 
/*      */     
/*  791 */     loading(true, false);
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
/*      */   public void switchSource(boolean paramBoolean, String paramString1, URL paramURL, String paramString2) {
/*  809 */     loading(true, true);
/*      */ 
/*      */     
/*  812 */     filenameURL(true, new FilenameURL(paramURL, paramString2));
/*  813 */     sourcename(true, paramString1);
/*  814 */     setLooping(paramBoolean);
/*      */     
/*  816 */     reset();
/*      */ 
/*      */     
/*  819 */     loading(true, false);
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
/*      */   public void switchSource(boolean paramBoolean, String paramString, FilenameURL paramFilenameURL) {
/*  834 */     loading(true, true);
/*      */ 
/*      */     
/*  837 */     filenameURL(true, paramFilenameURL);
/*  838 */     sourcename(true, paramString);
/*  839 */     setLooping(paramBoolean);
/*      */     
/*  841 */     reset();
/*      */ 
/*      */     
/*  844 */     loading(true, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void reset() {
/*  852 */     synchronized (this.sequenceQueueLock) {
/*      */       
/*  854 */       if (this.sequenceQueue != null) {
/*  855 */         this.sequenceQueue.clear();
/*      */       }
/*      */     } 
/*      */     
/*  859 */     if (this.sequencer == null) {
/*      */ 
/*      */       
/*  862 */       getSequencer();
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  867 */       this.sequencer.stop();
/*      */       
/*  869 */       this.sequencer.setMicrosecondPosition(0L);
/*      */       
/*  871 */       this.sequencer.removeMetaEventListener(this);
/*      */       
/*  873 */       try { Thread.sleep(100L); } catch (InterruptedException interruptedException) {}
/*      */     } 
/*      */     
/*  876 */     if (this.sequencer == null) {
/*      */       
/*  878 */       errorMessage("Unable to set the sequence in method 'reset', because there wasn't a sequencer to use.");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/*  885 */     setSequence(filenameURL(false, null).getURL());
/*      */     
/*  887 */     this.sequencer.start();
/*      */ 
/*      */     
/*  890 */     resetGain();
/*      */     
/*  892 */     this.sequencer.addMetaEventListener(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLooping(boolean paramBoolean) {
/*  901 */     toLoop(true, paramBoolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getLooping() {
/*  910 */     return toLoop(false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private synchronized boolean toLoop(boolean paramBoolean1, boolean paramBoolean2) {
/*  921 */     if (paramBoolean1 == true)
/*  922 */       this.toLoop = paramBoolean2; 
/*  923 */     return this.toLoop;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean loading() {
/*  931 */     return loading(false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private synchronized boolean loading(boolean paramBoolean1, boolean paramBoolean2) {
/*  942 */     if (paramBoolean1 == true)
/*  943 */       this.loading = paramBoolean2; 
/*  944 */     return this.loading;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSourcename(String paramString) {
/*  953 */     sourcename(true, paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSourcename() {
/*  962 */     return sourcename(false, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private synchronized String sourcename(boolean paramBoolean, String paramString) {
/*  973 */     if (paramBoolean == true)
/*  974 */       this.sourcename = paramString; 
/*  975 */     return this.sourcename;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFilenameURL(FilenameURL paramFilenameURL) {
/*  984 */     filenameURL(true, paramFilenameURL);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFilename() {
/*  993 */     return filenameURL(false, null).getFilename();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FilenameURL getFilenameURL() {
/* 1002 */     return filenameURL(false, null);
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
/*      */   private synchronized FilenameURL filenameURL(boolean paramBoolean, FilenameURL paramFilenameURL) {
/* 1014 */     if (paramBoolean == true)
/* 1015 */       this.filenameURL = paramFilenameURL; 
/* 1016 */     return this.filenameURL;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void meta(MetaMessage paramMetaMessage) {
/* 1025 */     if (paramMetaMessage.getType() == 47)
/*      */     {
/*      */       
/* 1028 */       if (this.toLoop) {
/*      */ 
/*      */ 
/*      */         
/* 1032 */         if (!checkFadeOut())
/*      */         {
/*      */ 
/*      */           
/* 1036 */           if (!incrementSequence()) {
/*      */             
/*      */             try {
/*      */ 
/*      */               
/* 1041 */               this.sequencer.setMicrosecondPosition(0L);
/* 1042 */               this.sequencer.start();
/*      */               
/* 1044 */               resetGain();
/*      */             }
/* 1046 */             catch (Exception exception) {}
/*      */           }
/*      */         }
/* 1049 */         else if (this.sequencer != null)
/*      */         {
/*      */           
/*      */           try {
/*      */             
/* 1054 */             this.sequencer.setMicrosecondPosition(0L);
/* 1055 */             this.sequencer.start();
/*      */             
/* 1057 */             resetGain();
/*      */           }
/* 1059 */           catch (Exception exception) {}
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/* 1065 */       else if (!checkFadeOut()) {
/*      */         
/* 1067 */         if (!incrementSequence()) {
/*      */           
/*      */           try {
/*      */ 
/*      */             
/* 1072 */             this.sequencer.stop();
/*      */             
/* 1074 */             this.sequencer.setMicrosecondPosition(0L);
/*      */             
/* 1076 */             this.sequencer.removeMetaEventListener(this);
/*      */           }
/* 1078 */           catch (Exception exception) {}
/*      */         }
/*      */       } else {
/*      */ 
/*      */         
/*      */         try {
/*      */ 
/*      */           
/* 1086 */           this.sequencer.stop();
/*      */           
/* 1088 */           this.sequencer.setMicrosecondPosition(0L);
/*      */           
/* 1090 */           this.sequencer.removeMetaEventListener(this);
/*      */         }
/* 1092 */         catch (Exception exception) {}
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
/*      */   public void resetGain() {
/* 1104 */     if (this.gain < 0.0F)
/* 1105 */       this.gain = 0.0F; 
/* 1106 */     if (this.gain > 1.0F) {
/* 1107 */       this.gain = 1.0F;
/*      */     }
/* 1109 */     int i = (int)(this.gain * SoundSystemConfig.getMasterGain() * Math.abs(this.fadeOutGain) * this.fadeInGain * 127.0F);
/*      */ 
/*      */     
/* 1112 */     if (this.synthesizer != null) {
/*      */       
/* 1114 */       javax.sound.midi.MidiChannel[] arrayOfMidiChannel = this.synthesizer.getChannels();
/* 1115 */       for (byte b = 0; arrayOfMidiChannel != null && b < arrayOfMidiChannel.length; b++)
/*      */       {
/* 1117 */         arrayOfMidiChannel[b].controlChange(7, i);
/*      */       }
/*      */     }
/* 1120 */     else if (this.synthDevice != null) {
/*      */ 
/*      */       
/*      */       try {
/* 1124 */         ShortMessage shortMessage = new ShortMessage();
/* 1125 */         for (byte b = 0; b < 16; b++)
/*      */         {
/* 1127 */           shortMessage.setMessage(176, b, 7, i);
/*      */           
/* 1129 */           this.synthDevice.getReceiver().send(shortMessage, -1L);
/*      */         }
/*      */       
/* 1132 */       } catch (Exception exception) {
/*      */         
/* 1134 */         errorMessage("Error resetting gain on MIDI device");
/* 1135 */         printStackTrace(exception);
/*      */       }
/*      */     
/* 1138 */     } else if (this.sequencer != null && this.sequencer instanceof Synthesizer) {
/*      */       
/* 1140 */       this.synthesizer = (Synthesizer)this.sequencer;
/* 1141 */       javax.sound.midi.MidiChannel[] arrayOfMidiChannel = this.synthesizer.getChannels();
/* 1142 */       for (byte b = 0; arrayOfMidiChannel != null && b < arrayOfMidiChannel.length; b++)
/*      */       {
/* 1144 */         arrayOfMidiChannel[b].controlChange(7, i);
/*      */       }
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */         
/* 1151 */         Receiver receiver = MidiSystem.getReceiver();
/* 1152 */         ShortMessage shortMessage = new ShortMessage();
/* 1153 */         for (byte b = 0; b < 16; b++)
/*      */         {
/* 1155 */           shortMessage.setMessage(176, b, 7, i);
/*      */           
/* 1157 */           receiver.send(shortMessage, -1L);
/*      */         }
/*      */       
/* 1160 */       } catch (Exception exception) {
/*      */         
/* 1162 */         errorMessage("Error resetting gain on default receiver");
/* 1163 */         printStackTrace(exception);
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
/*      */   private void getSequencer() {
/*      */     try {
/* 1177 */       this.sequencer = MidiSystem.getSequencer();
/* 1178 */       if (this.sequencer != null)
/*      */       {
/*      */         
/*      */         try {
/* 1182 */           this.sequencer.getTransmitter();
/*      */         }
/* 1184 */         catch (MidiUnavailableException midiUnavailableException) {
/*      */           
/* 1186 */           message("Unable to get a transmitter from the default MIDI sequencer");
/*      */         } 
/*      */         
/* 1189 */         this.sequencer.open();
/*      */       }
/*      */     
/* 1192 */     } catch (MidiUnavailableException midiUnavailableException) {
/*      */       
/* 1194 */       message("Unable to open the default MIDI sequencer");
/* 1195 */       this.sequencer = null;
/*      */     } 
/*      */     
/* 1198 */     if (this.sequencer == null)
/* 1199 */       this.sequencer = openSequencer("Real Time Sequencer"); 
/* 1200 */     if (this.sequencer == null)
/* 1201 */       this.sequencer = openSequencer("Java Sound Sequencer"); 
/* 1202 */     if (this.sequencer == null) {
/*      */       
/* 1204 */       errorMessage("Failed to find an available MIDI sequencer");
/*      */       return;
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
/*      */   private void setSequence(URL paramURL) {
/* 1217 */     if (this.sequencer == null) {
/*      */       
/* 1219 */       errorMessage("Unable to update the sequence in method 'setSequence', because variable 'sequencer' is null");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1225 */     if (paramURL == null) {
/*      */       
/* 1227 */       errorMessage("Unable to load Midi file in method 'setSequence'.");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*      */     try {
/* 1233 */       this.sequence = MidiSystem.getSequence(paramURL);
/*      */     }
/* 1235 */     catch (IOException iOException) {
/*      */       
/* 1237 */       errorMessage("Input failed while reading from MIDI file in method 'setSequence'.");
/*      */       
/* 1239 */       printStackTrace(iOException);
/*      */       
/*      */       return;
/* 1242 */     } catch (InvalidMidiDataException invalidMidiDataException) {
/*      */       
/* 1244 */       errorMessage("Invalid MIDI data encountered, or not a MIDI file in method 'setSequence' (1).");
/*      */       
/* 1246 */       printStackTrace(invalidMidiDataException);
/*      */       return;
/*      */     } 
/* 1249 */     if (this.sequence == null) {
/*      */       
/* 1251 */       errorMessage("MidiSystem 'getSequence' method returned null in method 'setSequence'.");
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */ 
/*      */         
/* 1258 */         this.sequencer.setSequence(this.sequence);
/*      */       }
/* 1260 */       catch (InvalidMidiDataException invalidMidiDataException) {
/*      */         
/* 1262 */         errorMessage("Invalid MIDI data encountered, or not a MIDI file in method 'setSequence' (2).");
/*      */         
/* 1264 */         printStackTrace(invalidMidiDataException);
/*      */         
/*      */         return;
/* 1267 */       } catch (Exception exception) {
/*      */         
/* 1269 */         errorMessage("Problem setting sequence from MIDI file in method 'setSequence'.");
/*      */         
/* 1271 */         printStackTrace(exception);
/*      */         return;
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
/*      */   private void getSynthesizer() {
/* 1284 */     if (this.sequencer == null) {
/*      */       
/* 1286 */       errorMessage("Unable to load a Synthesizer in method 'getSynthesizer', because variable 'sequencer' is null");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1292 */     if (this.sequencer instanceof Synthesizer) {
/*      */       
/* 1294 */       this.synthesizer = (Synthesizer)this.sequencer;
/*      */     } else {
/*      */ 
/*      */       
/*      */       try {
/*      */         
/* 1300 */         this.synthesizer = MidiSystem.getSynthesizer();
/* 1301 */         this.synthesizer.open();
/*      */       }
/* 1303 */       catch (MidiUnavailableException midiUnavailableException) {
/*      */         
/* 1305 */         message("Unable to open the default synthesizer");
/* 1306 */         this.synthesizer = null;
/*      */       } 
/*      */       
/* 1309 */       if (this.synthesizer == null) {
/*      */         
/* 1311 */         this.synthDevice = openMidiDevice("Java Sound Synthesizer");
/* 1312 */         if (this.synthDevice == null)
/* 1313 */           this.synthDevice = openMidiDevice("Microsoft GS Wavetable"); 
/* 1314 */         if (this.synthDevice == null)
/* 1315 */           this.synthDevice = openMidiDevice("Gervill"); 
/* 1316 */         if (this.synthDevice == null) {
/*      */           
/* 1318 */           errorMessage("Failed to find an available MIDI synthesizer");
/*      */           
/*      */           return;
/*      */         } 
/*      */       } 
/*      */       
/* 1324 */       if (this.synthesizer == null) {
/*      */         
/*      */         try
/*      */         {
/* 1328 */           this.sequencer.getTransmitter().setReceiver(this.synthDevice.getReceiver());
/*      */         
/*      */         }
/* 1331 */         catch (MidiUnavailableException midiUnavailableException)
/*      */         {
/* 1333 */           errorMessage("Unable to link sequencer transmitter with MIDI device receiver");
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/* 1339 */       else if (this.synthesizer.getDefaultSoundbank() == null) {
/*      */ 
/*      */         
/*      */         try {
/* 1343 */           this.sequencer.getTransmitter().setReceiver(MidiSystem.getReceiver());
/*      */         
/*      */         }
/* 1346 */         catch (MidiUnavailableException midiUnavailableException) {
/*      */           
/* 1348 */           errorMessage("Unable to link sequencer transmitter with default receiver");
/*      */         } 
/*      */       } else {
/*      */ 
/*      */         
/*      */         try {
/*      */ 
/*      */           
/* 1356 */           this.sequencer.getTransmitter().setReceiver(this.synthesizer.getReceiver());
/*      */         
/*      */         }
/* 1359 */         catch (MidiUnavailableException midiUnavailableException) {
/*      */           
/* 1361 */           errorMessage("Unable to link sequencer transmitter with synthesizer receiver");
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
/*      */   private Sequencer openSequencer(String paramString) {
/* 1376 */     Sequencer sequencer = null;
/* 1377 */     sequencer = (Sequencer)openMidiDevice(paramString);
/* 1378 */     if (sequencer == null) {
/* 1379 */       return null;
/*      */     }
/*      */     try {
/* 1382 */       sequencer.getTransmitter();
/*      */     }
/* 1384 */     catch (MidiUnavailableException midiUnavailableException) {
/*      */       
/* 1386 */       message("    Unable to get a transmitter from this sequencer");
/* 1387 */       sequencer = null;
/* 1388 */       return null;
/*      */     } 
/*      */     
/* 1391 */     return sequencer;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MidiDevice openMidiDevice(String paramString) {
/* 1402 */     message("Searching for MIDI device with name containing '" + paramString + "'");
/*      */     
/* 1404 */     MidiDevice midiDevice = null;
/* 1405 */     MidiDevice.Info[] arrayOfInfo = MidiSystem.getMidiDeviceInfo();
/* 1406 */     for (byte b = 0; b < arrayOfInfo.length; b++) {
/*      */       
/* 1408 */       midiDevice = null;
/*      */       
/*      */       try {
/* 1411 */         midiDevice = MidiSystem.getMidiDevice(arrayOfInfo[b]);
/*      */       }
/* 1413 */       catch (MidiUnavailableException midiUnavailableException) {
/*      */         
/* 1415 */         message("    Problem in method 'getMidiDevice':  MIDIUnavailableException was thrown");
/*      */         
/* 1417 */         midiDevice = null;
/*      */       } 
/* 1419 */       if (midiDevice != null && arrayOfInfo[b].getName().contains(paramString)) {
/*      */ 
/*      */         
/* 1422 */         message("    Found MIDI device named '" + arrayOfInfo[b].getName() + "'");
/*      */         
/* 1424 */         if (midiDevice instanceof Synthesizer)
/* 1425 */           message("        *this is a Synthesizer instance"); 
/* 1426 */         if (midiDevice instanceof Sequencer) {
/* 1427 */           message("        *this is a Sequencer instance");
/*      */         }
/*      */         try {
/* 1430 */           midiDevice.open();
/*      */         }
/* 1432 */         catch (MidiUnavailableException midiUnavailableException) {
/*      */           
/* 1434 */           message("    Unable to open this MIDI device");
/* 1435 */           midiDevice = null;
/*      */         } 
/* 1437 */         return midiDevice;
/*      */       } 
/*      */     } 
/* 1440 */     message("    MIDI device not found");
/* 1441 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void message(String paramString) {
/* 1450 */     this.logger.message(paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void importantMessage(String paramString) {
/* 1459 */     this.logger.importantMessage(paramString, 0);
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
/* 1470 */     return this.logger.errorCheck(paramBoolean, "MidiChannel", paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void errorMessage(String paramString) {
/* 1479 */     this.logger.errorMessage("MidiChannel", paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void printStackTrace(Exception paramException) {
/* 1488 */     this.logger.printStackTrace(paramException, 1);
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\MidiChannel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */