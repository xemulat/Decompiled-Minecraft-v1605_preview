/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mm
/*    */   extends ae
/*    */ {
/*    */   public boolean a = false;
/* 10 */   public float b = 0.0F;
/* 11 */   public float c = 0.0F;
/*    */   public float d;
/* 13 */   public float h = 1.0F; public float e;
/*    */   public int i;
/*    */   
/*    */   public mm(cj paramcj) {
/* 17 */     super(paramcj);
/* 18 */     this.u = "/mob/chicken.png";
/* 19 */     a(0.3F, 0.4F);
/* 20 */     this.D = 4;
/* 21 */     this.i = this.aN.nextInt(6000) + 6000;
/*    */   }
/*    */   
/*    */   public void i() {
/* 25 */     super.i();
/*    */     
/* 27 */     this.e = this.b;
/* 28 */     this.d = this.c;
/*    */     
/* 30 */     this.c = (float)(this.c + (this.as ? -1 : 4) * 0.3D);
/* 31 */     if (this.c < 0.0F) this.c = 0.0F; 
/* 32 */     if (this.c > 1.0F) this.c = 1.0F;
/*    */     
/* 34 */     if (!this.as && this.h < 1.0F) this.h = 1.0F; 
/* 35 */     this.h = (float)(this.h * 0.9D);
/*    */     
/* 37 */     if (!this.as && this.al < 0.0D) {
/* 38 */       this.al *= 0.6D;
/*    */     }
/*    */     
/* 41 */     this.b += this.h * 2.0F;
/*    */     
/* 43 */     if (--this.i <= 0) {
/* 44 */       b(dd.aN.aQ, 1);
/* 45 */       this.i = this.aN.nextInt(6000) + 6000;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hc paramhc) {
/* 51 */     super.a(paramhc);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 55 */     super.b(paramhc);
/*    */   }
/*    */   
/*    */   protected String c() {
/* 59 */     return "mob.chicken";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 63 */     return "mob.chickenhurt";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 67 */     return "mob.chickenhurt";
/*    */   }
/*    */   
/*    */   protected int g() {
/* 71 */     return dd.J.aQ;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */