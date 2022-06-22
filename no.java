/*     */ import java.util.List;
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
/*     */ public class no
/*     */   extends jx
/*     */   implements fy
/*     */ {
/*  22 */   private eo[] h = new eo[36];
/*     */ 
/*     */ 
/*     */   
/*  26 */   public int a = 0;
/*  27 */   public int b = 0;
/*  28 */   public int c = 1;
/*     */   
/*     */   private boolean i = false;
/*     */   public int d;
/*     */   
/*     */   public no(cj paramcj) {
/*  34 */     super(paramcj);
/*  35 */     this.aa = true;
/*  36 */     a(0.98F, 0.7F);
/*  37 */     this.ay = this.aA / 2.0F;
/*  38 */     this.aD = false;
/*     */   }
/*     */   public int e; public double f; public double g;
/*     */   public cb b_(jx paramjx) {
/*  42 */     return paramjx.ar;
/*     */   }
/*     */   
/*     */   public cb f_() {
/*  46 */     return this.ar;
/*     */   }
/*     */   
/*     */   public boolean d_() {
/*  50 */     return true;
/*     */   }
/*     */   
/*     */   public no(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/*  54 */     this(paramcj);
/*  55 */     a(paramDouble1, paramDouble2 + this.ay, paramDouble3);
/*     */     
/*  57 */     this.ak = 0.0D;
/*  58 */     this.al = 0.0D;
/*  59 */     this.am = 0.0D;
/*     */     
/*  61 */     this.ae = paramDouble1;
/*  62 */     this.af = paramDouble2;
/*  63 */     this.ag = paramDouble3;
/*  64 */     this.d = paramInt;
/*     */   }
/*     */   
/*     */   public double j_() {
/*  68 */     return this.aA * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean a(jx paramjx, int paramInt) {
/*  72 */     this.c = -this.c;
/*  73 */     this.b = 10;
/*  74 */     this.a += paramInt * 10;
/*  75 */     if (this.a > 40) {
/*  76 */       a(dd.ax.aQ, 1, 0.0F);
/*  77 */       if (this.d == 1) {
/*  78 */         a(ln.au.ba, 1, 0.0F);
/*  79 */       } else if (this.d == 2) {
/*  80 */         a(ln.aB.ba, 1, 0.0F);
/*     */       } 
/*  82 */       D();
/*     */     } 
/*  84 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/*  88 */     return !this.ax;
/*     */   }
/*     */   
/*     */   public void D() {
/*  92 */     for (byte b = 0; b < a(); b++) {
/*  93 */       eo eo1 = a_(b);
/*  94 */       if (eo1 != null) {
/*  95 */         float f1 = this.aN.nextFloat() * 0.8F + 0.1F;
/*  96 */         float f2 = this.aN.nextFloat() * 0.8F + 0.1F;
/*  97 */         float f3 = this.aN.nextFloat() * 0.8F + 0.1F;
/*     */         
/*  99 */         while (eo1.a > 0) {
/* 100 */           int i = this.aN.nextInt(21) + 10;
/* 101 */           if (i > eo1.a) i = eo1.a; 
/* 102 */           eo1.a -= i;
/*     */           
/* 104 */           dr dr = new dr(this.ad, this.ah + f1, this.ai + f2, this.aj + f3, new eo(eo1.c, i, eo1.d));
/* 105 */           float f = 0.05F;
/* 106 */           dr.ak = ((float)this.aN.nextGaussian() * f);
/* 107 */           dr.al = ((float)this.aN.nextGaussian() * f + 0.2F);
/* 108 */           dr.am = ((float)this.aN.nextGaussian() * f);
/* 109 */           this.ad.a(dr);
/*     */         } 
/*     */       } 
/*     */     } 
/* 113 */     super.D();
/*     */   }
/*     */   
/* 116 */   private static final int[][][] j = new int[][][] { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
/*     */ 
/*     */   
/*     */   private int k;
/*     */   
/*     */   private double l;
/*     */   
/*     */   private double m;
/*     */   
/*     */   private double n;
/*     */   
/*     */   private double o;
/*     */   
/*     */   private double p;
/*     */ 
/*     */   
/*     */   public void e_() {
/* 133 */     if (this.ad.v) {
/* 134 */       if (this.k > 0) {
/* 135 */         double d6 = this.ah + (this.l - this.ah) / this.k;
/* 136 */         double d7 = this.ai + (this.m - this.ai) / this.k;
/* 137 */         double d8 = this.aj + (this.n - this.aj) / this.k;
/*     */         
/* 139 */         double d9 = this.o - this.an;
/* 140 */         while (d9 < -180.0D)
/* 141 */           d9 += 360.0D; 
/* 142 */         while (d9 >= 180.0D) {
/* 143 */           d9 -= 360.0D;
/*     */         }
/* 145 */         this.an = (float)(this.an + d9 / this.k);
/* 146 */         this.ao = (float)(this.ao + (this.p - this.ao) / this.k);
/*     */         
/* 148 */         this.k--;
/* 149 */         a(d6, d7, d8);
/* 150 */         c(this.an, this.ao);
/*     */       } else {
/* 152 */         a(this.ah, this.ai, this.aj);
/* 153 */         c(this.an, this.ao);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 158 */     if (this.b > 0) this.b--; 
/* 159 */     if (this.a > 0) this.a--; 
/* 160 */     this.ae = this.ah;
/* 161 */     this.af = this.ai;
/* 162 */     this.ag = this.aj;
/*     */     
/* 164 */     this.al -= 0.03999999910593033D;
/*     */     
/* 166 */     int i = ei.b(this.ah);
/* 167 */     int j = ei.b(this.ai);
/* 168 */     int k = ei.b(this.aj);
/* 169 */     if (this.ad.a(i, j - 1, k) == ln.aG.ba) {
/* 170 */       j--;
/*     */     }
/*     */     
/* 173 */     double d1 = 0.4D;
/* 174 */     boolean bool = false;
/*     */     
/* 176 */     double d2 = 0.0078125D;
/* 177 */     if (this.ad.a(i, j, k) == ln.aG.ba) {
/* 178 */       ah ah1 = g(this.ah, this.ai, this.aj);
/* 179 */       int m = this.ad.e(i, j, k);
/* 180 */       this.ai = j;
/* 181 */       if (m >= 2 && m <= 5) {
/* 182 */         this.ai = (j + 1);
/*     */       }
/*     */       
/* 185 */       if (m == 2) this.ak -= d2; 
/* 186 */       if (m == 3) this.ak += d2; 
/* 187 */       if (m == 4) this.am += d2; 
/* 188 */       if (m == 5) this.am -= d2;
/*     */       
/* 190 */       int[][] arrayOfInt = j[m];
/*     */       
/* 192 */       double d6 = (arrayOfInt[1][0] - arrayOfInt[0][0]);
/* 193 */       double d7 = (arrayOfInt[1][2] - arrayOfInt[0][2]);
/* 194 */       double d8 = Math.sqrt(d6 * d6 + d7 * d7);
/*     */ 
/*     */       
/* 197 */       double d9 = this.ak * d6 + this.am * d7;
/* 198 */       if (d9 < 0.0D) {
/* 199 */         d6 = -d6;
/* 200 */         d7 = -d7;
/*     */       } 
/*     */       
/* 203 */       double d10 = Math.sqrt(this.ak * this.ak + this.am * this.am);
/*     */       
/* 205 */       this.ak = d10 * d6 / d8;
/* 206 */       this.am = d10 * d7 / d8;
/*     */       
/* 208 */       double d11 = 0.0D;
/* 209 */       double d12 = i + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 210 */       double d13 = k + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 211 */       double d14 = i + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 212 */       double d15 = k + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */       
/* 214 */       d6 = d14 - d12;
/* 215 */       d7 = d15 - d13;
/*     */       
/* 217 */       if (d6 == 0.0D) {
/* 218 */         this.ah = i + 0.5D;
/* 219 */         d11 = this.aj - k;
/* 220 */       } else if (d7 == 0.0D) {
/* 221 */         this.aj = k + 0.5D;
/* 222 */         d11 = this.ah - i;
/*     */       } else {
/*     */         
/* 225 */         double d18 = this.ah - d12;
/* 226 */         double d19 = this.aj - d13;
/*     */         
/* 228 */         double d20 = (d18 * d6 + d19 * d7) * 2.0D;
/* 229 */         d11 = d20;
/*     */       } 
/*     */       
/* 232 */       this.ah = d12 + d6 * d11;
/* 233 */       this.aj = d13 + d7 * d11;
/*     */       
/* 235 */       a(this.ah, this.ai + this.ay, this.aj);
/*     */       
/* 237 */       double d16 = this.ak;
/* 238 */       double d17 = this.am;
/* 239 */       if (this.ab != null) {
/* 240 */         d16 *= 0.75D;
/* 241 */         d17 *= 0.75D;
/*     */       } 
/* 243 */       if (d16 < -d1) d16 = -d1; 
/* 244 */       if (d16 > d1) d16 = d1; 
/* 245 */       if (d17 < -d1) d17 = -d1; 
/* 246 */       if (d17 > d1) d17 = d1; 
/* 247 */       c(d16, 0.0D, d17);
/*     */       
/* 249 */       if (arrayOfInt[0][1] != 0 && ei.b(this.ah) - i == arrayOfInt[0][0] && ei.b(this.aj) - k == arrayOfInt[0][2]) {
/* 250 */         a(this.ah, this.ai + arrayOfInt[0][1], this.aj);
/* 251 */       } else if (arrayOfInt[1][1] != 0 && ei.b(this.ah) - i == arrayOfInt[1][0] && ei.b(this.aj) - k == arrayOfInt[1][2]) {
/* 252 */         a(this.ah, this.ai + arrayOfInt[1][1], this.aj);
/*     */       } 
/*     */ 
/*     */       
/* 256 */       if (this.ab != null) {
/* 257 */         this.ak *= 0.996999979019165D;
/* 258 */         this.al *= 0.0D;
/* 259 */         this.am *= 0.996999979019165D;
/*     */       } else {
/* 261 */         if (this.d == 2) {
/* 262 */           double d = ei.a(this.f * this.f + this.g * this.g);
/* 263 */           if (d > 0.01D) {
/* 264 */             bool = true;
/* 265 */             this.f /= d;
/* 266 */             this.g /= d;
/* 267 */             double d18 = 0.04D;
/* 268 */             this.ak *= 0.800000011920929D;
/* 269 */             this.al *= 0.0D;
/* 270 */             this.am *= 0.800000011920929D;
/* 271 */             this.ak += this.f * d18;
/* 272 */             this.am += this.g * d18;
/*     */           } else {
/* 274 */             this.ak *= 0.8999999761581421D;
/* 275 */             this.al *= 0.0D;
/* 276 */             this.am *= 0.8999999761581421D;
/*     */           } 
/*     */         } 
/* 279 */         this.ak *= 0.9599999785423279D;
/* 280 */         this.al *= 0.0D;
/* 281 */         this.am *= 0.9599999785423279D;
/*     */       } 
/*     */ 
/*     */       
/* 285 */       ah ah2 = g(this.ah, this.ai, this.aj);
/* 286 */       if (ah2 != null && ah1 != null) {
/* 287 */         double d = (ah1.b - ah2.b) * 0.05D;
/*     */         
/* 289 */         d10 = Math.sqrt(this.ak * this.ak + this.am * this.am);
/* 290 */         if (d10 > 0.0D) {
/* 291 */           this.ak = this.ak / d10 * (d10 + d);
/* 292 */           this.am = this.am / d10 * (d10 + d);
/*     */         } 
/* 294 */         a(this.ah, ah2.b, this.aj);
/*     */       } 
/*     */       
/* 297 */       int n = ei.b(this.ah);
/* 298 */       int i1 = ei.b(this.aj);
/* 299 */       if (n != i || i1 != k) {
/* 300 */         d10 = Math.sqrt(this.ak * this.ak + this.am * this.am);
/*     */         
/* 302 */         this.ak = d10 * (n - i);
/* 303 */         this.am = d10 * (i1 - k);
/*     */       } 
/*     */       
/* 306 */       if (this.d == 2) {
/* 307 */         double d = ei.a(this.f * this.f + this.g * this.g);
/* 308 */         if (d > 0.01D && this.ak * this.ak + this.am * this.am > 0.001D) {
/* 309 */           this.f /= d;
/* 310 */           this.g /= d;
/*     */           
/* 312 */           if (this.f * this.ak + this.g * this.am < 0.0D) {
/* 313 */             this.f = 0.0D;
/* 314 */             this.g = 0.0D;
/*     */           } else {
/* 316 */             this.f = this.ak;
/* 317 */             this.g = this.am;
/*     */           }
/*     */         
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 324 */       if (this.ak < -d1) this.ak = -d1; 
/* 325 */       if (this.ak > d1) this.ak = d1; 
/* 326 */       if (this.am < -d1) this.am = -d1; 
/* 327 */       if (this.am > d1) this.am = d1; 
/* 328 */       if (this.as) {
/* 329 */         this.ak *= 0.5D;
/* 330 */         this.al *= 0.5D;
/* 331 */         this.am *= 0.5D;
/*     */       } 
/* 333 */       c(this.ak, this.al, this.am);
/*     */       
/* 335 */       if (!this.as) {
/*     */         
/* 337 */         this.ak *= 0.949999988079071D;
/* 338 */         this.al *= 0.949999988079071D;
/* 339 */         this.am *= 0.949999988079071D;
/*     */       } 
/*     */     } 
/*     */     
/* 343 */     this.ao = 0.0F;
/* 344 */     double d3 = this.ae - this.ah;
/* 345 */     double d4 = this.ag - this.aj;
/* 346 */     if (d3 * d3 + d4 * d4 > 0.001D) {
/* 347 */       this.an = (float)(Math.atan2(d4, d3) * 180.0D / Math.PI);
/* 348 */       if (this.i) this.an += 180.0F;
/*     */     
/*     */     } 
/* 351 */     double d5 = (this.an - this.ap);
/* 352 */     while (d5 >= 180.0D)
/* 353 */       d5 -= 360.0D; 
/* 354 */     while (d5 < -180.0D)
/* 355 */       d5 += 360.0D; 
/* 356 */     if (d5 < -170.0D || d5 >= 170.0D) {
/* 357 */       this.an += 180.0F;
/* 358 */       this.i = !this.i;
/*     */     } 
/* 360 */     c(this.an, this.ao);
/*     */     
/* 362 */     List<jx> list = this.ad.b(this, this.ar.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 363 */     if (list != null && list.size() > 0) {
/* 364 */       for (byte b = 0; b < list.size(); b++) {
/* 365 */         jx jx1 = list.get(b);
/* 366 */         if (jx1 != this.ab && jx1.d_() && jx1 instanceof no) {
/* 367 */           jx1.f(this);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 372 */     if (this.ab != null && 
/* 373 */       this.ab.ax) this.ab = null;
/*     */ 
/*     */     
/* 376 */     if (bool && this.aN.nextInt(4) == 0) {
/* 377 */       this.e--;
/* 378 */       if (this.e < 0) {
/* 379 */         this.f = this.g = 0.0D;
/*     */       }
/* 381 */       this.ad.a("largesmoke", this.ah, this.ai + 0.8D, this.aj, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   public ah a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 386 */     int i = ei.b(paramDouble1);
/* 387 */     int j = ei.b(paramDouble2);
/* 388 */     int k = ei.b(paramDouble3);
/* 389 */     if (this.ad.a(i, j - 1, k) == ln.aG.ba) {
/* 390 */       j--;
/*     */     }
/*     */     
/* 393 */     if (this.ad.a(i, j, k) == ln.aG.ba) {
/* 394 */       int m = this.ad.e(i, j, k);
/*     */       
/* 396 */       paramDouble2 = j;
/* 397 */       if (m >= 2 && m <= 5) {
/* 398 */         paramDouble2 = (j + 1);
/*     */       }
/*     */       
/* 401 */       int[][] arrayOfInt = j[m];
/*     */       
/* 403 */       double d1 = (arrayOfInt[1][0] - arrayOfInt[0][0]);
/* 404 */       double d2 = (arrayOfInt[1][2] - arrayOfInt[0][2]);
/* 405 */       double d3 = Math.sqrt(d1 * d1 + d2 * d2);
/* 406 */       d1 /= d3;
/* 407 */       d2 /= d3;
/*     */       
/* 409 */       paramDouble1 += d1 * paramDouble4;
/* 410 */       paramDouble3 += d2 * paramDouble4;
/*     */       
/* 412 */       if (arrayOfInt[0][1] != 0 && ei.b(paramDouble1) - i == arrayOfInt[0][0] && ei.b(paramDouble3) - k == arrayOfInt[0][2]) {
/* 413 */         paramDouble2 += arrayOfInt[0][1];
/* 414 */       } else if (arrayOfInt[1][1] != 0 && ei.b(paramDouble1) - i == arrayOfInt[1][0] && ei.b(paramDouble3) - k == arrayOfInt[1][2]) {
/* 415 */         paramDouble2 += arrayOfInt[1][1];
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 420 */       return g(paramDouble1, paramDouble2, paramDouble3);
/*     */     } 
/* 422 */     return null;
/*     */   }
/*     */   
/*     */   public ah g(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 426 */     int i = ei.b(paramDouble1);
/* 427 */     int j = ei.b(paramDouble2);
/* 428 */     int k = ei.b(paramDouble3);
/* 429 */     if (this.ad.a(i, j - 1, k) == ln.aG.ba) {
/* 430 */       j--;
/*     */     }
/*     */     
/* 433 */     if (this.ad.a(i, j, k) == ln.aG.ba) {
/* 434 */       int m = this.ad.e(i, j, k);
/* 435 */       paramDouble2 = j;
/* 436 */       if (m >= 2 && m <= 5) {
/* 437 */         paramDouble2 = (j + 1);
/*     */       }
/*     */       
/* 440 */       int[][] arrayOfInt = j[m];
/*     */       
/* 442 */       double d1 = 0.0D;
/* 443 */       double d2 = i + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 444 */       double d3 = j + 0.5D + arrayOfInt[0][1] * 0.5D;
/* 445 */       double d4 = k + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 446 */       double d5 = i + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 447 */       double d6 = j + 0.5D + arrayOfInt[1][1] * 0.5D;
/* 448 */       double d7 = k + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */       
/* 450 */       double d8 = d5 - d2;
/* 451 */       double d9 = (d6 - d3) * 2.0D;
/* 452 */       double d10 = d7 - d4;
/*     */       
/* 454 */       if (d8 == 0.0D) {
/* 455 */         paramDouble1 = i + 0.5D;
/* 456 */         d1 = paramDouble3 - k;
/* 457 */       } else if (d10 == 0.0D) {
/* 458 */         paramDouble3 = k + 0.5D;
/* 459 */         d1 = paramDouble1 - i;
/*     */       } else {
/*     */         
/* 462 */         double d11 = paramDouble1 - d2;
/* 463 */         double d12 = paramDouble3 - d4;
/*     */         
/* 465 */         double d13 = (d11 * d8 + d12 * d10) * 2.0D;
/* 466 */         d1 = d13;
/*     */       } 
/*     */       
/* 469 */       paramDouble1 = d2 + d8 * d1;
/* 470 */       paramDouble2 = d3 + d9 * d1;
/* 471 */       paramDouble3 = d4 + d10 * d1;
/* 472 */       if (d9 < 0.0D) paramDouble2++; 
/* 473 */       if (d9 > 0.0D) paramDouble2 += 0.5D; 
/* 474 */       return ah.b(paramDouble1, paramDouble2, paramDouble3);
/*     */     } 
/* 476 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(hc paramhc) {
/* 480 */     paramhc.a("Type", this.d);
/*     */     
/* 482 */     if (this.d == 2) {
/* 483 */       paramhc.a("PushX", this.f);
/* 484 */       paramhc.a("PushZ", this.g);
/* 485 */       paramhc.a("Fuel", (short)this.e);
/* 486 */     } else if (this.d == 1) {
/* 487 */       jy jy = new jy();
/*     */       
/* 489 */       for (byte b = 0; b < this.h.length; b++) {
/* 490 */         if (this.h[b] != null) {
/* 491 */           hc hc1 = new hc();
/* 492 */           hc1.a("Slot", (byte)b);
/* 493 */           this.h[b].a(hc1);
/* 494 */           jy.a(hc1);
/*     */         } 
/*     */       } 
/* 497 */       paramhc.a("Items", jy);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(hc paramhc) {
/* 503 */     this.d = paramhc.e("Type");
/* 504 */     if (this.d == 2) {
/* 505 */       this.f = paramhc.h("PushX");
/* 506 */       this.g = paramhc.h("PushZ");
/* 507 */       this.e = paramhc.d("Fuel");
/* 508 */     } else if (this.d == 1) {
/* 509 */       jy jy = paramhc.l("Items");
/* 510 */       this.h = new eo[a()];
/* 511 */       for (byte b = 0; b < jy.c(); b++) {
/* 512 */         hc hc1 = (hc)jy.a(b);
/* 513 */         int i = hc1.c("Slot") & 0xFF;
/* 514 */         if (i >= 0 && i < this.h.length) this.h[i] = new eo(hc1); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public float h_() {
/* 520 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void f(jx paramjx) {
/* 524 */     if (paramjx == this.ab)
/* 525 */       return;  if (paramjx instanceof fv && !(paramjx instanceof dg) && this.d == 0 && this.ak * this.ak + this.am * this.am > 0.01D && 
/* 526 */       this.ab == null && paramjx.ac == null) {
/* 527 */       paramjx.g(this);
/*     */     }
/*     */ 
/*     */     
/* 531 */     double d1 = paramjx.ah - this.ah;
/* 532 */     double d2 = paramjx.aj - this.aj;
/*     */     
/* 534 */     double d3 = d1 * d1 + d2 * d2;
/* 535 */     if (d3 >= 9.999999747378752E-5D) {
/* 536 */       d3 = ei.a(d3);
/* 537 */       d1 /= d3;
/* 538 */       d2 /= d3;
/* 539 */       double d = 1.0D / d3;
/* 540 */       if (d > 1.0D) d = 1.0D; 
/* 541 */       d1 *= d;
/* 542 */       d2 *= d;
/* 543 */       d1 *= 0.10000000149011612D;
/* 544 */       d2 *= 0.10000000149011612D;
/*     */ 
/*     */       
/* 547 */       d1 *= (1.0F - this.aL);
/* 548 */       d2 *= (1.0F - this.aL);
/* 549 */       d1 *= 0.5D;
/* 550 */       d2 *= 0.5D;
/*     */       
/* 552 */       if (paramjx instanceof no) {
/* 553 */         double d4 = paramjx.ak + this.ak;
/* 554 */         double d5 = paramjx.am + this.am;
/*     */         
/* 556 */         if (((no)paramjx).d == 2 && this.d != 2) {
/* 557 */           this.ak *= 0.20000000298023224D;
/* 558 */           this.am *= 0.20000000298023224D;
/* 559 */           f(paramjx.ak - d1, 0.0D, paramjx.am - d2);
/* 560 */           paramjx.ak *= 0.699999988079071D;
/* 561 */           paramjx.am *= 0.699999988079071D;
/* 562 */         } else if (((no)paramjx).d != 2 && this.d == 2) {
/* 563 */           paramjx.ak *= 0.20000000298023224D;
/* 564 */           paramjx.am *= 0.20000000298023224D;
/* 565 */           paramjx.f(this.ak + d1, 0.0D, this.am + d2);
/* 566 */           this.ak *= 0.699999988079071D;
/* 567 */           this.am *= 0.699999988079071D;
/*     */         } else {
/* 569 */           d4 /= 2.0D;
/* 570 */           d5 /= 2.0D;
/* 571 */           this.ak *= 0.20000000298023224D;
/* 572 */           this.am *= 0.20000000298023224D;
/* 573 */           f(d4 - d1, 0.0D, d5 - d2);
/* 574 */           paramjx.ak *= 0.20000000298023224D;
/* 575 */           paramjx.am *= 0.20000000298023224D;
/* 576 */           paramjx.f(d4 + d1, 0.0D, d5 + d2);
/*     */         } 
/*     */       } else {
/*     */         
/* 580 */         f(-d1, 0.0D, -d2);
/* 581 */         paramjx.f(d1 / 4.0D, 0.0D, d2 / 4.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a() {
/* 587 */     return 27;
/*     */   }
/*     */   
/*     */   public eo a_(int paramInt) {
/* 591 */     return this.h[paramInt];
/*     */   }
/*     */   
/*     */   public eo a(int paramInt1, int paramInt2) {
/* 595 */     if (this.h[paramInt1] != null) {
/* 596 */       if ((this.h[paramInt1]).a <= paramInt2) {
/* 597 */         eo eo2 = this.h[paramInt1];
/* 598 */         this.h[paramInt1] = null;
/* 599 */         return eo2;
/*     */       } 
/* 601 */       eo eo1 = this.h[paramInt1].a(paramInt2);
/* 602 */       if ((this.h[paramInt1]).a == 0) this.h[paramInt1] = null; 
/* 603 */       return eo1;
/*     */     } 
/*     */     
/* 606 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, eo parameo) {
/* 610 */     this.h[paramInt] = parameo;
/* 611 */     if (parameo != null && parameo.a > c()) parameo.a = c(); 
/*     */   }
/*     */   
/*     */   public String b() {
/* 615 */     return "Minecart";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 622 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */   
/*     */   public boolean a(dg paramdg) {
/* 629 */     if (this.d == 0) {
/* 630 */       paramdg.g(this);
/* 631 */     } else if (this.d == 1) {
/* 632 */       paramdg.a(this);
/* 633 */     } else if (this.d == 2) {
/* 634 */       eo eo1 = paramdg.b.e();
/* 635 */       if (eo1 != null && eo1.c == dd.k.aQ) {
/* 636 */         if (--eo1.a == 0) paramdg.b.a(paramdg.b.d, (eo)null); 
/* 637 */         this.e += 1200;
/*     */       } 
/*     */       
/* 640 */       this.f = this.ah - paramdg.ah;
/* 641 */       this.g = this.aj - paramdg.aj;
/*     */     } 
/* 643 */     return true;
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
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
/* 658 */     this.l = paramDouble1;
/* 659 */     this.m = paramDouble2;
/* 660 */     this.n = paramDouble3;
/* 661 */     this.o = paramFloat1;
/* 662 */     this.p = paramFloat2;
/*     */     
/* 664 */     this.k = paramInt;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\no.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */