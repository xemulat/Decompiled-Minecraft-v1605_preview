/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bk
/*    */   extends ae
/*    */ {
/*    */   public boolean a = false;
/*    */   
/*    */   public bk(cj paramcj) {
/* 14 */     super(paramcj);
/* 15 */     this.u = "/mob/sheep.png";
/* 16 */     a(0.9F, 1.3F);
/*    */   }
/*    */   
/*    */   public boolean a(jx paramjx, int paramInt) {
/* 20 */     if (!this.a && paramjx instanceof fv) {
/* 21 */       this.a = true;
/* 22 */       int i = 1 + this.aN.nextInt(3);
/* 23 */       for (byte b = 0; b < i; b++) {
/* 24 */         dr dr = a(ln.ab.ba, 1, 1.0F);
/* 25 */         dr.al += (this.aN.nextFloat() * 0.05F);
/* 26 */         dr.ak += ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F);
/* 27 */         dr.am += ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F);
/*    */       } 
/*    */     } 
/* 30 */     return super.a(paramjx, paramInt);
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 34 */     super.a(paramhc);
/* 35 */     paramhc.a("Sheared", this.a);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 39 */     super.b(paramhc);
/* 40 */     this.a = paramhc.m("Sheared");
/*    */   }
/*    */   
/*    */   protected String c() {
/* 44 */     return "mob.sheep";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 48 */     return "mob.sheep";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 52 */     return "mob.sheep";
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */