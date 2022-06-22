/*     */ package paulscode.sound;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CommandObject
/*     */ {
/*     */   public static final int INITIALIZE = 1;
/*     */   public static final int LOAD_SOUND = 2;
/*     */   public static final int UNLOAD_SOUND = 4;
/*     */   public static final int QUEUE_SOUND = 5;
/*     */   public static final int DEQUEUE_SOUND = 6;
/*     */   public static final int FADE_OUT = 7;
/*     */   public static final int FADE_OUT_IN = 8;
/*     */   public static final int CHECK_FADE_VOLUMES = 9;
/*     */   public static final int NEW_SOURCE = 10;
/*     */   public static final int RAW_DATA_STREAM = 11;
/*     */   public static final int QUICK_PLAY = 12;
/*     */   public static final int SET_POSITION = 13;
/*     */   public static final int SET_VOLUME = 14;
/*     */   public static final int SET_PITCH = 15;
/*     */   public static final int SET_PRIORITY = 16;
/*     */   public static final int SET_LOOPING = 17;
/*     */   public static final int SET_ATTENUATION = 18;
/*     */   public static final int SET_DIST_OR_ROLL = 19;
/*     */   public static final int PLAY = 21;
/*     */   public static final int FEED_RAW_AUDIO_DATA = 22;
/*     */   public static final int PAUSE = 23;
/*     */   public static final int STOP = 24;
/*     */   public static final int REWIND = 25;
/*     */   public static final int FLUSH = 26;
/*     */   public static final int CULL = 27;
/*     */   public static final int ACTIVATE = 28;
/*     */   public static final int SET_TEMPORARY = 29;
/*     */   public static final int REMOVE_SOURCE = 30;
/*     */   public static final int MOVE_LISTENER = 31;
/*     */   public static final int SET_LISTENER_POSITION = 32;
/*     */   public static final int TURN_LISTENER = 33;
/*     */   public static final int SET_LISTENER_ANGLE = 34;
/*     */   public static final int SET_LISTENER_ORIENTATION = 35;
/*     */   public static final int SET_MASTER_VOLUME = 36;
/*     */   public static final int NEW_LIBRARY = 37;
/*     */   public byte[] buffer;
/*     */   public int[] intArgs;
/*     */   public float[] floatArgs;
/*     */   public long[] longArgs;
/*     */   public boolean[] boolArgs;
/*     */   public String[] stringArgs;
/*     */   public Class[] classArgs;
/*     */   public Object[] objectArgs;
/*     */   public int Command;
/*     */   
/*     */   public CommandObject(int paramInt) {
/* 233 */     this.Command = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt1, int paramInt2) {
/* 242 */     this.Command = paramInt1;
/* 243 */     this.intArgs = new int[1];
/* 244 */     this.intArgs[0] = paramInt2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, Class paramClass) {
/* 254 */     this.Command = paramInt;
/* 255 */     this.classArgs = new Class[1];
/* 256 */     this.classArgs[0] = paramClass;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, float paramFloat) {
/* 265 */     this.Command = paramInt;
/* 266 */     this.floatArgs = new float[1];
/* 267 */     this.floatArgs[0] = paramFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, String paramString) {
/* 276 */     this.Command = paramInt;
/* 277 */     this.stringArgs = new String[1];
/* 278 */     this.stringArgs[0] = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, Object paramObject) {
/* 287 */     this.Command = paramInt;
/* 288 */     this.objectArgs = new Object[1];
/* 289 */     this.objectArgs[0] = paramObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, String paramString, Object paramObject) {
/* 300 */     this.Command = paramInt;
/* 301 */     this.stringArgs = new String[1];
/* 302 */     this.stringArgs[0] = paramString;
/* 303 */     this.objectArgs = new Object[1];
/* 304 */     this.objectArgs[0] = paramObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, String paramString, byte[] paramArrayOfbyte) {
/* 315 */     this.Command = paramInt;
/* 316 */     this.stringArgs = new String[1];
/* 317 */     this.stringArgs[0] = paramString;
/* 318 */     this.buffer = paramArrayOfbyte;
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
/*     */   public CommandObject(int paramInt, String paramString, Object paramObject, long paramLong) {
/* 330 */     this.Command = paramInt;
/* 331 */     this.stringArgs = new String[1];
/* 332 */     this.stringArgs[0] = paramString;
/* 333 */     this.objectArgs = new Object[1];
/* 334 */     this.objectArgs[0] = paramObject;
/* 335 */     this.longArgs = new long[1];
/* 336 */     this.longArgs[0] = paramLong;
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
/*     */   public CommandObject(int paramInt, String paramString, Object paramObject, long paramLong1, long paramLong2) {
/* 349 */     this.Command = paramInt;
/* 350 */     this.stringArgs = new String[1];
/* 351 */     this.stringArgs[0] = paramString;
/* 352 */     this.objectArgs = new Object[1];
/* 353 */     this.objectArgs[0] = paramObject;
/* 354 */     this.longArgs = new long[2];
/* 355 */     this.longArgs[0] = paramLong1;
/* 356 */     this.longArgs[1] = paramLong2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, String paramString1, String paramString2) {
/* 366 */     this.Command = paramInt;
/* 367 */     this.stringArgs = new String[2];
/* 368 */     this.stringArgs[0] = paramString1;
/* 369 */     this.stringArgs[1] = paramString2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt1, String paramString, int paramInt2) {
/* 380 */     this.Command = paramInt1;
/* 381 */     this.intArgs = new int[1];
/* 382 */     this.stringArgs = new String[1];
/* 383 */     this.intArgs[0] = paramInt2;
/* 384 */     this.stringArgs[0] = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, String paramString, float paramFloat) {
/* 395 */     this.Command = paramInt;
/* 396 */     this.floatArgs = new float[1];
/* 397 */     this.stringArgs = new String[1];
/* 398 */     this.floatArgs[0] = paramFloat;
/* 399 */     this.stringArgs[0] = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, String paramString, boolean paramBoolean) {
/* 410 */     this.Command = paramInt;
/* 411 */     this.boolArgs = new boolean[1];
/* 412 */     this.stringArgs = new String[1];
/* 413 */     this.boolArgs[0] = paramBoolean;
/* 414 */     this.stringArgs[0] = paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandObject(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 425 */     this.Command = paramInt;
/* 426 */     this.floatArgs = new float[3];
/* 427 */     this.floatArgs[0] = paramFloat1;
/* 428 */     this.floatArgs[1] = paramFloat2;
/* 429 */     this.floatArgs[2] = paramFloat3;
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
/*     */   public CommandObject(int paramInt, String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 442 */     this.Command = paramInt;
/* 443 */     this.floatArgs = new float[3];
/* 444 */     this.stringArgs = new String[1];
/* 445 */     this.floatArgs[0] = paramFloat1;
/* 446 */     this.floatArgs[1] = paramFloat2;
/* 447 */     this.floatArgs[2] = paramFloat3;
/* 448 */     this.stringArgs[0] = paramString;
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
/*     */   public CommandObject(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 463 */     this.Command = paramInt;
/* 464 */     this.floatArgs = new float[6];
/* 465 */     this.floatArgs[0] = paramFloat1;
/* 466 */     this.floatArgs[1] = paramFloat2;
/* 467 */     this.floatArgs[2] = paramFloat3;
/* 468 */     this.floatArgs[3] = paramFloat4;
/* 469 */     this.floatArgs[4] = paramFloat5;
/* 470 */     this.floatArgs[5] = paramFloat6;
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
/*     */   public CommandObject(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Object paramObject, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4) {
/* 492 */     this.Command = paramInt1;
/* 493 */     this.intArgs = new int[1];
/* 494 */     this.floatArgs = new float[4];
/* 495 */     this.boolArgs = new boolean[3];
/* 496 */     this.stringArgs = new String[1];
/* 497 */     this.objectArgs = new Object[1];
/* 498 */     this.intArgs[0] = paramInt2;
/* 499 */     this.floatArgs[0] = paramFloat1;
/* 500 */     this.floatArgs[1] = paramFloat2;
/* 501 */     this.floatArgs[2] = paramFloat3;
/* 502 */     this.floatArgs[3] = paramFloat4;
/* 503 */     this.boolArgs[0] = paramBoolean1;
/* 504 */     this.boolArgs[1] = paramBoolean2;
/* 505 */     this.boolArgs[2] = paramBoolean3;
/* 506 */     this.stringArgs[0] = paramString;
/* 507 */     this.objectArgs[0] = paramObject;
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
/*     */   public CommandObject(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Object paramObject, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4, boolean paramBoolean4) {
/* 531 */     this.Command = paramInt1;
/* 532 */     this.intArgs = new int[1];
/* 533 */     this.floatArgs = new float[4];
/* 534 */     this.boolArgs = new boolean[4];
/* 535 */     this.stringArgs = new String[1];
/* 536 */     this.objectArgs = new Object[1];
/* 537 */     this.intArgs[0] = paramInt2;
/* 538 */     this.floatArgs[0] = paramFloat1;
/* 539 */     this.floatArgs[1] = paramFloat2;
/* 540 */     this.floatArgs[2] = paramFloat3;
/* 541 */     this.floatArgs[3] = paramFloat4;
/* 542 */     this.boolArgs[0] = paramBoolean1;
/* 543 */     this.boolArgs[1] = paramBoolean2;
/* 544 */     this.boolArgs[2] = paramBoolean3;
/* 545 */     this.boolArgs[3] = paramBoolean4;
/* 546 */     this.stringArgs[0] = paramString;
/* 547 */     this.objectArgs[0] = paramObject;
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
/*     */   public CommandObject(int paramInt1, Object paramObject, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4) {
/* 569 */     this.Command = paramInt1;
/* 570 */     this.intArgs = new int[1];
/* 571 */     this.floatArgs = new float[4];
/* 572 */     this.boolArgs = new boolean[1];
/* 573 */     this.stringArgs = new String[1];
/* 574 */     this.objectArgs = new Object[1];
/* 575 */     this.intArgs[0] = paramInt2;
/* 576 */     this.floatArgs[0] = paramFloat1;
/* 577 */     this.floatArgs[1] = paramFloat2;
/* 578 */     this.floatArgs[2] = paramFloat3;
/* 579 */     this.floatArgs[3] = paramFloat4;
/* 580 */     this.boolArgs[0] = paramBoolean;
/* 581 */     this.stringArgs[0] = paramString;
/* 582 */     this.objectArgs[0] = paramObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\CommandObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */