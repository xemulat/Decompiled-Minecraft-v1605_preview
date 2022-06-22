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
/*     */ class Mdct
/*     */ {
/*     */   int n;
/*     */   int log2n;
/*     */   float[] trig;
/*     */   int[] bitrev;
/*     */   float scale;
/*     */   
/*     */   void init(int paramInt) {
/*  40 */     this.bitrev = new int[paramInt / 4];
/*  41 */     this.trig = new float[paramInt + paramInt / 4];
/*     */     
/*  43 */     this.log2n = (int)Math.rint(Math.log(paramInt) / Math.log(2.0D));
/*  44 */     this.n = paramInt;
/*     */     
/*  46 */     byte b1 = 0;
/*  47 */     byte b2 = 1;
/*  48 */     int i = b1 + paramInt / 2;
/*  49 */     int j = i + 1;
/*  50 */     int k = i + paramInt / 2;
/*  51 */     int m = k + 1;
/*     */     int n;
/*  53 */     for (n = 0; n < paramInt / 4; n++) {
/*  54 */       this.trig[b1 + n * 2] = (float)Math.cos(Math.PI / paramInt * (4 * n));
/*  55 */       this.trig[b2 + n * 2] = (float)-Math.sin(Math.PI / paramInt * (4 * n));
/*  56 */       this.trig[i + n * 2] = (float)Math.cos(Math.PI / (2 * paramInt) * (2 * n + 1));
/*  57 */       this.trig[j + n * 2] = (float)Math.sin(Math.PI / (2 * paramInt) * (2 * n + 1));
/*     */     } 
/*  59 */     for (n = 0; n < paramInt / 8; n++) {
/*  60 */       this.trig[k + n * 2] = (float)Math.cos(Math.PI / paramInt * (4 * n + 2));
/*  61 */       this.trig[m + n * 2] = (float)-Math.sin(Math.PI / paramInt * (4 * n + 2));
/*     */     } 
/*     */ 
/*     */     
/*  65 */     n = (1 << this.log2n - 1) - 1;
/*  66 */     int i1 = 1 << this.log2n - 2;
/*  67 */     for (byte b3 = 0; b3 < paramInt / 8; b3++) {
/*  68 */       int i2 = 0;
/*  69 */       for (byte b = 0; i1 >>> b != 0; b++) {
/*  70 */         if ((i1 >>> b & b3) != 0)
/*  71 */           i2 |= 1 << b; 
/*  72 */       }  this.bitrev[b3 * 2] = (i2 ^ 0xFFFFFFFF) & n;
/*     */       
/*  74 */       this.bitrev[b3 * 2 + 1] = i2;
/*     */     } 
/*     */     
/*  77 */     this.scale = 4.0F / paramInt;
/*     */   }
/*     */ 
/*     */   
/*     */   void clear() {}
/*     */ 
/*     */   
/*     */   void forward(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {}
/*     */   
/*  86 */   float[] _x = new float[1024];
/*  87 */   float[] _w = new float[1024];
/*     */   
/*     */   synchronized void backward(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
/*  90 */     if (this._x.length < this.n / 2) {
/*  91 */       this._x = new float[this.n / 2];
/*     */     }
/*  93 */     if (this._w.length < this.n / 2) {
/*  94 */       this._w = new float[this.n / 2];
/*     */     }
/*  96 */     float[] arrayOfFloat1 = this._x;
/*  97 */     float[] arrayOfFloat2 = this._w;
/*  98 */     int i = this.n >>> 1;
/*  99 */     int j = this.n >>> 2;
/* 100 */     int k = this.n >>> 3;
/*     */ 
/*     */ 
/*     */     
/* 104 */     int m = 1;
/* 105 */     byte b1 = 0;
/* 106 */     int n = i;
/*     */     
/*     */     int i1;
/* 109 */     for (i1 = 0; i1 < k; i1++) {
/* 110 */       n -= 2;
/* 111 */       arrayOfFloat1[b1++] = -paramArrayOffloat1[m + 2] * this.trig[n + 1] - paramArrayOffloat1[m] * this.trig[n];
/* 112 */       arrayOfFloat1[b1++] = paramArrayOffloat1[m] * this.trig[n + 1] - paramArrayOffloat1[m + 2] * this.trig[n];
/* 113 */       m += 4;
/*     */     } 
/*     */     
/* 116 */     m = i - 4;
/*     */     
/* 118 */     for (i1 = 0; i1 < k; i1++) {
/* 119 */       n -= 2;
/* 120 */       arrayOfFloat1[b1++] = paramArrayOffloat1[m] * this.trig[n + 1] + paramArrayOffloat1[m + 2] * this.trig[n];
/* 121 */       arrayOfFloat1[b1++] = paramArrayOffloat1[m] * this.trig[n] - paramArrayOffloat1[m + 2] * this.trig[n + 1];
/* 122 */       m -= 4;
/*     */     } 
/*     */ 
/*     */     
/* 126 */     float[] arrayOfFloat3 = mdct_kernel(arrayOfFloat1, arrayOfFloat2, this.n, i, j, k);
/* 127 */     b1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     n = i;
/* 133 */     i1 = j; int i2 = i1 - 1;
/* 134 */     int i3 = j + i, i4 = i3 - 1;
/*     */     
/* 136 */     for (byte b2 = 0; b2 < j; b2++) {
/* 137 */       float f1 = arrayOfFloat3[b1] * this.trig[n + 1] - arrayOfFloat3[b1 + 1] * this.trig[n];
/* 138 */       float f2 = -(arrayOfFloat3[b1] * this.trig[n] + arrayOfFloat3[b1 + 1] * this.trig[n + 1]);
/*     */       
/* 140 */       paramArrayOffloat2[i1] = -f1;
/* 141 */       paramArrayOffloat2[i2] = f1;
/* 142 */       paramArrayOffloat2[i3] = f2;
/* 143 */       paramArrayOffloat2[i4] = f2;
/*     */       
/* 145 */       i1++;
/* 146 */       i2--;
/* 147 */       i3++;
/* 148 */       i4--;
/* 149 */       b1 += 2;
/* 150 */       n += 2;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private float[] mdct_kernel(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 159 */     int i = paramInt3;
/* 160 */     byte b1 = 0;
/* 161 */     int j = paramInt3;
/* 162 */     int k = paramInt2;
/*     */     int m;
/* 164 */     for (m = 0; m < paramInt3; ) {
/* 165 */       float f1 = paramArrayOffloat1[i] - paramArrayOffloat1[b1];
/*     */       
/* 167 */       paramArrayOffloat2[j + m] = paramArrayOffloat1[i++] + paramArrayOffloat1[b1++];
/*     */       
/* 169 */       float f2 = paramArrayOffloat1[i] - paramArrayOffloat1[b1];
/* 170 */       k -= 4;
/*     */       
/* 172 */       paramArrayOffloat2[m++] = f1 * this.trig[k] + f2 * this.trig[k + 1];
/* 173 */       paramArrayOffloat2[m] = f2 * this.trig[k] - f1 * this.trig[k + 1];
/*     */       
/* 175 */       paramArrayOffloat2[j + m] = paramArrayOffloat1[i++] + paramArrayOffloat1[b1++];
/* 176 */       m++;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     for (m = 0; m < this.log2n - 3; m++) {
/* 183 */       int i1 = paramInt1 >>> m + 2;
/* 184 */       int i2 = 1 << m + 3;
/* 185 */       int i3 = paramInt2 - 2;
/*     */       
/* 187 */       k = 0;
/*     */ 
/*     */       
/* 190 */       for (byte b = 0; b < i1 >>> 2; b++) {
/* 191 */         int i4 = i3;
/* 192 */         j = i4 - (i1 >> 1);
/* 193 */         float f1 = this.trig[k];
/* 194 */         float f2 = this.trig[k + 1];
/* 195 */         i3 -= 2;
/*     */         
/* 197 */         i1++;
/* 198 */         for (byte b5 = 0; b5 < 2 << m; b5++) {
/* 199 */           float f4 = paramArrayOffloat2[i4] - paramArrayOffloat2[j];
/* 200 */           paramArrayOffloat1[i4] = paramArrayOffloat2[i4] + paramArrayOffloat2[j];
/*     */           
/* 202 */           float f3 = paramArrayOffloat2[++i4] - paramArrayOffloat2[++j];
/* 203 */           paramArrayOffloat1[i4] = paramArrayOffloat2[i4] + paramArrayOffloat2[j];
/*     */           
/* 205 */           paramArrayOffloat1[j] = f3 * f1 - f4 * f2;
/* 206 */           paramArrayOffloat1[j - 1] = f4 * f1 + f3 * f2;
/*     */           
/* 208 */           i4 -= i1;
/* 209 */           j -= i1;
/*     */         } 
/* 211 */         i1--;
/* 212 */         k += i2;
/*     */       } 
/*     */       
/* 215 */       float[] arrayOfFloat = paramArrayOffloat2;
/* 216 */       paramArrayOffloat2 = paramArrayOffloat1;
/* 217 */       paramArrayOffloat1 = arrayOfFloat;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     m = paramInt1;
/* 224 */     byte b2 = 0;
/* 225 */     byte b3 = 0;
/* 226 */     int n = paramInt2 - 1;
/*     */     
/* 228 */     for (byte b4 = 0; b4 < paramInt4; b4++) {
/* 229 */       int i1 = this.bitrev[b2++];
/* 230 */       int i2 = this.bitrev[b2++];
/*     */       
/* 232 */       float f1 = paramArrayOffloat2[i1] - paramArrayOffloat2[i2 + 1];
/* 233 */       float f2 = paramArrayOffloat2[i1 - 1] + paramArrayOffloat2[i2];
/* 234 */       float f3 = paramArrayOffloat2[i1] + paramArrayOffloat2[i2 + 1];
/* 235 */       float f4 = paramArrayOffloat2[i1 - 1] - paramArrayOffloat2[i2];
/*     */       
/* 237 */       float f5 = f1 * this.trig[m];
/* 238 */       float f6 = f2 * this.trig[m++];
/* 239 */       float f7 = f1 * this.trig[m];
/* 240 */       float f8 = f2 * this.trig[m++];
/*     */       
/* 242 */       paramArrayOffloat1[b3++] = (f3 + f7 + f6) * 0.5F;
/* 243 */       paramArrayOffloat1[n--] = (-f4 + f8 - f5) * 0.5F;
/* 244 */       paramArrayOffloat1[b3++] = (f4 + f8 - f5) * 0.5F;
/* 245 */       paramArrayOffloat1[n--] = (f3 - f7 - f6) * 0.5F;
/*     */     } 
/*     */     
/* 248 */     return paramArrayOffloat1;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Mdct.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */