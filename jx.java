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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class jx
/*     */ {
/*  19 */   private static int a = 0;
/*     */   
/*  21 */   public int Z = a++;
/*     */   
/*     */   public boolean aa = false;
/*     */   
/*     */   public jx ab;
/*     */   
/*     */   public jx ac;
/*     */   protected cj ad;
/*     */   public double ae;
/*     */   public double af;
/*     */   public double ag;
/*     */   public double ah;
/*  33 */   public final cb ar = cb.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); public double ai; public double aj; public double ak; public double al; public double am; public float an; public float ao; public float ap; public float aq;
/*     */   public boolean as = false;
/*     */   public boolean at;
/*     */   public boolean au;
/*     */   public boolean av = false;
/*     */   public boolean aw = true;
/*     */   public boolean ax = false;
/*  40 */   public float ay = 0.0F;
/*     */   
/*  42 */   public float az = 0.6F;
/*  43 */   public float aA = 1.8F;
/*     */   
/*  45 */   public float aB = 0.0F;
/*  46 */   public float aC = 0.0F;
/*     */   protected boolean aD = true;
/*  48 */   protected float aE = 0.0F;
/*  49 */   private int b = 1; public double aF; public double aG;
/*     */   public double aH;
/*  51 */   public float aI = 0.0F;
/*  52 */   public float aJ = 0.0F;
/*     */   public boolean aK = false;
/*  54 */   public float aL = 0.0F;
/*     */   
/*     */   public boolean aM = false;
/*  57 */   protected Random aN = new Random();
/*  58 */   public int aO = 0;
/*  59 */   public int aP = 1;
/*     */   
/*  61 */   public int aQ = 0;
/*     */   
/*  63 */   protected int aR = 300;
/*     */   protected boolean aS = false;
/*  65 */   public int aT = 0;
/*  66 */   public int aU = 300; private boolean c = true;
/*     */   public String aV;
/*     */   private double d;
/*     */   private double e;
/*     */   public boolean aW;
/*     */   public int aX;
/*     */   public int aY;
/*     */   public int aZ;
/*     */   public int ba;
/*     */   public int bb;
/*     */   public int bc;
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  79 */     if (paramObject instanceof jx) {
/*  80 */       return (((jx)paramObject).Z == this.Z);
/*     */     }
/*  82 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  86 */     return this.Z;
/*     */   }
/*     */   
/*     */   protected void o() {
/*  90 */     if (this.ad == null) {
/*     */       return;
/*     */     }
/*     */     
/*  94 */     while (this.ai > 0.0D) {
/*  95 */       a(this.ah, this.ai, this.aj);
/*  96 */       if (this.ad.a(this, this.ar).size() == 0)
/*  97 */         break;  this.ai++;
/*     */     } 
/*     */     
/* 100 */     this.ak = this.al = this.am = 0.0D;
/*     */     
/* 102 */     this.ao = 0.0F;
/*     */   }
/*     */   
/*     */   public void D() {
/* 106 */     this.ax = true;
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat1, float paramFloat2) {
/* 110 */     this.az = paramFloat1;
/* 111 */     this.aA = paramFloat2;
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
/*     */   protected void c(float paramFloat1, float paramFloat2) {
/* 123 */     this.an = paramFloat1;
/* 124 */     this.ao = paramFloat2;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 128 */     this.ah = paramDouble1;
/* 129 */     this.ai = paramDouble2;
/* 130 */     this.aj = paramDouble3;
/* 131 */     float f1 = this.az / 2.0F;
/* 132 */     float f2 = this.aA;
/*     */     
/* 134 */     this.ar.c(paramDouble1 - f1, paramDouble2 - this.ay + this.aI, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 - this.ay + this.aI + f2, paramDouble3 + f1);
/*     */   }
/*     */   
/*     */   public void d(float paramFloat1, float paramFloat2) {
/* 138 */     float f1 = this.ao;
/* 139 */     float f2 = this.an;
/*     */     
/* 141 */     this.an = (float)(this.an + paramFloat1 * 0.15D);
/* 142 */     this.ao = (float)(this.ao - paramFloat2 * 0.15D);
/* 143 */     if (this.ao < -90.0F) this.ao = -90.0F; 
/* 144 */     if (this.ao > 90.0F) this.ao = 90.0F;
/*     */     
/* 146 */     this.aq += this.ao - f1;
/* 147 */     this.ap += this.an - f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e_() {
/* 158 */     w();
/*     */   }
/*     */   
/*     */   public void w() {
/* 162 */     if (this.ac != null && this.ac.ax) this.ac = null;
/*     */     
/* 164 */     this.aO++;
/* 165 */     this.aB = this.aC;
/* 166 */     this.ae = this.ah;
/* 167 */     this.af = this.ai;
/* 168 */     this.ag = this.aj;
/* 169 */     this.aq = this.ao;
/* 170 */     this.ap = this.an;
/*     */     
/* 172 */     if (g_()) {
/* 173 */       if (!this.aS && !this.c) {
/* 174 */         float f1 = ei.a(this.ak * this.ak * 0.20000000298023224D + this.al * this.al + this.am * this.am * 0.20000000298023224D) * 0.2F;
/* 175 */         if (f1 > 1.0F) f1 = 1.0F; 
/* 176 */         this.ad.a(this, "random.splash", f1, 1.0F + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.4F);
/* 177 */         float f2 = ei.b(this.ar.b); byte b;
/* 178 */         for (b = 0; b < 1.0F + this.az * 20.0F; b++) {
/* 179 */           float f3 = (this.aN.nextFloat() * 2.0F - 1.0F) * this.az;
/* 180 */           float f4 = (this.aN.nextFloat() * 2.0F - 1.0F) * this.az;
/* 181 */           this.ad.a("bubble", this.ah + f3, (f2 + 1.0F), this.aj + f4, this.ak, this.al - (this.aN.nextFloat() * 0.2F), this.am);
/*     */         } 
/* 183 */         for (b = 0; b < 1.0F + this.az * 20.0F; b++) {
/* 184 */           float f3 = (this.aN.nextFloat() * 2.0F - 1.0F) * this.az;
/* 185 */           float f4 = (this.aN.nextFloat() * 2.0F - 1.0F) * this.az;
/* 186 */           this.ad.a("splash", this.ah + f3, (f2 + 1.0F), this.aj + f4, this.ak, this.al, this.am);
/*     */         } 
/*     */       } 
/* 189 */       this.aE = 0.0F;
/* 190 */       this.aS = true;
/* 191 */       this.aQ = 0;
/*     */     } else {
/* 193 */       this.aS = false;
/*     */     } 
/*     */     
/* 196 */     if (this.aQ > 0) {
/* 197 */       if (this.aQ % 20 == 0) {
/* 198 */         a((jx)null, 1);
/*     */       }
/* 200 */       this.aQ--;
/*     */     } 
/*     */     
/* 203 */     if (E()) {
/* 204 */       a((jx)null, 10);
/* 205 */       this.aQ = 600;
/*     */     } 
/*     */     
/* 208 */     if (this.ai < -64.0D) {
/* 209 */       C();
/*     */     }
/*     */     
/* 212 */     this.c = false;
/*     */   }
/*     */   
/*     */   protected void C() {
/* 216 */     D();
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
/*     */   public boolean b(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 229 */     cb cb1 = this.ar.c(paramDouble1, paramDouble2, paramDouble3);
/* 230 */     List list = this.ad.a(this, cb1);
/* 231 */     if (list.size() > 0) return false; 
/* 232 */     if (this.ad.b(cb1)) return false;
/*     */     
/* 234 */     return true;
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 238 */     if (this.aK) {
/* 239 */       this.ar.d(paramDouble1, paramDouble2, paramDouble3);
/* 240 */       this.ah = (this.ar.a + this.ar.d) / 2.0D;
/* 241 */       this.ai = this.ar.b + this.ay - this.aI;
/* 242 */       this.aj = (this.ar.c + this.ar.f) / 2.0D;
/*     */       
/*     */       return;
/*     */     } 
/* 246 */     double d1 = this.ah;
/* 247 */     double d2 = this.aj;
/*     */     
/* 249 */     double d3 = paramDouble1;
/* 250 */     double d4 = paramDouble2;
/* 251 */     double d5 = paramDouble3;
/*     */     
/* 253 */     cb cb1 = this.ar.c();
/* 254 */     List<cb> list = this.ad.a(this, this.ar.a(paramDouble1, paramDouble2, paramDouble3));
/*     */     
/*     */     byte b1;
/* 257 */     for (b1 = 0; b1 < list.size(); b1++)
/* 258 */       paramDouble2 = ((cb)list.get(b1)).b(this.ar, paramDouble2); 
/* 259 */     this.ar.d(0.0D, paramDouble2, 0.0D);
/*     */     
/* 261 */     if (!this.aw && d4 != paramDouble2) {
/* 262 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 265 */     b1 = (this.as || (d4 != paramDouble2 && d4 < 0.0D)) ? 1 : 0;
/*     */     
/*     */     byte b2;
/* 268 */     for (b2 = 0; b2 < list.size(); b2++)
/* 269 */       paramDouble1 = ((cb)list.get(b2)).a(this.ar, paramDouble1); 
/* 270 */     this.ar.d(paramDouble1, 0.0D, 0.0D);
/*     */     
/* 272 */     if (!this.aw && d3 != paramDouble1) {
/* 273 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 276 */     for (b2 = 0; b2 < list.size(); b2++)
/* 277 */       paramDouble3 = ((cb)list.get(b2)).c(this.ar, paramDouble3); 
/* 278 */     this.ar.d(0.0D, 0.0D, paramDouble3);
/*     */     
/* 280 */     if (!this.aw && d5 != paramDouble3) {
/* 281 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */     }
/*     */     
/* 284 */     if (this.aJ > 0.0F && b1 != 0 && this.aI < 0.05F && (d3 != paramDouble1 || d5 != paramDouble3)) {
/* 285 */       double d8 = paramDouble1;
/* 286 */       double d9 = paramDouble2;
/* 287 */       double d10 = paramDouble3;
/*     */       
/* 289 */       paramDouble1 = d3;
/* 290 */       paramDouble2 = this.aJ;
/* 291 */       paramDouble3 = d5;
/*     */       
/* 293 */       cb cb2 = this.ar.c();
/* 294 */       this.ar.b(cb1);
/* 295 */       list = this.ad.a(this, this.ar.a(paramDouble1, paramDouble2, paramDouble3));
/*     */       
/*     */       byte b;
/* 298 */       for (b = 0; b < list.size(); b++)
/* 299 */         paramDouble2 = ((cb)list.get(b)).b(this.ar, paramDouble2); 
/* 300 */       this.ar.d(0.0D, paramDouble2, 0.0D);
/*     */       
/* 302 */       if (!this.aw && d4 != paramDouble2) {
/* 303 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */ 
/*     */       
/* 307 */       for (b = 0; b < list.size(); b++)
/* 308 */         paramDouble1 = ((cb)list.get(b)).a(this.ar, paramDouble1); 
/* 309 */       this.ar.d(paramDouble1, 0.0D, 0.0D);
/*     */       
/* 311 */       if (!this.aw && d3 != paramDouble1) {
/* 312 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */       
/* 315 */       for (b = 0; b < list.size(); b++)
/* 316 */         paramDouble3 = ((cb)list.get(b)).c(this.ar, paramDouble3); 
/* 317 */       this.ar.d(0.0D, 0.0D, paramDouble3);
/*     */       
/* 319 */       if (!this.aw && d5 != paramDouble3) {
/* 320 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*     */       }
/*     */       
/* 323 */       if (d8 * d8 + d10 * d10 >= paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) {
/* 324 */         paramDouble1 = d8;
/* 325 */         paramDouble2 = d9;
/* 326 */         paramDouble3 = d10;
/* 327 */         this.ar.b(cb2);
/*     */       } else {
/* 329 */         this.aI = (float)(this.aI + 0.5D);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 334 */     this.ah = (this.ar.a + this.ar.d) / 2.0D;
/* 335 */     this.ai = this.ar.b + this.ay - this.aI;
/* 336 */     this.aj = (this.ar.c + this.ar.f) / 2.0D;
/*     */     
/* 338 */     this.at = (d3 != paramDouble1 || d5 != paramDouble3);
/* 339 */     this.au = (d4 != paramDouble2);
/* 340 */     this.as = (d4 != paramDouble2 && d4 < 0.0D);
/* 341 */     this.av = (this.at || this.au);
/* 342 */     if (this.as)
/* 343 */     { if (this.aE > 0.0F) {
/* 344 */         c(this.aE);
/* 345 */         this.aE = 0.0F;
/*     */       }
/*     */        }
/* 348 */     else if (paramDouble2 < 0.0D) { this.aE = (float)(this.aE - paramDouble2); }
/*     */ 
/*     */     
/* 351 */     if (d3 != paramDouble1) this.ak = 0.0D; 
/* 352 */     if (d4 != paramDouble2) this.al = 0.0D; 
/* 353 */     if (d5 != paramDouble3) this.am = 0.0D;
/*     */     
/* 355 */     double d6 = this.ah - d1;
/* 356 */     double d7 = this.aj - d2;
/* 357 */     this.aC = (float)(this.aC + ei.a(d6 * d6 + d7 * d7) * 0.6D);
/*     */     
/* 359 */     if (this.aD) {
/* 360 */       int i3 = ei.b(this.ah);
/* 361 */       int i4 = ei.b(this.ai - 0.20000000298023224D - this.ay);
/* 362 */       int i5 = ei.b(this.aj);
/* 363 */       int i6 = this.ad.a(i3, i4, i5);
/* 364 */       if (this.aC > this.b && i6 > 0) {
/* 365 */         this.b++;
/* 366 */         ax ax = (ln.n[i6]).bj;
/* 367 */         if (this.ad.a(i3, i4 + 1, i5) == ln.aS.ba) {
/* 368 */           ax = ln.aS.bj;
/* 369 */           this.ad.a(this, ax.d(), ax.b() * 0.15F, ax.c());
/* 370 */         } else if (!(ln.n[i6]).bl.d()) {
/* 371 */           this.ad.a(this, ax.d(), ax.b() * 0.15F, ax.c());
/*     */         } 
/* 373 */         ln.n[i6].a(this.ad, i3, i4, i5, this);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 378 */     int i = ei.b(this.ar.a);
/* 379 */     int j = ei.b(this.ar.b);
/* 380 */     int k = ei.b(this.ar.c);
/* 381 */     int m = ei.b(this.ar.d);
/* 382 */     int n = ei.b(this.ar.e);
/* 383 */     int i1 = ei.b(this.ar.f);
/* 384 */     for (int i2 = i; i2 <= m; i2++) {
/* 385 */       for (int i3 = j; i3 <= n; i3++) {
/* 386 */         for (int i4 = k; i4 <= i1; i4++) {
/* 387 */           int i5 = this.ad.a(i2, i3, i4);
/* 388 */           if (i5 > 0) {
/* 389 */             ln.n[i5].b(this.ad, i2, i3, i4, this);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 394 */     this.aI *= 0.4F;
/*     */     
/* 396 */     boolean bool = g_();
/* 397 */     if (this.ad.c(this.ar)) {
/* 398 */       a(1);
/* 399 */       if (!bool) {
/* 400 */         this.aQ++;
/* 401 */         if (this.aQ == 0) this.aQ = 300;
/*     */       
/*     */       } 
/* 404 */     } else if (this.aQ <= 0) {
/* 405 */       this.aQ = -this.aP;
/*     */     } 
/*     */ 
/*     */     
/* 409 */     if (bool && this.aQ > 0) {
/* 410 */       this.ad.a(this, "random.fizz", 0.7F, 1.6F + (this.aN.nextFloat() - this.aN.nextFloat()) * 0.4F);
/* 411 */       this.aQ = -this.aP;
/*     */     } 
/*     */   }
/*     */   
/*     */   public cb f_() {
/* 416 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt) {
/* 420 */     a((jx)null, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(float paramFloat) {}
/*     */   
/*     */   public boolean g_() {
/* 427 */     return this.ad.a(this.ar.b(0.0D, -0.4000000059604645D, 0.0D), fs.f, this);
/*     */   }
/*     */   
/*     */   public boolean a(fs paramfs) {
/* 431 */     double d = this.ai + q();
/* 432 */     int i = ei.b(this.ah);
/* 433 */     int j = ei.d(ei.b(d));
/* 434 */     int k = ei.b(this.aj);
/* 435 */     int m = this.ad.a(i, j, k);
/* 436 */     if (m != 0 && (ln.n[m]).bl == paramfs) {
/* 437 */       float f1 = jf.b(this.ad.e(i, j, k)) - 0.11111111F;
/* 438 */       float f2 = (j + 1) - f1;
/* 439 */       return (d < f2);
/*     */     } 
/* 441 */     return false;
/*     */   }
/*     */   
/*     */   protected float q() {
/* 445 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean E() {
/* 449 */     return this.ad.a(this.ar.b(0.0D, -0.4000000059604645D, 0.0D), fs.g);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 453 */     float f1 = ei.c(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
/* 454 */     if (f1 < 0.01F)
/*     */       return; 
/* 456 */     if (f1 < 1.0F) f1 = 1.0F; 
/* 457 */     f1 = paramFloat3 / f1;
/* 458 */     paramFloat1 *= f1;
/* 459 */     paramFloat2 *= f1;
/*     */ 
/*     */     
/* 462 */     float f2 = ei.a(this.an * 3.1415927F / 180.0F);
/* 463 */     float f3 = ei.b(this.an * 3.1415927F / 180.0F);
/*     */     
/* 465 */     this.ak += (paramFloat1 * f3 - paramFloat2 * f2);
/* 466 */     this.am += (paramFloat2 * f3 + paramFloat1 * f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(float paramFloat) {
/* 471 */     int i = ei.b(this.ah);
/*     */     
/* 473 */     double d = (this.ar.e - this.ar.b) * 0.66D;
/* 474 */     int j = ei.b(this.ai - this.ay + d);
/* 475 */     int k = ei.b(this.aj);
/* 476 */     return this.ad.c(i, j, k);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj) {
/* 480 */     this.ad = paramcj;
/*     */   }
/*     */   
/*     */   public void b(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 484 */     this.ae = this.ah = paramDouble1;
/* 485 */     this.af = this.ai = paramDouble2;
/* 486 */     this.ag = this.aj = paramDouble3;
/* 487 */     this.an = paramFloat1;
/* 488 */     this.ao = paramFloat2;
/* 489 */     this.aI = 0.0F;
/*     */     
/* 491 */     double d = (this.ap - paramFloat1);
/* 492 */     if (d < -180.0D) this.ap += 360.0F; 
/* 493 */     if (d >= 180.0D) this.ap -= 360.0F; 
/* 494 */     a(this.ah, this.ai, this.aj);
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 498 */     this.ae = this.ah = paramDouble1;
/* 499 */     this.af = this.ai = paramDouble2 + this.ay;
/* 500 */     this.ag = this.aj = paramDouble3;
/* 501 */     this.an = paramFloat1;
/* 502 */     this.ao = paramFloat2;
/* 503 */     a(this.ah, this.ai, this.aj);
/*     */   }
/*     */   
/*     */   public float d(jx paramjx) {
/* 507 */     float f1 = (float)(this.ah - paramjx.ah);
/* 508 */     float f2 = (float)(this.ai - paramjx.ai);
/* 509 */     float f3 = (float)(this.aj - paramjx.aj);
/* 510 */     return ei.c(f1 * f1 + f2 * f2 + f3 * f3);
/*     */   }
/*     */   
/*     */   public double d(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 514 */     double d1 = this.ah - paramDouble1;
/* 515 */     double d2 = this.ai - paramDouble2;
/* 516 */     double d3 = this.aj - paramDouble3;
/* 517 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double e(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 521 */     double d1 = this.ah - paramDouble1;
/* 522 */     double d2 = this.ai - paramDouble2;
/* 523 */     double d3 = this.aj - paramDouble3;
/* 524 */     return ei.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double e(jx paramjx) {
/* 528 */     double d1 = this.ah - paramjx.ah;
/* 529 */     double d2 = this.ai - paramjx.ai;
/* 530 */     double d3 = this.aj - paramjx.aj;
/* 531 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dg paramdg) {}
/*     */   
/*     */   public void f(jx paramjx) {
/* 538 */     if (paramjx.ab == this || paramjx.ac == this)
/*     */       return; 
/* 540 */     double d1 = paramjx.ah - this.ah;
/* 541 */     double d2 = paramjx.aj - this.aj;
/*     */ 
/*     */     
/* 544 */     double d3 = ei.a(d1, d2);
/*     */     
/* 546 */     if (d3 >= 0.009999999776482582D) {
/* 547 */       d3 = ei.a(d3);
/* 548 */       d1 /= d3;
/* 549 */       d2 /= d3;
/*     */       
/* 551 */       double d = 1.0D / d3;
/* 552 */       if (d > 1.0D) d = 1.0D; 
/* 553 */       d1 *= d;
/* 554 */       d2 *= d;
/*     */       
/* 556 */       d1 *= 0.05000000074505806D;
/* 557 */       d2 *= 0.05000000074505806D;
/*     */       
/* 559 */       d1 *= (1.0F - this.aL);
/* 560 */       d2 *= (1.0F - this.aL);
/*     */       
/* 562 */       f(-d1, 0.0D, -d2);
/* 563 */       paramjx.f(d1, 0.0D, d2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 568 */     this.ak += paramDouble1;
/* 569 */     this.al += paramDouble2;
/* 570 */     this.am += paramDouble3;
/*     */   }
/*     */   
/*     */   public boolean a(jx paramjx, int paramInt) {
/* 574 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c_() {
/* 582 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d_() {
/* 586 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(jx paramjx, int paramInt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ah paramah) {
/* 597 */     double d1 = this.ah - paramah.a;
/* 598 */     double d2 = this.ai - paramah.b;
/* 599 */     double d3 = this.aj - paramah.c;
/* 600 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 601 */     return a(d4);
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble) {
/* 605 */     double d = this.ar.b();
/* 606 */     d *= 64.0D;
/* 607 */     return (paramDouble < d * d);
/*     */   }
/*     */   
/*     */   public String v() {
/* 611 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(hc paramhc) {
/* 619 */     String str = F();
/* 620 */     if (this.ax || str == null) {
/* 621 */       return false;
/*     */     }
/* 623 */     paramhc.a("id", str);
/* 624 */     d(paramhc);
/* 625 */     return true;
/*     */   }
/*     */   
/*     */   public void d(hc paramhc) {
/* 629 */     paramhc.a("Pos", a(new double[] { this.ah, this.ai, this.aj }));
/* 630 */     paramhc.a("Motion", a(new double[] { this.ak, this.al, this.am }));
/* 631 */     paramhc.a("Rotation", a(new float[] { this.an, this.ao }));
/*     */     
/* 633 */     paramhc.a("FallDistance", this.aE);
/* 634 */     paramhc.a("Fire", (short)this.aQ);
/* 635 */     paramhc.a("Air", (short)this.aU);
/* 636 */     paramhc.a("OnGround", this.as);
/*     */     
/* 638 */     a(paramhc);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(hc paramhc) {
/* 643 */     jy jy1 = paramhc.l("Pos");
/* 644 */     jy jy2 = paramhc.l("Motion");
/* 645 */     jy jy3 = paramhc.l("Rotation");
/* 646 */     a(0.0D, 0.0D, 0.0D);
/*     */     
/* 648 */     this.ak = ((kg)jy2.a(0)).a;
/* 649 */     this.al = ((kg)jy2.a(1)).a;
/* 650 */     this.am = ((kg)jy2.a(2)).a;
/*     */     
/* 652 */     this.ae = this.aF = this.ah = ((kg)jy1.a(0)).a;
/* 653 */     this.af = this.aG = this.ai = ((kg)jy1.a(1)).a;
/* 654 */     this.ag = this.aH = this.aj = ((kg)jy1.a(2)).a;
/*     */     
/* 656 */     this.ap = this.an = ((f)jy3.a(0)).a;
/* 657 */     this.aq = this.ao = ((f)jy3.a(1)).a;
/*     */     
/* 659 */     this.aE = paramhc.g("FallDistance");
/* 660 */     this.aQ = paramhc.d("Fire");
/* 661 */     this.aU = paramhc.d("Air");
/* 662 */     this.as = paramhc.m("OnGround");
/*     */     
/* 664 */     a(this.ah, this.ai, this.aj);
/*     */     
/* 666 */     b(paramhc);
/*     */   }
/*     */   
/*     */   protected final String F() {
/* 670 */     return ep.a(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected jy a(double... paramVarArgs) {
/* 678 */     jy jy = new jy();
/* 679 */     for (double d : paramVarArgs)
/* 680 */       jy.a(new kg(d)); 
/* 681 */     return jy;
/*     */   }
/*     */   
/*     */   protected jy a(float... paramVarArgs) {
/* 685 */     jy jy = new jy();
/* 686 */     for (float f : paramVarArgs)
/* 687 */       jy.a(new f(f)); 
/* 688 */     return jy;
/*     */   }
/*     */   
/*     */   public float h_() {
/* 692 */     return this.aA / 2.0F;
/*     */   }
/*     */   
/*     */   public dr b(int paramInt1, int paramInt2) {
/* 696 */     return a(paramInt1, paramInt2, 0.0F);
/*     */   }
/*     */   
/*     */   public dr a(int paramInt1, int paramInt2, float paramFloat) {
/* 700 */     dr dr = new dr(this.ad, this.ah, this.ai + paramFloat, this.aj, new eo(paramInt1, paramInt2));
/* 701 */     dr.c = 10;
/* 702 */     this.ad.a(dr);
/* 703 */     return dr;
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 707 */     return !this.ax;
/*     */   }
/*     */   
/*     */   public boolean G() {
/* 711 */     int i = ei.b(this.ah);
/* 712 */     int j = ei.b(this.ai + q());
/* 713 */     int k = ei.b(this.aj);
/* 714 */     return this.ad.g(i, j, k);
/*     */   }
/*     */   
/*     */   public boolean a(dg paramdg) {
/* 718 */     return false;
/*     */   }
/*     */   
/*     */   public cb b_(jx paramjx) {
/* 722 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public jx(cj paramcj) {
/* 727 */     this.aW = false;
/*     */     this.ad = paramcj;
/*     */     a(0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   public void n() {
/* 732 */     if (this.ac.ax) {
/* 733 */       this.ac = null;
/*     */       return;
/*     */     } 
/* 736 */     this.ak = 0.0D;
/* 737 */     this.al = 0.0D;
/* 738 */     this.am = 0.0D;
/* 739 */     e_();
/* 740 */     this.ac.i_();
/*     */     
/* 742 */     this.e += (this.ac.an - this.ac.ap);
/* 743 */     this.d += (this.ac.ao - this.ac.aq);
/*     */     
/* 745 */     while (this.e >= 180.0D)
/* 746 */       this.e -= 360.0D; 
/* 747 */     while (this.e < -180.0D) {
/* 748 */       this.e += 360.0D;
/*     */     }
/* 750 */     while (this.d >= 180.0D)
/* 751 */       this.d -= 360.0D; 
/* 752 */     while (this.d < -180.0D) {
/* 753 */       this.d += 360.0D;
/*     */     }
/* 755 */     double d1 = this.e * 0.5D;
/* 756 */     double d2 = this.d * 0.5D;
/*     */     
/* 758 */     float f = 10.0F;
/* 759 */     if (d1 > f) d1 = f; 
/* 760 */     if (d1 < -f) d1 = -f; 
/* 761 */     if (d2 > f) d2 = f; 
/* 762 */     if (d2 < -f) d2 = -f;
/*     */     
/* 764 */     this.e -= d1;
/* 765 */     this.d -= d2;
/*     */     
/* 767 */     this.an = (float)(this.an + d1);
/* 768 */     this.ao = (float)(this.ao + d2);
/*     */   }
/*     */   
/*     */   protected void i_() {
/* 772 */     this.ab.a(this.ah, this.ai + j_() + this.ab.t(), this.aj);
/*     */   }
/*     */   
/*     */   public double t() {
/* 776 */     return this.ay;
/*     */   }
/*     */   
/*     */   public double j_() {
/* 780 */     return this.aA * 0.75D;
/*     */   }
/*     */   
/*     */   public void g(jx paramjx) {
/* 784 */     this.d = 0.0D;
/* 785 */     this.e = 0.0D;
/* 786 */     if (this.ac == paramjx) {
/* 787 */       this.ac.ab = null;
/* 788 */       this.ac = null;
/* 789 */       c(paramjx.ah, paramjx.ar.b + paramjx.aA, paramjx.aj, this.an, this.ao);
/*     */       return;
/*     */     } 
/* 792 */     if (this.ac != null) {
/* 793 */       this.ac.ab = null;
/*     */     }
/* 795 */     if (paramjx.ab != null) {
/* 796 */       paramjx.ab.ac = null;
/*     */     }
/* 798 */     this.ac = paramjx;
/* 799 */     paramjx.ab = this;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
/* 803 */     a(paramDouble1, paramDouble2, paramDouble3);
/* 804 */     c(paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   protected abstract void b(hc paramhc);
/*     */   
/*     */   protected abstract void a(hc paramhc);
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */