/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hk
/*     */   extends ln
/*     */ {
/*     */   protected hk(int paramInt1, int paramInt2) {
/*  12 */     super(paramInt1, paramInt2, fs.n);
/*  13 */     b(true);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  17 */     return null;
/*     */   }
/*     */   
/*     */   public int a() {
/*  21 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  29 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  33 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  37 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3))
/*  38 */       return true; 
/*  39 */     if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3))
/*  40 */       return true; 
/*  41 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1))
/*  42 */       return true; 
/*  43 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) {
/*  44 */       return true;
/*     */     }
/*  46 */     return false;
/*     */   }
/*     */   
/*     */   public void d(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  50 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  52 */     int j = i & 0x8;
/*  53 */     i &= 0x7;
/*     */     
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
/*     */     } 
/*  73 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  77 */     if (h(paramcj, paramInt1, paramInt2, paramInt3)) {
/*  78 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*  79 */       boolean bool = false;
/*     */       
/*  81 */       if (!paramcj.g(paramInt1 - 1, paramInt2, paramInt3) && i == 1) bool = true; 
/*  82 */       if (!paramcj.g(paramInt1 + 1, paramInt2, paramInt3) && i == 2) bool = true; 
/*  83 */       if (!paramcj.g(paramInt1, paramInt2, paramInt3 - 1) && i == 3) bool = true; 
/*  84 */       if (!paramcj.g(paramInt1, paramInt2, paramInt3 + 1) && i == 4) bool = true;
/*     */       
/*  86 */       if (bool) {
/*  87 */         b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  88 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  94 */     if (!a(paramcj, paramInt1, paramInt2, paramInt3)) {
/*  95 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/*  96 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*  97 */       return false;
/*     */     } 
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   public void a(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 103 */     int i = parammz.e(paramInt1, paramInt2, paramInt3);
/* 104 */     int j = i & 0x7;
/* 105 */     boolean bool = ((i & 0x8) > 0) ? true : false;
/*     */     
/* 107 */     float f1 = 0.375F;
/* 108 */     float f2 = 0.625F;
/* 109 */     float f3 = 0.1875F;
/* 110 */     float f4 = 0.125F;
/* 111 */     if (bool) f4 = 0.0625F;
/*     */     
/* 113 */     if (j == 1) {
/* 114 */       a(0.0F, f1, 0.5F - f3, f4, f2, 0.5F + f3);
/* 115 */     } else if (j == 2) {
/* 116 */       a(1.0F - f4, f1, 0.5F - f3, 1.0F, f2, 0.5F + f3);
/* 117 */     } else if (j == 3) {
/* 118 */       a(0.5F - f3, f1, 0.0F, 0.5F + f3, f2, f4);
/* 119 */     } else if (j == 4) {
/* 120 */       a(0.5F - f3, f1, 1.0F - f4, 0.5F + f3, f2, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 125 */     a(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 129 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 130 */     int j = i & 0x7;
/* 131 */     int k = 8 - (i & 0x8);
/* 132 */     if (k == 0) return true;
/*     */     
/* 134 */     paramcj.b(paramInt1, paramInt2, paramInt3, j + k);
/* 135 */     paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 137 */     paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     
/* 139 */     paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 140 */     if (j == 1) {
/* 141 */       paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 142 */     } else if (j == 2) {
/* 143 */       paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 144 */     } else if (j == 3) {
/* 145 */       paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 146 */     } else if (j == 4) {
/* 147 */       paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     } else {
/* 149 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     } 
/*     */     
/* 152 */     paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*     */     
/* 154 */     return true;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 158 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 159 */     if ((i & 0x8) > 0) {
/* 160 */       paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 161 */       int j = i & 0x7;
/* 162 */       if (j == 1) {
/* 163 */         paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 164 */       } else if (j == 2) {
/* 165 */         paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 166 */       } else if (j == 3) {
/* 167 */         paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 168 */       } else if (j == 4) {
/* 169 */         paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */       } else {
/* 171 */         paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */       } 
/*     */     } 
/* 174 */     super.b(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 178 */     return ((parammz.e(paramInt1, paramInt2, paramInt3) & 0x8) > 0);
/*     */   }
/*     */   
/*     */   public boolean c(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 182 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 183 */     if ((i & 0x8) == 0) return false; 
/* 184 */     int j = i & 0x7;
/*     */     
/* 186 */     if (j == 5 && paramInt4 == 1) return true; 
/* 187 */     if (j == 4 && paramInt4 == 2) return true; 
/* 188 */     if (j == 3 && paramInt4 == 3) return true; 
/* 189 */     if (j == 2 && paramInt4 == 4) return true; 
/* 190 */     if (j == 1 && paramInt4 == 5) return true;
/*     */     
/* 192 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 197 */     return true;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 201 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 202 */     if ((i & 0x8) == 0) {
/*     */       return;
/*     */     }
/* 205 */     paramcj.b(paramInt1, paramInt2, paramInt3, i & 0x7);
/*     */     
/* 207 */     paramcj.g(paramInt1, paramInt2, paramInt3, this.ba);
/* 208 */     int j = i & 0x7;
/* 209 */     if (j == 1) {
/* 210 */       paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/* 211 */     } else if (j == 2) {
/* 212 */       paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/* 213 */     } else if (j == 3) {
/* 214 */       paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/* 215 */     } else if (j == 4) {
/* 216 */       paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     } else {
/* 218 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*     */     } 
/*     */     
/* 221 */     paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/* 222 */     paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void e() {
/* 226 */     float f1 = 0.1875F;
/* 227 */     float f2 = 0.125F;
/* 228 */     float f3 = 0.125F;
/* 229 */     a(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */