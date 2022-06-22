/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ag
/*    */   extends ln
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public ag(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 15 */     super(paramInt1, paramInt2, fs.d);
/* 16 */     if (paramBoolean) {
/* 17 */       b(true);
/*    */     }
/* 19 */     this.a = paramBoolean;
/*    */   }
/*    */   
/*    */   public int a() {
/* 23 */     return 30;
/*    */   }
/*    */   
/*    */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 27 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/* 28 */     super.b(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {
/* 32 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/* 33 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramjx);
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 37 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/* 38 */     return super.a(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*    */   }
/*    */   
/*    */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 42 */     i(paramcj, paramInt1, paramInt2, paramInt3);
/* 43 */     if (this.ba == ln.aN.ba) {
/* 44 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.aO.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 49 */     if (this.ba == ln.aO.ba) {
/* 50 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.aN.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 55 */     return dd.aA.aQ;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 59 */     return 4 + paramRandom.nextInt(2);
/*    */   }
/*    */   
/*    */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 63 */     if (this.a) {
/* 64 */       i(paramcj, paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   private void i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 69 */     Random random = paramcj.m;
/* 70 */     double d = 0.0625D;
/* 71 */     for (byte b = 0; b < 6; b++) {
/* 72 */       double d1 = (paramInt1 + random.nextFloat());
/* 73 */       double d2 = (paramInt2 + random.nextFloat());
/* 74 */       double d3 = (paramInt3 + random.nextFloat());
/* 75 */       if (b == 0 && !paramcj.g(paramInt1, paramInt2 + 1, paramInt3)) d2 = (paramInt2 + 1) + d; 
/* 76 */       if (b == 1 && !paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) d2 = (paramInt2 + 0) - d; 
/* 77 */       if (b == 2 && !paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) d3 = (paramInt3 + 1) + d; 
/* 78 */       if (b == 3 && !paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) d3 = (paramInt3 + 0) - d; 
/* 79 */       if (b == 4 && !paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) d1 = (paramInt1 + 1) + d; 
/* 80 */       if (b == 5 && !paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) d1 = (paramInt1 + 0) - d; 
/* 81 */       if (d1 < paramInt1 || d1 > (paramInt1 + 1) || d2 < 0.0D || d2 > (paramInt2 + 1) || d3 < paramInt3 || d3 > (paramInt3 + 1))
/* 82 */         paramcj.a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */