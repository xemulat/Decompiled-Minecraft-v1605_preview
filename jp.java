/*    */ 
/*    */ 
/*    */ 
/*    */ public class jp
/*    */   extends y
/*    */ {
/*  7 */   protected float[] f = new float[320];
/*  8 */   protected float[] g = new float[320];
/*    */ 
/*    */ 
/*    */   
/*    */   public jp(int paramInt) {
/* 13 */     super(ln.ar.aZ + paramInt * 16);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 18 */     for (byte b1 = 0; b1 < 16; b1++) {
/* 19 */       for (byte b = 0; b < 20; b++) {
/*    */         
/* 21 */         byte b3 = 18;
/* 22 */         float f = this.f[b1 + (b + 1) % 20 * 16] * b3;
/* 23 */         for (int i = b1 - 1; i <= b1 + 1; i++) {
/* 24 */           for (byte b4 = b; b4 <= b + 1; b4++) {
/*    */             
/* 26 */             int j = i;
/* 27 */             byte b5 = b4;
/* 28 */             if (j >= 0 && b5 >= 0 && j < 16 && b5 < 20)
/*    */             {
/* 30 */               f += this.f[j + b5 * 16];
/*    */             }
/* 32 */             b3++;
/*    */           } 
/* 34 */         }  this.g[b1 + b * 16] = f / b3 * 1.06F;
/* 35 */         if (b >= 19)
/*    */         {
/* 37 */           this.g[b1 + b * 16] = (float)(Math.random() * Math.random() * Math.random() * 4.0D + Math.random() * 0.10000000149011612D + 0.20000000298023224D); } 
/*    */       } 
/*    */     } 
/* 40 */     float[] arrayOfFloat = this.g;
/* 41 */     this.g = this.f;
/* 42 */     this.f = arrayOfFloat;
/*    */     
/* 44 */     for (byte b2 = 0; b2 < 'Ā'; b2++) {
/*    */       
/* 46 */       float f1 = this.f[b2] * 1.8F;
/* 47 */       if (f1 > 1.0F) f1 = 1.0F; 
/* 48 */       if (f1 < 0.0F) f1 = 0.0F;
/*    */       
/* 50 */       float f2 = f1;
/* 51 */       int i = (int)(f2 * 155.0F + 100.0F);
/* 52 */       int j = (int)(f2 * f2 * 255.0F);
/* 53 */       int k = (int)(f2 * f2 * f2 * f2 * f2 * f2 * f2 * f2 * f2 * f2 * 255.0F);
/* 54 */       char c = 'ÿ';
/*    */       
/* 56 */       if (f2 < 0.5F)
/*    */       {
/* 58 */         c = Character.MIN_VALUE;
/*    */       }
/* 60 */       f2 = (f2 - 0.5F) * 2.0F;
/*    */       
/* 62 */       if (this.c) {
/*    */         
/* 64 */         int m = (i * 30 + j * 59 + k * 11) / 100;
/* 65 */         int n = (i * 30 + j * 70) / 100;
/* 66 */         int i1 = (i * 30 + k * 70) / 100;
/*    */         
/* 68 */         i = m;
/* 69 */         j = n;
/* 70 */         k = i1;
/*    */       } 
/*    */       
/* 73 */       this.a[b2 * 4 + 0] = (byte)i;
/* 74 */       this.a[b2 * 4 + 1] = (byte)j;
/* 75 */       this.a[b2 * 4 + 2] = (byte)k;
/* 76 */       this.a[b2 * 4 + 3] = (byte)c;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */