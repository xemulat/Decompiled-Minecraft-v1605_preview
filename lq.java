/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lq
/*     */   extends fv
/*     */   implements ck
/*     */ {
/*     */   public float a;
/*     */   public float b;
/*  16 */   private int d = 0;
/*  17 */   public int c = 1;
/*     */   
/*     */   public lq(cj paramcj) {
/*  20 */     super(paramcj);
/*  21 */     this.u = "/mob/slime.png";
/*  22 */     this.c = 1 << this.aN.nextInt(3);
/*  23 */     this.ay = 0.0F;
/*  24 */     this.d = this.aN.nextInt(20) + 10;
/*  25 */     c(this.c);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/*  29 */     this.c = paramInt;
/*  30 */     a(0.6F * paramInt, 0.6F * paramInt);
/*  31 */     this.D = paramInt * paramInt;
/*  32 */     a(this.ah, this.ai, this.aj);
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/*  36 */     super.a(paramhc);
/*  37 */     paramhc.a("Size", this.c - 1);
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/*  41 */     super.b(paramhc);
/*  42 */     this.c = paramhc.e("Size") + 1;
/*     */   }
/*     */   
/*     */   public void e_() {
/*  46 */     this.b = this.a;
/*  47 */     boolean bool = this.as;
/*  48 */     super.e_();
/*  49 */     if (this.as && !bool) {
/*  50 */       for (byte b = 0; b < this.c * 8; b++) {
/*  51 */         float f1 = this.aN.nextFloat() * 3.1415927F * 2.0F;
/*  52 */         float f2 = this.aN.nextFloat() * 0.5F + 0.5F;
/*  53 */         float f3 = ei.a(f1) * this.c * 0.5F * f2;
/*  54 */         float f4 = ei.b(f1) * this.c * 0.5F * f2;
/*  55 */         this.ad.a("slime", this.ah + f3, this.ar.b, this.aj + f4, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/*  58 */       if (this.c > 2) {
/*  59 */         this.ad.a(this, "mob.slime", f(), ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/*     */       }
/*  61 */       this.a = -0.5F;
/*     */     } 
/*  63 */     this.a *= 0.6F;
/*     */   }
/*     */   
/*     */   protected void b_() {
/*  67 */     dg dg = this.ad.a(this, 16.0D);
/*  68 */     if (dg != null) {
/*  69 */       b(dg, 10.0F);
/*     */     }
/*  71 */     if (this.as && this.d-- <= 0) {
/*  72 */       this.d = this.aN.nextInt(20) + 10;
/*  73 */       if (dg != null) {
/*  74 */         this.d /= 3;
/*     */       }
/*  76 */       this.W = true;
/*  77 */       if (this.c > 1) {
/*  78 */         this.ad.a(this, "mob.slime", f(), ((this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */       }
/*     */       
/*  81 */       this.a = 1.0F;
/*  82 */       this.T = 1.0F - this.aN.nextFloat() * 2.0F;
/*  83 */       this.U = (1 * this.c);
/*     */     } else {
/*  85 */       this.W = false;
/*  86 */       if (this.as) {
/*  87 */         this.T = this.U = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void D() {
/*  93 */     if (this.c > 1 && this.D == 0) {
/*  94 */       for (byte b = 0; b < 4; b++) {
/*  95 */         float f1 = ((b % 2) - 0.5F) * this.c / 4.0F;
/*  96 */         float f2 = ((b / 2) - 0.5F) * this.c / 4.0F;
/*  97 */         lq lq1 = new lq(this.ad);
/*  98 */         lq1.c(this.c / 2);
/*  99 */         lq1.c(this.ah + f1, this.ai + 0.5D, this.aj + f2, this.aN.nextFloat() * 360.0F, 0.0F);
/* 100 */         this.ad.a(lq1);
/*     */       } 
/*     */     }
/* 103 */     super.D();
/*     */   }
/*     */   
/*     */   public void b(dg paramdg) {
/* 107 */     if (this.c > 1 && 
/* 108 */       c(paramdg) && d(paramdg) < 0.6D * this.c && 
/* 109 */       paramdg.a(this, this.c)) {
/* 110 */       this.ad.a(this, "mob.slimeattack", 1.0F, (this.aN.nextFloat() - this.aN.nextFloat()) * 0.2F + 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String d() {
/* 118 */     return "mob.slime";
/*     */   }
/*     */   
/*     */   protected String e() {
/* 122 */     return "mob.slime";
/*     */   }
/*     */   
/*     */   protected int g() {
/* 126 */     if (this.c == 1) return dd.aK.aQ; 
/* 127 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 131 */     fr fr = this.ad.a(ei.b(this.ah), ei.b(this.ai));
/* 132 */     return ((this.c == 1 || this.ad.k > 0) && this.aN.nextInt(10) == 0 && fr.a(987234911L).nextInt(100) == 0 && this.ai < 16.0D);
/*     */   }
/*     */   
/*     */   protected float f() {
/* 136 */     return 0.6F;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */