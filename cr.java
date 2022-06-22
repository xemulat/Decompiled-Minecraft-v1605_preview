/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cr
/*    */   extends ln
/*    */ {
/*    */   protected cr(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, fs.c);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 15 */     return this.aZ + ((paramInt == 1) ? 1 : 0);
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 19 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 20 */     if (i > 0) {
/* 21 */       e(paramcj, paramInt1, paramInt2, paramInt3, i);
/* 22 */       return true;
/*    */     } 
/* 24 */     return false;
/*    */   }
/*    */   
/*    */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 28 */     paramcj.a((String)null, paramInt1, paramInt2, paramInt3);
/* 29 */     paramcj.b(paramInt1, paramInt2, paramInt3, 0);
/* 30 */     int i = dd.aO.aQ + paramInt4 - 1;
/* 31 */     float f = 0.7F;
/* 32 */     double d1 = (paramcj.m.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 33 */     double d2 = (paramcj.m.nextFloat() * f) + (1.0F - f) * 0.2D + 0.6D;
/* 34 */     double d3 = (paramcj.m.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 35 */     dr dr = new dr(paramcj, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, new eo(i));
/* 36 */     dr.c = 10;
/* 37 */     paramcj.a(dr);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
/* 41 */     if (paramcj.v)
/* 42 */       return;  if (paramInt4 > 0) {
/* 43 */       e(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */     }
/* 45 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */