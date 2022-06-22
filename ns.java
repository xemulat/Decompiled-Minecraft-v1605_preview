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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ns
/*     */   extends ln
/*     */ {
/*  21 */   private int[] a = new int[256];
/*  22 */   private int[] b = new int[256];
/*     */   
/*     */   protected ns(int paramInt1, int paramInt2) {
/*  25 */     super(paramInt1, paramInt2, fs.l);
/*     */     
/*  27 */     a(ln.x.ba, 5, 20);
/*  28 */     a(ln.J.ba, 5, 5);
/*  29 */     a(ln.K.ba, 30, 60);
/*  30 */     a(ln.an.ba, 30, 20);
/*  31 */     a(ln.am.ba, 15, 100);
/*  32 */     a(ln.ab.ba, 30, 60);
/*     */     
/*  34 */     b(true);
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3) {
/*  38 */     this.a[paramInt1] = paramInt2;
/*  39 */     this.b[paramInt1] = paramInt3;
/*     */   }
/*     */ 
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  44 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  52 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  56 */     return false;
/*     */   }
/*     */   
/*     */   public int f() {
/*  60 */     return 3;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/*  64 */     return 0;
/*     */   }
/*     */   
/*     */   public int a() {
/*  68 */     return 10;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  72 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  73 */     if (i < 15) {
/*  74 */       paramcj.b(paramInt1, paramInt2, paramInt3, i + 1);
/*  75 */       paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*     */     } 
/*  77 */     if (!h(paramcj, paramInt1, paramInt2, paramInt3)) {
/*  78 */       if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3) || i > 3) paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       
/*     */       return;
/*     */     } 
/*  82 */     if (!b(paramcj, paramInt1, paramInt2 - 1, paramInt3) && 
/*  83 */       i == 15 && paramRandom.nextInt(4) == 0) {
/*  84 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  89 */     if (i % 2 == 0 && i > 2) {
/*  90 */       a(paramcj, paramInt1 + 1, paramInt2, paramInt3, 300, paramRandom);
/*  91 */       a(paramcj, paramInt1 - 1, paramInt2, paramInt3, 300, paramRandom);
/*  92 */       a(paramcj, paramInt1, paramInt2 - 1, paramInt3, 200, paramRandom);
/*  93 */       a(paramcj, paramInt1, paramInt2 + 1, paramInt3, 250, paramRandom);
/*  94 */       a(paramcj, paramInt1, paramInt2, paramInt3 - 1, 300, paramRandom);
/*  95 */       a(paramcj, paramInt1, paramInt2, paramInt3 + 1, 300, paramRandom);
/*     */       
/*  97 */       for (int j = paramInt1 - 1; j <= paramInt1 + 1; j++) {
/*  98 */         for (int k = paramInt3 - 1; k <= paramInt3 + 1; k++) {
/*  99 */           for (int m = paramInt2 - 1; m <= paramInt2 + 4; m++) {
/* 100 */             if (j != paramInt1 || m != paramInt2 || k != paramInt3) {
/*     */               
/* 102 */               int n = 100;
/* 103 */               if (m > paramInt2 + 1) {
/* 104 */                 n += (m - paramInt2 + 1) * 100;
/*     */               }
/*     */               
/* 107 */               int i1 = i(paramcj, j, m, k);
/* 108 */               if (i1 > 0 && paramRandom.nextInt(n) <= i1)
/* 109 */                 paramcj.d(j, m, k, this.ba); 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
/* 118 */     int i = this.b[paramcj.a(paramInt1, paramInt2, paramInt3)];
/* 119 */     if (paramRandom.nextInt(paramInt4) < i) {
/* 120 */       boolean bool = (paramcj.a(paramInt1, paramInt2, paramInt3) == ln.am.ba) ? true : false;
/* 121 */       if (paramRandom.nextInt(2) == 0) {
/* 122 */         paramcj.d(paramInt1, paramInt2, paramInt3, this.ba);
/*     */       } else {
/* 124 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/* 126 */       if (bool) {
/* 127 */         ln.am.b(paramcj, paramInt1, paramInt2, paramInt3, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 133 */     if (b(paramcj, paramInt1 + 1, paramInt2, paramInt3)) return true; 
/* 134 */     if (b(paramcj, paramInt1 - 1, paramInt2, paramInt3)) return true; 
/* 135 */     if (b(paramcj, paramInt1, paramInt2 - 1, paramInt3)) return true; 
/* 136 */     if (b(paramcj, paramInt1, paramInt2 + 1, paramInt3)) return true; 
/* 137 */     if (b(paramcj, paramInt1, paramInt2, paramInt3 - 1)) return true; 
/* 138 */     if (b(paramcj, paramInt1, paramInt2, paramInt3 + 1)) return true;
/*     */     
/* 140 */     return false;
/*     */   }
/*     */   
/*     */   private int i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 144 */     int i = 0;
/* 145 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != 0) return 0;
/*     */     
/* 147 */     i = g(paramcj, paramInt1 + 1, paramInt2, paramInt3, i);
/* 148 */     i = g(paramcj, paramInt1 - 1, paramInt2, paramInt3, i);
/* 149 */     i = g(paramcj, paramInt1, paramInt2 - 1, paramInt3, i);
/* 150 */     i = g(paramcj, paramInt1, paramInt2 + 1, paramInt3, i);
/* 151 */     i = g(paramcj, paramInt1, paramInt2, paramInt3 - 1, i);
/* 152 */     i = g(paramcj, paramInt1, paramInt2, paramInt3 + 1, i);
/*     */     
/* 154 */     return i;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 158 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 162 */     return (this.a[parammz.a(paramInt1, paramInt2, paramInt3)] > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int g(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 167 */     int i = this.a[paramcj.a(paramInt1, paramInt2, paramInt3)];
/* 168 */     if (i > paramInt4) return i; 
/* 169 */     return paramInt4;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 174 */     return (paramcj.g(paramInt1, paramInt2 - 1, paramInt3) || h(paramcj, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 178 */     if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3) && !h(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 179 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 185 */     if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3) && !h(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 186 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       return;
/*     */     } 
/* 189 */     paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 210 */     if (paramRandom.nextInt(24) == 0) {
/* 211 */       paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "fire.fire", 1.0F + paramRandom.nextFloat(), paramRandom.nextFloat() * 0.7F + 0.3F);
/*     */     }
/*     */     
/* 214 */     if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3) || ln.ar.b(paramcj, paramInt1, paramInt2 - 1, paramInt3)) {
/* 215 */       for (byte b = 0; b < 3; b++) {
/* 216 */         float f1 = paramInt1 + paramRandom.nextFloat();
/* 217 */         float f2 = paramInt2 + paramRandom.nextFloat() * 0.5F + 0.5F;
/* 218 */         float f3 = paramInt3 + paramRandom.nextFloat();
/* 219 */         paramcj.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } else {
/* 222 */       if (ln.ar.b(paramcj, paramInt1 - 1, paramInt2, paramInt3)) {
/* 223 */         for (byte b = 0; b < 2; b++) {
/* 224 */           float f1 = paramInt1 + paramRandom.nextFloat() * 0.1F;
/* 225 */           float f2 = paramInt2 + paramRandom.nextFloat();
/* 226 */           float f3 = paramInt3 + paramRandom.nextFloat();
/* 227 */           paramcj.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/* 230 */       if (ln.ar.b(paramcj, paramInt1 + 1, paramInt2, paramInt3)) {
/* 231 */         for (byte b = 0; b < 2; b++) {
/* 232 */           float f1 = (paramInt1 + 1) - paramRandom.nextFloat() * 0.1F;
/* 233 */           float f2 = paramInt2 + paramRandom.nextFloat();
/* 234 */           float f3 = paramInt3 + paramRandom.nextFloat();
/* 235 */           paramcj.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/* 238 */       if (ln.ar.b(paramcj, paramInt1, paramInt2, paramInt3 - 1)) {
/* 239 */         for (byte b = 0; b < 2; b++) {
/* 240 */           float f1 = paramInt1 + paramRandom.nextFloat();
/* 241 */           float f2 = paramInt2 + paramRandom.nextFloat();
/* 242 */           float f3 = paramInt3 + paramRandom.nextFloat() * 0.1F;
/* 243 */           paramcj.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/* 246 */       if (ln.ar.b(paramcj, paramInt1, paramInt2, paramInt3 + 1)) {
/* 247 */         for (byte b = 0; b < 2; b++) {
/* 248 */           float f1 = paramInt1 + paramRandom.nextFloat();
/* 249 */           float f2 = paramInt2 + paramRandom.nextFloat();
/* 250 */           float f3 = (paramInt3 + 1) - paramRandom.nextFloat() * 0.1F;
/* 251 */           paramcj.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/* 254 */       if (ln.ar.b(paramcj, paramInt1, paramInt2 + 1, paramInt3))
/* 255 */         for (byte b = 0; b < 2; b++) {
/* 256 */           float f1 = paramInt1 + paramRandom.nextFloat();
/* 257 */           float f2 = (paramInt2 + 1) - paramRandom.nextFloat() * 0.1F;
/* 258 */           float f3 = paramInt3 + paramRandom.nextFloat();
/* 259 */           paramcj.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         }  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ns.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */