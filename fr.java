/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fr
/*     */ {
/*     */   public static boolean a;
/*     */   public byte[] b;
/*     */   public boolean c;
/*     */   public cj d;
/*     */   public mi e;
/*     */   public mi f;
/*     */   public mi g;
/*     */   public byte[] h;
/*     */   public int i;
/*     */   public final int j;
/*     */   public final int k;
/*  27 */   public Map l = new HashMap<Object, Object>();
/*  28 */   public List[] m = new List[8];
/*     */   
/*     */   public boolean n = false;
/*     */   public boolean o = false;
/*     */   public boolean p;
/*     */   public boolean q = false;
/*     */   public boolean r = false;
/*  35 */   public long s = 0L;
/*     */   
/*     */   public fr(cj paramcj, int paramInt1, int paramInt2) {
/*  38 */     this.d = paramcj;
/*  39 */     this.j = paramInt1;
/*  40 */     this.k = paramInt2;
/*  41 */     this.h = new byte[256];
/*  42 */     for (byte b = 0; b < this.m.length; b++) {
/*  43 */       this.m[b] = new ArrayList();
/*     */     }
/*     */   }
/*     */   
/*     */   public fr(cj paramcj, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  48 */     this(paramcj, paramInt1, paramInt2);
/*     */     
/*  50 */     this.b = paramArrayOfbyte;
/*  51 */     this.e = new mi(paramArrayOfbyte.length);
/*  52 */     this.f = new mi(paramArrayOfbyte.length);
/*  53 */     this.g = new mi(paramArrayOfbyte.length);
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2) {
/*  57 */     return (paramInt1 == this.j && paramInt2 == this.k);
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2) {
/*  61 */     return this.h[paramInt2 << 4 | paramInt1] & 0xFF;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public void b() {
/*  68 */     byte b1 = 127;
/*  69 */     for (byte b2 = 0; b2 < 16; b2++) {
/*  70 */       for (byte b = 0; b < 16; b++) {
/*  71 */         byte b3 = 127;
/*  72 */         int i = b2 << 11 | b << 7;
/*  73 */         while (b3 > 0 && ln.q[this.b[i + b3 - 1]] == 0)
/*  74 */           b3--; 
/*  75 */         this.h[b << 4 | b2] = (byte)b3;
/*  76 */         if (b3 < b1) b1 = b3; 
/*     */       } 
/*     */     } 
/*  79 */     this.i = b1;
/*  80 */     this.o = true;
/*     */   }
/*     */   
/*     */   public void c() {
/*  84 */     int i = 127; byte b;
/*  85 */     for (b = 0; b < 16; b++) {
/*  86 */       for (byte b1 = 0; b1 < 16; b1++) {
/*  87 */         this.h[b1 << 4 | b] = Byte.MIN_VALUE;
/*  88 */         g(b, 127, b1);
/*  89 */         if ((this.h[b1 << 4 | b] & 0xFF) < i) i = this.h[b1 << 4 | b] & 0xFF; 
/*     */       } 
/*     */     } 
/*  92 */     this.i = i;
/*     */     
/*  94 */     for (b = 0; b < 16; b++) {
/*  95 */       for (byte b1 = 0; b1 < 16; b1++) {
/*  96 */         c(b, b1);
/*     */       }
/*     */     } 
/*  99 */     this.o = true;
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2) {
/* 103 */     int i = b(paramInt1, paramInt2);
/*     */     
/* 105 */     int j = this.j * 16 + paramInt1;
/* 106 */     int k = this.k * 16 + paramInt2;
/* 107 */     f(j - 1, k, i);
/* 108 */     f(j + 1, k, i);
/* 109 */     f(j, k - 1, i);
/* 110 */     f(j, k + 1, i);
/*     */   }
/*     */   
/*     */   private void f(int paramInt1, int paramInt2, int paramInt3) {
/* 114 */     int i = this.d.c(paramInt1, paramInt2);
/* 115 */     if (i > paramInt3) {
/* 116 */       this.d.a(bu.a, paramInt1, paramInt3, paramInt2, paramInt1, i, paramInt2);
/* 117 */     } else if (i < paramInt3) {
/* 118 */       this.d.a(bu.a, paramInt1, i, paramInt2, paramInt1, paramInt3, paramInt2);
/*     */     } 
/* 120 */     this.o = true;
/*     */   }
/*     */   
/*     */   private void g(int paramInt1, int paramInt2, int paramInt3) {
/* 124 */     int i = this.h[paramInt3 << 4 | paramInt1] & 0xFF;
/* 125 */     int j = i;
/* 126 */     if (paramInt2 > i) j = paramInt2;
/*     */     
/* 128 */     int k = paramInt1 << 11 | paramInt3 << 7;
/* 129 */     while (j > 0 && ln.q[this.b[k + j - 1]] == 0)
/* 130 */       j--; 
/* 131 */     if (j == i)
/*     */       return; 
/* 133 */     this.d.f(paramInt1, paramInt3, j, i);
/* 134 */     this.h[paramInt3 << 4 | paramInt1] = (byte)j;
/*     */     
/* 136 */     if (j < this.i) {
/* 137 */       this.i = j;
/*     */     } else {
/* 139 */       int i3 = 127;
/* 140 */       for (byte b = 0; b < 16; b++) {
/* 141 */         for (byte b1 = 0; b1 < 16; b1++) {
/* 142 */           if ((this.h[b1 << 4 | b] & 0xFF) < i3) i3 = this.h[b1 << 4 | b] & 0xFF; 
/*     */         } 
/* 144 */       }  this.i = i3;
/*     */     } 
/*     */     
/* 147 */     int m = this.j * 16 + paramInt1;
/* 148 */     int n = this.k * 16 + paramInt3;
/* 149 */     if (j < i) {
/* 150 */       for (int i3 = j; i3 < i; i3++) {
/* 151 */         this.f.a(paramInt1, i3, paramInt3, 15);
/*     */       }
/*     */     } else {
/* 154 */       this.d.a(bu.a, m, i, n, m, j, n);
/* 155 */       for (int i3 = i; i3 < j; i3++) {
/* 156 */         this.f.a(paramInt1, i3, paramInt3, 0);
/*     */       }
/*     */     } 
/*     */     
/* 160 */     int i1 = 15;
/* 161 */     int i2 = j;
/* 162 */     while (j > 0 && i1 > 0) {
/* 163 */       j--;
/* 164 */       int i3 = ln.q[a(paramInt1, j, paramInt3)];
/* 165 */       if (i3 == 0) i3 = 1; 
/* 166 */       i1 -= i3;
/* 167 */       if (i1 < 0) i1 = 0; 
/* 168 */       this.f.a(paramInt1, j, paramInt3, i1);
/*     */     } 
/*     */     
/* 171 */     while (j > 0 && ln.q[a(paramInt1, j - 1, paramInt3)] == 0)
/* 172 */       j--; 
/* 173 */     if (j != i2) {
/* 174 */       this.d.a(bu.a, m - 1, j, n - 1, m + 1, i2, n + 1);
/*     */     }
/*     */     
/* 177 */     this.o = true;
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/* 181 */     return this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2];
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 185 */     byte b = (byte)paramInt4;
/*     */     
/* 187 */     int i = this.h[paramInt3 << 4 | paramInt1] & 0xFF;
/*     */     
/* 189 */     int j = this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] & 0xFF;
/* 190 */     if (j == paramInt4) return false; 
/* 191 */     int k = this.j * 16 + paramInt1;
/* 192 */     int m = this.k * 16 + paramInt3;
/* 193 */     this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] = b;
/* 194 */     if (j != 0 && 
/* 195 */       !this.d.v) ln.n[j].b(this.d, k, paramInt2, m);
/*     */     
/* 197 */     this.e.a(paramInt1, paramInt2, paramInt3, paramInt5);
/*     */     
/* 199 */     if (ln.q[b] != 0) {
/* 200 */       if (paramInt2 >= i) {
/* 201 */         g(paramInt1, paramInt2 + 1, paramInt3);
/*     */       }
/*     */     }
/* 204 */     else if (paramInt2 == i - 1) {
/* 205 */       g(paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 210 */     this.d.a(bu.a, k, paramInt2, m, k, paramInt2, m);
/* 211 */     this.d.a(bu.b, k, paramInt2, m, k, paramInt2, m);
/*     */     
/* 213 */     c(paramInt1, paramInt3);
/*     */ 
/*     */     
/* 216 */     if (paramInt4 != 0) {
/* 217 */       ln.n[paramInt4].e(this.d, k, paramInt2, m);
/*     */     }
/*     */     
/* 220 */     this.o = true;
/* 221 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 225 */     byte b = (byte)paramInt4;
/* 226 */     int i = this.h[paramInt3 << 4 | paramInt1] & 0xFF;
/*     */     
/* 228 */     int j = this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] & 0xFF;
/* 229 */     if (j == paramInt4) return false; 
/* 230 */     int k = this.j * 16 + paramInt1;
/* 231 */     int m = this.k * 16 + paramInt3;
/* 232 */     this.b[paramInt1 << 11 | paramInt3 << 7 | paramInt2] = b;
/* 233 */     if (j != 0) {
/* 234 */       ln.n[j].b(this.d, k, paramInt2, m);
/*     */     }
/* 236 */     this.e.a(paramInt1, paramInt2, paramInt3, 0);
/*     */ 
/*     */     
/* 239 */     if (ln.q[b] != 0) {
/* 240 */       if (paramInt2 >= i) {
/* 241 */         g(paramInt1, paramInt2 + 1, paramInt3);
/*     */       }
/*     */     }
/* 244 */     else if (paramInt2 == i - 1) {
/* 245 */       g(paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 250 */     this.d.a(bu.a, k, paramInt2, m, k, paramInt2, m);
/* 251 */     this.d.a(bu.b, k, paramInt2, m, k, paramInt2, m);
/*     */     
/* 253 */     c(paramInt1, paramInt3);
/*     */ 
/*     */     
/* 256 */     if (paramInt4 != 0 && 
/* 257 */       !this.d.v) ln.n[paramInt4].e(this.d, k, paramInt2, m);
/*     */ 
/*     */     
/* 260 */     this.o = true;
/* 261 */     return true;
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3) {
/* 265 */     return this.e.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 269 */     this.o = true;
/* 270 */     this.e.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(bu parambu, int paramInt1, int paramInt2, int paramInt3) {
/* 274 */     if (parambu == bu.a) return this.f.a(paramInt1, paramInt2, paramInt3); 
/* 275 */     if (parambu == bu.b) return this.g.a(paramInt1, paramInt2, paramInt3); 
/* 276 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(bu parambu, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 280 */     this.o = true;
/* 281 */     if (parambu == bu.a) { this.f.a(paramInt1, paramInt2, paramInt3, paramInt4); }
/* 282 */     else if (parambu == bu.b) { this.g.a(paramInt1, paramInt2, paramInt3, paramInt4); }
/*     */     else
/*     */     { return; }
/*     */   
/*     */   } public int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 287 */     int i = this.f.a(paramInt1, paramInt2, paramInt3);
/* 288 */     if (i > 0) a = true; 
/* 289 */     i -= paramInt4;
/* 290 */     int j = this.g.a(paramInt1, paramInt2, paramInt3);
/* 291 */     if (j > i) i = j;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 305 */     return i;
/*     */   }
/*     */   
/*     */   public void a(jx paramjx) {
/* 309 */     if (this.q) {
/*     */       return;
/*     */     }
/*     */     
/* 313 */     this.r = true;
/*     */     
/* 315 */     int i = ei.b(paramjx.ah / 16.0D);
/* 316 */     int j = ei.b(paramjx.aj / 16.0D);
/* 317 */     if (i != this.j || j != this.k) {
/* 318 */       System.out.println("Wrong location! " + paramjx);
/*     */     }
/* 320 */     int k = ei.b(paramjx.ai / 16.0D);
/* 321 */     if (k < 0) k = 0; 
/* 322 */     if (k >= this.m.length) k = this.m.length - 1; 
/* 323 */     paramjx.aW = true;
/* 324 */     paramjx.aX = this.j;
/* 325 */     paramjx.aY = k;
/* 326 */     paramjx.aZ = this.k;
/* 327 */     this.m[k].add(paramjx);
/*     */   }
/*     */   
/*     */   public void b(jx paramjx) {
/* 331 */     a(paramjx, paramjx.aY);
/*     */   }
/*     */   
/*     */   public void a(jx paramjx, int paramInt) {
/* 335 */     if (paramInt < 0) paramInt = 0; 
/* 336 */     if (paramInt >= this.m.length) paramInt = this.m.length - 1; 
/* 337 */     this.m[paramInt].remove(paramjx);
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3) {
/* 341 */     return (paramInt2 >= (this.h[paramInt3 << 4 | paramInt1] & 0xFF));
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
/*     */   public ht d(int paramInt1, int paramInt2, int paramInt3) {
/* 356 */     mh mh = new mh(paramInt1, paramInt2, paramInt3);
/*     */     
/* 358 */     ht ht = (ht)this.l.get(mh);
/* 359 */     if (ht == null) {
/* 360 */       int i = a(paramInt1, paramInt2, paramInt3);
/* 361 */       jk jk = (jk)ln.n[i];
/* 362 */       jk.e(this.d, this.j * 16 + paramInt1, paramInt2, this.k * 16 + paramInt3);
/* 363 */       ht = (ht)this.l.get(mh);
/*     */     } 
/* 365 */     return ht;
/*     */   }
/*     */   
/*     */   public void a(ht paramht) {
/* 369 */     int i = paramht.f - this.j * 16;
/* 370 */     int j = paramht.g;
/* 371 */     int k = paramht.h - this.k * 16;
/* 372 */     a(i, j, k, paramht);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, ht paramht) {
/* 376 */     mh mh = new mh(paramInt1, paramInt2, paramInt3);
/*     */     
/* 378 */     paramht.e = this.d;
/* 379 */     paramht.f = this.j * 16 + paramInt1;
/* 380 */     paramht.g = paramInt2;
/* 381 */     paramht.h = this.k * 16 + paramInt3;
/*     */     
/* 383 */     if (a(paramInt1, paramInt2, paramInt3) == 0 || !(ln.n[a(paramInt1, paramInt2, paramInt3)] instanceof jk)) {
/* 384 */       System.out.println("Attempted to place a tile entity where there was no entity tile!");
/*     */       
/*     */       return;
/*     */     } 
/* 388 */     if (this.c) {
/* 389 */       if (this.l.get(mh) != null) {
/* 390 */         this.d.b.remove(this.l.get(mh));
/*     */       }
/* 392 */       this.d.b.add(paramht);
/*     */     } 
/* 394 */     this.l.put(mh, paramht);
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2, int paramInt3) {
/* 398 */     mh mh = new mh(paramInt1, paramInt2, paramInt3);
/*     */     
/* 400 */     if (this.c) {
/* 401 */       this.d.b.remove(this.l.remove(mh));
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 406 */     this.c = true;
/* 407 */     this.d.b.addAll(this.l.values());
/* 408 */     for (byte b = 0; b < this.m.length; b++) {
/* 409 */       this.d.a(this.m[b]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/* 414 */     this.c = false;
/* 415 */     this.d.b.removeAll(this.l.values());
/* 416 */     for (byte b = 0; b < this.m.length; b++) {
/* 417 */       this.d.b(this.m[b]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void f() {
/* 422 */     this.o = true;
/*     */   }
/*     */   
/*     */   public void a(jx paramjx, cb paramcb, List<jx> paramList) {
/* 426 */     int i = ei.b((paramcb.b - 2.0D) / 16.0D);
/* 427 */     int j = ei.b((paramcb.e + 2.0D) / 16.0D);
/* 428 */     if (i < 0) i = 0; 
/* 429 */     if (j >= this.m.length) j = this.m.length - 1; 
/* 430 */     for (int k = i; k <= j; k++) {
/* 431 */       List<jx> list = this.m[k];
/* 432 */       for (byte b = 0; b < list.size(); b++) {
/* 433 */         jx jx1 = list.get(b);
/* 434 */         if (jx1 != paramjx && jx1.ar.a(paramcb)) paramList.add(jx1); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Class paramClass, cb paramcb, List<jx> paramList) {
/* 440 */     int i = ei.b((paramcb.b - 2.0D) / 16.0D);
/* 441 */     int j = ei.b((paramcb.e + 2.0D) / 16.0D);
/* 442 */     if (i < 0) i = 0; 
/* 443 */     if (j >= this.m.length) j = this.m.length - 1; 
/* 444 */     for (int k = i; k <= j; k++) {
/* 445 */       List<jx> list = this.m[k];
/* 446 */       for (byte b = 0; b < list.size(); b++) {
/* 447 */         jx jx = list.get(b);
/* 448 */         if (paramClass.isAssignableFrom(jx.getClass()) && jx.ar.a(paramcb)) paramList.add(jx);
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(boolean paramBoolean) {
/* 462 */     if (this.p) return false; 
/* 463 */     if (this.r && this.d.c != this.s) return true; 
/* 464 */     return this.o;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
/*     */     int i;
/* 529 */     for (i = paramInt1; i < paramInt4; i++) {
/* 530 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 531 */         int k = i << 11 | j << 7 | paramInt2;
/* 532 */         int m = paramInt5 - paramInt2;
/* 533 */         System.arraycopy(paramArrayOfbyte, paramInt7, this.b, k, m);
/* 534 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 537 */     b();
/*     */     
/* 539 */     for (i = paramInt1; i < paramInt4; i++) {
/* 540 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 541 */         int k = (i << 11 | j << 7 | paramInt2) >> 1;
/* 542 */         int m = (paramInt5 - paramInt2) / 2;
/* 543 */         System.arraycopy(paramArrayOfbyte, paramInt7, this.e.a, k, m);
/* 544 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 547 */     for (i = paramInt1; i < paramInt4; i++) {
/* 548 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 549 */         int k = (i << 11 | j << 7 | paramInt2) >> 1;
/* 550 */         int m = (paramInt5 - paramInt2) / 2;
/* 551 */         System.arraycopy(paramArrayOfbyte, paramInt7, this.g.a, k, m);
/* 552 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/* 555 */     for (i = paramInt1; i < paramInt4; i++) {
/* 556 */       for (int j = paramInt3; j < paramInt6; j++) {
/* 557 */         int k = (i << 11 | j << 7 | paramInt2) >> 1;
/* 558 */         int m = (paramInt5 - paramInt2) / 2;
/* 559 */         System.arraycopy(paramArrayOfbyte, paramInt7, this.f.a, k, m);
/* 560 */         paramInt7 += m;
/*     */       } 
/*     */     } 
/*     */     
/* 564 */     return paramInt7;
/*     */   }
/*     */   
/*     */   public Random a(long paramLong) {
/* 568 */     return new Random(this.d.r + (this.j * this.j * 4987142) + (this.j * 5947611) + (this.k * this.k) * 4392871L + (this.k * 389711) ^ paramLong);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */