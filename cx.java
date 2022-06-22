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
/*     */ public class cx
/*     */   extends jx
/*     */ {
/*  18 */   public int a = 0;
/*  19 */   public int b = 0;
/*  20 */   public int c = 1;
/*     */   
/*     */   public cx(cj paramcj) {
/*  23 */     super(paramcj);
/*  24 */     this.aa = true;
/*  25 */     a(1.5F, 0.6F);
/*  26 */     this.ay = this.aA / 2.0F;
/*  27 */     this.aD = false;
/*     */   }
/*     */   
/*     */   public cb b_(jx paramjx) {
/*  31 */     return paramjx.ar;
/*     */   }
/*     */   
/*     */   public cb f_() {
/*  35 */     return this.ar;
/*     */   }
/*     */   
/*     */   public boolean d_() {
/*  39 */     return true;
/*     */   }
/*     */   
/*     */   public cx(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  43 */     this(paramcj);
/*  44 */     a(paramDouble1, paramDouble2 + this.ay, paramDouble3);
/*     */     
/*  46 */     this.ak = 0.0D;
/*  47 */     this.al = 0.0D;
/*  48 */     this.am = 0.0D;
/*     */     
/*  50 */     this.ae = paramDouble1;
/*  51 */     this.af = paramDouble2;
/*  52 */     this.ag = paramDouble3;
/*     */   }
/*     */   
/*     */   public double j_() {
/*  56 */     return this.aA * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean a(jx paramjx, int paramInt) {
/*  60 */     this.c = -this.c;
/*  61 */     this.b = 10;
/*  62 */     this.a += paramInt * 10;
/*  63 */     if (this.a > 40) {
/*  64 */       byte b; for (b = 0; b < 3; b++) {
/*  65 */         a(ln.x.ba, 1, 0.0F);
/*     */       }
/*  67 */       for (b = 0; b < 2; b++) {
/*  68 */         a(dd.B.aQ, 1, 0.0F);
/*     */       }
/*  70 */       D();
/*     */     } 
/*  72 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/*  76 */     return !this.ax;
/*     */   }
/*     */   
/*     */   public void e_() {
/*  80 */     super.e_();
/*  81 */     if (this.b > 0) this.b--; 
/*  82 */     if (this.a > 0) this.a--; 
/*  83 */     this.ae = this.ah;
/*  84 */     this.af = this.ai;
/*  85 */     this.ag = this.aj;
/*     */ 
/*     */     
/*  88 */     byte b1 = 5;
/*  89 */     double d1 = 0.0D;
/*  90 */     for (byte b2 = 0; b2 < b1; b2++) {
/*  91 */       double d9 = this.ar.b + (this.ar.e - this.ar.b) * (b2 + 0) / b1 - 0.125D;
/*  92 */       double d10 = this.ar.b + (this.ar.e - this.ar.b) * (b2 + 1) / b1 - 0.125D;
/*  93 */       cb cb = cb.b(this.ar.a, d9, this.ar.c, this.ar.d, d10, this.ar.f);
/*  94 */       if (this.ad.b(cb, fs.f)) {
/*  95 */         d1 += 1.0D / b1;
/*     */       }
/*     */     } 
/*     */     
/*  99 */     double d2 = d1 * 2.0D - 1.0D;
/* 100 */     this.al += 0.03999999910593033D * d2;
/*     */     
/* 102 */     if (this.ab != null) {
/* 103 */       this.ak += this.ab.ak * 0.2D;
/* 104 */       this.am += this.ab.am * 0.2D;
/*     */     } 
/*     */     
/* 107 */     double d3 = 0.4D;
/*     */     
/* 109 */     if (this.ak < -d3) this.ak = -d3; 
/* 110 */     if (this.ak > d3) this.ak = d3; 
/* 111 */     if (this.am < -d3) this.am = -d3; 
/* 112 */     if (this.am > d3) this.am = d3; 
/* 113 */     if (this.as) {
/* 114 */       this.ak *= 0.5D;
/* 115 */       this.al *= 0.5D;
/* 116 */       this.am *= 0.5D;
/*     */     } 
/* 118 */     c(this.ak, this.al, this.am);
/* 119 */     double d4 = Math.sqrt(this.ak * this.ak + this.am * this.am);
/* 120 */     if (d4 > 0.15D) {
/* 121 */       double d9 = Math.cos(this.an * Math.PI / 180.0D);
/* 122 */       double d10 = Math.sin(this.an * Math.PI / 180.0D);
/*     */       
/* 124 */       for (byte b = 0; b < 1.0D + d4 * 60.0D; b++) {
/*     */         
/* 126 */         double d11 = (this.aN.nextFloat() * 2.0F - 1.0F);
/*     */         
/* 128 */         double d12 = (this.aN.nextInt(2) * 2 - 1) * 0.7D;
/* 129 */         if (this.aN.nextBoolean()) {
/* 130 */           double d13 = this.ah - d9 * d11 * 0.8D + d10 * d12;
/* 131 */           double d14 = this.aj - d10 * d11 * 0.8D - d9 * d12;
/* 132 */           this.ad.a("splash", d13, this.ai - 0.125D, d14, this.ak, this.al, this.am);
/*     */         } else {
/* 134 */           double d13 = this.ah + d9 + d10 * d11 * 0.7D;
/* 135 */           double d14 = this.aj + d10 - d9 * d11 * 0.7D;
/* 136 */           this.ad.a("splash", d13, this.ai - 0.125D, d14, this.ak, this.al, this.am);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 141 */     if (this.at && d4 > 0.15D) {
/* 142 */       D(); byte b;
/* 143 */       for (b = 0; b < 3; b++) {
/* 144 */         a(ln.x.ba, 1, 0.0F);
/*     */       }
/* 146 */       for (b = 0; b < 2; b++) {
/* 147 */         a(dd.B.aQ, 1, 0.0F);
/*     */       }
/*     */     } else {
/* 150 */       this.ak *= 0.9900000095367432D;
/* 151 */       this.al *= 0.949999988079071D;
/* 152 */       this.am *= 0.9900000095367432D;
/*     */     } 
/*     */     
/* 155 */     this.ao = 0.0F;
/* 156 */     double d5 = this.an;
/* 157 */     double d6 = this.ae - this.ah;
/* 158 */     double d7 = this.ag - this.aj;
/* 159 */     if (d6 * d6 + d7 * d7 > 0.001D) {
/* 160 */       d5 = (float)(Math.atan2(d7, d6) * 180.0D / Math.PI);
/*     */     }
/*     */     
/* 163 */     double d8 = d5 - this.an;
/* 164 */     while (d8 >= 180.0D)
/* 165 */       d8 -= 360.0D; 
/* 166 */     while (d8 < -180.0D) {
/* 167 */       d8 += 360.0D;
/*     */     }
/* 169 */     if (d8 > 20.0D) d8 = 20.0D; 
/* 170 */     if (d8 < -20.0D) d8 = -20.0D;
/*     */     
/* 172 */     this.an = (float)(this.an + d8);
/* 173 */     c(this.an, this.ao);
/*     */     
/* 175 */     List<jx> list = this.ad.b(this, this.ar.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 176 */     if (list != null && list.size() > 0) {
/* 177 */       for (byte b = 0; b < list.size(); b++) {
/* 178 */         jx jx1 = list.get(b);
/* 179 */         if (jx1 != this.ab && jx1.d_() && jx1 instanceof cx) {
/* 180 */           jx1.f(this);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 185 */     if (this.ab != null && 
/* 186 */       this.ab.ax) this.ab = null;
/*     */   
/*     */   }
/*     */   
/*     */   protected void i_() {
/* 191 */     double d1 = Math.cos(this.an * Math.PI / 180.0D) * 0.4D;
/* 192 */     double d2 = Math.sin(this.an * Math.PI / 180.0D) * 0.4D;
/* 193 */     this.ab.a(this.ah + d1, this.ai + j_() + this.ab.t(), this.aj + d2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(hc paramhc) {}
/*     */ 
/*     */   
/*     */   protected void b(hc paramhc) {}
/*     */   
/*     */   public float h_() {
/* 203 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(dg paramdg) {
/* 214 */     paramdg.g(this);
/* 215 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */