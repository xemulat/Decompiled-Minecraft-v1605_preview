/*     */ package com.jcraft.jorbis;
/*     */ 
/*     */ import com.jcraft.jogg.Buffer;
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
/*     */ class Residue0
/*     */   extends FuncResidue
/*     */ {
/*     */   void pack(Object paramObject, Buffer paramBuffer) {
/*  33 */     Residue0$InfoResidue0 residue0$InfoResidue0 = (Residue0$InfoResidue0)paramObject;
/*  34 */     int i = 0;
/*  35 */     paramBuffer.write(residue0$InfoResidue0.begin, 24);
/*  36 */     paramBuffer.write(residue0$InfoResidue0.end, 24);
/*     */     
/*  38 */     paramBuffer.write(residue0$InfoResidue0.grouping - 1, 24);
/*     */     
/*  40 */     paramBuffer.write(residue0$InfoResidue0.partitions - 1, 6);
/*  41 */     paramBuffer.write(residue0$InfoResidue0.groupbook, 8);
/*     */ 
/*     */     
/*     */     byte b;
/*     */     
/*  46 */     for (b = 0; b < residue0$InfoResidue0.partitions; b++) {
/*  47 */       int j = residue0$InfoResidue0.secondstages[b];
/*  48 */       if (Util.ilog(j) > 3) {
/*     */         
/*  50 */         paramBuffer.write(j, 3);
/*  51 */         paramBuffer.write(1, 1);
/*  52 */         paramBuffer.write(j >>> 3, 5);
/*     */       } else {
/*     */         
/*  55 */         paramBuffer.write(j, 4);
/*     */       } 
/*  57 */       i += Util.icount(j);
/*     */     } 
/*  59 */     for (b = 0; b < i; b++) {
/*  60 */       paramBuffer.write(residue0$InfoResidue0.booklist[b], 8);
/*     */     }
/*     */   }
/*     */   
/*     */   Object unpack(Info paramInfo, Buffer paramBuffer) {
/*  65 */     int i = 0;
/*  66 */     Residue0$InfoResidue0 residue0$InfoResidue0 = new Residue0$InfoResidue0(this);
/*  67 */     residue0$InfoResidue0.begin = paramBuffer.read(24);
/*  68 */     residue0$InfoResidue0.end = paramBuffer.read(24);
/*  69 */     residue0$InfoResidue0.grouping = paramBuffer.read(24) + 1;
/*  70 */     residue0$InfoResidue0.partitions = paramBuffer.read(6) + 1;
/*  71 */     residue0$InfoResidue0.groupbook = paramBuffer.read(8);
/*     */     byte b;
/*  73 */     for (b = 0; b < residue0$InfoResidue0.partitions; b++) {
/*  74 */       int j = paramBuffer.read(3);
/*  75 */       if (paramBuffer.read(1) != 0) {
/*  76 */         j |= paramBuffer.read(5) << 3;
/*     */       }
/*  78 */       residue0$InfoResidue0.secondstages[b] = j;
/*  79 */       i += Util.icount(j);
/*     */     } 
/*     */     
/*  82 */     for (b = 0; b < i; b++) {
/*  83 */       residue0$InfoResidue0.booklist[b] = paramBuffer.read(8);
/*     */     }
/*     */     
/*  86 */     if (residue0$InfoResidue0.groupbook >= paramInfo.books) {
/*  87 */       free_info(residue0$InfoResidue0);
/*  88 */       return null;
/*     */     } 
/*     */     
/*  91 */     for (b = 0; b < i; b++) {
/*  92 */       if (residue0$InfoResidue0.booklist[b] >= paramInfo.books) {
/*  93 */         free_info(residue0$InfoResidue0);
/*  94 */         return null;
/*     */       } 
/*     */     } 
/*  97 */     return residue0$InfoResidue0;
/*     */   }
/*     */   
/*     */   Object look(DspState paramDspState, InfoMode paramInfoMode, Object paramObject) {
/* 101 */     Residue0$InfoResidue0 residue0$InfoResidue0 = (Residue0$InfoResidue0)paramObject;
/* 102 */     Residue0$LookResidue0 residue0$LookResidue0 = new Residue0$LookResidue0(this);
/* 103 */     byte b1 = 0;
/*     */     
/* 105 */     int j = 0;
/* 106 */     residue0$LookResidue0.info = residue0$InfoResidue0;
/* 107 */     residue0$LookResidue0.map = paramInfoMode.mapping;
/*     */     
/* 109 */     residue0$LookResidue0.parts = residue0$InfoResidue0.partitions;
/* 110 */     residue0$LookResidue0.fullbooks = paramDspState.fullbooks;
/* 111 */     residue0$LookResidue0.phrasebook = paramDspState.fullbooks[residue0$InfoResidue0.groupbook];
/*     */     
/* 113 */     int i = residue0$LookResidue0.phrasebook.dim;
/*     */     
/* 115 */     residue0$LookResidue0.partbooks = new int[residue0$LookResidue0.parts][];
/*     */     byte b2;
/* 117 */     for (b2 = 0; b2 < residue0$LookResidue0.parts; b2++) {
/* 118 */       int k = residue0$InfoResidue0.secondstages[b2];
/* 119 */       int m = Util.ilog(k);
/* 120 */       if (m != 0) {
/* 121 */         if (m > j)
/* 122 */           j = m; 
/* 123 */         residue0$LookResidue0.partbooks[b2] = new int[m];
/* 124 */         for (byte b = 0; b < m; b++) {
/* 125 */           if ((k & 1 << b) != 0) {
/* 126 */             residue0$LookResidue0.partbooks[b2][b] = residue0$InfoResidue0.booklist[b1++];
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 132 */     residue0$LookResidue0.partvals = (int)Math.rint(Math.pow(residue0$LookResidue0.parts, i));
/* 133 */     residue0$LookResidue0.stages = j;
/* 134 */     residue0$LookResidue0.decodemap = new int[residue0$LookResidue0.partvals][];
/* 135 */     for (b2 = 0; b2 < residue0$LookResidue0.partvals; b2++) {
/* 136 */       int k = b2;
/* 137 */       int m = residue0$LookResidue0.partvals / residue0$LookResidue0.parts;
/* 138 */       residue0$LookResidue0.decodemap[b2] = new int[i];
/*     */       
/* 140 */       for (byte b = 0; b < i; b++) {
/* 141 */         int n = k / m;
/* 142 */         k -= n * m;
/* 143 */         m /= residue0$LookResidue0.parts;
/* 144 */         residue0$LookResidue0.decodemap[b2][b] = n;
/*     */       } 
/*     */     } 
/* 147 */     return residue0$LookResidue0;
/*     */   }
/*     */ 
/*     */   
/*     */   void free_info(Object paramObject) {}
/*     */ 
/*     */   
/*     */   void free_look(Object paramObject) {}
/*     */   
/* 156 */   private static int[][][] _01inverse_partword = new int[2][][];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static synchronized int _01inverse(Block paramBlock, Object paramObject, float[][] paramArrayOffloat, int paramInt1, int paramInt2) {
/* 162 */     Residue0$LookResidue0 residue0$LookResidue0 = (Residue0$LookResidue0)paramObject;
/* 163 */     Residue0$InfoResidue0 residue0$InfoResidue0 = residue0$LookResidue0.info;
/*     */ 
/*     */     
/* 166 */     int i = residue0$InfoResidue0.grouping;
/* 167 */     int j = residue0$LookResidue0.phrasebook.dim;
/* 168 */     int k = residue0$InfoResidue0.end - residue0$InfoResidue0.begin;
/*     */     
/* 170 */     int m = k / i;
/* 171 */     int n = (m + j - 1) / j;
/*     */     
/* 173 */     if (_01inverse_partword.length < paramInt1) {
/* 174 */       _01inverse_partword = new int[paramInt1][][];
/*     */     }
/*     */     byte b1;
/* 177 */     for (b1 = 0; b1 < paramInt1; b1++) {
/* 178 */       if (_01inverse_partword[b1] == null || (_01inverse_partword[b1]).length < n) {
/* 179 */         _01inverse_partword[b1] = new int[n][];
/*     */       }
/*     */     } 
/*     */     
/* 183 */     for (byte b2 = 0; b2 < residue0$LookResidue0.stages; b2++) {
/*     */ 
/*     */       
/* 186 */       for (byte b3 = 0, b4 = 0; b3 < m; b4++) {
/* 187 */         if (b2 == 0)
/*     */         {
/* 189 */           for (b1 = 0; b1 < paramInt1; b1++) {
/* 190 */             int i1 = residue0$LookResidue0.phrasebook.decode(paramBlock.opb);
/* 191 */             if (i1 == -1) {
/* 192 */               return 0;
/*     */             }
/* 194 */             _01inverse_partword[b1][b4] = residue0$LookResidue0.decodemap[i1];
/* 195 */             if (_01inverse_partword[b1][b4] == null) {
/* 196 */               return 0;
/*     */             }
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/* 202 */         for (byte b = 0; b < j && b3 < m; b++, b3++) {
/* 203 */           for (b1 = 0; b1 < paramInt1; b1++) {
/* 204 */             int i1 = residue0$InfoResidue0.begin + b3 * i;
/* 205 */             int i2 = _01inverse_partword[b1][b4][b];
/* 206 */             if ((residue0$InfoResidue0.secondstages[i2] & 1 << b2) != 0) {
/* 207 */               CodeBook codeBook = residue0$LookResidue0.fullbooks[residue0$LookResidue0.partbooks[i2][b2]];
/* 208 */               if (codeBook != null) {
/* 209 */                 if (paramInt2 == 0) {
/* 210 */                   if (codeBook.decodevs_add(paramArrayOffloat[b1], i1, paramBlock.opb, i) == -1)
/*     */                   {
/* 212 */                     return 0;
/*     */                   }
/*     */                 }
/* 215 */                 else if (paramInt2 == 1 && 
/* 216 */                   codeBook.decodev_add(paramArrayOffloat[b1], i1, paramBlock.opb, i) == -1) {
/*     */                   
/* 218 */                   return 0;
/*     */                 } 
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 226 */     return 0;
/*     */   }
/*     */   
/* 229 */   static int[][] _2inverse_partword = (int[][])null;
/*     */ 
/*     */   
/*     */   static synchronized int _2inverse(Block paramBlock, Object paramObject, float[][] paramArrayOffloat, int paramInt) {
/* 233 */     Residue0$LookResidue0 residue0$LookResidue0 = (Residue0$LookResidue0)paramObject;
/* 234 */     Residue0$InfoResidue0 residue0$InfoResidue0 = residue0$LookResidue0.info;
/*     */ 
/*     */     
/* 237 */     int i = residue0$InfoResidue0.grouping;
/* 238 */     int j = residue0$LookResidue0.phrasebook.dim;
/* 239 */     int k = residue0$InfoResidue0.end - residue0$InfoResidue0.begin;
/*     */     
/* 241 */     int m = k / i;
/* 242 */     int n = (m + j - 1) / j;
/*     */     
/* 244 */     if (_2inverse_partword == null || _2inverse_partword.length < n) {
/* 245 */       _2inverse_partword = new int[n][];
/*     */     }
/* 247 */     for (byte b = 0; b < residue0$LookResidue0.stages; b++) {
/* 248 */       for (byte b1 = 0, b2 = 0; b1 < m; b2++) {
/* 249 */         if (b == 0) {
/*     */           
/* 251 */           int i1 = residue0$LookResidue0.phrasebook.decode(paramBlock.opb);
/* 252 */           if (i1 == -1) {
/* 253 */             return 0;
/*     */           }
/* 255 */           _2inverse_partword[b2] = residue0$LookResidue0.decodemap[i1];
/* 256 */           if (_2inverse_partword[b2] == null) {
/* 257 */             return 0;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 262 */         for (byte b3 = 0; b3 < j && b1 < m; b3++, b1++) {
/* 263 */           int i1 = residue0$InfoResidue0.begin + b1 * i;
/* 264 */           int i2 = _2inverse_partword[b2][b3];
/* 265 */           if ((residue0$InfoResidue0.secondstages[i2] & 1 << b) != 0) {
/* 266 */             CodeBook codeBook = residue0$LookResidue0.fullbooks[residue0$LookResidue0.partbooks[i2][b]];
/* 267 */             if (codeBook != null && 
/* 268 */               codeBook.decodevv_add(paramArrayOffloat, i1, paramInt, paramBlock.opb, i) == -1)
/*     */             {
/* 270 */               return 0;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 277 */     return 0;
/*     */   }
/*     */   
/*     */   int inverse(Block paramBlock, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
/* 281 */     byte b1 = 0;
/* 282 */     for (byte b2 = 0; b2 < paramInt; b2++) {
/* 283 */       if (paramArrayOfint[b2] != 0) {
/* 284 */         paramArrayOffloat[b1++] = paramArrayOffloat[b2];
/*     */       }
/*     */     } 
/* 287 */     if (b1 != 0) {
/* 288 */       return _01inverse(paramBlock, paramObject, paramArrayOffloat, b1, 0);
/*     */     }
/* 290 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Residue0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */