/*     */ package paulscode.sound;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Channel
/*     */ {
/*  52 */   protected Class libraryType = Library.class;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int channelType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SoundSystemLogger logger;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   public Source attachedSource = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Channel(int paramInt) {
/*  81 */     this.logger = SoundSystemConfig.getLogger();
/*     */     
/*  83 */     this.channelType = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanup() {
/*  91 */     this.logger = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean preLoadBuffers(LinkedList paramLinkedList) {
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean queueBuffer(byte[] paramArrayOfbyte) {
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int feedRawAudioData(byte[] paramArrayOfbyte) {
/* 121 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int buffersProcessed() {
/* 130 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean processBuffer() {
/* 140 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAudioFormat(AudioFormat paramAudioFormat) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void flush() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void play() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void pause() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void rewind() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean playing() {
/* 196 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClassName() {
/* 205 */     String str = SoundSystemConfig.getLibraryTitle(this.libraryType);
/*     */     
/* 207 */     if (str.equals("No Sound")) {
/* 208 */       return "Channel";
/*     */     }
/* 210 */     return "Channel" + str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void message(String paramString) {
/* 219 */     this.logger.message(paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void importantMessage(String paramString) {
/* 228 */     this.logger.importantMessage(paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean errorCheck(boolean paramBoolean, String paramString) {
/* 239 */     return this.logger.errorCheck(paramBoolean, getClassName(), paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void errorMessage(String paramString) {
/* 248 */     this.logger.errorMessage(getClassName(), paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void printStackTrace(Exception paramException) {
/* 257 */     this.logger.printStackTrace(paramException, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\Channel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */