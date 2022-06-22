/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class p
/*    */   extends ln
/*    */ {
/*    */   public p(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, fs.p);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 15 */     if (paramInt == 0) return this.aZ + 2; 
/* 16 */     if (paramInt == 1) return this.aZ + 1; 
/* 17 */     return this.aZ;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     if (paramInt4 > 0 && ln.n[paramInt4].d() && 
/* 22 */       paramcj.p(paramInt1, paramInt2, paramInt3)) {
/* 23 */       b(paramcj, paramInt1, paramInt2, paramInt3, 0);
/* 24 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random paramRandom) {
/* 30 */     return 0;
/*    */   }
/*    */   
/*    */   public void c(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 34 */     iu iu = new iu(paramcj, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F);
/* 35 */     iu.a = paramcj.m.nextInt(iu.a / 4) + iu.a / 8;
/* 36 */     paramcj.a(iu);
/*    */   }
/*    */   
/*    */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 40 */     iu iu = new iu(paramcj, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F);
/* 41 */     paramcj.a(iu);
/* 42 */     paramcj.a(iu, "random.fuse", 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */