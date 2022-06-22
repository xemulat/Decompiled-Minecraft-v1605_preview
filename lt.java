/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lt
/*    */   extends dd
/*    */ {
/*    */   public lt(int paramInt) {
/* 11 */     super(paramInt);
/* 12 */     this.aS = 64;
/* 13 */     this.aR = 1;
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     if (paramInt4 == 0) return false; 
/* 18 */     if (!paramcj.f(paramInt1, paramInt2, paramInt3).a()) return false;
/*    */ 
/*    */     
/* 21 */     if (paramInt4 == 1) paramInt2++;
/*    */     
/* 23 */     if (paramInt4 == 2) paramInt3--; 
/* 24 */     if (paramInt4 == 3) paramInt3++; 
/* 25 */     if (paramInt4 == 4) paramInt1--; 
/* 26 */     if (paramInt4 == 5) paramInt1++;
/*    */     
/* 28 */     if (!ln.aD.a(paramcj, paramInt1, paramInt2, paramInt3)) return false;
/*    */ 
/*    */     
/* 31 */     if (paramInt4 == 1) {
/* 32 */       paramcj.b(paramInt1, paramInt2, paramInt3, ln.aD.ba, ei.b(((paramdg.an + 180.0F) * 16.0F / 360.0F) + 0.5D) & 0xF);
/*    */     } else {
/* 34 */       paramcj.b(paramInt1, paramInt2, paramInt3, ln.aI.ba, paramInt4);
/*    */     } 
/*    */     
/* 37 */     parameo.a--;
/* 38 */     paramdg.a((nn)paramcj.b(paramInt1, paramInt2, paramInt3));
/* 39 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */