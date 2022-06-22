/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hw
/*    */   extends nd
/*    */ {
/*    */   public hw(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, dd paramdd) {
/* 11 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12 */     this.b = paramdd.a((eo)null);
/* 13 */     this.i = this.j = this.k = 1.0F;
/* 14 */     this.h = ln.aU.bk;
/* 15 */     this.g /= 2.0F;
/*    */   }
/*    */   
/*    */   public int c() {
/* 19 */     return 2;
/*    */   }
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 23 */     float f1 = ((this.b % 16) + this.c / 4.0F) / 16.0F;
/* 24 */     float f2 = f1 + 0.015609375F;
/* 25 */     float f3 = ((this.b / 16) + this.d / 4.0F) / 16.0F;
/* 26 */     float f4 = f3 + 0.015609375F;
/* 27 */     float f5 = 0.1F * this.g;
/*    */     
/* 29 */     float f6 = (float)(this.ae + (this.ah - this.ae) * paramFloat1 - l);
/* 30 */     float f7 = (float)(this.af + (this.ai - this.af) * paramFloat1 - m);
/* 31 */     float f8 = (float)(this.ag + (this.aj - this.ag) * paramFloat1 - n);
/* 32 */     float f9 = a(paramFloat1);
/* 33 */     paramhe.a(f9 * this.i, f9 * this.j, f9 * this.k);
/*    */     
/* 35 */     paramhe.a((f6 - paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 - paramFloat4 * f5 - paramFloat6 * f5), f1, f4);
/* 36 */     paramhe.a((f6 - paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 - paramFloat4 * f5 + paramFloat6 * f5), f1, f3);
/* 37 */     paramhe.a((f6 + paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 + paramFloat4 * f5 + paramFloat6 * f5), f2, f3);
/* 38 */     paramhe.a((f6 + paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 + paramFloat4 * f5 - paramFloat6 * f5), f2, f4);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */