/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jd
/*    */   extends dd
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public jd(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1);
/* 12 */     this.a = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 16 */     if (paramInt4 != 1) return false;
/*    */     
/* 18 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/*    */     
/* 20 */     if (i == ln.aA.ba) {
/* 21 */       paramcj.d(paramInt1, paramInt2 + 1, paramInt3, this.a);
/* 22 */       parameo.a--;
/* 23 */       return true;
/*    */     } 
/* 25 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */