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
/*     */ class Floor1
/*     */   extends FuncFloor
/*     */ {
/*     */   static final int floor1_rangedb = 140;
/*     */   static final int VIF_POSIT = 63;
/*     */   
/*     */   void pack(Object paramObject, Buffer paramBuffer) {
/*  36 */     Floor1$InfoFloor1 floor1$InfoFloor1 = (Floor1$InfoFloor1)paramObject;
/*     */     
/*  38 */     int i = 0;
/*     */     
/*  40 */     int k = floor1$InfoFloor1.postlist[1];
/*  41 */     int m = -1;
/*     */ 
/*     */     
/*  44 */     paramBuffer.write(floor1$InfoFloor1.partitions, 5); byte b1;
/*  45 */     for (b1 = 0; b1 < floor1$InfoFloor1.partitions; b1++) {
/*  46 */       paramBuffer.write(floor1$InfoFloor1.partitionclass[b1], 4);
/*  47 */       if (m < floor1$InfoFloor1.partitionclass[b1]) {
/*  48 */         m = floor1$InfoFloor1.partitionclass[b1];
/*     */       }
/*     */     } 
/*     */     
/*  52 */     for (b1 = 0; b1 < m + 1; b1++) {
/*  53 */       paramBuffer.write(floor1$InfoFloor1.class_dim[b1] - 1, 3);
/*  54 */       paramBuffer.write(floor1$InfoFloor1.class_subs[b1], 2);
/*  55 */       if (floor1$InfoFloor1.class_subs[b1] != 0) {
/*  56 */         paramBuffer.write(floor1$InfoFloor1.class_book[b1], 8);
/*     */       }
/*  58 */       for (byte b = 0; b < 1 << floor1$InfoFloor1.class_subs[b1]; b++) {
/*  59 */         paramBuffer.write(floor1$InfoFloor1.class_subbook[b1][b] + 1, 8);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  64 */     paramBuffer.write(floor1$InfoFloor1.mult - 1, 2);
/*  65 */     paramBuffer.write(Util.ilog2(k), 4);
/*  66 */     int j = Util.ilog2(k);
/*     */     byte b2;
/*  68 */     for (b1 = 0, b2 = 0; b1 < floor1$InfoFloor1.partitions; b1++) {
/*  69 */       i += floor1$InfoFloor1.class_dim[floor1$InfoFloor1.partitionclass[b1]];
/*  70 */       for (; b2 < i; b2++) {
/*  71 */         paramBuffer.write(floor1$InfoFloor1.postlist[b2 + 2], j);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   Object unpack(Info paramInfo, Buffer paramBuffer) {
/*  77 */     int i = 0, j = -1;
/*  78 */     Floor1$InfoFloor1 floor1$InfoFloor1 = new Floor1$InfoFloor1(this);
/*     */ 
/*     */     
/*  81 */     floor1$InfoFloor1.partitions = paramBuffer.read(5); byte b1;
/*  82 */     for (b1 = 0; b1 < floor1$InfoFloor1.partitions; b1++) {
/*  83 */       floor1$InfoFloor1.partitionclass[b1] = paramBuffer.read(4);
/*  84 */       if (j < floor1$InfoFloor1.partitionclass[b1]) {
/*  85 */         j = floor1$InfoFloor1.partitionclass[b1];
/*     */       }
/*     */     } 
/*     */     
/*  89 */     for (b1 = 0; b1 < j + 1; b1++) {
/*  90 */       floor1$InfoFloor1.class_dim[b1] = paramBuffer.read(3) + 1;
/*  91 */       floor1$InfoFloor1.class_subs[b1] = paramBuffer.read(2);
/*  92 */       if (floor1$InfoFloor1.class_subs[b1] < 0) {
/*  93 */         floor1$InfoFloor1.free();
/*  94 */         return null;
/*     */       } 
/*  96 */       if (floor1$InfoFloor1.class_subs[b1] != 0) {
/*  97 */         floor1$InfoFloor1.class_book[b1] = paramBuffer.read(8);
/*     */       }
/*  99 */       if (floor1$InfoFloor1.class_book[b1] < 0 || floor1$InfoFloor1.class_book[b1] >= paramInfo.books) {
/* 100 */         floor1$InfoFloor1.free();
/* 101 */         return null;
/*     */       } 
/* 103 */       for (byte b = 0; b < 1 << floor1$InfoFloor1.class_subs[b1]; b++) {
/* 104 */         floor1$InfoFloor1.class_subbook[b1][b] = paramBuffer.read(8) - 1;
/* 105 */         if (floor1$InfoFloor1.class_subbook[b1][b] < -1 || floor1$InfoFloor1.class_subbook[b1][b] >= paramInfo.books) {
/* 106 */           floor1$InfoFloor1.free();
/* 107 */           return null;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 113 */     floor1$InfoFloor1.mult = paramBuffer.read(2) + 1;
/* 114 */     int k = paramBuffer.read(4);
/*     */     byte b2;
/* 116 */     for (b1 = 0, b2 = 0; b1 < floor1$InfoFloor1.partitions; b1++) {
/* 117 */       i += floor1$InfoFloor1.class_dim[floor1$InfoFloor1.partitionclass[b1]];
/* 118 */       for (; b2 < i; b2++) {
/* 119 */         int m = floor1$InfoFloor1.postlist[b2 + 2] = paramBuffer.read(k);
/* 120 */         if (m < 0 || m >= 1 << k) {
/* 121 */           floor1$InfoFloor1.free();
/* 122 */           return null;
/*     */         } 
/*     */       } 
/*     */     } 
/* 126 */     floor1$InfoFloor1.postlist[0] = 0;
/* 127 */     floor1$InfoFloor1.postlist[1] = 1 << k;
/*     */     
/* 129 */     return floor1$InfoFloor1;
/*     */   }
/*     */   
/*     */   Object look(DspState paramDspState, InfoMode paramInfoMode, Object paramObject) {
/* 133 */     int i = 0;
/*     */     
/* 135 */     int[] arrayOfInt = new int[65];
/*     */ 
/*     */ 
/*     */     
/* 139 */     Floor1$InfoFloor1 floor1$InfoFloor1 = (Floor1$InfoFloor1)paramObject;
/* 140 */     Floor1$LookFloor1 floor1$LookFloor1 = new Floor1$LookFloor1(this);
/* 141 */     floor1$LookFloor1.vi = floor1$InfoFloor1;
/* 142 */     floor1$LookFloor1.n = floor1$InfoFloor1.postlist[1];
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int j;
/*     */ 
/*     */ 
/*     */     
/* 151 */     for (j = 0; j < floor1$InfoFloor1.partitions; j++) {
/* 152 */       i += floor1$InfoFloor1.class_dim[floor1$InfoFloor1.partitionclass[j]];
/*     */     }
/* 154 */     i += 2;
/* 155 */     floor1$LookFloor1.posts = i;
/*     */ 
/*     */     
/* 158 */     for (j = 0; j < i; j++) {
/* 159 */       arrayOfInt[j] = j;
/*     */     }
/*     */     
/*     */     byte b;
/*     */     
/* 164 */     for (b = 0; b < i - 1; b++) {
/* 165 */       for (byte b1 = b; b1 < i; b1++) {
/* 166 */         if (floor1$InfoFloor1.postlist[arrayOfInt[b]] > floor1$InfoFloor1.postlist[arrayOfInt[b1]]) {
/* 167 */           j = arrayOfInt[b1];
/* 168 */           arrayOfInt[b1] = arrayOfInt[b];
/* 169 */           arrayOfInt[b] = j;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 175 */     for (b = 0; b < i; b++) {
/* 176 */       floor1$LookFloor1.forward_index[b] = arrayOfInt[b];
/*     */     }
/*     */     
/* 179 */     for (b = 0; b < i; b++) {
/* 180 */       floor1$LookFloor1.reverse_index[floor1$LookFloor1.forward_index[b]] = b;
/*     */     }
/*     */     
/* 183 */     for (b = 0; b < i; b++) {
/* 184 */       floor1$LookFloor1.sorted_index[b] = floor1$InfoFloor1.postlist[floor1$LookFloor1.forward_index[b]];
/*     */     }
/*     */ 
/*     */     
/* 188 */     switch (floor1$InfoFloor1.mult) {
/*     */       case 1:
/* 190 */         floor1$LookFloor1.quant_q = 256;
/*     */         break;
/*     */       case 2:
/* 193 */         floor1$LookFloor1.quant_q = 128;
/*     */         break;
/*     */       case 3:
/* 196 */         floor1$LookFloor1.quant_q = 86;
/*     */         break;
/*     */       case 4:
/* 199 */         floor1$LookFloor1.quant_q = 64;
/*     */         break;
/*     */       default:
/* 202 */         floor1$LookFloor1.quant_q = -1;
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 207 */     for (b = 0; b < i - 2; b++) {
/* 208 */       byte b1 = 0;
/* 209 */       byte b2 = 1;
/* 210 */       int k = 0;
/* 211 */       int m = floor1$LookFloor1.n;
/* 212 */       int n = floor1$InfoFloor1.postlist[b + 2];
/* 213 */       for (byte b3 = 0; b3 < b + 2; b3++) {
/* 214 */         int i1 = floor1$InfoFloor1.postlist[b3];
/* 215 */         if (i1 > k && i1 < n) {
/* 216 */           b1 = b3;
/* 217 */           k = i1;
/*     */         } 
/* 219 */         if (i1 < m && i1 > n) {
/* 220 */           b2 = b3;
/* 221 */           m = i1;
/*     */         } 
/*     */       } 
/* 224 */       floor1$LookFloor1.loneighbor[b] = b1;
/* 225 */       floor1$LookFloor1.hineighbor[b] = b2;
/*     */     } 
/*     */     
/* 228 */     return floor1$LookFloor1;
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
/* 241 */     return 0;
/*     */   }
/*     */   
/*     */   Object inverse1(Block paramBlock, Object paramObject1, Object paramObject2) {
/* 245 */     Floor1$LookFloor1 floor1$LookFloor1 = (Floor1$LookFloor1)paramObject1;
/* 246 */     Floor1$InfoFloor1 floor1$InfoFloor1 = floor1$LookFloor1.vi;
/* 247 */     CodeBook[] arrayOfCodeBook = paramBlock.vd.fullbooks;
/*     */ 
/*     */     
/* 250 */     if (paramBlock.opb.read(1) == 1) {
/* 251 */       int[] arrayOfInt = null;
/* 252 */       if (paramObject2 instanceof int[]) {
/* 253 */         arrayOfInt = (int[])paramObject2;
/*     */       }
/* 255 */       if (arrayOfInt == null || arrayOfInt.length < floor1$LookFloor1.posts) {
/* 256 */         arrayOfInt = new int[floor1$LookFloor1.posts];
/*     */       } else {
/*     */         
/* 259 */         for (byte b1 = 0; b1 < arrayOfInt.length; b1++) {
/* 260 */           arrayOfInt[b1] = 0;
/*     */         }
/*     */       } 
/* 263 */       arrayOfInt[0] = paramBlock.opb.read(Util.ilog(floor1$LookFloor1.quant_q - 1));
/* 264 */       arrayOfInt[1] = paramBlock.opb.read(Util.ilog(floor1$LookFloor1.quant_q - 1));
/*     */       byte b;
/*     */       int i;
/* 267 */       for (b = 0, i = 2; b < floor1$InfoFloor1.partitions; b++) {
/* 268 */         int j = floor1$InfoFloor1.partitionclass[b];
/* 269 */         int k = floor1$InfoFloor1.class_dim[j];
/* 270 */         int m = floor1$InfoFloor1.class_subs[j];
/* 271 */         int n = 1 << m;
/* 272 */         int i1 = 0;
/*     */ 
/*     */         
/* 275 */         if (m != 0) {
/* 276 */           i1 = arrayOfCodeBook[floor1$InfoFloor1.class_book[j]].decode(paramBlock.opb);
/*     */           
/* 278 */           if (i1 == -1) {
/* 279 */             return null;
/*     */           }
/*     */         } 
/*     */         
/* 283 */         for (byte b1 = 0; b1 < k; b1++) {
/* 284 */           int i2 = floor1$InfoFloor1.class_subbook[j][i1 & n - 1];
/* 285 */           i1 >>>= m;
/* 286 */           if (i2 >= 0) {
/* 287 */             arrayOfInt[i + b1] = arrayOfCodeBook[i2].decode(paramBlock.opb); if (arrayOfCodeBook[i2].decode(paramBlock.opb) == -1) {
/* 288 */               return null;
/*     */             }
/*     */           } else {
/*     */             
/* 292 */             arrayOfInt[i + b1] = 0;
/*     */           } 
/*     */         } 
/* 295 */         i += k;
/*     */       } 
/*     */ 
/*     */       
/* 299 */       for (b = 2; b < floor1$LookFloor1.posts; b++) {
/* 300 */         i = render_point(floor1$InfoFloor1.postlist[floor1$LookFloor1.loneighbor[b - 2]], floor1$InfoFloor1.postlist[floor1$LookFloor1.hineighbor[b - 2]], arrayOfInt[floor1$LookFloor1.loneighbor[b - 2]], arrayOfInt[floor1$LookFloor1.hineighbor[b - 2]], floor1$InfoFloor1.postlist[b]);
/*     */ 
/*     */ 
/*     */         
/* 304 */         int j = floor1$LookFloor1.quant_q - i;
/* 305 */         int k = i;
/* 306 */         int m = ((j < k) ? j : k) << 1;
/* 307 */         int n = arrayOfInt[b];
/*     */         
/* 309 */         if (n != 0) {
/* 310 */           if (n >= m) {
/* 311 */             if (j > k) {
/* 312 */               n -= k;
/*     */             } else {
/*     */               
/* 315 */               n = -1 - n - j;
/*     */             }
/*     */           
/*     */           }
/* 319 */           else if ((n & 0x1) != 0) {
/* 320 */             n = -(n + 1 >>> 1);
/*     */           } else {
/*     */             
/* 323 */             n >>= 1;
/*     */           } 
/*     */ 
/*     */           
/* 327 */           arrayOfInt[b] = n + i;
/* 328 */           arrayOfInt[floor1$LookFloor1.loneighbor[b - 2]] = arrayOfInt[floor1$LookFloor1.loneighbor[b - 2]] & 0x7FFF;
/* 329 */           arrayOfInt[floor1$LookFloor1.hineighbor[b - 2]] = arrayOfInt[floor1$LookFloor1.hineighbor[b - 2]] & 0x7FFF;
/*     */         } else {
/*     */           
/* 332 */           arrayOfInt[b] = i | 0x8000;
/*     */         } 
/*     */       } 
/* 335 */       return arrayOfInt;
/*     */     } 
/*     */     
/* 338 */     return null;
/*     */   }
/*     */   
/*     */   private static int render_point(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 342 */     paramInt3 &= 0x7FFF;
/* 343 */     paramInt4 &= 0x7FFF;
/*     */ 
/*     */     
/* 346 */     int i = paramInt4 - paramInt3;
/* 347 */     int j = paramInt2 - paramInt1;
/* 348 */     int k = Math.abs(i);
/* 349 */     int m = k * (paramInt5 - paramInt1);
/*     */     
/* 351 */     int n = m / j;
/* 352 */     if (i < 0)
/* 353 */       return paramInt3 - n; 
/* 354 */     return paramInt3 + n;
/*     */   }
/*     */ 
/*     */   
/*     */   int inverse2(Block paramBlock, Object paramObject1, Object paramObject2, float[] paramArrayOffloat) {
/* 359 */     Floor1$LookFloor1 floor1$LookFloor1 = (Floor1$LookFloor1)paramObject1;
/* 360 */     Floor1$InfoFloor1 floor1$InfoFloor1 = floor1$LookFloor1.vi;
/* 361 */     int i = paramBlock.vd.vi.blocksizes[paramBlock.mode] / 2;
/*     */     
/* 363 */     if (paramObject2 != null) {
/*     */       
/* 365 */       int[] arrayOfInt = (int[])paramObject2;
/* 366 */       int j = 0;
/* 367 */       int k = 0;
/* 368 */       int m = arrayOfInt[0] * floor1$InfoFloor1.mult; int n;
/* 369 */       for (n = 1; n < floor1$LookFloor1.posts; n++) {
/* 370 */         int i1 = floor1$LookFloor1.forward_index[n];
/* 371 */         int i2 = arrayOfInt[i1] & 0x7FFF;
/* 372 */         if (i2 == arrayOfInt[i1]) {
/* 373 */           i2 *= floor1$InfoFloor1.mult;
/* 374 */           j = floor1$InfoFloor1.postlist[i1];
/*     */           
/* 376 */           render_line(k, j, m, i2, paramArrayOffloat);
/*     */           
/* 378 */           k = j;
/* 379 */           m = i2;
/*     */         } 
/*     */       } 
/* 382 */       for (n = j; n < i; n++) {
/* 383 */         paramArrayOffloat[n] = paramArrayOffloat[n] * paramArrayOffloat[n - 1];
/*     */       }
/* 385 */       return 1;
/*     */     } 
/* 387 */     for (byte b = 0; b < i; b++) {
/* 388 */       paramArrayOffloat[b] = 0.0F;
/*     */     }
/* 390 */     return 0;
/*     */   }
/*     */   
/* 393 */   private static float[] FLOOR_fromdB_LOOKUP = new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
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
/*     */   private static void render_line(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOffloat) {
/* 456 */     int i = paramInt4 - paramInt3;
/* 457 */     int j = paramInt2 - paramInt1;
/* 458 */     int k = Math.abs(i);
/* 459 */     int m = i / j;
/* 460 */     int n = (i < 0) ? (m - 1) : (m + 1);
/* 461 */     int i1 = paramInt1;
/* 462 */     int i2 = paramInt3;
/* 463 */     int i3 = 0;
/*     */     
/* 465 */     k -= Math.abs(m * j);
/*     */     
/* 467 */     paramArrayOffloat[i1] = paramArrayOffloat[i1] * FLOOR_fromdB_LOOKUP[i2];
/* 468 */     while (++i1 < paramInt2) {
/* 469 */       i3 += k;
/* 470 */       if (i3 >= j) {
/* 471 */         i3 -= j;
/* 472 */         i2 += n;
/*     */       } else {
/*     */         
/* 475 */         i2 += m;
/*     */       } 
/* 477 */       paramArrayOffloat[i1] = paramArrayOffloat[i1] * FLOOR_fromdB_LOOKUP[i2];
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Floor1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */