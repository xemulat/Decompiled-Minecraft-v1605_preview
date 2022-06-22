/*    */ 
/*    */ 
/*    */ public class mb
/*    */   extends y
/*    */ {
/*  6 */   protected float[] f = new float[256];
/*  7 */   protected float[] g = new float[256];
/*  8 */   protected float[] h = new float[256];
/*  9 */   protected float[] i = new float[256];
/*    */   
/* 11 */   private int j = 0;
/*    */   
/*    */   public mb() {
/* 14 */     super(ln.A.aZ);
/*    */   }
/*    */   
/*    */   public void a() {
/* 18 */     this.j++; byte b1;
/* 19 */     for (b1 = 0; b1 < 16; b1++) {
/* 20 */       for (byte b = 0; b < 16; b++) {
/* 21 */         float f = 0.0F;
/* 22 */         for (int i = b1 - 1; i <= b1 + 1; i++) {
/* 23 */           int j = i & 0xF;
/* 24 */           int k = b & 0xF;
/* 25 */           f += this.f[j + k * 16];
/*    */         } 
/* 27 */         this.g[b1 + b * 16] = f / 3.3F + this.h[b1 + b * 16] * 0.8F;
/*    */       } 
/*    */     } 
/* 30 */     for (b1 = 0; b1 < 16; b1++) {
/* 31 */       for (byte b = 0; b < 16; b++) {
/* 32 */         this.h[b1 + b * 16] = this.h[b1 + b * 16] + this.i[b1 + b * 16] * 0.05F;
/*    */         
/* 34 */         if (this.h[b1 + b * 16] < 0.0F) this.h[b1 + b * 16] = 0.0F; 
/* 35 */         this.i[b1 + b * 16] = this.i[b1 + b * 16] - 0.1F;
/* 36 */         if (Math.random() < 0.05D)
/* 37 */           this.i[b1 + b * 16] = 0.5F; 
/*    */       } 
/*    */     } 
/* 40 */     float[] arrayOfFloat = this.g;
/* 41 */     this.g = this.f;
/* 42 */     this.f = arrayOfFloat;
/*    */     
/* 44 */     for (byte b2 = 0; b2 < 'Ā'; b2++) {
/* 45 */       float f1 = this.f[b2];
/* 46 */       if (f1 > 1.0F) f1 = 1.0F; 
/* 47 */       if (f1 < 0.0F) f1 = 0.0F;
/*    */       
/* 49 */       float f2 = f1 * f1;
/*    */       
/* 51 */       int i = (int)(32.0F + f2 * 32.0F);
/* 52 */       int j = (int)(50.0F + f2 * 64.0F);
/* 53 */       int k = 255;
/* 54 */       int m = (int)(146.0F + f2 * 50.0F);
/*    */       
/* 56 */       if (this.c) {
/* 57 */         int n = (i * 30 + j * 59 + k * 11) / 100;
/* 58 */         int i1 = (i * 30 + j * 70) / 100;
/* 59 */         int i2 = (i * 30 + k * 70) / 100;
/*    */         
/* 61 */         i = n;
/* 62 */         j = i1;
/* 63 */         k = i2;
/*    */       } 
/*    */       
/* 66 */       this.a[b2 * 4 + 0] = (byte)i;
/* 67 */       this.a[b2 * 4 + 1] = (byte)j;
/* 68 */       this.a[b2 * 4 + 2] = (byte)k;
/* 69 */       this.a[b2 * 4 + 3] = (byte)m;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */