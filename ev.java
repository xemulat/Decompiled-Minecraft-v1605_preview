/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ev
/*    */   extends ln
/*    */ {
/*    */   protected ev(int paramInt1, int paramInt2) {
/* 13 */     super(paramInt1, paramInt2, fs.s);
/* 14 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/* 15 */     b(true);
/*    */   }
/*    */   
/*    */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 19 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 27 */     return false;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 31 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 35 */     return paramcj.f(paramInt1, paramInt2 - 1, paramInt3).c();
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 39 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 43 */     if (!a(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 44 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 45 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/* 46 */       return false;
/*    */     } 
/* 48 */     return true;
/*    */   }
/*    */   
/*    */   public void a_(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 52 */     int i = dd.aB.aQ;
/* 53 */     float f = 0.7F;
/* 54 */     double d1 = (paramcj.m.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 55 */     double d2 = (paramcj.m.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 56 */     double d3 = (paramcj.m.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 57 */     dr dr = new dr(paramcj, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, new eo(i));
/* 58 */     dr.c = 10;
/* 59 */     paramcj.a(dr);
/* 60 */     paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 64 */     return dd.aB.aQ;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 68 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 72 */     if (paramcj.a(bu.b, paramInt1, paramInt2, paramInt3) > 11) {
/* 73 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 74 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean c(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 79 */     fs fs = parammz.f(paramInt1, paramInt2, paramInt3);
/* 80 */     if (paramInt4 == 1) return true; 
/* 81 */     if (fs == this.bl) return false; 
/* 82 */     return super.c(parammz, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ev.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */