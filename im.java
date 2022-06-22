/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class im
/*    */   extends nd
/*    */ {
/*    */   public im(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, ln paramln) {
/* 12 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 13 */     this.b = paramln.aZ;
/* 14 */     this.h = paramln.bk;
/* 15 */     this.i = this.j = this.k = 0.6F;
/* 16 */     this.g /= 2.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c() {
/* 21 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 26 */     float f1 = ((this.b % 16) + this.c / 4.0F) / 16.0F;
/* 27 */     float f2 = f1 + 0.015609375F;
/* 28 */     float f3 = ((this.b / 16) + this.d / 4.0F) / 16.0F;
/* 29 */     float f4 = f3 + 0.015609375F;
/* 30 */     float f5 = 0.1F * this.g;
/*    */     
/* 32 */     float f6 = (float)(this.ae + (this.ah - this.ae) * paramFloat1 - l);
/* 33 */     float f7 = (float)(this.af + (this.ai - this.af) * paramFloat1 - m);
/* 34 */     float f8 = (float)(this.ag + (this.aj - this.ag) * paramFloat1 - n);
/* 35 */     float f9 = a(paramFloat1);
/* 36 */     paramhe.a(f9 * this.i, f9 * this.j, f9 * this.k);
/*    */     
/* 38 */     paramhe.a((f6 - paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 - paramFloat4 * f5 - paramFloat6 * f5), f1, f4);
/* 39 */     paramhe.a((f6 - paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 - paramFloat4 * f5 + paramFloat6 * f5), f1, f3);
/* 40 */     paramhe.a((f6 + paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 + paramFloat4 * f5 + paramFloat6 * f5), f2, f3);
/* 41 */     paramhe.a((f6 + paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 + paramFloat4 * f5 - paramFloat6 * f5), f2, f4);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\im.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */