/*     */ import java.util.ArrayList;
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
/*     */ public class ln
/*     */ {
/* 145 */   public ax bj = e;
/* 146 */   public float bk = 1.0F;
/* 147 */   public float bm = 0.6F; protected ln(int paramInt, fs paramfs) {
/* 148 */     if (n[paramInt] != null) {
/* 149 */       throw new IllegalArgumentException("Slot " + paramInt + " is already occupied by " + n[paramInt] + " when adding " + this);
/*     */     }
/* 151 */     this.bl = paramfs;
/* 152 */     n[paramInt] = this;
/* 153 */     this.ba = paramInt;
/* 154 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 155 */     p[paramInt] = b();
/* 156 */     q[paramInt] = b() ? 255 : 0;
/* 157 */     r[paramInt] = i();
/*     */   }
/*     */   
/*     */   protected ln(int paramInt1, int paramInt2, fs paramfs) {
/* 161 */     this(paramInt1, paramfs);
/* 162 */     this.aZ = paramInt2;
/*     */   }
/*     */   
/*     */   protected ln a(ax paramax) {
/* 166 */     this.bj = paramax;
/* 167 */     return this;
/*     */   }
/*     */   
/*     */   protected ln d(int paramInt) {
/* 171 */     q[this.ba] = paramInt;
/* 172 */     return this;
/*     */   }
/*     */   
/*     */   protected ln a(float paramFloat) {
/* 176 */     s[this.ba] = (int)(15.0F * paramFloat);
/* 177 */     return this;
/*     */   }
/*     */   
/*     */   protected ln b(float paramFloat) {
/* 181 */     this.bc = paramFloat * 3.0F;
/* 182 */     return this;
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 186 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 190 */     return true;
/*     */   }
/*     */   
/*     */   public int f() {
/* 194 */     return 0;
/*     */   }
/*     */   
/*     */   protected ln c(float paramFloat) {
/* 198 */     this.bb = paramFloat;
/* 199 */     if (this.bc < paramFloat * 5.0F) {
/* 200 */       this.bc = paramFloat * 5.0F;
/*     */     }
/* 202 */     return this;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean) {
/* 206 */     o[this.ba] = paramBoolean;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 210 */     this.bd = paramFloat1;
/* 211 */     this.be = paramFloat2;
/* 212 */     this.bf = paramFloat3;
/* 213 */     this.bg = paramFloat4;
/* 214 */     this.bh = paramFloat5;
/* 215 */     this.bi = paramFloat6;
/*     */   }
/*     */   
/*     */   public float c(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 219 */     return parammz.c(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean c(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 223 */     return ((paramInt4 == 0 && this.be > 0.0D) || (paramInt4 == 1 && this.bh < 1.0D) || (paramInt4 == 2 && this.bf > 0.0D) || (paramInt4 == 3 && this.bi < 1.0D) || (paramInt4 == 4 && this.bd > 0.0D) || (paramInt4 == 5 && this.bg < 1.0D) || !parammz.g(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public int a(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 227 */     return a(paramInt4, parammz.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/* 231 */     return a(paramInt1);
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 235 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public cb f(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 239 */     return cb.b(paramInt1 + this.bd, paramInt2 + this.be, paramInt3 + this.bf, paramInt1 + this.bg, paramInt2 + this.bh, paramInt3 + this.bi);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, cb paramcb, ArrayList<cb> paramArrayList) {
/* 243 */     cb cb1 = d(paramcj, paramInt1, paramInt2, paramInt3);
/* 244 */     if (cb1 != null && paramcb.a(cb1)) {
/* 245 */       paramArrayList.add(cb1);
/*     */     }
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 250 */     return cb.b(paramInt1 + this.bd, paramInt2 + this.be, paramInt3 + this.bf, paramInt1 + this.bg, paramInt2 + this.bh, paramInt3 + this.bi);
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 254 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/* 258 */     return h();
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 262 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*     */ 
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*     */ 
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */   
/*     */   public int a() {
/* 278 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public int a(Random paramRandom) {
/* 288 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 292 */     return this.ba;
/*     */   }
/*     */   
/*     */   public float a(dg paramdg) {
/* 296 */     if (this.bb < 0.0F) {
/* 297 */       return 0.0F;
/*     */     }
/* 299 */     if (!paramdg.b(this)) {
/* 300 */       return 1.0F / this.bb / 100.0F;
/*     */     }
/* 302 */     return paramdg.a(this) / this.bb / 30.0F;
/*     */   }
/*     */   
/*     */   public void b_(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 306 */     a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
/* 310 */     if (paramcj.v)
/*     */       return;  int i;
/*     */     byte b;
/* 313 */     for (i = a(paramcj.m), b = 0; b < i; b++) {
/* 314 */       if (paramcj.m.nextFloat() <= paramFloat) {
/* 315 */         int j = a(paramInt4, paramcj.m);
/* 316 */         if (j > 0) {
/*     */           
/* 318 */           dr dr = new dr(paramcj, paramInt1 + (paramcj.m.nextFloat() * 0.7F) + 0.15000000596046448D, paramInt2 + (paramcj.m.nextFloat() * 0.7F) + 0.15000000596046448D, paramInt3 + (paramcj.m.nextFloat() * 0.7F) + 0.15000000596046448D, new eo(j));
/* 319 */           dr.c = 10;
/* 320 */           paramcj.a(dr);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public float a(jx paramjx) {
/* 327 */     return this.bc / 5.0F;
/*     */   }
/*     */   
/*     */   public lv a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, ah paramah1, ah paramah2) {
/* 331 */     a(paramcj, paramInt1, paramInt2, paramInt3);
/* 332 */     paramah1 = paramah1.c(-paramInt1, -paramInt2, -paramInt3);
/* 333 */     paramah2 = paramah2.c(-paramInt1, -paramInt2, -paramInt3);
/* 334 */     ah ah1 = paramah1.a(paramah2, this.bd);
/* 335 */     ah ah2 = paramah1.a(paramah2, this.bg);
/* 336 */     ah ah3 = paramah1.b(paramah2, this.be);
/* 337 */     ah ah4 = paramah1.b(paramah2, this.bh);
/* 338 */     ah ah5 = paramah1.c(paramah2, this.bf);
/* 339 */     ah ah6 = paramah1.c(paramah2, this.bi);
/* 340 */     if (!a(ah1)) {
/* 341 */       ah1 = null;
/*     */     }
/* 343 */     if (!a(ah2)) {
/* 344 */       ah2 = null;
/*     */     }
/* 346 */     if (!b(ah3)) {
/* 347 */       ah3 = null;
/*     */     }
/* 349 */     if (!b(ah4)) {
/* 350 */       ah4 = null;
/*     */     }
/* 352 */     if (!c(ah5)) {
/* 353 */       ah5 = null;
/*     */     }
/* 355 */     if (!c(ah6)) {
/* 356 */       ah6 = null;
/*     */     }
/* 358 */     ah ah7 = null;
/* 359 */     if (ah1 != null && (ah7 == null || paramah1.c(ah1) < paramah1.c(ah7))) {
/* 360 */       ah7 = ah1;
/*     */     }
/* 362 */     if (ah2 != null && (ah7 == null || paramah1.c(ah2) < paramah1.c(ah7))) {
/* 363 */       ah7 = ah2;
/*     */     }
/* 365 */     if (ah3 != null && (ah7 == null || paramah1.c(ah3) < paramah1.c(ah7))) {
/* 366 */       ah7 = ah3;
/*     */     }
/* 368 */     if (ah4 != null && (ah7 == null || paramah1.c(ah4) < paramah1.c(ah7))) {
/* 369 */       ah7 = ah4;
/*     */     }
/* 371 */     if (ah5 != null && (ah7 == null || paramah1.c(ah5) < paramah1.c(ah7))) {
/* 372 */       ah7 = ah5;
/*     */     }
/* 374 */     if (ah6 != null && (ah7 == null || paramah1.c(ah6) < paramah1.c(ah7))) {
/* 375 */       ah7 = ah6;
/*     */     }
/* 377 */     if (ah7 == null) {
/* 378 */       return null;
/*     */     }
/* 380 */     byte b = -1;
/* 381 */     if (ah7 == ah1) {
/* 382 */       b = 4;
/*     */     }
/* 384 */     if (ah7 == ah2) {
/* 385 */       b = 5;
/*     */     }
/* 387 */     if (ah7 == ah3) {
/* 388 */       b = 0;
/*     */     }
/* 390 */     if (ah7 == ah4) {
/* 391 */       b = 1;
/*     */     }
/* 393 */     if (ah7 == ah5) {
/* 394 */       b = 2;
/*     */     }
/* 396 */     if (ah7 == ah6) {
/* 397 */       b = 3;
/*     */     }
/* 399 */     return new lv(paramInt1, paramInt2, paramInt3, b, ah7.c(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   private boolean a(ah paramah) {
/* 403 */     return (paramah != null && paramah.b >= this.be && paramah.b <= this.bh && paramah.c >= this.bf && paramah.c <= this.bi);
/*     */   }
/*     */   
/*     */   private boolean b(ah paramah) {
/* 407 */     return (paramah != null && paramah.a >= this.bd && paramah.a <= this.bg && paramah.c >= this.bf && paramah.c <= this.bi);
/*     */   }
/*     */   
/*     */   private boolean c(ah paramah) {
/* 411 */     return (paramah != null && paramah.a >= this.bd && paramah.a <= this.bg && paramah.b >= this.be && paramah.b <= this.bh);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public int g() {
/* 418 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 422 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/* 423 */     return (i == 0 || (n[i]).bl.d());
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 427 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {}
/*     */ 
/*     */   
/*     */   public void d(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {}
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx, ah paramah) {}
/*     */ 
/*     */   
/*     */   public void a(mz parammz, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */   public int d(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 446 */     return 16777215;
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 450 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 454 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {}
/*     */   
/*     */   public boolean c(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 461 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {}
/*     */   
/*     */   public void a_(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 468 */     b_(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean g(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 472 */     return true;
/*     */   }
/*     */ 
/*     */   
/* 476 */   public static final ax e = new ax("stone", 1.0F, 1.0F);
/* 477 */   public static final ax f = new ax("wood", 1.0F, 1.0F);
/* 478 */   public static final ax g = new ax("gravel", 1.0F, 1.0F);
/* 479 */   public static final ax h = new ax("grass", 1.0F, 1.0F);
/* 480 */   public static final ax i = new ax("stone", 1.0F, 1.0F);
/* 481 */   public static final ax j = new ax("stone", 1.0F, 1.5F);
/* 482 */   public static final ax k = new t("stone", 1.0F, 1.0F);
/* 483 */   public static final ax l = new ax("cloth", 1.0F, 1.0F);
/* 484 */   public static final ax m = new s("sand", 1.0F, 1.0F);
/* 485 */   public static final ln[] n = new ln[256];
/* 486 */   public static final boolean[] o = new boolean[256];
/* 487 */   public static final boolean[] p = new boolean[256];
/* 488 */   public static final int[] q = new int[256];
/* 489 */   public static final boolean[] r = new boolean[256];
/* 490 */   public static final int[] s = new int[256];
/* 491 */   public static final ln t = (new bz(1, 1)).c(1.5F).b(10.0F).a(i);
/* 492 */   public static final ml u = (ml)(new ml(2)).c(0.6F).a(h);
/* 493 */   public static final ln v = (new hq(3, 2)).c(0.5F).a(g);
/*     */ 
/*     */ 
/*     */   
/* 497 */   public static final ln w = (new ln(4, 16, fs.d)).c(2.0F).b(10.0F).a(i);
/* 498 */   public static final ln x = (new ln(5, 4, fs.c)).c(2.0F).b(5.0F).a(f);
/* 499 */   public static final ln y = (new ClassDo(6, 15)).c(0.0F).a(h);
/* 500 */   public static final ln z = (new ln(7, 17, fs.d)).c(-1.0F).b(6000000.0F).a(i);
/* 501 */   public static final ln A = (new hl(8, fs.f)).c(100.0F).d(3);
/* 502 */   public static final ln B = (new hd(9, fs.f)).c(100.0F).d(3);
/* 503 */   public static final ln C = (new hl(10, fs.g)).c(0.0F).a(1.0F).d(255);
/* 504 */   public static final ln D = (new hd(11, fs.g)).c(100.0F).a(1.0F).d(255);
/* 505 */   public static final ln E = (new dc(12, 18)).c(0.5F).a(m);
/* 506 */   public static final ln F = (new gp(13, 19)).c(0.6F).a(g);
/* 507 */   public static final ln G = (new gm(14, 32)).c(3.0F).b(5.0F).a(i);
/* 508 */   public static final ln H = (new gm(15, 33)).c(3.0F).b(5.0F).a(i);
/* 509 */   public static final ln I = (new gm(16, 34)).c(3.0F).b(5.0F).a(i);
/* 510 */   public static final ln J = (new lw(17)).c(2.0F).a(f);
/* 511 */   public static final iq K = (iq)(new iq(18, 52)).c(0.2F).d(1).a(h);
/* 512 */   public static final ln L = (new mt(19)).c(0.6F).a(h);
/* 513 */   public static final ln M = (new cp(20, 49, fs.o, false)).c(0.3F).a(k);
/* 514 */   public static final ln N = null;
/* 515 */   public static final ln O = null;
/* 516 */   public static final ln P = null;
/* 517 */   public static final ln Q = null;
/* 518 */   public static final ln R = null;
/* 519 */   public static final ln S = null;
/* 520 */   public static final ln T = null;
/* 521 */   public static final ln U = null;
/* 522 */   public static final ln V = null;
/* 523 */   public static final ln W = null;
/* 524 */   public static final ln X = null;
/* 525 */   public static final ln Y = null;
/* 526 */   public static final ln Z = null;
/* 527 */   public static final ln aa = null;
/* 528 */   public static final ln ab = (new ln(35, 64, fs.k)).c(0.8F).a(l);
/* 529 */   public static final ln ac = null;
/* 530 */   public static final me ad = (me)(new me(37, 13)).c(0.0F).a(h);
/* 531 */   public static final me ae = (me)(new me(38, 12)).c(0.0F).a(h);
/* 532 */   public static final me af = (me)(new kn(39, 29)).c(0.0F).a(h).a(0.125F);
/* 533 */   public static final me ag = (me)(new kn(40, 28)).c(0.0F).a(h);
/* 534 */   public static final ln ah = (new c(41, 39)).c(3.0F).b(10.0F).a(j);
/* 535 */   public static final ln ai = (new c(42, 38)).c(5.0F).b(10.0F).a(j);
/* 536 */   public static final ln aj = (new nu(43, true)).c(2.0F).b(10.0F).a(i);
/* 537 */   public static final ln ak = (new nu(44, false)).c(2.0F).b(10.0F).a(i);
/* 538 */   public static final ln al = (new ln(45, 7, fs.d)).c(2.0F).b(10.0F).a(i);
/* 539 */   public static final ln am = (new p(46, 8)).c(0.0F).a(h);
/* 540 */   public static final ln an = (new dn(47, 35)).c(1.5F).a(f);
/* 541 */   public static final ln ao = (new ln(48, 36, fs.d)).c(2.0F).b(10.0F).a(i);
/* 542 */   public static final ln ap = (new ci(49, 37)).c(10.0F).b(2000.0F).a(i);
/* 543 */   public static final ln aq = (new lz(50, 80)).c(0.0F).a(0.9375F).a(f);
/* 544 */   public static final ns ar = (ns)(new ns(51, 31)).c(0.0F).a(1.0F).a(f);
/* 545 */   public static final ln as = (new bf(52, 65)).c(5.0F).a(j);
/* 546 */   public static final ln at = new kb(53, x);
/* 547 */   public static final ln au = (new b(54)).c(2.5F).a(f);
/* 548 */   public static final ln av = (new jv(55, 84)).c(0.0F).a(e);
/* 549 */   public static final ln aw = (new gm(56, 50)).c(3.0F).b(5.0F).a(i);
/* 550 */   public static final ln ax = (new c(57, 40)).c(5.0F).b(10.0F).a(j);
/* 551 */   public static final ln ay = (new co(58)).c(2.5F).a(f);
/* 552 */   public static final ln az = (new gt(59, 88)).c(0.0F).a(h);
/* 553 */   public static final ln aA = (new ly(60)).c(0.6F).a(g);
/* 554 */   public static final ln aB = (new kj(61, false)).c(3.5F).a(i);
/* 555 */   public static final ln aC = (new kj(62, true)).c(3.5F).a(i).a(0.875F);
/* 556 */   public static final ln aD = (new lg(63, nn.class, true)).c(1.0F).a(f);
/* 557 */   public static final ln aE = (new fn(64, fs.c)).c(3.0F).a(f);
/* 558 */   public static final ln aF = (new bn(65, 83)).c(0.4F).a(f);
/* 559 */   public static final ln aG = (new hv(66, 128)).c(0.7F).a(j);
/* 560 */   public static final ln aH = new kb(67, w);
/* 561 */   public static final ln aI = (new lg(68, nn.class, false)).c(1.0F).a(f);
/* 562 */   public static final ln aJ = (new nb(69, 96)).c(0.5F).a(f);
/* 563 */   public static final ln aK = (new aj(70, t.aZ, ji.b)).c(0.5F).a(i);
/* 564 */   public static final ln aL = (new fn(71, fs.e)).c(5.0F).a(j);
/* 565 */   public static final ln aM = (new aj(72, x.aZ, ji.a)).c(0.5F).a(f);
/* 566 */   public static final ln aN = (new ag(73, 51, false)).c(3.0F).b(5.0F).a(i);
/* 567 */   public static final ln aO = (new ag(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(i);
/* 568 */   public static final ln aP = (new bc(75, 115, false)).c(0.0F).a(f);
/* 569 */   public static final ln aQ = (new bc(76, 99, true)).c(0.0F).a(0.5F).a(f);
/* 570 */   public static final ln aR = (new hk(77, t.aZ)).c(0.5F).a(i);
/* 571 */   public static final ln aS = (new ev(78, 66)).c(0.1F).a(l);
/* 572 */   public static final ln aT = (new gu(79, 67)).c(0.5F).d(3).a(k);
/* 573 */   public static final ln aU = (new o(80, 66)).c(0.2F).a(l);
/* 574 */   public static final ln aV = (new ho(81, 70)).c(0.4F).a(l);
/* 575 */   public static final ln aW = (new jl(82, 72)).c(0.6F).a(g);
/* 576 */   public static final ln aX = (new jc(83, 73)).c(0.0F).a(h);
/* 577 */   public static final ln aY = (new cr(84, 74)).c(2.0F).b(10.0F).a(i);
/*     */   
/* 579 */   public static final ln QuadWindowGlassBlock = (new cp(90, 145, fs.o, false)).c(0.3F).a(k);
/* 580 */   public static final ln PillarBlock = (new ln(91, 144, fs.c)).c(2.0F).b(5.0F).a(f);
/* 581 */   public static final ln TileBlock = (new ln(92, 146, fs.d)).c(2.0F).b(10.0F).a(i);
/* 582 */   public static final ln TileBlock2 = (new ln(93, 147, fs.d)).c(2.0F).b(10.0F).a(i);
/* 583 */   public static final ln TileBlock2NonFucked = (new cp(94, 147, fs.o, false)).c(0.3F).a(k);
/* 584 */   public static final ln dimensionFloorBlock = (new ln(95, 148, fs.d)).c(2.0F).b(10.0F).a(i);
/* 585 */   public static final ln dimensionWallBlock = (new ln(96, 149, fs.d)).c(2.0F).b(10.0F).a(i);
/* 586 */   public static final ln dbgBlock = (new ln(97, 150, fs.d)).c(2.0F).b(10.0F).a(i);
/* 587 */   public static final ln TileBlock3 = (new ln(98, 151, fs.d)).c(2.0F).b(10.0F).a(i);
/* 588 */   public static final ln TileBlock4 = (new ln(99, 152, fs.d)).c(2.0F).b(10.0F).a(i);
/* 589 */   public static final ln fakeGrass = (new BlockMultiSided(100, 153, 154, 155)).c(0.6F).a(h);
/* 590 */   public static final ln MojangBlockBlue = (new ln(101, 156, fs.d)).c(2.0F).b(10.0F).a(i);
/* 591 */   public static final ln MojangBlockWhite = (new ln(102, 157, fs.d)).c(2.0F).b(10.0F).a(i);
/* 592 */   public static final ln MojangBlockGreen = (new ln(103, 158, fs.d)).c(2.0F).b(10.0F).a(i);
/* 593 */   public static final ln BarrierBlock = (new BlockHidable(104, 159, fs.o, false)).c(0.3F).a(k);
/* 594 */   public static final ln StairLadderBlock = (new bn(105, 161)).c(0.4F).a(f);
/* 595 */   public static final ln fakeDirt = (new ln(106, 162, fs.d)).c(0.6F).b(10.0F).a(h);
/* 596 */   public static final ln fakeRock = (new ln(107, 163, fs.d)).c(2.0F).b(10.0F).a(i);
/* 597 */   public static final ln fakeSand = (new dc(108, 164)).c(0.5F).a(m); public int aZ;
/*     */   static {
/* 599 */     for (byte b = 0; b < 'Ā'; b++) {
/* 600 */       if (n[b] != null)
/* 601 */         dd.c[b] = new ar(b - 256); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final int ba;
/*     */   protected float bb;
/*     */   protected float bc;
/*     */   public double bd;
/*     */   public double be;
/*     */   public double bf;
/*     */   public double bg;
/*     */   public double bh;
/*     */   public double bi;
/*     */   public final fs bl;
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ln.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */