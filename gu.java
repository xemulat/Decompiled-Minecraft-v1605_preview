/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gu
/*    */   extends eu
/*    */ {
/*    */   public gu(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2, fs.r, false);
/* 11 */     this.bm = 0.98F;
/* 12 */     b(true);
/*    */   }
/*    */   
/*    */   public int g() {
/* 16 */     return 1;
/*    */   }
/*    */   
/*    */   public boolean c(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 20 */     return super.c(parammz, paramInt1, paramInt2, paramInt3, 1 - paramInt4);
/*    */   }
/*    */   
/*    */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 24 */     fs fs = paramcj.f(paramInt1, paramInt2 - 1, paramInt3);
/* 25 */     if (fs.c() || fs.d()) {
/* 26 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.A.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 31 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 35 */     if (paramcj.a(bu.b, paramInt1, paramInt2, paramInt3) > 11 - ln.q[this.ba]) {
/* 36 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 37 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.B.ba);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */