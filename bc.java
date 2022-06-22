/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bc
/*     */   extends lz
/*     */ {
/*     */   private boolean a = false;
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/*  26 */     if (paramInt1 == 1) return ln.av.a(paramInt1, paramInt2); 
/*  27 */     return super.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*  30 */   private static List b = new ArrayList();
/*     */   
/*     */   private boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  33 */     if (paramBoolean) b.add(new nc(paramInt1, paramInt2, paramInt3, paramcj.c)); 
/*  34 */     byte b1 = 0;
/*  35 */     for (byte b2 = 0; b2 < b.size(); b2++) {
/*  36 */       nc nc = b.get(b2);
/*     */       
/*  38 */       b1++;
/*  39 */       if (nc.a == paramInt1 && nc.b == paramInt2 && nc.c == paramInt3 && b1 >= 8) {
/*  40 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   protected bc(int paramInt1, int paramInt2, boolean paramBoolean) {
/*  48 */     super(paramInt1, paramInt2);
/*  49 */     this.a = paramBoolean;
/*  50 */     b(true);
/*     */   }
/*     */   
/*     */   public int a() {
/*  54 */     return 2;
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  58 */     if (paramcj.e(paramInt1, paramInt2, paramInt3) == 0) super.e(paramcj, paramInt1, paramInt2, paramInt3); 
/*  59 */     if (this.a) {
/*  60 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*  61 */       paramcj.g(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/*  62 */       paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/*  63 */       paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/*  64 */       paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/*  65 */       paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  70 */     if (this.a) {
/*  71 */       paramcj.g(paramInt1, paramInt2 - 1, paramInt3, this.ba);
/*  72 */       paramcj.g(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/*  73 */       paramcj.g(paramInt1 - 1, paramInt2, paramInt3, this.ba);
/*  74 */       paramcj.g(paramInt1 + 1, paramInt2, paramInt3, this.ba);
/*  75 */       paramcj.g(paramInt1, paramInt2, paramInt3 - 1, this.ba);
/*  76 */       paramcj.g(paramInt1, paramInt2, paramInt3 + 1, this.ba);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  81 */     if (!this.a) return false;
/*     */     
/*  83 */     int i = parammz.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  85 */     if (i == 5 && paramInt4 == 1) return false; 
/*  86 */     if (i == 3 && paramInt4 == 3) return false; 
/*  87 */     if (i == 4 && paramInt4 == 2) return false; 
/*  88 */     if (i == 1 && paramInt4 == 5) return false; 
/*  89 */     if (i == 2 && paramInt4 == 4) return false;
/*     */     
/*  91 */     return true;
/*     */   }
/*     */   
/*     */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  95 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  97 */     if (i == 5 && paramcj.k(paramInt1, paramInt2 - 1, paramInt3, 0)) return true; 
/*  98 */     if (i == 3 && paramcj.k(paramInt1, paramInt2, paramInt3 - 1, 2)) return true; 
/*  99 */     if (i == 4 && paramcj.k(paramInt1, paramInt2, paramInt3 + 1, 3)) return true; 
/* 100 */     if (i == 1 && paramcj.k(paramInt1 - 1, paramInt2, paramInt3, 4)) return true; 
/* 101 */     if (i == 2 && paramcj.k(paramInt1 + 1, paramInt2, paramInt3, 5)) return true; 
/* 102 */     return false;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 106 */     boolean bool = h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */     
/* 108 */     while (b.size() > 0 && paramcj.c - ((nc)b.get(0)).d > 100L) {
/* 109 */       b.remove(0);
/*     */     }
/*     */     
/* 112 */     if (this.a) {
/* 113 */       if (bool) {
/* 114 */         paramcj.b(paramInt1, paramInt2, paramInt3, ln.aP.ba, paramcj.e(paramInt1, paramInt2, paramInt3));
/*     */         
/* 116 */         if (a(paramcj, paramInt1, paramInt2, paramInt3, true)) {
/* 117 */           paramcj.a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "random.fizz", 0.5F, 2.6F + (paramcj.m.nextFloat() - paramcj.m.nextFloat()) * 0.8F);
/* 118 */           for (byte b = 0; b < 5; b++) {
/* 119 */             double d1 = paramInt1 + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 120 */             double d2 = paramInt2 + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 121 */             double d3 = paramInt3 + paramRandom.nextDouble() * 0.6D + 0.2D;
/*     */             
/* 123 */             paramcj.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */         
/*     */         } 
/*     */       } 
/* 128 */     } else if (!bool && 
/* 129 */       !a(paramcj, paramInt1, paramInt2, paramInt3, false)) {
/* 130 */       paramcj.b(paramInt1, paramInt2, paramInt3, ln.aQ.ba, paramcj.e(paramInt1, paramInt2, paramInt3));
/*     */     } 
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
/*     */ 
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 146 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/* 147 */     paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*     */   }
/*     */   
/*     */   public boolean c(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 151 */     if (paramInt4 == 0) {
/* 152 */       return b(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/* 154 */     return false;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom) {
/* 158 */     return ln.aQ.ba;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 162 */     return true;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 166 */     if (!this.a)
/* 167 */       return;  int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 168 */     double d1 = (paramInt1 + 0.5F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 169 */     double d2 = (paramInt2 + 0.7F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 170 */     double d3 = (paramInt3 + 0.5F) + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 171 */     double d4 = 0.2199999988079071D;
/* 172 */     double d5 = 0.27000001072883606D;
/* 173 */     if (i == 1) {
/* 174 */       paramcj.a("reddust", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 175 */     } else if (i == 2) {
/* 176 */       paramcj.a("reddust", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 177 */     } else if (i == 3) {
/* 178 */       paramcj.a("reddust", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
/* 179 */     } else if (i == 4) {
/* 180 */       paramcj.a("reddust", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
/*     */     } else {
/* 182 */       paramcj.a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */