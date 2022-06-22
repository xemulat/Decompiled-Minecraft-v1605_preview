/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockMultiSided
/*    */   extends ln
/*    */ {
/*    */   private int texTop;
/*    */   private int texSide;
/*    */   private int texBottom;
/*    */   
/*    */   protected BlockMultiSided(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 14 */     super(paramInt1, fs.b);
/* 15 */     this.aZ = 3;
/* 16 */     b(true);
/* 17 */     this.texTop = paramInt2;
/* 18 */     this.texSide = paramInt3;
/* 19 */     this.texBottom = paramInt4;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 24 */     if (paramInt4 == 1) {
/* 25 */       return this.texTop;
/*    */     }
/* 27 */     if (paramInt4 == 0) {
/* 28 */       return this.texBottom;
/*    */     }
/* 30 */     return this.texSide;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 35 */     if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) < 4 && paramcj.f(paramInt1, paramInt2 + 1, paramInt3).b()) {
/* 36 */       if (paramRandom.nextInt(4) != 0) {
/*    */         return;
/*    */       }
/* 39 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.v.ba);
/*    */     }
/* 41 */     else if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/* 42 */       int i = paramInt1 + paramRandom.nextInt(3) - 1;
/* 43 */       int j = paramInt2 + paramRandom.nextInt(5) - 3;
/* 44 */       int k = paramInt3 + paramRandom.nextInt(3) - 1;
/* 45 */       if (paramcj.a(i, j, k) == ln.v.ba && paramcj.j(i, j + 1, k) >= 4 && !paramcj.f(i, j + 1, k).b()) {
/* 46 */         paramcj.d(i, j, k, ln.u.ba);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 53 */     return ln.v.a(0, paramRandom);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\BlockMultiSided.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */