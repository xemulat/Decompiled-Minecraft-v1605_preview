/*     */ 
/*     */ 
/*     */ public class cn
/*     */   extends ff
/*     */ {
/*     */   public if a;
/*     */   public if b;
/*     */   public if c;
/*     */   public if d;
/*     */   
/*     */   public cn() {
/*  12 */     this(0.0F);
/*     */   }
/*     */   public if e; public if f; public if g; public boolean h = false; public boolean i = false;
/*     */   public cn(float paramFloat) {
/*  16 */     this(paramFloat, 0.0F);
/*     */   }
/*     */   
/*     */   public cn(float paramFloat1, float paramFloat2) {
/*  20 */     this.a = new if(0, 0);
/*  21 */     this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat1);
/*  22 */     this.a.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*     */     
/*  24 */     this.b = new if(32, 0);
/*  25 */     this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat1 + 0.5F);
/*  26 */     this.b.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*     */     
/*  28 */     this.c = new if(16, 16);
/*  29 */     this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat1);
/*  30 */     this.c.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*     */     
/*  32 */     this.d = new if(40, 16);
/*  33 */     this.d.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  34 */     this.d.a(-5.0F, 2.0F + paramFloat2, 0.0F);
/*     */     
/*  36 */     this.e = new if(40, 16);
/*  37 */     this.e.g = true;
/*  38 */     this.e.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  39 */     this.e.a(5.0F, 2.0F + paramFloat2, 0.0F);
/*     */     
/*  41 */     this.f = new if(0, 16);
/*  42 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  43 */     this.f.a(-2.0F, 12.0F + paramFloat2, 0.0F);
/*     */     
/*  45 */     this.g = new if(0, 16);
/*  46 */     this.g.g = true;
/*  47 */     this.g.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  48 */     this.g.a(2.0F, 12.0F + paramFloat2, 0.0F);
/*     */   }
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  52 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*     */     
/*  54 */     this.a.a(paramFloat6);
/*  55 */     this.c.a(paramFloat6);
/*  56 */     this.d.a(paramFloat6);
/*  57 */     this.e.a(paramFloat6);
/*  58 */     this.f.a(paramFloat6);
/*  59 */     this.g.a(paramFloat6);
/*  60 */     this.b.a(paramFloat6);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  64 */     this.a.e = paramFloat4 / 57.295776F;
/*  65 */     this.a.d = paramFloat5 / 57.295776F;
/*  66 */     this.b.e = this.a.e;
/*  67 */     this.b.d = this.a.d;
/*     */     
/*  69 */     this.d.d = ei.b(paramFloat1 * 0.6662F + 3.1415927F) * 2.0F * paramFloat2 * 0.5F;
/*     */ 
/*     */     
/*  72 */     this.e.d = ei.b(paramFloat1 * 0.6662F) * 2.0F * paramFloat2 * 0.5F;
/*     */     
/*  74 */     this.d.f = 0.0F;
/*  75 */     this.e.f = 0.0F;
/*     */     
/*  77 */     this.f.d = ei.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
/*  78 */     this.g.d = ei.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
/*  79 */     this.f.e = 0.0F;
/*  80 */     this.g.e = 0.0F;
/*     */     
/*  82 */     if (this.k) {
/*  83 */       this.d.d += -0.62831855F;
/*  84 */       this.e.d += -0.62831855F;
/*  85 */       this.f.d = -1.2566371F;
/*  86 */       this.g.d = -1.2566371F;
/*  87 */       this.f.e = 0.31415927F;
/*  88 */       this.g.e = -0.31415927F;
/*     */     } 
/*     */     
/*  91 */     if (this.h) {
/*  92 */       this.e.d = this.e.d * 0.5F - 0.31415927F;
/*     */     }
/*  94 */     if (this.i) {
/*  95 */       this.d.d = this.d.d * 0.5F - 0.31415927F;
/*     */     }
/*  97 */     this.d.e = 0.0F;
/*  98 */     this.e.e = 0.0F;
/*  99 */     if (this.j > -9990.0F) {
/* 100 */       float f1 = this.j;
/* 101 */       this.c.e = ei.a(ei.c(f1) * 3.1415927F * 2.0F) * 0.2F;
/* 102 */       this.d.c = ei.a(this.c.e) * 5.0F;
/* 103 */       this.d.a = -ei.b(this.c.e) * 5.0F;
/* 104 */       this.e.c = -ei.a(this.c.e) * 5.0F;
/* 105 */       this.e.a = ei.b(this.c.e) * 5.0F;
/* 106 */       this.d.e += this.c.e;
/* 107 */       this.e.e += this.c.e;
/* 108 */       this.e.d += this.c.e;
/*     */       
/* 110 */       f1 = 1.0F - this.j;
/* 111 */       f1 *= f1;
/* 112 */       f1 *= f1;
/* 113 */       f1 = 1.0F - f1;
/* 114 */       float f2 = ei.a(f1 * 3.1415927F);
/* 115 */       float f3 = ei.a(this.j * 3.1415927F) * -(this.a.d - 0.7F) * 0.75F;
/* 116 */       this.d.d = (float)(this.d.d - f2 * 1.2D + f3);
/* 117 */       this.d.e += this.c.e * 2.0F;
/* 118 */       this.d.f = ei.a(this.j * 3.1415927F) * -0.4F;
/*     */     } 
/*     */     
/* 121 */     this.d.f += ei.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 122 */     this.e.f -= ei.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 123 */     this.d.d += ei.a(paramFloat3 * 0.067F) * 0.05F;
/* 124 */     this.e.d -= ei.a(paramFloat3 * 0.067F) * 0.05F;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */