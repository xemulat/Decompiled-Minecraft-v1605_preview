/*      */ import java.nio.IntBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import net.minecraft.client.Minecraft;
/*      */ import org.lwjgl.opengl.ARBOcclusionQuery;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class e
/*      */   implements ic
/*      */ {
/*      */   public List a;
/*      */   private cj k;
/*      */   private er l;
/*      */   private List m;
/*      */   private bj[] n;
/*      */   private bj[] o;
/*      */   private int p;
/*      */   private int q;
/*      */   private int r;
/*      */   private int s;
/*      */   private Minecraft t;
/*      */   private ay u;
/*      */   private IntBuffer v;
/*      */   private boolean w;
/*      */   private int x;
/*      */   private int y;
/*      */   private int z;
/*      */   private int A;
/*      */   private int B;
/*      */   private int C;
/*      */   private int D;
/*      */   private int E;
/*      */   private int F;
/*      */   private int G;
/*      */   private int H;
/*      */   private int I;
/*      */   private int J;
/*      */   private int K;
/*      */   private int L;
/*      */   int[] b;
/*      */   IntBuffer c;
/*      */   private int M;
/*      */   private int N;
/*      */   private int O;
/*      */   private int P;
/*      */   private int Q;
/*      */   private List R;
/*      */   private kl[] S;
/*      */   int d;
/*      */   int e;
/*      */   double f;
/*      */   double g;
/*      */   double h;
/*      */   public float i;
/*      */   int j;
/*      */   
/*      */   public e(Minecraft paramMinecraft, er paramer) {
/*   65 */     this.a = new ArrayList();
/*   66 */     this.m = new ArrayList();
/*   67 */     this.w = false;
/*   68 */     this.x = 0;
/*   69 */     this.H = -1;
/*   70 */     this.I = 2;
/*   71 */     this.b = new int[50000];
/*   72 */     this.c = da.c(64);
/*   73 */     this.R = new ArrayList();
/*   74 */     this.S = new kl[] { new kl(), new kl(), new kl(), new kl() };
/*   75 */     this.d = 0;
/*   76 */     this.e = da.a(1);
/*   77 */     this.f = -9999.0D;
/*   78 */     this.g = -9999.0D;
/*   79 */     this.h = -9999.0D;
/*   80 */     this.j = 0;
/*   81 */     this.t = paramMinecraft;
/*   82 */     this.l = paramer;
/*      */     
/*   84 */     this.s = da.a(786432);
/*   85 */     this.w = paramMinecraft.k().a();
/*   86 */     if (this.w) {
/*   87 */       this.c.clear();
/*   88 */       (this.v = da.c(262144)).clear();
/*   89 */       this.v.position(0);
/*   90 */       this.v.limit(262144);
/*   91 */       ARBOcclusionQuery.glGenQueriesARB(this.v);
/*      */     } 
/*   93 */     this.y = da.a(3);
/*   94 */     GL11.glPushMatrix();
/*   95 */     GL11.glNewList(this.y, 4864);
/*   96 */     f();
/*   97 */     GL11.glEndList();
/*   98 */     GL11.glPopMatrix();
/*   99 */     he he = he.a;
/*  100 */     GL11.glNewList(this.z = this.y + 1, 4864);
/*      */ 
/*      */ 
/*      */     
/*  104 */     for (short s1 = -384; s1 <= 384; s1 += 64) {
/*  105 */       for (short s = -384; s <= 384; s += 64) {
/*  106 */         he.b();
/*  107 */         he.a((s1 + 0), 16.0D, (s + 0));
/*  108 */         he.a((s1 + 64), 16.0D, (s + 0));
/*  109 */         he.a((s1 + 64), 16.0D, (s + 64));
/*  110 */         he.a((s1 + 0), 16.0D, (s + 64));
/*  111 */         he.a();
/*      */       } 
/*      */     } 
/*  114 */     GL11.glEndList();
/*  115 */     GL11.glNewList(this.A = this.y + 2, 4864);
/*      */     
/*  117 */     he.b();
/*  118 */     for (short s2 = -384; s2 <= 384; s2 += 64) {
/*  119 */       for (short s = -384; s <= 384; s += 64) {
/*  120 */         he.a((s2 + 64), -16.0D, (s + 0));
/*  121 */         he.a((s2 + 0), -16.0D, (s + 0));
/*  122 */         he.a((s2 + 0), -16.0D, (s + 64));
/*  123 */         he.a((s2 + 64), -16.0D, (s + 64));
/*      */       } 
/*      */     } 
/*  126 */     he.a();
/*  127 */     GL11.glEndList();
/*      */   }
/*      */   
/*      */   private void f() {
/*  131 */     Random random = new Random(10842L);
/*  132 */     he he = he.a;
/*  133 */     he.b();
/*  134 */     for (byte b = 0; b < 'ל'; b++) {
/*  135 */       double d1 = (random.nextFloat() * 2.0F - 1.0F);
/*  136 */       double d2 = (random.nextFloat() * 2.0F - 1.0F);
/*  137 */       double d3 = (random.nextFloat() * 2.0F - 1.0F);
/*  138 */       double d4 = (0.25F + random.nextFloat() * 0.25F);
/*  139 */       double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*  140 */       if (d5 < 1.0D && d5 > 0.01D) {
/*  141 */         double d6 = 1.0D / Math.sqrt(d5);
/*  142 */         double d7 = d1 * d6;
/*  143 */         double d8 = d2 * d6;
/*  144 */         double d9 = d3 * d6;
/*  145 */         double d10 = d7 * 100.0D;
/*  146 */         double d11 = d8 * 100.0D;
/*  147 */         double d12 = d9 * 100.0D;
/*  148 */         double d13 = Math.atan2(d7, d9);
/*  149 */         double d14 = Math.sin(d13);
/*  150 */         double d15 = Math.cos(d13);
/*  151 */         double d16 = Math.atan2(Math.sqrt(d7 * d7 + d9 * d9), d8);
/*  152 */         double d17 = Math.sin(d16);
/*  153 */         double d18 = Math.cos(d16);
/*  154 */         double d19 = random.nextDouble() * Math.PI * 2.0D;
/*  155 */         double d20 = Math.sin(d19);
/*  156 */         double d21 = Math.cos(d19);
/*  157 */         for (byte b1 = 0; b1 < 4; b1++) {
/*      */           
/*  159 */           double d22 = ((b1 & 0x2) - 1) * d4;
/*  160 */           double d23 = ((b1 + 1 & 0x2) - 1) * d4;
/*      */           
/*  162 */           double d24 = d22 * d21 - d23 * d20;
/*  163 */           double d25 = d23 * d21 + d22 * d20;
/*  164 */           double d26 = d24 * d17 + 0.0D * d18;
/*  165 */           double d27 = 0.0D * d17 - d24 * d18;
/*  166 */           he.a(d10 + d27 * d14 - d25 * d15, d11 + d26, d12 + d25 * d14 + d27 * d15);
/*      */         } 
/*      */       } 
/*      */     } 
/*  170 */     he.a();
/*      */   }
/*      */   
/*      */   public void a(cj paramcj) {
/*  174 */     if (this.k != null) {
/*  175 */       this.k.b(this);
/*      */     }
/*  177 */     this.f = -9999.0D;
/*  178 */     this.g = -9999.0D;
/*  179 */     this.h = -9999.0D;
/*  180 */     km.a.a(paramcj);
/*  181 */     this.k = paramcj;
/*  182 */     this.u = new ay(paramcj);
/*  183 */     if (paramcj != null) {
/*  184 */       paramcj.a(this);
/*  185 */       a();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a() {
/*  190 */     ln.K.a(this.t.y.i);
/*  191 */     this.H = this.t.y.e;
/*  192 */     if (this.o != null) {
/*  193 */       for (byte b = 0; b < this.o.length; b++) {
/*  194 */         this.o[b].c();
/*      */       }
/*      */     }
/*  197 */     int i = 64 << 3 - this.H;
/*  198 */     if (i > 400) {
/*  199 */       i = 400;
/*      */     }
/*  201 */     this.p = i / 16 + 1;
/*  202 */     this.q = 8;
/*  203 */     this.r = i / 16 + 1;
/*  204 */     this.o = new bj[this.p * this.q * this.r];
/*  205 */     this.n = new bj[this.p * this.q * this.r];
/*  206 */     byte b1 = 0;
/*  207 */     byte b2 = 0;
/*  208 */     this.B = 0;
/*  209 */     this.C = 0;
/*  210 */     this.D = 0;
/*  211 */     this.E = this.p;
/*  212 */     this.F = this.q;
/*  213 */     this.G = this.r; byte b3;
/*  214 */     for (b3 = 0; b3 < this.m.size(); b3++) {
/*  215 */       ((bj)this.m.get(b3)).u = false;
/*      */     }
/*  217 */     this.m.clear();
/*  218 */     this.a.clear();
/*  219 */     for (b3 = 0; b3 < this.p; b3++) {
/*  220 */       for (byte b = 0; b < this.q; b++) {
/*  221 */         for (byte b4 = 0; b4 < this.r; b4++) {
/*  222 */           this.o[(b4 * this.q + b) * this.p + b3] = new bj(this.k, this.a, b3 * 16, b * 16, b4 * 16, 16, this.s + b1);
/*  223 */           if (this.w) {
/*  224 */             (this.o[(b4 * this.q + b) * this.p + b3]).z = this.v.get(b2);
/*      */           }
/*  226 */           (this.o[(b4 * this.q + b) * this.p + b3]).y = false;
/*  227 */           (this.o[(b4 * this.q + b) * this.p + b3]).x = true;
/*  228 */           (this.o[(b4 * this.q + b) * this.p + b3]).o = true;
/*  229 */           (this.o[(b4 * this.q + b) * this.p + b3]).w = b2++;
/*  230 */           this.o[(b4 * this.q + b) * this.p + b3].f();
/*  231 */           this.n[(b4 * this.q + b) * this.p + b3] = this.o[(b4 * this.q + b) * this.p + b3];
/*  232 */           this.m.add(this.o[(b4 * this.q + b) * this.p + b3]);
/*  233 */           b1 += 3;
/*      */         } 
/*      */       } 
/*      */     } 
/*  237 */     if (this.k != null) {
/*  238 */       be be = this.t.g;
/*  239 */       b(ei.b(be.ah), ei.b(be.ai), ei.b(be.aj));
/*  240 */       Arrays.sort(this.n, new et(be));
/*      */     } 
/*  242 */     this.I = 2;
/*      */   }
/*      */   
/*      */   public void a(ah paramah, nq paramnq, float paramFloat) {
/*  246 */     if (this.I > 0) {
/*  247 */       this.I--;
/*      */       return;
/*      */     } 
/*  250 */     fq.a.a(this.k, this.l, this.t.o, this.t.g, paramFloat);
/*  251 */     km.a.a(this.k, this.l, this.t.o, this.t.g, this.t.y, paramFloat);
/*  252 */     this.J = 0;
/*  253 */     this.K = 0;
/*  254 */     this.L = 0;
/*  255 */     be be = this.t.g;
/*  256 */     km.b = be.aF + (be.ah - be.aF) * paramFloat;
/*  257 */     km.c = be.aG + (be.ai - be.aG) * paramFloat;
/*  258 */     km.d = be.aH + (be.aj - be.aH) * paramFloat;
/*  259 */     fq.b = be.aF + (be.ah - be.aF) * paramFloat;
/*  260 */     fq.c = be.aG + (be.ai - be.aG) * paramFloat;
/*  261 */     fq.d = be.aH + (be.aj - be.aH) * paramFloat;
/*  262 */     List<jx> list = this.k.i();
/*  263 */     this.J = list.size(); byte b;
/*  264 */     for (b = 0; b < list.size(); b++) {
/*  265 */       jx jx = list.get(b);
/*  266 */       if (jx.a(paramah) && paramnq.a(jx.ar) && (
/*  267 */         jx != this.t.g || this.t.y.w)) {
/*  268 */         this.K++;
/*  269 */         km.a.a(jx, paramFloat);
/*      */       } 
/*      */     } 
/*      */     
/*  273 */     for (b = 0; b < this.a.size(); b++) {
/*  274 */       fq.a.a(this.a.get(b), paramFloat);
/*      */     }
/*      */   }
/*      */   
/*      */   public String b() {
/*  279 */     return "C: " + this.P + "/" + this.M + ". F: " + this.N + ", O: " + this.O + ", E: " + this.Q;
/*      */   }
/*      */   
/*      */   public String c() {
/*  283 */     return "E: " + this.K + "/" + this.J + ". B: " + this.L + ", I: " + (this.J - this.L - this.K);
/*      */   }
/*      */   
/*      */   private void b(int paramInt1, int paramInt2, int paramInt3) {
/*  287 */     paramInt1 -= 8;
/*  288 */     paramInt2 -= 8;
/*  289 */     paramInt3 -= 8;
/*  290 */     this.B = Integer.MAX_VALUE;
/*  291 */     this.C = Integer.MAX_VALUE;
/*  292 */     this.D = Integer.MAX_VALUE;
/*  293 */     this.E = Integer.MIN_VALUE;
/*  294 */     this.F = Integer.MIN_VALUE;
/*  295 */     this.G = Integer.MIN_VALUE;
/*  296 */     int i = this.p * 16;
/*  297 */     int j = i / 2;
/*  298 */     for (byte b = 0; b < this.p; b++) {
/*  299 */       int k = b * 16;
/*  300 */       int m = k + j - paramInt1;
/*  301 */       if (m < 0) {
/*  302 */         m -= i - 1;
/*      */       }
/*  304 */       int n = k - m / i * i;
/*  305 */       if (n < this.B) {
/*  306 */         this.B = n;
/*      */       }
/*  308 */       if (n > this.E) {
/*  309 */         this.E = n;
/*      */       }
/*  311 */       for (byte b1 = 0; b1 < this.r; b1++) {
/*  312 */         int i1 = b1 * 16;
/*  313 */         int i2 = i1 + j - paramInt3;
/*  314 */         if (i2 < 0) {
/*  315 */           i2 -= i - 1;
/*      */         }
/*  317 */         int i3 = i1 - i2 / i * i;
/*  318 */         if (i3 < this.D) {
/*  319 */           this.D = i3;
/*      */         }
/*  321 */         if (i3 > this.G) {
/*  322 */           this.G = i3;
/*      */         }
/*  324 */         for (byte b2 = 0; b2 < this.q; b2++) {
/*  325 */           int i4 = b2 * 16;
/*  326 */           if (i4 < this.C) {
/*  327 */             this.C = i4;
/*      */           }
/*  329 */           if (i4 > this.F) {
/*  330 */             this.F = i4;
/*      */           }
/*  332 */           bj bj1 = this.o[(b1 * this.q + b2) * this.p + b];
/*  333 */           boolean bool = bj1.u;
/*  334 */           bj1.a(n, i4, i3);
/*  335 */           if (!bool && bj1.u)
/*  336 */             this.m.add(bj1); 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public int a(dg paramdg, int paramInt, double paramDouble) {
/*      */     int i;
/*  344 */     if (this.t.y.e != this.H) {
/*  345 */       a();
/*      */     }
/*  347 */     if (paramInt == 0) {
/*  348 */       this.M = 0;
/*  349 */       this.N = 0;
/*  350 */       this.O = 0;
/*  351 */       this.P = 0;
/*  352 */       this.Q = 0;
/*      */     } 
/*  354 */     double d1 = paramdg.aF + (paramdg.ah - paramdg.aF) * paramDouble;
/*  355 */     double d2 = paramdg.aG + (paramdg.ai - paramdg.aG) * paramDouble;
/*  356 */     double d3 = paramdg.aH + (paramdg.aj - paramdg.aH) * paramDouble;
/*  357 */     double d4 = paramdg.ah - this.f;
/*  358 */     double d5 = paramdg.ai - this.g;
/*  359 */     double d6 = paramdg.aj - this.h;
/*  360 */     if (d4 * d4 + d5 * d5 + d6 * d6 > 16.0D) {
/*  361 */       this.f = paramdg.ah;
/*  362 */       this.g = paramdg.ai;
/*  363 */       this.h = paramdg.aj;
/*  364 */       b(ei.b(paramdg.ah), ei.b(paramdg.ai), ei.b(paramdg.aj));
/*  365 */       Arrays.sort(this.n, new et(paramdg));
/*      */     } 
/*      */ 
/*      */     
/*  369 */     if (this.w && !this.t.y.g && paramInt == 0) {
/*      */       
/*  371 */       int j = 16;
/*  372 */       a(0, j); int k;
/*  373 */       for (k = 0; k < j; k++) {
/*  374 */         (this.n[k]).x = true;
/*      */       }
/*  376 */       i = 0 + a(0, j, paramInt, paramDouble);
/*      */       do {
/*  378 */         k = j;
/*  379 */         j *= 2;
/*  380 */         if (j > this.n.length) {
/*  381 */           j = this.n.length;
/*      */         }
/*  383 */         GL11.glDisable(3553);
/*  384 */         GL11.glDisable(2896);
/*  385 */         GL11.glDisable(3008);
/*  386 */         GL11.glDisable(2912);
/*  387 */         GL11.glColorMask(false, false, false, false);
/*  388 */         GL11.glDepthMask(false);
/*  389 */         a(k, j);
/*  390 */         GL11.glPushMatrix();
/*  391 */         float f1 = 0.0F;
/*  392 */         float f2 = 0.0F;
/*  393 */         float f3 = 0.0F;
/*  394 */         for (int m = k; m < j; m++) {
/*  395 */           if (this.n[m].e()) {
/*  396 */             (this.n[m]).o = false;
/*      */           } else {
/*      */             
/*  399 */             if (!(this.n[m]).o) {
/*  400 */               (this.n[m]).x = true;
/*      */             }
/*  402 */             if ((this.n[m]).o && !(this.n[m]).y) {
/*  403 */               int n = (int)(1.0F + ei.c(this.n[m].a(paramdg)) / 128.0F);
/*  404 */               if (this.x % n == m % n) {
/*  405 */                 bj bj1 = this.n[m];
/*  406 */                 float f4 = (float)(bj1.i - d1);
/*  407 */                 float f5 = (float)(bj1.j - d2);
/*  408 */                 float f6 = (float)(bj1.k - d3);
/*  409 */                 float f7 = f4 - f1;
/*  410 */                 float f8 = f5 - f2;
/*  411 */                 float f9 = f6 - f3;
/*  412 */                 if (f7 != 0.0F || f8 != 0.0F || f9 != 0.0F) {
/*  413 */                   GL11.glTranslatef(f7, f8, f9);
/*  414 */                   f1 += f7;
/*  415 */                   f2 += f8;
/*  416 */                   f3 += f9;
/*      */                 } 
/*  418 */                 ARBOcclusionQuery.glBeginQueryARB(35092, (this.n[m]).z);
/*  419 */                 this.n[m].d();
/*  420 */                 ARBOcclusionQuery.glEndQueryARB(35092);
/*  421 */                 (this.n[m]).y = true;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*  426 */         GL11.glPopMatrix();
/*  427 */         GL11.glColorMask(true, true, true, true);
/*  428 */         GL11.glDepthMask(true);
/*  429 */         GL11.glEnable(3553);
/*  430 */         GL11.glEnable(3008);
/*  431 */         GL11.glEnable(2912);
/*  432 */         i += a(k, j, paramInt, paramDouble);
/*  433 */       } while (j < this.n.length);
/*      */     } else {
/*      */       
/*  436 */       i = 0 + a(0, this.n.length, paramInt, paramDouble);
/*      */     } 
/*  438 */     return i;
/*      */   }
/*      */   
/*      */   private void a(int paramInt1, int paramInt2) {
/*  442 */     for (int i = paramInt1; i < paramInt2; i++) {
/*  443 */       if ((this.n[i]).y) {
/*  444 */         this.c.clear();
/*  445 */         ARBOcclusionQuery.glGetQueryObjectuARB((this.n[i]).z, 34919, this.c);
/*  446 */         if (this.c.get(0) != 0) {
/*  447 */           (this.n[i]).y = false;
/*  448 */           this.c.clear();
/*  449 */           ARBOcclusionQuery.glGetQueryObjectuARB((this.n[i]).z, 34918, this.c);
/*  450 */           (this.n[i]).x = (this.c.get(0) != 0);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private int a(int paramInt1, int paramInt2, int paramInt3, double paramDouble) {
/*  457 */     this.R.clear();
/*  458 */     byte b1 = 0;
/*  459 */     for (int i = paramInt1; i < paramInt2; i++) {
/*  460 */       if (paramInt3 == 0) {
/*  461 */         this.M++;
/*  462 */         if ((this.n[i]).p[paramInt3]) {
/*  463 */           this.Q++;
/*      */         }
/*  465 */         else if (!(this.n[i]).o) {
/*  466 */           this.N++;
/*      */         }
/*  468 */         else if (this.w && !(this.n[i]).x) {
/*  469 */           this.O++;
/*      */         } else {
/*      */           
/*  472 */           this.P++;
/*      */         } 
/*      */       } 
/*  475 */       if (!(this.n[i]).p[paramInt3] && (this.n[i]).o && (this.n[i]).x && this.n[i].a(paramInt3) >= 0) {
/*  476 */         this.R.add(this.n[i]);
/*  477 */         b1++;
/*      */       } 
/*      */     } 
/*  480 */     be be = this.t.g;
/*  481 */     double d1 = be.aF + (be.ah - be.aF) * paramDouble;
/*  482 */     double d2 = be.aG + (be.ai - be.aG) * paramDouble;
/*  483 */     double d3 = be.aH + (be.aj - be.aH) * paramDouble;
/*  484 */     byte b2 = 0; byte b3;
/*  485 */     for (b3 = 0; b3 < this.S.length; b3++) {
/*  486 */       this.S[b3].b();
/*      */     }
/*  488 */     for (b3 = 0; b3 < this.R.size(); b3++) {
/*  489 */       bj bj1 = this.R.get(b3);
/*  490 */       byte b = -1;
/*  491 */       for (byte b4 = 0; b4 < b2; b4++) {
/*  492 */         if (this.S[b4].a(bj1.i, bj1.j, bj1.k)) {
/*  493 */           b = b4;
/*      */         }
/*      */       } 
/*  496 */       if (b < 0) {
/*  497 */         b = b2++;
/*  498 */         this.S[b].a(bj1.i, bj1.j, bj1.k, d1, d2, d3);
/*      */       } 
/*  500 */       this.S[b].a(bj1.a(paramInt3));
/*      */     } 
/*  502 */     a(paramInt3, paramDouble);
/*  503 */     return b1;
/*      */   }
/*      */   
/*      */   public void a(int paramInt, double paramDouble) {
/*  507 */     for (byte b = 0; b < this.S.length; b++) {
/*  508 */       this.S[b].a();
/*      */     }
/*      */   }
/*      */   
/*      */   public void d() {
/*  513 */     this.x++;
/*      */   }
/*      */   
/*      */   public void a(float paramFloat) {
/*  517 */     GL11.glDisable(3553);
/*  518 */     ah ah = this.k.b(paramFloat);
/*  519 */     float f1 = (float)ah.a;
/*  520 */     float f2 = (float)ah.b;
/*  521 */     float f3 = (float)ah.c;
/*  522 */     if (this.t.y.g) {
/*  523 */       float f5 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  524 */       float f6 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  525 */       float f7 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*  526 */       f1 = f5;
/*  527 */       f2 = f6;
/*  528 */       f3 = f7;
/*      */     } 
/*  530 */     float[] arrayOfFloat = ColorUtil.BlendColor(0.5F, f1, f2, f3);
/*  531 */     f1 = arrayOfFloat[0];
/*  532 */     f2 = arrayOfFloat[1];
/*  533 */     f3 = arrayOfFloat[2];
/*  534 */     GL11.glColor3f(f1, f2, f3);
/*      */     
/*  536 */     he he = he.a;
/*  537 */     GL11.glDepthMask(false);
/*  538 */     GL11.glEnable(2912);
/*  539 */     GL11.glColor3f(f1, f2, f3);
/*      */     
/*  541 */     GL11.glCallList(this.z);
/*  542 */     GL11.glEnable(3553);
/*  543 */     GL11.glDisable(2912);
/*  544 */     GL11.glDisable(3008);
/*  545 */     GL11.glEnable(3042);
/*  546 */     GL11.glBlendFunc(1, 1);
/*  547 */     GL11.glPushMatrix();
/*      */ 
/*      */ 
/*      */     
/*  551 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  552 */     GL11.glTranslatef(0.0F, 0.0F, 0.0F);
/*  553 */     GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
/*  554 */     GL11.glRotatef(this.k.c(paramFloat) * 360.0F, 1.0F, 0.0F, 0.0F);
/*      */     
/*  556 */     GL11.glBindTexture(3553, this.l.a("/terrain/sun.png"));
/*  557 */     he.b();
/*  558 */     he.a(-30.0D, 100.0D, -30.0D, 0.0D, 0.0D);
/*  559 */     he.a(30.0D, 100.0D, -30.0D, 1.0D, 0.0D);
/*  560 */     he.a(30.0D, 100.0D, 30.0D, 1.0D, 1.0D);
/*  561 */     he.a(-30.0D, 100.0D, 30.0D, 0.0D, 1.0D);
/*  562 */     he.a();
/*      */     
/*  564 */     GL11.glBindTexture(3553, this.l.a("/terrain/moon.png"));
/*  565 */     he.b();
/*  566 */     he.a(-20.0D, -100.0D, 20.0D, 1.0D, 1.0D);
/*  567 */     he.a(20.0D, -100.0D, 20.0D, 0.0D, 1.0D);
/*  568 */     he.a(20.0D, -100.0D, -20.0D, 0.0D, 0.0D);
/*  569 */     he.a(-20.0D, -100.0D, -20.0D, 1.0D, 0.0D);
/*  570 */     he.a();
/*  571 */     GL11.glDisable(3553);
/*  572 */     float f4 = this.k.f(paramFloat);
/*  573 */     if (f4 > 0.0F) {
/*  574 */       GL11.glColor4f(f4, f4, f4, f4);
/*  575 */       GL11.glCallList(this.y);
/*      */     } 
/*  577 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  578 */     GL11.glDisable(3042);
/*  579 */     GL11.glEnable(3008);
/*  580 */     GL11.glEnable(2912);
/*  581 */     GL11.glPopMatrix();
/*  582 */     GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
/*  583 */     GL11.glDisable(3553);
/*  584 */     GL11.glCallList(this.A);
/*  585 */     GL11.glEnable(3553);
/*  586 */     GL11.glDepthMask(true);
/*      */   }
/*      */   
/*      */   public void b(float paramFloat) {
/*  590 */     if (this.t.y.i) {
/*  591 */       c(paramFloat);
/*      */       return;
/*      */     } 
/*  594 */     GL11.glDisable(2884);
/*  595 */     float f1 = (float)(this.t.g.aG + (this.t.g.ai - this.t.g.aG) * paramFloat);
/*      */ 
/*      */     
/*  598 */     he he = he.a;
/*  599 */     GL11.glBindTexture(3553, this.l.a("/clouds.png"));
/*  600 */     GL11.glEnable(3042);
/*  601 */     GL11.glBlendFunc(770, 771);
/*  602 */     ah ah = this.k.d(paramFloat);
/*  603 */     float f2 = (float)ah.a;
/*  604 */     float f3 = (float)ah.b;
/*  605 */     float f4 = (float)ah.c;
/*  606 */     if (this.t.y.g) {
/*  607 */       float f8 = (f2 * 30.0F + f3 * 59.0F + f4 * 11.0F) / 100.0F;
/*  608 */       float f9 = (f2 * 30.0F + f3 * 70.0F) / 100.0F;
/*  609 */       float f10 = (f2 * 30.0F + f4 * 70.0F) / 100.0F;
/*  610 */       f2 = f8;
/*  611 */       f3 = f9;
/*  612 */       f4 = f10;
/*      */     } 
/*      */     
/*  615 */     double d1 = this.t.g.ae + (this.t.g.ah - this.t.g.ae) * paramFloat + ((this.x + paramFloat) * 0.03F);
/*  616 */     double d2 = this.t.g.ag + (this.t.g.aj - this.t.g.ag) * paramFloat;
/*  617 */     int i = ei.b(d1 / 2048.0D);
/*  618 */     int j = ei.b(d2 / 2048.0D);
/*  619 */     double d3 = d1 - (i * 2048);
/*  620 */     double d4 = d2 - (j * 2048);
/*  621 */     float f5 = 120.0F - f1 + 0.33F;
/*  622 */     float f6 = (float)(d3 * 4.8828125E-4D);
/*  623 */     float f7 = (float)(d4 * 4.8828125E-4D);
/*  624 */     he.b();
/*  625 */     he.a(f2, f3, f4, 0.8F);
/*  626 */     for (short s = -256; s < 256; s += 32) {
/*  627 */       for (short s1 = -256; s1 < 256; s1 += 32) {
/*  628 */         he.a((s + 0), f5, (s1 + 32), ((s + 0) * 4.8828125E-4F + f6), ((s1 + 32) * 4.8828125E-4F + f7));
/*  629 */         he.a((s + 32), f5, (s1 + 32), ((s + 32) * 4.8828125E-4F + f6), ((s1 + 32) * 4.8828125E-4F + f7));
/*  630 */         he.a((s + 32), f5, (s1 + 0), ((s + 32) * 4.8828125E-4F + f6), ((s1 + 0) * 4.8828125E-4F + f7));
/*  631 */         he.a((s + 0), f5, (s1 + 0), ((s + 0) * 4.8828125E-4F + f6), ((s1 + 0) * 4.8828125E-4F + f7));
/*      */       } 
/*      */     } 
/*  634 */     he.a();
/*  635 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  636 */     GL11.glDisable(3042);
/*  637 */     GL11.glEnable(2884);
/*      */   }
/*      */   
/*      */   public void c(float paramFloat) {
/*  641 */     GL11.glDisable(2884);
/*  642 */     float f1 = (float)(this.t.g.aG + (this.t.g.ai - this.t.g.aG) * paramFloat);
/*  643 */     he he = he.a;
/*      */ 
/*      */     
/*  646 */     double d1 = (this.t.g.ae + (this.t.g.ah - this.t.g.ae) * paramFloat + ((this.x + paramFloat) * 0.03F)) / 12.0D;
/*  647 */     double d2 = (this.t.g.ag + (this.t.g.aj - this.t.g.ag) * paramFloat) / 12.0D + 0.33000001311302185D;
/*  648 */     float f2 = 108.0F - f1 + 0.33F;
/*  649 */     int i = ei.b(d1 / 2048.0D);
/*  650 */     int j = ei.b(d2 / 2048.0D);
/*  651 */     double d3 = d1 - (i * 2048);
/*  652 */     double d4 = d2 - (j * 2048);
/*  653 */     GL11.glBindTexture(3553, this.l.a("/clouds.png"));
/*  654 */     GL11.glEnable(3042);
/*  655 */     GL11.glBlendFunc(770, 771);
/*  656 */     ah ah = this.k.d(paramFloat);
/*  657 */     float f3 = (float)ah.a;
/*  658 */     float f4 = (float)ah.b;
/*  659 */     float f5 = (float)ah.c;
/*  660 */     if (this.t.y.g) {
/*  661 */       float f12 = (f3 * 30.0F + f4 * 59.0F + f5 * 11.0F) / 100.0F;
/*  662 */       float f13 = (f3 * 30.0F + f4 * 70.0F) / 100.0F;
/*  663 */       float f14 = (f3 * 30.0F + f5 * 70.0F) / 100.0F;
/*  664 */       f3 = f12;
/*  665 */       f4 = f13;
/*  666 */       f5 = f14;
/*      */     } 
/*  668 */     float f6 = (float)(d3 * 0.0D);
/*  669 */     float f7 = (float)(d4 * 0.0D);
/*      */     
/*  671 */     float f8 = ei.b(d3) * 0.00390625F;
/*  672 */     float f9 = ei.b(d4) * 0.00390625F;
/*  673 */     float f10 = (float)(d3 - ei.b(d3));
/*  674 */     float f11 = (float)(d4 - ei.b(d4));
/*      */ 
/*      */ 
/*      */     
/*  678 */     GL11.glScalef(12.0F, 1.0F, 12.0F);
/*  679 */     for (byte b = 0; b < 2; b++) {
/*  680 */       if (b == 0) {
/*  681 */         GL11.glColorMask(false, false, false, false);
/*      */       } else {
/*      */         
/*  684 */         GL11.glColorMask(true, true, true, true);
/*      */       } 
/*  686 */       for (byte b1 = -2; b1 <= 3; b1++) {
/*  687 */         for (byte b2 = -2; b2 <= 3; b2++) {
/*  688 */           he.b();
/*  689 */           float f12 = (b1 * 8);
/*  690 */           float f13 = (b2 * 8);
/*  691 */           float f14 = f12 - f10;
/*  692 */           float f15 = f13 - f11;
/*  693 */           if (f2 > -5.0F) {
/*  694 */             he.a(f3 * 0.7F, f4 * 0.7F, f5 * 0.7F, 0.8F);
/*  695 */             he.b(0.0F, -1.0F, 0.0F);
/*  696 */             he.a((f14 + 0.0F), (f2 + 0.0F), (f15 + 8.0F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  697 */             he.a((f14 + 8.0F), (f2 + 0.0F), (f15 + 8.0F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  698 */             he.a((f14 + 8.0F), (f2 + 0.0F), (f15 + 0.0F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*  699 */             he.a((f14 + 0.0F), (f2 + 0.0F), (f15 + 0.0F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*      */           } 
/*  701 */           if (f2 <= 5.0F) {
/*  702 */             he.a(f3, f4, f5, 0.8F);
/*  703 */             he.b(0.0F, 1.0F, 0.0F);
/*  704 */             he.a((f14 + 0.0F), (f2 + 4.0F - 9.765625E-4F), (f15 + 8.0F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  705 */             he.a((f14 + 8.0F), (f2 + 4.0F - 9.765625E-4F), (f15 + 8.0F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  706 */             he.a((f14 + 8.0F), (f2 + 4.0F - 9.765625E-4F), (f15 + 0.0F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*  707 */             he.a((f14 + 0.0F), (f2 + 4.0F - 9.765625E-4F), (f15 + 0.0F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*      */           } 
/*  709 */           he.a(f3 * 0.9F, f4 * 0.9F, f5 * 0.9F, 0.8F);
/*  710 */           if (b1 > -1) {
/*  711 */             he.b(-1.0F, 0.0F, 0.0F);
/*  712 */             for (byte b3 = 0; b3 < 8; b3++) {
/*  713 */               he.a((f14 + b3 + 0.0F), (f2 + 0.0F), (f15 + 8.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  714 */               he.a((f14 + b3 + 0.0F), (f2 + 4.0F), (f15 + 8.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  715 */               he.a((f14 + b3 + 0.0F), (f2 + 4.0F), (f15 + 0.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*  716 */               he.a((f14 + b3 + 0.0F), (f2 + 0.0F), (f15 + 0.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*      */             } 
/*      */           } 
/*  719 */           if (b1 <= 1) {
/*  720 */             he.b(1.0F, 0.0F, 0.0F);
/*  721 */             for (byte b3 = 0; b3 < 8; b3++) {
/*  722 */               he.a((f14 + b3 + 1.0F - 9.765625E-4F), (f2 + 0.0F), (f15 + 8.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  723 */               he.a((f14 + b3 + 1.0F - 9.765625E-4F), (f2 + 4.0F), (f15 + 8.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 8.0F) * 0.00390625F + f9));
/*  724 */               he.a((f14 + b3 + 1.0F - 9.765625E-4F), (f2 + 4.0F), (f15 + 0.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*  725 */               he.a((f14 + b3 + 1.0F - 9.765625E-4F), (f2 + 0.0F), (f15 + 0.0F), ((f12 + b3 + 0.5F) * 0.00390625F + f8), ((f13 + 0.0F) * 0.00390625F + f9));
/*      */             } 
/*      */           } 
/*  728 */           he.a(f3 * 0.8F, f4 * 0.8F, f5 * 0.8F, 0.8F);
/*  729 */           if (b2 > -1) {
/*  730 */             he.b(0.0F, 0.0F, -1.0F);
/*  731 */             for (byte b3 = 0; b3 < 8; b3++) {
/*  732 */               he.a((f14 + 0.0F), (f2 + 4.0F), (f15 + b3 + 0.0F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*  733 */               he.a((f14 + 8.0F), (f2 + 4.0F), (f15 + b3 + 0.0F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*  734 */               he.a((f14 + 8.0F), (f2 + 0.0F), (f15 + b3 + 0.0F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*  735 */               he.a((f14 + 0.0F), (f2 + 0.0F), (f15 + b3 + 0.0F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*      */             } 
/*      */           } 
/*  738 */           if (b2 <= 1) {
/*  739 */             he.b(0.0F, 0.0F, 1.0F);
/*  740 */             for (byte b3 = 0; b3 < 8; b3++) {
/*  741 */               he.a((f14 + 0.0F), (f2 + 4.0F), (f15 + b3 + 1.0F - 9.765625E-4F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*  742 */               he.a((f14 + 8.0F), (f2 + 4.0F), (f15 + b3 + 1.0F - 9.765625E-4F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*  743 */               he.a((f14 + 8.0F), (f2 + 0.0F), (f15 + b3 + 1.0F - 9.765625E-4F), ((f12 + 8.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*  744 */               he.a((f14 + 0.0F), (f2 + 0.0F), (f15 + b3 + 1.0F - 9.765625E-4F), ((f12 + 0.0F) * 0.00390625F + f8), ((f13 + b3 + 0.5F) * 0.00390625F + f9));
/*      */             } 
/*      */           } 
/*  747 */           he.a();
/*      */         } 
/*      */       } 
/*      */     } 
/*  751 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  752 */     GL11.glDisable(3042);
/*  753 */     GL11.glEnable(2884);
/*      */   }
/*      */   
/*      */   public boolean a(dg paramdg, boolean paramBoolean) {
/*  757 */     Collections.sort(this.m, new gc(paramdg));
/*  758 */     int i = this.m.size() - 1; int j; byte b;
/*  759 */     for (j = this.m.size(), b = 0; b < j; b++) {
/*  760 */       bj bj1 = this.m.get(i - b);
/*  761 */       if (!paramBoolean) {
/*  762 */         if (bj1.a(paramdg) > 1024.0F) {
/*  763 */           if (bj1.o) {
/*  764 */             if (b >= 3) {
/*  765 */               return false;
/*      */             }
/*      */           }
/*  768 */           else if (b >= 1) {
/*  769 */             return false;
/*      */           }
/*      */         
/*      */         }
/*  773 */       } else if (!bj1.o) {
/*      */         continue;
/*      */       } 
/*  776 */       bj1.a();
/*  777 */       this.m.remove(bj1);
/*  778 */       bj1.u = false; continue;
/*      */     } 
/*  780 */     return (this.m.size() == 0);
/*      */   }
/*      */   
/*      */   public void a(dg paramdg, lv paramlv, int paramInt, eo parameo, float paramFloat) {
/*  784 */     he he = he.a;
/*  785 */     GL11.glEnable(3042);
/*  786 */     GL11.glEnable(3008);
/*  787 */     GL11.glBlendFunc(770, 1);
/*  788 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, (ei.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
/*  789 */     if (paramInt == 0) {
/*  790 */       if (this.i > 0.0F) {
/*  791 */         GL11.glBlendFunc(774, 768);
/*  792 */         GL11.glBindTexture(3553, this.l.a("/terrain.png"));
/*  793 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
/*  794 */         GL11.glPushMatrix();
/*  795 */         int i = this.k.a(paramlv.b, paramlv.c, paramlv.d);
/*  796 */         ln ln = (i > 0) ? ln.n[i] : null;
/*  797 */         GL11.glDisable(3008);
/*  798 */         GL11.glPolygonOffset(-3.0F, -3.0F);
/*  799 */         GL11.glEnable(32823);
/*  800 */         he.b();
/*  801 */         he.b(-(paramdg.aF + (paramdg.ah - paramdg.aF) * paramFloat), -(paramdg.aG + (paramdg.ai - paramdg.aG) * paramFloat), -(paramdg.aH + (paramdg.aj - paramdg.aH) * paramFloat));
/*  802 */         he.c();
/*  803 */         if (ln == null) {
/*  804 */           ln = ln.t;
/*      */         }
/*  806 */         this.u.a(ln, paramlv.b, paramlv.c, paramlv.d, 240 + (int)(this.i * 10.0F));
/*  807 */         he.a();
/*  808 */         he.b(0.0D, 0.0D, 0.0D);
/*  809 */         GL11.glPolygonOffset(0.0F, 0.0F);
/*  810 */         GL11.glDisable(32823);
/*  811 */         GL11.glEnable(3008);
/*  812 */         GL11.glDepthMask(true);
/*  813 */         GL11.glPopMatrix();
/*      */       }
/*      */     
/*  816 */     } else if (parameo != null) {
/*  817 */       GL11.glBlendFunc(770, 771);
/*  818 */       float f = ei.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
/*  819 */       GL11.glColor4f(f, f, f, ei.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
/*  820 */       GL11.glBindTexture(3553, this.l.a("/terrain.png"));
/*  821 */       int i = paramlv.b;
/*  822 */       int j = paramlv.c;
/*  823 */       int k = paramlv.d;
/*  824 */       if (paramlv.e == 0) {
/*  825 */         j--;
/*      */       }
/*  827 */       if (paramlv.e == 1) {
/*  828 */         j++;
/*      */       }
/*  830 */       if (paramlv.e == 2) {
/*  831 */         k--;
/*      */       }
/*  833 */       if (paramlv.e == 3) {
/*  834 */         k++;
/*      */       }
/*  836 */       if (paramlv.e == 4) {
/*  837 */         i--;
/*      */       }
/*  839 */       if (paramlv.e == 5) {
/*  840 */         i++;
/*      */       }
/*      */     } 
/*  843 */     GL11.glDisable(3042);
/*  844 */     GL11.glDisable(3008);
/*      */   }
/*      */   
/*      */   public void b(dg paramdg, lv paramlv, int paramInt, eo parameo, float paramFloat) {
/*  848 */     if (paramInt == 0 && paramlv.a == 0) {
/*  849 */       GL11.glEnable(3042);
/*  850 */       GL11.glBlendFunc(770, 771);
/*  851 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
/*  852 */       GL11.glLineWidth(2.0F);
/*  853 */       GL11.glDisable(3553);
/*  854 */       GL11.glDepthMask(false);
/*      */       
/*  856 */       int i = this.k.a(paramlv.b, paramlv.c, paramlv.d);
/*  857 */       if (i > 0) {
/*  858 */         ln.n[i].a(this.k, paramlv.b, paramlv.c, paramlv.d);
/*  859 */         a(ln.n[i].f(this.k, paramlv.b, paramlv.c, paramlv.d).b(0.0020000000949949026D, 0.0020000000949949026D, 0.0020000000949949026D).c(-(paramdg.aF + (paramdg.ah - paramdg.aF) * paramFloat), -(paramdg.aG + (paramdg.ai - paramdg.aG) * paramFloat), -(paramdg.aH + (paramdg.aj - paramdg.aH) * paramFloat)));
/*      */       } 
/*  861 */       GL11.glDepthMask(true);
/*  862 */       GL11.glEnable(3553);
/*  863 */       GL11.glDisable(3042);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(cb paramcb) {
/*  868 */     he he = he.a;
/*  869 */     he.a(3);
/*  870 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/*  871 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/*  872 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/*  873 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/*  874 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/*  875 */     he.a();
/*  876 */     he.a(3);
/*  877 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/*  878 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/*  879 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/*  880 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/*  881 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/*  882 */     he.a();
/*  883 */     he.a(1);
/*  884 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/*  885 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/*  886 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/*  887 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/*  888 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/*  889 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/*  890 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/*  891 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/*  892 */     he.a();
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  896 */     int i = ei.a(paramInt1, 16);
/*  897 */     int j = ei.a(paramInt2, 16);
/*  898 */     int k = ei.a(paramInt3, 16);
/*  899 */     int m = ei.a(paramInt4, 16);
/*  900 */     int n = ei.a(paramInt5, 16);
/*  901 */     int i1 = ei.a(paramInt6, 16);
/*  902 */     for (int i2 = i; i2 <= m; i2++) {
/*  903 */       int i3 = i2 % this.p;
/*  904 */       if (i3 < 0) {
/*  905 */         i3 += this.p;
/*      */       }
/*  907 */       for (int i4 = j; i4 <= n; i4++) {
/*  908 */         int i5 = i4 % this.q;
/*  909 */         if (i5 < 0) {
/*  910 */           i5 += this.q;
/*      */         }
/*  912 */         for (int i6 = k; i6 <= i1; i6++) {
/*  913 */           int i7 = i6 % this.r;
/*  914 */           if (i7 < 0) {
/*  915 */             i7 += this.r;
/*      */           }
/*  917 */           bj bj1 = this.o[(i7 * this.q + i5) * this.p + i3];
/*  918 */           if (!bj1.u) {
/*  919 */             this.m.add(bj1);
/*      */           }
/*  921 */           bj1.f();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  928 */     a(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  932 */     a(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt4 + 1, paramInt5 + 1, paramInt6 + 1);
/*      */   }
/*      */   
/*      */   public void a(nq paramnq, float paramFloat) {
/*  936 */     for (byte b = 0; b < this.o.length; b++) {
/*  937 */       if (!this.o[b].e() && (!(this.o[b]).o || (b + this.j & 0xF) == 0)) {
/*  938 */         this.o[b].a(paramnq);
/*      */       }
/*      */     } 
/*  941 */     this.j++;
/*      */   }
/*      */   
/*      */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  945 */     if (paramString != null) {
/*  946 */       this.t.u.b(paramString);
/*      */     }
/*  948 */     this.t.A.a(paramString, paramInt1, paramInt2, paramInt3, 1.0F, 1.0F);
/*      */   }
/*      */   
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  952 */     float f = 16.0F;
/*  953 */     if (paramFloat1 > 1.0F) {
/*  954 */       f *= paramFloat1;
/*      */     }
/*  956 */     if (this.t.g.d(paramDouble1, paramDouble2, paramDouble3) < (f * f)) {
/*  957 */       this.t.A.b(paramString, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  962 */     double d1 = this.t.g.ah - paramDouble1;
/*  963 */     double d2 = this.t.g.ai - paramDouble2;
/*  964 */     double d3 = this.t.g.aj - paramDouble3;
/*  965 */     if (d1 * d1 + d2 * d2 + d3 * d3 > 256.0D) {
/*      */       return;
/*      */     }
/*  968 */     if (paramString == "bubble") {
/*  969 */       this.t.h.a(new aw(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
/*      */     }
/*  971 */     else if (paramString == "smoke") {
/*  972 */       this.t.h.a(new my(this.k, paramDouble1, paramDouble2, paramDouble3));
/*      */     }
/*  974 */     else if (paramString == "explode") {
/*  975 */       this.t.h.a(new dj(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
/*      */     }
/*  977 */     else if (paramString == "flame") {
/*  978 */       this.t.h.a(new is(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
/*      */     }
/*  980 */     else if (paramString == "lava") {
/*  981 */       this.t.h.a(new cm(this.k, paramDouble1, paramDouble2, paramDouble3));
/*      */     }
/*  983 */     else if (paramString == "splash") {
/*  984 */       this.t.h.a(new kf(this.k, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
/*      */     }
/*  986 */     else if (paramString == "largesmoke") {
/*  987 */       this.t.h.a(new my(this.k, paramDouble1, paramDouble2, paramDouble3, 2.5F));
/*      */     }
/*  989 */     else if (paramString == "reddust") {
/*  990 */       this.t.h.a(new eh(this.k, paramDouble1, paramDouble2, paramDouble3));
/*      */     }
/*  992 */     else if (paramString == "snowballpoof") {
/*  993 */       this.t.h.a(new hw(this.k, paramDouble1, paramDouble2, paramDouble3, dd.aB));
/*      */     }
/*  995 */     else if (paramString == "slime") {
/*  996 */       this.t.h.a(new hw(this.k, paramDouble1, paramDouble2, paramDouble3, dd.aK));
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(jx paramjx) {
/* 1001 */     if (paramjx.aV != null) {
/* 1002 */       this.l.a(paramjx.aV, new jh());
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(jx paramjx) {
/* 1007 */     if (paramjx.aV != null) {
/* 1008 */       this.l.b(paramjx.aV);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e() {
/* 1013 */     for (byte b = 0; b < this.o.length; b++) {
/* 1014 */       if ((this.o[b]).A) {
/* 1015 */         if (!(this.o[b]).u) {
/* 1016 */           this.m.add(this.o[b]);
/*      */         }
/* 1018 */         this.o[b].f();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */