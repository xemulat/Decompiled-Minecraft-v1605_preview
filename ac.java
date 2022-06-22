/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ac
/*    */   extends ia
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public ac(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 16 */     for (byte b = 0; b < 64; b++) {
/* 17 */       int i = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 18 */       int j = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 19 */       int k = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 20 */       if (paramcj.a(i, j, k) == 0 && (
/* 21 */         (me)ln.n[this.a]).g(paramcj, i, j, k)) {
/* 22 */         paramcj.a(i, j, k, this.a);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 27 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */