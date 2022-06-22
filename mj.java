/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mj
/*    */   extends ae
/*    */ {
/*    */   public boolean a = false;
/*    */   
/*    */   public mj(cj paramcj) {
/* 13 */     super(paramcj);
/* 14 */     this.u = "/mob/pig.png";
/* 15 */     a(0.9F, 0.9F);
/*    */     
/* 17 */     this.a = false;
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 21 */     super.a(paramhc);
/* 22 */     paramhc.a("Saddle", this.a);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 26 */     super.b(paramhc);
/* 27 */     this.a = paramhc.m("Saddle");
/*    */   }
/*    */   
/*    */   protected String c() {
/* 31 */     return "mob.pig";
/*    */   }
/*    */   
/*    */   protected String d() {
/* 35 */     return "mob.pig";
/*    */   }
/*    */   
/*    */   protected String e() {
/* 39 */     return "mob.pigdeath";
/*    */   }
/*    */   
/*    */   public boolean a(dg paramdg) {
/* 43 */     if (this.a) {
/* 44 */       paramdg.g(this);
/* 45 */       return true;
/*    */     } 
/* 47 */     return false;
/*    */   }
/*    */   
/*    */   protected int g() {
/* 51 */     return dd.ao.aQ;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */