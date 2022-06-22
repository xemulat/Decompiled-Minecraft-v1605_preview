/*     */ import java.nio.FloatBuffer;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.Display;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ import org.lwjgl.util.glu.GLU;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ig
/*     */ {
/*     */   private Minecraft h;
/*     */   private float i;
/*     */   public iy a;
/*     */   private int j;
/*     */   private jx jx2;
/*     */   private long l;
/*     */   private Random m;
/*     */   volatile int b;
/*     */   volatile int c;
/*     */   FloatBuffer d;
/*     */   float e;
/*     */   float f;
/*     */   float g;
/*     */   private float n;
/*     */   private float o;
/*     */   
/*     */   public ig(Minecraft paramMinecraft) {
/*  34 */     this.i = 0.0F;
/*  35 */     this.jx2 = null;
/*  36 */     this.l = System.currentTimeMillis();
/*  37 */     this.m = new Random();
/*  38 */     this.b = 0;
/*  39 */     this.c = 0;
/*  40 */     this.d = da.d(16);
/*  41 */     this.h = paramMinecraft;
/*  42 */     this.a = new iy(paramMinecraft);
/*     */   }
/*     */   
/*     */   public void a() {
/*  46 */     this.n = this.o;
/*  47 */     float f1 = this.h.e.c(ei.b(this.h.g.ah), ei.b(this.h.g.ai), ei.b(this.h.g.aj));
/*  48 */     float f2 = (3 - this.h.y.e) / 3.0F;
/*  49 */     this.o += (f1 * (1.0F - f2) + f2 - this.o) * 0.1F;
/*  50 */     this.j++;
/*  51 */     this.a.a();
/*  52 */     if (this.h.J)
/*  53 */       c(); 
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/*     */     double d3;
/*  58 */     if (this.h.g == null) {
/*     */       return;
/*     */     }
/*  61 */     double d1 = this.h.b.c();
/*  62 */     this.h.x = this.h.g.a(d1, paramFloat);
/*  63 */     double d2 = d1;
/*  64 */     ah ah1 = this.h.g.e(paramFloat);
/*  65 */     if (this.h.x != null) {
/*  66 */       d2 = this.h.x.f.c(ah1);
/*     */     }
/*     */     
/*  69 */     if (this.h.b instanceof ib) {
/*  70 */       d3 = 32.0D;
/*     */     } else {
/*     */       
/*  73 */       if (d2 > 3.0D) {
/*  74 */         d2 = 3.0D;
/*     */       }
/*  76 */       d3 = d2;
/*     */     } 
/*  78 */     ah ah2 = this.h.g.f(paramFloat);
/*  79 */     ah ah3 = ah1.c(ah2.a * d3, ah2.b * d3, ah2.c * d3);
/*  80 */     this.jx2 = null;
/*  81 */     List<jx> list = this.h.e.b(this.h.g, this.h.g.ar.a(ah2.a * d3, ah2.b * d3, ah2.c * d3));
/*  82 */     double d4 = 0.0D;
/*  83 */     for (byte b = 0; b < list.size(); b++) {
/*  84 */       jx jx1 = list.get(b);
/*  85 */       if (jx1.c_()) {
/*     */         
/*  87 */         lv lv = jx1.ar.b(0.10000000149011612D, 0.10000000149011612D, 0.10000000149011612D).a(ah1, ah3);
/*  88 */         if (lv != null) {
/*  89 */           double d = ah1.c(lv.f);
/*  90 */           if (d < d4 || d4 == 0.0D) {
/*  91 */             this.jx2 = jx1;
/*  92 */             d4 = d;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  97 */     if (this.jx2 != null && !(this.h.b instanceof ib)) {
/*  98 */       this.h.x = new lv(this.jx2);
/*     */     }
/*     */   }
/*     */   
/*     */   private float d(float paramFloat) {
/* 103 */     be be = this.h.g;
/* 104 */     float f = 70.0F;
/* 105 */     if (be.a(fs.f)) {
/* 106 */       f = 60.0F;
/*     */     }
/* 108 */     if (be.D <= 0) {
/* 109 */       f /= (1.0F - 500.0F / (be.I + paramFloat + 500.0F)) * 2.0F + 1.0F;
/*     */     }
/* 111 */     return f;
/*     */   }
/*     */   
/*     */   private void e(float paramFloat) {
/* 115 */     be be = this.h.g;
/* 116 */     float f1 = be.F - paramFloat;
/* 117 */     if (be.D <= 0) {
/* 118 */       GL11.glRotatef(40.0F - 8000.0F / (be.I + paramFloat + 200.0F), 0.0F, 0.0F, 1.0F);
/*     */     }
/* 120 */     if (f1 < 0.0F) {
/*     */       return;
/*     */     }
/* 123 */     float f2 = f1 / be.G;
/* 124 */     float f3 = ei.a(f2 * f2 * f2 * f2 * 3.1415927F);
/* 125 */     float f4 = be.H;
/* 126 */     GL11.glRotatef(-f4, 0.0F, 1.0F, 0.0F);
/* 127 */     GL11.glRotatef(-f3 * 14.0F, 0.0F, 0.0F, 1.0F);
/* 128 */     GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private void f(float paramFloat) {
/* 132 */     if (this.h.y.w) {
/*     */       return;
/*     */     }
/* 135 */     be be = this.h.g;
/* 136 */     float f1 = be.aC + (be.aC - be.aB) * paramFloat;
/* 137 */     float f2 = be.e + (be.f - be.e) * paramFloat;
/* 138 */     float f3 = be.K + (be.L - be.K) * paramFloat;
/* 139 */     GL11.glTranslatef(ei.a(f1 * 3.1415927F) * f2 * 0.5F, -Math.abs(ei.b(f1 * 3.1415927F) * f2), 0.0F);
/* 140 */     GL11.glRotatef(ei.a(f1 * 3.1415927F) * f2 * 3.0F, 0.0F, 0.0F, 1.0F);
/* 141 */     GL11.glRotatef(Math.abs(ei.b(f1 * 3.1415927F + 0.2F) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
/* 142 */     GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private void g(float paramFloat) {
/* 146 */     be be = this.h.g;
/* 147 */     double d1 = be.ae + (be.ah - be.ae) * paramFloat;
/* 148 */     double d2 = be.af + (be.ai - be.af) * paramFloat;
/* 149 */     double d3 = be.ag + (be.aj - be.ag) * paramFloat;
/* 150 */     if (this.h.y.w) {
/* 151 */       double d4 = 4.0D;
/* 152 */       float f1 = be.o + (be.n - be.o) * paramFloat;
/* 153 */       float f2 = be.an - 10.0F;
/* 154 */       float f3 = be.ao + 2.0F;
/* 155 */       double d5 = (-ei.a(f2 / 180.0F * 3.1415927F) * ei.b(f3 / 180.0F * 3.1415927F)) * d4;
/* 156 */       double d6 = (ei.b(f2 / 180.0F * 3.1415927F) * ei.b(f3 / 180.0F * 3.1415927F)) * d4;
/* 157 */       double d7 = -ei.a(f3 / 180.0F * 3.1415927F) * d4;
/* 158 */       for (byte b = 0; b < 8; b++) {
/* 159 */         float f4 = ((b & 0x1) * 2 - 1);
/* 160 */         float f5 = ((b >> 1 & 0x1) * 2 - 1);
/* 161 */         float f6 = ((b >> 2 & 0x1) * 2 - 1);
/* 162 */         float f7 = f4 * 0.1F;
/* 163 */         float f8 = f5 * 0.1F;
/* 164 */         float f9 = f6 * 0.1F;
/* 165 */         lv lv = this.h.e.a(ah.b(d1 + f7, d2 + f8, d3 + f9), ah.b(d1 - d5 + f7 + f9, d2 - d7 + f8, d3 - d6 + f9));
/* 166 */         if (lv != null) {
/* 167 */           double d = lv.f.c(ah.b(d1, d2, d3));
/* 168 */           if (d < d4) {
/* 169 */             d4 = d;
/*     */           }
/*     */         } 
/*     */       } 
/* 173 */       GL11.glRotatef(be.ao - f3, 1.0F, 0.0F, 0.0F);
/* 174 */       GL11.glRotatef(be.an - f2, 0.0F, 1.0F, 0.0F);
/* 175 */       GL11.glTranslatef(0.0F, 0.0F, (float)-d4);
/* 176 */       GL11.glRotatef(f2 - be.an, 0.0F, 1.0F, 0.0F);
/* 177 */       GL11.glRotatef(f3 - be.ao, 1.0F, 0.0F, 0.0F);
/*     */     } else {
/*     */       
/* 180 */       GL11.glTranslatef(0.0F, 0.0F, -0.1F);
/*     */     } 
/* 182 */     GL11.glRotatef(be.aq + (be.ao - be.aq) * paramFloat, 1.0F, 0.0F, 0.0F);
/* 183 */     GL11.glRotatef(be.ap + (be.an - be.ap) * paramFloat + 180.0F, 0.0F, 1.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat, int paramInt) {
/* 187 */     this.i = (256 >> this.h.y.e);
/* 188 */     GL11.glMatrixMode(5889);
/* 189 */     GL11.glLoadIdentity();
/*     */     
/* 191 */     if (this.h.y.g) {
/* 192 */       GL11.glTranslatef(-(paramInt * 2 - 1) * 0.07F, 0.0F, 0.0F);
/*     */     }
/* 194 */     GLU.gluPerspective(d(paramFloat), this.h.c / this.h.d, 0.05F, this.i);
/* 195 */     GL11.glMatrixMode(5888);
/* 196 */     GL11.glLoadIdentity();
/* 197 */     if (this.h.y.g) {
/* 198 */       GL11.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*     */     }
/* 200 */     e(paramFloat);
/* 201 */     if (this.h.y.f) {
/* 202 */       f(paramFloat);
/*     */     }
/* 204 */     g(paramFloat);
/*     */   }
/*     */   
/*     */   private void b(float paramFloat, int paramInt) {
/* 208 */     GL11.glLoadIdentity();
/* 209 */     if (this.h.y.g) {
/* 210 */       GL11.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*     */     }
/* 212 */     GL11.glPushMatrix();
/* 213 */     e(paramFloat);
/* 214 */     if (this.h.y.f) {
/* 215 */       f(paramFloat);
/*     */     }
/* 217 */     if (!this.h.y.w) {
/* 218 */       this.a.a(paramFloat);
/*     */     }
/* 220 */     GL11.glPopMatrix();
/* 221 */     if (!this.h.y.w) {
/* 222 */       this.a.b(paramFloat);
/* 223 */       e(paramFloat);
/*     */     } 
/* 225 */     if (this.h.y.f) {
/* 226 */       f(paramFloat);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 231 */     if (!Display.isActive()) {
/* 232 */       if (System.currentTimeMillis() - this.l > 500L) {
/* 233 */         this.h.g();
/*     */       }
/*     */     } else {
/*     */       
/* 237 */       this.l = System.currentTimeMillis();
/*     */     } 
/* 239 */     if (this.h.I) {
/* 240 */       this.h.B.c();
/* 241 */       int n = this.h.B.a;
/* 242 */       int i1 = this.h.B.b;
/* 243 */       byte b = 1;
/* 244 */       if (this.h.y.c) {
/* 245 */         b = -1;
/*     */       }
/* 247 */       this.h.g.d(n, (i1 * b));
/*     */     } 
/* 249 */     if (this.h.v) {
/*     */       return;
/*     */     }
/* 252 */     ip ip = new ip(this.h.c, this.h.d);
/* 253 */     int i = ip.a();
/* 254 */     int j = ip.b();
/* 255 */     int k = Mouse.getX() * i / this.h.c;
/* 256 */     int m = j - Mouse.getY() * j / this.h.d - 1;
/* 257 */     if (this.h.e != null) {
/* 258 */       c(paramFloat);
/* 259 */       this.h.u.a(paramFloat, (this.h.p != null), k, m);
/*     */     } else {
/*     */       
/* 262 */       GL11.glViewport(0, 0, this.h.c, this.h.d);
/* 263 */       GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
/* 264 */       GL11.glClear(16640);
/* 265 */       GL11.glMatrixMode(5889);
/* 266 */       GL11.glLoadIdentity();
/* 267 */       GL11.glMatrixMode(5888);
/* 268 */       GL11.glLoadIdentity();
/* 269 */       b();
/*     */     } 
/* 271 */     if (this.h.p != null) {
/* 272 */       GL11.glClear(256);
/* 273 */       this.h.p.a(k, m, paramFloat);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c(float paramFloat) {
/* 278 */     a(paramFloat);
/* 279 */     be be = this.h.g;
/* 280 */     e e = this.h.f;
/* 281 */     bm bm = this.h.h;
/* 282 */     double d1 = be.aF + (be.ah - be.aF) * paramFloat;
/* 283 */     double d2 = be.aG + (be.ai - be.aG) * paramFloat;
/* 284 */     double d3 = be.aH + (be.aj - be.aH) * paramFloat;
/* 285 */     for (byte b = 0; b < 2; b++) {
/* 286 */       if (this.h.y.g) {
/* 287 */         if (b == 0) {
/* 288 */           GL11.glColorMask(false, true, true, false);
/*     */         } else {
/*     */           
/* 291 */           GL11.glColorMask(true, false, false, false);
/*     */         } 
/*     */       }
/* 294 */       GL11.glViewport(0, 0, this.h.c, this.h.d);
/* 295 */       j(paramFloat);
/* 296 */       GL11.glClear(16640);
/* 297 */       GL11.glEnable(2884);
/* 298 */       a(paramFloat, b);
/* 299 */       k.a();
/* 300 */       if (this.h.y.e < 2) {
/* 301 */         a(-1);
/* 302 */         e.a(paramFloat);
/*     */       } 
/* 304 */       GL11.glEnable(2912);
/* 305 */       a(1);
/* 306 */       ka ka = new ka();
/* 307 */       ka.a(d1, d2, d3);
/* 308 */       this.h.f.a(ka, paramFloat);
/* 309 */       this.h.f.a(be, false);
/* 310 */       a(0);
/* 311 */       GL11.glEnable(2912);
/* 312 */       GL11.glBindTexture(3553, this.h.n.a("/terrain.png"));
/* 313 */       GLStatics.a();
/* 314 */       e.a(be, 0, paramFloat);
/* 315 */       GLStatics.b();
/* 316 */       e.a(be.e(paramFloat), ka, paramFloat);
/* 317 */       bm.b(be, paramFloat);
/* 318 */       GLStatics.a();
/* 319 */       a(0);
/* 320 */       bm.a(be, paramFloat);
/* 321 */       if (this.h.x != null && be.a(fs.f)) {
/* 322 */         GL11.glDisable(3008);
/* 323 */         e.a(be, this.h.x, 0, be.b.e(), paramFloat);
/* 324 */         e.b(be, this.h.x, 0, be.b.e(), paramFloat);
/* 325 */         GL11.glEnable(3008);
/*     */       } 
/* 327 */       GL11.glBlendFunc(770, 771);
/* 328 */       a(0);
/* 329 */       GL11.glEnable(3042);
/* 330 */       GL11.glDisable(2884);
/* 331 */       GL11.glBindTexture(3553, this.h.n.a("/terrain.png"));
/* 332 */       if (this.h.y.i) {
/* 333 */         GL11.glColorMask(false, false, false, false);
/* 334 */         int i = e.a(be, 1, paramFloat);
/* 335 */         GL11.glColorMask(true, true, true, true);
/* 336 */         if (this.h.y.g) {
/* 337 */           if (b == 0) {
/* 338 */             GL11.glColorMask(false, true, true, false);
/*     */           } else {
/*     */             
/* 341 */             GL11.glColorMask(true, false, false, false);
/*     */           } 
/*     */         }
/* 344 */         if (i > 0) {
/* 345 */           e.a(1, paramFloat);
/*     */         }
/*     */       } else {
/*     */         
/* 349 */         e.a(be, 1, paramFloat);
/*     */       } 
/* 351 */       GL11.glDepthMask(true);
/* 352 */       GL11.glEnable(2884);
/* 353 */       GL11.glDisable(3042);
/* 354 */       if (this.h.x != null && !be.a(fs.f)) {
/* 355 */         GL11.glDisable(3008);
/* 356 */         e.a(be, this.h.x, 0, be.b.e(), paramFloat);
/* 357 */         e.b(be, this.h.x, 0, be.b.e(), paramFloat);
/* 358 */         GL11.glEnable(3008);
/*     */       } 
/* 360 */       GL11.glDisable(2912);
/* 361 */       if (this.h.e.d) {
/* 362 */         h(paramFloat);
/*     */       }
/* 364 */       if (this.h.J) {
/* 365 */         i(paramFloat);
/*     */       }
/* 367 */       if (this.jx2 != null);
/* 368 */       a(0);
/* 369 */       GL11.glEnable(2912);
/* 370 */       e.b(paramFloat);
/* 371 */       GL11.glDisable(2912);
/* 372 */       a(1);
/* 373 */       GL11.glClear(256);
/* 374 */       b(paramFloat, b);
/* 375 */       if (!this.h.y.g) {
/*     */         return;
/*     */       }
/*     */     } 
/* 379 */     GL11.glColorMask(true, true, true, false);
/*     */   }
/*     */   
/*     */   private void c() {
/* 383 */     if (!this.h.y.i) {
/*     */       return;
/*     */     }
/* 386 */     be be = this.h.g;
/* 387 */     cj cj = this.h.e;
/* 388 */     int i = ei.b(be.ah);
/* 389 */     int j = ei.b(be.ai);
/* 390 */     int k = ei.b(be.aj);
/*     */     
/* 392 */     for (byte b = 0; b < ''; b++) {
/* 393 */       int m = i + this.m.nextInt(16) - this.m.nextInt(16);
/* 394 */       int n = k + this.m.nextInt(16) - this.m.nextInt(16);
/* 395 */       int i1 = cj.e(m, n);
/* 396 */       int i2 = cj.a(m, i1 - 1, n);
/* 397 */       if (i1 <= j + 16 && i1 >= j - 16) {
/* 398 */         float f1 = this.m.nextFloat();
/* 399 */         float f2 = this.m.nextFloat();
/* 400 */         if (i2 > 0) {
/* 401 */           this.h.h.a(new ms(cj, (m + f1), (i1 + 0.1F) - (ln.n[i2]).be, (n + f2)));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h(float paramFloat) {
/* 408 */     be be = this.h.g;
/* 409 */     cj cj = this.h.e;
/* 410 */     int i = ei.b(be.ah);
/* 411 */     int j = ei.b(be.ai);
/* 412 */     int k = ei.b(be.aj);
/* 413 */     he he = he.a;
/* 414 */     GL11.glDisable(2884);
/* 415 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 416 */     GL11.glEnable(3042);
/* 417 */     GL11.glBlendFunc(770, 771);
/* 418 */     GL11.glBindTexture(3553, this.h.n.a("/snow.png"));
/* 419 */     double d1 = be.aF + (be.ah - be.aF) * paramFloat;
/* 420 */     double d2 = be.aG + (be.ai - be.aG) * paramFloat;
/* 421 */     double d3 = be.aH + (be.aj - be.aH) * paramFloat;
/* 422 */     byte b = 5;
/* 423 */     if (this.h.y.i) {
/* 424 */       b = 10;
/*     */     }
/* 426 */     for (int m = i - b; m <= i + b; m++) {
/* 427 */       for (int n = k - b; n <= k + b; n++) {
/* 428 */         int i1 = cj.d(m, n);
/* 429 */         if (i1 < 0) {
/* 430 */           i1 = 0;
/*     */         }
/* 432 */         int i2 = j - b;
/* 433 */         int i3 = j + b;
/* 434 */         if (i2 < i1) {
/* 435 */           i2 = i1;
/*     */         }
/* 437 */         if (i3 < i1) {
/* 438 */           i3 = i1;
/*     */         }
/*     */         
/* 441 */         if (i2 != i3) {
/* 442 */           this.m.setSeed((m * m * 3121 + m * 45238971 + n * n * 418711 + n * 13761));
/* 443 */           float f1 = this.j + paramFloat;
/* 444 */           float f2 = ((this.j & 0x1FF) + paramFloat) / 512.0F;
/* 445 */           float f3 = this.m.nextFloat() + f1 * 0.01F * (float)this.m.nextGaussian();
/* 446 */           float f4 = this.m.nextFloat() + f1 * (float)this.m.nextGaussian() * 0.001F;
/* 447 */           double d4 = (m + 0.5F) - be.ah;
/* 448 */           double d5 = (n + 0.5F) - be.aj;
/* 449 */           float f5 = ei.a(d4 * d4 + d5 * d5) / b;
/* 450 */           he.b();
/* 451 */           float f6 = cj.c(m, 128, n);
/* 452 */           GL11.glColor4f(f6, f6, f6, (1.0F - f5 * f5) * 0.7F);
/* 453 */           he.b(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D);
/* 454 */           he.a((m + 0), i2, (n + 0), (0.0F + f3), (i2 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 455 */           he.a((m + 1), i2, (n + 1), (2.0F + f3), (i2 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 456 */           he.a((m + 1), i3, (n + 1), (2.0F + f3), (i3 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 457 */           he.a((m + 0), i3, (n + 0), (0.0F + f3), (i3 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 458 */           he.a((m + 0), i2, (n + 1), (0.0F + f3), (i2 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 459 */           he.a((m + 1), i2, (n + 0), (2.0F + f3), (i2 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 460 */           he.a((m + 1), i3, (n + 0), (2.0F + f3), (i3 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 461 */           he.a((m + 0), i3, (n + 1), (0.0F + f3), (i3 * 2.0F / 8.0F + f2 * 2.0F + f4));
/* 462 */           he.b(0.0D, 0.0D, 0.0D);
/* 463 */           he.a();
/*     */         } 
/*     */       } 
/*     */     } 
/* 467 */     GL11.glEnable(2884);
/* 468 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   private void i(float paramFloat) {
/* 472 */     be be = this.h.g;
/* 473 */     cj cj = this.h.e;
/* 474 */     int i = ei.b(be.ah);
/* 475 */     int j = ei.b(be.ai);
/* 476 */     int k = ei.b(be.aj);
/* 477 */     he he = he.a;
/* 478 */     GL11.glDisable(2884);
/* 479 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 480 */     GL11.glEnable(3042);
/* 481 */     GL11.glBlendFunc(770, 771);
/* 482 */     GL11.glBindTexture(3553, this.h.n.a("/rain.png"));
/* 483 */     double d1 = be.aF + (be.ah - be.aF) * paramFloat;
/* 484 */     double d2 = be.aG + (be.ai - be.aG) * paramFloat;
/* 485 */     double d3 = be.aH + (be.aj - be.aH) * paramFloat;
/* 486 */     byte b = 5;
/* 487 */     if (this.h.y.i) {
/* 488 */       b = 10;
/*     */     }
/* 490 */     for (int m = i - b; m <= i + b; m++) {
/* 491 */       for (int n = k - b; n <= k + b; n++) {
/* 492 */         int i1 = cj.e(m, n);
/* 493 */         int i2 = j - b;
/* 494 */         int i3 = j + b;
/* 495 */         if (i2 < i1) {
/* 496 */           i2 = i1;
/*     */         }
/* 498 */         if (i3 < i1) {
/* 499 */           i3 = i1;
/*     */         }
/*     */         
/* 502 */         if (i2 != i3) {
/* 503 */           float f1 = ((this.j + m * m * 3121 + m * 45238971 + n * n * 418711 + n * 13761 & 0x1F) + paramFloat) / 32.0F;
/* 504 */           double d4 = (m + 0.5F) - be.ah;
/* 505 */           double d5 = (n + 0.5F) - be.aj;
/* 506 */           float f2 = ei.a(d4 * d4 + d5 * d5) / b;
/* 507 */           he.b();
/* 508 */           float f3 = cj.c(m, 128, n);
/* 509 */           GL11.glColor4f(f3, f3, f3, (1.0F - f2 * f2) * 0.7F);
/* 510 */           he.b(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D);
/* 511 */           he.a((m + 0), i2, (n + 0), 0.0D, (i2 * 2.0F / 8.0F + f1 * 2.0F));
/* 512 */           he.a((m + 1), i2, (n + 1), 2.0D, (i2 * 2.0F / 8.0F + f1 * 2.0F));
/* 513 */           he.a((m + 1), i3, (n + 1), 2.0D, (i3 * 2.0F / 8.0F + f1 * 2.0F));
/* 514 */           he.a((m + 0), i3, (n + 0), 0.0D, (i3 * 2.0F / 8.0F + f1 * 2.0F));
/* 515 */           he.a((m + 0), i2, (n + 1), 0.0D, (i2 * 2.0F / 8.0F + f1 * 2.0F));
/* 516 */           he.a((m + 1), i2, (n + 0), 2.0D, (i2 * 2.0F / 8.0F + f1 * 2.0F));
/* 517 */           he.a((m + 1), i3, (n + 0), 2.0D, (i3 * 2.0F / 8.0F + f1 * 2.0F));
/* 518 */           he.a((m + 0), i3, (n + 1), 0.0D, (i3 * 2.0F / 8.0F + f1 * 2.0F));
/* 519 */           he.b(0.0D, 0.0D, 0.0D);
/* 520 */           he.a();
/*     */         } 
/*     */       } 
/*     */     } 
/* 524 */     GL11.glEnable(2884);
/* 525 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   public void b() {
/* 529 */     ip ip = new ip(this.h.c, this.h.d);
/* 530 */     int i = ip.a();
/* 531 */     int j = ip.b();
/* 532 */     GL11.glClear(256);
/* 533 */     GL11.glMatrixMode(5889);
/* 534 */     GL11.glLoadIdentity();
/* 535 */     GL11.glOrtho(0.0D, i, j, 0.0D, 1000.0D, 3000.0D);
/* 536 */     GL11.glMatrixMode(5888);
/* 537 */     GL11.glLoadIdentity();
/* 538 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*     */   }
/*     */   
/*     */   private void j(float paramFloat) {
/* 542 */     cj cj = this.h.e;
/* 543 */     be be = this.h.g;
/* 544 */     float f1 = 1.0F - (float)Math.pow((1.0F / (4 - this.h.y.e)), 0.25D);
/* 545 */     ah ah1 = cj.b(paramFloat);
/* 546 */     float f2 = (float)ah1.a;
/* 547 */     float f3 = (float)ah1.b;
/* 548 */     float f4 = (float)ah1.c;
/* 549 */     ah ah2 = cj.e(paramFloat);
/* 550 */     this.e = (float)ah2.a;
/* 551 */     this.f = (float)ah2.b;
/* 552 */     this.g = (float)ah2.c;
/* 553 */     this.e += (f2 - this.e) * f1;
/* 554 */     this.f += (f3 - this.f) * f1;
/* 555 */     this.g += (f4 - this.g) * f1;
/* 556 */     if (be.a(fs.f)) {
/* 557 */       this.e = 0.02F;
/* 558 */       this.f = 0.02F;
/* 559 */       this.g = 0.2F;
/*     */     }
/* 561 */     else if (be.a(fs.g)) {
/* 562 */       this.e = 0.6F;
/* 563 */       this.f = 0.1F;
/* 564 */       this.g = 0.0F;
/*     */     } 
/* 566 */     float f5 = this.n + (this.o - this.n) * paramFloat;
/* 567 */     this.e *= f5;
/* 568 */     this.f *= f5;
/* 569 */     this.g *= f5;
/* 570 */     if (this.h.y.g) {
/* 571 */       float f6 = (this.e * 30.0F + this.f * 59.0F + this.g * 11.0F) / 100.0F;
/* 572 */       float f7 = (this.e * 30.0F + this.f * 70.0F) / 100.0F;
/* 573 */       float f8 = (this.e * 30.0F + this.g * 70.0F) / 100.0F;
/* 574 */       this.e = f6;
/* 575 */       this.f = f7;
/* 576 */       this.g = f8;
/*     */     } 
/* 578 */     float[] arrayOfFloat = ColorUtil.BlendColor(0.5F, this.e, this.f, this.g);
/* 579 */     this.e = arrayOfFloat[0];
/* 580 */     this.f = arrayOfFloat[1];
/* 581 */     this.g = arrayOfFloat[2];
/* 582 */     GL11.glClearColor(this.e, this.f, this.g, 0.0F);
/*     */   }
/*     */   
/*     */   private void a(int paramInt) {
/* 586 */     be be = this.h.g;
/* 587 */     GL11.glFog(2918, a(this.e, this.f, this.g, 1.0F));
/* 588 */     GL11.glNormal3f(0.0F, -1.0F, 0.0F);
/* 589 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 590 */     if (be.a(fs.f)) {
/* 591 */       GL11.glFogi(2917, 2048);
/* 592 */       GL11.glFogf(2914, 0.1F);
/* 593 */       if (this.h.y.g);
/*     */     }
/* 595 */     else if (be.a(fs.g)) {
/* 596 */       GL11.glFogi(2917, 2048);
/* 597 */       GL11.glFogf(2914, 2.0F);
/* 598 */       if (this.h.y.g);
/*     */     } else {
/*     */       
/* 601 */       GL11.glFogi(2917, 9729);
/* 602 */       GL11.glFogf(2915, this.i * 0.25F);
/* 603 */       GL11.glFogf(2916, this.i);
/* 604 */       if (paramInt < 0) {
/* 605 */         GL11.glFogf(2915, 0.0F);
/* 606 */         GL11.glFogf(2916, this.i * 0.8F);
/*     */       } 
/* 608 */       if ((GLContext.getCapabilities()).GL_NV_fog_distance) {
/* 609 */         GL11.glFogi(34138, 34139);
/*     */       }
/*     */     } 
/* 612 */     GL11.glEnable(2903);
/* 613 */     GL11.glColorMaterial(1028, 4608);
/*     */   }
/*     */   
/*     */   private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 617 */     this.d.clear();
/* 618 */     this.d.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 619 */     this.d.flip();
/* 620 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */