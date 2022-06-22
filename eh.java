/*    */ 
/*    */ 
/*    */ public class eh
/*    */   extends nd
/*    */ {
/*    */   float a;
/*    */   
/*    */   public eh(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  9 */     this(paramcj, paramDouble1, paramDouble2, paramDouble3, 1.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public eh(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/* 15 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 16 */     this.ak *= 0.10000000149011612D;
/* 17 */     this.al *= 0.10000000149011612D;
/* 18 */     this.am *= 0.10000000149011612D;
/*    */     
/* 20 */     this.i = (float)(Math.random() * 0.30000001192092896D) + 0.7F;
/* 21 */     this.j = this.k = (float)(Math.random() * 0.10000000149011612D);
/* 22 */     this.g *= 0.75F;
/* 23 */     this.g *= paramFloat;
/* 24 */     this.a = this.g;
/*    */     
/* 26 */     this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/* 27 */     this.f = (int)(this.f * paramFloat);
/* 28 */     this.aK = false;
/*    */   }
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 32 */     float f = (this.e + paramFloat1) / this.f * 32.0F;
/* 33 */     if (f < 0.0F) f = 0.0F; 
/* 34 */     if (f > 1.0F) f = 1.0F;
/*    */     
/* 36 */     this.g = this.a * f;
/* 37 */     super.a(paramhe, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void e_() {
/* 41 */     this.ae = this.ah;
/* 42 */     this.af = this.ai;
/* 43 */     this.ag = this.aj;
/*    */     
/* 45 */     if (this.e++ >= this.f) D();
/*    */     
/* 47 */     this.b = 7 - this.e * 8 / this.f;
/*    */     
/* 49 */     c(this.ak, this.al, this.am);
/* 50 */     if (this.ai == this.af) {
/* 51 */       this.ak *= 1.1D;
/* 52 */       this.am *= 1.1D;
/*    */     } 
/* 54 */     this.ak *= 0.9599999785423279D;
/* 55 */     this.al *= 0.9599999785423279D;
/* 56 */     this.am *= 0.9599999785423279D;
/*    */     
/* 58 */     if (this.as) {
/* 59 */       this.ak *= 0.699999988079071D;
/* 60 */       this.am *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\eh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */