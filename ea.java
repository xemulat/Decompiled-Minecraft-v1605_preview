/*    */ 
/*    */ 
/*    */ public class ea
/*    */   extends y
/*    */ {
/*  6 */   protected float[] f = new float[256];
/*  7 */   protected float[] g = new float[256];
/*  8 */   protected float[] h = new float[256];
/*  9 */   protected float[] i = new float[256];
/* 10 */   int j = 0;
/*    */   
/*    */   public ea() {
/* 13 */     super(ln.C.aZ + 1);
/* 14 */     this.e = 2;
/*    */   }
/*    */   
/*    */   public void a() {
/* 18 */     this.j++;
/* 19 */     for (byte b1 = 0; b1 < 16; b1++) {
/* 20 */       for (byte b = 0; b < 16; b++) {
/* 21 */         float f = 0.0F;
/* 22 */         int i = (int)(ei.a(b * 3.1415927F * 2.0F / 16.0F) * 1.2F);
/* 23 */         int j = (int)(ei.a(b1 * 3.1415927F * 2.0F / 16.0F) * 1.2F);
/* 24 */         for (int k = b1 - 1; k <= b1 + 1; k++) {
/* 25 */           for (int m = b - 1; m <= b + 1; m++) {
/* 26 */             int n = k + i & 0xF;
/* 27 */             int i1 = m + j & 0xF;
/* 28 */             f += this.f[n + i1 * 16];
/*    */           } 
/* 30 */         }  this.g[b1 + b * 16] = f / 10.0F + (this.h[(b1 + 0 & 0xF) + (b + 0 & 0xF) * 16] + this.h[(b1 + 1 & 0xF) + (b + 0 & 0xF) * 16] + this.h[(b1 + 1 & 0xF) + (b + 1 & 0xF) * 16] + this.h[(b1 + 0 & 0xF) + (b + 1 & 0xF) * 16]) / 4.0F * 0.8F;
/*    */         
/* 32 */         this.h[b1 + b * 16] = this.h[b1 + b * 16] + this.i[b1 + b * 16] * 0.01F;
/*    */         
/* 34 */         if (this.h[b1 + b * 16] < 0.0F) this.h[b1 + b * 16] = 0.0F; 
/* 35 */         this.i[b1 + b * 16] = this.i[b1 + b * 16] - 0.06F;
/* 36 */         if (Math.random() < 0.005D)
/* 37 */           this.i[b1 + b * 16] = 1.5F; 
/*    */       } 
/*    */     } 
/* 40 */     float[] arrayOfFloat = this.g;
/* 41 */     this.g = this.f;
/* 42 */     this.f = arrayOfFloat;
/*    */     
/* 44 */     for (byte b2 = 0; b2 < 'Ā'; b2++) {
/* 45 */       float f1 = this.f[b2 - this.j / 3 * 16 & 0xFF] * 2.0F;
/* 46 */       if (f1 > 1.0F) f1 = 1.0F; 
/* 47 */       if (f1 < 0.0F) f1 = 0.0F;
/*    */       
/* 49 */       float f2 = f1;
/* 50 */       int i = (int)(f2 * 100.0F + 155.0F);
/* 51 */       int j = (int)(f2 * f2 * 255.0F);
/* 52 */       int k = (int)(f2 * f2 * f2 * f2 * 128.0F);
/*    */       
/* 54 */       if (this.c) {
/* 55 */         int m = (i * 30 + j * 59 + k * 11) / 100;
/* 56 */         int n = (i * 30 + j * 70) / 100;
/* 57 */         int i1 = (i * 30 + k * 70) / 100;
/*    */         
/* 59 */         i = m;
/* 60 */         j = n;
/* 61 */         k = i1;
/*    */       } 
/*    */       
/* 64 */       this.a[b2 * 4 + 0] = (byte)i;
/* 65 */       this.a[b2 * 4 + 1] = (byte)j;
/* 66 */       this.a[b2 * 4 + 2] = (byte)k;
/* 67 */       this.a[b2 * 4 + 3] = -1;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ea.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */