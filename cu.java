/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cu
/*     */ {
/*     */   private mz a;
/*  12 */   private fo b = new fo();
/*  13 */   private ez c = new ez();
/*     */   
/*  15 */   private a[] d = new a[32];
/*     */   
/*     */   public cu(mz parammz) {
/*  18 */     this.a = parammz;
/*     */   }
/*     */   
/*     */   public bh a(jx paramjx1, jx paramjx2, float paramFloat) {
/*  22 */     return a(paramjx1, paramjx2.ah, paramjx2.ar.b, paramjx2.aj, paramFloat);
/*     */   }
/*     */   
/*     */   public bh a(jx paramjx, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/*  26 */     return a(paramjx, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), paramFloat);
/*     */   }
/*     */   
/*     */   private bh a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  30 */     this.b.a();
/*  31 */     this.c.a();
/*     */     
/*  33 */     a a1 = a(ei.b(paramjx.ar.a), ei.b(paramjx.ar.b), ei.b(paramjx.ar.c));
/*  34 */     a a2 = a(ei.b(paramDouble1 - (paramjx.az / 2.0F)), ei.b(paramDouble2), ei.b(paramDouble3 - (paramjx.az / 2.0F)));
/*     */     
/*  36 */     a a3 = new a(ei.d(paramjx.az + 1.0F), ei.d(paramjx.aA + 1.0F), ei.d(paramjx.az + 1.0F));
/*  37 */     return a(paramjx, a1, a2, a3, paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private bh a(jx paramjx, a parama1, a parama2, a parama3, float paramFloat) {
/*  43 */     parama1.f = 0.0F;
/*  44 */     parama1.g = parama1.a(parama2);
/*  45 */     parama1.h = parama1.g;
/*     */     
/*  47 */     this.b.a();
/*  48 */     this.b.a(parama1);
/*     */     
/*  50 */     a a1 = parama1;
/*     */     
/*  52 */     while (!this.b.c()) {
/*  53 */       a a2 = this.b.b();
/*     */       
/*  55 */       if (a2.d == parama2.d) {
/*  56 */         return a(parama1, parama2);
/*     */       }
/*     */       
/*  59 */       if (a2.a(parama2) < a1.a(parama2)) {
/*  60 */         a1 = a2;
/*     */       }
/*  62 */       a2.j = true;
/*     */       
/*  64 */       int i = b(paramjx, a2, parama3, parama2, paramFloat);
/*  65 */       for (byte b = 0; b < i; b++) {
/*  66 */         a a3 = this.d[b];
/*     */         
/*  68 */         float f = a2.f + a2.a(a3);
/*  69 */         if (!a3.a() || f < a3.f) {
/*  70 */           a3.i = a2;
/*  71 */           a3.f = f;
/*  72 */           a3.g = a3.a(parama2);
/*  73 */           if (a3.a()) {
/*  74 */             this.b.a(a3, a3.f + a3.g);
/*     */           } else {
/*  76 */             a3.h = a3.f + a3.g;
/*  77 */             this.b.a(a3);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  83 */     if (a1 == parama1) return null; 
/*  84 */     return a(parama1, a1);
/*     */   }
/*     */   
/*     */   private int b(jx paramjx, a parama1, a parama2, a parama3, float paramFloat) {
/*  88 */     byte b = 0;
/*     */     
/*  90 */     boolean bool = false;
/*  91 */     if (a(paramjx, parama1.a, parama1.b + 1, parama1.c, parama2) > 0) bool = true;
/*     */     
/*  93 */     a a1 = a(paramjx, parama1.a, parama1.b, parama1.c + 1, parama2, bool);
/*  94 */     a a2 = a(paramjx, parama1.a - 1, parama1.b, parama1.c, parama2, bool);
/*  95 */     a a3 = a(paramjx, parama1.a + 1, parama1.b, parama1.c, parama2, bool);
/*  96 */     a a4 = a(paramjx, parama1.a, parama1.b, parama1.c - 1, parama2, bool);
/*     */     
/*  98 */     if (a1 != null && !a1.j && a1.a(parama3) < paramFloat) this.d[b++] = a1; 
/*  99 */     if (a2 != null && !a2.j && a2.a(parama3) < paramFloat) this.d[b++] = a2; 
/* 100 */     if (a3 != null && !a3.j && a3.a(parama3) < paramFloat) this.d[b++] = a3; 
/* 101 */     if (a4 != null && !a4.j && a4.a(parama3) < paramFloat) this.d[b++] = a4;
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
/* 115 */     return b;
/*     */   }
/*     */   
/*     */   private a a(jx paramjx, int paramInt1, int paramInt2, int paramInt3, a parama, int paramInt4) {
/* 119 */     a a1 = null;
/* 120 */     if (a(paramjx, paramInt1, paramInt2, paramInt3, parama) > 0) a1 = a(paramInt1, paramInt2, paramInt3); 
/* 121 */     if (a1 == null && a(paramjx, paramInt1, paramInt2 + paramInt4, paramInt3, parama) > 0) {
/* 122 */       a1 = a(paramInt1, paramInt2 + paramInt4, paramInt3);
/* 123 */       paramInt2 += paramInt4;
/*     */     } 
/*     */     
/* 126 */     if (a1 != null) {
/* 127 */       byte b = 0;
/* 128 */       int i = 0;
/* 129 */       while (paramInt2 > 0 && (i = a(paramjx, paramInt1, paramInt2 - 1, paramInt3, parama)) > 0) {
/* 130 */         if (i < 0) return null; 
/* 131 */         if (++b >= 4) return null; 
/* 132 */         paramInt2--;
/*     */       } 
/* 134 */       if (paramInt2 > 0) a1 = a(paramInt1, paramInt2, paramInt3);
/*     */     
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     return a1;
/*     */   }
/*     */   
/*     */   private final a a(int paramInt1, int paramInt2, int paramInt3) {
/* 145 */     int i = paramInt1 | paramInt2 << 10 | paramInt3 << 20;
/* 146 */     a a1 = (a)this.c.a(i);
/* 147 */     if (a1 == null) {
/* 148 */       a1 = new a(paramInt1, paramInt2, paramInt3);
/* 149 */       this.c.a(i, a1);
/*     */     } 
/* 151 */     return a1;
/*     */   }
/*     */   
/*     */   private int a(jx paramjx, int paramInt1, int paramInt2, int paramInt3, a parama) {
/* 155 */     for (int i = paramInt1; i < paramInt1 + parama.a; i++) {
/* 156 */       for (int j = paramInt2; j < paramInt2 + parama.b; j++) {
/* 157 */         for (int k = paramInt3; k < paramInt3 + parama.c; k++) {
/* 158 */           fs fs = this.a.f(paramInt1, paramInt2, paramInt3);
/* 159 */           if (fs.c()) return 0; 
/* 160 */           if (fs == fs.f || fs == fs.g) return -1; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 164 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   private bh a(a parama1, a parama2) {
/* 169 */     byte b = 1;
/* 170 */     a a1 = parama2;
/* 171 */     while (a1.i != null) {
/* 172 */       b++;
/* 173 */       a1 = a1.i;
/*     */     } 
/*     */     
/* 176 */     a[] arrayOfA = new a[b];
/* 177 */     a1 = parama2;
/* 178 */     arrayOfA[--b] = a1;
/* 179 */     while (a1.i != null) {
/* 180 */       a1 = a1.i;
/* 181 */       arrayOfA[--b] = a1;
/*     */     } 
/* 183 */     return new bh(arrayOfA);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */