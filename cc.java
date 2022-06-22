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
/*     */ public class cc
/*     */   extends ia
/*     */ {
/*     */   public boolean a(cj paramcj, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/*  16 */     byte b1 = 3;
/*  17 */     int i = paramRandom.nextInt(2) + 2;
/*  18 */     int j = paramRandom.nextInt(2) + 2;
/*     */     
/*  20 */     byte b2 = 0; int k;
/*  21 */     for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
/*  22 */       for (int m = paramInt2 - 1; m <= paramInt2 + b1 + 1; m++) {
/*  23 */         for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
/*  24 */           fs fs = paramcj.f(k, m, n);
/*  25 */           if (m == paramInt2 - 1 && !fs.a()) return false; 
/*  26 */           if (m == paramInt2 + b1 + 1 && !fs.a()) return false;
/*     */           
/*  28 */           if ((k == paramInt1 - i - 1 || k == paramInt1 + i + 1 || n == paramInt3 - j - 1 || n == paramInt3 + j + 1) && 
/*  29 */             m == paramInt2 && paramcj.a(k, m, n) == 0 && paramcj.a(k, m + 1, n) == 0) {
/*  30 */             b2++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  38 */     if (b2 < 1 || b2 > 5) return false;
/*     */     
/*  40 */     for (k = paramInt1 - i - 1; k <= paramInt1 + i + 1; k++) {
/*  41 */       for (int m = paramInt2 + b1; m >= paramInt2 - 1; m--) {
/*  42 */         for (int n = paramInt3 - j - 1; n <= paramInt3 + j + 1; n++) {
/*     */           
/*  44 */           if (k == paramInt1 - i - 1 || m == paramInt2 - 1 || n == paramInt3 - j - 1 || k == paramInt1 + i + 1 || m == paramInt2 + b1 + 1 || n == paramInt3 + j + 1) {
/*  45 */             if (m >= 0 && !paramcj.f(k, m - 1, n).a()) {
/*  46 */               paramcj.d(k, m, n, 0);
/*  47 */             } else if (paramcj.f(k, m, n).a()) {
/*  48 */               if (m == paramInt2 - 1 && paramRandom.nextInt(4) != 0) {
/*  49 */                 paramcj.d(k, m, n, ln.ao.ba);
/*     */               } else {
/*  51 */                 paramcj.d(k, m, n, ln.w.ba);
/*     */               } 
/*     */             } 
/*     */           } else {
/*  55 */             paramcj.d(k, m, n, 0);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  61 */     for (k = 0; k < 2; k++) {
/*  62 */       for (byte b = 0; b < 3; b++) {
/*  63 */         int m = paramInt1 + paramRandom.nextInt(i * 2 + 1) - i;
/*  64 */         int n = paramInt2;
/*  65 */         int i1 = paramInt3 + paramRandom.nextInt(j * 2 + 1) - j;
/*  66 */         if (paramcj.a(m, n, i1) == 0) {
/*     */           
/*  68 */           byte b3 = 0;
/*  69 */           if (paramcj.f(m - 1, n, i1).a()) b3++; 
/*  70 */           if (paramcj.f(m + 1, n, i1).a()) b3++; 
/*  71 */           if (paramcj.f(m, n, i1 - 1).a()) b3++; 
/*  72 */           if (paramcj.f(m, n, i1 + 1).a()) b3++;
/*     */           
/*  74 */           if (b3 == 1) {
/*     */             
/*  76 */             paramcj.d(m, n, i1, ln.au.ba);
/*  77 */             ew ew = (ew)paramcj.b(m, n, i1);
/*  78 */             for (byte b4 = 0; b4 < 8; b4++) {
/*  79 */               eo eo = a(paramRandom);
/*  80 */               if (eo != null) ew.a(paramRandom.nextInt(ew.a()), eo);
/*     */             
/*     */             } 
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  88 */     paramcj.d(paramInt1, paramInt2, paramInt3, ln.as.ba);
/*  89 */     ba ba = (ba)paramcj.b(paramInt1, paramInt2, paramInt3);
/*  90 */     ba.b = b(paramRandom);
/*     */ 
/*     */     
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   private eo a(Random paramRandom) {
/*  97 */     int i = paramRandom.nextInt(11);
/*  98 */     if (i == 0) return new eo(dd.ay); 
/*  99 */     if (i == 1) return new eo(dd.m, paramRandom.nextInt(4) + 1); 
/* 100 */     if (i == 2) return new eo(dd.S); 
/* 101 */     if (i == 3) return new eo(dd.R, paramRandom.nextInt(4) + 1); 
/* 102 */     if (i == 4) return new eo(dd.K, paramRandom.nextInt(4) + 1); 
/* 103 */     if (i == 5) return new eo(dd.I, paramRandom.nextInt(4) + 1); 
/* 104 */     if (i == 6) return new eo(dd.au); 
/* 105 */     if (i == 7 && paramRandom.nextInt(100) == 0) return new eo(dd.ar); 
/* 106 */     if (i == 8 && paramRandom.nextInt(2) == 0) return new eo(dd.aA, paramRandom.nextInt(4) + 1); 
/* 107 */     if (i == 9 && paramRandom.nextInt(10) == 0) return new eo(dd.c[dd.aO.aQ + paramRandom.nextInt(2)]);
/*     */     
/* 109 */     return null;
/*     */   }
/*     */   
/*     */   private String b(Random paramRandom) {
/* 113 */     int i = paramRandom.nextInt(4);
/* 114 */     if (i == 0) return "Skeleton"; 
/* 115 */     if (i == 1) return "Zombie"; 
/* 116 */     if (i == 2) return "Zombie"; 
/* 117 */     if (i == 3) return "Spider"; 
/* 118 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */