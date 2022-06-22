/*    */ 
/*    */ 
/*    */ public class hj
/*    */   extends y
/*    */ {
/*  6 */   protected float[] f = new float[256];
/*  7 */   protected float[] g = new float[256];
/*  8 */   protected float[] h = new float[256];
/*  9 */   protected float[] i = new float[256];
/*    */   
/* 11 */   private int j = 0;
/*    */   
/*    */   public hj() {
/* 14 */     super(ln.A.aZ + 1);
/* 15 */     this.e = 2;
/*    */   }
/*    */   
/*    */   public void a() {
/* 19 */     this.j++; byte b1;
/* 20 */     for (b1 = 0; b1 < 16; b1++) {
/* 21 */       for (byte b = 0; b < 16; b++) {
/* 22 */         float f = 0.0F;
/* 23 */         for (int i = b - 2; i <= b; i++) {
/* 24 */           int j = b1 & 0xF;
/* 25 */           int k = i & 0xF;
/* 26 */           f += this.f[j + k * 16];
/*    */         } 
/* 28 */         this.g[b1 + b * 16] = f / 3.2F + this.h[b1 + b * 16] * 0.8F;
/*    */       } 
/*    */     } 
/* 31 */     for (b1 = 0; b1 < 16; b1++) {
/* 32 */       for (byte b = 0; b < 16; b++) {
/* 33 */         this.h[b1 + b * 16] = this.h[b1 + b * 16] + this.i[b1 + b * 16] * 0.05F;
/*    */         
/* 35 */         if (this.h[b1 + b * 16] < 0.0F) this.h[b1 + b * 16] = 0.0F; 
/* 36 */         this.i[b1 + b * 16] = this.i[b1 + b * 16] - 0.3F;
/* 37 */         if (Math.random() < 0.2D)
/* 38 */           this.i[b1 + b * 16] = 0.5F; 
/*    */       } 
/*    */     } 
/* 41 */     float[] arrayOfFloat = this.g;
/* 42 */     this.g = this.f;
/* 43 */     this.f = arrayOfFloat;
/*    */     
/* 45 */     for (byte b2 = 0; b2 < 'Ā'; b2++) {
/* 46 */       float f1 = this.f[b2 - this.j * 16 & 0xFF];
/* 47 */       if (f1 > 1.0F) f1 = 1.0F; 
/* 48 */       if (f1 < 0.0F) f1 = 0.0F;
/*    */       
/* 50 */       float f2 = f1 * f1;
/*    */       
/* 52 */       int i = (int)(32.0F + f2 * 32.0F);
/* 53 */       int j = (int)(50.0F + f2 * 64.0F);
/* 54 */       int k = 255;
/* 55 */       int m = (int)(146.0F + f2 * 50.0F);
/*    */       
/* 57 */       if (this.c) {
/* 58 */         int n = (i * 30 + j * 59 + k * 11) / 100;
/* 59 */         int i1 = (i * 30 + j * 70) / 100;
/* 60 */         int i2 = (i * 30 + k * 70) / 100;
/*    */         
/* 62 */         i = n;
/* 63 */         j = i1;
/* 64 */         k = i2;
/*    */       } 
/*    */       
/* 67 */       this.a[b2 * 4 + 0] = (byte)i;
/* 68 */       this.a[b2 * 4 + 1] = (byte)j;
/* 69 */       this.a[b2 * 4 + 2] = (byte)k;
/* 70 */       this.a[b2 * 4 + 3] = (byte)m;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */