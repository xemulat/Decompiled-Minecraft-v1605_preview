/*     */ import net.minecraft.client.Minecraft;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class mw
/*     */   extends hg
/*     */ {
/*  12 */   private int c = -1;
/*  13 */   private int d = -1;
/*  14 */   private int e = -1;
/*  15 */   private float f = 0.0F;
/*  16 */   private float g = 0.0F;
/*  17 */   private float h = 0.0F;
/*  18 */   private int i = 0;
/*     */   private boolean j = false;
/*     */   private go k;
/*     */   private int l;
/*     */   
/*     */   public mw(Minecraft paramMinecraft, go paramgo) {
/*  24 */     super(paramMinecraft);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     this.l = 0; this.k = paramgo;
/*     */   }
/*     */   public void a(dg paramdg) { paramdg.an = -180.0F; }
/* 140 */   public void a() {} public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.k.a(new ey(3, paramInt1, paramInt2, paramInt3, paramInt4)); int i = this.a.e.a(paramInt1, paramInt2, paramInt3); int j = this.a.e.e(paramInt1, paramInt2, paramInt3); boolean bool = super.b(paramInt1, paramInt2, paramInt3, paramInt4); eo eo = this.a.g.r(); if (eo != null) { eo.a(i, paramInt1, paramInt2, paramInt3); if (eo.a == 0) { eo.a(this.a.g); this.a.g.s(); }  }  if (bool && this.a.g.b(ln.n[i])) ln.n[i].b_(this.a.e, paramInt1, paramInt2, paramInt3, j);  return bool; } public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.j = true; this.k.a(new ey(0, paramInt1, paramInt2, paramInt3, paramInt4)); int i = this.a.e.a(paramInt1, paramInt2, paramInt3); if (i > 0 && this.f == 0.0F) ln.n[i].b(this.a.e, paramInt1, paramInt2, paramInt3, this.a.g);  if (i > 0 && ln.n[i].a(this.a.g) >= 1.0F) b(paramInt1, paramInt2, paramInt3, paramInt4);  } public void b() { if (!this.j) return;  this.j = false; this.k.a(new ey(2, 0, 0, 0, 0)); this.f = 0.0F; this.i = 0; } private void f() { eo eo = this.a.g.b.e();
/* 141 */     int i = 0;
/* 142 */     if (eo != null) i = eo.c; 
/* 143 */     if (i != this.l)
/* 144 */     { this.l = i;
/* 145 */       this.k.a(new dt(0, this.l)); }  }
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.j = true; f(); this.k.a(new ey(1, paramInt1, paramInt2, paramInt3, paramInt4)); if (this.i > 0) { this.i--; return; }  if (paramInt1 == this.c && paramInt2 == this.d && paramInt3 == this.e) { int i = this.a.e.a(paramInt1, paramInt2, paramInt3); if (i == 0) return;  ln ln = ln.n[i]; this.f += ln.a(this.a.g); if (this.h % 4.0F == 0.0F && ln != null) this.a.A.b(ln.bj.d(), paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, (ln.bj.b() + 1.0F) / 8.0F, ln.bj.c() * 0.5F);  this.h++; if (this.f >= 1.0F) { b(paramInt1, paramInt2, paramInt3, paramInt4); this.f = 0.0F; this.g = 0.0F; this.h = 0.0F; this.i = 5; }  } else { this.f = 0.0F; this.g = 0.0F; this.h = 0.0F; this.c = paramInt1; this.d = paramInt2; this.e = paramInt3; }  }
/*     */   public void a(float paramFloat) { if (this.f <= 0.0F) { this.a.u.b = 0.0F; this.a.f.i = 0.0F; } else { float f = this.g + (this.f - this.g) * paramFloat; this.a.u.b = f; this.a.f.i = f; }  }
/*     */   public float c() { return 4.0F; }
/*     */   public void a(cj paramcj) { super.a(paramcj); }
/* 150 */   public void d() { f(); this.g = this.f; } public boolean a(dg paramdg, cj paramcj, eo parameo, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { f();
/* 151 */     this.k.a(new di(parameo.c, paramInt1, paramInt2, paramInt3, paramInt4));
/* 152 */     return super.a(paramdg, paramcj, parameo, paramInt1, paramInt2, paramInt3, paramInt4); }
/*     */ 
/*     */ 
/*     */   
/*     */   public dg b(cj paramcj) {
/* 157 */     return new kp(this.a, paramcj, this.a.i, this.k);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */