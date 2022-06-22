/*     */ import java.util.Random;
/*     */ 
/*     */ public class hl
/*     */   extends jf {
/*     */   int a;
/*     */   boolean[] b;
/*     */   int[] c;
/*     */   
/*     */   protected hl(int paramInt, fs paramfs) {
/*  10 */     super(paramInt, paramfs);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  20 */     this.a = 0;
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
/* 106 */     this.b = new boolean[4];
/* 107 */     this.c = new int[4]; } private void j(cj paramcj, int paramInt1, int paramInt2, int paramInt3) { int i = paramcj.e(paramInt1, paramInt2, paramInt3); paramcj.a(paramInt1, paramInt2, paramInt3, this.ba + 1, i);
/*     */     paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     paramcj.h(paramInt1, paramInt2, paramInt3); }
/* 110 */   private int a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { int i = 1000;
/* 111 */     for (byte b = 0; b < 4; b++) {
/* 112 */       if ((b != 0 || paramInt5 != 1) && (
/* 113 */         b != 1 || paramInt5 != 0) && (
/* 114 */         b != 2 || paramInt5 != 3) && (
/* 115 */         b != 3 || paramInt5 != 2)) {
/*     */         
/* 117 */         int j = paramInt1;
/* 118 */         int k = paramInt2;
/* 119 */         int m = paramInt3;
/*     */         
/* 121 */         if (b == 0) j--; 
/* 122 */         if (b == 1) j++; 
/* 123 */         if (b == 2) m--; 
/* 124 */         if (b == 3) m++;
/*     */         
/* 126 */         if (!l(paramcj, j, k, m))
/*     */         {
/* 128 */           if (paramcj.f(j, k, m) != this.bl || paramcj.e(j, k, m) != 0) {
/*     */ 
/*     */             
/* 131 */             if (!l(paramcj, j, k - 1, m)) {
/* 132 */               return paramInt4;
/*     */             }
/* 134 */             if (paramInt4 < 4) {
/* 135 */               int n = a(paramcj, j, k, m, paramInt4 + 1, b);
/* 136 */               if (n < i) i = n; 
/*     */             } 
/*     */           }  } 
/*     */       } 
/*     */     } 
/* 141 */     return i; }
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) { int i = h(paramcj, paramInt1, paramInt2, paramInt3); boolean bool = true; if (i > 0) { int j = -100; this.a = 0; j = f(paramcj, paramInt1 - 1, paramInt2, paramInt3, j); j = f(paramcj, paramInt1 + 1, paramInt2, paramInt3, j); j = f(paramcj, paramInt1, paramInt2, paramInt3 - 1, j); j = f(paramcj, paramInt1, paramInt2, paramInt3 + 1, j); int k = j + this.d; if (k >= 8 || j < 0) k = -1;  if (h(paramcj, paramInt1, paramInt2 + 1, paramInt3) >= 0) { int m = h(paramcj, paramInt1, paramInt2 + 1, paramInt3); if (m >= 8) { k = m; } else { k = m + 8; }  }  if (this.a >= 2 && this.bl == fs.f) if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) { k = 0; } else if (paramcj.f(paramInt1, paramInt2 - 1, paramInt3) == this.bl && paramcj.e(paramInt1, paramInt2, paramInt3) == 0) { k = 0; }   if (this.bl == fs.g && i < 8 && k < 8 && k > i && paramRandom.nextInt(4) != 0) { k = i; bool = false; }  if (k != i) { i = k; if (i < 0) { paramcj.d(paramInt1, paramInt2, paramInt3, 0); } else { paramcj.b(paramInt1, paramInt2, paramInt3, i); paramcj.h(paramInt1, paramInt2, paramInt3, this.ba); paramcj.g(paramInt1, paramInt2, paramInt3, this.ba); }  } else if (bool) { j(paramcj, paramInt1, paramInt2, paramInt3); }  } else { j(paramcj, paramInt1, paramInt2, paramInt3); }  if (m(paramcj, paramInt1, paramInt2 - 1, paramInt3)) { if (i >= 8) { paramcj.b(paramInt1, paramInt2 - 1, paramInt3, this.ba, i); } else { paramcj.b(paramInt1, paramInt2 - 1, paramInt3, this.ba, i + 8); }  } else if (i >= 0 && (i == 0 || l(paramcj, paramInt1, paramInt2 - 1, paramInt3))) { boolean[] arrayOfBoolean = k(paramcj, paramInt1, paramInt2, paramInt3); int j = i + this.d; if (i >= 8) j = 1;  if (j >= 8)
/*     */         return;  if (arrayOfBoolean[0])
/*     */         g(paramcj, paramInt1 - 1, paramInt2, paramInt3, j);  if (arrayOfBoolean[1])
/*     */         g(paramcj, paramInt1 + 1, paramInt2, paramInt3, j);  if (arrayOfBoolean[2])
/*     */         g(paramcj, paramInt1, paramInt2, paramInt3 - 1, j);  if (arrayOfBoolean[3])
/* 147 */         g(paramcj, paramInt1, paramInt2, paramInt3 + 1, j);  }  } private boolean[] k(cj paramcj, int paramInt1, int paramInt2, int paramInt3) { int i; for (i = 0; i < 4; i++) {
/* 148 */       this.c[i] = 1000;
/* 149 */       int j = paramInt1;
/* 150 */       int k = paramInt2;
/* 151 */       int m = paramInt3;
/*     */       
/* 153 */       if (i == 0) j--; 
/* 154 */       if (i == 1) j++; 
/* 155 */       if (i == 2) m--; 
/* 156 */       if (i == 3) m++; 
/* 157 */       if (!l(paramcj, j, k, m))
/*     */       {
/* 159 */         if (paramcj.f(j, k, m) != this.bl || paramcj.e(j, k, m) != 0)
/*     */         {
/*     */           
/* 162 */           if (!l(paramcj, j, k - 1, m)) {
/* 163 */             this.c[i] = 0;
/*     */           } else {
/* 165 */             this.c[i] = a(paramcj, j, k, m, 1, i);
/*     */           } 
/*     */         }
/*     */       }
/*     */     } 
/* 170 */     i = this.c[0]; byte b;
/* 171 */     for (b = 1; b < 4; b++) {
/* 172 */       if (this.c[b] < i) i = this.c[b];
/*     */     
/*     */     } 
/*     */     
/* 176 */     for (b = 0; b < 4; b++) {
/* 177 */       this.b[b] = (this.c[b] == i);
/*     */     }
/* 179 */     return this.b; }
/*     */   private void g(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (m(paramcj, paramInt1, paramInt2, paramInt3)) { int i = paramcj.a(paramInt1, paramInt2, paramInt3); if (i > 0)
/*     */         if (this.bl == fs.g) { i(paramcj, paramInt1, paramInt2, paramInt3); } else { ln.n[i].b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3)); }
/*     */           paramcj.b(paramInt1, paramInt2, paramInt3, this.ba, paramInt4); }
/* 183 */      } private boolean l(cj paramcj, int paramInt1, int paramInt2, int paramInt3) { int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/* 184 */     if (i == ln.aE.ba || i == ln.aL.ba || i == ln.aD.ba || i == ln.aF.ba || i == ln.aX.ba) {
/* 185 */       return true;
/*     */     }
/* 187 */     if (i == 0) return false; 
/* 188 */     fs fs = (ln.n[i]).bl;
/* 189 */     if (fs.a()) return true; 
/* 190 */     return false; }
/*     */ 
/*     */   
/*     */   protected int f(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 194 */     int i = h(paramcj, paramInt1, paramInt2, paramInt3);
/* 195 */     if (i < 0) return paramInt4; 
/* 196 */     if (i == 0) this.a++; 
/* 197 */     if (i >= 8) {
/* 198 */       i = 0;
/*     */     }
/* 200 */     return (paramInt4 < 0 || i < paramInt4) ? i : paramInt4;
/*     */   }
/*     */   
/*     */   private boolean m(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 204 */     fs fs = paramcj.f(paramInt1, paramInt2, paramInt3);
/* 205 */     if (fs == this.bl) return false; 
/* 206 */     if (fs == fs.g) return false; 
/* 207 */     return !l(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 211 */     super.e(paramcj, paramInt1, paramInt2, paramInt3);
/* 212 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) == this.ba)
/* 213 */       paramcj.h(paramInt1, paramInt2, paramInt3, this.ba); 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */