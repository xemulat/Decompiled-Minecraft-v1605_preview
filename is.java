/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class is
/*    */   extends nd
/*    */ {
/*    */   private float a;
/*    */   
/*    */   public is(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 13 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14 */     this.ak = this.ak * 0.009999999776482582D + paramDouble4;
/* 15 */     this.al = this.al * 0.009999999776482582D + paramDouble5;
/* 16 */     this.am = this.am * 0.009999999776482582D + paramDouble6;
/* 17 */     paramDouble1 += ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.05F);
/* 18 */     paramDouble2 += ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.05F);
/* 19 */     paramDouble3 += ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.05F);
/*    */     
/* 21 */     this.a = this.g;
/* 22 */     this.i = this.j = this.k = 1.0F;
/*    */     
/* 24 */     this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
/* 25 */     this.aK = true;
/* 26 */     this.b = 48;
/*    */   }
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 30 */     float f = (this.e + paramFloat1) / this.f;
/* 31 */     this.g = this.a * (1.0F - f * f * 0.5F);
/* 32 */     super.a(paramhe, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public float a(float paramFloat) {
/* 36 */     float f1 = (this.e + paramFloat) / this.f;
/* 37 */     if (f1 < 0.0F) f1 = 0.0F; 
/* 38 */     if (f1 > 1.0F) f1 = 1.0F; 
/* 39 */     float f2 = super.a(paramFloat);
/*    */     
/* 41 */     return f2 * f1 + 1.0F - f1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e_() {
/* 46 */     this.ae = this.ah;
/* 47 */     this.af = this.ai;
/* 48 */     this.ag = this.aj;
/*    */     
/* 50 */     if (this.e++ >= this.f) D();
/*    */     
/* 52 */     c(this.ak, this.al, this.am);
/* 53 */     this.ak *= 0.9599999785423279D;
/* 54 */     this.al *= 0.9599999785423279D;
/* 55 */     this.am *= 0.9599999785423279D;
/*    */     
/* 57 */     if (this.as) {
/*    */       
/* 59 */       this.ak *= 0.699999988079071D;
/* 60 */       this.am *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\is.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */