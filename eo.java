/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class eo
/*     */ {
/*  11 */   public int a = 0;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   
/*     */   public eo(ln paramln) {
/*  17 */     this(paramln, 1);
/*     */   }
/*     */   
/*     */   public eo(ln paramln, int paramInt) {
/*  21 */     this(paramln.ba, paramInt);
/*     */   }
/*     */   
/*     */   public eo(dd paramdd) {
/*  25 */     this(paramdd, 1);
/*     */   }
/*     */   
/*     */   public eo(dd paramdd, int paramInt) {
/*  29 */     this(paramdd.aQ, paramInt);
/*     */   }
/*     */   
/*     */   public eo(int paramInt) {
/*  33 */     this(paramInt, 1);
/*     */   }
/*     */   
/*     */   public eo(int paramInt1, int paramInt2) {
/*  37 */     this.c = paramInt1;
/*  38 */     this.a = paramInt2;
/*     */   }
/*     */   
/*     */   public eo(int paramInt1, int paramInt2, int paramInt3) {
/*  42 */     this.c = paramInt1;
/*  43 */     this.a = paramInt2;
/*  44 */     this.d = paramInt3;
/*     */   }
/*     */ 
/*     */   
/*     */   public eo(hc paramhc) {
/*  49 */     b(paramhc);
/*     */   }
/*     */   
/*     */   public eo a(int paramInt) {
/*  53 */     this.a -= paramInt;
/*  54 */     return new eo(this.c, paramInt, this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dd a() {
/*  63 */     return dd.c[this.c];
/*     */   }
/*     */   
/*     */   public int b() {
/*  67 */     return a().a(this);
/*     */   }
/*     */   
/*     */   public boolean a(dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  71 */     return a().a(this, paramdg, paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public float a(ln paramln) {
/*  75 */     return a().a(this, paramln);
/*     */   }
/*     */   
/*     */   public eo a(cj paramcj, dg paramdg) {
/*  79 */     return a().a(this, paramcj, paramdg);
/*     */   }
/*     */   
/*     */   public hc a(hc paramhc) {
/*  83 */     paramhc.a("id", (short)this.c);
/*  84 */     paramhc.a("Count", (byte)this.a);
/*  85 */     paramhc.a("Damage", (short)this.d);
/*  86 */     return paramhc;
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/*  90 */     this.c = paramhc.d("id");
/*  91 */     this.a = paramhc.c("Count");
/*  92 */     this.d = paramhc.d("Damage");
/*     */   }
/*     */   
/*     */   public int c() {
/*  96 */     return a().b();
/*     */   }
/*     */   
/*     */   public int d() {
/* 100 */     return dd.c[this.c].c();
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 104 */     this.d += paramInt;
/* 105 */     if (this.d > d()) {
/* 106 */       this.a--;
/* 107 */       if (this.a < 0) this.a = 0; 
/* 108 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(fv paramfv) {
/* 113 */     dd.c[this.c].a(this, paramfv);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 117 */     dd.c[this.c].a(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(jx paramjx) {
/* 121 */     return dd.c[this.c].a(paramjx);
/*     */   }
/*     */   
/*     */   public boolean b(ln paramln) {
/* 125 */     return dd.c[this.c].a(paramln);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dg paramdg) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(fv paramfv) {
/* 141 */     dd.c[this.c].b(this, paramfv);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\eo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */