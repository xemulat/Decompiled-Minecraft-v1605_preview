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
/*     */ public class jw
/*     */   extends jx
/*     */ {
/*  16 */   private int b = -1;
/*  17 */   private int c = -1;
/*  18 */   private int d = -1;
/*  19 */   private int e = 0;
/*     */   private boolean f = false;
/*  21 */   public int a = 0;
/*     */   private fv g;
/*     */   private int h;
/*  24 */   private int i = 0;
/*     */   
/*     */   public jw(cj paramcj) {
/*  27 */     super(paramcj);
/*  28 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public jw(cj paramcj, fv paramfv) {
/*  32 */     super(paramcj);
/*  33 */     this.g = paramfv;
/*     */     
/*  35 */     a(0.5F, 0.5F);
/*     */     
/*  37 */     c(paramfv.ah, paramfv.ai, paramfv.aj, paramfv.an, paramfv.ao);
/*     */ 
/*     */     
/*  40 */     this.ah -= (ei.b(this.an / 180.0F * 3.1415927F) * 0.16F);
/*  41 */     this.ai -= 0.10000000149011612D;
/*  42 */     this.aj -= (ei.a(this.an / 180.0F * 3.1415927F) * 0.16F);
/*  43 */     a(this.ah, this.ai, this.aj);
/*  44 */     this.ay = 0.0F;
/*     */ 
/*     */     
/*  47 */     this.ak = (-ei.a(this.an / 180.0F * 3.1415927F) * ei.b(this.ao / 180.0F * 3.1415927F));
/*  48 */     this.am = (ei.b(this.an / 180.0F * 3.1415927F) * ei.b(this.ao / 180.0F * 3.1415927F));
/*  49 */     this.al = -ei.a(this.ao / 180.0F * 3.1415927F);
/*     */     
/*  51 */     a(this.ak, this.al, this.am, 1.5F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  55 */     float f1 = ei.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/*  57 */     paramDouble1 /= f1;
/*  58 */     paramDouble2 /= f1;
/*  59 */     paramDouble3 /= f1;
/*     */     
/*  61 */     paramDouble1 += this.aN.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  62 */     paramDouble2 += this.aN.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  63 */     paramDouble3 += this.aN.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*     */     
/*  65 */     paramDouble1 *= paramFloat1;
/*  66 */     paramDouble2 *= paramFloat1;
/*  67 */     paramDouble3 *= paramFloat1;
/*     */     
/*  69 */     this.ak = paramDouble1;
/*  70 */     this.al = paramDouble2;
/*  71 */     this.am = paramDouble3;
/*     */     
/*  73 */     float f2 = ei.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/*  75 */     this.ap = this.an = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D);
/*  76 */     this.aq = this.ao = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D);
/*  77 */     this.h = 0;
/*     */   }
/*     */   
/*     */   public void e_() {
/*  81 */     super.e_();
/*     */     
/*  83 */     if (this.a > 0) this.a--;
/*     */     
/*  85 */     if (this.f) {
/*     */ 
/*     */ 
/*     */       
/*  89 */       int i = this.ad.a(this.b, this.c, this.d);
/*  90 */       if (i != this.e) {
/*  91 */         this.f = false;
/*     */         
/*  93 */         this.ak *= (this.aN.nextFloat() * 0.2F);
/*  94 */         this.al *= (this.aN.nextFloat() * 0.2F);
/*  95 */         this.am *= (this.aN.nextFloat() * 0.2F);
/*  96 */         this.h = 0;
/*  97 */         this.i = 0;
/*     */       } else {
/*  99 */         this.h++;
/* 100 */         if (this.h == 1200) D(); 
/*     */         return;
/*     */       } 
/*     */     } else {
/* 104 */       this.i++;
/*     */     } 
/*     */     
/* 107 */     ah ah1 = ah.b(this.ah, this.ai, this.aj);
/* 108 */     ah ah2 = ah.b(this.ah + this.ak, this.ai + this.al, this.aj + this.am);
/* 109 */     lv lv = this.ad.a(ah1, ah2);
/*     */     
/* 111 */     ah1 = ah.b(this.ah, this.ai, this.aj);
/* 112 */     ah2 = ah.b(this.ah + this.ak, this.ai + this.al, this.aj + this.am);
/* 113 */     if (lv != null) {
/* 114 */       ah2 = ah.b(lv.f.a, lv.f.b, lv.f.c);
/*     */     }
/* 116 */     jx jx1 = null;
/* 117 */     List<jx> list = this.ad.b(this, this.ar.a(this.ak, this.al, this.am).b(1.0D, 1.0D, 1.0D));
/* 118 */     double d = 0.0D;
/* 119 */     for (byte b = 0; b < list.size(); b++) {
/* 120 */       jx jx2 = list.get(b);
/* 121 */       if (jx2.c_() && (jx2 != this.g || this.i >= 5)) {
/*     */         
/* 123 */         float f = 0.3F;
/* 124 */         cb cb = jx2.ar.b(f, f, f);
/* 125 */         lv lv1 = cb.a(ah1, ah2);
/* 126 */         if (lv1 != null) {
/* 127 */           double d1 = ah1.c(lv1.f);
/* 128 */           if (d1 < d || d == 0.0D) {
/* 129 */             jx1 = jx2;
/* 130 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 135 */     if (jx1 != null) {
/* 136 */       lv = new lv(jx1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     if (lv != null) {
/* 156 */       if (lv.g != null) {
/* 157 */         if (lv.g.a(this.g, 4)) {
/* 158 */           this.ad.a(this, "random.drr", 1.0F, 1.2F / (this.aN.nextFloat() * 0.2F + 0.9F));
/* 159 */           D();
/*     */         } else {
/* 161 */           this.ak *= -0.10000000149011612D;
/* 162 */           this.al *= -0.10000000149011612D;
/* 163 */           this.am *= -0.10000000149011612D;
/* 164 */           this.an += 180.0F;
/* 165 */           this.ap += 180.0F;
/* 166 */           this.i = 0;
/*     */         } 
/*     */       } else {
/*     */         
/* 170 */         this.b = lv.b;
/* 171 */         this.c = lv.c;
/* 172 */         this.d = lv.d;
/* 173 */         this.e = this.ad.a(this.b, this.c, this.d);
/* 174 */         this.ak = (float)(lv.f.a - this.ah);
/* 175 */         this.al = (float)(lv.f.b - this.ai);
/* 176 */         this.am = (float)(lv.f.c - this.aj);
/* 177 */         float f = ei.a(this.ak * this.ak + this.al * this.al + this.am * this.am);
/* 178 */         this.ah -= this.ak / f * 0.05000000074505806D;
/* 179 */         this.ai -= this.al / f * 0.05000000074505806D;
/* 180 */         this.aj -= this.am / f * 0.05000000074505806D;
/*     */         
/* 182 */         this.ad.a(this, "random.drr", 1.0F, 1.2F / (this.aN.nextFloat() * 0.2F + 0.9F));
/* 183 */         this.f = true;
/* 184 */         this.a = 7;
/*     */       } 
/*     */     }
/* 187 */     this.ah += this.ak;
/* 188 */     this.ai += this.al;
/* 189 */     this.aj += this.am;
/*     */     
/* 191 */     float f1 = ei.a(this.ak * this.ak + this.am * this.am);
/* 192 */     this.an = (float)(Math.atan2(this.ak, this.am) * 180.0D / 3.1415927410125732D);
/* 193 */     this.ao = (float)(Math.atan2(this.al, f1) * 180.0D / 3.1415927410125732D);
/*     */     
/* 195 */     while (this.ao - this.aq < -180.0F)
/* 196 */       this.aq -= 360.0F; 
/* 197 */     while (this.ao - this.aq >= 180.0F) {
/* 198 */       this.aq += 360.0F;
/*     */     }
/* 200 */     while (this.an - this.ap < -180.0F)
/* 201 */       this.ap -= 360.0F; 
/* 202 */     while (this.an - this.ap >= 180.0F) {
/* 203 */       this.ap += 360.0F;
/*     */     }
/* 205 */     this.ao = this.aq + (this.ao - this.aq) * 0.2F;
/* 206 */     this.an = this.ap + (this.an - this.ap) * 0.2F;
/*     */ 
/*     */     
/* 209 */     float f2 = 0.99F;
/* 210 */     float f3 = 0.03F;
/*     */     
/* 212 */     if (g_()) {
/* 213 */       for (byte b1 = 0; b1 < 4; b1++) {
/* 214 */         float f = 0.25F;
/* 215 */         this.ad.a("bubble", this.ah - this.ak * f, this.ai - this.al * f, this.aj - this.am * f, this.ak, this.al, this.am);
/*     */       } 
/* 217 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 220 */     this.ak *= f2;
/* 221 */     this.al *= f2;
/* 222 */     this.am *= f2;
/* 223 */     this.al -= f3;
/*     */     
/* 225 */     a(this.ah, this.ai, this.aj);
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/* 229 */     paramhc.a("xTile", (short)this.b);
/* 230 */     paramhc.a("yTile", (short)this.c);
/* 231 */     paramhc.a("zTile", (short)this.d);
/* 232 */     paramhc.a("inTile", (byte)this.e);
/* 233 */     paramhc.a("shake", (byte)this.a);
/* 234 */     paramhc.a("inGround", (byte)(this.f ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/* 238 */     this.b = paramhc.d("xTile");
/* 239 */     this.c = paramhc.d("yTile");
/* 240 */     this.d = paramhc.d("zTile");
/* 241 */     this.e = paramhc.c("inTile") & 0xFF;
/* 242 */     this.a = paramhc.c("shake") & 0xFF;
/* 243 */     this.f = (paramhc.c("inGround") == 1);
/*     */   }
/*     */   
/*     */   public void b(dg paramdg) {
/* 247 */     if (this.f && this.g == paramdg && this.a <= 0 && 
/* 248 */       paramdg.b.a(new eo(dd.j.aQ, 1))) {
/* 249 */       this.ad.a(this, "random.pop", 0.2F, ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 250 */       paramdg.a_(this, 1);
/* 251 */       D();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float h_() {
/* 257 */     return 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */