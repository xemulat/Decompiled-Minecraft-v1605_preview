/*     */ package com.jcraft.jorbis;
/*     */ 
/*     */ import com.jcraft.jogg.Buffer;
/*     */ import ei;
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
/*     */ class Floor0
/*     */   extends FuncFloor
/*     */ {
/*     */   void pack(Object paramObject, Buffer paramBuffer) {
/*  36 */     Floor0$InfoFloor0 floor0$InfoFloor0 = (Floor0$InfoFloor0)paramObject;
/*  37 */     paramBuffer.write(floor0$InfoFloor0.order, 8);
/*  38 */     paramBuffer.write(floor0$InfoFloor0.rate, 16);
/*  39 */     paramBuffer.write(floor0$InfoFloor0.barkmap, 16);
/*  40 */     paramBuffer.write(floor0$InfoFloor0.ampbits, 6);
/*  41 */     paramBuffer.write(floor0$InfoFloor0.ampdB, 8);
/*  42 */     paramBuffer.write(floor0$InfoFloor0.numbooks - 1, 4);
/*  43 */     for (byte b = 0; b < floor0$InfoFloor0.numbooks; b++)
/*  44 */       paramBuffer.write(floor0$InfoFloor0.books[b], 8); 
/*     */   }
/*     */   
/*     */   Object unpack(Info paramInfo, Buffer paramBuffer) {
/*  48 */     Floor0$InfoFloor0 floor0$InfoFloor0 = new Floor0$InfoFloor0(this);
/*  49 */     floor0$InfoFloor0.order = paramBuffer.read(8);
/*  50 */     floor0$InfoFloor0.rate = paramBuffer.read(16);
/*  51 */     floor0$InfoFloor0.barkmap = paramBuffer.read(16);
/*  52 */     floor0$InfoFloor0.ampbits = paramBuffer.read(6);
/*  53 */     floor0$InfoFloor0.ampdB = paramBuffer.read(8);
/*  54 */     floor0$InfoFloor0.numbooks = paramBuffer.read(4) + 1;
/*     */     
/*  56 */     if (floor0$InfoFloor0.order < 1 || floor0$InfoFloor0.rate < 1 || floor0$InfoFloor0.barkmap < 1 || floor0$InfoFloor0.numbooks < 1) {
/*  57 */       return null;
/*     */     }
/*     */     
/*  60 */     for (byte b = 0; b < floor0$InfoFloor0.numbooks; b++) {
/*  61 */       floor0$InfoFloor0.books[b] = paramBuffer.read(8);
/*  62 */       if (floor0$InfoFloor0.books[b] < 0 || floor0$InfoFloor0.books[b] >= paramInfo.books) {
/*  63 */         return null;
/*     */       }
/*     */     } 
/*  66 */     return floor0$InfoFloor0;
/*     */   }
/*     */ 
/*     */   
/*     */   Object look(DspState paramDspState, InfoMode paramInfoMode, Object paramObject) {
/*  71 */     Info info = paramDspState.vi;
/*  72 */     Floor0$InfoFloor0 floor0$InfoFloor0 = (Floor0$InfoFloor0)paramObject;
/*  73 */     Floor0$LookFloor0 floor0$LookFloor0 = new Floor0$LookFloor0(this);
/*  74 */     floor0$LookFloor0.m = floor0$InfoFloor0.order;
/*  75 */     floor0$LookFloor0.n = info.blocksizes[paramInfoMode.blockflag] / 2;
/*  76 */     floor0$LookFloor0.ln = floor0$InfoFloor0.barkmap;
/*  77 */     floor0$LookFloor0.vi = floor0$InfoFloor0;
/*  78 */     floor0$LookFloor0.lpclook.init(floor0$LookFloor0.ln, floor0$LookFloor0.m);
/*     */ 
/*     */     
/*  81 */     float f = floor0$LookFloor0.ln / toBARK((float)(floor0$InfoFloor0.rate / 2.0D));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     floor0$LookFloor0.linearmap = new int[floor0$LookFloor0.n];
/*  90 */     for (byte b = 0; b < floor0$LookFloor0.n; b++) {
/*  91 */       int i = ei.d(toBARK((float)(floor0$InfoFloor0.rate / 2.0D / floor0$LookFloor0.n * b)) * f);
/*  92 */       if (i >= floor0$LookFloor0.ln)
/*  93 */         i = floor0$LookFloor0.ln; 
/*  94 */       floor0$LookFloor0.linearmap[b] = i;
/*     */     } 
/*  96 */     return floor0$LookFloor0;
/*     */   }
/*     */   
/*     */   static float toBARK(float paramFloat) {
/* 100 */     return (float)(13.1D * Math.atan(7.4E-4D * paramFloat) + 2.24D * Math.atan((paramFloat * paramFloat) * 1.85E-8D) + 1.0E-4D * paramFloat);
/*     */   }
/*     */   
/*     */   Object state(Object paramObject) {
/* 104 */     Floor0$EchstateFloor0 floor0$EchstateFloor0 = new Floor0$EchstateFloor0(this);
/* 105 */     Floor0$InfoFloor0 floor0$InfoFloor0 = (Floor0$InfoFloor0)paramObject;
/*     */ 
/*     */     
/* 108 */     floor0$EchstateFloor0.codewords = new int[floor0$InfoFloor0.order];
/* 109 */     floor0$EchstateFloor0.curve = new float[floor0$InfoFloor0.barkmap];
/* 110 */     floor0$EchstateFloor0.frameno = -1L;
/* 111 */     return floor0$EchstateFloor0;
/*     */   }
/*     */ 
/*     */   
/*     */   void free_info(Object paramObject) {}
/*     */ 
/*     */   
/*     */   void free_look(Object paramObject) {}
/*     */ 
/*     */   
/*     */   void free_state(Object paramObject) {}
/*     */   
/*     */   int forward(Block paramBlock, Object paramObject1, float[] paramArrayOffloat1, float[] paramArrayOffloat2, Object paramObject2) {
/* 124 */     return 0;
/*     */   }
/*     */   
/* 127 */   float[] lsp = null;
/*     */ 
/*     */   
/*     */   int inverse(Block paramBlock, Object paramObject, float[] paramArrayOffloat) {
/* 131 */     Floor0$LookFloor0 floor0$LookFloor0 = (Floor0$LookFloor0)paramObject;
/* 132 */     Floor0$InfoFloor0 floor0$InfoFloor0 = floor0$LookFloor0.vi;
/* 133 */     int i = paramBlock.opb.read(floor0$InfoFloor0.ampbits);
/* 134 */     if (i > 0) {
/* 135 */       int j = (1 << floor0$InfoFloor0.ampbits) - 1;
/* 136 */       float f = i / j * floor0$InfoFloor0.ampdB;
/* 137 */       int k = paramBlock.opb.read(Util.ilog(floor0$InfoFloor0.numbooks));
/*     */       
/* 139 */       if (k != -1 && k < floor0$InfoFloor0.numbooks)
/*     */       {
/* 141 */         synchronized (this) {
/* 142 */           if (this.lsp == null || this.lsp.length < floor0$LookFloor0.m) {
/* 143 */             this.lsp = new float[floor0$LookFloor0.m];
/*     */           } else {
/*     */             
/* 146 */             for (byte b = 0; b < floor0$LookFloor0.m; b++) {
/* 147 */               this.lsp[b] = 0.0F;
/*     */             }
/*     */           } 
/* 150 */           CodeBook codeBook = paramBlock.vd.fullbooks[floor0$InfoFloor0.books[k]];
/* 151 */           float f1 = 0.0F;
/*     */           int m;
/* 153 */           for (m = 0; m < floor0$LookFloor0.m; m++) {
/* 154 */             paramArrayOffloat[m] = 0.0F;
/*     */           }
/* 156 */           for (m = 0; m < floor0$LookFloor0.m; m += codeBook.dim) {
/* 157 */             if (codeBook.decodevs(this.lsp, m, paramBlock.opb, 1, -1) == -1) {
/* 158 */               for (byte b = 0; b < floor0$LookFloor0.n; b++)
/* 159 */                 paramArrayOffloat[b] = 0.0F; 
/* 160 */               return 0;
/*     */             } 
/*     */           } 
/* 163 */           for (m = 0; m < floor0$LookFloor0.m; ) {
/* 164 */             for (byte b = 0; b < codeBook.dim; b++, m++)
/* 165 */               this.lsp[m] = this.lsp[m] + f1; 
/* 166 */             f1 = this.lsp[m - 1];
/*     */           } 
/*     */           
/* 169 */           Lsp.lsp_to_curve(paramArrayOffloat, floor0$LookFloor0.linearmap, floor0$LookFloor0.n, floor0$LookFloor0.ln, this.lsp, floor0$LookFloor0.m, f, floor0$InfoFloor0.ampdB);
/*     */ 
/*     */           
/* 172 */           return 1;
/*     */         } 
/*     */       }
/*     */     } 
/* 176 */     return 0;
/*     */   }
/*     */   
/*     */   Object inverse1(Block paramBlock, Object paramObject1, Object paramObject2) {
/* 180 */     Floor0$LookFloor0 floor0$LookFloor0 = (Floor0$LookFloor0)paramObject1;
/* 181 */     Floor0$InfoFloor0 floor0$InfoFloor0 = floor0$LookFloor0.vi;
/* 182 */     float[] arrayOfFloat = null;
/* 183 */     if (paramObject2 instanceof float[]) {
/* 184 */       arrayOfFloat = (float[])paramObject2;
/*     */     }
/*     */     
/* 187 */     int i = paramBlock.opb.read(floor0$InfoFloor0.ampbits);
/* 188 */     if (i > 0) {
/* 189 */       int j = (1 << floor0$InfoFloor0.ampbits) - 1;
/* 190 */       float f = i / j * floor0$InfoFloor0.ampdB;
/* 191 */       int k = paramBlock.opb.read(Util.ilog(floor0$InfoFloor0.numbooks));
/*     */       
/* 193 */       if (k != -1 && k < floor0$InfoFloor0.numbooks) {
/* 194 */         CodeBook codeBook = paramBlock.vd.fullbooks[floor0$InfoFloor0.books[k]];
/* 195 */         float f1 = 0.0F;
/*     */         
/* 197 */         if (arrayOfFloat == null || arrayOfFloat.length < floor0$LookFloor0.m + 1) {
/* 198 */           arrayOfFloat = new float[floor0$LookFloor0.m + 1];
/*     */         } else {
/*     */           
/* 201 */           for (byte b = 0; b < arrayOfFloat.length; b++)
/* 202 */             arrayOfFloat[b] = 0.0F; 
/*     */         } 
/*     */         int m;
/* 205 */         for (m = 0; m < floor0$LookFloor0.m; m += codeBook.dim) {
/* 206 */           if (codeBook.decodev_set(arrayOfFloat, m, paramBlock.opb, codeBook.dim) == -1) {
/* 207 */             return null;
/*     */           }
/*     */         } 
/*     */         
/* 211 */         for (m = 0; m < floor0$LookFloor0.m; ) {
/* 212 */           for (byte b = 0; b < codeBook.dim; b++, m++)
/* 213 */             arrayOfFloat[m] = arrayOfFloat[m] + f1; 
/* 214 */           f1 = arrayOfFloat[m - 1];
/*     */         } 
/* 216 */         arrayOfFloat[floor0$LookFloor0.m] = f;
/* 217 */         return arrayOfFloat;
/*     */       } 
/*     */     } 
/* 220 */     return null;
/*     */   }
/*     */   
/*     */   int inverse2(Block paramBlock, Object paramObject1, Object paramObject2, float[] paramArrayOffloat) {
/* 224 */     Floor0$LookFloor0 floor0$LookFloor0 = (Floor0$LookFloor0)paramObject1;
/* 225 */     Floor0$InfoFloor0 floor0$InfoFloor0 = floor0$LookFloor0.vi;
/*     */     
/* 227 */     if (paramObject2 != null) {
/* 228 */       float[] arrayOfFloat = (float[])paramObject2;
/* 229 */       float f = arrayOfFloat[floor0$LookFloor0.m];
/*     */       
/* 231 */       Lsp.lsp_to_curve(paramArrayOffloat, floor0$LookFloor0.linearmap, floor0$LookFloor0.n, floor0$LookFloor0.ln, arrayOfFloat, floor0$LookFloor0.m, f, floor0$InfoFloor0.ampdB);
/*     */       
/* 233 */       return 1;
/*     */     } 
/* 235 */     for (byte b = 0; b < floor0$LookFloor0.n; b++) {
/* 236 */       paramArrayOffloat[b] = 0.0F;
/*     */     }
/* 238 */     return 0;
/*     */   }
/*     */   
/*     */   static float fromdB(float paramFloat) {
/* 242 */     return (float)Math.exp(paramFloat * 0.11512925D);
/*     */   }
/*     */   
/*     */   static void lsp_to_lpc(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt) {
/* 246 */     int i = paramInt / 2;
/* 247 */     float[] arrayOfFloat1 = new float[i];
/* 248 */     float[] arrayOfFloat2 = new float[i];
/*     */     
/* 250 */     float[] arrayOfFloat3 = new float[i + 1];
/* 251 */     float[] arrayOfFloat4 = new float[i + 1];
/*     */     
/* 253 */     float[] arrayOfFloat5 = new float[i];
/* 254 */     float[] arrayOfFloat6 = new float[i];
/*     */     
/*     */     byte b1;
/*     */     
/* 258 */     for (b1 = 0; b1 < i; b1++) {
/* 259 */       arrayOfFloat1[b1] = (float)(-2.0D * Math.cos(paramArrayOffloat1[b1 * 2]));
/* 260 */       arrayOfFloat2[b1] = (float)(-2.0D * Math.cos(paramArrayOffloat1[b1 * 2 + 1]));
/*     */     } 
/*     */     
/*     */     byte b2;
/* 264 */     for (b2 = 0; b2 < i; b2++) {
/* 265 */       arrayOfFloat3[b2] = 0.0F;
/* 266 */       arrayOfFloat4[b2] = 1.0F;
/* 267 */       arrayOfFloat5[b2] = 0.0F;
/* 268 */       arrayOfFloat6[b2] = 1.0F;
/*     */     } 
/* 270 */     arrayOfFloat4[b2] = 1.0F;
/* 271 */     arrayOfFloat3[b2] = 1.0F;
/*     */ 
/*     */     
/* 274 */     for (b1 = 1; b1 < paramInt + 1; b1++) {
/* 275 */       float f2 = 0.0F, f1 = f2;
/* 276 */       for (b2 = 0; b2 < i; b2++) {
/* 277 */         float f = arrayOfFloat1[b2] * arrayOfFloat4[b2] + arrayOfFloat3[b2];
/* 278 */         arrayOfFloat3[b2] = arrayOfFloat4[b2];
/* 279 */         arrayOfFloat4[b2] = f1;
/* 280 */         f1 += f;
/*     */         
/* 282 */         f = arrayOfFloat2[b2] * arrayOfFloat6[b2] + arrayOfFloat5[b2];
/* 283 */         arrayOfFloat5[b2] = arrayOfFloat6[b2];
/* 284 */         arrayOfFloat6[b2] = f2;
/* 285 */         f2 += f;
/*     */       } 
/* 287 */       paramArrayOffloat2[b1 - 1] = (f1 + arrayOfFloat4[b2] + f2 - arrayOfFloat3[b2]) / 2.0F;
/* 288 */       arrayOfFloat4[b2] = f1;
/* 289 */       arrayOfFloat3[b2] = f2;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static void lpc_to_curve(float[] paramArrayOffloat1, float[] paramArrayOffloat2, float paramFloat, Floor0$LookFloor0 paramFloor0$LookFloor0, String paramString, int paramInt) {
/* 296 */     float[] arrayOfFloat = new float[Math.max(paramFloor0$LookFloor0.ln * 2, paramFloor0$LookFloor0.m * 2 + 2)];
/*     */     
/* 298 */     if (paramFloat == 0.0F) {
/* 299 */       for (byte b1 = 0; b1 < paramFloor0$LookFloor0.n; b1++)
/* 300 */         paramArrayOffloat1[b1] = 0.0F; 
/*     */       return;
/*     */     } 
/* 303 */     paramFloor0$LookFloor0.lpclook.lpc_to_curve(arrayOfFloat, paramArrayOffloat2, paramFloat);
/*     */     
/* 305 */     for (byte b = 0; b < paramFloor0$LookFloor0.n; b++)
/* 306 */       paramArrayOffloat1[b] = arrayOfFloat[paramFloor0$LookFloor0.linearmap[b]]; 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Floor0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */