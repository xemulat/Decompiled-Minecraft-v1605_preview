/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cm
/*    */   extends nd
/*    */ {
/*    */   private float a;
/*    */   
/*    */   public cm(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 11 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12 */     this.ak *= 0.800000011920929D;
/* 13 */     this.al *= 0.800000011920929D;
/* 14 */     this.am *= 0.800000011920929D;
/* 15 */     this.al = (this.aN.nextFloat() * 0.4F + 0.05F);
/*    */     
/* 17 */     this.i = this.j = this.k = 1.0F;
/* 18 */     this.g *= this.aN.nextFloat() * 2.0F + 0.2F;
/* 19 */     this.a = this.g;
/*    */     
/* 21 */     this.f = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
/* 22 */     this.aK = false;
/* 23 */     this.b = 49;
/*    */   }
/*    */   
/*    */   public float a(float paramFloat) {
/* 27 */     return 1.0F;
/*    */   }
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 31 */     float f = (this.e + paramFloat1) / this.f;
/* 32 */     this.g = this.a * (1.0F - f * f);
/* 33 */     super.a(paramhe, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void e_() {
/* 37 */     this.ae = this.ah;
/* 38 */     this.af = this.ai;
/* 39 */     this.ag = this.aj;
/*    */     
/* 41 */     if (this.e++ >= this.f) D(); 
/* 42 */     float f = this.e / this.f;
/* 43 */     if (this.aN.nextFloat() > f) this.ad.a("smoke", this.ah, this.ai, this.aj, this.ak, this.al, this.am);
/*    */     
/* 45 */     this.al -= 0.03D;
/* 46 */     c(this.ak, this.al, this.am);
/* 47 */     this.ak *= 0.9990000128746033D;
/* 48 */     this.al *= 0.9990000128746033D;
/* 49 */     this.am *= 0.9990000128746033D;
/*    */     
/* 51 */     if (this.as) {
/* 52 */       this.ak *= 0.699999988079071D;
/* 53 */       this.am *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */