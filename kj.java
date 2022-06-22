/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class kj
/*     */   extends jk
/*     */ {
/*     */   private final boolean a;
/*     */   
/*     */   protected kj(int paramInt, boolean paramBoolean) {
/*  14 */     super(paramInt, fs.d);
/*  15 */     this.a = paramBoolean;
/*  16 */     this.aZ = 45;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  20 */     return ln.aB.ba;
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  24 */     super.e(paramcj, paramInt1, paramInt2, paramInt3);
/*  25 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  29 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3 - 1);
/*  30 */     int j = paramcj.a(paramInt1, paramInt2, paramInt3 + 1);
/*  31 */     int k = paramcj.a(paramInt1 - 1, paramInt2, paramInt3);
/*  32 */     int m = paramcj.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  34 */     byte b = 3;
/*  35 */     if (ln.p[i] && !ln.p[j]) b = 3; 
/*  36 */     if (ln.p[j] && !ln.p[i]) b = 2; 
/*  37 */     if (ln.p[k] && !ln.p[m]) b = 5; 
/*  38 */     if (ln.p[m] && !ln.p[k]) b = 4; 
/*  39 */     paramcj.b(paramInt1, paramInt2, paramInt3, b);
/*     */   }
/*     */   
/*     */   public int a(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  43 */     if (paramInt4 == 1) return ln.t.aZ; 
/*  44 */     if (paramInt4 == 0) return ln.t.aZ;
/*     */     
/*  46 */     int i = parammz.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  48 */     if (paramInt4 != i) return this.aZ; 
/*  49 */     if (this.a) return this.aZ + 16; 
/*  50 */     return this.aZ - 1;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  54 */     if (!this.a)
/*     */       return; 
/*  56 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  58 */     float f1 = paramInt1 + 0.5F;
/*  59 */     float f2 = paramInt2 + 0.0F + paramRandom.nextFloat() * 6.0F / 16.0F;
/*  60 */     float f3 = paramInt3 + 0.5F;
/*  61 */     float f4 = 0.52F;
/*  62 */     float f5 = paramRandom.nextFloat() * 0.6F - 0.3F;
/*     */     
/*  64 */     if (i == 4) {
/*  65 */       paramcj.a("smoke", (f1 - f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
/*  66 */       paramcj.a("flame", (f1 - f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
/*  67 */     } else if (i == 5) {
/*  68 */       paramcj.a("smoke", (f1 + f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
/*  69 */       paramcj.a("flame", (f1 + f4), f2, (f3 + f5), 0.0D, 0.0D, 0.0D);
/*  70 */     } else if (i == 2) {
/*  71 */       paramcj.a("smoke", (f1 + f5), f2, (f3 - f4), 0.0D, 0.0D, 0.0D);
/*  72 */       paramcj.a("flame", (f1 + f5), f2, (f3 - f4), 0.0D, 0.0D, 0.0D);
/*  73 */     } else if (i == 3) {
/*  74 */       paramcj.a("smoke", (f1 + f5), f2, (f3 + f4), 0.0D, 0.0D, 0.0D);
/*  75 */       paramcj.a("flame", (f1 + f5), f2, (f3 + f4), 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/*  80 */     if (paramInt == 1) return ln.t.ba; 
/*  81 */     if (paramInt == 0) return ln.t.ba; 
/*  82 */     if (paramInt == 3) return this.aZ - 1; 
/*  83 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/*  87 */     ju ju = (ju)paramcj.b(paramInt1, paramInt2, paramInt3);
/*  88 */     paramdg.a(ju);
/*  89 */     return true;
/*     */   }
/*     */   
/*     */   public static void a(boolean paramBoolean, cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  94 */     ht ht = paramcj.b(paramInt1, paramInt2, paramInt3);
/*     */     
/*  96 */     if (paramBoolean) { paramcj.d(paramInt1, paramInt2, paramInt3, ln.aC.ba); }
/*  97 */     else { paramcj.d(paramInt1, paramInt2, paramInt3, ln.aB.ba); }
/*     */     
/*  99 */     paramcj.b(paramInt1, paramInt2, paramInt3, i);
/* 100 */     paramcj.a(paramInt1, paramInt2, paramInt3, ht);
/*     */   }
/*     */   
/*     */   protected ht a_() {
/* 104 */     return new ju();
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */