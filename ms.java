/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ms
/*    */   extends nd
/*    */ {
/*    */   public ms(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 12 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 13 */     this.ak *= 0.30000001192092896D;
/* 14 */     this.al = ((float)Math.random() * 0.2F + 0.1F);
/* 15 */     this.am *= 0.30000001192092896D;
/*    */     
/* 17 */     this.i = 1.0F;
/* 18 */     this.j = 1.0F;
/* 19 */     this.k = 1.0F;
/* 20 */     this.b = 19 + this.aN.nextInt(4);
/* 21 */     a(0.01F, 0.01F);
/* 22 */     this.h = 0.06F;
/*    */     
/* 24 */     this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 35 */     super.a(paramhe, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void e_() {
/* 39 */     this.ae = this.ah;
/* 40 */     this.af = this.ai;
/* 41 */     this.ag = this.aj;
/*    */     
/* 43 */     this.al -= this.h;
/* 44 */     c(this.ak, this.al, this.am);
/* 45 */     this.ak *= 0.9800000190734863D;
/* 46 */     this.al *= 0.9800000190734863D;
/* 47 */     this.am *= 0.9800000190734863D;
/*    */     
/* 49 */     if (this.f-- <= 0) D();
/*    */     
/* 51 */     if (this.as) {
/* 52 */       if (Math.random() < 0.5D) D(); 
/* 53 */       this.ak *= 0.699999988079071D;
/* 54 */       this.am *= 0.699999988079071D;
/*    */     } 
/*    */     
/* 57 */     fs fs = this.ad.f(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj));
/* 58 */     if (fs.d() || fs.a()) {
/* 59 */       double d = ((ei.b(this.ai) + 1) - jf.b(this.ad.e(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj))));
/* 60 */       if (this.ai < d)
/* 61 */         D(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */