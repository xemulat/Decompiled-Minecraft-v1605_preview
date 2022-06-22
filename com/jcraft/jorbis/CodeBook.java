/*     */ package com.jcraft.jorbis;
/*     */ 
/*     */ import com.jcraft.jogg.Buffer;
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
/*     */ class CodeBook
/*     */ {
/*     */   int dim;
/*     */   int entries;
/*  34 */   StaticCodeBook c = new StaticCodeBook();
/*     */   
/*     */   float[] valuelist;
/*     */   
/*     */   int[] codelist;
/*     */   CodeBook$DecodeAux decode_tree;
/*     */   
/*     */   int encode(int paramInt, Buffer paramBuffer) {
/*  42 */     paramBuffer.write(this.codelist[paramInt], this.c.lengthlist[paramInt]);
/*  43 */     return this.c.lengthlist[paramInt];
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
/*     */   int errorv(float[] paramArrayOffloat) {
/*  62 */     int i = best(paramArrayOffloat, 1);
/*  63 */     for (byte b = 0; b < this.dim; b++) {
/*  64 */       paramArrayOffloat[b] = this.valuelist[i * this.dim + b];
/*     */     }
/*  66 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   int encodev(int paramInt, float[] paramArrayOffloat, Buffer paramBuffer) {
/*  71 */     for (byte b = 0; b < this.dim; b++) {
/*  72 */       paramArrayOffloat[b] = this.valuelist[paramInt * this.dim + b];
/*     */     }
/*  74 */     return encode(paramInt, paramBuffer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int encodevs(float[] paramArrayOffloat, Buffer paramBuffer, int paramInt1, int paramInt2) {
/*  80 */     int i = besterror(paramArrayOffloat, paramInt1, paramInt2);
/*  81 */     return encode(i, paramBuffer);
/*     */   }
/*     */   
/*  84 */   private int[] t = new int[15];
/*     */   
/*     */   synchronized int decodevs_add(float[] paramArrayOffloat, int paramInt1, Buffer paramBuffer, int paramInt2) {
/*  87 */     int i = paramInt2 / this.dim;
/*     */ 
/*     */ 
/*     */     
/*  91 */     if (this.t.length < i) {
/*  92 */       this.t = new int[i];
/*     */     }
/*     */     byte b;
/*  95 */     for (b = 0; b < i; b++) {
/*  96 */       int k = decode(paramBuffer);
/*  97 */       if (k == -1)
/*  98 */         return -1; 
/*  99 */       this.t[b] = k * this.dim;
/*     */     }  int j;
/* 101 */     for (b = 0, j = 0; b < this.dim; b++, j += i) {
/* 102 */       for (byte b1 = 0; b1 < i; b1++) {
/* 103 */         paramArrayOffloat[paramInt1 + j + b1] = paramArrayOffloat[paramInt1 + j + b1] + this.valuelist[this.t[b1] + b];
/*     */       }
/*     */     } 
/*     */     
/* 107 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int decodev_add(float[] paramArrayOffloat, int paramInt1, Buffer paramBuffer, int paramInt2) {
/* 114 */     if (this.dim > 8) {
/* 115 */       for (byte b = 0; b < paramInt2; ) {
/* 116 */         int i = decode(paramBuffer);
/* 117 */         if (i == -1)
/* 118 */           return -1; 
/* 119 */         int j = i * this.dim;
/* 120 */         for (byte b1 = 0; b1 < this.dim;) {
/* 121 */           paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */         }
/*     */       } 
/*     */     } else {
/*     */       
/* 126 */       for (byte b = 0; b < paramInt2; ) {
/* 127 */         int i = decode(paramBuffer);
/* 128 */         if (i == -1)
/* 129 */           return -1; 
/* 130 */         int j = i * this.dim;
/* 131 */         byte b1 = 0;
/* 132 */         switch (this.dim) {
/*     */           case 8:
/* 134 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 7:
/* 136 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 6:
/* 138 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 5:
/* 140 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 4:
/* 142 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 3:
/* 144 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 2:
/* 146 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */           case 1:
/* 148 */             paramArrayOffloat[paramInt1 + b++] = paramArrayOffloat[paramInt1 + b++] + this.valuelist[j + b1++];
/*     */         } 
/*     */ 
/*     */       
/*     */       } 
/*     */     } 
/* 154 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int decodev_set(float[] paramArrayOffloat, int paramInt1, Buffer paramBuffer, int paramInt2) {
/* 161 */     for (byte b = 0; b < paramInt2; ) {
/* 162 */       int i = decode(paramBuffer);
/* 163 */       if (i == -1)
/* 164 */         return -1; 
/* 165 */       int j = i * this.dim;
/* 166 */       for (byte b1 = 0; b1 < this.dim;) {
/* 167 */         paramArrayOffloat[paramInt1 + b++] = this.valuelist[j + b1++];
/*     */       }
/*     */     } 
/* 170 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   int decodevv_add(float[][] paramArrayOffloat, int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3) {
/* 175 */     byte b = 0;
/*     */     
/* 177 */     for (int i = paramInt1 / paramInt2; i < (paramInt1 + paramInt3) / paramInt2; ) {
/* 178 */       int j = decode(paramBuffer);
/* 179 */       if (j == -1) {
/* 180 */         return -1;
/*     */       }
/* 182 */       int k = j * this.dim;
/* 183 */       for (byte b1 = 0; b1 < this.dim; b1++) {
/* 184 */         paramArrayOffloat[b++][i] = paramArrayOffloat[b++][i] + this.valuelist[k + b1];
/* 185 */         if (b == paramInt2) {
/* 186 */           b = 0;
/* 187 */           i++;
/*     */         } 
/*     */       } 
/*     */     } 
/* 191 */     return 0;
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
/*     */   int decode(Buffer paramBuffer) {
/* 210 */     int i = 0;
/* 211 */     CodeBook$DecodeAux codeBook$DecodeAux = this.decode_tree;
/* 212 */     int j = paramBuffer.look(codeBook$DecodeAux.tabn);
/*     */     
/* 214 */     if (j >= 0) {
/* 215 */       i = codeBook$DecodeAux.tab[j];
/* 216 */       paramBuffer.adv(codeBook$DecodeAux.tabl[j]);
/* 217 */       if (i <= 0) {
/* 218 */         return -i;
/*     */       }
/*     */     } 
/*     */     while (true) {
/* 222 */       switch (paramBuffer.read1()) {
/*     */         case 0:
/* 224 */           i = codeBook$DecodeAux.ptr0[i];
/*     */           break;
/*     */         case 1:
/* 227 */           i = codeBook$DecodeAux.ptr1[i];
/*     */           break;
/*     */         
/*     */         default:
/* 231 */           return -1;
/*     */       } 
/*     */       
/* 234 */       if (i <= 0)
/* 235 */         return -i; 
/*     */     } 
/*     */   }
/*     */   int decodevs(float[] paramArrayOffloat, int paramInt1, Buffer paramBuffer, int paramInt2, int paramInt3) {
/*     */     byte b;
/* 240 */     int j, i = decode(paramBuffer);
/* 241 */     if (i == -1)
/* 242 */       return -1; 
/* 243 */     switch (paramInt3) {
/*     */       case -1:
/* 245 */         for (b = 0, j = 0; b < this.dim; b++, j += paramInt2)
/* 246 */           paramArrayOffloat[paramInt1 + j] = this.valuelist[i * this.dim + b]; 
/*     */         break;
/*     */       case 0:
/* 249 */         for (b = 0, j = 0; b < this.dim; b++, j += paramInt2)
/* 250 */           paramArrayOffloat[paramInt1 + j] = paramArrayOffloat[paramInt1 + j] + this.valuelist[i * this.dim + b]; 
/*     */         break;
/*     */       case 1:
/* 253 */         for (b = 0, j = 0; b < this.dim; b++, j += paramInt2) {
/* 254 */           paramArrayOffloat[paramInt1 + j] = paramArrayOffloat[paramInt1 + j] * this.valuelist[i * this.dim + b];
/*     */         }
/*     */         break;
/*     */     } 
/*     */     
/* 259 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int best(float[] paramArrayOffloat, int paramInt) {
/* 265 */     byte b = -1;
/* 266 */     float f = 0.0F;
/* 267 */     int i = 0;
/* 268 */     for (byte b1 = 0; b1 < this.entries; b1++) {
/* 269 */       if (this.c.lengthlist[b1] > 0) {
/* 270 */         float f1 = dist(this.dim, this.valuelist, i, paramArrayOffloat, paramInt);
/* 271 */         if (b == -1 || f1 < f) {
/* 272 */           f = f1;
/* 273 */           b = b1;
/*     */         } 
/*     */       } 
/* 276 */       i += this.dim;
/*     */     } 
/* 278 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   int besterror(float[] paramArrayOffloat, int paramInt1, int paramInt2) {
/*     */     byte b;
/* 284 */     int j, i = best(paramArrayOffloat, paramInt1);
/* 285 */     switch (paramInt2) {
/*     */       case 0:
/* 287 */         for (b = 0, j = 0; b < this.dim; b++, j += paramInt1)
/* 288 */           paramArrayOffloat[j] = paramArrayOffloat[j] - this.valuelist[i * this.dim + b]; 
/*     */         break;
/*     */       case 1:
/* 291 */         for (b = 0, j = 0; b < this.dim; b++, j += paramInt1) {
/* 292 */           float f = this.valuelist[i * this.dim + b];
/* 293 */           if (f == 0.0F) {
/* 294 */             paramArrayOffloat[j] = 0.0F;
/*     */           } else {
/*     */             
/* 297 */             paramArrayOffloat[j] = paramArrayOffloat[j] / f;
/*     */           } 
/*     */         } 
/*     */         break;
/*     */     } 
/* 302 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   void clear() {}
/*     */   
/*     */   private static float dist(int paramInt1, float[] paramArrayOffloat1, int paramInt2, float[] paramArrayOffloat2, int paramInt3) {
/* 309 */     float f = 0.0F;
/* 310 */     for (byte b = 0; b < paramInt1; b++) {
/* 311 */       float f1 = paramArrayOffloat1[paramInt2 + b] - paramArrayOffloat2[b * paramInt3];
/* 312 */       f += f1 * f1;
/*     */     } 
/* 314 */     return f;
/*     */   }
/*     */   
/*     */   int init_decode(StaticCodeBook paramStaticCodeBook) {
/* 318 */     this.c = paramStaticCodeBook;
/* 319 */     this.entries = paramStaticCodeBook.entries;
/* 320 */     this.dim = paramStaticCodeBook.dim;
/* 321 */     this.valuelist = paramStaticCodeBook.unquantize();
/*     */     
/* 323 */     this.decode_tree = make_decode_tree();
/* 324 */     if (this.decode_tree == null) {
/* 325 */       clear();
/* 326 */       return -1;
/*     */     } 
/* 328 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static int[] make_words(int[] paramArrayOfint, int paramInt) {
/* 335 */     int[] arrayOfInt1 = new int[33];
/* 336 */     int[] arrayOfInt2 = new int[paramInt];
/*     */     byte b;
/* 338 */     for (b = 0; b < paramInt; b++) {
/* 339 */       int i = paramArrayOfint[b];
/* 340 */       if (i > 0) {
/* 341 */         int j = arrayOfInt1[i];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 349 */         if (i < 32 && j >>> i != 0)
/*     */         {
/*     */           
/* 352 */           return null;
/*     */         }
/* 354 */         arrayOfInt2[b] = j;
/*     */ 
/*     */         
/*     */         int k;
/*     */         
/* 359 */         for (k = i; k > 0; k--) {
/* 360 */           if ((arrayOfInt1[k] & 0x1) != 0) {
/*     */             
/* 362 */             if (k == 1) {
/* 363 */               arrayOfInt1[1] = arrayOfInt1[1] + 1; break;
/*     */             } 
/* 365 */             arrayOfInt1[k] = arrayOfInt1[k - 1] << 1;
/*     */             
/*     */             break;
/*     */           } 
/* 369 */           arrayOfInt1[k] = arrayOfInt1[k] + 1;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 376 */         for (k = i + 1; k < 33 && 
/* 377 */           arrayOfInt1[k] >>> 1 == j; k++) {
/* 378 */           j = arrayOfInt1[k];
/* 379 */           arrayOfInt1[k] = arrayOfInt1[k - 1] << 1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 390 */     for (b = 0; b < paramInt; b++) {
/* 391 */       int i = 0;
/* 392 */       for (byte b1 = 0; b1 < paramArrayOfint[b]; b1++) {
/* 393 */         i <<= 1;
/* 394 */         i |= arrayOfInt2[b] >>> b1 & 0x1;
/*     */       } 
/* 396 */       arrayOfInt2[b] = i;
/*     */     } 
/*     */     
/* 399 */     return arrayOfInt2;
/*     */   }
/*     */ 
/*     */   
/*     */   CodeBook$DecodeAux make_decode_tree() {
/* 404 */     byte b1 = 0;
/* 405 */     CodeBook$DecodeAux codeBook$DecodeAux = new CodeBook$DecodeAux(this);
/* 406 */     int[] arrayOfInt1 = codeBook$DecodeAux.ptr0 = new int[this.entries * 2];
/* 407 */     int[] arrayOfInt2 = codeBook$DecodeAux.ptr1 = new int[this.entries * 2];
/* 408 */     int[] arrayOfInt3 = make_words(this.c.lengthlist, this.c.entries);
/*     */     
/* 410 */     if (arrayOfInt3 == null)
/* 411 */       return null; 
/* 412 */     codeBook$DecodeAux.aux = this.entries * 2;
/*     */     int i;
/* 414 */     for (i = 0; i < this.entries; i++) {
/* 415 */       if (this.c.lengthlist[i] > 0) {
/* 416 */         int j = 0;
/*     */         byte b;
/* 418 */         for (b = 0; b < this.c.lengthlist[i] - 1; b++) {
/* 419 */           int k = arrayOfInt3[i] >>> b & 0x1;
/* 420 */           if (k == 0) {
/* 421 */             if (arrayOfInt1[j] == 0) {
/* 422 */               arrayOfInt1[j] = ++b1;
/*     */             }
/* 424 */             j = arrayOfInt1[j];
/*     */           } else {
/*     */             
/* 427 */             if (arrayOfInt2[j] == 0) {
/* 428 */               arrayOfInt2[j] = ++b1;
/*     */             }
/* 430 */             j = arrayOfInt2[j];
/*     */           } 
/*     */         } 
/*     */         
/* 434 */         if ((arrayOfInt3[i] >>> b & 0x1) == 0) {
/* 435 */           arrayOfInt1[j] = -i;
/*     */         } else {
/*     */           
/* 438 */           arrayOfInt2[j] = -i;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 444 */     codeBook$DecodeAux.tabn = Util.ilog(this.entries) - 4;
/*     */     
/* 446 */     if (codeBook$DecodeAux.tabn < 5)
/* 447 */       codeBook$DecodeAux.tabn = 5; 
/* 448 */     i = 1 << codeBook$DecodeAux.tabn;
/* 449 */     codeBook$DecodeAux.tab = new int[i];
/* 450 */     codeBook$DecodeAux.tabl = new int[i];
/* 451 */     for (byte b2 = 0; b2 < i; b2++) {
/* 452 */       int j = 0;
/* 453 */       byte b = 0;
/* 454 */       for (b = 0; b < codeBook$DecodeAux.tabn && (!j || b == 0); b++) {
/* 455 */         if ((b2 & 1 << b) != 0) {
/* 456 */           j = arrayOfInt2[j];
/*     */         } else {
/*     */           
/* 459 */           j = arrayOfInt1[j];
/*     */         } 
/*     */       } 
/* 462 */       codeBook$DecodeAux.tab[b2] = j;
/* 463 */       codeBook$DecodeAux.tabl[b2] = b;
/*     */     } 
/*     */     
/* 466 */     return codeBook$DecodeAux;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\CodeBook.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */