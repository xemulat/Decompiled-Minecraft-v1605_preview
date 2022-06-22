/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cs
/*    */   extends dk
/*    */ {
/*    */   public cs(cj paramcj) {
/* 14 */     super(paramcj);
/* 15 */     this.u = "/mob/skeleton.png";
/*    */   }
/*    */ 
/*    */   
/*    */   protected String c() {
/* 20 */     return "mob.skeleton";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 24 */     return "mob.skeletonhurt";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 28 */     return "mob.skeletonhurt";
/*    */   }
/*    */ 
/*    */   
/*    */   public void i() {
/* 33 */     if (this.ad.b()) {
/* 34 */       float f = a(1.0F);
/* 35 */       if (f > 0.5F && 
/* 36 */         this.ad.i(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) && this.aN.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
/* 37 */         this.aQ = 300;
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 42 */     super.i();
/*    */   }
/*    */   
/*    */   protected void a(jx paramjx, float paramFloat) {
/* 46 */     if (paramFloat < 10.0F) {
/* 47 */       double d1 = paramjx.ah - this.ah;
/* 48 */       double d2 = paramjx.aj - this.aj;
/*    */       
/* 50 */       if (this.J == 0) {
/* 51 */         jw jw = new jw(this.ad, this);
/* 52 */         jw.ai += 1.399999976158142D;
/*    */         
/* 54 */         double d = paramjx.ai - 0.20000000298023224D - jw.ai;
/*    */         
/* 56 */         float f = ei.a(d1 * d1 + d2 * d2) * 0.2F;
/*    */         
/* 58 */         this.ad.a(this, "random.bow", 1.0F, 1.0F / (this.aN.nextFloat() * 0.4F + 0.8F));
/* 59 */         this.ad.a(jw);
/* 60 */         jw.a(d1, d + f, d2, 0.6F, 12.0F);
/* 61 */         this.J = 30;
/*    */       } 
/* 63 */       this.an = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/*    */       
/* 65 */       this.g = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 70 */     super.a(paramhc);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 74 */     super.b(paramhc);
/*    */   }
/*    */   
/*    */   protected int g() {
/* 78 */     return dd.j.aQ;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */