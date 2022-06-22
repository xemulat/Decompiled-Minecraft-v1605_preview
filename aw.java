/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aw
/*    */   extends nd
/*    */ {
/*    */   public aw(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 10 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*    */     
/* 12 */     this.i = 1.0F;
/* 13 */     this.j = 1.0F;
/* 14 */     this.k = 1.0F;
/* 15 */     this.b = 32;
/* 16 */     a(0.02F, 0.02F);
/*    */     
/* 18 */     this.g *= this.aN.nextFloat() * 0.6F + 0.2F;
/*    */     
/* 20 */     this.ak = paramDouble4 * 0.20000000298023224D + ((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
/* 21 */     this.al = paramDouble5 * 0.20000000298023224D + ((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
/* 22 */     this.am = paramDouble6 * 0.20000000298023224D + ((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
/*    */     
/* 24 */     this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/*    */   }
/*    */   
/*    */   public void e_() {
/* 28 */     this.ae = this.ah;
/* 29 */     this.af = this.ai;
/* 30 */     this.ag = this.aj;
/*    */     
/* 32 */     this.al += 0.002D;
/* 33 */     c(this.ak, this.al, this.am);
/* 34 */     this.ak *= 0.8500000238418579D;
/* 35 */     this.al *= 0.8500000238418579D;
/* 36 */     this.am *= 0.8500000238418579D;
/*    */     
/* 38 */     if (this.ad.f(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) != fs.f) D();
/*    */     
/* 40 */     if (this.f-- <= 0) D(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\aw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */