/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class iq
/*     */   extends gy
/*     */ {
/*     */   private int b;
/*  11 */   private int c = 0;
/*     */   
/*     */   protected iq(int paramInt1, int paramInt2) {
/*  14 */     super(paramInt1, paramInt2, fs.h, false);
/*  15 */     this.b = paramInt2;
/*  16 */     b(true);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  20 */     this.c = 0;
/*  21 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*  22 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void f(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  26 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != this.ba)
/*  27 */       return;  int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  28 */     if (i == 0 || i != paramInt4 - 1)
/*  29 */       return;  h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     if (this.c++ >= 100)
/*  34 */       return;  int i = paramcj.f(paramInt1, paramInt2 - 1, paramInt3).a() ? 16 : 0;
/*     */     
/*  36 */     int j = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  37 */     if (j == 0) {
/*  38 */       j = 1;
/*  39 */       paramcj.b(paramInt1, paramInt2, paramInt3, 1);
/*     */     } 
/*  41 */     i = g(paramcj, paramInt1, paramInt2 - 1, paramInt3, i);
/*  42 */     i = g(paramcj, paramInt1, paramInt2, paramInt3 - 1, i);
/*  43 */     i = g(paramcj, paramInt1, paramInt2, paramInt3 + 1, i);
/*  44 */     i = g(paramcj, paramInt1 - 1, paramInt2, paramInt3, i);
/*  45 */     i = g(paramcj, paramInt1 + 1, paramInt2, paramInt3, i);
/*  46 */     int k = i - 1;
/*  47 */     if (k < 10) {
/*  48 */       k = 1;
/*     */     }
/*     */     
/*  51 */     if (k != j) {
/*  52 */       paramcj.b(paramInt1, paramInt2, paramInt3, k);
/*  53 */       f(paramcj, paramInt1, paramInt2 - 1, paramInt3, j);
/*  54 */       f(paramcj, paramInt1, paramInt2 + 1, paramInt3, j);
/*  55 */       f(paramcj, paramInt1, paramInt2, paramInt3 - 1, j);
/*  56 */       f(paramcj, paramInt1, paramInt2, paramInt3 + 1, j);
/*  57 */       f(paramcj, paramInt1 - 1, paramInt2, paramInt3, j);
/*  58 */       f(paramcj, paramInt1 + 1, paramInt2, paramInt3, j);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int g(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  63 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/*  64 */     if (i == ln.J.ba) return 16; 
/*  65 */     if (i == this.ba) {
/*  66 */       int j = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  67 */       if (j != 0 && j > paramInt4) return j; 
/*     */     } 
/*  69 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  73 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  74 */     if (i == 0) {
/*  75 */       this.c = 0;
/*  76 */       h(paramcj, paramInt1, paramInt2, paramInt3);
/*  77 */     } else if (i == 1) {
/*  78 */       i(paramcj, paramInt1, paramInt2, paramInt3);
/*  79 */     } else if (paramRandom.nextInt(10) == 0) {
/*  80 */       h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  85 */     b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  86 */     paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/*  90 */     return (paramRandom.nextInt(20) == 0) ? 1 : 0;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  94 */     return ln.y.ba;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  98 */     return !this.a;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 102 */     this.a = paramBoolean;
/* 103 */     this.aZ = this.b + (paramBoolean ? 0 : 1);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {
/* 107 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramjx);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\iq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */