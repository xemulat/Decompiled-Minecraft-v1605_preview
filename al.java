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
/*     */ public class al
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
/*     */   public al(cj paramcj) {
/*  27 */     super(paramcj);
/*  28 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble) {
/*  32 */     double d = this.ar.b() * 4.0D;
/*  33 */     d *= 64.0D;
/*  34 */     return (paramDouble < d * d);
/*     */   }
/*     */ 
/*     */   
/*     */   public al(cj paramcj, fv paramfv) {
/*  39 */     super(paramcj);
/*  40 */     this.g = paramfv;
/*     */     
/*  42 */     a(0.25F, 0.25F);
/*     */     
/*  44 */     c(paramfv.ah, paramfv.ai, paramfv.aj, paramfv.an, paramfv.ao);
/*     */ 
/*     */     
/*  47 */     this.ah -= (ei.b(this.an / 180.0F * 3.1415927F) * 0.16F);
/*  48 */     this.ai -= 0.10000000149011612D;
/*  49 */     this.aj -= (ei.a(this.an / 180.0F * 3.1415927F) * 0.16F);
/*  50 */     a(this.ah, this.ai, this.aj);
/*  51 */     this.ay = 0.0F;
/*     */ 
/*     */     
/*  54 */     float f = 0.4F;
/*  55 */     this.ak = (-ei.a(this.an / 180.0F * 3.1415927F) * ei.b(this.ao / 180.0F * 3.1415927F) * f);
/*  56 */     this.am = (ei.b(this.an / 180.0F * 3.1415927F) * ei.b(this.ao / 180.0F * 3.1415927F) * f);
/*  57 */     this.al = (-ei.a(this.ao / 180.0F * 3.1415927F) * f);
/*     */     
/*  59 */     a(this.ak, this.al, this.am, 1.5F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  63 */     float f1 = ei.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/*  65 */     paramDouble1 /= f1;
/*  66 */     paramDouble2 /= f1;
/*  67 */     paramDouble3 /= f1;
/*     */     
/*  69 */     paramDouble1 += this.aN.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  70 */     paramDouble2 += this.aN.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  71 */     paramDouble3 += this.aN.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*     */     
/*  73 */     paramDouble1 *= paramFloat1;
/*  74 */     paramDouble2 *= paramFloat1;
/*  75 */     paramDouble3 *= paramFloat1;
/*     */     
/*  77 */     this.ak = paramDouble1;
/*  78 */     this.al = paramDouble2;
/*  79 */     this.am = paramDouble3;
/*     */     
/*  81 */     float f2 = ei.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/*  83 */     this.ap = this.an = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D);
/*  84 */     this.aq = this.ao = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D);
/*  85 */     this.h = 0;
/*     */   }
/*     */   
/*     */   public void e_() {
/*  89 */     super.e_();
/*     */     
/*  91 */     if (this.a > 0) this.a--;
/*     */     
/*  93 */     if (this.f) {
/*     */ 
/*     */ 
/*     */       
/*  97 */       int i = this.ad.a(this.b, this.c, this.d);
/*  98 */       if (i != this.e) {
/*  99 */         this.f = false;
/*     */         
/* 101 */         this.ak *= (this.aN.nextFloat() * 0.2F);
/* 102 */         this.al *= (this.aN.nextFloat() * 0.2F);
/* 103 */         this.am *= (this.aN.nextFloat() * 0.2F);
/* 104 */         this.h = 0;
/* 105 */         this.i = 0;
/*     */       } else {
/* 107 */         this.h++;
/* 108 */         if (this.h == 1200) D(); 
/*     */         return;
/*     */       } 
/*     */     } else {
/* 112 */       this.i++;
/*     */     } 
/*     */     
/* 115 */     ah ah1 = ah.b(this.ah, this.ai, this.aj);
/* 116 */     ah ah2 = ah.b(this.ah + this.ak, this.ai + this.al, this.aj + this.am);
/* 117 */     lv lv = this.ad.a(ah1, ah2);
/*     */     
/* 119 */     ah1 = ah.b(this.ah, this.ai, this.aj);
/* 120 */     ah2 = ah.b(this.ah + this.ak, this.ai + this.al, this.aj + this.am);
/* 121 */     if (lv != null) {
/* 122 */       ah2 = ah.b(lv.f.a, lv.f.b, lv.f.c);
/*     */     }
/* 124 */     jx jx1 = null;
/* 125 */     List<jx> list = this.ad.b(this, this.ar.a(this.ak, this.al, this.am).b(1.0D, 1.0D, 1.0D));
/* 126 */     double d = 0.0D; byte b;
/* 127 */     for (b = 0; b < list.size(); b++) {
/* 128 */       jx jx2 = list.get(b);
/* 129 */       if (jx2.c_() && (jx2 != this.g || this.i >= 5)) {
/*     */         
/* 131 */         float f = 0.3F;
/* 132 */         cb cb = jx2.ar.b(f, f, f);
/* 133 */         lv lv1 = cb.a(ah1, ah2);
/* 134 */         if (lv1 != null) {
/* 135 */           double d1 = ah1.c(lv1.f);
/* 136 */           if (d1 < d || d == 0.0D) {
/* 137 */             jx1 = jx2;
/* 138 */             d = d1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 143 */     if (jx1 != null) {
/* 144 */       lv = new lv(jx1);
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
/* 163 */     if (lv != null) {
/* 164 */       if (lv.g == null || 
/* 165 */         lv.g.a(this.g, 0));
/*     */ 
/*     */ 
/*     */       
/* 169 */       for (b = 0; b < 8; b++)
/* 170 */         this.ad.a("snowballpoof", this.ah, this.ai, this.aj, 0.0D, 0.0D, 0.0D); 
/* 171 */       D();
/*     */     } 
/* 173 */     this.ah += this.ak;
/* 174 */     this.ai += this.al;
/* 175 */     this.aj += this.am;
/*     */     
/* 177 */     float f1 = ei.a(this.ak * this.ak + this.am * this.am);
/* 178 */     this.an = (float)(Math.atan2(this.ak, this.am) * 180.0D / 3.1415927410125732D);
/* 179 */     this.ao = (float)(Math.atan2(this.al, f1) * 180.0D / 3.1415927410125732D);
/*     */     
/* 181 */     while (this.ao - this.aq < -180.0F)
/* 182 */       this.aq -= 360.0F; 
/* 183 */     while (this.ao - this.aq >= 180.0F) {
/* 184 */       this.aq += 360.0F;
/*     */     }
/* 186 */     while (this.an - this.ap < -180.0F)
/* 187 */       this.ap -= 360.0F; 
/* 188 */     while (this.an - this.ap >= 180.0F) {
/* 189 */       this.ap += 360.0F;
/*     */     }
/* 191 */     this.ao = this.aq + (this.ao - this.aq) * 0.2F;
/* 192 */     this.an = this.ap + (this.an - this.ap) * 0.2F;
/*     */ 
/*     */     
/* 195 */     float f2 = 0.99F;
/* 196 */     float f3 = 0.03F;
/*     */     
/* 198 */     if (g_()) {
/* 199 */       for (byte b1 = 0; b1 < 4; b1++) {
/* 200 */         float f = 0.25F;
/* 201 */         this.ad.a("bubble", this.ah - this.ak * f, this.ai - this.al * f, this.aj - this.am * f, this.ak, this.al, this.am);
/*     */       } 
/* 203 */       f2 = 0.8F;
/*     */     } 
/*     */     
/* 206 */     this.ak *= f2;
/* 207 */     this.al *= f2;
/* 208 */     this.am *= f2;
/* 209 */     this.al -= f3;
/*     */     
/* 211 */     a(this.ah, this.ai, this.aj);
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/* 215 */     paramhc.a("xTile", (short)this.b);
/* 216 */     paramhc.a("yTile", (short)this.c);
/* 217 */     paramhc.a("zTile", (short)this.d);
/* 218 */     paramhc.a("inTile", (byte)this.e);
/* 219 */     paramhc.a("shake", (byte)this.a);
/* 220 */     paramhc.a("inGround", (byte)(this.f ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/* 224 */     this.b = paramhc.d("xTile");
/* 225 */     this.c = paramhc.d("yTile");
/* 226 */     this.d = paramhc.d("zTile");
/* 227 */     this.e = paramhc.c("inTile") & 0xFF;
/* 228 */     this.a = paramhc.c("shake") & 0xFF;
/* 229 */     this.f = (paramhc.c("inGround") == 1);
/*     */   }
/*     */   
/*     */   public void b(dg paramdg) {
/* 233 */     if (this.f && this.g == paramdg && this.a <= 0 && 
/* 234 */       paramdg.b.a(new eo(dd.j.aQ, 1))) {
/* 235 */       this.ad.a(this, "random.pop", 0.2F, ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 236 */       paramdg.a_(this, 1);
/* 237 */       D();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float h_() {
/* 243 */     return 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\al.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */