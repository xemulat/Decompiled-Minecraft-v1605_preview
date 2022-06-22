/*     */ package paulscode.sound;
/*     */ 
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.LinkedList;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SoundSystemConfig
/*     */ {
/*  56 */   public static final Object THREAD_SYNC = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_NORMAL = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int TYPE_STREAMING = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ATTENUATION_NONE = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ATTENUATION_ROLLOFF = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ATTENUATION_LINEAR = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String EXTENSION_MIDI = ".*[mM][iI][dD][iI]?$";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String PREFIX_URL = "^[hH][tT][tT][pP]://.*";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 113 */   private static SoundSystemLogger logger = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static LinkedList libraries;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 123 */   private static LinkedList codecs = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 130 */   private static int numberNormalChannels = 28;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 136 */   private static int numberStreamingChannels = 4;
/*     */ 
/*     */ 
/*     */   
/* 140 */   private static float masterGain = 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 145 */   private static int defaultAttenuationModel = 1;
/*     */ 
/*     */ 
/*     */   
/* 149 */   private static float defaultRolloffFactor = 0.03F;
/*     */ 
/*     */ 
/*     */   
/* 153 */   private static float defaultFadeDistance = 1000.0F;
/*     */ 
/*     */ 
/*     */   
/* 157 */   private static String soundFilesPackage = "Sounds/";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   private static int streamingBufferSize = 131072;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 167 */   private static int numberStreamingBuffers = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 173 */   private static int maxFileSize = 268435456;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 178 */   private static int fileChunkSize = 1048576;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean midiCodec = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void addLibrary(Class<?> paramClass) {
/* 200 */     if (paramClass == null) {
/* 201 */       throw new SoundSystemException("Parameter null in method 'addLibrary'", 2);
/*     */     }
/*     */     
/* 204 */     if (!Library.class.isAssignableFrom(paramClass)) {
/* 205 */       throw new SoundSystemException("The specified class does not extend class 'Library' in method 'addLibrary'");
/*     */     }
/*     */     
/* 208 */     if (libraries == null) {
/* 209 */       libraries = new LinkedList();
/*     */     }
/* 211 */     if (!libraries.contains(paramClass)) {
/* 212 */       libraries.add(paramClass);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void removeLibrary(Class paramClass) {
/* 222 */     if (libraries == null || paramClass == null) {
/*     */       return;
/*     */     }
/* 225 */     libraries.remove(paramClass);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LinkedList getLibraries() {
/* 234 */     return libraries;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean libraryCompatible(Class<?> paramClass) {
/* 244 */     if (paramClass == null) {
/*     */       
/* 246 */       errorMessage("Parameter 'libraryClass' null in method'librayCompatible'");
/*     */       
/* 248 */       return false;
/*     */     } 
/* 250 */     if (!Library.class.isAssignableFrom(paramClass)) {
/*     */       
/* 252 */       errorMessage("The specified class does not extend class 'Library' in method 'libraryCompatible'");
/*     */       
/* 254 */       return false;
/*     */     } 
/*     */     
/* 257 */     Object object = runMethod(paramClass, "libraryCompatible", new Class[0], new Object[0]);
/*     */ 
/*     */     
/* 260 */     if (object == null) {
/*     */       
/* 262 */       errorMessage("Method 'Library.libraryCompatible' returned 'null' in method 'libraryCompatible'");
/*     */       
/* 264 */       return false;
/*     */     } 
/*     */     
/* 267 */     return ((Boolean)object).booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getLibraryTitle(Class<?> paramClass) {
/* 277 */     if (paramClass == null) {
/*     */       
/* 279 */       errorMessage("Parameter 'libraryClass' null in method'getLibrayTitle'");
/*     */       
/* 281 */       return null;
/*     */     } 
/* 283 */     if (!Library.class.isAssignableFrom(paramClass)) {
/*     */       
/* 285 */       errorMessage("The specified class does not extend class 'Library' in method 'getLibraryTitle'");
/*     */       
/* 287 */       return null;
/*     */     } 
/*     */     
/* 290 */     Object object = runMethod(paramClass, "getTitle", new Class[0], new Object[0]);
/*     */     
/* 292 */     if (object == null) {
/*     */       
/* 294 */       errorMessage("Method 'Library.getTitle' returned 'null' in method 'getLibraryTitle'");
/*     */       
/* 296 */       return null;
/*     */     } 
/*     */     
/* 299 */     return (String)object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getLibraryDescription(Class<?> paramClass) {
/* 309 */     if (paramClass == null) {
/*     */       
/* 311 */       errorMessage("Parameter 'libraryClass' null in method'getLibrayDescription'");
/*     */       
/* 313 */       return null;
/*     */     } 
/* 315 */     if (!Library.class.isAssignableFrom(paramClass)) {
/*     */       
/* 317 */       errorMessage("The specified class does not extend class 'Library' in method 'getLibraryDescription'");
/*     */       
/* 319 */       return null;
/*     */     } 
/*     */     
/* 322 */     Object object = runMethod(paramClass, "getDescription", new Class[0], new Object[0]);
/*     */     
/* 324 */     if (object == null) {
/*     */       
/* 326 */       errorMessage("Method 'Library.getDescription' returned 'null' in method 'getLibraryDescription'");
/*     */       
/* 328 */       return null;
/*     */     } 
/*     */     
/* 331 */     return (String)object;
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
/*     */   public static void setLogger(SoundSystemLogger paramSoundSystemLogger) {
/* 357 */     logger = paramSoundSystemLogger;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SoundSystemLogger getLogger() {
/* 365 */     return logger;
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
/*     */   public static synchronized void setNumberNormalChannels(int paramInt) {
/* 382 */     numberNormalChannels = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getNumberNormalChannels() {
/* 392 */     return numberNormalChannels;
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
/*     */   public static synchronized void setNumberStreamingChannels(int paramInt) {
/* 407 */     numberStreamingChannels = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getNumberStreamingChannels() {
/* 416 */     return numberStreamingChannels;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setMasterGain(float paramFloat) {
/* 425 */     masterGain = paramFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized float getMasterGain() {
/* 434 */     return masterGain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setDefaultAttenuation(int paramInt) {
/* 444 */     defaultAttenuationModel = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getDefaultAttenuation() {
/* 452 */     return defaultAttenuationModel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setDefaultRolloff(float paramFloat) {
/* 460 */     defaultRolloffFactor = paramFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized float getDefaultRolloff() {
/* 468 */     return defaultRolloffFactor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setDefaultFadeDistance(float paramFloat) {
/* 476 */     defaultFadeDistance = paramFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized float getDefaultFadeDistance() {
/* 484 */     return defaultFadeDistance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setSoundFilesPackage(String paramString) {
/* 492 */     soundFilesPackage = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized String getSoundFilesPackage() {
/* 500 */     return soundFilesPackage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setStreamingBufferSize(int paramInt) {
/* 508 */     streamingBufferSize = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getStreamingBufferSize() {
/* 516 */     return streamingBufferSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setNumberStreamingBuffers(int paramInt) {
/* 526 */     numberStreamingBuffers = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getNumberStreamingBuffers() {
/* 534 */     return numberStreamingBuffers;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setMaxFileSize(int paramInt) {
/* 544 */     maxFileSize = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getMaxFileSize() {
/* 552 */     return maxFileSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void setFileChunkSize(int paramInt) {
/* 561 */     fileChunkSize = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized int getFileChunkSize() {
/* 570 */     return fileChunkSize;
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
/*     */   public static synchronized void setCodec(String paramString, Class<?> paramClass) {
/* 582 */     if (paramString == null) {
/* 583 */       throw new SoundSystemException("Parameter 'extension' null in method 'setCodec'.", 2);
/*     */     }
/*     */     
/* 586 */     if (paramClass == null) {
/* 587 */       throw new SoundSystemException("Parameter 'iCodecClass' null in method 'setCodec'.", 2);
/*     */     }
/*     */     
/* 590 */     if (!ICodec.class.isAssignableFrom(paramClass)) {
/* 591 */       throw new SoundSystemException("The specified class does not implement interface 'ICodec' in method 'setCodec'", 3);
/*     */     }
/*     */ 
/*     */     
/* 595 */     if (codecs == null) {
/* 596 */       codecs = new LinkedList();
/*     */     }
/* 598 */     ListIterator<SoundSystemConfig$Codec> listIterator = codecs.listIterator();
/*     */ 
/*     */     
/* 601 */     while (listIterator.hasNext()) {
/*     */       
/* 603 */       SoundSystemConfig$Codec soundSystemConfig$Codec = listIterator.next();
/* 604 */       if (paramString.matches(soundSystemConfig$Codec.extensionRegX))
/* 605 */         listIterator.remove(); 
/*     */     } 
/* 607 */     codecs.add(new SoundSystemConfig$Codec(paramString, paramClass));
/*     */ 
/*     */ 
/*     */     
/* 611 */     if (paramString.matches(".*[mM][iI][dD][iI]?$")) {
/* 612 */       midiCodec = true;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized ICodec getCodec(String paramString) {
/* 622 */     if (codecs == null) {
/* 623 */       return null;
/*     */     }
/* 625 */     ListIterator<SoundSystemConfig$Codec> listIterator = codecs.listIterator();
/*     */ 
/*     */     
/* 628 */     while (listIterator.hasNext()) {
/*     */       
/* 630 */       SoundSystemConfig$Codec soundSystemConfig$Codec = listIterator.next();
/* 631 */       if (paramString.matches(soundSystemConfig$Codec.extensionRegX)) {
/* 632 */         return soundSystemConfig$Codec.getInstance();
/*     */       }
/*     */     } 
/* 635 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean midiCodec() {
/* 645 */     return midiCodec;
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
/*     */   private static void errorMessage(String paramString) {
/* 660 */     if (logger != null) {
/* 661 */       logger.errorMessage("SoundSystemConfig", paramString, 0);
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
/*     */   
/*     */   private static Object runMethod(Class paramClass, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject) {
/* 678 */     Method method = null;
/*     */     
/*     */     try {
/* 681 */       method = paramClass.getMethod(paramString, paramArrayOfClass);
/*     */     }
/* 683 */     catch (NoSuchMethodException noSuchMethodException) {
/*     */       
/* 685 */       errorMessage("NoSuchMethodException thrown when attempting to call method '" + paramString + "' in " + "method 'runMethod'");
/*     */ 
/*     */       
/* 688 */       return null;
/*     */     }
/* 690 */     catch (SecurityException securityException) {
/*     */       
/* 692 */       errorMessage("Access denied when attempting to call method '" + paramString + "' in method 'runMethod'");
/*     */       
/* 694 */       return null;
/*     */     }
/* 696 */     catch (NullPointerException nullPointerException) {
/*     */       
/* 698 */       errorMessage("NullPointerException thrown when attempting to call method '" + paramString + "' in " + "method 'runMethod'");
/*     */ 
/*     */       
/* 701 */       return null;
/*     */     } 
/* 703 */     if (method == null) {
/*     */       
/* 705 */       errorMessage("Method '" + paramString + "' not found for the class " + "specified in method 'runMethod'");
/*     */       
/* 707 */       return null;
/*     */     } 
/*     */     
/* 710 */     Object object = null;
/*     */     
/*     */     try {
/* 713 */       object = method.invoke(null, paramArrayOfObject);
/*     */     }
/* 715 */     catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 717 */       errorMessage("IllegalAccessException thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
/*     */ 
/*     */       
/* 720 */       return null;
/*     */     }
/* 722 */     catch (IllegalArgumentException illegalArgumentException) {
/*     */       
/* 724 */       errorMessage("IllegalArgumentException thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
/*     */ 
/*     */       
/* 727 */       return null;
/*     */     }
/* 729 */     catch (InvocationTargetException invocationTargetException) {
/*     */       
/* 731 */       errorMessage("InvocationTargetException thrown while attempting to invoke method 'Library.getTitle' in method 'getLibraryTitle'");
/*     */ 
/*     */       
/* 734 */       return null;
/*     */     }
/* 736 */     catch (NullPointerException nullPointerException) {
/*     */       
/* 738 */       errorMessage("NullPointerException thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
/*     */ 
/*     */       
/* 741 */       return null;
/*     */     }
/* 743 */     catch (ExceptionInInitializerError exceptionInInitializerError) {
/*     */       
/* 745 */       errorMessage("ExceptionInInitializerError thrown when attempting to invoke method '" + paramString + "' in " + "method 'runMethod'");
/*     */ 
/*     */       
/* 748 */       return null;
/*     */     } 
/*     */     
/* 751 */     return object;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\SoundSystemConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */