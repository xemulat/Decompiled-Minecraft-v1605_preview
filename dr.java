/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dr
/*     */   extends jx
/*     */ {
/*     */   public eo a;
/*     */   private int e;
/*  19 */   public int b = 0;
/*     */   
/*     */   public int c;
/*  22 */   private int f = 5;
/*     */   
/*  24 */   public float d = (float)(Math.random() * Math.PI * 2.0D);
/*     */   
/*     */   public dr(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, eo parameo) {
/*  27 */     super(paramcj);
/*  28 */     a(0.25F, 0.25F);
/*  29 */     this.ay = this.aA / 2.0F;
/*  30 */     a(paramDouble1, paramDouble2, paramDouble3);
/*  31 */     this.a = parameo;
/*     */     
/*  33 */     this.an = (float)(Math.random() * 360.0D);
/*     */     
/*  35 */     this.ak = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  36 */     this.al = 0.20000000298023224D;
/*  37 */     this.am = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
/*  38 */     this.aD = false;
/*     */   }
/*     */   
/*     */   public dr(cj paramcj) {
/*  42 */     super(paramcj);
/*  43 */     a(0.25F, 0.25F);
/*  44 */     this.ay = this.aA / 2.0F;
/*     */   }
/*     */   
/*     */   public void e_() {
/*  48 */     super.e_();
/*  49 */     if (this.c > 0) this.c--; 
/*  50 */     this.ae = this.ah;
/*  51 */     this.af = this.ai;
/*  52 */     this.ag = this.aj;
/*     */     
/*  54 */     this.al -= 0.03999999910593033D;
/*  55 */     if (this.ad.f(ei.b(this.ah), ei.b(this.ai), ei.b(this.aj)) == fs.g) {
/*  56 */       this.al = 0.20000000298023224D;
/*  57 */       this.ak = ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F);
/*  58 */       this.am = ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F);
/*  59 */       this.ad.a(this, "random.fizz", 0.4F, 2.0F + this.aN.nextFloat() * 0.4F);
/*     */     } 
/*  61 */     g(this.ah, this.ai, this.aj);
/*  62 */     g_();
/*  63 */     c(this.ak, this.al, this.am);
/*     */ 
/*     */     
/*  66 */     float f = 0.98F;
/*  67 */     if (this.as) {
/*  68 */       f = 0.58800006F;
/*  69 */       int i = this.ad.a(ei.b(this.ah), ei.b(this.ar.b) - 1, ei.b(this.aj));
/*  70 */       if (i > 0) {
/*  71 */         f = (ln.n[i]).bm * 0.98F;
/*     */       }
/*     */     } 
/*     */     
/*  75 */     this.ak *= f;
/*  76 */     this.al *= 0.9800000190734863D;
/*  77 */     this.am *= f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     if (this.as) {
/*  99 */       this.al *= -0.5D;
/*     */     }
/*     */     
/* 102 */     this.e++;
/* 103 */     this.b++;
/* 104 */     if (this.b >= 6000) {
/* 105 */       D();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean g_() {
/* 110 */     return this.ad.a(this.ar, fs.f, this);
/*     */   }
/*     */   
/*     */   private boolean g(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 114 */     int i = ei.b(paramDouble1);
/* 115 */     int j = ei.b(paramDouble2);
/* 116 */     int k = ei.b(paramDouble3);
/*     */     
/* 118 */     double d1 = paramDouble1 - i;
/* 119 */     double d2 = paramDouble2 - j;
/* 120 */     double d3 = paramDouble3 - k;
/*     */     
/* 122 */     if (ln.p[this.ad.a(i, j, k)]) {
/* 123 */       boolean bool1 = !ln.p[this.ad.a(i - 1, j, k)] ? true : false;
/* 124 */       boolean bool2 = !ln.p[this.ad.a(i + 1, j, k)] ? true : false;
/* 125 */       boolean bool3 = !ln.p[this.ad.a(i, j - 1, k)] ? true : false;
/* 126 */       boolean bool4 = !ln.p[this.ad.a(i, j + 1, k)] ? true : false;
/* 127 */       boolean bool5 = !ln.p[this.ad.a(i, j, k - 1)] ? true : false;
/* 128 */       boolean bool6 = !ln.p[this.ad.a(i, j, k + 1)] ? true : false;
/*     */       
/* 130 */       byte b = -1;
/* 131 */       double d = 9999.0D;
/* 132 */       if (bool1 && d1 < d) {
/* 133 */         d = d1;
/* 134 */         b = 0;
/*     */       } 
/* 136 */       if (bool2 && 1.0D - d1 < d) {
/* 137 */         d = 1.0D - d1;
/* 138 */         b = 1;
/*     */       } 
/* 140 */       if (bool3 && d2 < d) {
/* 141 */         d = d2;
/* 142 */         b = 2;
/*     */       } 
/* 144 */       if (bool4 && 1.0D - d2 < d) {
/* 145 */         d = 1.0D - d2;
/* 146 */         b = 3;
/*     */       } 
/* 148 */       if (bool5 && d3 < d) {
/* 149 */         d = d3;
/* 150 */         b = 4;
/*     */       } 
/* 152 */       if (bool6 && 1.0D - d3 < d) {
/* 153 */         d = 1.0D - d3;
/* 154 */         b = 5;
/*     */       } 
/*     */       
/* 157 */       float f = this.aN.nextFloat() * 0.2F + 0.1F;
/* 158 */       if (b == 0) this.ak = -f; 
/* 159 */       if (b == 1) this.ak = f; 
/* 160 */       if (b == 2) this.al = -f; 
/* 161 */       if (b == 3) this.al = f; 
/* 162 */       if (b == 4) this.am = -f; 
/* 163 */       if (b == 5) this.am = f;
/*     */     
/*     */     } 
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt) {
/* 170 */     a((jx)null, paramInt);
/*     */   }
/*     */   
/*     */   public boolean a(jx paramjx, int paramInt) {
/* 174 */     this.f -= paramInt;
/* 175 */     if (this.f <= 0) {
/* 176 */       D();
/*     */     }
/* 178 */     return false;
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/* 182 */     paramhc.a("Health", (short)(byte)this.f);
/* 183 */     paramhc.a("Age", (short)this.b);
/* 184 */     paramhc.a("Item", this.a.a(new hc()));
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/* 188 */     this.f = paramhc.d("Health") & 0xFF;
/* 189 */     this.b = paramhc.d("Age");
/* 190 */     hc hc1 = paramhc.k("Item");
/* 191 */     this.a = new eo(hc1);
/*     */   }
/*     */   
/*     */   public void b(dg paramdg) {
/* 195 */     if (this.ad.v)
/*     */       return; 
/* 197 */     int i = this.a.a;
/* 198 */     if (this.c == 0 && paramdg.b.a(this.a)) {
/* 199 */       this.ad.a(this, "random.pop", 0.2F, ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 200 */       paramdg.a_(this, i);
/* 201 */       D();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */