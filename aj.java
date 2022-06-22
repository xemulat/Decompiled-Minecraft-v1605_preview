/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aj
/*     */   extends ln
/*     */ {
/*     */   private ji a;
/*     */   
/*     */   protected aj(int paramInt1, int paramInt2, ji paramji) {
/*  19 */     super(paramInt1, paramInt2, fs.d);
/*  20 */     this.a = paramji;
/*  21 */     b(true);
/*     */     
/*  23 */     float f = 0.0625F;
/*  24 */     a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  29 */     return 20;
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  37 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  49 */     return paramcj.g(paramInt1, paramInt2 - 1, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  56 */     boolean bool = false;
/*     */     
/*  58 */     if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) bool = true;
/*     */     
/*  60 */     if (bool) {
/*  61 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  62 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  67 */     if (paramcj.e(paramInt1, paramInt2, paramInt3) == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  71 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {
/*  75 */     if (paramcj.e(paramInt1, paramInt2, paramInt3) == 1) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  83 */     boolean bool1 = (paramcj.e(paramInt1, paramInt2, paramInt3) == 1) ? true : false;
/*  84 */     boolean bool2 = false;
/*     */     
/*  86 */     float f = 0.125F;
/*  87 */     List list = null;
/*  88 */     if (this.a == ji.a) list = paramcj.b((jx)null, cb.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f))); 
/*  89 */     if (this.a == ji.b) list = paramcj.a(fv.class, cb.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f))); 
/*  90 */     if (this.a == ji.c) list = paramcj.a(dg.class, cb.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), paramInt2 + 0.25D, ((paramInt3 + 1) - f))); 
/*  91 */     if (list.size() > 0) {
/*  92 */       bool2 = true;
/*     */     }
/*     */     
/*  95 */     if (bool2 && !bool1) {
/*  96 */       paramcj.b(paramInt1, paramInt2, paramInt3, 1);
/*  97 */       paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/*  98 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*  99 */       paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 101 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     } 
/* 103 */     if (!bool2 && bool1) {
/* 104 */       paramcj.b(paramInt1, paramInt2, paramInt3, 0);
/* 105 */       paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 106 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/* 107 */       paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 109 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/*     */     } 
/*     */     
/* 112 */     if (bool2) {
/* 113 */       paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 118 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 119 */     if (i > 0) {
/* 120 */       paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 121 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     } 
/* 123 */     super.b(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 127 */     boolean bool = (parammz.e(paramInt1, paramInt2, paramInt3) == 1) ? true : false;
/*     */     
/* 129 */     float f = 0.0625F;
/* 130 */     if (bool) {
/* 131 */       a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */     } else {
/* 133 */       a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 138 */     return (parammz.e(paramInt1, paramInt2, paramInt3) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 143 */     if (paramcj.e(paramInt1, paramInt2, paramInt3) == 0) return false; 
/* 144 */     return (paramInt4 == 1);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   public void e() {
/* 152 */     float f1 = 0.5F;
/* 153 */     float f2 = 0.125F;
/* 154 */     float f3 = 0.5F;
/* 155 */     a(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\aj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */