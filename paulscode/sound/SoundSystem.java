/*      */ package paulscode.sound;
/*      */ 
/*      */ import java.net.URL;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedList;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
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
/*      */ public class SoundSystem
/*      */ {
/*      */   private static final boolean GET = false;
/*      */   private static final boolean SET = true;
/*      */   private static final boolean XXX = false;
/*      */   protected SoundSystemLogger logger;
/*      */   protected Library soundLibrary;
/*      */   protected List commandQueue;
/*      */   private List sourcePlayList;
/*      */   protected CommandThread commandThread;
/*      */   public Random randomNumberGenerator;
/*  116 */   protected String className = "SoundSystem";
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  121 */   private static Class currentLibrary = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static boolean initialized = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  131 */   private static SoundSystemException lastException = null;
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
/*      */   public SoundSystem() {
/*  143 */     this.logger = SoundSystemConfig.getLogger();
/*      */     
/*  145 */     if (this.logger == null) {
/*      */       
/*  147 */       this.logger = new SoundSystemLogger();
/*  148 */       SoundSystemConfig.setLogger(this.logger);
/*      */     } 
/*      */     
/*  151 */     linkDefaultLibrariesAndCodecs();
/*      */     
/*  153 */     LinkedList linkedList = SoundSystemConfig.getLibraries();
/*      */     
/*  155 */     if (linkedList != null) {
/*      */       
/*  157 */       ListIterator<Class<?>> listIterator = linkedList.listIterator();
/*      */       
/*  159 */       while (listIterator.hasNext()) {
/*      */         
/*  161 */         Class clazz = listIterator.next();
/*      */         
/*      */         try {
/*  164 */           init(clazz);
/*      */           
/*      */           return;
/*  167 */         } catch (SoundSystemException soundSystemException) {
/*      */           
/*  169 */           this.logger.printExceptionMessage(soundSystemException, 1);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*      */     try {
/*  175 */       init(Library.class);
/*      */       
/*      */       return;
/*  178 */     } catch (SoundSystemException soundSystemException) {
/*      */       
/*  180 */       this.logger.printExceptionMessage(soundSystemException, 1);
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
/*      */   public SoundSystem(Class paramClass) {
/*  193 */     this.logger = SoundSystemConfig.getLogger();
/*      */     
/*  195 */     if (this.logger == null) {
/*      */       
/*  197 */       this.logger = new SoundSystemLogger();
/*  198 */       SoundSystemConfig.setLogger(this.logger);
/*      */     } 
/*  200 */     linkDefaultLibrariesAndCodecs();
/*      */     
/*  202 */     init(paramClass);
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
/*      */   protected void linkDefaultLibrariesAndCodecs() {}
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
/*      */   protected void init(Class paramClass) {
/*  226 */     message("", 0);
/*  227 */     message("Starting up " + this.className + "...", 0);
/*      */ 
/*      */     
/*  230 */     this.randomNumberGenerator = new Random();
/*      */     
/*  232 */     this.commandQueue = new LinkedList();
/*      */     
/*  234 */     this.sourcePlayList = new LinkedList();
/*      */ 
/*      */     
/*  237 */     this.commandThread = new CommandThread(this);
/*  238 */     this.commandThread.start();
/*      */     
/*  240 */     snooze(200L);
/*      */     
/*  242 */     newLibrary(paramClass);
/*  243 */     message("", 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cleanup() {
/*  252 */     boolean bool = false;
/*  253 */     message("", 0);
/*  254 */     message(this.className + " shutting down...", 0);
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  259 */       this.commandThread.kill();
/*  260 */       this.commandThread.interrupt();
/*      */     }
/*  262 */     catch (Exception exception) {
/*      */       
/*  264 */       bool = true;
/*      */     } 
/*      */     
/*  267 */     if (!bool)
/*      */     {
/*      */       
/*  270 */       for (byte b = 0; b < 50; b++) {
/*      */         
/*  272 */         if (!this.commandThread.alive())
/*      */           break; 
/*  274 */         snooze(100L);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  279 */     if (bool || this.commandThread.alive()) {
/*      */       
/*  281 */       errorMessage("Command thread did not die!", 0);
/*  282 */       message("Ignoring errors... continuing clean-up.", 0);
/*      */     } 
/*      */     
/*  285 */     initialized(true, false);
/*  286 */     currentLibrary(true, null);
/*      */ 
/*      */     
/*      */     try {
/*  290 */       if (this.soundLibrary != null) {
/*  291 */         this.soundLibrary.cleanup();
/*      */       }
/*  293 */     } catch (Exception exception) {
/*      */       
/*  295 */       errorMessage("Problem during Library.cleanup()!", 0);
/*  296 */       message("Ignoring errors... continuing clean-up.", 0);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  302 */       if (this.commandQueue != null) {
/*  303 */         this.commandQueue.clear();
/*      */       }
/*  305 */     } catch (Exception exception) {
/*      */       
/*  307 */       errorMessage("Unable to clear the command queue!", 0);
/*  308 */       message("Ignoring errors... continuing clean-up.", 0);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  314 */       if (this.sourcePlayList != null) {
/*  315 */         this.sourcePlayList.clear();
/*      */       }
/*  317 */     } catch (Exception exception) {
/*      */       
/*  319 */       errorMessage("Unable to clear the source management list!", 0);
/*  320 */       message("Ignoring errors... continuing clean-up.", 0);
/*      */     } 
/*      */ 
/*      */     
/*  324 */     this.randomNumberGenerator = null;
/*  325 */     this.soundLibrary = null;
/*  326 */     this.commandQueue = null;
/*  327 */     this.sourcePlayList = null;
/*  328 */     this.commandThread = null;
/*      */     
/*  330 */     importantMessage("Author: Paul Lamb, www.paulscode.com", 1);
/*  331 */     message("", 0);
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
/*      */   public void interruptCommandThread() {
/*  343 */     if (this.commandThread == null) {
/*      */       
/*  345 */       errorMessage("Command Thread null in method 'interruptCommandThread'", 0);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  350 */     this.commandThread.interrupt();
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
/*      */   public void loadSound(String paramString) {
/*  364 */     CommandQueue(new CommandObject(2, new FilenameURL(paramString)));
/*      */ 
/*      */     
/*  367 */     this.commandThread.interrupt();
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
/*      */   public void loadSound(URL paramURL, String paramString) {
/*  381 */     CommandQueue(new CommandObject(2, new FilenameURL(paramURL, paramString)));
/*      */ 
/*      */     
/*  384 */     this.commandThread.interrupt();
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
/*      */   public void unloadSound(String paramString) {
/*  399 */     CommandQueue(new CommandObject(4, paramString));
/*      */     
/*  401 */     this.commandThread.interrupt();
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
/*      */   public void queueSound(String paramString1, String paramString2) {
/*  419 */     CommandQueue(new CommandObject(5, paramString1, new FilenameURL(paramString2)));
/*      */ 
/*      */     
/*  422 */     this.commandThread.interrupt();
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
/*      */   public void queueSound(String paramString1, URL paramURL, String paramString2) {
/*  439 */     CommandQueue(new CommandObject(5, paramString1, new FilenameURL(paramURL, paramString2)));
/*      */ 
/*      */     
/*  442 */     this.commandThread.interrupt();
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
/*      */   public void dequeueSound(String paramString1, String paramString2) {
/*  455 */     CommandQueue(new CommandObject(6, paramString1, paramString2));
/*      */ 
/*      */     
/*  458 */     this.commandThread.interrupt();
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
/*      */   public void fadeOut(String paramString1, String paramString2, long paramLong) {
/*  481 */     FilenameURL filenameURL = null;
/*  482 */     if (paramString2 != null) {
/*  483 */       filenameURL = new FilenameURL(paramString2);
/*      */     }
/*  485 */     CommandQueue(new CommandObject(7, paramString1, filenameURL, paramLong));
/*      */ 
/*      */     
/*  488 */     this.commandThread.interrupt();
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
/*      */   public void fadeOut(String paramString1, URL paramURL, String paramString2, long paramLong) {
/*  511 */     FilenameURL filenameURL = null;
/*  512 */     if (paramURL != null && paramString2 != null) {
/*  513 */       filenameURL = new FilenameURL(paramURL, paramString2);
/*      */     }
/*  515 */     CommandQueue(new CommandObject(7, paramString1, filenameURL, paramLong));
/*      */ 
/*      */     
/*  518 */     this.commandThread.interrupt();
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
/*      */ 
/*      */ 
/*      */   
/*      */   public void fadeOutIn(String paramString1, String paramString2, long paramLong1, long paramLong2) {
/*  544 */     CommandQueue(new CommandObject(8, paramString1, new FilenameURL(paramString2), paramLong1, paramLong2));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  549 */     this.commandThread.interrupt();
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
/*      */ 
/*      */   
/*      */   public void fadeOutIn(String paramString1, URL paramURL, String paramString2, long paramLong1, long paramLong2) {
/*  574 */     CommandQueue(new CommandObject(8, paramString1, new FilenameURL(paramURL, paramString2), paramLong1, paramLong2));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  579 */     this.commandThread.interrupt();
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
/*      */   public void checkFadeVolumes() {
/*  596 */     CommandQueue(new CommandObject(9));
/*      */     
/*  598 */     this.commandThread.interrupt();
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
/*      */   public void backgroundMusic(String paramString1, String paramString2, boolean paramBoolean) {
/*  616 */     CommandQueue(new CommandObject(12, true, true, paramBoolean, paramString1, new FilenameURL(paramString2), 0.0F, 0.0F, 0.0F, 0, 0.0F, false));
/*      */ 
/*      */ 
/*      */     
/*  620 */     CommandQueue(new CommandObject(21, paramString1));
/*      */     
/*  622 */     this.commandThread.interrupt();
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
/*      */   public void backgroundMusic(String paramString1, URL paramURL, String paramString2, boolean paramBoolean) {
/*  639 */     CommandQueue(new CommandObject(12, true, true, paramBoolean, paramString1, new FilenameURL(paramURL, paramString2), 0.0F, 0.0F, 0.0F, 0, 0.0F, false));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  645 */     CommandQueue(new CommandObject(21, paramString1));
/*      */     
/*  647 */     this.commandThread.interrupt();
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
/*      */   public void newSource(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  668 */     CommandQueue(new CommandObject(10, paramBoolean1, false, paramBoolean2, paramString1, new FilenameURL(paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
/*      */ 
/*      */ 
/*      */     
/*  672 */     this.commandThread.interrupt();
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
/*      */   public void newSource(boolean paramBoolean1, String paramString1, URL paramURL, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  694 */     CommandQueue(new CommandObject(10, paramBoolean1, false, paramBoolean2, paramString1, new FilenameURL(paramURL, paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  699 */     this.commandThread.interrupt();
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
/*      */   
/*      */   public void newStreamingSource(boolean paramBoolean1, String paramString1, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  723 */     CommandQueue(new CommandObject(10, paramBoolean1, true, paramBoolean2, paramString1, new FilenameURL(paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
/*      */ 
/*      */ 
/*      */     
/*  727 */     this.commandThread.interrupt();
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
/*      */   public void newStreamingSource(boolean paramBoolean1, String paramString1, URL paramURL, String paramString2, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  750 */     CommandQueue(new CommandObject(10, paramBoolean1, true, paramBoolean2, paramString1, new FilenameURL(paramURL, paramString2), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
/*      */ 
/*      */ 
/*      */     
/*  754 */     this.commandThread.interrupt();
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
/*      */   public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  775 */     CommandQueue(new CommandObject(11, paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
/*      */ 
/*      */     
/*  778 */     this.commandThread.interrupt();
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
/*      */   public String quickPlay(boolean paramBoolean1, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  801 */     String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  806 */     CommandQueue(new CommandObject(12, paramBoolean1, false, paramBoolean2, str, new FilenameURL(paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
/*      */ 
/*      */ 
/*      */     
/*  810 */     CommandQueue(new CommandObject(21, str));
/*      */     
/*  812 */     this.commandThread.interrupt();
/*      */ 
/*      */     
/*  815 */     return str;
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
/*      */   
/*      */   public String quickPlay(boolean paramBoolean1, URL paramURL, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  839 */     String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  844 */     CommandQueue(new CommandObject(12, paramBoolean1, false, paramBoolean2, str, new FilenameURL(paramURL, paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  849 */     CommandQueue(new CommandObject(21, str));
/*      */     
/*  851 */     this.commandThread.interrupt();
/*      */ 
/*      */     
/*  854 */     return str;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String quickStream(boolean paramBoolean1, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  882 */     String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  887 */     CommandQueue(new CommandObject(12, paramBoolean1, true, paramBoolean2, str, new FilenameURL(paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
/*      */ 
/*      */ 
/*      */     
/*  891 */     CommandQueue(new CommandObject(21, str));
/*      */     
/*  893 */     this.commandThread.interrupt();
/*      */ 
/*      */     
/*  896 */     return str;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public String quickStream(boolean paramBoolean1, URL paramURL, String paramString, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  922 */     String str = "Source_" + this.randomNumberGenerator.nextInt() + "_" + this.randomNumberGenerator.nextInt();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  927 */     CommandQueue(new CommandObject(12, paramBoolean1, true, paramBoolean2, str, new FilenameURL(paramURL, paramString), paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, true));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  932 */     CommandQueue(new CommandObject(21, str));
/*      */     
/*  934 */     this.commandThread.interrupt();
/*      */ 
/*      */     
/*  937 */     return str;
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
/*      */   public void setPosition(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
/*  949 */     CommandQueue(new CommandObject(13, paramString, paramFloat1, paramFloat2, paramFloat3));
/*      */     
/*  951 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVolume(String paramString, float paramFloat) {
/*  960 */     CommandQueue(new CommandObject(14, paramString, paramFloat));
/*      */     
/*  962 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getVolume(String paramString) {
/*  973 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/*  975 */       if (this.soundLibrary != null) {
/*  976 */         return this.soundLibrary.getVolume(paramString);
/*      */       }
/*  978 */       return 0.0F;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPitch(String paramString, float paramFloat) {
/*  989 */     CommandQueue(new CommandObject(15, paramString, paramFloat));
/*      */     
/*  991 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getPitch(String paramString) {
/* 1001 */     if (this.soundLibrary != null) {
/* 1002 */       return this.soundLibrary.getPitch(paramString);
/*      */     }
/* 1004 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPriority(String paramString, boolean paramBoolean) {
/* 1015 */     CommandQueue(new CommandObject(16, paramString, paramBoolean));
/*      */     
/* 1017 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLooping(String paramString, boolean paramBoolean) {
/* 1026 */     CommandQueue(new CommandObject(17, paramString, paramBoolean));
/*      */     
/* 1028 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttenuation(String paramString, int paramInt) {
/* 1039 */     CommandQueue(new CommandObject(18, paramString, paramInt));
/*      */     
/* 1041 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDistOrRoll(String paramString, float paramFloat) {
/* 1052 */     CommandQueue(new CommandObject(19, paramString, paramFloat));
/*      */     
/* 1054 */     this.commandThread.interrupt();
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
/*      */   public void feedRawAudioData(String paramString, byte[] paramArrayOfbyte) {
/* 1072 */     CommandQueue(new CommandObject(22, paramString, paramArrayOfbyte));
/*      */     
/* 1074 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void play(String paramString) {
/* 1082 */     CommandQueue(new CommandObject(21, paramString));
/* 1083 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void pause(String paramString) {
/* 1091 */     CommandQueue(new CommandObject(23, paramString));
/* 1092 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void stop(String paramString) {
/* 1100 */     CommandQueue(new CommandObject(24, paramString));
/* 1101 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rewind(String paramString) {
/* 1109 */     CommandQueue(new CommandObject(25, paramString));
/* 1110 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void flush(String paramString) {
/* 1118 */     CommandQueue(new CommandObject(26, paramString));
/* 1119 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cull(String paramString) {
/* 1129 */     CommandQueue(new CommandObject(27, paramString));
/* 1130 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void activate(String paramString) {
/* 1140 */     CommandQueue(new CommandObject(28, paramString));
/* 1141 */     this.commandThread.interrupt();
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
/*      */   public void setTemporary(String paramString, boolean paramBoolean) {
/* 1158 */     CommandQueue(new CommandObject(29, paramString, paramBoolean));
/*      */     
/* 1160 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeSource(String paramString) {
/* 1169 */     CommandQueue(new CommandObject(30, paramString));
/*      */     
/* 1171 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void moveListener(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1181 */     CommandQueue(new CommandObject(31, paramFloat1, paramFloat2, paramFloat3));
/*      */     
/* 1183 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1193 */     CommandQueue(new CommandObject(32, paramFloat1, paramFloat2, paramFloat3));
/*      */     
/* 1195 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void turnListener(float paramFloat) {
/* 1204 */     CommandQueue(new CommandObject(33, paramFloat));
/*      */     
/* 1206 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListenerAngle(float paramFloat) {
/* 1214 */     CommandQueue(new CommandObject(34, paramFloat));
/*      */     
/* 1216 */     this.commandThread.interrupt();
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
/*      */   public void setListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 1230 */     CommandQueue(new CommandObject(35, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6));
/*      */     
/* 1232 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMasterVolume(float paramFloat) {
/* 1241 */     CommandQueue(new CommandObject(36, paramFloat));
/*      */     
/* 1243 */     this.commandThread.interrupt();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getMasterVolume() {
/* 1252 */     return SoundSystemConfig.getMasterGain();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ListenerData getListenerData() {
/* 1262 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 1264 */       return this.soundLibrary.getListenerData();
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
/*      */   public boolean switchLibrary(Class<Library> paramClass) {
/* 1277 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 1279 */       initialized(true, false);
/*      */       
/* 1281 */       HashMap hashMap = null;
/* 1282 */       ListenerData listenerData = null;
/*      */       
/* 1284 */       boolean bool = false;
/* 1285 */       MidiChannel midiChannel = null;
/* 1286 */       FilenameURL filenameURL = null;
/* 1287 */       String str = "";
/* 1288 */       boolean bool1 = true;
/*      */       
/* 1290 */       if (this.soundLibrary != null) {
/*      */         
/* 1292 */         currentLibrary(true, null);
/* 1293 */         hashMap = copySources(this.soundLibrary.getSources());
/* 1294 */         listenerData = this.soundLibrary.getListenerData();
/* 1295 */         midiChannel = this.soundLibrary.getMidiChannel();
/* 1296 */         if (midiChannel != null) {
/*      */           
/* 1298 */           bool = true;
/* 1299 */           bool1 = midiChannel.getLooping();
/* 1300 */           str = midiChannel.getSourcename();
/* 1301 */           filenameURL = midiChannel.getFilenameURL();
/*      */         } 
/*      */         
/* 1304 */         this.soundLibrary.cleanup();
/* 1305 */         this.soundLibrary = null;
/*      */       } 
/* 1307 */       message("", 0);
/* 1308 */       message("Switching to " + SoundSystemConfig.getLibraryTitle(paramClass), 0);
/*      */       
/* 1310 */       message("(" + SoundSystemConfig.getLibraryDescription(paramClass) + ")", 1);
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/* 1315 */         this.soundLibrary = paramClass.newInstance();
/*      */       }
/* 1317 */       catch (InstantiationException instantiationException) {
/*      */         
/* 1319 */         errorMessage("The specified library did not load properly", 1);
/*      */       }
/* 1321 */       catch (IllegalAccessException illegalAccessException) {
/*      */         
/* 1323 */         errorMessage("The specified library did not load properly", 1);
/*      */       }
/* 1325 */       catch (ExceptionInInitializerError exceptionInInitializerError) {
/*      */         
/* 1327 */         errorMessage("The specified library did not load properly", 1);
/*      */       }
/* 1329 */       catch (SecurityException securityException) {
/*      */         
/* 1331 */         errorMessage("The specified library did not load properly", 1);
/*      */       } 
/*      */       
/* 1334 */       if (errorCheck((this.soundLibrary == null), "Library null after initialization in method 'switchLibrary'", 1)) {
/*      */ 
/*      */         
/* 1337 */         SoundSystemException soundSystemException = new SoundSystemException(this.className + " did not load properly.  " + "Library was null after initialization.", 4);
/*      */ 
/*      */ 
/*      */         
/* 1341 */         lastException(true, soundSystemException);
/* 1342 */         initialized(true, true);
/* 1343 */         throw soundSystemException;
/*      */       } 
/*      */ 
/*      */       
/*      */       try {
/* 1348 */         this.soundLibrary.init();
/*      */       }
/* 1350 */       catch (SoundSystemException soundSystemException) {
/*      */         
/* 1352 */         lastException(true, soundSystemException);
/* 1353 */         initialized(true, true);
/* 1354 */         throw soundSystemException;
/*      */       } 
/*      */       
/* 1357 */       this.soundLibrary.setListenerData(listenerData);
/* 1358 */       if (bool) {
/*      */         
/* 1360 */         if (midiChannel != null)
/* 1361 */           midiChannel.cleanup(); 
/* 1362 */         midiChannel = new MidiChannel(bool1, str, filenameURL);
/*      */         
/* 1364 */         this.soundLibrary.setMidiChannel(midiChannel);
/*      */       } 
/* 1366 */       this.soundLibrary.copySources(hashMap);
/*      */       
/* 1368 */       message("", 0);
/*      */       
/* 1370 */       lastException(true, null);
/* 1371 */       initialized(true, true);
/*      */       
/* 1373 */       return true;
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
/*      */   public boolean newLibrary(Class paramClass) {
/* 1386 */     initialized(true, false);
/*      */     
/* 1388 */     CommandQueue(new CommandObject(37, paramClass));
/*      */     
/* 1390 */     this.commandThread.interrupt();
/*      */     
/* 1392 */     for (byte b = 0; !initialized(false, false) && b < 100; b++) {
/*      */       
/* 1394 */       snooze(400L);
/* 1395 */       this.commandThread.interrupt();
/*      */     } 
/*      */     
/* 1398 */     if (!initialized(false, false)) {
/*      */       
/* 1400 */       SoundSystemException soundSystemException1 = new SoundSystemException(this.className + " did not load after 30 seconds.", 4);
/*      */ 
/*      */ 
/*      */       
/* 1404 */       lastException(true, soundSystemException1);
/* 1405 */       throw soundSystemException1;
/*      */     } 
/*      */ 
/*      */     
/* 1409 */     SoundSystemException soundSystemException = lastException(false, null);
/* 1410 */     if (soundSystemException != null) {
/* 1411 */       throw soundSystemException;
/*      */     }
/* 1413 */     return true;
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
/*      */   private void CommandNewLibrary(Class<Library> paramClass) {
/* 1426 */     initialized(true, false);
/*      */     
/* 1428 */     String str = "Initializing ";
/* 1429 */     if (this.soundLibrary != null) {
/*      */       
/* 1431 */       currentLibrary(true, null);
/*      */       
/* 1433 */       str = "Switching to ";
/* 1434 */       this.soundLibrary.cleanup();
/* 1435 */       this.soundLibrary = null;
/*      */     } 
/* 1437 */     message(str + SoundSystemConfig.getLibraryTitle(paramClass), 0);
/*      */     
/* 1439 */     message("(" + SoundSystemConfig.getLibraryDescription(paramClass) + ")", 1);
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/* 1444 */       this.soundLibrary = paramClass.newInstance();
/*      */     }
/* 1446 */     catch (InstantiationException instantiationException) {
/*      */       
/* 1448 */       errorMessage("The specified library did not load properly", 1);
/*      */     }
/* 1450 */     catch (IllegalAccessException illegalAccessException) {
/*      */       
/* 1452 */       errorMessage("The specified library did not load properly", 1);
/*      */     }
/* 1454 */     catch (ExceptionInInitializerError exceptionInInitializerError) {
/*      */       
/* 1456 */       errorMessage("The specified library did not load properly", 1);
/*      */     }
/* 1458 */     catch (SecurityException securityException) {
/*      */       
/* 1460 */       errorMessage("The specified library did not load properly", 1);
/*      */     } 
/*      */     
/* 1463 */     if (errorCheck((this.soundLibrary == null), "Library null after initialization in method 'newLibrary'", 1)) {
/*      */ 
/*      */       
/* 1466 */       lastException(true, new SoundSystemException(this.className + " did not load properly.  " + "Library was null after initialization.", 4));
/*      */ 
/*      */ 
/*      */       
/* 1470 */       importantMessage("Switching to silent mode", 1);
/*      */ 
/*      */       
/*      */       try {
/* 1474 */         this.soundLibrary = new Library();
/*      */       }
/* 1476 */       catch (SoundSystemException soundSystemException) {
/*      */         
/* 1478 */         lastException(true, new SoundSystemException("Silent mode did not load properly.  Library was null after initialization.", 4));
/*      */ 
/*      */ 
/*      */         
/* 1482 */         initialized(true, true);
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*      */     
/*      */     try {
/* 1489 */       this.soundLibrary.init();
/*      */     }
/* 1491 */     catch (SoundSystemException soundSystemException) {
/*      */       
/* 1493 */       lastException(true, soundSystemException);
/* 1494 */       initialized(true, true);
/*      */       
/*      */       return;
/*      */     } 
/* 1498 */     lastException(true, null);
/* 1499 */     initialized(true, true);
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
/*      */   private void CommandInitialize() {
/*      */     try {
/* 1512 */       if (errorCheck((this.soundLibrary == null), "Library null after initialization in method 'CommandInitialize'", 1)) {
/*      */ 
/*      */ 
/*      */         
/* 1516 */         SoundSystemException soundSystemException = new SoundSystemException(this.className + " did not load properly.  " + "Library was null after initialization.", 4);
/*      */ 
/*      */ 
/*      */         
/* 1520 */         lastException(true, soundSystemException);
/* 1521 */         throw soundSystemException;
/*      */       } 
/* 1523 */       this.soundLibrary.init();
/*      */     }
/* 1525 */     catch (SoundSystemException soundSystemException) {
/*      */       
/* 1527 */       lastException(true, soundSystemException);
/* 1528 */       initialized(true, true);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandLoadSound(FilenameURL paramFilenameURL) {
/* 1539 */     if (this.soundLibrary != null) {
/* 1540 */       this.soundLibrary.loadSound(paramFilenameURL);
/*      */     } else {
/* 1542 */       errorMessage("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandUnloadSound(String paramString) {
/* 1553 */     if (this.soundLibrary != null) {
/* 1554 */       this.soundLibrary.unloadSound(paramString);
/*      */     } else {
/* 1556 */       errorMessage("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
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
/*      */   private void CommandQueueSound(String paramString, FilenameURL paramFilenameURL) {
/* 1571 */     if (this.soundLibrary != null) {
/* 1572 */       this.soundLibrary.queueSound(paramString, paramFilenameURL);
/*      */     } else {
/* 1574 */       errorMessage("Variable 'soundLibrary' null in method 'CommandQueueSound'", 0);
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
/*      */   private void CommandDequeueSound(String paramString1, String paramString2) {
/* 1588 */     if (this.soundLibrary != null) {
/* 1589 */       this.soundLibrary.dequeueSound(paramString1, paramString2);
/*      */     } else {
/* 1591 */       errorMessage("Variable 'soundLibrary' null in method 'CommandDequeueSound'", 0);
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
/*      */ 
/*      */   
/*      */   private void CommandFadeOut(String paramString, FilenameURL paramFilenameURL, long paramLong) {
/* 1612 */     if (this.soundLibrary != null) {
/* 1613 */       this.soundLibrary.fadeOut(paramString, paramFilenameURL, paramLong);
/*      */     } else {
/* 1615 */       errorMessage("Variable 'soundLibrary' null in method 'CommandFadeOut'", 0);
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
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandFadeOutIn(String paramString, FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
/* 1637 */     if (this.soundLibrary != null) {
/* 1638 */       this.soundLibrary.fadeOutIn(paramString, paramFilenameURL, paramLong1, paramLong2);
/*      */     } else {
/*      */       
/* 1641 */       errorMessage("Variable 'soundLibrary' null in method 'CommandFadeOutIn'", 0);
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
/*      */   private void CommandCheckFadeVolumes() {
/* 1659 */     if (this.soundLibrary != null) {
/* 1660 */       this.soundLibrary.checkFadeVolumes();
/*      */     } else {
/* 1662 */       errorMessage("Variable 'soundLibrary' null in method 'CommandCheckFadeVolumes'", 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandNewSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/* 1686 */     if (this.soundLibrary != null) {
/*      */       
/* 1688 */       if (paramFilenameURL.getFilename().matches(".*[mM][iI][dD][iI]?$") && !SoundSystemConfig.midiCodec())
/*      */       {
/*      */ 
/*      */         
/* 1692 */         this.soundLibrary.loadMidi(paramBoolean3, paramString, paramFilenameURL);
/*      */       }
/*      */       else
/*      */       {
/* 1696 */         this.soundLibrary.newSource(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4);
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1702 */       errorMessage("Variable 'soundLibrary' null in method 'CommandNewSource'", 0);
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
/*      */ 
/*      */   
/*      */   private void CommandRawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/* 1723 */     if (this.soundLibrary != null) {
/* 1724 */       this.soundLibrary.rawDataStream(paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4);
/*      */     } else {
/*      */       
/* 1727 */       errorMessage("Variable 'soundLibrary' null in method 'CommandRawDataStream'", 0);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandQuickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/* 1753 */     if (this.soundLibrary != null) {
/*      */       
/* 1755 */       if (paramFilenameURL.getFilename().matches(".*[mM][iI][dD][iI]?$") && !SoundSystemConfig.midiCodec())
/*      */       {
/*      */         
/* 1758 */         this.soundLibrary.loadMidi(paramBoolean3, paramString, paramFilenameURL);
/*      */       }
/*      */       else
/*      */       {
/* 1762 */         this.soundLibrary.quickPlay(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4);
/*      */       }
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1768 */       errorMessage("Variable 'soundLibrary' null in method 'CommandQuickPlay'", 0);
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
/*      */   private void CommandSetPosition(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1783 */     if (this.soundLibrary != null) {
/* 1784 */       this.soundLibrary.setPosition(paramString, paramFloat1, paramFloat2, paramFloat3);
/*      */     } else {
/* 1786 */       errorMessage("Variable 'soundLibrary' null in method 'CommandMoveSource'", 0);
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
/*      */   private void CommandSetVolume(String paramString, float paramFloat) {
/* 1798 */     if (this.soundLibrary != null) {
/* 1799 */       this.soundLibrary.setVolume(paramString, paramFloat);
/*      */     } else {
/* 1801 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetVolume'", 0);
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
/*      */   private void CommandSetPitch(String paramString, float paramFloat) {
/* 1813 */     if (this.soundLibrary != null) {
/* 1814 */       this.soundLibrary.setPitch(paramString, paramFloat);
/*      */     } else {
/* 1816 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetPitch'", 0);
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
/*      */   private void CommandSetPriority(String paramString, boolean paramBoolean) {
/* 1829 */     if (this.soundLibrary != null) {
/* 1830 */       this.soundLibrary.setPriority(paramString, paramBoolean);
/*      */     } else {
/* 1832 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetPriority'", 0);
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
/*      */   private void CommandSetLooping(String paramString, boolean paramBoolean) {
/* 1844 */     if (this.soundLibrary != null) {
/* 1845 */       this.soundLibrary.setLooping(paramString, paramBoolean);
/*      */     } else {
/* 1847 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetLooping'", 0);
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
/*      */   private void CommandSetAttenuation(String paramString, int paramInt) {
/* 1861 */     if (this.soundLibrary != null) {
/* 1862 */       this.soundLibrary.setAttenuation(paramString, paramInt);
/*      */     } else {
/* 1864 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetAttenuation'", 0);
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
/*      */   private void CommandSetDistOrRoll(String paramString, float paramFloat) {
/* 1877 */     if (this.soundLibrary != null) {
/* 1878 */       this.soundLibrary.setDistOrRoll(paramString, paramFloat);
/*      */     } else {
/* 1880 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetDistOrRoll'", 0);
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
/*      */   private void CommandPlay(String paramString) {
/* 1892 */     if (this.soundLibrary != null) {
/* 1893 */       this.soundLibrary.play(paramString);
/*      */     } else {
/* 1895 */       errorMessage("Variable 'soundLibrary' null in method 'CommandPlay'", 0);
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
/*      */   private void CommandFeedRawAudioData(String paramString, byte[] paramArrayOfbyte) {
/* 1909 */     if (this.soundLibrary != null) {
/* 1910 */       this.soundLibrary.feedRawAudioData(paramString, paramArrayOfbyte);
/*      */     } else {
/* 1912 */       errorMessage("Variable 'soundLibrary' null in method 'CommandFeedRawAudioData'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandPause(String paramString) {
/* 1923 */     if (this.soundLibrary != null) {
/* 1924 */       this.soundLibrary.pause(paramString);
/*      */     } else {
/* 1926 */       errorMessage("Variable 'soundLibrary' null in method 'CommandPause'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandStop(String paramString) {
/* 1937 */     if (this.soundLibrary != null) {
/* 1938 */       this.soundLibrary.stop(paramString);
/*      */     } else {
/* 1940 */       errorMessage("Variable 'soundLibrary' null in method 'CommandStop'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandRewind(String paramString) {
/* 1951 */     if (this.soundLibrary != null) {
/* 1952 */       this.soundLibrary.rewind(paramString);
/*      */     } else {
/* 1954 */       errorMessage("Variable 'soundLibrary' null in method 'CommandRewind'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandFlush(String paramString) {
/* 1965 */     if (this.soundLibrary != null) {
/* 1966 */       this.soundLibrary.flush(paramString);
/*      */     } else {
/* 1968 */       errorMessage("Variable 'soundLibrary' null in method 'CommandFlush'", 0);
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
/*      */   private void CommandSetTemporary(String paramString, boolean paramBoolean) {
/* 1987 */     if (this.soundLibrary != null) {
/* 1988 */       this.soundLibrary.setTemporary(paramString, paramBoolean);
/*      */     } else {
/* 1990 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetActive'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandRemoveSource(String paramString) {
/* 2001 */     if (this.soundLibrary != null) {
/* 2002 */       this.soundLibrary.removeSource(paramString);
/*      */     } else {
/* 2004 */       errorMessage("Variable 'soundLibrary' null in method 'CommandRemoveSource'", 0);
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
/*      */   private void CommandMoveListener(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 2017 */     if (this.soundLibrary != null) {
/* 2018 */       this.soundLibrary.moveListener(paramFloat1, paramFloat2, paramFloat3);
/*      */     } else {
/* 2020 */       errorMessage("Variable 'soundLibrary' null in method 'CommandMoveListener'", 0);
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
/*      */   private void CommandSetListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 2033 */     if (this.soundLibrary != null) {
/* 2034 */       this.soundLibrary.setListenerPosition(paramFloat1, paramFloat2, paramFloat3);
/*      */     } else {
/* 2036 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerPosition'", 0);
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
/*      */   private void CommandTurnListener(float paramFloat) {
/* 2049 */     if (this.soundLibrary != null) {
/* 2050 */       this.soundLibrary.turnListener(paramFloat);
/*      */     } else {
/* 2052 */       errorMessage("Variable 'soundLibrary' null in method 'CommandTurnListener'", 0);
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
/*      */   private void CommandSetListenerAngle(float paramFloat) {
/* 2064 */     if (this.soundLibrary != null) {
/* 2065 */       this.soundLibrary.setListenerAngle(paramFloat);
/*      */     } else {
/* 2067 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerAngle'", 0);
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
/*      */   private void CommandSetListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 2086 */     if (this.soundLibrary != null) {
/* 2087 */       this.soundLibrary.setListenerOrientation(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*      */     } else {
/*      */       
/* 2090 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetListenerOrientation'", 0);
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
/*      */   private void CommandCull(String paramString) {
/* 2103 */     if (this.soundLibrary != null) {
/* 2104 */       this.soundLibrary.cull(paramString);
/*      */     } else {
/* 2106 */       errorMessage("Variable 'soundLibrary' null in method 'CommandCull'", 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void CommandActivate(String paramString) {
/* 2117 */     if (this.soundLibrary != null) {
/* 2118 */       this.soundLibrary.activate(paramString);
/*      */     } else {
/* 2120 */       errorMessage("Variable 'soundLibrary' null in method 'CommandActivate'", 0);
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
/*      */   private void CommandSetMasterVolume(float paramFloat) {
/* 2132 */     if (this.soundLibrary != null) {
/* 2133 */       this.soundLibrary.setMasterVolume(paramFloat);
/*      */     } else {
/* 2135 */       errorMessage("Variable 'soundLibrary' null in method 'CommandSetMasterVolume'", 0);
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
/*      */ 
/*      */ 
/*      */   
/*      */   protected void ManageSources() {}
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
/*      */   public boolean CommandQueue(CommandObject paramCommandObject) {
/* 2176 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2178 */       if (paramCommandObject == null) {
/*      */ 
/*      */         
/* 2181 */         boolean bool = false;
/*      */ 
/*      */ 
/*      */         
/* 2185 */         while (this.commandQueue != null && this.commandQueue.size() > 0) {
/*      */ 
/*      */           
/* 2188 */           CommandObject commandObject = this.commandQueue.remove(0);
/*      */           
/* 2190 */           if (commandObject != null)
/*      */           {
/* 2192 */             switch (commandObject.Command) {
/*      */               
/*      */               case 1:
/* 2195 */                 CommandInitialize();
/*      */               
/*      */               case 2:
/* 2198 */                 CommandLoadSound((FilenameURL)commandObject.objectArgs[0]);
/*      */ 
/*      */               
/*      */               case 4:
/* 2202 */                 CommandUnloadSound(commandObject.stringArgs[0]);
/*      */               
/*      */               case 5:
/* 2205 */                 CommandQueueSound(commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0]);
/*      */ 
/*      */               
/*      */               case 6:
/* 2209 */                 CommandDequeueSound(commandObject.stringArgs[0], commandObject.stringArgs[1]);
/*      */ 
/*      */               
/*      */               case 7:
/* 2213 */                 CommandFadeOut(commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.longArgs[0]);
/*      */ 
/*      */ 
/*      */               
/*      */               case 8:
/* 2218 */                 CommandFadeOutIn(commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.longArgs[0], commandObject.longArgs[1]);
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               case 9:
/* 2224 */                 CommandCheckFadeVolumes();
/*      */               
/*      */               case 10:
/* 2227 */                 CommandNewSource(commandObject.boolArgs[0], commandObject.boolArgs[1], commandObject.boolArgs[2], commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.intArgs[0], commandObject.floatArgs[3]);
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
/*      */               case 11:
/* 2239 */                 CommandRawDataStream((AudioFormat)commandObject.objectArgs[0], commandObject.boolArgs[0], commandObject.stringArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.intArgs[0], commandObject.floatArgs[3]);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               case 12:
/* 2250 */                 CommandQuickPlay(commandObject.boolArgs[0], commandObject.boolArgs[1], commandObject.boolArgs[2], commandObject.stringArgs[0], (FilenameURL)commandObject.objectArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.intArgs[0], commandObject.floatArgs[3], commandObject.boolArgs[3]);
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
/*      */               case 13:
/* 2263 */                 CommandSetPosition(commandObject.stringArgs[0], commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               case 14:
/* 2269 */                 CommandSetVolume(commandObject.stringArgs[0], commandObject.floatArgs[0]);
/*      */ 
/*      */               
/*      */               case 15:
/* 2273 */                 CommandSetPitch(commandObject.stringArgs[0], commandObject.floatArgs[0]);
/*      */ 
/*      */               
/*      */               case 16:
/* 2277 */                 CommandSetPriority(commandObject.stringArgs[0], commandObject.boolArgs[0]);
/*      */ 
/*      */               
/*      */               case 17:
/* 2281 */                 CommandSetLooping(commandObject.stringArgs[0], commandObject.boolArgs[0]);
/*      */ 
/*      */               
/*      */               case 18:
/* 2285 */                 CommandSetAttenuation(commandObject.stringArgs[0], commandObject.intArgs[0]);
/*      */ 
/*      */               
/*      */               case 19:
/* 2289 */                 CommandSetDistOrRoll(commandObject.stringArgs[0], commandObject.floatArgs[0]);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               case 21:
/* 2298 */                 this.sourcePlayList.add(commandObject);
/*      */               
/*      */               case 22:
/* 2301 */                 this.sourcePlayList.add(commandObject);
/*      */ 
/*      */               
/*      */               case 23:
/* 2305 */                 CommandPause(commandObject.stringArgs[0]);
/*      */               
/*      */               case 24:
/* 2308 */                 CommandStop(commandObject.stringArgs[0]);
/*      */               
/*      */               case 25:
/* 2311 */                 CommandRewind(commandObject.stringArgs[0]);
/*      */               
/*      */               case 26:
/* 2314 */                 CommandFlush(commandObject.stringArgs[0]);
/*      */               
/*      */               case 27:
/* 2317 */                 CommandCull(commandObject.stringArgs[0]);
/*      */               
/*      */               case 28:
/* 2320 */                 bool = true;
/* 2321 */                 CommandActivate(commandObject.stringArgs[0]);
/*      */               
/*      */               case 29:
/* 2324 */                 CommandSetTemporary(commandObject.stringArgs[0], commandObject.boolArgs[0]);
/*      */ 
/*      */               
/*      */               case 30:
/* 2328 */                 CommandRemoveSource(commandObject.stringArgs[0]);
/*      */               
/*      */               case 31:
/* 2331 */                 CommandMoveListener(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
/*      */ 
/*      */ 
/*      */               
/*      */               case 32:
/* 2336 */                 CommandSetListenerPosition(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2]);
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               case 33:
/* 2342 */                 CommandTurnListener(commandObject.floatArgs[0]);
/*      */               
/*      */               case 34:
/* 2345 */                 CommandSetListenerAngle(commandObject.floatArgs[0]);
/*      */ 
/*      */               
/*      */               case 35:
/* 2349 */                 CommandSetListenerOrientation(commandObject.floatArgs[0], commandObject.floatArgs[1], commandObject.floatArgs[2], commandObject.floatArgs[3], commandObject.floatArgs[4], commandObject.floatArgs[5]);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               case 36:
/* 2358 */                 CommandSetMasterVolume(commandObject.floatArgs[0]);
/*      */ 
/*      */               
/*      */               case 37:
/* 2362 */                 CommandNewLibrary(commandObject.classArgs[0]);
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */         } 
/* 2373 */         if (bool) {
/* 2374 */           this.soundLibrary.replaySources();
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 2379 */         while (this.sourcePlayList != null && this.sourcePlayList.size() > 0) {
/*      */ 
/*      */           
/* 2382 */           CommandObject commandObject = this.sourcePlayList.remove(0);
/* 2383 */           if (commandObject != null)
/*      */           {
/*      */             
/* 2386 */             switch (commandObject.Command) {
/*      */               
/*      */               case 21:
/* 2389 */                 CommandPlay(commandObject.stringArgs[0]);
/*      */               
/*      */               case 22:
/* 2392 */                 CommandFeedRawAudioData(commandObject.stringArgs[0], commandObject.buffer);
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */         } 
/* 2400 */         return (this.commandQueue != null && this.commandQueue.size() > 0);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2405 */       if (this.commandQueue == null) {
/* 2406 */         return false;
/*      */       }
/* 2408 */       this.commandQueue.add(paramCommandObject);
/*      */ 
/*      */       
/* 2411 */       return true;
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
/*      */   public void removeTemporarySources() {
/* 2423 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2425 */       if (this.soundLibrary != null) {
/* 2426 */         this.soundLibrary.removeTemporarySources();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean playing(String paramString) {
/* 2437 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2439 */       if (this.soundLibrary == null) {
/* 2440 */         return false;
/*      */       }
/* 2442 */       Source source = (Source)this.soundLibrary.getSources().get(paramString);
/*      */       
/* 2444 */       if (source == null) {
/* 2445 */         return false;
/*      */       }
/* 2447 */       return source.playing();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean playing() {
/* 2457 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2459 */       if (this.soundLibrary == null) {
/* 2460 */         return false;
/*      */       }
/* 2462 */       HashMap hashMap = this.soundLibrary.getSources();
/* 2463 */       if (hashMap == null) {
/* 2464 */         return false;
/*      */       }
/* 2466 */       Set set = hashMap.keySet();
/* 2467 */       Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */       
/* 2471 */       while (iterator.hasNext()) {
/*      */         
/* 2473 */         String str = iterator.next();
/* 2474 */         Source source = (Source)hashMap.get(str);
/* 2475 */         if (source != null && 
/* 2476 */           source.playing()) {
/* 2477 */           return true;
/*      */         }
/*      */       } 
/* 2480 */       return false;
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
/*      */   private HashMap copySources(HashMap paramHashMap) {
/* 2494 */     Set set = paramHashMap.keySet();
/* 2495 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2500 */     HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
/*      */ 
/*      */ 
/*      */     
/* 2504 */     while (iterator.hasNext()) {
/*      */       
/* 2506 */       String str = iterator.next();
/* 2507 */       Source source = (Source)paramHashMap.get(str);
/* 2508 */       if (source != null)
/* 2509 */         hashMap.put(str, new Source(source, null)); 
/*      */     } 
/* 2511 */     return hashMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean libraryCompatible(Class paramClass) {
/* 2522 */     SoundSystemLogger soundSystemLogger = SoundSystemConfig.getLogger();
/*      */     
/* 2524 */     if (soundSystemLogger == null) {
/*      */       
/* 2526 */       soundSystemLogger = new SoundSystemLogger();
/* 2527 */       SoundSystemConfig.setLogger(soundSystemLogger);
/*      */     } 
/* 2529 */     soundSystemLogger.message("", 0);
/* 2530 */     soundSystemLogger.message("Checking if " + SoundSystemConfig.getLibraryTitle(paramClass) + " is compatible...", 0);
/*      */ 
/*      */ 
/*      */     
/* 2534 */     boolean bool = SoundSystemConfig.libraryCompatible(paramClass);
/*      */     
/* 2536 */     if (bool) {
/* 2537 */       soundSystemLogger.message("...yes", 1);
/*      */     } else {
/* 2539 */       soundSystemLogger.message("...no", 1);
/*      */     } 
/* 2541 */     return bool;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Class currentLibrary() {
/* 2550 */     return currentLibrary(false, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean initialized() {
/* 2559 */     return initialized(false, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static SoundSystemException getLastException() {
/* 2568 */     return lastException(false, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setException(SoundSystemException paramSoundSystemException) {
/* 2578 */     lastException(true, paramSoundSystemException);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static boolean initialized(boolean paramBoolean1, boolean paramBoolean2) {
/* 2589 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2591 */       if (paramBoolean1 == true)
/* 2592 */         initialized = paramBoolean2; 
/* 2593 */       return initialized;
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
/*      */   private static Class currentLibrary(boolean paramBoolean, Class paramClass) {
/* 2606 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2608 */       if (paramBoolean == true)
/* 2609 */         currentLibrary = paramClass; 
/* 2610 */       return currentLibrary;
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
/*      */   private static SoundSystemException lastException(boolean paramBoolean, SoundSystemException paramSoundSystemException) {
/* 2624 */     synchronized (SoundSystemConfig.THREAD_SYNC) {
/*      */       
/* 2626 */       if (paramBoolean == true)
/* 2627 */         lastException = paramSoundSystemException; 
/* 2628 */       return lastException;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static void snooze(long paramLong) {
/*      */     try {
/* 2639 */       Thread.sleep(paramLong);
/*      */     }
/* 2641 */     catch (InterruptedException interruptedException) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void message(String paramString, int paramInt) {
/* 2651 */     this.logger.message(paramString, paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void importantMessage(String paramString, int paramInt) {
/* 2661 */     this.logger.importantMessage(paramString, paramInt);
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
/*      */   protected boolean errorCheck(boolean paramBoolean, String paramString, int paramInt) {
/* 2673 */     return this.logger.errorCheck(paramBoolean, this.className, paramString, paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void errorMessage(String paramString, int paramInt) {
/* 2683 */     this.logger.errorMessage(this.className, paramString, paramInt);
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\SoundSystem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */