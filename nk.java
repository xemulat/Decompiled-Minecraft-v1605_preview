/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nk
/*    */   extends dd
/*    */ {
/*    */   public nk(int paramInt) {
/*  9 */     super(paramInt);
/* 10 */     this.aR = 1;
/* 11 */     this.aS = 64;
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 15 */     if (paramInt4 == 0) paramInt2--; 
/* 16 */     if (paramInt4 == 1) paramInt2++; 
/* 17 */     if (paramInt4 == 2) paramInt3--; 
/* 18 */     if (paramInt4 == 3) paramInt3++; 
/* 19 */     if (paramInt4 == 4) paramInt1--; 
/* 20 */     if (paramInt4 == 5) paramInt1++;
/*    */     
/* 22 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/*    */     
/* 24 */     if (i == 0) {
/* 25 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "fire.ignite", 1.0F, b.nextFloat() * 0.4F + 0.8F);
/* 26 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.ar.ba);
/*    */     } 
/*    */     
/* 29 */     parameo.b(1);
/* 30 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */