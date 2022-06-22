/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lz
/*     */   extends ln
/*     */ {
/*     */   protected lz(int paramInt1, int paramInt2) {
/*  11 */     super(paramInt1, paramInt2, fs.n);
/*  12 */     b(true);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  16 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  24 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  28 */     return false;
/*     */   }
/*     */   
/*     */   public int f() {
/*  32 */     return 2;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  36 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3))
/*  37 */       return true; 
/*  38 */     if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3))
/*  39 */       return true; 
/*  40 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1))
/*  41 */       return true; 
/*  42 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1))
/*  43 */       return true; 
/*  44 */     if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) {
/*  45 */       return true;
/*     */     }
/*  47 */     return false;
/*     */   }
/*     */   
/*     */   public void d(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  51 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  53 */     if (paramInt4 == 1 && paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) i = 5; 
/*  54 */     if (paramInt4 == 2 && paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) i = 4; 
/*  55 */     if (paramInt4 == 3 && paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/*  56 */     if (paramInt4 == 4 && paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) i = 2; 
/*  57 */     if (paramInt4 == 5 && paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) i = 1;
/*     */     
/*  59 */     paramcj.b(paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  63 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/*  64 */     if (paramcj.e(paramInt1, paramInt2, paramInt3) == 0) e(paramcj, paramInt1, paramInt2, paramInt3); 
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  68 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) {
/*  69 */       paramcj.b(paramInt1, paramInt2, paramInt3, 1);
/*  70 */     } else if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) {
/*  71 */       paramcj.b(paramInt1, paramInt2, paramInt3, 2);
/*  72 */     } else if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) {
/*  73 */       paramcj.b(paramInt1, paramInt2, paramInt3, 3);
/*  74 */     } else if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) {
/*  75 */       paramcj.b(paramInt1, paramInt2, paramInt3, 4);
/*  76 */     } else if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) {
/*  77 */       paramcj.b(paramInt1, paramInt2, paramInt3, 5);
/*     */     } 
/*  79 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  83 */     if (h(paramcj, paramInt1, paramInt2, paramInt3)) {
/*  84 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  85 */       boolean bool = false;
/*     */       
/*  87 */       if (!paramcj.g(paramInt1 - 1, paramInt2, paramInt3) && i == 1) bool = true; 
/*  88 */       if (!paramcj.g(paramInt1 + 1, paramInt2, paramInt3) && i == 2) bool = true; 
/*  89 */       if (!paramcj.g(paramInt1, paramInt2, paramInt3 - 1) && i == 3) bool = true; 
/*  90 */       if (!paramcj.g(paramInt1, paramInt2, paramInt3 + 1) && i == 4) bool = true; 
/*  91 */       if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3) && i == 5) bool = true;
/*     */       
/*  93 */       if (bool) {
/*  94 */         b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  95 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 101 */     if (!a(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 102 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 103 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/* 104 */       return false;
/*     */     } 
/* 106 */     return true;
/*     */   }
/*     */   
/*     */   public lv a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, ah paramah1, ah paramah2) {
/* 110 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*     */     
/* 112 */     float f = 0.15F;
/* 113 */     if (i == 1) {
/* 114 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 115 */     } else if (i == 2) {
/* 116 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 117 */     } else if (i == 3) {
/* 118 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 119 */     } else if (i == 4) {
/* 120 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     } else {
/* 122 */       f = 0.1F;
/* 123 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */     } 
/*     */     
/* 126 */     return super.a(paramcj, paramInt1, paramInt2, paramInt3, paramah1, paramah2);
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 130 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 131 */     double d1 = (paramInt1 + 0.5F);
/* 132 */     double d2 = (paramInt2 + 0.7F);
/* 133 */     double d3 = (paramInt3 + 0.5F);
/* 134 */     double d4 = 0.2199999988079071D;
/* 135 */     double d5 = 0.27000001072883606D;
/* 136 */     if (i == 1) {
/* 137 */       paramcj.a("smoke", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 138 */       paramcj.a("flame", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 139 */     } else if (i == 2) {
/* 140 */       paramcj.a("smoke", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 141 */       paramcj.a("flame", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 142 */     } else if (i == 3) {
/* 143 */       paramcj.a("smoke", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
/* 144 */       paramcj.a("flame", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
/* 145 */     } else if (i == 4) {
/* 146 */       paramcj.a("smoke", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
/* 147 */       paramcj.a("flame", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
/*     */     } else {
/* 149 */       paramcj.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 150 */       paramcj.a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */