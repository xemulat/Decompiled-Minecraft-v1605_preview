/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lu
/*    */   extends dd
/*    */ {
/*    */   public lu(int paramInt) {
/* 10 */     super(paramInt);
/* 11 */     this.aR = 1;
/*    */   }
/*    */   
/*    */   public eo a(eo parameo, cj paramcj, dg paramdg) {
/* 15 */     float f1 = 1.0F;
/*    */     
/* 17 */     float f2 = paramdg.aq + (paramdg.ao - paramdg.aq) * f1;
/* 18 */     float f3 = paramdg.ap + (paramdg.an - paramdg.ap) * f1;
/*    */     
/* 20 */     double d1 = paramdg.ae + (paramdg.ah - paramdg.ae) * f1;
/* 21 */     double d2 = paramdg.af + (paramdg.ai - paramdg.af) * f1;
/* 22 */     double d3 = paramdg.ag + (paramdg.aj - paramdg.ag) * f1;
/*    */     
/* 24 */     ah ah1 = ah.b(d1, d2, d3);
/*    */     
/* 26 */     float f4 = ei.b(-f3 * 0.017453292F - 3.1415927F);
/* 27 */     float f5 = ei.a(-f3 * 0.017453292F - 3.1415927F);
/* 28 */     float f6 = -ei.b(-f2 * 0.017453292F);
/* 29 */     float f7 = ei.a(-f2 * 0.017453292F);
/*    */     
/* 31 */     float f8 = f5 * f6;
/* 32 */     float f9 = f7;
/* 33 */     float f10 = f4 * f6;
/*    */     
/* 35 */     double d4 = 5.0D;
/* 36 */     ah ah2 = ah1.c(f8 * d4, f9 * d4, f10 * d4);
/* 37 */     lv lv = paramcj.a(ah1, ah2, true);
/* 38 */     if (lv == null) return parameo;
/*    */     
/* 40 */     if (lv.a == 0) {
/* 41 */       int i = lv.b;
/* 42 */       int j = lv.c;
/* 43 */       int k = lv.d;
/*    */       
/* 45 */       paramcj.a(new cx(paramcj, (i + 0.5F), (j + 1.5F), (k + 0.5F)));
/* 46 */       parameo.a--;
/*    */     } 
/*    */     
/* 49 */     return parameo;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */