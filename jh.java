/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.DataBufferInt;
/*    */ 
/*    */ public class jh implements gr {
/*    */   private int[] a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public BufferedImage a(BufferedImage paramBufferedImage) {
/* 11 */     if (paramBufferedImage == null) return null;
/*    */     
/* 13 */     this.b = 64;
/* 14 */     this.c = 32;
/*    */     
/* 16 */     BufferedImage bufferedImage = new BufferedImage(this.b, this.c, 2);
/* 17 */     Graphics graphics = bufferedImage.getGraphics();
/* 18 */     graphics.drawImage(paramBufferedImage, 0, 0, null);
/* 19 */     graphics.dispose();
/*    */     
/* 21 */     this.a = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
/*    */     
/* 23 */     b(0, 0, 32, 16);
/* 24 */     a(32, 0, 64, 32);
/* 25 */     b(0, 16, 64, 32);
/* 26 */     boolean bool = false; byte b;
/* 27 */     for (b = 32; b < 64; b++) {
/* 28 */       for (byte b1 = 0; b1 < 16; b1++) {
/* 29 */         int i = this.a[b + b1 * 64];
/* 30 */         if ((i >> 24 & 0xFF) < 128) bool = true; 
/*    */       } 
/*    */     } 
/* 33 */     if (!bool)
/* 34 */       for (b = 32; b < 64; b++) {
/* 35 */         for (byte b1 = 0; b1 < 16; b1++) {
/* 36 */           int i = this.a[b + b1 * 64];
/* 37 */           if ((i >> 24 & 0xFF) < 128) bool = true;
/*    */         
/*    */         } 
/*    */       }  
/* 41 */     return bufferedImage;
/*    */   }
/*    */   
/*    */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 45 */     if (c(paramInt1, paramInt2, paramInt3, paramInt4))
/*    */       return; 
/* 47 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 48 */       for (int j = paramInt2; j < paramInt4; j++)
/* 49 */         this.a[i + j * this.b] = this.a[i + j * this.b] & 0xFFFFFF; 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 54 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 55 */       for (int j = paramInt2; j < paramInt4; j++)
/* 56 */         this.a[i + j * this.b] = this.a[i + j * this.b] | 0xFF000000; 
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 61 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 62 */       for (int j = paramInt2; j < paramInt4; j++) {
/* 63 */         int k = this.a[i + j * this.b];
/* 64 */         if ((k >> 24 & 0xFF) < 128) return true; 
/*    */       } 
/* 66 */     }  return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */