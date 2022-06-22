/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ar
/*    */   extends dd
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public ar(int paramInt) {
/* 11 */     super(paramInt);
/* 12 */     this.a = paramInt + 256;
/* 13 */     a(ln.n[paramInt + 256].a(2));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) == ln.aS.ba) {
/* 22 */       paramInt4 = 0;
/*    */     } else {
/* 24 */       if (paramInt4 == 0) paramInt2--; 
/* 25 */       if (paramInt4 == 1) paramInt2++; 
/* 26 */       if (paramInt4 == 2) paramInt3--; 
/* 27 */       if (paramInt4 == 3) paramInt3++; 
/* 28 */       if (paramInt4 == 4) paramInt1--; 
/* 29 */       if (paramInt4 == 5) paramInt1++;
/*    */     
/*    */     } 
/* 32 */     if (parameo.a == 0) return false;
/*    */ 
/*    */     
/* 35 */     if (paramcj.a(this.a, paramInt1, paramInt2, paramInt3, false)) {
/* 36 */       ln ln = ln.n[this.a];
/* 37 */       if (paramcj.d(paramInt1, paramInt2, paramInt3, this.a)) {
/* 38 */         ln.n[this.a].d(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/* 39 */         paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), ln.bj.d(), (ln.bj.b() + 1.0F) / 2.0F, ln.bj.c() * 0.8F);
/* 40 */         parameo.a--;
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */