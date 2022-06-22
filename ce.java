/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ce
/*     */   implements mz
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private fr[][] c;
/*     */   private cj d;
/*     */   
/*     */   public ce(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  16 */     this.d = paramcj;
/*     */     
/*  18 */     this.a = paramInt1 >> 4;
/*  19 */     this.b = paramInt3 >> 4;
/*  20 */     int i = paramInt4 >> 4;
/*  21 */     int j = paramInt6 >> 4;
/*     */     
/*  23 */     this.c = new fr[i - this.a + 1][j - this.b + 1];
/*     */     
/*  25 */     for (int k = this.a; k <= i; k++) {
/*  26 */       for (int m = this.b; m <= j; m++) {
/*  27 */         this.c[k - this.a][m - this.b] = paramcj.b(k, m);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/*  33 */     if (paramInt2 < 0) return 0; 
/*  34 */     if (paramInt2 >= 128) return 0; 
/*  35 */     int i = (paramInt1 >> 4) - this.a;
/*  36 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  38 */     return this.c[i][j].a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */   public ht b(int paramInt1, int paramInt2, int paramInt3) {
/*  42 */     int i = (paramInt1 >> 4) - this.a;
/*  43 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  45 */     return this.c[i][j].d(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */   public float c(int paramInt1, int paramInt2, int paramInt3) {
/*  49 */     return cj.i[d(paramInt1, paramInt2, paramInt3)];
/*     */   }
/*     */   
/*     */   public int d(int paramInt1, int paramInt2, int paramInt3) {
/*  53 */     return a(paramInt1, paramInt2, paramInt3, true);
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  57 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  58 */       return 15;
/*     */     }
/*     */     
/*  61 */     if (paramBoolean) {
/*  62 */       int k = a(paramInt1, paramInt2, paramInt3);
/*  63 */       if (k == ln.ak.ba || k == ln.aA.ba) {
/*  64 */         int m = a(paramInt1, paramInt2 + 1, paramInt3, false);
/*  65 */         int n = a(paramInt1 + 1, paramInt2, paramInt3, false);
/*  66 */         int i1 = a(paramInt1 - 1, paramInt2, paramInt3, false);
/*  67 */         int i2 = a(paramInt1, paramInt2, paramInt3 + 1, false);
/*  68 */         int i3 = a(paramInt1, paramInt2, paramInt3 - 1, false);
/*  69 */         if (n > m) m = n; 
/*  70 */         if (i1 > m) m = i1; 
/*  71 */         if (i2 > m) m = i2; 
/*  72 */         if (i3 > m) m = i3; 
/*  73 */         return m;
/*     */       } 
/*     */     } 
/*     */     
/*  77 */     if (paramInt2 < 0) return 0; 
/*  78 */     if (paramInt2 >= 128) {
/*  79 */       int k = 15 - this.d.e;
/*  80 */       if (k < 0) k = 0; 
/*  81 */       return k;
/*     */     } 
/*     */     
/*  84 */     int i = (paramInt1 >> 4) - this.a;
/*  85 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  87 */     return this.c[i][j].c(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, this.d.e);
/*     */   }
/*     */   
/*     */   public int e(int paramInt1, int paramInt2, int paramInt3) {
/*  91 */     if (paramInt2 < 0) return 0; 
/*  92 */     if (paramInt2 >= 128) return 0; 
/*  93 */     int i = (paramInt1 >> 4) - this.a;
/*  94 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  96 */     return this.c[i][j].b(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */   public fs f(int paramInt1, int paramInt2, int paramInt3) {
/* 100 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 101 */     if (i == 0) return fs.a; 
/* 102 */     return (ln.n[i]).bl;
/*     */   }
/*     */   
/*     */   public boolean g(int paramInt1, int paramInt2, int paramInt3) {
/* 106 */     ln ln = ln.n[a(paramInt1, paramInt2, paramInt3)];
/* 107 */     if (ln == null) return false; 
/* 108 */     return ln.b();
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ce.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */