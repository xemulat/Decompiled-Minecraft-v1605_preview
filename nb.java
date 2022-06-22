/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class nb
/*     */   extends ln
/*     */ {
/*     */   protected nb(int paramInt1, int paramInt2) {
/*  10 */     super(paramInt1, paramInt2, fs.n);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  14 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  30 */     return 12;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  34 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3))
/*  35 */       return true; 
/*  36 */     if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3))
/*  37 */       return true; 
/*  38 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1))
/*  39 */       return true; 
/*  40 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1))
/*  41 */       return true; 
/*  42 */     if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) {
/*  43 */       return true;
/*     */     }
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public void d(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  49 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  51 */     int j = i & 0x8;
/*  52 */     i &= 0x7;
/*     */     
/*  54 */     if (paramInt4 == 1 && paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) i = 5 + paramcj.m.nextInt(2); 
/*  55 */     if (paramInt4 == 2 && paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) i = 4; 
/*  56 */     if (paramInt4 == 3 && paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/*  57 */     if (paramInt4 == 4 && paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) i = 2; 
/*  58 */     if (paramInt4 == 5 && paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) i = 1;
/*     */     
/*  60 */     paramcj.b(paramInt1, paramInt2, paramInt3, i + j);
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  64 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) {
/*  65 */       paramcj.b(paramInt1, paramInt2, paramInt3, 1);
/*  66 */     } else if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) {
/*  67 */       paramcj.b(paramInt1, paramInt2, paramInt3, 2);
/*  68 */     } else if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) {
/*  69 */       paramcj.b(paramInt1, paramInt2, paramInt3, 3);
/*  70 */     } else if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) {
/*  71 */       paramcj.b(paramInt1, paramInt2, paramInt3, 4);
/*  72 */     } else if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) {
/*  73 */       paramcj.b(paramInt1, paramInt2, paramInt3, 5 + paramcj.m.nextInt(2));
/*     */     } 
/*  75 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  79 */     if (h(paramcj, paramInt1, paramInt2, paramInt3)) {
/*  80 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*  81 */       boolean bool = false;
/*     */       
/*  83 */       if (!paramcj.g(paramInt1 - 1, paramInt2, paramInt3) && i == 1) bool = true; 
/*  84 */       if (!paramcj.g(paramInt1 + 1, paramInt2, paramInt3) && i == 2) bool = true; 
/*  85 */       if (!paramcj.g(paramInt1, paramInt2, paramInt3 - 1) && i == 3) bool = true; 
/*  86 */       if (!paramcj.g(paramInt1, paramInt2, paramInt3 + 1) && i == 4) bool = true; 
/*  87 */       if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3) && i == 5) bool = true;
/*     */       
/*  89 */       if (bool) {
/*  90 */         b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  91 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  97 */     if (!a(paramcj, paramInt1, paramInt2, paramInt3)) {
/*  98 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  99 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/* 100 */       return false;
/*     */     } 
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   public void a(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 106 */     int i = parammz.e(paramInt1, paramInt2, paramInt3) & 0x7;
/* 107 */     float f = 0.1875F;
/* 108 */     if (i == 1) {
/* 109 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 110 */     } else if (i == 2) {
/* 111 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 112 */     } else if (i == 3) {
/* 113 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 114 */     } else if (i == 4) {
/* 115 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     } else {
/* 117 */       f = 0.25F;
/* 118 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 123 */     a(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 127 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 128 */     int j = i & 0x7;
/* 129 */     int k = 8 - (i & 0x8);
/*     */     
/* 131 */     paramcj.b(paramInt1, paramInt2, paramInt3, j + k);
/* 132 */     paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 134 */     paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, (k > 0) ? 0.6F : 0.5F);
/*     */     
/* 136 */     paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 137 */     if (j == 1) {
/* 138 */       paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 139 */     } else if (j == 2) {
/* 140 */       paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 141 */     } else if (j == 3) {
/* 142 */       paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 143 */     } else if (j == 4) {
/* 144 */       paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     } else {
/* 146 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     } 
/*     */     
/* 149 */     return true;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 153 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 154 */     if ((i & 0x8) > 0) {
/* 155 */       paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 156 */       int j = i & 0x7;
/* 157 */       if (j == 1) {
/* 158 */         paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 159 */       } else if (j == 2) {
/* 160 */         paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 161 */       } else if (j == 3) {
/* 162 */         paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 163 */       } else if (j == 4) {
/* 164 */         paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */       } else {
/* 166 */         paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */       } 
/*     */     } 
/* 169 */     super.b(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 173 */     return ((parammz.e(paramInt1, paramInt2, paramInt3) & 0x8) > 0);
/*     */   }
/*     */   
/*     */   public boolean c(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 177 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 178 */     if ((i & 0x8) == 0) return false; 
/* 179 */     int j = i & 0x7;
/*     */     
/* 181 */     if (j == 5 && paramInt4 == 1) return true; 
/* 182 */     if (j == 4 && paramInt4 == 2) return true; 
/* 183 */     if (j == 3 && paramInt4 == 3) return true; 
/* 184 */     if (j == 2 && paramInt4 == 4) return true; 
/* 185 */     if (j == 1 && paramInt4 == 5) return true;
/*     */     
/* 187 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 192 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */