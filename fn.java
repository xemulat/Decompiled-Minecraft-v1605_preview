/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fn
/*     */   extends ln
/*     */ {
/*     */   protected fn(int paramInt, fs paramfs) {
/*  14 */     super(paramInt, paramfs);
/*  15 */     this.aZ = 97;
/*  16 */     if (paramfs == fs.e) this.aZ++;
/*     */     
/*  18 */     float f1 = 0.5F;
/*  19 */     float f2 = 1.0F;
/*  20 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/*  24 */     if (paramInt1 == 0 || paramInt1 == 1) return this.aZ; 
/*  25 */     int i = c(paramInt2);
/*  26 */     if ((((i == 0 || i == 2) ? 1 : 0) ^ ((paramInt1 <= 3) ? 1 : 0)) != 0) {
/*  27 */       return this.aZ;
/*     */     }
/*  29 */     int j = i / 2 + (paramInt1 & 0x1 ^ i);
/*  30 */     j += (paramInt2 & 0x4) / 4;
/*     */ 
/*     */ 
/*     */     
/*  34 */     int k = this.aZ - (paramInt2 & 0x8) * 2;
/*  35 */     if ((j & 0x1) != 0) {
/*  36 */       k = -k;
/*     */     }
/*     */ 
/*     */     
/*  40 */     return k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  48 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  52 */     return false;
/*     */   }
/*     */   
/*     */   public int f() {
/*  56 */     return 7;
/*     */   }
/*     */   
/*     */   public cb f(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  60 */     a(paramcj, paramInt1, paramInt2, paramInt3);
/*  61 */     return super.f(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  65 */     a(paramcj, paramInt1, paramInt2, paramInt3);
/*  66 */     return super.d(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/*  70 */     b(c(parammz.e(paramInt1, paramInt2, paramInt3)));
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*  74 */     float f = 0.1875F;
/*  75 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/*  76 */     if (paramInt == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
/*  77 */     if (paramInt == 1) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/*  78 */     if (paramInt == 2) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
/*  79 */     if (paramInt == 3) a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F); 
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/*  83 */     a(paramcj, paramInt1, paramInt2, paramInt3, paramdg);
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/*  87 */     if (this.bl == fs.e) return true;
/*     */     
/*  89 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  90 */     if ((i & 0x8) != 0) {
/*  91 */       if (paramcj.a(paramInt1, paramInt2 - 1, paramInt3) == this.ba) {
/*  92 */         a(paramcj, paramInt1, paramInt2 - 1, paramInt3, paramdg);
/*     */       }
/*  94 */       return true;
/*     */     } 
/*  96 */     if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) == this.ba) {
/*  97 */       paramcj.b(paramInt1, paramInt2 + 1, paramInt3, (i ^ 0x4) + 8);
/*     */     }
/*     */     
/* 100 */     paramcj.b(paramInt1, paramInt2, paramInt3, i ^ 0x4);
/* 101 */     paramcj.b(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 103 */     if (Math.random() < 0.5D) {
/* 104 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_open", 1.0F, paramcj.m.nextFloat() * 0.1F + 0.9F);
/*     */     } else {
/* 106 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_close", 1.0F, paramcj.m.nextFloat() * 0.1F + 0.9F);
/*     */     } 
/* 108 */     return true;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 112 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 114 */     if ((i & 0x8) != 0) {
/* 115 */       if (paramcj.a(paramInt1, paramInt2 - 1, paramInt3) == this.ba) {
/* 116 */         a(paramcj, paramInt1, paramInt2 - 1, paramInt3, paramBoolean);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 121 */     boolean bool = ((paramcj.e(paramInt1, paramInt2, paramInt3) & 0x4) > 0);
/* 122 */     if (bool == paramBoolean)
/*     */       return; 
/* 124 */     if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) == this.ba) {
/* 125 */       paramcj.b(paramInt1, paramInt2 + 1, paramInt3, (i ^ 0x4) + 8);
/*     */     }
/*     */     
/* 128 */     paramcj.b(paramInt1, paramInt2, paramInt3, i ^ 0x4);
/* 129 */     paramcj.b(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 131 */     if (Math.random() < 0.5D) {
/* 132 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_open", 1.0F, paramcj.m.nextFloat() * 0.1F + 0.9F);
/*     */     } else {
/* 134 */       paramcj.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.door_close", 1.0F, paramcj.m.nextFloat() * 0.1F + 0.9F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 140 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 141 */     if ((i & 0x8) != 0) {
/* 142 */       if (paramcj.a(paramInt1, paramInt2 - 1, paramInt3) != this.ba) {
/* 143 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */       }
/* 145 */       if (paramInt4 > 0 && ln.n[paramInt4].d()) {
/* 146 */         a(paramcj, paramInt1, paramInt2 - 1, paramInt3, paramInt4);
/*     */       }
/*     */     } else {
/* 149 */       boolean bool = false;
/* 150 */       if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) != this.ba) {
/* 151 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/* 152 */         bool = true;
/*     */       } 
/* 154 */       if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) {
/* 155 */         paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/* 156 */         bool = true;
/* 157 */         if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) == this.ba) {
/* 158 */           paramcj.d(paramInt1, paramInt2 + 1, paramInt3, 0);
/*     */         }
/*     */       } 
/* 161 */       if (bool) {
/* 162 */         b_(paramcj, paramInt1, paramInt2, paramInt3, i);
/*     */       }
/* 164 */       else if (paramInt4 > 0 && ln.n[paramInt4].d()) {
/* 165 */         boolean bool1 = (paramcj.p(paramInt1, paramInt2, paramInt3) || paramcj.p(paramInt1, paramInt2 + 1, paramInt3)) ? true : false;
/* 166 */         a(paramcj, paramInt1, paramInt2, paramInt3, bool1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 173 */     if ((paramInt & 0x8) != 0) return 0; 
/* 174 */     if (this.bl == fs.e) return dd.az.aQ; 
/* 175 */     return dd.at.aQ;
/*     */   }
/*     */   
/*     */   public lv a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, ah paramah1, ah paramah2) {
/* 179 */     a(paramcj, paramInt1, paramInt2, paramInt3);
/* 180 */     return super.a(paramcj, paramInt1, paramInt2, paramInt3, paramah1, paramah2);
/*     */   }
/*     */   
/*     */   public int c(int paramInt) {
/* 184 */     if ((paramInt & 0x4) == 0) {
/* 185 */       return paramInt - 1 & 0x3;
/*     */     }
/* 187 */     return paramInt & 0x3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 192 */     if (paramInt2 >= 127) return false;
/*     */     
/* 194 */     return (paramcj.g(paramInt1, paramInt2 - 1, paramInt3) && super.a(paramcj, paramInt1, paramInt2, paramInt3) && super.a(paramcj, paramInt1, paramInt2 + 1, paramInt3));
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */