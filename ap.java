/*    */ 
/*    */ 
/*    */ 
/*    */ public class ap
/*    */   extends y
/*    */ {
/*  7 */   protected float[] f = new float[256];
/*  8 */   protected float[] g = new float[256];
/*  9 */   protected float[] h = new float[256];
/* 10 */   protected float[] i = new float[256];
/*    */ 
/*    */   
/*    */   public ap() {
/* 14 */     super(ln.C.aZ);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 19 */     for (byte b1 = 0; b1 < 16; b1++) {
/* 20 */       for (byte b = 0; b < 16; b++) {
/*    */         
/* 22 */         float f = 0.0F;
/* 23 */         int i = (int)(ei.a(b * 3.1415927F * 2.0F / 16.0F) * 1.2F);
/* 24 */         int j = (int)(ei.a(b1 * 3.1415927F * 2.0F / 16.0F) * 1.2F);
/* 25 */         for (int k = b1 - 1; k <= b1 + 1; k++) {
/* 26 */           for (int m = b - 1; m <= b + 1; m++) {
/*    */             
/* 28 */             int n = k + i & 0xF;
/* 29 */             int i1 = m + j & 0xF;
/* 30 */             f += this.f[n + i1 * 16];
/*    */           } 
/* 32 */         }  this.g[b1 + b * 16] = f / 10.0F + (this.h[(b1 + 0 & 0xF) + (b + 0 & 0xF) * 16] + this.h[(b1 + 1 & 0xF) + (b + 0 & 0xF) * 16] + this.h[(b1 + 1 & 0xF) + (b + 1 & 0xF) * 16] + this.h[(b1 + 0 & 0xF) + (b + 1 & 0xF) * 16]) / 4.0F * 0.8F;
/*    */         
/* 34 */         this.h[b1 + b * 16] = this.h[b1 + b * 16] + this.i[b1 + b * 16] * 0.01F;
/*    */         
/* 36 */         if (this.h[b1 + b * 16] < 0.0F) this.h[b1 + b * 16] = 0.0F; 
/* 37 */         this.i[b1 + b * 16] = this.i[b1 + b * 16] - 0.06F;
/* 38 */         if (Math.random() < 0.005D)
/*    */         {
/* 40 */           this.i[b1 + b * 16] = 1.5F; } 
/*    */       } 
/*    */     } 
/* 43 */     float[] arrayOfFloat = this.g;
/* 44 */     this.g = this.f;
/* 45 */     this.f = arrayOfFloat;
/*    */     
/* 47 */     for (byte b2 = 0; b2 < 'Ā'; b2++) {
/*    */       
/* 49 */       float f1 = this.f[b2] * 2.0F;
/* 50 */       if (f1 > 1.0F) f1 = 1.0F; 
/* 51 */       if (f1 < 0.0F) f1 = 0.0F;
/*    */       
/* 53 */       float f2 = f1;
/* 54 */       int i = (int)(f2 * 100.0F + 155.0F);
/* 55 */       int j = (int)(f2 * f2 * 255.0F);
/* 56 */       int k = (int)(f2 * f2 * f2 * f2 * 128.0F);
/*    */       
/* 58 */       if (this.c) {
/*    */         
/* 60 */         int m = (i * 30 + j * 59 + k * 11) / 100;
/* 61 */         int n = (i * 30 + j * 70) / 100;
/* 62 */         int i1 = (i * 30 + k * 70) / 100;
/*    */         
/* 64 */         i = m;
/* 65 */         j = n;
/* 66 */         k = i1;
/*    */       } 
/*    */       
/* 69 */       this.a[b2 * 4 + 0] = (byte)i;
/* 70 */       this.a[b2 * 4 + 1] = (byte)j;
/* 71 */       this.a[b2 * 4 + 2] = (byte)k;
/* 72 */       this.a[b2 * 4 + 3] = -1;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */