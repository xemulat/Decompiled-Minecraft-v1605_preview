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
/*     */ class Lpc
/*     */ {
/*  31 */   Drft fft = new Drft();
/*     */ 
/*     */ 
/*     */   
/*     */   int ln;
/*     */ 
/*     */   
/*     */   int m;
/*     */ 
/*     */ 
/*     */   
/*     */   static float lpc_from_data(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt1, int paramInt2) {
/*  43 */     float[] arrayOfFloat = new float[paramInt2 + 1];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  49 */     int i = paramInt2 + 1;
/*  50 */     while (i-- != 0) {
/*  51 */       float f1 = 0.0F;
/*  52 */       for (int j = i; j < paramInt1; j++)
/*  53 */         f1 += paramArrayOffloat1[j] * paramArrayOffloat1[j - i]; 
/*  54 */       arrayOfFloat[i] = f1;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  59 */     float f = arrayOfFloat[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     for (byte b = 0; b < paramInt2; b++) {
/*  68 */       float f1 = -arrayOfFloat[b + 1];
/*     */       
/*  70 */       if (f == 0.0F) {
/*  71 */         for (byte b1 = 0; b1 < paramInt2; b1++)
/*  72 */           paramArrayOffloat2[b1] = 0.0F; 
/*  73 */         return 0.0F;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  81 */       for (i = 0; i < b; i++)
/*  82 */         f1 -= paramArrayOffloat2[i] * arrayOfFloat[b - i]; 
/*  83 */       f1 /= f;
/*     */ 
/*     */ 
/*     */       
/*  87 */       paramArrayOffloat2[b] = f1;
/*  88 */       for (i = 0; i < b / 2; i++) {
/*  89 */         float f2 = paramArrayOffloat2[i];
/*  90 */         paramArrayOffloat2[i] = paramArrayOffloat2[i] + f1 * paramArrayOffloat2[b - 1 - i];
/*  91 */         paramArrayOffloat2[b - 1 - i] = paramArrayOffloat2[b - 1 - i] + f1 * f2;
/*     */       } 
/*  93 */       if (b % 2 != 0) {
/*  94 */         paramArrayOffloat2[i] = paramArrayOffloat2[i] + paramArrayOffloat2[i] * f1;
/*     */       }
/*  96 */       f = (float)(f * (1.0D - (f1 * f1)));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   float lpc_from_curve(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
/* 109 */     int i = this.ln;
/* 110 */     float[] arrayOfFloat = new float[i + i];
/* 111 */     float f = (float)(0.5D / i);
/*     */ 
/*     */     
/*     */     byte b;
/*     */     
/* 116 */     for (b = 0; b < i; b++) {
/* 117 */       arrayOfFloat[b * 2] = paramArrayOffloat1[b] * f;
/* 118 */       arrayOfFloat[b * 2 + 1] = 0.0F;
/*     */     } 
/* 120 */     arrayOfFloat[i * 2 - 1] = paramArrayOffloat1[i - 1] * f;
/*     */     
/* 122 */     i *= 2;
/* 123 */     this.fft.backward(arrayOfFloat);
/*     */ 
/*     */     
/*     */     int j;
/*     */     
/* 128 */     for (b = 0, j = i / 2; b < i / 2; ) {
/* 129 */       float f1 = arrayOfFloat[b];
/* 130 */       arrayOfFloat[b++] = arrayOfFloat[j];
/* 131 */       arrayOfFloat[j++] = f1;
/*     */     } 
/*     */     
/* 134 */     return lpc_from_data(arrayOfFloat, paramArrayOffloat2, i, this.m);
/*     */   }
/*     */   
/*     */   void init(int paramInt1, int paramInt2) {
/* 138 */     this.ln = paramInt1;
/* 139 */     this.m = paramInt2;
/*     */ 
/*     */     
/* 142 */     this.fft.init(paramInt1 * 2);
/*     */   }
/*     */   
/*     */   void clear() {
/* 146 */     this.fft.clear();
/*     */   }
/*     */   
/*     */   static float FAST_HYPOT(float paramFloat1, float paramFloat2) {
/* 150 */     return (float)Math.sqrt((paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void lpc_to_curve(float[] paramArrayOffloat1, float[] paramArrayOffloat2, float paramFloat) {
/*     */     int i;
/* 162 */     for (i = 0; i < this.ln * 2; i++) {
/* 163 */       paramArrayOffloat1[i] = 0.0F;
/*     */     }
/* 165 */     if (paramFloat == 0.0F) {
/*     */       return;
/*     */     }
/* 168 */     for (i = 0; i < this.m; i++) {
/* 169 */       paramArrayOffloat1[i * 2 + 1] = paramArrayOffloat2[i] / 4.0F * paramFloat;
/* 170 */       paramArrayOffloat1[i * 2 + 2] = -paramArrayOffloat2[i] / 4.0F * paramFloat;
/*     */     } 
/*     */     
/* 173 */     this.fft.backward(paramArrayOffloat1);
/*     */ 
/*     */     
/* 176 */     i = this.ln * 2;
/* 177 */     float f = (float)(1.0D / paramFloat);
/* 178 */     paramArrayOffloat1[0] = (float)(1.0D / (paramArrayOffloat1[0] * 2.0F + f));
/* 179 */     for (byte b = 1; b < this.ln; b++) {
/* 180 */       float f1 = paramArrayOffloat1[b] + paramArrayOffloat1[i - b];
/* 181 */       float f2 = paramArrayOffloat1[b] - paramArrayOffloat1[i - b];
/*     */       
/* 183 */       float f3 = f1 + f;
/* 184 */       paramArrayOffloat1[b] = (float)(1.0D / FAST_HYPOT(f3, f2));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Lpc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */