/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lr
/*    */   extends dk
/*    */ {
/*    */   public lr(cj paramcj) {
/*  9 */     super(paramcj);
/* 10 */     this.u = "/mob/zombie.png";
/* 11 */     this.Y = 0.5F;
/* 12 */     this.e = 5;
/*    */   }
/*    */   
/*    */   public void i() {
/* 16 */     if (this.ad.b()) {
/* 17 */       float f = a(1.0F);
/* 18 */       if (f > 0.5F && 
/* 19 */         this.ad.i(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) && this.aN.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/* 20 */         this.aQ = 300;
/*    */       }
/*    */     } 
/*    */     
/* 24 */     super.i();
/*    */   }
/*    */   
/*    */   protected String c() {
/* 28 */     return "mob.zombie";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 32 */     return "mob.zombiehurt";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 36 */     return "mob.zombiedeath";
/*    */   }
/*    */   
/*    */   protected int g() {
/* 40 */     return dd.J.aQ;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */