/*    */ 
/*    */ 
/*    */ public class kn
/*    */   extends me
/*    */ {
/*    */   protected kn(int paramInt1, int paramInt2) {
/*  7 */     super(paramInt1, paramInt2);
/*  8 */     float f = 0.2F;
/*  9 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   protected boolean b(int paramInt) {
/* 13 */     return ln.p[paramInt];
/*    */   }
/*    */   
/*    */   public boolean g(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     return (paramcj.j(paramInt1, paramInt2, paramInt3) <= 13 && b(paramcj.a(paramInt1, paramInt2 - 1, paramInt3)));
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */