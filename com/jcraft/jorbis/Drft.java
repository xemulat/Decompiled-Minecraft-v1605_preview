/*      */ package com.jcraft.jorbis;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class Drft
/*      */ {
/*      */   int n;
/*      */   float[] trigcache;
/*      */   int[] splitcache;
/*      */   
/*      */   void backward(float[] paramArrayOffloat) {
/*   35 */     if (this.n == 1)
/*      */       return; 
/*   37 */     drftb1(this.n, paramArrayOffloat, this.trigcache, this.trigcache, this.n, this.splitcache);
/*      */   }
/*      */   
/*      */   void init(int paramInt) {
/*   41 */     this.n = paramInt;
/*   42 */     this.trigcache = new float[3 * paramInt];
/*   43 */     this.splitcache = new int[32];
/*   44 */     fdrffti(paramInt, this.trigcache, this.splitcache);
/*      */   }
/*      */   
/*      */   void clear() {
/*   48 */     if (this.trigcache != null)
/*   49 */       this.trigcache = null; 
/*   50 */     if (this.splitcache != null)
/*   51 */       this.splitcache = null; 
/*      */   }
/*      */   
/*   54 */   static int[] ntryh = new int[] { 4, 2, 3, 5 };
/*   55 */   static float tpi = 6.2831855F;
/*   56 */   static float hsqt2 = 0.70710677F;
/*   57 */   static float taui = 0.8660254F;
/*   58 */   static float taur = -0.5F;
/*   59 */   static float sqrt2 = 1.4142135F;
/*      */ 
/*      */   
/*      */   static void drfti1(int paramInt1, float[] paramArrayOffloat, int paramInt2, int[] paramArrayOfint) {
/*   63 */     int i = 0; byte b = -1;
/*      */ 
/*      */ 
/*      */     
/*   67 */     int n = paramInt1;
/*   68 */     byte b2 = 0;
/*      */     
/*   70 */     byte b3 = 101; while (true) {
/*      */       byte b4; int i1;
/*      */       int i2;
/*   73 */       switch (b3) {
/*      */         case 101:
/*   75 */           b++;
/*   76 */           if (b < 4)
/*   77 */           { i = ntryh[b]; }
/*      */           else
/*   79 */           { i += 2; } 
/*      */         case 104:
/*   81 */           i1 = n / i;
/*   82 */           i2 = n - i * i1;
/*   83 */           if (i2 != 0) {
/*   84 */             b3 = 101;
/*      */             continue;
/*      */           } 
/*   87 */           b2++;
/*   88 */           paramArrayOfint[b2 + 1] = i;
/*   89 */           n = i1;
/*   90 */           if (i != 2) {
/*   91 */             b3 = 107;
/*      */             continue;
/*      */           } 
/*   94 */           if (b2 == 1) {
/*   95 */             b3 = 107;
/*      */             
/*      */             continue;
/*      */           } 
/*   99 */           for (b4 = 1; b4 < b2; b4++) {
/*  100 */             int i3 = b2 - b4 + 1;
/*  101 */             paramArrayOfint[i3 + 1] = paramArrayOfint[i3];
/*      */           } 
/*  103 */           paramArrayOfint[2] = 2;
/*      */         case 107:
/*  105 */           if (n != 1) {
/*  106 */             b3 = 104; continue;
/*      */           }  break;
/*      */       } 
/*  109 */     }  paramArrayOfint[0] = paramInt1;
/*  110 */     paramArrayOfint[1] = b2;
/*  111 */     float f = tpi / paramInt1;
/*  112 */     int k = 0;
/*  113 */     int m = b2 - 1;
/*  114 */     int j = 1;
/*      */     
/*  116 */     if (m == 0) {
/*      */       return;
/*      */     }
/*  119 */     for (byte b1 = 0; b1 < m; b1++) {
/*  120 */       int i3 = paramArrayOfint[b1 + 2];
/*  121 */       int i2 = 0;
/*  122 */       int i1 = j * i3;
/*  123 */       int i4 = paramInt1 / i1;
/*  124 */       int i5 = i3 - 1;
/*      */       
/*  126 */       for (b = 0; b < i5; b++) {
/*  127 */         i2 += j;
/*  128 */         int i6 = k;
/*  129 */         float f1 = i2 * f;
/*  130 */         float f2 = 0.0F;
/*  131 */         for (byte b4 = 2; b4 < i4; b4 += 2) {
/*  132 */           f2++;
/*  133 */           float f3 = f2 * f1;
/*  134 */           paramArrayOffloat[paramInt2 + i6++] = (float)Math.cos(f3);
/*  135 */           paramArrayOffloat[paramInt2 + i6++] = (float)Math.sin(f3);
/*      */         } 
/*  137 */         k += i4;
/*      */       } 
/*  139 */       j = i1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void fdrffti(int paramInt, float[] paramArrayOffloat, int[] paramArrayOfint) {
/*  147 */     if (paramInt == 1)
/*      */       return; 
/*  149 */     drfti1(paramInt, paramArrayOffloat, paramInt, paramArrayOfint);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradf2(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3) {
/*  158 */     int j = 0;
/*  159 */     int k = paramInt2 * paramInt1, i = k;
/*  160 */     int m = paramInt1 << 1; byte b;
/*  161 */     for (b = 0; b < paramInt2; b++) {
/*  162 */       paramArrayOffloat2[j << 1] = paramArrayOffloat1[j] + paramArrayOffloat1[k];
/*  163 */       paramArrayOffloat2[(j << 1) + m - 1] = paramArrayOffloat1[j] - paramArrayOffloat1[k];
/*  164 */       j += paramInt1;
/*  165 */       k += paramInt1;
/*      */     } 
/*      */     
/*  168 */     if (paramInt1 < 2) {
/*      */       return;
/*      */     }
/*  171 */     if (paramInt1 != 2) {
/*  172 */       j = 0;
/*  173 */       k = i;
/*  174 */       for (b = 0; b < paramInt2; b++) {
/*  175 */         m = k;
/*  176 */         int n = (j << 1) + (paramInt1 << 1);
/*  177 */         int i1 = j;
/*  178 */         int i2 = j + j;
/*  179 */         for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
/*  180 */           m += 2;
/*  181 */           n -= 2;
/*  182 */           i1 += 2;
/*  183 */           i2 += 2;
/*  184 */           float f2 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m];
/*  185 */           float f1 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m - 1];
/*  186 */           paramArrayOffloat2[i2] = paramArrayOffloat1[i1] + f1;
/*  187 */           paramArrayOffloat2[n] = f1 - paramArrayOffloat1[i1];
/*  188 */           paramArrayOffloat2[i2 - 1] = paramArrayOffloat1[i1 - 1] + f2;
/*  189 */           paramArrayOffloat2[n - 1] = paramArrayOffloat1[i1 - 1] - f2;
/*      */         } 
/*  191 */         j += paramInt1;
/*  192 */         k += paramInt1;
/*      */       } 
/*  194 */       if (paramInt1 % 2 == 1) {
/*      */         return;
/*      */       }
/*      */     } 
/*  198 */     m = k = (j = paramInt1) - 1;
/*  199 */     k += i;
/*  200 */     for (b = 0; b < paramInt2; b++) {
/*  201 */       paramArrayOffloat2[j] = -paramArrayOffloat1[k];
/*  202 */       paramArrayOffloat2[j - 1] = paramArrayOffloat1[m];
/*  203 */       j += paramInt1 << 1;
/*  204 */       k += paramInt1;
/*  205 */       m += paramInt1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradf4(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3, float[] paramArrayOffloat4, int paramInt4, float[] paramArrayOffloat5, int paramInt5) {
/*  213 */     int i = paramInt2 * paramInt1;
/*      */     
/*  215 */     int j = i;
/*  216 */     int n = j << 1;
/*  217 */     int k = j + (j << 1);
/*  218 */     int m = 0;
/*      */     byte b;
/*  220 */     for (b = 0; b < paramInt2; b++) {
/*  221 */       float f1 = paramArrayOffloat1[j] + paramArrayOffloat1[k];
/*  222 */       float f2 = paramArrayOffloat1[m] + paramArrayOffloat1[n];
/*      */       int i3;
/*  224 */       paramArrayOffloat2[i3 = m << 2] = f1 + f2;
/*  225 */       paramArrayOffloat2[(paramInt1 << 2) + i3 - 1] = f2 - f1;
/*  226 */       paramArrayOffloat2[(i3 += paramInt1 << 1) - 1] = paramArrayOffloat1[m] - paramArrayOffloat1[n];
/*  227 */       paramArrayOffloat2[i3] = paramArrayOffloat1[k] - paramArrayOffloat1[j];
/*      */       
/*  229 */       j += paramInt1;
/*  230 */       k += paramInt1;
/*  231 */       m += paramInt1;
/*  232 */       n += paramInt1;
/*      */     } 
/*  234 */     if (paramInt1 < 2) {
/*      */       return;
/*      */     }
/*  237 */     if (paramInt1 != 2) {
/*  238 */       j = 0;
/*  239 */       for (b = 0; b < paramInt2; b++) {
/*  240 */         k = j;
/*  241 */         n = j << 2;
/*  242 */         int i4, i3 = (i4 = paramInt1 << 1) + n;
/*  243 */         for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
/*  244 */           m = k += 2;
/*  245 */           n += 2;
/*  246 */           i3 -= 2;
/*      */           
/*  248 */           m += i;
/*  249 */           float f4 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m];
/*  250 */           float f1 = paramArrayOffloat3[paramInt3 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat3[paramInt3 + b1 - 1] * paramArrayOffloat1[m - 1];
/*  251 */           m += i;
/*  252 */           float f5 = paramArrayOffloat4[paramInt4 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat4[paramInt4 + b1 - 1] * paramArrayOffloat1[m];
/*  253 */           float f2 = paramArrayOffloat4[paramInt4 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat4[paramInt4 + b1 - 1] * paramArrayOffloat1[m - 1];
/*  254 */           m += i;
/*  255 */           float f6 = paramArrayOffloat5[paramInt5 + b1 - 2] * paramArrayOffloat1[m - 1] + paramArrayOffloat5[paramInt5 + b1 - 1] * paramArrayOffloat1[m];
/*  256 */           float f3 = paramArrayOffloat5[paramInt5 + b1 - 2] * paramArrayOffloat1[m] - paramArrayOffloat5[paramInt5 + b1 - 1] * paramArrayOffloat1[m - 1];
/*      */           
/*  258 */           float f11 = f4 + f6;
/*  259 */           float f14 = f6 - f4;
/*  260 */           float f7 = f1 + f3;
/*  261 */           float f10 = f1 - f3;
/*      */           
/*  263 */           float f8 = paramArrayOffloat1[k] + f2;
/*  264 */           float f9 = paramArrayOffloat1[k] - f2;
/*  265 */           float f12 = paramArrayOffloat1[k - 1] + f5;
/*  266 */           float f13 = paramArrayOffloat1[k - 1] - f5;
/*      */           
/*  268 */           paramArrayOffloat2[n - 1] = f11 + f12;
/*  269 */           paramArrayOffloat2[n] = f7 + f8;
/*      */           
/*  271 */           paramArrayOffloat2[i3 - 1] = f13 - f10;
/*  272 */           paramArrayOffloat2[i3] = f14 - f9;
/*      */           
/*  274 */           paramArrayOffloat2[n + i4 - 1] = f10 + f13;
/*  275 */           paramArrayOffloat2[n + i4] = f14 + f9;
/*      */           
/*  277 */           paramArrayOffloat2[i3 + i4 - 1] = f12 - f11;
/*  278 */           paramArrayOffloat2[i3 + i4] = f7 - f8;
/*      */         } 
/*  280 */         j += paramInt1;
/*      */       } 
/*  282 */       if ((paramInt1 & 0x1) != 0) {
/*      */         return;
/*      */       }
/*      */     } 
/*  286 */     k = (j = i + paramInt1 - 1) + (i << 1);
/*  287 */     m = paramInt1 << 2;
/*  288 */     n = paramInt1;
/*  289 */     int i1 = paramInt1 << 1;
/*  290 */     int i2 = paramInt1;
/*      */     
/*  292 */     for (b = 0; b < paramInt2; b++) {
/*  293 */       float f1 = -hsqt2 * (paramArrayOffloat1[j] + paramArrayOffloat1[k]);
/*  294 */       float f2 = hsqt2 * (paramArrayOffloat1[j] - paramArrayOffloat1[k]);
/*      */       
/*  296 */       paramArrayOffloat2[n - 1] = f2 + paramArrayOffloat1[i2 - 1];
/*  297 */       paramArrayOffloat2[n + i1 - 1] = paramArrayOffloat1[i2 - 1] - f2;
/*      */       
/*  299 */       paramArrayOffloat2[n] = f1 - paramArrayOffloat1[j + i];
/*  300 */       paramArrayOffloat2[n + i1] = f1 + paramArrayOffloat1[j + i];
/*      */       
/*  302 */       j += paramInt1;
/*  303 */       k += paramInt1;
/*  304 */       n += m;
/*  305 */       i2 += paramInt1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradfg(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, float[] paramArrayOffloat4, float[] paramArrayOffloat5, float[] paramArrayOffloat6, int paramInt5) {
/*  312 */     int m = 0;
/*      */ 
/*      */     
/*  315 */     float f1 = 0.0F, f3 = 0.0F;
/*      */ 
/*      */     
/*  318 */     float f2 = tpi / paramInt2;
/*  319 */     f1 = (float)Math.cos(f2);
/*  320 */     f3 = (float)Math.sin(f2);
/*  321 */     int i = paramInt2 + 1 >> 1;
/*  322 */     int i6 = paramInt2;
/*  323 */     int i5 = paramInt1;
/*  324 */     int i4 = paramInt1 - 1 >> 1;
/*  325 */     int j = paramInt3 * paramInt1;
/*  326 */     int i3 = paramInt2 * paramInt1;
/*      */     
/*  328 */     char c = 'd'; while (true) {
/*      */       byte b1; byte b2; byte b3; byte b4; byte b5; int i7; int i8; int i9; int i10; int i11; float f4; float f5;
/*  330 */       switch (c) {
/*      */         case 101:
/*  332 */           if (paramInt1 == 1) {
/*  333 */             c = 'w';
/*      */             continue;
/*      */           } 
/*  336 */           for (b5 = 0; b5 < paramInt4; b5++) {
/*  337 */             paramArrayOffloat5[b5] = paramArrayOffloat3[b5];
/*      */           }
/*  339 */           i8 = 0;
/*  340 */           for (b2 = 1; b2 < paramInt2; b2++) {
/*  341 */             i8 += j;
/*  342 */             m = i8;
/*  343 */             for (byte b6 = 0; b6 < paramInt3; b6++) {
/*  344 */               paramArrayOffloat4[m] = paramArrayOffloat2[m];
/*  345 */               m += paramInt1;
/*      */             } 
/*      */           } 
/*      */           
/*  349 */           i7 = -paramInt1;
/*  350 */           i8 = 0;
/*  351 */           if (i4 > paramInt3) {
/*  352 */             for (b2 = 1; b2 < paramInt2; b2++) {
/*  353 */               i8 += j;
/*  354 */               i7 += paramInt1;
/*  355 */               m = -paramInt1 + i8;
/*  356 */               for (byte b6 = 0; b6 < paramInt3; b6++) {
/*  357 */                 int i12 = i7 - 1;
/*  358 */                 m += paramInt1;
/*  359 */                 int i13 = m;
/*  360 */                 for (byte b7 = 2; b7 < paramInt1; b7 += 2) {
/*  361 */                   i12 += 2;
/*  362 */                   i13 += 2;
/*  363 */                   paramArrayOffloat4[i13 - 1] = paramArrayOffloat6[paramInt5 + i12 - 1] * paramArrayOffloat2[i13 - 1] + paramArrayOffloat6[paramInt5 + i12] * paramArrayOffloat2[i13];
/*  364 */                   paramArrayOffloat4[i13] = paramArrayOffloat6[paramInt5 + i12 - 1] * paramArrayOffloat2[i13] - paramArrayOffloat6[paramInt5 + i12] * paramArrayOffloat2[i13 - 1];
/*      */                 }
/*      */               
/*      */               } 
/*      */             } 
/*      */           } else {
/*      */             
/*  371 */             for (b2 = 1; b2 < paramInt2; b2++) {
/*  372 */               i7 += paramInt1;
/*  373 */               int i12 = i7 - 1;
/*  374 */               i8 += j;
/*  375 */               m = i8;
/*  376 */               for (byte b6 = 2; b6 < paramInt1; b6 += 2) {
/*  377 */                 i12 += 2;
/*  378 */                 m += 2;
/*  379 */                 int i13 = m;
/*  380 */                 for (byte b7 = 0; b7 < paramInt3; b7++) {
/*  381 */                   paramArrayOffloat4[i13 - 1] = paramArrayOffloat6[paramInt5 + i12 - 1] * paramArrayOffloat2[i13 - 1] + paramArrayOffloat6[paramInt5 + i12] * paramArrayOffloat2[i13];
/*  382 */                   paramArrayOffloat4[i13] = paramArrayOffloat6[paramInt5 + i12 - 1] * paramArrayOffloat2[i13] - paramArrayOffloat6[paramInt5 + i12] * paramArrayOffloat2[i13 - 1];
/*  383 */                   i13 += paramInt1;
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           
/*  389 */           i8 = 0;
/*  390 */           m = i6 * j;
/*  391 */           if (i4 < paramInt3) {
/*  392 */             for (b2 = 1; b2 < i; b2++) {
/*  393 */               i8 += j;
/*  394 */               m -= j;
/*  395 */               int i12 = i8;
/*  396 */               int i13 = m;
/*  397 */               for (byte b6 = 2; b6 < paramInt1; b6 += 2) {
/*  398 */                 i12 += 2;
/*  399 */                 i13 += 2;
/*  400 */                 int i14 = i12 - paramInt1;
/*  401 */                 int i15 = i13 - paramInt1;
/*  402 */                 for (byte b7 = 0; b7 < paramInt3; b7++) {
/*  403 */                   i14 += paramInt1;
/*  404 */                   i15 += paramInt1;
/*  405 */                   paramArrayOffloat2[i14 - 1] = paramArrayOffloat4[i14 - 1] + paramArrayOffloat4[i15 - 1];
/*  406 */                   paramArrayOffloat2[i15 - 1] = paramArrayOffloat4[i14] - paramArrayOffloat4[i15];
/*  407 */                   paramArrayOffloat2[i14] = paramArrayOffloat4[i14] + paramArrayOffloat4[i15];
/*  408 */                   paramArrayOffloat2[i15] = paramArrayOffloat4[i15 - 1] - paramArrayOffloat4[i14 - 1];
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           } else {
/*      */             
/*  414 */             for (b2 = 1; b2 < i; b2++) {
/*  415 */               i8 += j;
/*  416 */               m -= j;
/*  417 */               int i12 = i8;
/*  418 */               int i13 = m;
/*  419 */               for (byte b6 = 0; b6 < paramInt3; b6++) {
/*  420 */                 int i14 = i12;
/*  421 */                 int i15 = i13;
/*  422 */                 for (byte b7 = 2; b7 < paramInt1; b7 += 2) {
/*  423 */                   i14 += 2;
/*  424 */                   i15 += 2;
/*  425 */                   paramArrayOffloat2[i14 - 1] = paramArrayOffloat4[i14 - 1] + paramArrayOffloat4[i15 - 1];
/*  426 */                   paramArrayOffloat2[i15 - 1] = paramArrayOffloat4[i14] - paramArrayOffloat4[i15];
/*  427 */                   paramArrayOffloat2[i14] = paramArrayOffloat4[i14] + paramArrayOffloat4[i15];
/*  428 */                   paramArrayOffloat2[i15] = paramArrayOffloat4[i15 - 1] - paramArrayOffloat4[i14 - 1];
/*      */                 } 
/*  430 */                 i12 += paramInt1;
/*  431 */                 i13 += paramInt1;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         case 119:
/*  436 */           for (b5 = 0; b5 < paramInt4; b5++) {
/*  437 */             paramArrayOffloat3[b5] = paramArrayOffloat5[b5];
/*      */           }
/*  439 */           i8 = 0;
/*  440 */           m = i6 * paramInt4;
/*  441 */           for (b2 = 1; b2 < i; b2++) {
/*  442 */             i8 += j;
/*  443 */             m -= j;
/*  444 */             int i12 = i8 - paramInt1;
/*  445 */             int i13 = m - paramInt1;
/*  446 */             for (byte b6 = 0; b6 < paramInt3; b6++) {
/*  447 */               i12 += paramInt1;
/*  448 */               i13 += paramInt1;
/*  449 */               paramArrayOffloat2[i12] = paramArrayOffloat4[i12] + paramArrayOffloat4[i13];
/*  450 */               paramArrayOffloat2[i13] = paramArrayOffloat4[i13] - paramArrayOffloat4[i12];
/*      */             } 
/*      */           } 
/*      */           
/*  454 */           f5 = 1.0F;
/*  455 */           f4 = 0.0F;
/*  456 */           i8 = 0;
/*  457 */           m = i6 * paramInt4;
/*  458 */           i9 = (paramInt2 - 1) * paramInt4;
/*  459 */           for (b4 = 1; b4 < i; b4++) {
/*  460 */             i8 += paramInt4;
/*  461 */             m -= paramInt4;
/*  462 */             float f10 = f1 * f5 - f3 * f4;
/*  463 */             f4 = f1 * f4 + f3 * f5;
/*  464 */             f5 = f10;
/*  465 */             int i12 = i8;
/*  466 */             int i13 = m;
/*  467 */             int i14 = i9;
/*  468 */             int i15 = paramInt4;
/*      */             
/*  470 */             for (b5 = 0; b5 < paramInt4; b5++) {
/*  471 */               paramArrayOffloat5[i12++] = paramArrayOffloat3[b5] + f5 * paramArrayOffloat3[i15++];
/*  472 */               paramArrayOffloat5[i13++] = f4 * paramArrayOffloat3[i14++];
/*      */             } 
/*      */             
/*  475 */             float f6 = f5;
/*  476 */             float f9 = f4;
/*  477 */             float f8 = f5;
/*  478 */             float f7 = f4;
/*      */             
/*  480 */             i12 = paramInt4;
/*  481 */             i13 = (i6 - 1) * paramInt4;
/*  482 */             for (b2 = 2; b2 < i; b2++) {
/*  483 */               i12 += paramInt4;
/*  484 */               i13 -= paramInt4;
/*      */               
/*  486 */               float f = f6 * f8 - f9 * f7;
/*  487 */               f7 = f6 * f7 + f9 * f8;
/*  488 */               f8 = f;
/*      */               
/*  490 */               i14 = i8;
/*  491 */               i15 = m;
/*  492 */               int i16 = i12;
/*  493 */               int i17 = i13;
/*  494 */               for (b5 = 0; b5 < paramInt4; b5++) {
/*  495 */                 paramArrayOffloat5[i14++] = paramArrayOffloat5[i14++] + f8 * paramArrayOffloat3[i16++];
/*  496 */                 paramArrayOffloat5[i15++] = paramArrayOffloat5[i15++] + f7 * paramArrayOffloat3[i17++];
/*      */               } 
/*      */             } 
/*      */           } 
/*  500 */           i8 = 0;
/*  501 */           for (b2 = 1; b2 < i; b2++) {
/*  502 */             i8 += paramInt4;
/*  503 */             m = i8;
/*  504 */             for (b5 = 0; b5 < paramInt4; b5++) {
/*  505 */               paramArrayOffloat5[b5] = paramArrayOffloat5[b5] + paramArrayOffloat3[m++];
/*      */             }
/*      */           } 
/*  508 */           if (paramInt1 < paramInt3) {
/*  509 */             c = '';
/*      */             
/*      */             continue;
/*      */           } 
/*  513 */           i8 = 0;
/*  514 */           m = 0;
/*  515 */           for (b3 = 0; b3 < paramInt3; b3++) {
/*  516 */             i9 = i8;
/*  517 */             int i12 = m;
/*  518 */             for (byte b6 = 0; b6 < paramInt1; b6++)
/*  519 */               paramArrayOffloat1[i12++] = paramArrayOffloat4[i9++]; 
/*  520 */             i8 += paramInt1;
/*  521 */             m += i3;
/*      */           } 
/*  523 */           c = '';
/*      */ 
/*      */         
/*      */         case 132:
/*  527 */           for (b1 = 0; b1 < paramInt1; b1++) {
/*  528 */             i8 = b1;
/*  529 */             m = b1;
/*  530 */             for (b3 = 0; b3 < paramInt3; b3++) {
/*  531 */               paramArrayOffloat1[m] = paramArrayOffloat4[i8];
/*  532 */               i8 += paramInt1;
/*  533 */               m += i3;
/*      */             } 
/*      */           } 
/*      */         case 135:
/*  537 */           i8 = 0;
/*  538 */           m = paramInt1 << 1;
/*  539 */           i9 = 0;
/*  540 */           i10 = i6 * j;
/*  541 */           for (b2 = 1; b2 < i; b2++) {
/*  542 */             i8 += m;
/*  543 */             i9 += j;
/*  544 */             i10 -= j;
/*      */             
/*  546 */             int i12 = i8;
/*  547 */             int i13 = i9;
/*  548 */             int i14 = i10;
/*      */             
/*  550 */             for (b3 = 0; b3 < paramInt3; b3++) {
/*  551 */               paramArrayOffloat1[i12 - 1] = paramArrayOffloat4[i13];
/*  552 */               paramArrayOffloat1[i12] = paramArrayOffloat4[i14];
/*  553 */               i12 += i3;
/*  554 */               i13 += paramInt1;
/*  555 */               i14 += paramInt1;
/*      */             } 
/*      */           } 
/*      */           
/*  559 */           if (paramInt1 == 1)
/*      */             return; 
/*  561 */           if (i4 < paramInt3) {
/*  562 */             c = '';
/*      */             
/*      */             continue;
/*      */           } 
/*  566 */           i8 = -paramInt1;
/*  567 */           i9 = 0;
/*  568 */           i10 = 0;
/*  569 */           i11 = i6 * j;
/*  570 */           for (b2 = 1; b2 < i; b2++) {
/*  571 */             i8 += m;
/*  572 */             i9 += m;
/*  573 */             i10 += j;
/*  574 */             i11 -= j;
/*  575 */             int i12 = i8;
/*  576 */             int i13 = i9;
/*  577 */             int i14 = i10;
/*  578 */             int i15 = i11;
/*  579 */             for (b3 = 0; b3 < paramInt3; b3++)
/*  580 */             { for (b1 = 2; b1 < paramInt1; b1 += 2) {
/*  581 */                 int i16 = i5 - b1;
/*  582 */                 paramArrayOffloat1[b1 + i13 - 1] = paramArrayOffloat4[b1 + i14 - 1] + paramArrayOffloat4[b1 + i15 - 1];
/*  583 */                 paramArrayOffloat1[i16 + i12 - 1] = paramArrayOffloat4[b1 + i14 - 1] - paramArrayOffloat4[b1 + i15 - 1];
/*  584 */                 paramArrayOffloat1[b1 + i13] = paramArrayOffloat4[b1 + i14] + paramArrayOffloat4[b1 + i15];
/*  585 */                 paramArrayOffloat1[i16 + i12] = paramArrayOffloat4[b1 + i15] - paramArrayOffloat4[b1 + i14];
/*      */               } 
/*  587 */               i12 += i3;
/*  588 */               i13 += i3;
/*  589 */               i14 += paramInt1;
/*  590 */               i15 += paramInt1; } 
/*      */           }  return;
/*      */         case 141:
/*      */           break;
/*      */       } 
/*  595 */     }  int k = -paramInt1;
/*  596 */     int n = 0;
/*  597 */     int i1 = 0;
/*  598 */     int i2 = i6 * j;
/*  599 */     for (byte b = 1; b < i; b++) {
/*  600 */       k += m;
/*  601 */       n += m;
/*  602 */       i1 += j;
/*  603 */       i2 -= j;
/*  604 */       for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
/*  605 */         int i7 = i5 + k - b1;
/*  606 */         int i8 = b1 + n;
/*  607 */         int i9 = b1 + i1;
/*  608 */         int i10 = b1 + i2;
/*  609 */         for (byte b2 = 0; b2 < paramInt3; b2++) {
/*  610 */           paramArrayOffloat1[i8 - 1] = paramArrayOffloat4[i9 - 1] + paramArrayOffloat4[i10 - 1];
/*  611 */           paramArrayOffloat1[i7 - 1] = paramArrayOffloat4[i9 - 1] - paramArrayOffloat4[i10 - 1];
/*  612 */           paramArrayOffloat1[i8] = paramArrayOffloat4[i9] + paramArrayOffloat4[i10];
/*  613 */           paramArrayOffloat1[i7] = paramArrayOffloat4[i10] - paramArrayOffloat4[i9];
/*  614 */           i7 += i3;
/*  615 */           i8 += i3;
/*  616 */           i9 += paramInt1;
/*  617 */           i10 += paramInt1;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void drftf1(int paramInt, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int[] paramArrayOfint) {
/*  631 */     int k = paramArrayOfint[1];
/*  632 */     int j = 1;
/*  633 */     int i = paramInt;
/*  634 */     int m = paramInt;
/*      */     
/*  636 */     for (byte b2 = 0; b2 < k; b2++) {
/*  637 */       int i1 = k - b2;
/*  638 */       int i2 = paramArrayOfint[i1 + 1];
/*  639 */       int n = i / i2;
/*  640 */       int i3 = paramInt / i;
/*  641 */       int i4 = i3 * n;
/*  642 */       m -= (i2 - 1) * i3;
/*  643 */       j = 1 - j;
/*      */       
/*  645 */       byte b = 100; while (true)
/*      */       { int i5; int i6;
/*  647 */         switch (b)
/*      */         { case 100:
/*  649 */             if (i2 != 4) {
/*  650 */               b = 102;
/*      */               
/*      */               continue;
/*      */             } 
/*  654 */             i5 = m + i3;
/*  655 */             i6 = i5 + i3;
/*  656 */             if (j != 0) {
/*  657 */               dradf4(i3, n, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, m - 1, paramArrayOffloat3, i5 - 1, paramArrayOffloat3, i6 - 1);
/*      */             } else {
/*  659 */               dradf4(i3, n, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, m - 1, paramArrayOffloat3, i5 - 1, paramArrayOffloat3, i6 - 1);
/*  660 */             }  b = 110;
/*      */           
/*      */           case 102:
/*  663 */             if (i2 != 2) {
/*  664 */               b = 104;
/*      */               continue;
/*      */             } 
/*  667 */             if (j != 0) {
/*  668 */               b = 103;
/*      */               continue;
/*      */             } 
/*  671 */             dradf2(i3, n, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, m - 1);
/*  672 */             b = 110;
/*      */           
/*      */           case 103:
/*  675 */             dradf2(i3, n, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, m - 1);
/*      */           case 104:
/*  677 */             if (i3 == 1)
/*  678 */               j = 1 - j; 
/*  679 */             if (j != 0) {
/*  680 */               b = 109;
/*      */               continue;
/*      */             } 
/*  683 */             dradfg(i3, i2, n, i4, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat3, m - 1);
/*  684 */             j = 1;
/*  685 */             b = 110;
/*      */           
/*      */           case 109:
/*  688 */             dradfg(i3, i2, n, i4, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat3, m - 1);
/*  689 */             j = 0; break;
/*      */           case 110:
/*  691 */             break; }  }  i = n;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  696 */     if (j == 1)
/*      */       return; 
/*  698 */     for (byte b1 = 0; b1 < paramInt; b1++) {
/*  699 */       paramArrayOffloat1[b1] = paramArrayOffloat2[b1];
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradb2(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3) {
/*  707 */     int i = paramInt2 * paramInt1;
/*      */     
/*  709 */     int j = 0;
/*  710 */     int k = 0;
/*  711 */     int m = (paramInt1 << 1) - 1; byte b;
/*  712 */     for (b = 0; b < paramInt2; b++) {
/*  713 */       paramArrayOffloat2[j] = paramArrayOffloat1[k] + paramArrayOffloat1[m + k];
/*  714 */       paramArrayOffloat2[j + i] = paramArrayOffloat1[k] - paramArrayOffloat1[m + k];
/*  715 */       k = (j += paramInt1) << 1;
/*      */     } 
/*      */     
/*  718 */     if (paramInt1 < 2)
/*      */       return; 
/*  720 */     if (paramInt1 != 2) {
/*  721 */       j = 0;
/*  722 */       k = 0;
/*  723 */       for (b = 0; b < paramInt2; b++) {
/*  724 */         m = j;
/*  725 */         int n, i1 = (n = k) + (paramInt1 << 1);
/*  726 */         int i2 = i + j;
/*  727 */         for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
/*  728 */           m += 2;
/*  729 */           n += 2;
/*  730 */           i1 -= 2;
/*  731 */           i2 += 2;
/*  732 */           paramArrayOffloat2[m - 1] = paramArrayOffloat1[n - 1] + paramArrayOffloat1[i1 - 1];
/*  733 */           float f2 = paramArrayOffloat1[n - 1] - paramArrayOffloat1[i1 - 1];
/*  734 */           paramArrayOffloat2[m] = paramArrayOffloat1[n] - paramArrayOffloat1[i1];
/*  735 */           float f1 = paramArrayOffloat1[n] + paramArrayOffloat1[i1];
/*  736 */           paramArrayOffloat2[i2 - 1] = paramArrayOffloat3[paramInt3 + b1 - 2] * f2 - paramArrayOffloat3[paramInt3 + b1 - 1] * f1;
/*  737 */           paramArrayOffloat2[i2] = paramArrayOffloat3[paramInt3 + b1 - 2] * f1 + paramArrayOffloat3[paramInt3 + b1 - 1] * f2;
/*      */         } 
/*  739 */         k = (j += paramInt1) << 1;
/*      */       } 
/*  741 */       if (paramInt1 % 2 == 1) {
/*      */         return;
/*      */       }
/*      */     } 
/*  745 */     j = paramInt1 - 1;
/*  746 */     k = paramInt1 - 1;
/*  747 */     for (b = 0; b < paramInt2; b++) {
/*  748 */       paramArrayOffloat2[j] = paramArrayOffloat1[k] + paramArrayOffloat1[k];
/*  749 */       paramArrayOffloat2[j + i] = -(paramArrayOffloat1[k + 1] + paramArrayOffloat1[k + 1]);
/*  750 */       j += paramInt1;
/*  751 */       k += paramInt1 << 1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradb3(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3, float[] paramArrayOffloat4, int paramInt4) {
/*  759 */     int i = paramInt2 * paramInt1;
/*      */     
/*  761 */     int j = 0;
/*  762 */     int k = i << 1;
/*  763 */     int m = paramInt1 << 1;
/*  764 */     int n = paramInt1 + (paramInt1 << 1);
/*  765 */     int i1 = 0; byte b;
/*  766 */     for (b = 0; b < paramInt2; b++) {
/*  767 */       float f3 = paramArrayOffloat1[m - 1] + paramArrayOffloat1[m - 1];
/*  768 */       float f2 = paramArrayOffloat1[i1] + taur * f3;
/*  769 */       paramArrayOffloat2[j] = paramArrayOffloat1[i1] + f3;
/*  770 */       float f1 = taui * (paramArrayOffloat1[m] + paramArrayOffloat1[m]);
/*  771 */       paramArrayOffloat2[j + i] = f2 - f1;
/*  772 */       paramArrayOffloat2[j + k] = f2 + f1;
/*  773 */       j += paramInt1;
/*  774 */       m += n;
/*  775 */       i1 += n;
/*      */     } 
/*      */     
/*  778 */     if (paramInt1 == 1) {
/*      */       return;
/*      */     }
/*  781 */     j = 0;
/*  782 */     m = paramInt1 << 1;
/*  783 */     for (b = 0; b < paramInt2; b++) {
/*  784 */       int i3 = j + (j << 1);
/*  785 */       int i2 = i1 = i3 + m;
/*  786 */       int i4 = j;
/*  787 */       int i5, i6 = (i5 = j + i) + i;
/*      */       
/*  789 */       for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
/*  790 */         i1 += 2;
/*  791 */         i2 -= 2;
/*  792 */         i3 += 2;
/*  793 */         i4 += 2;
/*  794 */         i5 += 2;
/*  795 */         i6 += 2;
/*  796 */         float f10 = paramArrayOffloat1[i1 - 1] + paramArrayOffloat1[i2 - 1];
/*  797 */         float f5 = paramArrayOffloat1[i3 - 1] + taur * f10;
/*  798 */         paramArrayOffloat2[i4 - 1] = paramArrayOffloat1[i3 - 1] + f10;
/*  799 */         float f9 = paramArrayOffloat1[i1] - paramArrayOffloat1[i2];
/*  800 */         float f1 = paramArrayOffloat1[i3] + taur * f9;
/*  801 */         paramArrayOffloat2[i4] = paramArrayOffloat1[i3] + f9;
/*  802 */         float f6 = taui * (paramArrayOffloat1[i1 - 1] - paramArrayOffloat1[i2 - 1]);
/*  803 */         float f2 = taui * (paramArrayOffloat1[i1] + paramArrayOffloat1[i2]);
/*  804 */         float f7 = f5 - f2;
/*  805 */         float f8 = f5 + f2;
/*  806 */         float f3 = f1 + f6;
/*  807 */         float f4 = f1 - f6;
/*  808 */         paramArrayOffloat2[i5 - 1] = paramArrayOffloat3[paramInt3 + b1 - 2] * f7 - paramArrayOffloat3[paramInt3 + b1 - 1] * f3;
/*  809 */         paramArrayOffloat2[i5] = paramArrayOffloat3[paramInt3 + b1 - 2] * f3 + paramArrayOffloat3[paramInt3 + b1 - 1] * f7;
/*  810 */         paramArrayOffloat2[i6 - 1] = paramArrayOffloat4[paramInt4 + b1 - 2] * f8 - paramArrayOffloat4[paramInt4 + b1 - 1] * f4;
/*  811 */         paramArrayOffloat2[i6] = paramArrayOffloat4[paramInt4 + b1 - 2] * f4 + paramArrayOffloat4[paramInt4 + b1 - 1] * f8;
/*      */       } 
/*  813 */       j += paramInt1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradb4(int paramInt1, int paramInt2, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt3, float[] paramArrayOffloat4, int paramInt4, float[] paramArrayOffloat5, int paramInt5) {
/*  821 */     int i = paramInt2 * paramInt1;
/*      */     
/*  823 */     int j = 0;
/*  824 */     int k = paramInt1 << 2;
/*  825 */     int m = 0;
/*  826 */     int i1 = paramInt1 << 1; byte b;
/*  827 */     for (b = 0; b < paramInt2; b++) {
/*  828 */       int i2 = m + i1;
/*  829 */       int i3 = j;
/*  830 */       float f3 = paramArrayOffloat1[i2 - 1] + paramArrayOffloat1[i2 - 1];
/*  831 */       float f4 = paramArrayOffloat1[i2] + paramArrayOffloat1[i2];
/*  832 */       float f1 = paramArrayOffloat1[m] - paramArrayOffloat1[(i2 += i1) - 1];
/*  833 */       float f2 = paramArrayOffloat1[m] + paramArrayOffloat1[i2 - 1];
/*  834 */       paramArrayOffloat2[i3] = f2 + f3;
/*  835 */       paramArrayOffloat2[i3 += i] = f1 - f4;
/*  836 */       paramArrayOffloat2[i3 += i] = f2 - f3;
/*  837 */       paramArrayOffloat2[i3 += i] = f1 + f4;
/*  838 */       j += paramInt1;
/*  839 */       m += k;
/*      */     } 
/*      */     
/*  842 */     if (paramInt1 < 2)
/*      */       return; 
/*  844 */     if (paramInt1 != 2) {
/*  845 */       j = 0;
/*  846 */       for (b = 0; b < paramInt2; b++) {
/*  847 */         int i2, i3 = (i2 = m = (k = j << 2) + i1) + i1;
/*  848 */         int i4 = j;
/*  849 */         for (byte b1 = 2; b1 < paramInt1; b1 += 2) {
/*  850 */           k += 2;
/*  851 */           m += 2;
/*  852 */           i2 -= 2;
/*  853 */           i3 -= 2;
/*  854 */           i4 += 2;
/*  855 */           float f7 = paramArrayOffloat1[k] + paramArrayOffloat1[i3];
/*  856 */           float f8 = paramArrayOffloat1[k] - paramArrayOffloat1[i3];
/*  857 */           float f9 = paramArrayOffloat1[m] - paramArrayOffloat1[i2];
/*  858 */           float f14 = paramArrayOffloat1[m] + paramArrayOffloat1[i2];
/*  859 */           float f11 = paramArrayOffloat1[k - 1] - paramArrayOffloat1[i3 - 1];
/*  860 */           float f12 = paramArrayOffloat1[k - 1] + paramArrayOffloat1[i3 - 1];
/*  861 */           float f10 = paramArrayOffloat1[m - 1] - paramArrayOffloat1[i2 - 1];
/*  862 */           float f13 = paramArrayOffloat1[m - 1] + paramArrayOffloat1[i2 - 1];
/*  863 */           paramArrayOffloat2[i4 - 1] = f12 + f13;
/*  864 */           float f5 = f12 - f13;
/*  865 */           paramArrayOffloat2[i4] = f8 + f9;
/*  866 */           float f2 = f8 - f9;
/*  867 */           float f4 = f11 - f14;
/*  868 */           float f6 = f11 + f14;
/*  869 */           float f1 = f7 + f10;
/*  870 */           float f3 = f7 - f10;
/*      */           int i5;
/*  872 */           paramArrayOffloat2[(i5 = i4 + i) - 1] = paramArrayOffloat3[paramInt3 + b1 - 2] * f4 - paramArrayOffloat3[paramInt3 + b1 - 1] * f1;
/*  873 */           paramArrayOffloat2[i5] = paramArrayOffloat3[paramInt3 + b1 - 2] * f1 + paramArrayOffloat3[paramInt3 + b1 - 1] * f4;
/*  874 */           paramArrayOffloat2[(i5 += i) - 1] = paramArrayOffloat4[paramInt4 + b1 - 2] * f5 - paramArrayOffloat4[paramInt4 + b1 - 1] * f2;
/*  875 */           paramArrayOffloat2[i5] = paramArrayOffloat4[paramInt4 + b1 - 2] * f2 + paramArrayOffloat4[paramInt4 + b1 - 1] * f5;
/*  876 */           paramArrayOffloat2[(i5 += i) - 1] = paramArrayOffloat5[paramInt5 + b1 - 2] * f6 - paramArrayOffloat5[paramInt5 + b1 - 1] * f3;
/*  877 */           paramArrayOffloat2[i5] = paramArrayOffloat5[paramInt5 + b1 - 2] * f3 + paramArrayOffloat5[paramInt5 + b1 - 1] * f6;
/*      */         } 
/*  879 */         j += paramInt1;
/*      */       } 
/*  881 */       if (paramInt1 % 2 == 1) {
/*      */         return;
/*      */       }
/*      */     } 
/*  885 */     j = paramInt1;
/*  886 */     k = paramInt1 << 2;
/*  887 */     m = paramInt1 - 1;
/*  888 */     int n = paramInt1 + (paramInt1 << 1);
/*  889 */     for (b = 0; b < paramInt2; b++) {
/*  890 */       int i2 = m;
/*  891 */       float f1 = paramArrayOffloat1[j] + paramArrayOffloat1[n];
/*  892 */       float f2 = paramArrayOffloat1[n] - paramArrayOffloat1[j];
/*  893 */       float f3 = paramArrayOffloat1[j - 1] - paramArrayOffloat1[n - 1];
/*  894 */       float f4 = paramArrayOffloat1[j - 1] + paramArrayOffloat1[n - 1];
/*  895 */       paramArrayOffloat2[i2] = f4 + f4;
/*  896 */       paramArrayOffloat2[i2 += i] = sqrt2 * (f3 - f1);
/*  897 */       paramArrayOffloat2[i2 += i] = f2 + f2;
/*  898 */       paramArrayOffloat2[i2 += i] = -sqrt2 * (f3 + f1);
/*      */       
/*  900 */       m += paramInt1;
/*  901 */       j += k;
/*  902 */       n += k;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static void dradbg(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, float[] paramArrayOffloat4, float[] paramArrayOffloat5, float[] paramArrayOffloat6, int paramInt5) {
/*  909 */     int i = 0, k = 0, n = 0;
/*      */     
/*  911 */     int i1 = 0;
/*  912 */     float f1 = 0.0F, f2 = 0.0F;
/*  913 */     int i2 = 0;
/*      */     
/*  915 */     char c = 'd'; while (true) {
/*      */       byte b1; byte b2; byte b3; byte b4; byte b5; int i3; int i4; int i5; int i6; int i7; int i8; int i9; float f3; float f4;
/*      */       float f5;
/*  918 */       switch (c) {
/*      */         case 100:
/*  920 */           n = paramInt2 * paramInt1;
/*  921 */           k = paramInt3 * paramInt1;
/*  922 */           f5 = tpi / paramInt2;
/*  923 */           f1 = (float)Math.cos(f5);
/*  924 */           f2 = (float)Math.sin(f5);
/*  925 */           i1 = paramInt1 - 1 >>> 1;
/*  926 */           i2 = paramInt2;
/*  927 */           i = paramInt2 + 1 >>> 1;
/*  928 */           if (paramInt1 < paramInt3) {
/*  929 */             c = 'g';
/*      */             continue;
/*      */           } 
/*  932 */           i4 = 0;
/*  933 */           i5 = 0;
/*  934 */           for (b3 = 0; b3 < paramInt3; b3++) {
/*  935 */             int i10 = i4;
/*  936 */             int i11 = i5;
/*  937 */             for (byte b6 = 0; b6 < paramInt1; b6++) {
/*  938 */               paramArrayOffloat4[i10] = paramArrayOffloat1[i11];
/*  939 */               i10++;
/*  940 */               i11++;
/*      */             } 
/*  942 */             i4 += paramInt1;
/*  943 */             i5 += n;
/*      */           } 
/*  945 */           c = 'j';
/*      */         
/*      */         case 103:
/*  948 */           i4 = 0;
/*  949 */           for (b1 = 0; b1 < paramInt1; b1++) {
/*  950 */             i5 = i4;
/*  951 */             int i10 = i4;
/*  952 */             for (b3 = 0; b3 < paramInt3; b3++) {
/*  953 */               paramArrayOffloat4[i5] = paramArrayOffloat1[i10];
/*  954 */               i5 += paramInt1;
/*  955 */               i10 += n;
/*      */             } 
/*  957 */             i4++;
/*      */           } 
/*      */         case 106:
/*  960 */           i4 = 0;
/*  961 */           i5 = i2 * k;
/*  962 */           i8 = i7 = paramInt1 << 1;
/*  963 */           for (b2 = 1; b2 < i; b2++) {
/*  964 */             i4 += k;
/*  965 */             i5 -= k;
/*  966 */             int i10 = i4;
/*  967 */             int i11 = i5;
/*  968 */             int i12 = i7;
/*  969 */             for (b3 = 0; b3 < paramInt3; b3++) {
/*  970 */               paramArrayOffloat4[i10] = paramArrayOffloat1[i12 - 1] + paramArrayOffloat1[i12 - 1];
/*  971 */               paramArrayOffloat4[i11] = paramArrayOffloat1[i12] + paramArrayOffloat1[i12];
/*  972 */               i10 += paramInt1;
/*  973 */               i11 += paramInt1;
/*  974 */               i12 += n;
/*      */             } 
/*  976 */             i7 += i8;
/*      */           } 
/*  978 */           if (paramInt1 == 1) {
/*  979 */             c = 't';
/*      */             continue;
/*      */           } 
/*  982 */           if (i1 < paramInt3) {
/*  983 */             c = 'p';
/*      */             
/*      */             continue;
/*      */           } 
/*  987 */           i4 = 0;
/*  988 */           i5 = i2 * k;
/*  989 */           i8 = 0;
/*  990 */           for (b2 = 1; b2 < i; b2++) {
/*  991 */             i4 += k;
/*  992 */             i5 -= k;
/*  993 */             int i10 = i4;
/*  994 */             int i11 = i5;
/*      */             
/*  996 */             i8 += paramInt1 << 1;
/*  997 */             int i12 = i8;
/*  998 */             for (b3 = 0; b3 < paramInt3; b3++) {
/*  999 */               i7 = i10;
/* 1000 */               int i13 = i11;
/* 1001 */               int i14 = i12;
/* 1002 */               int i15 = i12;
/* 1003 */               for (b1 = 2; b1 < paramInt1; b1 += 2) {
/* 1004 */                 i7 += 2;
/* 1005 */                 i13 += 2;
/* 1006 */                 i14 += 2;
/* 1007 */                 i15 -= 2;
/* 1008 */                 paramArrayOffloat4[i7 - 1] = paramArrayOffloat1[i14 - 1] + paramArrayOffloat1[i15 - 1];
/* 1009 */                 paramArrayOffloat4[i13 - 1] = paramArrayOffloat1[i14 - 1] - paramArrayOffloat1[i15 - 1];
/* 1010 */                 paramArrayOffloat4[i7] = paramArrayOffloat1[i14] - paramArrayOffloat1[i15];
/* 1011 */                 paramArrayOffloat4[i13] = paramArrayOffloat1[i14] + paramArrayOffloat1[i15];
/*      */               } 
/* 1013 */               i10 += paramInt1;
/* 1014 */               i11 += paramInt1;
/* 1015 */               i12 += n;
/*      */             } 
/*      */           } 
/* 1018 */           c = 't';
/*      */         
/*      */         case 112:
/* 1021 */           i4 = 0;
/* 1022 */           i5 = i2 * k;
/* 1023 */           i8 = 0;
/* 1024 */           for (b2 = 1; b2 < i; b2++) {
/* 1025 */             i4 += k;
/* 1026 */             i5 -= k;
/* 1027 */             int i10 = i4;
/* 1028 */             int i11 = i5;
/* 1029 */             i8 += paramInt1 << 1;
/* 1030 */             int i12 = i8;
/* 1031 */             int i13 = i8;
/* 1032 */             for (b1 = 2; b1 < paramInt1; b1 += 2) {
/* 1033 */               i10 += 2;
/* 1034 */               i11 += 2;
/* 1035 */               i12 += 2;
/* 1036 */               i13 -= 2;
/* 1037 */               i7 = i10;
/* 1038 */               int i14 = i11;
/* 1039 */               int i15 = i12;
/* 1040 */               int i16 = i13;
/* 1041 */               for (b3 = 0; b3 < paramInt3; b3++) {
/* 1042 */                 paramArrayOffloat4[i7 - 1] = paramArrayOffloat1[i15 - 1] + paramArrayOffloat1[i16 - 1];
/* 1043 */                 paramArrayOffloat4[i14 - 1] = paramArrayOffloat1[i15 - 1] - paramArrayOffloat1[i16 - 1];
/* 1044 */                 paramArrayOffloat4[i7] = paramArrayOffloat1[i15] - paramArrayOffloat1[i16];
/* 1045 */                 paramArrayOffloat4[i14] = paramArrayOffloat1[i15] + paramArrayOffloat1[i16];
/* 1046 */                 i7 += paramInt1;
/* 1047 */                 i14 += paramInt1;
/* 1048 */                 i15 += n;
/* 1049 */                 i16 += n;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         case 116:
/* 1054 */           f4 = 1.0F;
/* 1055 */           f3 = 0.0F;
/* 1056 */           i4 = 0;
/* 1057 */           i9 = i5 = i2 * paramInt4;
/* 1058 */           i6 = (paramInt2 - 1) * paramInt4;
/* 1059 */           for (b4 = 1; b4 < i; b4++) {
/* 1060 */             i4 += paramInt4;
/* 1061 */             i5 -= paramInt4;
/*      */             
/* 1063 */             float f10 = f1 * f4 - f2 * f3;
/* 1064 */             f3 = f1 * f3 + f2 * f4;
/* 1065 */             f4 = f10;
/* 1066 */             int i10 = i4;
/* 1067 */             i7 = i5;
/* 1068 */             int i11 = 0;
/* 1069 */             i8 = paramInt4;
/* 1070 */             int i12 = i6; byte b6;
/* 1071 */             for (b6 = 0; b6 < paramInt4; b6++) {
/* 1072 */               paramArrayOffloat3[i10++] = paramArrayOffloat5[i11++] + f4 * paramArrayOffloat5[i8++];
/* 1073 */               paramArrayOffloat3[i7++] = f3 * paramArrayOffloat5[i12++];
/*      */             } 
/* 1075 */             float f6 = f4;
/* 1076 */             float f9 = f3;
/* 1077 */             float f8 = f4;
/* 1078 */             float f7 = f3;
/*      */             
/* 1080 */             i11 = paramInt4;
/* 1081 */             i8 = i9 - paramInt4;
/* 1082 */             for (b2 = 2; b2 < i; b2++) {
/* 1083 */               i11 += paramInt4;
/* 1084 */               i8 -= paramInt4;
/* 1085 */               float f = f6 * f8 - f9 * f7;
/* 1086 */               f7 = f6 * f7 + f9 * f8;
/* 1087 */               f8 = f;
/* 1088 */               i10 = i4;
/* 1089 */               i7 = i5;
/* 1090 */               int i13 = i11;
/* 1091 */               int i14 = i8;
/* 1092 */               for (b6 = 0; b6 < paramInt4; b6++) {
/* 1093 */                 paramArrayOffloat3[i10++] = paramArrayOffloat3[i10++] + f8 * paramArrayOffloat5[i13++];
/* 1094 */                 paramArrayOffloat3[i7++] = paramArrayOffloat3[i7++] + f7 * paramArrayOffloat5[i14++];
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           
/* 1099 */           i4 = 0;
/* 1100 */           for (b2 = 1; b2 < i; b2++) {
/* 1101 */             i4 += paramInt4;
/* 1102 */             i5 = i4;
/* 1103 */             for (byte b6 = 0; b6 < paramInt4; b6++) {
/* 1104 */               paramArrayOffloat5[b6] = paramArrayOffloat5[b6] + paramArrayOffloat5[i5++];
/*      */             }
/*      */           } 
/* 1107 */           i4 = 0;
/* 1108 */           i5 = i2 * k;
/* 1109 */           for (b2 = 1; b2 < i; b2++) {
/* 1110 */             i4 += k;
/* 1111 */             i5 -= k;
/* 1112 */             i6 = i4;
/* 1113 */             int i10 = i5;
/* 1114 */             for (b3 = 0; b3 < paramInt3; b3++) {
/* 1115 */               paramArrayOffloat4[i6] = paramArrayOffloat2[i6] - paramArrayOffloat2[i10];
/* 1116 */               paramArrayOffloat4[i10] = paramArrayOffloat2[i6] + paramArrayOffloat2[i10];
/* 1117 */               i6 += paramInt1;
/* 1118 */               i10 += paramInt1;
/*      */             } 
/*      */           } 
/*      */           
/* 1122 */           if (paramInt1 == 1) {
/* 1123 */             c = '';
/*      */             continue;
/*      */           } 
/* 1126 */           if (i1 < paramInt3) {
/* 1127 */             c = '';
/*      */             
/*      */             continue;
/*      */           } 
/* 1131 */           i4 = 0;
/* 1132 */           i5 = i2 * k;
/* 1133 */           for (b2 = 1; b2 < i; b2++) {
/* 1134 */             i4 += k;
/* 1135 */             i5 -= k;
/* 1136 */             i6 = i4;
/* 1137 */             int i10 = i5;
/* 1138 */             for (b3 = 0; b3 < paramInt3; b3++) {
/* 1139 */               i7 = i6;
/* 1140 */               int i11 = i10;
/* 1141 */               for (b1 = 2; b1 < paramInt1; b1 += 2) {
/* 1142 */                 i7 += 2;
/* 1143 */                 i11 += 2;
/* 1144 */                 paramArrayOffloat4[i7 - 1] = paramArrayOffloat2[i7 - 1] - paramArrayOffloat2[i11];
/* 1145 */                 paramArrayOffloat4[i11 - 1] = paramArrayOffloat2[i7 - 1] + paramArrayOffloat2[i11];
/* 1146 */                 paramArrayOffloat4[i7] = paramArrayOffloat2[i7] + paramArrayOffloat2[i11 - 1];
/* 1147 */                 paramArrayOffloat4[i11] = paramArrayOffloat2[i7] - paramArrayOffloat2[i11 - 1];
/*      */               } 
/* 1149 */               i6 += paramInt1;
/* 1150 */               i10 += paramInt1;
/*      */             } 
/*      */           } 
/* 1153 */           c = '';
/*      */         
/*      */         case 128:
/* 1156 */           i4 = 0;
/* 1157 */           i5 = i2 * k;
/* 1158 */           for (b2 = 1; b2 < i; b2++) {
/* 1159 */             i4 += k;
/* 1160 */             i5 -= k;
/* 1161 */             i6 = i4;
/* 1162 */             int i10 = i5;
/* 1163 */             for (b1 = 2; b1 < paramInt1; b1 += 2) {
/* 1164 */               i6 += 2;
/* 1165 */               i10 += 2;
/* 1166 */               i7 = i6;
/* 1167 */               int i11 = i10;
/* 1168 */               for (b3 = 0; b3 < paramInt3; b3++) {
/* 1169 */                 paramArrayOffloat4[i7 - 1] = paramArrayOffloat2[i7 - 1] - paramArrayOffloat2[i11];
/* 1170 */                 paramArrayOffloat4[i11 - 1] = paramArrayOffloat2[i7 - 1] + paramArrayOffloat2[i11];
/* 1171 */                 paramArrayOffloat4[i7] = paramArrayOffloat2[i7] + paramArrayOffloat2[i11 - 1];
/* 1172 */                 paramArrayOffloat4[i11] = paramArrayOffloat2[i7] - paramArrayOffloat2[i11 - 1];
/* 1173 */                 i7 += paramInt1;
/* 1174 */                 i11 += paramInt1;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         case 132:
/* 1179 */           if (paramInt1 == 1) {
/*      */             return;
/*      */           }
/* 1182 */           for (b5 = 0; b5 < paramInt4; b5++) {
/* 1183 */             paramArrayOffloat3[b5] = paramArrayOffloat5[b5];
/*      */           }
/* 1185 */           i4 = 0;
/* 1186 */           for (b2 = 1; b2 < paramInt2; b2++) {
/* 1187 */             i5 = i4 += k;
/* 1188 */             for (b3 = 0; b3 < paramInt3; b3++) {
/* 1189 */               paramArrayOffloat2[i5] = paramArrayOffloat4[i5];
/* 1190 */               i5 += paramInt1;
/*      */             } 
/*      */           } 
/*      */           
/* 1194 */           if (i1 > paramInt3) {
/* 1195 */             c = '';
/*      */             
/*      */             continue;
/*      */           } 
/* 1199 */           i3 = -paramInt1 - 1;
/* 1200 */           i4 = 0;
/* 1201 */           for (b2 = 1; b2 < paramInt2; b2++) {
/* 1202 */             i3 += paramInt1;
/* 1203 */             i4 += k;
/* 1204 */             int i10 = i3;
/* 1205 */             i5 = i4;
/* 1206 */             for (b1 = 2; b1 < paramInt1; b1 += 2) {
/* 1207 */               i5 += 2;
/* 1208 */               i10 += 2;
/* 1209 */               i6 = i5;
/* 1210 */               for (b3 = 0; b3 < paramInt3; b3++) {
/* 1211 */                 paramArrayOffloat2[i6 - 1] = paramArrayOffloat6[paramInt5 + i10 - 1] * paramArrayOffloat4[i6 - 1] - paramArrayOffloat6[paramInt5 + i10] * paramArrayOffloat4[i6];
/* 1212 */                 paramArrayOffloat2[i6] = paramArrayOffloat6[paramInt5 + i10 - 1] * paramArrayOffloat4[i6] + paramArrayOffloat6[paramInt5 + i10] * paramArrayOffloat4[i6 - 1];
/* 1213 */                 i6 += paramInt1;
/*      */               } 
/*      */             } 
/*      */           }  return;
/*      */         case 139:
/*      */           break;
/*      */       } 
/* 1220 */     }  int j = -paramInt1 - 1;
/* 1221 */     int m = 0;
/* 1222 */     for (byte b = 1; b < paramInt2; b++) {
/* 1223 */       j += paramInt1;
/* 1224 */       m += k;
/* 1225 */       int i3 = m;
/* 1226 */       for (byte b1 = 0; b1 < paramInt3; b1++) {
/* 1227 */         int i4 = j;
/* 1228 */         int i5 = i3;
/* 1229 */         for (byte b2 = 2; b2 < paramInt1; b2 += 2) {
/* 1230 */           i4 += 2;
/* 1231 */           i5 += 2;
/* 1232 */           paramArrayOffloat2[i5 - 1] = paramArrayOffloat6[paramInt5 + i4 - 1] * paramArrayOffloat4[i5 - 1] - paramArrayOffloat6[paramInt5 + i4] * paramArrayOffloat4[i5];
/* 1233 */           paramArrayOffloat2[i5] = paramArrayOffloat6[paramInt5 + i4 - 1] * paramArrayOffloat4[i5] + paramArrayOffloat6[paramInt5 + i4] * paramArrayOffloat4[i5 - 1];
/*      */         } 
/* 1235 */         i3 += paramInt1;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void drftb1(int paramInt1, float[] paramArrayOffloat1, float[] paramArrayOffloat2, float[] paramArrayOffloat3, int paramInt2, int[] paramArrayOfint) {
/* 1245 */     int j = 0;
/*      */     
/* 1247 */     int n = 0, i2 = 0, i3 = 0;
/*      */     
/* 1249 */     int m = paramArrayOfint[1];
/* 1250 */     int k = 0;
/* 1251 */     int i = 1;
/* 1252 */     int i1 = 1;
/*      */     
/* 1254 */     for (byte b2 = 0; b2 < m; b2++) {
/* 1255 */       byte b = 100; while (true) {
/*      */         int i4; int i5;
/* 1257 */         switch (b)
/*      */         { case 100:
/* 1259 */             n = paramArrayOfint[b2 + 2];
/* 1260 */             j = n * i;
/* 1261 */             i2 = paramInt1 / j;
/* 1262 */             i3 = i2 * i;
/* 1263 */             if (n != 4) {
/* 1264 */               b = 103;
/*      */               continue;
/*      */             } 
/* 1267 */             i4 = i1 + i2;
/* 1268 */             i5 = i4 + i2;
/*      */             
/* 1270 */             if (k) {
/* 1271 */               dradb4(i2, i, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1, paramArrayOffloat3, paramInt2 + i5 - 1);
/*      */             } else {
/*      */               
/* 1274 */               dradb4(i2, i, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1, paramArrayOffloat3, paramInt2 + i5 - 1);
/*      */             } 
/* 1276 */             k = 1 - k;
/* 1277 */             b = 115;
/*      */           
/*      */           case 103:
/* 1280 */             if (n != 2) {
/* 1281 */               b = 106;
/*      */               
/*      */               continue;
/*      */             } 
/* 1285 */             if (k != 0) {
/* 1286 */               dradb2(i2, i, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1);
/*      */             } else {
/* 1288 */               dradb2(i2, i, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1);
/* 1289 */             }  k = 1 - k;
/* 1290 */             b = 115;
/*      */ 
/*      */           
/*      */           case 106:
/* 1294 */             if (n != 3) {
/* 1295 */               b = 109;
/*      */               
/*      */               continue;
/*      */             } 
/* 1299 */             i4 = i1 + i2;
/* 1300 */             if (k != 0) {
/* 1301 */               dradb3(i2, i, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1);
/*      */             } else {
/* 1303 */               dradb3(i2, i, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1, paramArrayOffloat3, paramInt2 + i4 - 1);
/* 1304 */             }  k = 1 - k;
/* 1305 */             b = 115;
/*      */           
/*      */           case 109:
/* 1308 */             if (k != 0) {
/* 1309 */               dradbg(i2, n, i, i3, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat3, paramInt2 + i1 - 1);
/*      */             } else {
/* 1311 */               dradbg(i2, n, i, i3, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat1, paramArrayOffloat2, paramArrayOffloat2, paramArrayOffloat3, paramInt2 + i1 - 1);
/* 1312 */             }  if (i2 == 1)
/* 1313 */               k = 1 - k;  break;
/*      */           case 115:
/*      */             break; } 
/* 1316 */       }  i = j;
/* 1317 */       i1 += (n - 1) * i2;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1322 */     if (k == 0)
/*      */       return; 
/* 1324 */     for (byte b1 = 0; b1 < paramInt1; b1++)
/* 1325 */       paramArrayOffloat1[b1] = paramArrayOffloat2[b1]; 
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Drft.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */