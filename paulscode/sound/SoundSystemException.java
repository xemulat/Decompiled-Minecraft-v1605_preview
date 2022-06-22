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
/*     */ public class SoundSystemException
/*     */   extends Exception
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   public static final int ERROR_NONE = 0;
/*     */   public static final int UNKNOWN_ERROR = 1;
/*     */   public static final int NULL_PARAMETER = 2;
/*     */   public static final int CLASS_TYPE_MISMATCH = 3;
/*     */   public static final int LIBRARY_NULL = 4;
/*     */   public static final int LIBRARY_TYPE = 5;
/*     */   public static final int OPENAL_CREATE = 6;
/*     */   public static final int OPENAL_INVALID_NAME = 7;
/*     */   public static final int OPENAL_INVALID_ENUM = 8;
/*     */   public static final int OPENAL_INVALID_VALUE = 9;
/*     */   public static final int OPENAL_INVALID_OPERATION = 10;
/*     */   public static final int OPENAL_OUT_OF_MEMORY = 11;
/*     */   public static final int OPENAL_LISTENER = 12;
/*     */   public static final int OPENAL_NO_AL_PITCH = 13;
/*     */   public static final int JAVASOUND_MIXER_NOT_FOUND = 14;
/*     */   public static final int JAVASOUND_MIXER_NO_GAIN_CONTROL = 15;
/*     */   public static final int JAVASOUND_MIXER_NO_PAN_CONTROL = 16;
/*     */   public static final int JAVASOUND_MIXER_NO_SAMPLE_RATE_CONTROL = 17;
/* 122 */   private int myType = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SoundSystemException(String paramString) {
/* 129 */     super(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SoundSystemException(String paramString, int paramInt) {
/* 139 */     super(paramString);
/* 140 */     this.myType = paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getType() {
/* 145 */     return this.myType;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\SoundSystemException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */