/*    */ package paulscode.sound;
/*    */ 
/*    */ import javax.sound.sampled.AudioFormat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SoundBuffer
/*    */ {
/*    */   public byte[] audioData;
/*    */   public AudioFormat audioFormat;
/*    */   
/*    */   public SoundBuffer(byte[] paramArrayOfbyte, AudioFormat paramAudioFormat) {
/* 60 */     this.audioData = paramArrayOfbyte;
/* 61 */     this.audioFormat = paramAudioFormat;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void cleanup() {
/* 69 */     this.audioData = null;
/* 70 */     this.audioFormat = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void trimData(int paramInt) {
/* 81 */     if (this.audioData == null || paramInt == 0) {
/* 82 */       this.audioData = null;
/* 83 */     } else if (this.audioData.length > paramInt) {
/*    */       
/* 85 */       byte[] arrayOfByte = new byte[paramInt];
/* 86 */       System.arraycopy(this.audioData, 0, arrayOfByte, 0, paramInt);
/*    */       
/* 88 */       this.audioData = arrayOfByte;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\SoundBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */