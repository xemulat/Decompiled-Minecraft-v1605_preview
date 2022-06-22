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
/*     */ public class fv
/*     */   extends jx
/*     */ {
/*  18 */   public int j = 20;
/*     */   public float k;
/*     */   public float l;
/*     */   public float m;
/*  22 */   public float n = 0.0F; public float o = 0.0F; protected float p; protected float q;
/*     */   protected float r;
/*     */   protected float s;
/*     */   protected boolean t = true;
/*  26 */   protected String u = "/char.png";
/*     */   protected boolean v = true;
/*  28 */   protected float w = 0.0F;
/*  29 */   protected String x = null;
/*  30 */   protected float y = 1.0F;
/*  31 */   protected int z = 0;
/*  32 */   protected float A = 0.0F;
/*     */   
/*     */   public float B;
/*     */   
/*     */   public float C;
/*     */   
/*     */   public int D;
/*     */   
/*     */   public int E;
/*     */   private int a;
/*     */   public int F;
/*     */   public int G;
/*  44 */   public float H = 0.0F;
/*  45 */   public int I = 0;
/*  46 */   public int J = 0;
/*     */   
/*     */   public float K;
/*     */   public float L;
/*     */   protected boolean M = false;
/*  51 */   public int N = -1;
/*  52 */   public float O = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D); public float P; public float Q; public float R; protected int S; protected float T; protected float U; protected float V;
/*     */   protected boolean W;
/*     */   protected float X;
/*     */   protected float Y;
/*     */   private jx b;
/*     */   private int c;
/*     */   
/*  59 */   public fv(cj paramcj) { super(paramcj);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 472 */     this.S = 0;
/*     */     
/* 474 */     this.W = false;
/* 475 */     this.X = 0.0F;
/* 476 */     this.Y = 0.7F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 522 */     this.c = 0; this.D = 10; this.aa = true; this.m = (float)(Math.random() + 1.0D) * 0.01F; a(this.ah, this.ai, this.aj); this.k = (float)Math.random() * 12398.0F; this.an = (float)(Math.random() * 3.1415927410125732D * 2.0D); this.l = 1.0F; this.aJ = 0.5F; }
/*     */   protected boolean c(jx paramjx) { return (this.ad.a(ah.b(this.ah, this.ai + q(), this.aj), ah.b(paramjx.ah, paramjx.ai + paramjx.q(), paramjx.aj)) == null); }
/*     */   public String v() { return this.u; }
/* 525 */   public boolean c_() { return !this.ax; } public boolean d_() { return !this.ax; } protected float q() { return this.aA * 0.85F; } public int b() { return 80; } public void w() { this.B = this.C; super.w(); if (this.aN.nextInt(1000) < this.a++) { this.a = -b(); String str = c(); if (str != null) this.ad.a(this, str, f(), (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F);  }  if (z() && G()) a((jx)null, 1);  if (z() && a(fs.f)) { this.aU--; if (this.aU == -20) { this.aU = 0; for (byte b = 0; b < 8; b++) { float f1 = this.aN.nextFloat() - this.aN.nextFloat(); float f2 = this.aN.nextFloat() - this.aN.nextFloat(); float f3 = this.aN.nextFloat() - this.aN.nextFloat(); this.ad.a("bubble", this.ah + f1, this.ai + f2, this.aj + f3, this.ak, this.al, this.am); }  a((jx)null, 2); }  this.aQ = 0; } else { this.aU = this.aR; }  this.K = this.L; if (this.J > 0) this.J--;  if (this.F > 0) this.F--;  if (this.aT > 0) this.aT--;  if (this.D <= 0) { this.I++; if (this.I > 20) { B(); D(); for (byte b = 0; b < 20; b++) { double d1 = this.aN.nextGaussian() * 0.02D; double d2 = this.aN.nextGaussian() * 0.02D; double d3 = this.aN.nextGaussian() * 0.02D; this.ad.a("explode", this.ah + (this.aN.nextFloat() * this.az * 2.0F) - this.az, this.ai + (this.aN.nextFloat() * this.aA), this.aj + (this.aN.nextFloat() * this.az * 2.0F) - this.az, d1, d2, d3); }  }  }  this.s = this.r; this.o = this.n; this.ap = this.an; this.aq = this.ao; } public void x() { for (byte b = 0; b < 20; b++) { double d1 = this.aN.nextGaussian() * 0.02D; double d2 = this.aN.nextGaussian() * 0.02D; double d3 = this.aN.nextGaussian() * 0.02D; double d4 = 10.0D; this.ad.a("explode", this.ah + (this.aN.nextFloat() * this.az * 2.0F) - this.az - d1 * d4, this.ai + (this.aN.nextFloat() * this.aA) - d2 * d4, this.aj + (this.aN.nextFloat() * this.az * 2.0F) - this.az - d3 * d4, d1, d2, d3); }  } public void n() { super.n(); this.p = this.q; this.q = 0.0F; } public void e_() { super.e_(); i(); double d1 = this.ah - this.ae; double d2 = this.aj - this.ag; float f1 = ei.a(d1 * d1 + d2 * d2); float f2 = this.n; float f3 = 0.0F; this.p = this.q; float f4 = 0.0F; if (f1 > 0.05F) { f4 = 1.0F; f3 = f1 * 3.0F; f2 = (float)Math.atan2(d2, d1) * 180.0F / 3.1415927F - 90.0F; }  if (this.C > 0.0F) f2 = this.an;  if (!this.as) f4 = 0.0F;  this.q += (f4 - this.q) * 0.3F; float f5 = f2 - this.n; while (f5 < -180.0F) f5 += 360.0F;  while (f5 >= 180.0F) f5 -= 360.0F;  this.n += f5 * 0.3F; float f6 = this.an - this.n; while (f6 < -180.0F) f6 += 360.0F;  while (f6 >= 180.0F) f6 -= 360.0F;  boolean bool = (f6 < -90.0F || f6 >= 90.0F) ? true : false; if (f6 < -75.0F) f6 = -75.0F;  if (f6 >= 75.0F) f6 = 75.0F;  this.n = this.an - f6; if (f6 * f6 > 2500.0F) this.n += f6 * 0.2F;  if (bool) f3 *= -1.0F;  while (this.an - this.ap < -180.0F) this.ap -= 360.0F;  while (this.an - this.ap >= 180.0F) this.ap += 360.0F;  while (this.n - this.o < -180.0F) this.o -= 360.0F;  while (this.n - this.o >= 180.0F) this.o += 360.0F;  while (this.ao - this.aq < -180.0F) this.aq -= 360.0F;  while (this.ao - this.aq >= 180.0F) this.aq += 360.0F;  this.r += f3; } protected void a(float paramFloat1, float paramFloat2) { super.a(paramFloat1, paramFloat2); } public void b(int paramInt) { if (this.D <= 0) return;  this.D += paramInt; if (this.D > 20) this.D = 20;  this.aT = this.j / 2; } public boolean a(jx paramjx, int paramInt) { this.S = 0; if (this.D <= 0) return false;  this.Q = 1.5F; if (this.aT > this.j / 2.0F) { if (this.E - paramInt >= this.D) return false;  this.D = this.E - paramInt; } else { this.E = this.D; this.aT = this.j; this.D -= paramInt; this.F = this.G = 10; }  this.H = 0.0F; if (paramjx != null) { double d1 = paramjx.ah - this.ah; double d2 = paramjx.aj - this.aj; while (d1 * d1 + d2 * d2 < 1.0E-4D) { d1 = (Math.random() - Math.random()) * 0.01D; d2 = (Math.random() - Math.random()) * 0.01D; }  this.H = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - this.an; a(paramjx, paramInt, d1, d2); } else { this.H = ((int)(Math.random() * 2.0D) * 180); }  if (this.D <= 0) { this.ad.a(this, e(), f(), (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F); b(paramjx); } else { this.ad.a(this, d(), f(), (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F); }  return true; } protected float f() { return 1.0F; } protected void b_() { this.S++;
/*     */     
/* 527 */     dg dg = this.ad.a(this, -1.0D);
/*     */     
/* 529 */     if (dg != null) {
/* 530 */       double d1 = dg.ah - this.ah;
/* 531 */       double d2 = dg.ai - this.ai;
/* 532 */       double d3 = dg.aj - this.aj;
/* 533 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */       
/* 535 */       if (d4 > 16384.0D) {
/* 536 */         D();
/*     */       }
/*     */       
/* 539 */       if (this.S > 600 && this.aN.nextInt(800) == 0) {
/* 540 */         if (d4 < 1024.0D) {
/* 541 */           this.S = 0;
/*     */         } else {
/* 543 */           D();
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 548 */     this.T = 0.0F;
/* 549 */     this.U = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 557 */     float f = 8.0F;
/* 558 */     if (this.aN.nextFloat() < 0.02F) {
/* 559 */       dg = this.ad.a(this, f);
/* 560 */       if (dg != null) {
/* 561 */         this.b = dg;
/* 562 */         this.c = 10 + this.aN.nextInt(20);
/*     */       } else {
/* 564 */         this.V = (this.aN.nextFloat() - 0.5F) * 20.0F;
/*     */       } 
/*     */     } 
/*     */     
/* 568 */     if (this.b != null) {
/* 569 */       b(this.b, 10.0F);
/* 570 */       if (this.c-- <= 0 || this.b.ax || this.b.e(this) > (f * f)) {
/* 571 */         this.b = null;
/*     */       }
/*     */     } else {
/* 574 */       if (this.aN.nextFloat() < 0.05F) {
/* 575 */         this.V = (this.aN.nextFloat() - 0.5F) * 20.0F;
/*     */       }
/* 577 */       this.an += this.V;
/* 578 */       this.ao = this.X;
/*     */     } 
/*     */     
/* 581 */     boolean bool1 = g_();
/* 582 */     boolean bool2 = E();
/* 583 */     if (bool1 || bool2) this.W = (this.aN.nextFloat() < 0.8F);  }
/*     */   protected String c() { return null; }
/*     */   protected String d() { return "random.hurt"; }
/*     */   protected String e() { return "random.hurt"; }
/* 587 */   public void a(jx paramjx, int paramInt, double paramDouble1, double paramDouble2) { float f1 = ei.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2); float f2 = 0.4F; this.ak /= 2.0D; this.al /= 2.0D; this.am /= 2.0D; this.ak -= paramDouble1 / f1 * f2; this.al += 0.4000000059604645D; this.am -= paramDouble2 / f1 * f2; if (this.al > 0.4000000059604645D) this.al = 0.4000000059604645D;  } public void b(jx paramjx) { if (this.z > 0 && paramjx != null) paramjx.b(this, this.z);  this.M = true; int i = g(); if (i > 0) { int j = this.aN.nextInt(3); for (byte b = 0; b < j; b++) b(i, 1);  }  } protected int g() { return 0; } protected void c(float paramFloat) { int i = (int)Math.ceil((paramFloat - 3.0F)); if (i > 0) { a((jx)null, i); int j = this.ad.a(ei.b(this.ah), ei.b(this.ai - 0.20000000298023224D - this.ay), ei.b(this.aj)); if (j > 0) { ax ax = (ln.n[j]).bj; this.ad.a(this, ax.d(), ax.b() * 0.5F, ax.c() * 0.75F); }  }  } public void b(float paramFloat1, float paramFloat2) { if (g_()) { double d = this.ai; a(paramFloat1, paramFloat2, 0.02F); c(this.ak, this.al, this.am); this.ak *= 0.800000011920929D; this.al *= 0.800000011920929D; this.am *= 0.800000011920929D; this.al -= 0.02D; if (this.at && b(this.ak, this.al + 0.6000000238418579D - this.ai + d, this.am)) this.al = 0.30000001192092896D;  } else if (E()) { double d = this.ai; a(paramFloat1, paramFloat2, 0.02F); c(this.ak, this.al, this.am); this.ak *= 0.5D; this.al *= 0.5D; this.am *= 0.5D; this.al -= 0.02D; if (this.at && b(this.ak, this.al + 0.6000000238418579D - this.ai + d, this.am)) this.al = 0.30000001192092896D;  } else { float f1 = 0.91F; if (this.as) { f1 = 0.54600006F; int i = this.ad.a(ei.b(this.ah), ei.b(this.ar.b) - 1, ei.b(this.aj)); if (i > 0) f1 = (ln.n[i]).bm * 0.91F;  }  float f2 = 0.16277136F / f1 * f1 * f1; a(paramFloat1, paramFloat2, this.as ? (0.1F * f2) : 0.02F); f1 = 0.91F; if (this.as) { f1 = 0.54600006F; int i = this.ad.a(ei.b(this.ah), ei.b(this.ar.b) - 1, ei.b(this.aj)); if (i > 0) f1 = (ln.n[i]).bm * 0.91F;  }  if (y()) { this.aE = 0.0F; if (this.al < -0.15D) this.al = -0.15D;  }  c(this.ak, this.al, this.am); if (this.at && y()) this.al = 0.2D;  this.al -= 0.08D; this.al *= 0.9800000190734863D; this.ak *= f1; this.am *= f1; }  this.P = this.Q; double d1 = this.ah - this.ae; double d2 = this.aj - this.ag; float f = ei.a(d1 * d1 + d2 * d2) * 4.0F; if (f > 1.0F) f = 1.0F;  this.Q += (f - this.Q) * 0.4F; this.R += this.Q; } public boolean y() { int i = ei.b(this.ah); int j = ei.b(this.ar.b); int k = ei.b(this.aj); return (this.ad.a(i, j, k) == ln.aF.ba || this.ad.a(i, j + 1, k) == ln.aF.ba); } public void a(hc paramhc) { paramhc.a("Health", (short)this.D); paramhc.a("HurtTime", (short)this.F); paramhc.a("DeathTime", (short)this.I); paramhc.a("AttackTime", (short)this.J); } public void b(hc paramhc) { this.D = paramhc.d("Health"); if (!paramhc.b("Health")) this.D = 10;  this.F = paramhc.d("HurtTime"); this.I = paramhc.d("DeathTime"); this.J = paramhc.d("AttackTime"); } public boolean z() { return (!this.ax && this.D > 0); } public void i() { if (this.D <= 0) { this.W = false; this.T = 0.0F; this.U = 0.0F; this.V = 0.0F; } else { b_(); }  boolean bool1 = g_(); boolean bool2 = E(); if (this.W) if (bool1) { this.al += 0.03999999910593033D; } else if (bool2) { this.al += 0.03999999910593033D; } else if (this.as) { A(); }   this.T *= 0.98F; this.U *= 0.98F; this.V *= 0.9F; b(this.T, this.U); List<jx> list = this.ad.b(this, this.ar.b(0.20000000298023224D, 0.0D, 0.20000000298023224D)); if (list != null && list.size() > 0) for (byte b = 0; b < list.size(); b++) { jx jx1 = list.get(b); if (jx1.d_()) jx1.f(this);  }   } protected void A() { this.al = 0.41999998688697815D; } public void b(jx paramjx, float paramFloat) { double d2, d1 = paramjx.ah - this.ah;
/*     */     
/* 589 */     double d3 = paramjx.aj - this.aj;
/*     */     
/* 591 */     if (paramjx instanceof fv) {
/* 592 */       fv fv1 = (fv)paramjx;
/* 593 */       d2 = fv1.ai + fv1.q() - this.ai + q();
/*     */     } else {
/* 595 */       d2 = (paramjx.ar.b + paramjx.ar.e) / 2.0D - this.ai + q();
/*     */     } 
/*     */     
/* 598 */     double d4 = ei.a(d1 * d1 + d3 * d3);
/*     */     
/* 600 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 601 */     float f2 = (float)(Math.atan2(d2, d4) * 180.0D / 3.1415927410125732D);
/* 602 */     this.ao = b(this.ao, f2, paramFloat);
/* 603 */     this.an = b(this.an, f1, paramFloat); }
/*     */ 
/*     */   
/*     */   private float b(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 607 */     float f = paramFloat2 - paramFloat1;
/* 608 */     while (f < -180.0F)
/* 609 */       f += 360.0F; 
/* 610 */     while (f >= 180.0F)
/* 611 */       f -= 360.0F; 
/* 612 */     if (f > paramFloat3) {
/* 613 */       f = paramFloat3;
/*     */     }
/* 615 */     if (f < -paramFloat3) {
/* 616 */       f = -paramFloat3;
/*     */     }
/* 618 */     return paramFloat1 + f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void B() {}
/*     */   
/*     */   public boolean a() {
/* 625 */     return (this.ad.a(this.ar) && this.ad.a(this, this.ar).size() == 0 && !this.ad.b(this.ar));
/*     */   }
/*     */   
/*     */   protected void C() {
/* 629 */     a((jx)null, 4);
/*     */   }
/*     */   
/*     */   public float d(float paramFloat) {
/* 633 */     float f = this.C - this.B;
/* 634 */     if (f < 0.0F) f++; 
/* 635 */     return this.B + f * paramFloat;
/*     */   }
/*     */ 
/*     */   
/*     */   public ah e(float paramFloat) {
/* 640 */     if (paramFloat == 1.0F) {
/* 641 */       return ah.b(this.ah, this.ai, this.aj);
/*     */     }
/* 643 */     double d1 = this.ae + (this.ah - this.ae) * paramFloat;
/* 644 */     double d2 = this.af + (this.ai - this.af) * paramFloat;
/* 645 */     double d3 = this.ag + (this.aj - this.ag) * paramFloat;
/*     */     
/* 647 */     return ah.b(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public ah f(float paramFloat) {
/* 651 */     if (paramFloat == 1.0F) {
/* 652 */       float f7 = ei.b(-this.an * 0.017453292F - 3.1415927F);
/* 653 */       float f8 = ei.a(-this.an * 0.017453292F - 3.1415927F);
/* 654 */       float f9 = -ei.b(-this.ao * 0.017453292F);
/* 655 */       float f10 = ei.a(-this.ao * 0.017453292F);
/*     */       
/* 657 */       return ah.b((f8 * f9), f10, (f7 * f9));
/*     */     } 
/* 659 */     float f1 = this.aq + (this.ao - this.aq) * paramFloat;
/* 660 */     float f2 = this.ap + (this.an - this.ap) * paramFloat;
/*     */     
/* 662 */     float f3 = ei.b(-f2 * 0.017453292F - 3.1415927F);
/* 663 */     float f4 = ei.a(-f2 * 0.017453292F - 3.1415927F);
/* 664 */     float f5 = -ei.b(-f1 * 0.017453292F);
/* 665 */     float f6 = ei.a(-f1 * 0.017453292F);
/*     */     
/* 667 */     return ah.b((f4 * f5), f6, (f3 * f5));
/*     */   }
/*     */   
/*     */   public lv a(double paramDouble, float paramFloat) {
/* 671 */     ah ah1 = e(paramFloat);
/* 672 */     ah ah2 = f(paramFloat);
/* 673 */     ah ah3 = ah1.c(ah2.a * paramDouble, ah2.b * paramDouble, ah2.c * paramDouble);
/* 674 */     return this.ad.a(ah1, ah3);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */