/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fw
/*    */   extends dd
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public fw(int paramInt, ln paramln) {
/* 11 */     super(paramInt);
/* 12 */     this.a = paramln.ba;
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 16 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) == ln.aS.ba) {
/* 17 */       paramInt4 = 0;
/*    */     } else {
/* 19 */       if (paramInt4 == 0) paramInt2--; 
/* 20 */       if (paramInt4 == 1) paramInt2++; 
/* 21 */       if (paramInt4 == 2) paramInt3--; 
/* 22 */       if (paramInt4 == 3) paramInt3++; 
/* 23 */       if (paramInt4 == 4) paramInt1--; 
/* 24 */       if (paramInt4 == 5) paramInt1++;
/*    */     
/*    */     } 
/* 27 */     if (parameo.a == 0) return false;
/*    */ 
/*    */     
/* 30 */     if (paramcj.a(this.a, paramInt1, paramInt2, paramInt3, false)) {
/* 31 */       ln ln = ln.n[this.a];
/* 32 */       if (paramcj.d(paramInt1, paramInt2, paramInt3, this.a)) {
/* 33 */         ln.n[this.a].d(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/* 34 */         paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), ln.bj.d(), (ln.bj.b() + 1.0F) / 2.0F, ln.bj.c() * 0.8F);
/* 35 */         parameo.a--;
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */