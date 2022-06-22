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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dg
/*     */   extends fv
/*     */ {
/*  24 */   public en b = new en(this);
/*  25 */   public byte c = 0;
/*  26 */   public int d = 0; public float e;
/*     */   public float f;
/*     */   public boolean g = false;
/*  29 */   public int h = 0;
/*     */   public String i;
/*     */   private int a;
/*     */   public void n() { super.n(); this.e = this.f; this.f = 0.0F; }
/*     */   public void o() { this.ay = 1.62F; a(0.6F, 1.8F); super.o(); this.D = 20; this.I = 0; }
/*  34 */   protected void b_() { if (this.g) { this.h++; if (this.h == 8) { this.h = 0; this.g = false; }  } else { this.h = 0; }  this.C = this.h / 8.0F; } public void i() { if (this.ad.k == 0 && this.D < 20 && this.aO % 20 * 4 == 0) b(1);  this.b.f(); this.e = this.f; super.i(); float f1 = ei.a(this.ak * this.ak + this.am * this.am); float f2 = (float)Math.atan(-this.al * 0.20000000298023224D) * 15.0F; if (f1 > 0.1F) f1 = 0.1F;  if (!this.as || this.D <= 0) f1 = 0.0F;  if (this.as || this.D <= 0) f2 = 0.0F;  this.f += (f1 - this.f) * 0.4F; this.L += (f2 - this.L) * 0.8F; if (this.D > 0) { List<jx> list = this.ad.b(this, this.ar.b(1.0D, 0.0D, 1.0D)); if (list != null) for (byte b = 0; b < list.size(); b++) h(list.get(b));   }  } private void h(jx paramjx) { paramjx.b(this); } public dg(cj paramcj) { super(paramcj);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     this.a = 0; this.ay = 1.62F; c(paramcj.n + 0.5D, (paramcj.o + 1), paramcj.p + 0.5D, 0.0F, 0.0F); this.D = 20; this.x = "humanoid"; this.w = 180.0F; this.aP = 20; this.u = "/char.png"; }
/*     */   public int p() { return this.d; }
/*     */   public void b(jx paramjx) { a(0.2F, 0.2F); a(this.ah, this.ai, this.aj); this.al = 0.10000000149011612D; if (this.i.equals("Notch")) a(new eo(dd.h, 1), true);  this.b.h(); if (paramjx != null) { this.ak = (-ei.b((this.H + this.an) * 3.1415927F / 180.0F) * 0.1F); this.am = (-ei.a((this.H + this.an) * 3.1415927F / 180.0F) * 0.1F); } else { this.ak = this.am = 0.0D; }  this.ay = 0.1F; }
/* 222 */   public void b(jx paramjx, int paramInt) { this.d += paramInt; } public void a(eo parameo) { a(parameo, false); } public boolean a(jx paramjx, int paramInt) { this.S = 0;
/* 223 */     if (this.D <= 0) return false;
/*     */     
/* 225 */     if (this.aT > this.j / 2.0F) return false;
/*     */     
/* 227 */     if (paramjx instanceof dk || paramjx instanceof jw) {
/* 228 */       if (this.ad.k == 0) paramInt = 0; 
/* 229 */       if (this.ad.k == 1) paramInt = paramInt / 3 + 1; 
/* 230 */       if (this.ad.k == 3) paramInt = paramInt * 3 / 2;
/*     */     
/*     */     } 
/* 233 */     int i = 25 - this.b.g();
/* 234 */     int j = paramInt * i + this.a;
/* 235 */     this.b.e(paramInt);
/* 236 */     paramInt = j / 25;
/* 237 */     this.a = j % 25;
/*     */     
/* 239 */     if (paramInt == 0) return false;
/*     */     
/* 241 */     return super.a(paramjx, paramInt); } public void a(eo parameo, boolean paramBoolean) { if (parameo == null)
/*     */       return;  dr dr = new dr(this.ad, this.ah, this.ai - 0.30000001192092896D + q(), this.aj, parameo); dr.c = 40; float f = 0.1F; if (paramBoolean) { float f1 = this.aN.nextFloat() * 0.5F; float f2 = this.aN.nextFloat() * 3.1415927F * 2.0F; dr.ak = (-ei.a(f2) * f1); dr.am = (ei.b(f2) * f1); dr.al = 0.20000000298023224D; }
/*     */     else
/*     */     { f = 0.3F; dr.ak = (-ei.a(this.an / 180.0F * 3.1415927F) * ei.b(this.ao / 180.0F * 3.1415927F) * f); dr.am = (ei.b(this.an / 180.0F * 3.1415927F) * ei.b(this.ao / 180.0F * 3.1415927F) * f); dr.al = (-ei.a(this.ao / 180.0F * 3.1415927F) * f + 0.1F); f = 0.02F; float f1 = this.aN.nextFloat() * 3.1415927F * 2.0F; f *= this.aN.nextFloat(); dr.ak += Math.cos(f1) * f; dr.al += ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.1F); dr.am += Math.sin(f1) * f; }
/*     */      a(dr); } protected void a(dr paramdr) { this.ad.a(paramdr); } public float a(ln paramln) { float f = this.b.a(paramln); if (a(fs.f))
/*     */       f /= 5.0F;  if (!this.as)
/*     */       f /= 5.0F;  return f; } public boolean b(ln paramln) { return this.b.b(paramln); } public void b(hc paramhc) { super.b(paramhc); } public void a(hc paramhc) { super.a(paramhc); } public void a(fy paramfy) {}
/*     */   public void k() {}
/*     */   public void a_(jx paramjx, int paramInt) {}
/*     */   protected float q() { return 0.12F; }
/*     */   public void a(ju paramju) {}
/*     */   public void a(nn paramnn) {}
/*     */   public void a_(jx paramjx) {}
/* 254 */   public eo r() { return this.b.e(); }
/*     */ 
/*     */   
/*     */   public void s() {
/* 258 */     this.b.a(this.b.d, (eo)null);
/*     */   }
/*     */   
/*     */   public double t() {
/* 262 */     return (this.ay - 0.5F);
/*     */   }
/*     */   
/*     */   public void u() {
/* 266 */     this.h = -1;
/* 267 */     this.g = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */