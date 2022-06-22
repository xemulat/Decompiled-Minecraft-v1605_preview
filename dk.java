/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dk
/*    */   extends ee
/*    */   implements ck
/*    */ {
/* 12 */   protected int e = 2;
/*    */   
/*    */   public dk(cj paramcj) {
/* 15 */     super(paramcj);
/* 16 */     this.D = 20;
/*    */   }
/*    */   
/*    */   public void i() {
/* 20 */     float f = a(1.0F);
/* 21 */     if (f > 0.5F) {
/* 22 */       this.S += 2;
/*    */     }
/* 24 */     super.i();
/*    */   }
/*    */   
/*    */   public void e_() {
/* 28 */     super.e_();
/* 29 */     if (this.ad.k == 0) D(); 
/*    */   }
/*    */   
/*    */   protected jx h() {
/* 33 */     dg dg = this.ad.a(this, 16.0D);
/* 34 */     if (dg != null && c(dg)) return dg; 
/* 35 */     return null;
/*    */   }
/*    */   
/*    */   public boolean a(jx paramjx, int paramInt) {
/* 39 */     if (super.a(paramjx, paramInt)) {
/* 40 */       if (paramjx != this) {
/* 41 */         this.f = paramjx;
/*    */       }
/* 43 */       return true;
/*    */     } 
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   protected void a(jx paramjx, float paramFloat) {
/* 49 */     if (paramFloat < 2.5D && paramjx.ar.e > this.ar.b && paramjx.ar.b < this.ar.e) {
/* 50 */       this.J = 20;
/* 51 */       paramjx.a(this, this.e);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 56 */     return 0.5F - this.ad.c(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 60 */     super.a(paramhc);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 64 */     super.b(paramhc);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 68 */     int i = ei.b(this.ah);
/* 69 */     int j = ei.b(this.ar.b);
/* 70 */     int k = ei.b(this.aj);
/* 71 */     if (this.ad.a(bu.a, i, j, k) > this.aN.nextInt(32)) return false; 
/* 72 */     int m = this.ad.j(i, j, k);
/* 73 */     return (m <= this.aN.nextInt(8) && super.a());
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */