/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class kb
/*     */   extends ln
/*     */ {
/*     */   private ln a;
/*     */   
/*     */   protected kb(int paramInt, ln paramln) {
/*  14 */     super(paramInt, paramln.aZ, paramln.bl);
/*  15 */     this.a = paramln;
/*  16 */     c(paramln.bb);
/*  17 */     b(paramln.bc / 3.0F);
/*  18 */     a(paramln.bj);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  22 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  26 */     return false;
/*     */   }
/*     */   
/*     */   public int f() {
/*  30 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  35 */     return super.c(parammz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, cb paramcb, ArrayList paramArrayList) {
/*  39 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  40 */     if (i == 0) {
/*  41 */       a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
/*  42 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  43 */       a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  44 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  45 */     } else if (i == 1) {
/*  46 */       a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
/*  47 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  48 */       a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  49 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  50 */     } else if (i == 2) {
/*  51 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
/*  52 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  53 */       a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
/*  54 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  55 */     } else if (i == 3) {
/*  56 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
/*  57 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*  58 */       a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
/*  59 */       super.a(paramcj, paramInt1, paramInt2, paramInt3, paramcb, paramArrayList);
/*     */     } 
/*  61 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  65 */     if (paramcj.f(paramInt1, paramInt2 + 1, paramInt3).a()) {
/*  66 */       paramcj.d(paramInt1, paramInt2, paramInt3, this.a.ba);
/*     */     } else {
/*  68 */       h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */       
/*  70 */       h(paramcj, paramInt1 + 1, paramInt2 - 1, paramInt3);
/*  71 */       h(paramcj, paramInt1 - 1, paramInt2 - 1, paramInt3);
/*  72 */       h(paramcj, paramInt1, paramInt2 - 1, paramInt3 - 1);
/*  73 */       h(paramcj, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*     */       
/*  75 */       h(paramcj, paramInt1 + 1, paramInt2 + 1, paramInt3);
/*  76 */       h(paramcj, paramInt1 - 1, paramInt2 + 1, paramInt3);
/*  77 */       h(paramcj, paramInt1, paramInt2 + 1, paramInt3 - 1);
/*  78 */       h(paramcj, paramInt1, paramInt2 + 1, paramInt3 + 1);
/*     */     } 
/*  80 */     this.a.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  84 */     if (!j(paramcj, paramInt1, paramInt2, paramInt3))
/*  85 */       return;  byte b = -1;
/*     */     
/*  87 */     if (j(paramcj, paramInt1 + 1, paramInt2 + 1, paramInt3)) b = 0; 
/*  88 */     if (j(paramcj, paramInt1 - 1, paramInt2 + 1, paramInt3)) b = 1; 
/*  89 */     if (j(paramcj, paramInt1, paramInt2 + 1, paramInt3 + 1)) b = 2; 
/*  90 */     if (j(paramcj, paramInt1, paramInt2 + 1, paramInt3 - 1)) b = 3;
/*     */     
/*  92 */     if (b < 0) {
/*  93 */       if (i(paramcj, paramInt1 + 1, paramInt2, paramInt3) && !i(paramcj, paramInt1 - 1, paramInt2, paramInt3)) b = 0; 
/*  94 */       if (i(paramcj, paramInt1 - 1, paramInt2, paramInt3) && !i(paramcj, paramInt1 + 1, paramInt2, paramInt3)) b = 1; 
/*  95 */       if (i(paramcj, paramInt1, paramInt2, paramInt3 + 1) && !i(paramcj, paramInt1, paramInt2, paramInt3 - 1)) b = 2; 
/*  96 */       if (i(paramcj, paramInt1, paramInt2, paramInt3 - 1) && !i(paramcj, paramInt1, paramInt2, paramInt3 + 1)) b = 3;
/*     */     
/*     */     } 
/*  99 */     if (b < 0) {
/* 100 */       if (j(paramcj, paramInt1 - 1, paramInt2 - 1, paramInt3)) b = 0; 
/* 101 */       if (j(paramcj, paramInt1 + 1, paramInt2 - 1, paramInt3)) b = 1; 
/* 102 */       if (j(paramcj, paramInt1, paramInt2 - 1, paramInt3 - 1)) b = 2; 
/* 103 */       if (j(paramcj, paramInt1, paramInt2 - 1, paramInt3 + 1)) b = 3;
/*     */     
/*     */     } 
/* 106 */     if (b >= 0) {
/* 107 */       paramcj.b(paramInt1, paramInt2, paramInt3, b);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 112 */     return paramcj.f(paramInt1, paramInt2, paramInt3).a();
/*     */   }
/*     */   
/*     */   private boolean j(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 116 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/* 117 */     if (i == 0) return false; 
/* 118 */     return (ln.n[i].f() == 10);
/*     */   }
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
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 131 */     this.a.b(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 135 */     this.a.b(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 139 */     this.a.b(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public float c(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 143 */     return this.a.c(parammz, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public float a(jx paramjx) {
/* 147 */     return this.a.a(paramjx);
/*     */   }
/*     */   
/*     */   public int g() {
/* 151 */     return this.a.g();
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 155 */     return this.a.a(paramInt, paramRandom);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 159 */     return this.a.a(paramRandom);
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/* 163 */     return this.a.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 167 */     return this.a.a(paramInt);
/*     */   }
/*     */   
/*     */   public int a(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 171 */     return this.a.a(parammz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a() {
/* 175 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public cb f(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 179 */     return this.a.f(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx, ah paramah) {
/* 183 */     this.a.a(paramcj, paramInt1, paramInt2, paramInt3, paramjx, paramah);
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 187 */     return this.a.h();
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean) {
/* 191 */     return this.a.a(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 195 */     return this.a.a(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 199 */     a(paramcj, paramInt1, paramInt2, paramInt3, 0);
/* 200 */     this.a.e(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 204 */     this.a.b(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat) {
/* 212 */     this.a.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat);
/*     */   }
/*     */   
/*     */   public void b_(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 216 */     this.a.b_(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {
/* 220 */     this.a.a(paramcj, paramInt1, paramInt2, paramInt3, paramjx);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 224 */     this.a.a(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 228 */     return this.a.a(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*     */   }
/*     */   
/*     */   public void c(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 232 */     this.a.c(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */