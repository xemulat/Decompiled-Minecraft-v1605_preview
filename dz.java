/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dz
/*    */   extends dd
/*    */ {
/*    */   public dz(int paramInt) {
/*  9 */     super(paramInt);
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 13 */     if (paramInt4 == 0) paramInt2--; 
/* 14 */     if (paramInt4 == 1) paramInt2++; 
/* 15 */     if (paramInt4 == 2) paramInt3--; 
/* 16 */     if (paramInt4 == 3) paramInt3++; 
/* 17 */     if (paramInt4 == 4) paramInt1--; 
/* 18 */     if (paramInt4 == 5) paramInt1++; 
/* 19 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != 0) return false; 
/* 20 */     if (ln.av.a(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 21 */       parameo.a--;
/* 22 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.av.ba);
/*    */     } 
/*    */     
/* 25 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */