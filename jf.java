/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class jf
/*     */   extends ln
/*     */ {
/*  11 */   protected int d = 1;
/*     */   
/*     */   protected jf(int paramInt, fs paramfs) {
/*  14 */     super(paramInt, ((paramfs == fs.g) ? 14 : 12) * 16 + 13, paramfs);
/*  15 */     float f1 = 0.0F;
/*  16 */     float f2 = 0.0F;
/*     */     
/*  18 */     if (paramfs == fs.g) this.d = 2;
/*     */     
/*  20 */     a(0.0F + f2, 0.0F + f1, 0.0F + f2, 1.0F + f2, 1.0F + f1, 1.0F + f2);
/*  21 */     b(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static float b(int paramInt) {
/*  26 */     if (paramInt >= 8) paramInt = 0; 
/*  27 */     return (paramInt + 1) / 9.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int paramInt) {
/*  32 */     if (paramInt == 0 || paramInt == 1) {
/*  33 */       return this.aZ;
/*     */     }
/*  35 */     return this.aZ + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     if (paramcj.f(paramInt1, paramInt2, paramInt3) != this.bl) return -1; 
/*  41 */     return paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected int b(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/*  45 */     if (parammz.f(paramInt1, paramInt2, paramInt3) != this.bl) return -1; 
/*  46 */     int i = parammz.e(paramInt1, paramInt2, paramInt3);
/*  47 */     if (i >= 8) i = 0; 
/*  48 */     return i;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  52 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  56 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/*  60 */     return (paramBoolean && paramInt == 0);
/*     */   }
/*     */   
/*     */   public boolean c(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  64 */     fs fs = parammz.f(paramInt1, paramInt2, paramInt3);
/*  65 */     if (fs == this.bl) return false; 
/*  66 */     if (fs == fs.r) return false; 
/*  67 */     if (paramInt4 == 1) return true; 
/*  68 */     return super.c(parammz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  72 */     return null;
/*     */   }
/*     */   
/*     */   public int f() {
/*  76 */     return 4;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/*  80 */     return 0;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/*  84 */     return 0;
/*     */   }
/*     */   
/*     */   private ah e(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/*  88 */     ah ah = ah.b(0.0D, 0.0D, 0.0D);
/*  89 */     int i = b(parammz, paramInt1, paramInt2, paramInt3); byte b;
/*  90 */     for (b = 0; b < 4; b++) {
/*     */       
/*  92 */       int j = paramInt1;
/*  93 */       int k = paramInt2;
/*  94 */       int m = paramInt3;
/*     */       
/*  96 */       if (b == 0) j--; 
/*  97 */       if (b == 1) m--; 
/*  98 */       if (b == 2) j++; 
/*  99 */       if (b == 3) m++;
/*     */       
/* 101 */       int n = b(parammz, j, k, m);
/* 102 */       if (n < 0) {
/* 103 */         if (!parammz.f(j, k, m).c()) {
/* 104 */           n = b(parammz, j, k - 1, m);
/* 105 */           if (n >= 0) {
/* 106 */             int i1 = n - i - 8;
/* 107 */             ah = ah.c(((j - paramInt1) * i1), ((k - paramInt2) * i1), ((m - paramInt3) * i1));
/*     */           }
/*     */         
/*     */         } 
/* 111 */       } else if (n >= 0) {
/* 112 */         int i1 = n - i;
/* 113 */         ah = ah.c(((j - paramInt1) * i1), ((k - paramInt2) * i1), ((m - paramInt3) * i1));
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 118 */     if (parammz.e(paramInt1, paramInt2, paramInt3) >= 8) {
/* 119 */       b = 0;
/* 120 */       if (b != 0 || c(parammz, paramInt1, paramInt2, paramInt3 - 1, 2)) b = 1; 
/* 121 */       if (b != 0 || c(parammz, paramInt1, paramInt2, paramInt3 + 1, 3)) b = 1; 
/* 122 */       if (b != 0 || c(parammz, paramInt1 - 1, paramInt2, paramInt3, 4)) b = 1; 
/* 123 */       if (b != 0 || c(parammz, paramInt1 + 1, paramInt2, paramInt3, 5)) b = 1; 
/* 124 */       if (b != 0 || c(parammz, paramInt1, paramInt2 + 1, paramInt3 - 1, 2)) b = 1; 
/* 125 */       if (b != 0 || c(parammz, paramInt1, paramInt2 + 1, paramInt3 + 1, 3)) b = 1; 
/* 126 */       if (b != 0 || c(parammz, paramInt1 - 1, paramInt2 + 1, paramInt3, 4)) b = 1; 
/* 127 */       if (b != 0 || c(parammz, paramInt1 + 1, paramInt2 + 1, paramInt3, 5)) b = 1; 
/* 128 */       if (b != 0) ah = ah.b().c(0.0D, -6.0D, 0.0D); 
/*     */     } 
/* 130 */     ah = ah.b();
/* 131 */     return ah;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx, ah paramah) {
/* 135 */     ah ah1 = e(paramcj, paramInt1, paramInt2, paramInt3);
/* 136 */     paramah.a += ah1.a;
/* 137 */     paramah.b += ah1.b;
/* 138 */     paramah.c += ah1.c;
/*     */   }
/*     */   
/*     */   public int a() {
/* 142 */     if (this.bl == fs.f) return 5; 
/* 143 */     if (this.bl == fs.g) return 30; 
/* 144 */     return 0;
/*     */   }
/*     */   
/*     */   public float c(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 148 */     float f1 = parammz.c(paramInt1, paramInt2, paramInt3);
/* 149 */     float f2 = parammz.c(paramInt1, paramInt2 + 1, paramInt3);
/* 150 */     return (f1 > f2) ? f1 : f2;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 154 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public int g() {
/* 158 */     return (this.bl == fs.f) ? 1 : 0;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 162 */     if (this.bl == fs.f && paramRandom.nextInt(64) == 0) {
/* 163 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 164 */       if (i > 0 && i < 8) {
/* 165 */         paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "liquid.water", paramRandom.nextFloat() * 0.25F + 0.75F, paramRandom.nextFloat() * 1.0F + 0.5F);
/*     */       }
/*     */     } 
/* 168 */     if (this.bl == fs.g && 
/* 169 */       paramcj.f(paramInt1, paramInt2 + 1, paramInt3) == fs.a && !paramcj.g(paramInt1, paramInt2 + 1, paramInt3) && 
/* 170 */       paramRandom.nextInt(100) == 0) {
/* 171 */       double d1 = (paramInt1 + paramRandom.nextFloat());
/* 172 */       double d2 = paramInt2 + this.bh;
/* 173 */       double d3 = (paramInt3 + paramRandom.nextFloat());
/* 174 */       paramcj.a("lava", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(mz parammz, int paramInt1, int paramInt2, int paramInt3, fs paramfs) {
/* 181 */     ah ah = null;
/* 182 */     if (paramfs == fs.f) ah = ((jf)ln.A).e(parammz, paramInt1, paramInt2, paramInt3); 
/* 183 */     if (paramfs == fs.g) ah = ((jf)ln.C).e(parammz, paramInt1, paramInt2, paramInt3); 
/* 184 */     if (ah.a == 0.0D && ah.c == 0.0D) return -1000.0D; 
/* 185 */     return Math.atan2(ah.c, ah.a) - 1.5707963267948966D;
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 189 */     j(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 193 */     j(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void j(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 197 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != this.ba)
/* 198 */       return;  if (this.bl == fs.g) {
/* 199 */       boolean bool = false;
/* 200 */       if (bool || paramcj.f(paramInt1, paramInt2, paramInt3 - 1) == fs.f) bool = true; 
/* 201 */       if (bool || paramcj.f(paramInt1, paramInt2, paramInt3 + 1) == fs.f) bool = true; 
/* 202 */       if (bool || paramcj.f(paramInt1 - 1, paramInt2, paramInt3) == fs.f) bool = true; 
/* 203 */       if (bool || paramcj.f(paramInt1 + 1, paramInt2, paramInt3) == fs.f) bool = true;
/*     */       
/* 205 */       if (bool || paramcj.f(paramInt1, paramInt2 + 1, paramInt3) == fs.f) bool = true; 
/* 206 */       if (bool) {
/* 207 */         int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 208 */         if (i == 0) {
/* 209 */           paramcj.d(paramInt1, paramInt2, paramInt3, ln.ap.ba);
/* 210 */         } else if (i <= 4) {
/* 211 */           paramcj.d(paramInt1, paramInt2, paramInt3, ln.w.ba);
/*     */         } 
/* 213 */         i(paramcj, paramInt1, paramInt2, paramInt3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 219 */     paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "random.fizz", 0.5F, 2.6F + (paramcj.m.nextFloat() - paramcj.m.nextFloat()) * 0.8F);
/* 220 */     for (byte b = 0; b < 8; b++)
/* 221 */       paramcj.a("largesmoke", paramInt1 + Math.random(), paramInt2 + 1.2D, paramInt3 + Math.random(), 0.0D, 0.0D, 0.0D); 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */