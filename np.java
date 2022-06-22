/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class np
/*    */   extends dd
/*    */ {
/*    */   public np(int paramInt) {
/*  9 */     super(paramInt);
/* 10 */     this.aS = 64;
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 14 */     if (paramInt4 == 0) return false; 
/* 15 */     if (paramInt4 == 1) return false;
/*    */     
/* 17 */     byte b = 0;
/* 18 */     if (paramInt4 == 4) b = 1; 
/* 19 */     if (paramInt4 == 3) b = 2; 
/* 20 */     if (paramInt4 == 5) b = 3;
/*    */     
/* 22 */     it it = new it(paramcj, paramInt1, paramInt2, paramInt3, b);
/* 23 */     if (it.i()) {
/* 24 */       paramcj.a(it);
/* 25 */       parameo.a--;
/*    */     } 
/* 27 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\np.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */