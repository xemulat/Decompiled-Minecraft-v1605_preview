/*     */ package com.jcraft.jorbis;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Lsp
/*     */ {
/*     */   static final float M_PI = 3.1415927F;
/*     */   
/*     */   static void lsp_to_curve(float[] paramArrayOffloat1, int[] paramArrayOfint, int paramInt1, int paramInt2, float[] paramArrayOffloat2, int paramInt3, float paramFloat1, float paramFloat2) {
/*  46 */     float f = 3.1415927F / paramInt2; byte b;
/*  47 */     for (b = 0; b < paramInt3; b++)
/*  48 */       paramArrayOffloat2[b] = Lookup.coslook(paramArrayOffloat2[b]); 
/*  49 */     int i = paramInt3 / 2 * 2;
/*     */     
/*  51 */     b = 0;
/*  52 */     label35: while (b < paramInt1) {
/*  53 */       int j = paramArrayOfint[b];
/*  54 */       float f1 = 0.70710677F;
/*  55 */       float f2 = 0.70710677F;
/*  56 */       float f3 = Lookup.coslook(f * j);
/*     */       int k;
/*  58 */       for (k = 0; k < i; k += 2) {
/*  59 */         f2 *= paramArrayOffloat2[k] - f3;
/*  60 */         f1 *= paramArrayOffloat2[k + 1] - f3;
/*     */       } 
/*     */       
/*  63 */       if ((paramInt3 & 0x1) != 0) {
/*     */ 
/*     */         
/*  66 */         f2 *= paramArrayOffloat2[paramInt3 - 1] - f3;
/*  67 */         f2 *= f2;
/*  68 */         f1 *= f1 * (1.0F - f3 * f3);
/*     */       }
/*     */       else {
/*     */         
/*  72 */         f2 *= f2 * (1.0F + f3);
/*  73 */         f1 *= f1 * (1.0F - f3);
/*     */       } 
/*     */ 
/*     */       
/*  77 */       f2 = f1 + f2;
/*  78 */       k = Float.floatToIntBits(f2);
/*  79 */       int m = Integer.MAX_VALUE & k;
/*  80 */       int n = 0;
/*     */       
/*  82 */       if (m < 2139095040 && m != 0) {
/*     */ 
/*     */ 
/*     */         
/*  86 */         if (m < 8388608) {
/*  87 */           f2 = (float)(f2 * 3.3554432E7D);
/*  88 */           k = Float.floatToIntBits(f2);
/*  89 */           m = Integer.MAX_VALUE & k;
/*  90 */           n = -25;
/*     */         } 
/*  92 */         n += (m >>> 23) - 126;
/*  93 */         k = k & 0x807FFFFF | 0x3F000000;
/*  94 */         f2 = Float.intBitsToFloat(k);
/*     */       } 
/*     */       
/*  97 */       f2 = Lookup.fromdBlook(paramFloat1 * Lookup.invsqlook(f2) * Lookup.invsq2explook(n + paramInt3) - paramFloat2);
/*     */ 
/*     */       
/*     */       while (true) {
/* 101 */         paramArrayOffloat1[b++] = paramArrayOffloat1[b++] * f2;
/*     */         
/* 103 */         if (b < paramInt1) { if (paramArrayOfint[b] != j)
/*     */             continue label35; 
/*     */           continue; }
/*     */         
/*     */         continue label35;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Lsp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */