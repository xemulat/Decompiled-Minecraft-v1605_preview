/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aa
/*    */   extends dd
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public aa(int paramInt1, int paramInt2) {
/* 13 */     super(paramInt1);
/* 14 */     this.aR = 1;
/* 15 */     this.aS = 64;
/* 16 */     this.a = paramInt2;
/*    */   }
/*    */   
/*    */   public eo a(eo parameo, cj paramcj, dg paramdg) {
/* 20 */     float f1 = 1.0F;
/*    */     
/* 22 */     float f2 = paramdg.aq + (paramdg.ao - paramdg.aq) * f1;
/* 23 */     float f3 = paramdg.ap + (paramdg.an - paramdg.ap) * f1;
/*    */     
/* 25 */     double d1 = paramdg.ae + (paramdg.ah - paramdg.ae) * f1;
/* 26 */     double d2 = paramdg.af + (paramdg.ai - paramdg.af) * f1;
/* 27 */     double d3 = paramdg.ag + (paramdg.aj - paramdg.ag) * f1;
/*    */     
/* 29 */     ah ah1 = ah.b(d1, d2, d3);
/*    */     
/* 31 */     float f4 = ei.b(-f3 * 0.017453292F - 3.1415927F);
/* 32 */     float f5 = ei.a(-f3 * 0.017453292F - 3.1415927F);
/* 33 */     float f6 = -ei.b(-f2 * 0.017453292F);
/* 34 */     float f7 = ei.a(-f2 * 0.017453292F);
/*    */     
/* 36 */     float f8 = f5 * f6;
/* 37 */     float f9 = f7;
/* 38 */     float f10 = f4 * f6;
/*    */     
/* 40 */     double d4 = 5.0D;
/* 41 */     ah ah2 = ah1.c(f8 * d4, f9 * d4, f10 * d4);
/* 42 */     lv lv = paramcj.a(ah1, ah2, (this.a == 0));
/* 43 */     if (lv == null) return parameo;
/*    */     
/* 45 */     if (lv.a == 0) {
/* 46 */       int i = lv.b;
/* 47 */       int j = lv.c;
/* 48 */       int k = lv.d;
/*    */       
/* 50 */       if (this.a == 0) {
/* 51 */         if (paramcj.f(i, j, k) == fs.f && paramcj.e(i, j, k) == 0) {
/* 52 */           paramcj.d(i, j, k, 0);
/* 53 */           return new eo(dd.av);
/*    */         } 
/* 55 */         if (paramcj.f(i, j, k) == fs.g && paramcj.e(i, j, k) == 0) {
/* 56 */           paramcj.d(i, j, k, 0);
/* 57 */           return new eo(dd.aw);
/*    */         } 
/*    */       } else {
/* 60 */         if (lv.e == 0) j--; 
/* 61 */         if (lv.e == 1) j++; 
/* 62 */         if (lv.e == 2) k--; 
/* 63 */         if (lv.e == 3) k++; 
/* 64 */         if (lv.e == 4) i--; 
/* 65 */         if (lv.e == 5) i++;
/*    */         
/* 67 */         if (paramcj.a(i, j, k) == 0 || !paramcj.f(i, j, k).a()) {
/* 68 */           paramcj.b(i, j, k, this.a, 0);
/* 69 */           return new eo(dd.au);
/*    */         }
/*    */       
/*    */       }
/*    */     
/* 74 */     } else if (this.a == 0 && 
/* 75 */       lv.g instanceof ak) {
/* 76 */       return new eo(dd.aE);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 81 */     return parameo;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */