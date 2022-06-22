/*     */ 
/*     */ 
/*     */ 
/*     */ public class ee
/*     */   extends fv
/*     */ {
/*     */   private bh a;
/*     */   protected jx f;
/*     */   protected boolean g;
/*     */   
/*     */   public ee(cj paramcj) {
/*  12 */     super(paramcj);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  17 */     this.g = false;
/*     */   }
/*     */   protected void b_() {
/*  20 */     this.g = false;
/*  21 */     float f = 16.0F;
/*     */     
/*  23 */     if (this.f == null) {
/*  24 */       this.f = h();
/*  25 */       if (this.f != null) {
/*  26 */         this.a = this.ad.a(this, this.f, f);
/*     */       }
/*     */     }
/*  29 */     else if (!this.f.z()) {
/*  30 */       this.f = null;
/*     */     } else {
/*  32 */       float f1 = this.f.d(this);
/*  33 */       if (c(this.f)) {
/*  34 */         a(this.f, f1);
/*     */       }
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
/*  46 */     if (!this.g && this.f != null && (this.a == null || this.aN.nextInt(20) == 0)) {
/*  47 */       this.a = this.ad.a(this, this.f, f);
/*  48 */     } else if ((this.a == null && this.aN.nextInt(80) == 0) || this.aN.nextInt(80) == 0) {
/*     */       
/*  50 */       boolean bool = false;
/*  51 */       int j = -1;
/*  52 */       int k = -1;
/*  53 */       int m = -1;
/*  54 */       float f1 = -99999.0F;
/*  55 */       for (byte b = 0; b < 10; b++) {
/*  56 */         int n = ei.b(this.ah + this.aN.nextInt(13) - 6.0D);
/*  57 */         int i1 = ei.b(this.ai + this.aN.nextInt(7) - 3.0D);
/*  58 */         int i2 = ei.b(this.aj + this.aN.nextInt(13) - 6.0D);
/*  59 */         float f2 = a(n, i1, i2);
/*  60 */         if (f2 > f1) {
/*  61 */           f1 = f2;
/*  62 */           j = n;
/*  63 */           k = i1;
/*  64 */           m = i2;
/*  65 */           bool = true;
/*     */         } 
/*     */       } 
/*     */       
/*  69 */       if (bool) {
/*  70 */         this.a = this.ad.a(this, j, k, m, 10.0F);
/*     */       }
/*     */     } 
/*     */     
/*  74 */     int i = ei.b(this.ar.b);
/*     */     
/*  76 */     boolean bool1 = g_();
/*  77 */     boolean bool2 = E();
/*  78 */     this.ao = 0.0F;
/*  79 */     if (this.a == null || this.aN.nextInt(100) == 0) {
/*  80 */       super.b_();
/*  81 */       this.a = null;
/*     */       
/*     */       return;
/*     */     } 
/*  85 */     ah ah = this.a.a(this);
/*  86 */     double d = (this.az * 2.0F);
/*  87 */     while (ah != null && ah.d(this.ah, ah.b, this.aj) < d * d) {
/*  88 */       this.a.a();
/*  89 */       if (this.a.b()) {
/*  90 */         ah = null;
/*  91 */         this.a = null; continue;
/*  92 */       }  ah = this.a.a(this);
/*     */     } 
/*     */     
/*  95 */     this.W = false;
/*  96 */     if (ah != null) {
/*  97 */       double d1 = ah.a - this.ah;
/*  98 */       double d2 = ah.c - this.aj;
/*  99 */       double d3 = ah.b - i;
/*     */       
/* 101 */       float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 102 */       float f2 = f1 - this.an;
/* 103 */       this.U = this.Y;
/* 104 */       while (f2 < -180.0F)
/* 105 */         f2 += 360.0F; 
/* 106 */       while (f2 >= 180.0F)
/* 107 */         f2 -= 360.0F; 
/* 108 */       if (f2 > 30.0F) {
/* 109 */         f2 = 30.0F;
/*     */       }
/*     */       
/* 112 */       if (f2 < -30.0F) {
/* 113 */         f2 = -30.0F;
/*     */       }
/*     */       
/* 116 */       this.an += f2;
/*     */       
/* 118 */       if (this.g && 
/* 119 */         this.f != null) {
/* 120 */         double d4 = this.f.ah - this.ah;
/* 121 */         double d5 = this.f.aj - this.aj;
/*     */         
/* 123 */         float f3 = this.an;
/* 124 */         this.an = (float)(Math.atan2(d5, d4) * 180.0D / 3.1415927410125732D) - 90.0F;
/*     */         
/* 126 */         f2 = (f3 - this.an + 90.0F) * 3.1415927F / 180.0F;
/* 127 */         this.T = -ei.a(f2) * this.U * 1.0F;
/* 128 */         this.U = ei.b(f2) * this.U * 1.0F;
/*     */       } 
/*     */       
/* 131 */       if (d3 > 0.0D) {
/* 132 */         this.W = true;
/*     */       }
/*     */     } 
/*     */     
/* 136 */     if (this.f != null) {
/* 137 */       b(this.f, 30.0F);
/*     */     }
/*     */     
/* 140 */     if (this.at) this.W = true; 
/* 141 */     if (this.aN.nextFloat() < 0.8F && (bool1 || bool2)) this.W = true;
/*     */   
/*     */   }
/*     */   
/*     */   protected void a(jx paramjx, float paramFloat) {}
/*     */   
/*     */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 148 */     return 0.0F;
/*     */   }
/*     */   
/*     */   protected jx h() {
/* 152 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 156 */     int i = ei.b(this.ah);
/* 157 */     int j = ei.b(this.ar.b);
/* 158 */     int k = ei.b(this.aj);
/* 159 */     return (super.a() && a(i, j, k) >= 0.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ee.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */