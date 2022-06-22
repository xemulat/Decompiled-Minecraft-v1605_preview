/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class jv
/*     */   extends ln
/*     */ {
/*     */   private boolean a = true;
/*     */   
/*     */   public jv(int paramInt1, int paramInt2) {
/*  14 */     super(paramInt1, paramInt2, fs.n);
/*  15 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/*  19 */     return this.aZ + ((paramInt2 > 0) ? 16 : 0);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  23 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  27 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  31 */     return false;
/*     */   }
/*     */   
/*     */   public int f() {
/*  35 */     return 5;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  39 */     return paramcj.g(paramInt1, paramInt2 - 1, paramInt3);
/*     */   }
/*     */   
/*     */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  43 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  44 */     int j = 0;
/*     */     
/*  46 */     this.a = false;
/*  47 */     boolean bool = paramcj.p(paramInt1, paramInt2, paramInt3);
/*  48 */     this.a = true;
/*     */     
/*  50 */     if (bool) {
/*  51 */       j = 15;
/*     */     } else {
/*  53 */       for (byte b = 0; b < 4; b++) {
/*  54 */         int k = paramInt1;
/*  55 */         int m = paramInt3;
/*  56 */         if (b == 0) k--; 
/*  57 */         if (b == 1) k++; 
/*  58 */         if (b == 2) m--; 
/*  59 */         if (b == 3) m++;
/*     */ 
/*     */         
/*  62 */         j = g(paramcj, k, paramInt2, m, j);
/*  63 */         if (paramcj.g(k, paramInt2, m) && !paramcj.g(paramInt1, paramInt2 + 1, paramInt3)) {
/*  64 */           j = g(paramcj, k, paramInt2 + 1, m, j);
/*  65 */         } else if (!paramcj.g(k, paramInt2, m)) {
/*  66 */           j = g(paramcj, k, paramInt2 - 1, m, j);
/*     */         } 
/*     */       } 
/*  69 */       if (j > 0) { j--; }
/*  70 */       else { j = 0; }
/*     */     
/*     */     } 
/*  73 */     if (i != j) {
/*  74 */       paramcj.b(paramInt1, paramInt2, paramInt3, j);
/*  75 */       paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/*  77 */       if (j > 0) j--; 
/*  78 */       for (byte b = 0; b < 4; b++) {
/*  79 */         int k = paramInt1;
/*  80 */         int m = paramInt3;
/*  81 */         int n = paramInt2 - 1;
/*  82 */         if (b == 0) k--; 
/*  83 */         if (b == 1) k++; 
/*  84 */         if (b == 2) m--; 
/*  85 */         if (b == 3) m++;
/*     */         
/*  87 */         if (paramcj.g(k, paramInt2, m)) n += 2;
/*     */         
/*  89 */         int i1 = g(paramcj, k, paramInt2, m, -1);
/*  90 */         if (i1 >= 0 && i1 != j) {
/*  91 */           h(paramcj, k, paramInt2, m);
/*     */         }
/*  93 */         i1 = g(paramcj, k, n, m, -1);
/*  94 */         if (i1 >= 0 && i1 != j) {
/*  95 */           h(paramcj, k, n, m);
/*     */         }
/*     */       } 
/*     */       
/*  99 */       if (i == 0 || j == 0) {
/* 100 */         paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 101 */         paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 102 */         paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 103 */         paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 104 */         paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */         
/* 106 */         paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/* 107 */         paramcj.g(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 113 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != this.ba)
/*     */       return; 
/* 115 */     paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 116 */     paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 117 */     paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 118 */     paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 119 */     paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     
/* 121 */     paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/* 122 */     paramcj.g(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 126 */     super.e(paramcj, paramInt1, paramInt2, paramInt3);
/* 127 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/* 128 */     paramcj.g(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/* 129 */     paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     
/* 131 */     i(paramcj, paramInt1 - 1, paramInt2, paramInt3);
/* 132 */     i(paramcj, paramInt1 + 1, paramInt2, paramInt3);
/* 133 */     i(paramcj, paramInt1, paramInt2, paramInt3 - 1);
/* 134 */     i(paramcj, paramInt1, paramInt2, paramInt3 + 1);
/*     */     
/* 136 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) { i(paramcj, paramInt1 - 1, paramInt2 + 1, paramInt3); }
/* 137 */     else { i(paramcj, paramInt1 - 1, paramInt2 - 1, paramInt3); }
/* 138 */      if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) { i(paramcj, paramInt1 + 1, paramInt2 + 1, paramInt3); }
/* 139 */     else { i(paramcj, paramInt1 + 1, paramInt2 - 1, paramInt3); }
/* 140 */      if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) { i(paramcj, paramInt1, paramInt2 + 1, paramInt3 - 1); }
/* 141 */     else { i(paramcj, paramInt1, paramInt2 - 1, paramInt3 - 1); }
/* 142 */      if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) { i(paramcj, paramInt1, paramInt2 + 1, paramInt3 + 1); }
/* 143 */     else { i(paramcj, paramInt1, paramInt2 - 1, paramInt3 + 1); }
/*     */   
/*     */   }
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 147 */     super.b(paramcj, paramInt1, paramInt2, paramInt3);
/* 148 */     paramcj.g(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/* 149 */     paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/* 150 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */     
/* 152 */     i(paramcj, paramInt1 - 1, paramInt2, paramInt3);
/* 153 */     i(paramcj, paramInt1 + 1, paramInt2, paramInt3);
/* 154 */     i(paramcj, paramInt1, paramInt2, paramInt3 - 1);
/* 155 */     i(paramcj, paramInt1, paramInt2, paramInt3 + 1);
/*     */     
/* 157 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) { i(paramcj, paramInt1 - 1, paramInt2 + 1, paramInt3); }
/* 158 */     else { i(paramcj, paramInt1 - 1, paramInt2 - 1, paramInt3); }
/* 159 */      if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) { i(paramcj, paramInt1 + 1, paramInt2 + 1, paramInt3); }
/* 160 */     else { i(paramcj, paramInt1 + 1, paramInt2 - 1, paramInt3); }
/* 161 */      if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) { i(paramcj, paramInt1, paramInt2 + 1, paramInt3 - 1); }
/* 162 */     else { i(paramcj, paramInt1, paramInt2 - 1, paramInt3 - 1); }
/* 163 */      if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) { i(paramcj, paramInt1, paramInt2 + 1, paramInt3 + 1); }
/* 164 */     else { i(paramcj, paramInt1, paramInt2 - 1, paramInt3 + 1); }
/*     */   
/*     */   }
/*     */   private int g(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 168 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != this.ba) return paramInt4; 
/* 169 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 170 */     if (i > paramInt4) return i; 
/* 171 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 175 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 176 */     boolean bool = a(paramcj, paramInt1, paramInt2, paramInt3);
/*     */     
/* 178 */     if (!bool) {
/* 179 */       b_(paramcj, paramInt1, paramInt2, paramInt3, i);
/* 180 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */     } else {
/* 182 */       h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */     
/* 185 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 189 */     return dd.aA.aQ;
/*     */   }
/*     */   
/*     */   public boolean c(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 193 */     if (!this.a) return false; 
/* 194 */     return b(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 198 */     if (!this.a) return false; 
/* 199 */     if (parammz.e(paramInt1, paramInt2, paramInt3) == 0) return false;
/*     */     
/* 201 */     if (paramInt4 == 1) return true;
/*     */     
/* 203 */     boolean bool1 = (b(parammz, paramInt1 - 1, paramInt2, paramInt3) || (!parammz.g(paramInt1 - 1, paramInt2, paramInt3) && b(parammz, paramInt1 - 1, paramInt2 - 1, paramInt3))) ? true : false;
/* 204 */     boolean bool2 = (b(parammz, paramInt1 + 1, paramInt2, paramInt3) || (!parammz.g(paramInt1 + 1, paramInt2, paramInt3) && b(parammz, paramInt1 + 1, paramInt2 - 1, paramInt3))) ? true : false;
/* 205 */     boolean bool3 = (b(parammz, paramInt1, paramInt2, paramInt3 - 1) || (!parammz.g(paramInt1, paramInt2, paramInt3 - 1) && b(parammz, paramInt1, paramInt2 - 1, paramInt3 - 1))) ? true : false;
/* 206 */     boolean bool4 = (b(parammz, paramInt1, paramInt2, paramInt3 + 1) || (!parammz.g(paramInt1, paramInt2, paramInt3 + 1) && b(parammz, paramInt1, paramInt2 - 1, paramInt3 + 1))) ? true : false;
/* 207 */     if (!parammz.g(paramInt1, paramInt2 + 1, paramInt3)) {
/* 208 */       if (parammz.g(paramInt1 - 1, paramInt2, paramInt3) && b(parammz, paramInt1 - 1, paramInt2 + 1, paramInt3)) bool1 = true; 
/* 209 */       if (parammz.g(paramInt1 + 1, paramInt2, paramInt3) && b(parammz, paramInt1 + 1, paramInt2 + 1, paramInt3)) bool2 = true; 
/* 210 */       if (parammz.g(paramInt1, paramInt2, paramInt3 - 1) && b(parammz, paramInt1, paramInt2 + 1, paramInt3 - 1)) bool3 = true; 
/* 211 */       if (parammz.g(paramInt1, paramInt2, paramInt3 + 1) && b(parammz, paramInt1, paramInt2 + 1, paramInt3 + 1)) bool4 = true;
/*     */     
/*     */     } 
/* 214 */     if (!bool3 && !bool2 && !bool1 && !bool4 && paramInt4 >= 2 && paramInt4 <= 5) return true;
/*     */     
/* 216 */     if (paramInt4 == 2 && bool3 && !bool1 && !bool2) return true; 
/* 217 */     if (paramInt4 == 3 && bool4 && !bool1 && !bool2) return true; 
/* 218 */     if (paramInt4 == 4 && bool1 && !bool3 && !bool4) return true; 
/* 219 */     if (paramInt4 == 5 && bool2 && !bool3 && !bool4) return true;
/*     */     
/* 221 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 225 */     return this.a;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 229 */     if (paramcj.e(paramInt1, paramInt2, paramInt3) > 0) {
/* 230 */       double d1 = paramInt1 + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 231 */       double d2 = (paramInt2 + 0.0625F);
/* 232 */       double d3 = paramInt3 + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 233 */       paramcj.a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 238 */     int i = parammz.a(paramInt1, paramInt2, paramInt3);
/* 239 */     if (i == ln.av.ba) return true; 
/* 240 */     if (i == 0) return false; 
/* 241 */     if (ln.n[i].d()) return true; 
/* 242 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */