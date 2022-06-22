/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class na
/*    */   extends ia
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public na(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 16 */     if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) != ln.t.ba) return false; 
/* 17 */     if (paramcj.a(paramInt1, paramInt2 - 1, paramInt3) != ln.t.ba) return false; 
/* 18 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != 0 && paramcj.a(paramInt1, paramInt2, paramInt3) != ln.t.ba) return false;
/*    */     
/* 20 */     byte b1 = 0;
/* 21 */     if (paramcj.a(paramInt1 - 1, paramInt2, paramInt3) == ln.t.ba) b1++; 
/* 22 */     if (paramcj.a(paramInt1 + 1, paramInt2, paramInt3) == ln.t.ba) b1++; 
/* 23 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 - 1) == ln.t.ba) b1++; 
/* 24 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 + 1) == ln.t.ba) b1++;
/*    */     
/* 26 */     byte b2 = 0;
/* 27 */     if (paramcj.a(paramInt1 - 1, paramInt2, paramInt3) == 0) b2++; 
/* 28 */     if (paramcj.a(paramInt1 + 1, paramInt2, paramInt3) == 0) b2++; 
/* 29 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 - 1) == 0) b2++; 
/* 30 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 + 1) == 0) b2++;
/*    */     
/* 32 */     if (b1 == 3 && b2 == 1) {
/* 33 */       paramcj.d(paramInt1, paramInt2, paramInt3, this.a);
/*    */     }
/*    */     
/* 36 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\na.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */