/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dj
/*    */   extends nd
/*    */ {
/*    */   public dj(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 11 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 12 */     this.ak = paramDouble4 + ((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
/* 13 */     this.al = paramDouble5 + ((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
/* 14 */     this.am = paramDouble6 + ((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
/*    */     
/* 16 */     this.i = this.j = this.k = this.aN.nextFloat() * 0.3F + 0.7F;
/* 17 */     this.g = this.aN.nextFloat() * this.aN.nextFloat() * 6.0F + 1.0F;
/*    */     
/* 19 */     this.f = (int)(16.0D / (this.aN.nextFloat() * 0.8D + 0.2D)) + 2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 32 */     super.a(paramhe, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e_() {
/* 37 */     this.ae = this.ah;
/* 38 */     this.af = this.ai;
/* 39 */     this.ag = this.aj;
/*    */     
/* 41 */     if (this.e++ >= this.f) D();
/*    */     
/* 43 */     this.b = 7 - this.e * 8 / this.f;
/*    */     
/* 45 */     this.al += 0.004D;
/* 46 */     c(this.ak, this.al, this.am);
/* 47 */     this.ak *= 0.8999999761581421D;
/* 48 */     this.al *= 0.8999999761581421D;
/* 49 */     this.am *= 0.8999999761581421D;
/*    */     
/* 51 */     if (this.as) {
/*    */       
/* 53 */       this.ak *= 0.699999988079071D;
/* 54 */       this.am *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */