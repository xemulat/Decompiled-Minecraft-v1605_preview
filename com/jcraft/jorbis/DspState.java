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
/*     */ 
/*     */ 
/*     */ public class DspState
/*     */ {
/*     */   static final float M_PI = 3.1415927F;
/*     */   static final int VI_TRANSFORMB = 1;
/*     */   static final int VI_WINDOWB = 1;
/*     */   int analysisp;
/*     */   Info vi;
/*     */   int modebits;
/*     */   float[][] pcm;
/*     */   int pcm_storage;
/*     */   int pcm_current;
/*     */   int pcm_returned;
/*     */   float[] multipliers;
/*     */   int envelope_storage;
/*     */   int envelope_current;
/*     */   int eofflag;
/*     */   int lW;
/*     */   int W;
/*     */   int nW;
/*     */   int centerW;
/*     */   long granulepos;
/*     */   long sequence;
/*     */   long glue_bits;
/*     */   long time_bits;
/*     */   long floor_bits;
/*     */   long res_bits;
/*     */   float[][][][][] window;
/*     */   Object[][] transform;
/*     */   CodeBook[] fullbooks;
/*     */   Object[] mode;
/*     */   byte[] header;
/*     */   byte[] header1;
/*     */   byte[] header2;
/*     */   
/*     */   public DspState() {
/*  78 */     this.transform = new Object[2][];
/*  79 */     this.window = new float[2][][][][];
/*  80 */     this.window[0] = new float[2][][][];
/*  81 */     this.window[0][0] = new float[2][][];
/*  82 */     this.window[0][1] = new float[2][][];
/*  83 */     this.window[0][0][0] = new float[2][];
/*  84 */     this.window[0][0][1] = new float[2][];
/*  85 */     this.window[0][1][0] = new float[2][];
/*  86 */     this.window[0][1][1] = new float[2][];
/*  87 */     this.window[1] = new float[2][][][];
/*  88 */     this.window[1][0] = new float[2][][];
/*  89 */     this.window[1][1] = new float[2][][];
/*  90 */     this.window[1][0][0] = new float[2][];
/*  91 */     this.window[1][0][1] = new float[2][];
/*  92 */     this.window[1][1][0] = new float[2][];
/*  93 */     this.window[1][1][1] = new float[2][];
/*     */   }
/*     */   static float[] window(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*     */     int i, j, k;
/*  97 */     float[] arrayOfFloat = new float[paramInt2];
/*  98 */     switch (paramInt1) {
/*     */ 
/*     */       
/*     */       case 0:
/* 102 */         i = paramInt2 / 4 - paramInt3 / 2;
/* 103 */         j = paramInt2 - paramInt2 / 4 - paramInt4 / 2;
/*     */         
/* 105 */         for (k = 0; k < paramInt3; k++) {
/* 106 */           float f = (float)((k + 0.5D) / paramInt3 * 3.1415927410125732D / 2.0D);
/* 107 */           f = (float)Math.sin(f);
/* 108 */           f *= f;
/* 109 */           f = (float)(f * 1.5707963705062866D);
/* 110 */           f = (float)Math.sin(f);
/* 111 */           arrayOfFloat[k + i] = f;
/*     */         } 
/*     */         
/* 114 */         for (k = i + paramInt3; k < j; k++) {
/* 115 */           arrayOfFloat[k] = 1.0F;
/*     */         }
/*     */         
/* 118 */         for (k = 0; k < paramInt4; k++) {
/* 119 */           float f = (float)(((paramInt4 - k) - 0.5D) / paramInt4 * 3.1415927410125732D / 2.0D);
/* 120 */           f = (float)Math.sin(f);
/* 121 */           f *= f;
/* 122 */           f = (float)(f * 1.5707963705062866D);
/* 123 */           f = (float)Math.sin(f);
/* 124 */           arrayOfFloat[k + j] = f;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 132 */         return arrayOfFloat;
/*     */     } 
/*     */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int init(Info paramInfo, boolean paramBoolean) {
/* 140 */     this.vi = paramInfo;
/* 141 */     this.modebits = Util.ilog2(paramInfo.modes);
/*     */     
/* 143 */     this.transform[0] = new Object[1];
/* 144 */     this.transform[1] = new Object[1];
/*     */ 
/*     */ 
/*     */     
/* 148 */     this.transform[0][0] = new Mdct();
/* 149 */     this.transform[1][0] = new Mdct();
/* 150 */     ((Mdct)this.transform[0][0]).init(paramInfo.blocksizes[0]);
/* 151 */     ((Mdct)this.transform[1][0]).init(paramInfo.blocksizes[1]);
/*     */     
/* 153 */     this.window[0][0][0] = new float[1][];
/* 154 */     this.window[0][0][1] = this.window[0][0][0];
/* 155 */     this.window[0][1][0] = this.window[0][0][0];
/* 156 */     this.window[0][1][1] = this.window[0][0][0];
/* 157 */     this.window[1][0][0] = new float[1][];
/* 158 */     this.window[1][0][1] = new float[1][];
/* 159 */     this.window[1][1][0] = new float[1][];
/* 160 */     this.window[1][1][1] = new float[1][];
/*     */     byte b;
/* 162 */     for (b = 0; b < 1; b++) {
/* 163 */       this.window[0][0][0][b] = window(b, paramInfo.blocksizes[0], paramInfo.blocksizes[0] / 2, paramInfo.blocksizes[0] / 2);
/*     */       
/* 165 */       this.window[1][0][0][b] = window(b, paramInfo.blocksizes[1], paramInfo.blocksizes[0] / 2, paramInfo.blocksizes[0] / 2);
/*     */       
/* 167 */       this.window[1][0][1][b] = window(b, paramInfo.blocksizes[1], paramInfo.blocksizes[0] / 2, paramInfo.blocksizes[1] / 2);
/*     */       
/* 169 */       this.window[1][1][0][b] = window(b, paramInfo.blocksizes[1], paramInfo.blocksizes[1] / 2, paramInfo.blocksizes[0] / 2);
/*     */       
/* 171 */       this.window[1][1][1][b] = window(b, paramInfo.blocksizes[1], paramInfo.blocksizes[1] / 2, paramInfo.blocksizes[1] / 2);
/*     */     } 
/*     */ 
/*     */     
/* 175 */     this.fullbooks = new CodeBook[paramInfo.books];
/* 176 */     for (b = 0; b < paramInfo.books; b++) {
/* 177 */       this.fullbooks[b] = new CodeBook();
/* 178 */       this.fullbooks[b].init_decode(paramInfo.book_param[b]);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     this.pcm_storage = 8192;
/*     */ 
/*     */     
/* 187 */     this.pcm = new float[paramInfo.channels][];
/*     */     
/* 189 */     for (b = 0; b < paramInfo.channels; b++) {
/* 190 */       this.pcm[b] = new float[this.pcm_storage];
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     this.lW = 0;
/* 197 */     this.W = 0;
/*     */ 
/*     */     
/* 200 */     this.centerW = paramInfo.blocksizes[1] / 2;
/*     */     
/* 202 */     this.pcm_current = this.centerW;
/*     */ 
/*     */     
/* 205 */     this.mode = new Object[paramInfo.modes];
/* 206 */     for (b = 0; b < paramInfo.modes; b++) {
/* 207 */       int i = (paramInfo.mode_param[b]).mapping;
/* 208 */       int j = paramInfo.map_type[i];
/* 209 */       this.mode[b] = FuncMapping.mapping_P[j].look(this, paramInfo.mode_param[b], paramInfo.map_param[i]);
/*     */     } 
/*     */     
/* 212 */     return 0;
/*     */   }
/*     */   
/*     */   public int synthesis_init(Info paramInfo) {
/* 216 */     init(paramInfo, false);
/*     */     
/* 218 */     this.pcm_returned = this.centerW;
/* 219 */     this.centerW -= paramInfo.blocksizes[this.W] / 4 + paramInfo.blocksizes[this.lW] / 4;
/* 220 */     this.granulepos = -1L;
/* 221 */     this.sequence = -1L;
/* 222 */     return 0;
/*     */   }
/*     */   
/*     */   DspState(Info paramInfo) {
/* 226 */     this();
/* 227 */     init(paramInfo, false);
/*     */     
/* 229 */     this.pcm_returned = this.centerW;
/* 230 */     this.centerW -= paramInfo.blocksizes[this.W] / 4 + paramInfo.blocksizes[this.lW] / 4;
/* 231 */     this.granulepos = -1L;
/* 232 */     this.sequence = -1L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int synthesis_blockin(Block paramBlock) {
/* 242 */     if (this.centerW > this.vi.blocksizes[1] / 2 && this.pcm_returned > 8192) {
/*     */ 
/*     */ 
/*     */       
/* 246 */       int i2 = this.centerW - this.vi.blocksizes[1] / 2;
/* 247 */       i2 = (this.pcm_returned < i2) ? this.pcm_returned : i2;
/*     */       
/* 249 */       this.pcm_current -= i2;
/* 250 */       this.centerW -= i2;
/* 251 */       this.pcm_returned -= i2;
/* 252 */       if (i2 != 0) {
/* 253 */         for (byte b1 = 0; b1 < this.vi.channels; b1++) {
/* 254 */           System.arraycopy(this.pcm[b1], i2, this.pcm[b1], 0, this.pcm_current);
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 259 */     this.lW = this.W;
/* 260 */     this.W = paramBlock.W;
/* 261 */     this.nW = -1;
/*     */     
/* 263 */     this.glue_bits += paramBlock.glue_bits;
/* 264 */     this.time_bits += paramBlock.time_bits;
/* 265 */     this.floor_bits += paramBlock.floor_bits;
/* 266 */     this.res_bits += paramBlock.res_bits;
/*     */     
/* 268 */     if (this.sequence + 1L != paramBlock.sequence) {
/* 269 */       this.granulepos = -1L;
/*     */     }
/* 271 */     this.sequence = paramBlock.sequence;
/*     */ 
/*     */     
/* 274 */     int i = this.vi.blocksizes[this.W];
/* 275 */     int j = this.centerW + this.vi.blocksizes[this.lW] / 4 + i / 4;
/* 276 */     int k = j - i / 2;
/* 277 */     int m = k + i;
/* 278 */     int n = 0;
/* 279 */     int i1 = 0;
/*     */ 
/*     */     
/* 282 */     if (m > this.pcm_storage) {
/*     */       
/* 284 */       this.pcm_storage = m + this.vi.blocksizes[1];
/* 285 */       for (byte b1 = 0; b1 < this.vi.channels; b1++) {
/* 286 */         float[] arrayOfFloat = new float[this.pcm_storage];
/* 287 */         System.arraycopy(this.pcm[b1], 0, arrayOfFloat, 0, (this.pcm[b1]).length);
/* 288 */         this.pcm[b1] = arrayOfFloat;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 293 */     switch (this.W) {
/*     */       case 0:
/* 295 */         n = 0;
/* 296 */         i1 = this.vi.blocksizes[0] / 2;
/*     */         break;
/*     */       case 1:
/* 299 */         n = this.vi.blocksizes[1] / 4 - this.vi.blocksizes[this.lW] / 4;
/* 300 */         i1 = n + this.vi.blocksizes[this.lW] / 2;
/*     */         break;
/*     */     } 
/*     */     
/* 304 */     for (byte b = 0; b < this.vi.channels; b++) {
/* 305 */       int i2 = k;
/*     */       
/* 307 */       int i3 = 0;
/* 308 */       for (i3 = n; i3 < i1; i3++) {
/* 309 */         this.pcm[b][i2 + i3] = this.pcm[b][i2 + i3] + paramBlock.pcm[b][i3];
/*     */       }
/*     */       
/* 312 */       for (; i3 < i; i3++) {
/* 313 */         this.pcm[b][i2 + i3] = paramBlock.pcm[b][i3];
/*     */       }
/*     */     } 
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
/* 328 */     if (this.granulepos == -1L) {
/* 329 */       this.granulepos = paramBlock.granulepos;
/*     */     } else {
/*     */       
/* 332 */       this.granulepos += (j - this.centerW);
/* 333 */       if (paramBlock.granulepos != -1L && this.granulepos != paramBlock.granulepos) {
/* 334 */         if (this.granulepos > paramBlock.granulepos && paramBlock.eofflag != 0)
/*     */         {
/* 336 */           j = (int)(j - this.granulepos - paramBlock.granulepos);
/*     */         }
/*     */         
/* 339 */         this.granulepos = paramBlock.granulepos;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 345 */     this.centerW = j;
/* 346 */     this.pcm_current = m;
/* 347 */     if (paramBlock.eofflag != 0) {
/* 348 */       this.eofflag = 1;
/*     */     }
/* 350 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int synthesis_pcmout(float[][][] paramArrayOffloat, int[] paramArrayOfint) {
/* 355 */     if (this.pcm_returned < this.centerW) {
/* 356 */       if (paramArrayOffloat != null) {
/* 357 */         for (byte b = 0; b < this.vi.channels; b++) {
/* 358 */           paramArrayOfint[b] = this.pcm_returned;
/*     */         }
/* 360 */         paramArrayOffloat[0] = this.pcm;
/*     */       } 
/* 362 */       return this.centerW - this.pcm_returned;
/*     */     } 
/* 364 */     return 0;
/*     */   }
/*     */   
/*     */   public int synthesis_read(int paramInt) {
/* 368 */     if (paramInt != 0 && this.pcm_returned + paramInt > this.centerW)
/* 369 */       return -1; 
/* 370 */     this.pcm_returned += paramInt;
/* 371 */     return 0;
/*     */   }
/*     */   
/*     */   public void clear() {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\DspState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */