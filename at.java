/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class at
/*    */   extends dk
/*    */ {
/*    */   public at(cj paramcj) {
/* 13 */     super(paramcj);
/* 14 */     this.u = "/mob/spider.png";
/* 15 */     a(1.4F, 0.9F);
/* 16 */     this.Y = 0.8F;
/*    */   }
/*    */   
/*    */   protected jx h() {
/* 20 */     float f = a(1.0F);
/* 21 */     if (f < 0.5F) {
/* 22 */       double d = 16.0D;
/* 23 */       return this.ad.a(this, d);
/*    */     } 
/* 25 */     return null;
/*    */   }
/*    */   
/*    */   protected String c() {
/* 29 */     return "mob.spider";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 33 */     return "mob.spider";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 37 */     return "mob.spiderdeath";
/*    */   }
/*    */   
/*    */   protected void a(jx paramjx, float paramFloat) {
/* 41 */     float f = a(1.0F);
/* 42 */     if (f > 0.5F && this.aN.nextInt(100) == 0) {
/* 43 */       this.f = null;
/*    */       
/*    */       return;
/*    */     } 
/* 47 */     if (paramFloat > 2.0F && paramFloat < 6.0F && this.aN.nextInt(10) == 0) {
/* 48 */       if (this.as) {
/* 49 */         double d1 = paramjx.ah - this.ah;
/* 50 */         double d2 = paramjx.aj - this.aj;
/* 51 */         float f1 = ei.a(d1 * d1 + d2 * d2);
/* 52 */         this.ak = d1 / f1 * 0.5D * 0.800000011920929D + this.ak * 0.20000000298023224D;
/* 53 */         this.am = d2 / f1 * 0.5D * 0.800000011920929D + this.am * 0.20000000298023224D;
/* 54 */         this.al = 0.4000000059604645D;
/*    */       } 
/*    */     } else {
/* 57 */       super.a(paramjx, paramFloat);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 62 */     super.a(paramhc);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 66 */     super.b(paramhc);
/*    */   }
/*    */   
/*    */   protected int g() {
/* 70 */     return dd.I.aQ;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */