/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cy
/*    */   extends dk
/*    */ {
/*    */   int a;
/*    */   int b;
/* 12 */   int c = 30;
/* 13 */   int d = -1;
/*    */   
/*    */   public cy(cj paramcj) {
/* 16 */     super(paramcj);
/* 17 */     this.u = "/mob/creeper.png";
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 21 */     super.a(paramhc);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 25 */     super.b(paramhc);
/*    */   }
/*    */   
/*    */   protected void b_() {
/* 29 */     this.b = this.a;
/* 30 */     if (this.a > 0 && this.d < 0) this.a--; 
/* 31 */     if (this.d >= 0) this.d = 2; 
/* 32 */     super.b_();
/* 33 */     if (this.d != 1) this.d = -1; 
/*    */   }
/*    */   
/*    */   protected String d() {
/* 37 */     return "mob.creeper";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 41 */     return "mob.creeperdeath";
/*    */   }
/*    */   
/*    */   public void b(jx paramjx) {
/* 45 */     super.b(paramjx);
/*    */     
/* 47 */     if (paramjx instanceof cs) {
/* 48 */       b(dd.aO.aQ + this.aN.nextInt(2), 1);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void a(jx paramjx, float paramFloat) {
/* 53 */     if ((this.d <= 0 && paramFloat < 3.0F) || (this.d > 0 && paramFloat < 7.0F)) {
/* 54 */       if (this.a == 0) {
/* 55 */         this.ad.a(this, "random.fuse", 1.0F, 0.5F);
/*    */       }
/* 57 */       this.d = 1;
/* 58 */       this.a++;
/*    */       
/* 60 */       if (this.a == this.c) {
/* 61 */         this.ad.a(this, this.ah, this.ai, this.aj, 3.0F);
/* 62 */         D();
/*    */       } 
/* 64 */       this.g = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public float b(float paramFloat) {
/* 69 */     return (this.b + (this.a - this.b) * paramFloat) / (this.c - 2);
/*    */   }
/*    */   
/*    */   protected int g() {
/* 73 */     return dd.K.aQ;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */