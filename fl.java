/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fl
/*    */   extends dd
/*    */ {
/*    */   public fl(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1);
/* 12 */     this.aR = 1;
/* 13 */     this.aS = 32 << paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/* 18 */     fs fs = paramcj.f(paramInt1, paramInt2 + 1, paramInt3);
/*    */     
/* 20 */     if ((!fs.a() && i == ln.u.ba) || i == ln.v.ba) {
/* 21 */       ln ln = ln.aA;
/* 22 */       paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), ln.bj.d(), (ln.bj.b() + 1.0F) / 2.0F, ln.bj.c() * 0.8F);
/* 23 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.ba);
/* 24 */       parameo.b(1);
/*    */       
/* 26 */       if (paramcj.m.nextInt(8) == 0 && i == ln.u.ba) {
/* 27 */         byte b1 = 1;
/* 28 */         for (byte b2 = 0; b2 < b1; b2++) {
/* 29 */           float f1 = 0.7F;
/* 30 */           float f2 = paramcj.m.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/* 31 */           float f3 = 1.2F;
/* 32 */           float f4 = paramcj.m.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/* 33 */           dr dr = new dr(paramcj, (paramInt1 + f2), (paramInt2 + f3), (paramInt3 + f4), new eo(dd.Q));
/* 34 */           dr.c = 10;
/* 35 */           paramcj.a(dr);
/*    */         } 
/*    */       } 
/*    */       
/* 39 */       return true;
/*    */     } 
/*    */     
/* 42 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 46 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */