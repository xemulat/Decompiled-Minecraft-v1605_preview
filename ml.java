/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ml
/*    */   extends ln
/*    */ {
/*    */   protected ml(int paramInt) {
/* 12 */     super(paramInt, fs.b);
/* 13 */     this.aZ = 3;
/* 14 */     b(true);
/*    */   }
/*    */   
/*    */   public int a(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 18 */     if (paramInt4 == 1) return 0; 
/* 19 */     if (paramInt4 == 0) return 2; 
/* 20 */     fs fs = parammz.f(paramInt1, paramInt2 + 1, paramInt3);
/* 21 */     if (fs == fs.s || fs == fs.t) return 68; 
/* 22 */     return 3;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 26 */     if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) < 4 && paramcj.f(paramInt1, paramInt2 + 1, paramInt3).b()) {
/* 27 */       if (paramRandom.nextInt(4) != 0)
/* 28 */         return;  paramcj.d(paramInt1, paramInt2, paramInt3, ln.v.ba);
/*    */     }
/* 30 */     else if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/* 31 */       int i = paramInt1 + paramRandom.nextInt(3) - 1;
/* 32 */       int j = paramInt2 + paramRandom.nextInt(5) - 3;
/* 33 */       int k = paramInt3 + paramRandom.nextInt(3) - 1;
/* 34 */       if (paramcj.a(i, j, k) == ln.v.ba && paramcj.j(i, j + 1, k) >= 4 && !paramcj.f(i, j + 1, k).b()) {
/* 35 */         paramcj.d(i, j, k, ln.u.ba);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 42 */     return ln.v.a(0, paramRandom);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ml.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */