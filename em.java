/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class em
/*    */   extends ia
/*    */ {
/*    */   public boolean a(cj paramcj, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 11 */     for (byte b = 0; b < 20; b++) {
/* 12 */       int i = paramInt1 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 13 */       int j = paramInt2;
/* 14 */       int k = paramInt3 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 15 */       if (paramcj.a(i, j, k) == 0 && (
/* 16 */         paramcj.f(i - 1, j - 1, k) == fs.f || paramcj.f(i + 1, j - 1, k) == fs.f || paramcj.f(i, j - 1, k - 1) == fs.f || paramcj.f(i, j - 1, k + 1) == fs.f)) {
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 21 */         int m = 2 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 22 */         for (byte b1 = 0; b1 < m; b1++) {
/* 23 */           if (ln.aX.g(paramcj, i, j + b1, k)) {
/* 24 */             paramcj.a(i, j + b1, k, ln.aX.ba);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\em.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */