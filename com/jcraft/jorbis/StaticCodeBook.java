/*     */ package com.jcraft.jorbis;
/*     */ 
/*     */ import com.jcraft.jogg.Buffer;
/*     */ import ei;
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
/*     */ class StaticCodeBook
/*     */ {
/*     */   int dim;
/*     */   int entries;
/*     */   int[] lengthlist;
/*     */   int maptype;
/*     */   int q_min;
/*     */   int q_delta;
/*     */   int q_quant;
/*     */   int q_sequencep;
/*     */   int[] quantlist;
/*     */   static final int VQ_FEXP = 10;
/*     */   static final int VQ_FMAN = 21;
/*     */   static final int VQ_FEXP_BIAS = 768;
/*     */   
/*     */   int pack(Buffer paramBuffer) {
/*     */     int i;
/*  64 */     boolean bool = false;
/*     */     
/*  66 */     paramBuffer.write(5653314, 24);
/*  67 */     paramBuffer.write(this.dim, 16);
/*  68 */     paramBuffer.write(this.entries, 24);
/*     */ 
/*     */     
/*     */     byte b;
/*     */     
/*  73 */     for (b = 1; b < this.entries && 
/*  74 */       this.lengthlist[b] >= this.lengthlist[b - 1]; b++);
/*     */ 
/*     */     
/*  77 */     if (b == this.entries) {
/*  78 */       bool = true;
/*     */     }
/*  80 */     if (bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       byte b1 = 0;
/*  86 */       paramBuffer.write(1, 1);
/*  87 */       paramBuffer.write(this.lengthlist[0] - 1, 5);
/*     */       
/*  89 */       for (b = 1; b < this.entries; b++) {
/*  90 */         int j = this.lengthlist[b];
/*  91 */         int k = this.lengthlist[b - 1];
/*  92 */         if (j > k) {
/*  93 */           for (int m = k; m < j; m++) {
/*  94 */             paramBuffer.write(b - b1, Util.ilog(this.entries - b1));
/*  95 */             b1 = b;
/*     */           } 
/*     */         }
/*     */       } 
/*  99 */       paramBuffer.write(b - b1, Util.ilog(this.entries - b1));
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 104 */       paramBuffer.write(0, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 109 */       for (b = 0; b < this.entries && 
/* 110 */         this.lengthlist[b] != 0; b++);
/*     */ 
/*     */ 
/*     */       
/* 114 */       if (b == this.entries) {
/* 115 */         paramBuffer.write(0, 1);
/* 116 */         for (b = 0; b < this.entries; b++) {
/* 117 */           paramBuffer.write(this.lengthlist[b] - 1, 5);
/*     */         }
/*     */       } else {
/*     */         
/* 121 */         paramBuffer.write(1, 1);
/* 122 */         for (b = 0; b < this.entries; b++) {
/* 123 */           if (this.lengthlist[b] == 0) {
/* 124 */             paramBuffer.write(0, 1);
/*     */           } else {
/*     */             
/* 127 */             paramBuffer.write(1, 1);
/* 128 */             paramBuffer.write(this.lengthlist[b] - 1, 5);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 136 */     paramBuffer.write(this.maptype, 4);
/* 137 */     switch (this.maptype) {
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
/*     */       case 0:
/* 180 */         return 0;
/*     */       case 1:
/*     */       case 2:
/*     */         if (this.quantlist == null)
/*     */           return -1;  paramBuffer.write(this.q_min, 32); paramBuffer.write(this.q_delta, 32); paramBuffer.write(this.q_quant - 1, 4); paramBuffer.write(this.q_sequencep, 1); i = 0; switch (this.maptype) { case 1:
/*     */             i = maptype1_quantvals(); break;
/*     */           case 2:
/*     */             i = this.entries * this.dim; break; }
/*     */          for (b = 0; b < i; b++)
/*     */           paramBuffer.write(Math.abs(this.quantlist[b]), this.q_quant); 
/* 190 */     }  return -1; } int unpack(Buffer paramBuffer) { byte b; int i; if (paramBuffer.read(24) != 5653314) {
/*     */       
/* 192 */       clear();
/* 193 */       return -1;
/*     */     } 
/*     */ 
/*     */     
/* 197 */     this.dim = paramBuffer.read(16);
/* 198 */     this.entries = paramBuffer.read(24);
/* 199 */     if (this.entries == -1) {
/*     */       
/* 201 */       clear();
/* 202 */       return -1;
/*     */     } 
/*     */ 
/*     */     
/* 206 */     switch (paramBuffer.read(1)) {
/*     */       
/*     */       case 0:
/* 209 */         this.lengthlist = new int[this.entries];
/*     */ 
/*     */         
/* 212 */         if (paramBuffer.read(1) != 0) {
/*     */ 
/*     */           
/* 215 */           for (byte b1 = 0; b1 < this.entries; b1++) {
/* 216 */             if (paramBuffer.read(1) != 0) {
/* 217 */               int j = paramBuffer.read(5);
/* 218 */               if (j == -1) {
/*     */                 
/* 220 */                 clear();
/* 221 */                 return -1;
/*     */               } 
/* 223 */               this.lengthlist[b1] = j + 1;
/*     */             } else {
/*     */               
/* 226 */               this.lengthlist[b1] = 0;
/*     */             } 
/*     */           } 
/*     */           
/*     */           break;
/*     */         } 
/* 232 */         for (b = 0; b < this.entries; b++) {
/* 233 */           int j = paramBuffer.read(5);
/* 234 */           if (j == -1) {
/*     */             
/* 236 */             clear();
/* 237 */             return -1;
/*     */           } 
/* 239 */           this.lengthlist[b] = j + 1;
/*     */         } 
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case 1:
/* 246 */         i = paramBuffer.read(5) + 1;
/* 247 */         this.lengthlist = new int[this.entries];
/*     */         
/* 249 */         for (b = 0; b < this.entries; ) {
/* 250 */           int j = paramBuffer.read(Util.ilog(this.entries - b));
/* 251 */           if (j == -1) {
/*     */             
/* 253 */             clear();
/* 254 */             return -1;
/*     */           } 
/* 256 */           for (byte b1 = 0; b1 < j; b1++, b++) {
/* 257 */             this.lengthlist[b] = i;
/*     */           }
/* 259 */           i++;
/*     */         } 
/*     */         break;
/*     */ 
/*     */       
/*     */       default:
/* 265 */         return -1;
/*     */     } 
/*     */ 
/*     */     
/* 269 */     switch (this.maptype = paramBuffer.read(4)) {
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
/*     */       case 0:
/* 311 */         return 0;
/*     */       case 1:
/*     */       case 2:
/*     */         this.q_min = paramBuffer.read(32); this.q_delta = paramBuffer.read(32); this.q_quant = paramBuffer.read(4) + 1; this.q_sequencep = paramBuffer.read(1); i = 0; switch (this.maptype) { case 1:
/*     */             i = maptype1_quantvals(); break;
/*     */           case 2:
/*     */             i = this.entries * this.dim; break; }
/*     */          this.quantlist = new int[i]; for (b = 0; b < i; b++)
/*     */           this.quantlist[b] = paramBuffer.read(this.q_quant);  if (this.quantlist[i - 1] == -1) {
/*     */           clear(); return -1;
/*     */         } 
/* 322 */     }  clear(); return -1; } private int maptype1_quantvals() { int i = ei.b(Math.pow(this.entries, 1.0D / this.dim));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/* 330 */       int j = 1;
/* 331 */       int k = 1;
/* 332 */       for (byte b = 0; b < this.dim; b++) {
/* 333 */         j *= i;
/* 334 */         k *= i + 1;
/*     */       } 
/* 336 */       if (j <= this.entries && k > this.entries) {
/* 337 */         return i;
/*     */       }
/*     */       
/* 340 */       if (j > this.entries) {
/* 341 */         i--;
/*     */         continue;
/*     */       } 
/* 344 */       i++;
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void clear() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float[] unquantize() {
/* 360 */     if (this.maptype == 1 || this.maptype == 2) {
/*     */       int i; byte b;
/* 362 */       float f1 = float32_unpack(this.q_min);
/* 363 */       float f2 = float32_unpack(this.q_delta);
/* 364 */       float[] arrayOfFloat = new float[this.entries * this.dim];
/*     */ 
/*     */ 
/*     */       
/* 368 */       switch (this.maptype) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 1:
/* 376 */           i = maptype1_quantvals();
/* 377 */           for (b = 0; b < this.entries; b++) {
/* 378 */             float f = 0.0F;
/* 379 */             int j = 1;
/* 380 */             for (byte b1 = 0; b1 < this.dim; b1++) {
/* 381 */               int k = b / j % i;
/* 382 */               float f3 = this.quantlist[k];
/* 383 */               f3 = Math.abs(f3) * f2 + f1 + f;
/* 384 */               if (this.q_sequencep != 0)
/* 385 */                 f = f3; 
/* 386 */               arrayOfFloat[b * this.dim + b1] = f3;
/* 387 */               j *= i;
/*     */             } 
/*     */           } 
/*     */           break;
/*     */         case 2:
/* 392 */           for (b = 0; b < this.entries; b++) {
/* 393 */             float f = 0.0F;
/* 394 */             for (byte b1 = 0; b1 < this.dim; b1++) {
/* 395 */               float f3 = this.quantlist[b * this.dim + b1];
/*     */               
/* 397 */               f3 = Math.abs(f3) * f2 + f1 + f;
/* 398 */               if (this.q_sequencep != 0)
/* 399 */                 f = f3; 
/* 400 */               arrayOfFloat[b * this.dim + b1] = f3;
/*     */             } 
/*     */           } 
/*     */           break;
/*     */       } 
/*     */       
/* 406 */       return arrayOfFloat;
/*     */     } 
/* 408 */     return null;
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
/*     */   static long float32_pack(float paramFloat) {
/* 421 */     int i = 0;
/*     */ 
/*     */     
/* 424 */     if (paramFloat < 0.0F) {
/* 425 */       i = Integer.MIN_VALUE;
/* 426 */       paramFloat = -paramFloat;
/*     */     } 
/* 428 */     int j = ei.b(Math.log(paramFloat) / Math.log(2.0D));
/* 429 */     int k = (int)Math.rint(Math.pow(paramFloat, (20 - j)));
/* 430 */     j = j + 768 << 21;
/* 431 */     return (i | j | k);
/*     */   }
/*     */   
/*     */   static float float32_unpack(int paramInt) {
/* 435 */     float f1 = (paramInt & 0x1FFFFF);
/* 436 */     float f2 = ((paramInt & 0x7FE00000) >>> 21);
/* 437 */     if ((paramInt & Integer.MIN_VALUE) != 0)
/* 438 */       f1 = -f1; 
/* 439 */     return ldexp(f1, (int)f2 - 20 - 768);
/*     */   }
/*     */   
/*     */   static float ldexp(float paramFloat, int paramInt) {
/* 443 */     return (float)(paramFloat * Math.pow(2.0D, paramInt));
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\StaticCodeBook.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */