/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class nd
/*     */   extends jx
/*     */ {
/*     */   protected int b;
/*     */   protected float c;
/*     */   protected float d;
/*  14 */   protected int e = 0;
/*  15 */   protected int f = 0;
/*     */   
/*     */   protected float g;
/*     */   
/*     */   protected float h;
/*     */   protected float i;
/*     */   protected float j;
/*     */   
/*     */   public nd(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  24 */     super(paramcj);
/*  25 */     a(0.2F, 0.2F);
/*  26 */     this.ay = this.aA / 2.0F;
/*  27 */     a(paramDouble1, paramDouble2, paramDouble3);
/*  28 */     this.i = this.j = this.k = 1.0F;
/*     */     
/*  30 */     this.ak = paramDouble4 + ((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
/*  31 */     this.al = paramDouble5 + ((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
/*  32 */     this.am = paramDouble6 + ((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
/*  33 */     float f1 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
/*     */     
/*  35 */     float f2 = ei.a(this.ak * this.ak + this.al * this.al + this.am * this.am);
/*  36 */     this.ak = this.ak / f2 * f1 * 0.4000000059604645D;
/*  37 */     this.al = this.al / f2 * f1 * 0.4000000059604645D + 0.10000000149011612D;
/*  38 */     this.am = this.am / f2 * f1 * 0.4000000059604645D;
/*     */ 
/*     */     
/*  41 */     this.c = this.aN.nextFloat() * 3.0F;
/*  42 */     this.d = this.aN.nextFloat() * 3.0F;
/*     */     
/*  44 */     this.g = (this.aN.nextFloat() * 0.5F + 0.5F) * 2.0F;
/*     */     
/*  46 */     this.f = (int)(4.0F / (this.aN.nextFloat() * 0.9F + 0.1F));
/*  47 */     this.e = 0;
/*  48 */     this.aD = false;
/*     */   }
/*     */   protected float k; public static double l; public static double m; public static double n;
/*     */   
/*     */   public nd b(float paramFloat) {
/*  53 */     this.ak *= paramFloat;
/*  54 */     this.al = (this.al - 0.10000000149011612D) * paramFloat + 0.10000000149011612D;
/*  55 */     this.am *= paramFloat;
/*  56 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public nd d(float paramFloat) {
/*  61 */     a(0.2F * paramFloat, 0.2F * paramFloat);
/*  62 */     this.g *= paramFloat;
/*  63 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e_() {
/*  68 */     this.ae = this.ah;
/*  69 */     this.af = this.ai;
/*  70 */     this.ag = this.aj;
/*     */     
/*  72 */     if (this.e++ >= this.f) D();
/*     */     
/*  74 */     this.al -= 0.04D * this.h;
/*  75 */     c(this.ak, this.al, this.am);
/*  76 */     this.ak *= 0.9800000190734863D;
/*  77 */     this.al *= 0.9800000190734863D;
/*  78 */     this.am *= 0.9800000190734863D;
/*     */     
/*  80 */     if (this.as) {
/*     */       
/*  82 */       this.ak *= 0.699999988079071D;
/*  83 */       this.am *= 0.699999988079071D;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  89 */     float f1 = (this.b % 16) / 16.0F;
/*  90 */     float f2 = f1 + 0.0624375F;
/*  91 */     float f3 = (this.b / 16) / 16.0F;
/*  92 */     float f4 = f3 + 0.0624375F;
/*  93 */     float f5 = 0.1F * this.g;
/*     */     
/*  95 */     float f6 = (float)(this.ae + (this.ah - this.ae) * paramFloat1 - l);
/*  96 */     float f7 = (float)(this.af + (this.ai - this.af) * paramFloat1 - m);
/*  97 */     float f8 = (float)(this.ag + (this.aj - this.ag) * paramFloat1 - n);
/*     */     
/*  99 */     float f9 = a(paramFloat1);
/* 100 */     paramhe.a(this.i * f9, this.j * f9, this.k * f9);
/*     */     
/* 102 */     paramhe.a((f6 - paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 - paramFloat4 * f5 - paramFloat6 * f5), f1, f4);
/* 103 */     paramhe.a((f6 - paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 - paramFloat4 * f5 + paramFloat6 * f5), f1, f3);
/* 104 */     paramhe.a((f6 + paramFloat2 * f5 + paramFloat5 * f5), (f7 + paramFloat3 * f5), (f8 + paramFloat4 * f5 + paramFloat6 * f5), f2, f3);
/* 105 */     paramhe.a((f6 + paramFloat2 * f5 - paramFloat5 * f5), (f7 - paramFloat3 * f5), (f8 + paramFloat4 * f5 - paramFloat6 * f5), f2, f4);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 110 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {}
/*     */   
/*     */   public void b(hc paramhc) {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */