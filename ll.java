/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.util.Arrays;
/*     */ import javax.imageio.ImageIO;
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
/*     */ public class ll
/*     */ {
/*  17 */   private float[] a = new float[768];
/*     */   
/*  19 */   private int[] b = new int[5120];
/*  20 */   private int[] c = new int[5120];
/*  21 */   private int[] d = new int[5120];
/*  22 */   private int[] e = new int[5120];
/*  23 */   private int[] f = new int[34];
/*  24 */   private int[] g = new int[768];
/*     */   
/*     */   public ll() {
/*     */     try {
/*  28 */       BufferedImage bufferedImage = ImageIO.read(ll.class.getResource("/terrain.png"));
/*  29 */       int[] arrayOfInt = new int[65536];
/*  30 */       bufferedImage.getRGB(0, 0, 256, 256, arrayOfInt, 0, 256);
/*  31 */       for (byte b1 = 0; b1 < 'Ā'; b1++) {
/*  32 */         int i = 0;
/*  33 */         int j = 0;
/*  34 */         int k = 0;
/*  35 */         int m = b1 % 16 * 16;
/*  36 */         int n = b1 / 16 * 16;
/*  37 */         byte b2 = 0;
/*  38 */         for (byte b3 = 0; b3 < 16; b3++) {
/*  39 */           for (byte b4 = 0; b4 < 16; b4++) {
/*  40 */             int i1 = arrayOfInt[b4 + m + (b3 + n) * 256];
/*  41 */             int i2 = i1 >> 24 & 0xFF;
/*  42 */             if (i2 > 128) {
/*  43 */               i += i1 >> 16 & 0xFF;
/*  44 */               j += i1 >> 8 & 0xFF;
/*  45 */               k += i1 & 0xFF;
/*  46 */               b2++;
/*     */             } 
/*     */           } 
/*  49 */           if (b2 == 0) b2++; 
/*  50 */           this.a[b1 * 3 + 0] = (i / b2);
/*  51 */           this.a[b1 * 3 + 1] = (j / b2);
/*  52 */           this.a[b1 * 3 + 2] = (k / b2);
/*     */         } 
/*     */       } 
/*  55 */     } catch (IOException iOException) {
/*  56 */       iOException.printStackTrace();
/*     */     } 
/*     */     
/*  59 */     for (byte b = 0; b < 'Ā'; b++) {
/*  60 */       if (ln.n[b] != null) {
/*  61 */         this.g[b * 3 + 0] = ln.n[b].a(1);
/*  62 */         this.g[b * 3 + 1] = ln.n[b].a(2);
/*  63 */         this.g[b * 3 + 2] = ln.n[b].a(3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(iz paramiz) {
/*  70 */     cj cj = paramiz.b;
/*  71 */     if (cj == null) {
/*  72 */       paramiz.f = true;
/*  73 */       paramiz.e = true;
/*     */       
/*     */       return;
/*     */     } 
/*  77 */     int i = paramiz.c * 16;
/*  78 */     int j = paramiz.d * 16;
/*  79 */     int k = i + 16;
/*  80 */     int m = j + 16;
/*  81 */     fr fr = cj.b(paramiz.c, paramiz.d);
/*  82 */     if (fr.q) {
/*  83 */       paramiz.f = true;
/*  84 */       paramiz.e = true;
/*     */       return;
/*     */     } 
/*  87 */     paramiz.f = false;
/*     */ 
/*     */     
/*  90 */     Arrays.fill(this.c, 0);
/*  91 */     Arrays.fill(this.d, 0);
/*  92 */     Arrays.fill(this.f, 160);
/*     */     
/*  94 */     for (int n = m - 1; n >= j; n--) {
/*  95 */       for (int i1 = k - 1; i1 >= i; i1--) {
/*  96 */         int i2 = i1 - i;
/*  97 */         int i3 = n - j;
/*     */         
/*  99 */         int i4 = i2 + i3;
/* 100 */         boolean bool = true;
/* 101 */         for (byte b = 0; b < ''; b++) {
/* 102 */           int i5 = i3 - i2 - b + 160 - 16;
/*     */           
/* 104 */           if (i5 < this.f[i4] || i5 < this.f[i4 + 1]) {
/*     */ 
/*     */             
/* 107 */             ln ln = ln.n[cj.a(i1, b, n)];
/* 108 */             if (ln == null)
/* 109 */             { bool = false; }
/*     */             
/* 111 */             else if (ln.bl == fs.f)
/* 112 */             { int i6 = cj.a(i1, b + 1, n);
/* 113 */               if (i6 == 0 || (ln.n[i6]).bl != fs.f) {
/* 114 */                 float f1 = b / 127.0F * 0.6F + 0.4F;
/* 115 */                 float f2 = cj.c(i1, b + 1, n) * f1;
/*     */                 
/* 117 */                 if (i5 >= 0 && i5 < 160) {
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 122 */                   int i7 = i4 + i5 * 32;
/*     */                   
/* 124 */                   if (i4 >= 0 && i4 <= 32 && 
/* 125 */                     this.d[i7] <= b) {
/* 126 */                     this.d[i7] = b;
/* 127 */                     this.e[i7] = (int)(f2 * 127.0F);
/*     */                   } 
/*     */                   
/* 130 */                   if (i4 >= -1 && i4 <= 31 && 
/* 131 */                     this.d[i7 + 1] <= b) {
/* 132 */                     this.d[i7 + 1] = b;
/* 133 */                     this.e[i7 + 1] = (int)(f2 * 127.0F);
/*     */                   } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 140 */                   bool = false;
/*     */                 } 
/*     */               }  }
/* 143 */             else { if (bool) {
/* 144 */                 if (i5 < this.f[i4]) this.f[i4] = i5; 
/* 145 */                 if (i5 < this.f[i4 + 1]) this.f[i4 + 1] = i5;
/*     */               
/*     */               } 
/* 148 */               float f = b / 127.0F * 0.6F + 0.4F;
/*     */               
/* 150 */               if (i5 >= 0 && i5 < 160) {
/* 151 */                 int i6 = i4 + i5 * 32;
/* 152 */                 int i7 = this.g[ln.ba * 3 + 0];
/* 153 */                 float f1 = (cj.c(i1, b + 1, n) * 0.8F + 0.2F) * f;
/* 154 */                 int i8 = i7;
/*     */                 
/* 156 */                 if (i4 >= 0) {
/* 157 */                   float f2 = f1;
/* 158 */                   if (this.c[i6] <= b) {
/* 159 */                     this.c[i6] = b;
/* 160 */                     this.b[i6] = 0xFF000000 | (int)(this.a[i8 * 3 + 0] * f2) << 16 | (int)(this.a[i8 * 3 + 1] * f2) << 8 | (int)(this.a[i8 * 3 + 2] * f2);
/*     */                   } 
/*     */                 } 
/* 163 */                 if (i4 < 31) {
/* 164 */                   float f2 = f1 * 0.9F;
/* 165 */                   if (this.c[i6 + 1] <= b) {
/* 166 */                     this.c[i6 + 1] = b;
/* 167 */                     this.b[i6 + 1] = 0xFF000000 | (int)(this.a[i8 * 3 + 0] * f2) << 16 | (int)(this.a[i8 * 3 + 1] * f2) << 8 | (int)(this.a[i8 * 3 + 2] * f2);
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */               
/* 172 */               if (i5 >= -1 && i5 < 159) {
/* 173 */                 int i6 = i4 + (i5 + 1) * 32;
/* 174 */                 int i7 = this.g[ln.ba * 3 + 1];
/* 175 */                 float f1 = cj.c(i1 - 1, b, n) * 0.8F + 0.2F;
/* 176 */                 int i8 = this.g[ln.ba * 3 + 2];
/* 177 */                 float f2 = cj.c(i1, b, n + 1) * 0.8F + 0.2F;
/*     */                 
/* 179 */                 if (i4 >= 0) {
/* 180 */                   float f3 = f1 * f * 0.6F;
/* 181 */                   if (this.c[i6] <= b - 1) {
/* 182 */                     this.c[i6] = b - 1;
/* 183 */                     this.b[i6] = 0xFF000000 | (int)(this.a[i7 * 3 + 0] * f3) << 16 | (int)(this.a[i7 * 3 + 1] * f3) << 8 | (int)(this.a[i7 * 3 + 2] * f3);
/*     */                   } 
/*     */                 } 
/* 186 */                 if (i4 < 31) {
/* 187 */                   float f3 = f2 * 0.9F * f * 0.4F;
/* 188 */                   if (this.c[i6 + 1] <= b - 1) {
/* 189 */                     this.c[i6 + 1] = b - 1;
/* 190 */                     this.b[i6 + 1] = 0xFF000000 | (int)(this.a[i8 * 3 + 0] * f3) << 16 | (int)(this.a[i8 * 3 + 1] * f3) << 8 | (int)(this.a[i8 * 3 + 2] * f3);
/*     */                   } 
/*     */                 } 
/*     */               }  }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 199 */     a();
/*     */     
/* 201 */     if (paramiz.a == null) {
/* 202 */       paramiz.a = new BufferedImage(32, 160, 2);
/*     */     }
/* 204 */     paramiz.a.setRGB(0, 0, 32, 160, this.b, 0, 32);
/* 205 */     paramiz.e = true;
/*     */   }
/*     */   
/*     */   private void a() {
/* 209 */     for (byte b = 0; b < 32; b++) {
/* 210 */       for (byte b1 = 0; b1 < ' '; b1++) {
/* 211 */         int i = b + b1 * 32;
/* 212 */         if (this.c[i] == 0) {
/* 213 */           this.b[i] = 0;
/*     */         }
/* 215 */         if (this.d[i] > this.c[i]) {
/* 216 */           int j = this.b[i] >> 24 & 0xFF;
/* 217 */           this.b[i] = ((this.b[i] & 0xFEFEFE) >> 1) + this.e[i];
/* 218 */           if (j < 128) {
/* 219 */             this.b[i] = Integer.MIN_VALUE + this.e[i] * 2;
/*     */           } else {
/* 221 */             this.b[i] = this.b[i] | 0xFF000000;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ll.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */