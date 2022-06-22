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
/*     */ class Mapping0
/*     */   extends FuncMapping
/*     */ {
/*  32 */   static int seq = 0;
/*     */ 
/*     */   
/*     */   void free_info(Object paramObject) {}
/*     */ 
/*     */   
/*     */   void free_look(Object paramObject) {}
/*     */ 
/*     */   
/*     */   Object look(DspState paramDspState, InfoMode paramInfoMode, Object paramObject) {
/*  42 */     Info info = paramDspState.vi;
/*  43 */     Mapping0$LookMapping0 mapping0$LookMapping0 = new Mapping0$LookMapping0(this);
/*  44 */     Mapping0$InfoMapping0 mapping0$InfoMapping0 = mapping0$LookMapping0.map = (Mapping0$InfoMapping0)paramObject;
/*  45 */     mapping0$LookMapping0.mode = paramInfoMode;
/*     */     
/*  47 */     mapping0$LookMapping0.time_look = new Object[mapping0$InfoMapping0.submaps];
/*  48 */     mapping0$LookMapping0.floor_look = new Object[mapping0$InfoMapping0.submaps];
/*  49 */     mapping0$LookMapping0.residue_look = new Object[mapping0$InfoMapping0.submaps];
/*     */     
/*  51 */     mapping0$LookMapping0.time_func = new FuncTime[mapping0$InfoMapping0.submaps];
/*  52 */     mapping0$LookMapping0.floor_func = new FuncFloor[mapping0$InfoMapping0.submaps];
/*  53 */     mapping0$LookMapping0.residue_func = new FuncResidue[mapping0$InfoMapping0.submaps];
/*     */     
/*  55 */     for (byte b = 0; b < mapping0$InfoMapping0.submaps; b++) {
/*  56 */       int i = mapping0$InfoMapping0.timesubmap[b];
/*  57 */       int j = mapping0$InfoMapping0.floorsubmap[b];
/*  58 */       int k = mapping0$InfoMapping0.residuesubmap[b];
/*     */       
/*  60 */       mapping0$LookMapping0.time_func[b] = FuncTime.time_P[info.time_type[i]];
/*  61 */       mapping0$LookMapping0.time_look[b] = mapping0$LookMapping0.time_func[b].look(paramDspState, paramInfoMode, info.time_param[i]);
/*  62 */       mapping0$LookMapping0.floor_func[b] = FuncFloor.floor_P[info.floor_type[j]];
/*  63 */       mapping0$LookMapping0.floor_look[b] = mapping0$LookMapping0.floor_func[b].look(paramDspState, paramInfoMode, info.floor_param[j]);
/*     */       
/*  65 */       mapping0$LookMapping0.residue_func[b] = FuncResidue.residue_P[info.residue_type[k]];
/*  66 */       mapping0$LookMapping0.residue_look[b] = mapping0$LookMapping0.residue_func[b].look(paramDspState, paramInfoMode, info.residue_param[k]);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  71 */     if (info.psys == 0 || paramDspState.analysisp != 0);
/*     */ 
/*     */ 
/*     */     
/*  75 */     mapping0$LookMapping0.ch = info.channels;
/*     */     
/*  77 */     return mapping0$LookMapping0;
/*     */   }
/*     */   
/*     */   void pack(Info paramInfo, Object paramObject, Buffer paramBuffer) {
/*  81 */     Mapping0$InfoMapping0 mapping0$InfoMapping0 = (Mapping0$InfoMapping0)paramObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     if (mapping0$InfoMapping0.submaps > 1) {
/*  91 */       paramBuffer.write(1, 1);
/*  92 */       paramBuffer.write(mapping0$InfoMapping0.submaps - 1, 4);
/*     */     } else {
/*     */       
/*  95 */       paramBuffer.write(0, 1);
/*     */     } 
/*     */     
/*  98 */     if (mapping0$InfoMapping0.coupling_steps > 0) {
/*  99 */       paramBuffer.write(1, 1);
/* 100 */       paramBuffer.write(mapping0$InfoMapping0.coupling_steps - 1, 8);
/* 101 */       for (byte b1 = 0; b1 < mapping0$InfoMapping0.coupling_steps; b1++) {
/* 102 */         paramBuffer.write(mapping0$InfoMapping0.coupling_mag[b1], Util.ilog2(paramInfo.channels));
/* 103 */         paramBuffer.write(mapping0$InfoMapping0.coupling_ang[b1], Util.ilog2(paramInfo.channels));
/*     */       } 
/*     */     } else {
/*     */       
/* 107 */       paramBuffer.write(0, 1);
/*     */     } 
/*     */     
/* 110 */     paramBuffer.write(0, 2);
/*     */ 
/*     */     
/* 113 */     if (mapping0$InfoMapping0.submaps > 1)
/* 114 */       for (byte b1 = 0; b1 < paramInfo.channels; b1++) {
/* 115 */         paramBuffer.write(mapping0$InfoMapping0.chmuxlist[b1], 4);
/*     */       } 
/* 117 */     for (byte b = 0; b < mapping0$InfoMapping0.submaps; b++) {
/* 118 */       paramBuffer.write(mapping0$InfoMapping0.timesubmap[b], 8);
/* 119 */       paramBuffer.write(mapping0$InfoMapping0.floorsubmap[b], 8);
/* 120 */       paramBuffer.write(mapping0$InfoMapping0.residuesubmap[b], 8);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   Object unpack(Info paramInfo, Buffer paramBuffer) {
/* 126 */     Mapping0$InfoMapping0 mapping0$InfoMapping0 = new Mapping0$InfoMapping0(this);
/*     */     
/* 128 */     if (paramBuffer.read(1) != 0) {
/* 129 */       mapping0$InfoMapping0.submaps = paramBuffer.read(4) + 1;
/*     */     } else {
/*     */       
/* 132 */       mapping0$InfoMapping0.submaps = 1;
/*     */     } 
/*     */     
/* 135 */     if (paramBuffer.read(1) != 0) {
/* 136 */       mapping0$InfoMapping0.coupling_steps = paramBuffer.read(8) + 1;
/*     */       
/* 138 */       for (byte b1 = 0; b1 < mapping0$InfoMapping0.coupling_steps; b1++) {
/* 139 */         int i = mapping0$InfoMapping0.coupling_mag[b1] = paramBuffer.read(Util.ilog2(paramInfo.channels));
/* 140 */         int j = mapping0$InfoMapping0.coupling_ang[b1] = paramBuffer.read(Util.ilog2(paramInfo.channels));
/*     */         
/* 142 */         if (i < 0 || j < 0 || i == j || i >= paramInfo.channels || j >= paramInfo.channels) {
/*     */ 
/*     */           
/* 145 */           mapping0$InfoMapping0.free();
/* 146 */           return null;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 151 */     if (paramBuffer.read(2) > 0) {
/* 152 */       mapping0$InfoMapping0.free();
/* 153 */       return null;
/*     */     } 
/*     */     
/* 156 */     if (mapping0$InfoMapping0.submaps > 1) {
/* 157 */       for (byte b1 = 0; b1 < paramInfo.channels; b1++) {
/* 158 */         mapping0$InfoMapping0.chmuxlist[b1] = paramBuffer.read(4);
/* 159 */         if (mapping0$InfoMapping0.chmuxlist[b1] >= mapping0$InfoMapping0.submaps) {
/* 160 */           mapping0$InfoMapping0.free();
/* 161 */           return null;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 166 */     for (byte b = 0; b < mapping0$InfoMapping0.submaps; b++) {
/* 167 */       mapping0$InfoMapping0.timesubmap[b] = paramBuffer.read(8);
/* 168 */       if (mapping0$InfoMapping0.timesubmap[b] >= paramInfo.times) {
/* 169 */         mapping0$InfoMapping0.free();
/* 170 */         return null;
/*     */       } 
/* 172 */       mapping0$InfoMapping0.floorsubmap[b] = paramBuffer.read(8);
/* 173 */       if (mapping0$InfoMapping0.floorsubmap[b] >= paramInfo.floors) {
/* 174 */         mapping0$InfoMapping0.free();
/* 175 */         return null;
/*     */       } 
/* 177 */       mapping0$InfoMapping0.residuesubmap[b] = paramBuffer.read(8);
/* 178 */       if (mapping0$InfoMapping0.residuesubmap[b] >= paramInfo.residues) {
/* 179 */         mapping0$InfoMapping0.free();
/* 180 */         return null;
/*     */       } 
/*     */     } 
/* 183 */     return mapping0$InfoMapping0;
/*     */   }
/*     */   
/* 186 */   float[][] pcmbundle = (float[][])null;
/* 187 */   int[] zerobundle = null;
/* 188 */   int[] nonzero = null;
/* 189 */   Object[] floormemo = null;
/*     */   
/*     */   synchronized int inverse(Block paramBlock, Object paramObject) {
/* 192 */     DspState dspState = paramBlock.vd;
/* 193 */     Info info = dspState.vi;
/* 194 */     Mapping0$LookMapping0 mapping0$LookMapping0 = (Mapping0$LookMapping0)paramObject;
/* 195 */     Mapping0$InfoMapping0 mapping0$InfoMapping0 = mapping0$LookMapping0.map;
/* 196 */     InfoMode infoMode = mapping0$LookMapping0.mode;
/* 197 */     int i = paramBlock.pcmend = info.blocksizes[paramBlock.W];
/*     */     
/* 199 */     float[] arrayOfFloat = dspState.window[paramBlock.W][paramBlock.lW][paramBlock.nW][infoMode.windowtype];
/* 200 */     if (this.pcmbundle == null || this.pcmbundle.length < info.channels) {
/* 201 */       this.pcmbundle = new float[info.channels][];
/* 202 */       this.nonzero = new int[info.channels];
/* 203 */       this.zerobundle = new int[info.channels];
/* 204 */       this.floormemo = new Object[info.channels];
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     int j;
/*     */ 
/*     */ 
/*     */     
/* 213 */     for (j = 0; j < info.channels; j++) {
/* 214 */       float[] arrayOfFloat1 = paramBlock.pcm[j];
/* 215 */       int k = mapping0$InfoMapping0.chmuxlist[j];
/*     */       
/* 217 */       this.floormemo[j] = mapping0$LookMapping0.floor_func[k].inverse1(paramBlock, mapping0$LookMapping0.floor_look[k], this.floormemo[j]);
/*     */       
/* 219 */       if (this.floormemo[j] != null) {
/* 220 */         this.nonzero[j] = 1;
/*     */       } else {
/*     */         
/* 223 */         this.nonzero[j] = 0;
/*     */       } 
/* 225 */       for (byte b = 0; b < i / 2; b++) {
/* 226 */         arrayOfFloat1[b] = 0.0F;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 231 */     for (j = 0; j < mapping0$InfoMapping0.coupling_steps; j++) {
/* 232 */       if (this.nonzero[mapping0$InfoMapping0.coupling_mag[j]] != 0 || this.nonzero[mapping0$InfoMapping0.coupling_ang[j]] != 0) {
/* 233 */         this.nonzero[mapping0$InfoMapping0.coupling_mag[j]] = 1;
/* 234 */         this.nonzero[mapping0$InfoMapping0.coupling_ang[j]] = 1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 240 */     for (j = 0; j < mapping0$InfoMapping0.submaps; j++) {
/* 241 */       byte b1 = 0;
/* 242 */       for (byte b2 = 0; b2 < info.channels; b2++) {
/* 243 */         if (mapping0$InfoMapping0.chmuxlist[b2] == j) {
/* 244 */           if (this.nonzero[b2] != 0) {
/* 245 */             this.zerobundle[b1] = 1;
/*     */           } else {
/*     */             
/* 248 */             this.zerobundle[b1] = 0;
/*     */           } 
/* 250 */           this.pcmbundle[b1++] = paramBlock.pcm[b2];
/*     */         } 
/*     */       } 
/*     */       
/* 254 */       mapping0$LookMapping0.residue_func[j].inverse(paramBlock, mapping0$LookMapping0.residue_look[j], this.pcmbundle, this.zerobundle, b1);
/*     */     } 
/*     */ 
/*     */     
/* 258 */     for (j = mapping0$InfoMapping0.coupling_steps - 1; j >= 0; j--) {
/* 259 */       float[] arrayOfFloat1 = paramBlock.pcm[mapping0$InfoMapping0.coupling_mag[j]];
/* 260 */       float[] arrayOfFloat2 = paramBlock.pcm[mapping0$InfoMapping0.coupling_ang[j]];
/*     */       
/* 262 */       for (byte b = 0; b < i / 2; b++) {
/* 263 */         float f1 = arrayOfFloat1[b];
/* 264 */         float f2 = arrayOfFloat2[b];
/*     */         
/* 266 */         if (f1 > 0.0F) {
/* 267 */           if (f2 > 0.0F) {
/* 268 */             arrayOfFloat1[b] = f1;
/* 269 */             arrayOfFloat2[b] = f1 - f2;
/*     */           } else {
/*     */             
/* 272 */             arrayOfFloat2[b] = f1;
/* 273 */             arrayOfFloat1[b] = f1 + f2;
/*     */           }
/*     */         
/*     */         }
/* 277 */         else if (f2 > 0.0F) {
/* 278 */           arrayOfFloat1[b] = f1;
/* 279 */           arrayOfFloat2[b] = f1 + f2;
/*     */         } else {
/*     */           
/* 282 */           arrayOfFloat2[b] = f1;
/* 283 */           arrayOfFloat1[b] = f1 - f2;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     for (j = 0; j < info.channels; j++) {
/* 292 */       float[] arrayOfFloat1 = paramBlock.pcm[j];
/* 293 */       int k = mapping0$InfoMapping0.chmuxlist[j];
/* 294 */       mapping0$LookMapping0.floor_func[k].inverse2(paramBlock, mapping0$LookMapping0.floor_look[k], this.floormemo[j], arrayOfFloat1);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 301 */     for (j = 0; j < info.channels; j++) {
/* 302 */       float[] arrayOfFloat1 = paramBlock.pcm[j];
/*     */       
/* 304 */       ((Mdct)dspState.transform[paramBlock.W][0]).backward(arrayOfFloat1, arrayOfFloat1);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 311 */     for (j = 0; j < info.channels; j++) {
/* 312 */       float[] arrayOfFloat1 = paramBlock.pcm[j];
/* 313 */       if (this.nonzero[j] != 0) {
/* 314 */         for (byte b = 0; b < i; b++) {
/* 315 */           arrayOfFloat1[b] = arrayOfFloat1[b] * arrayOfFloat[b];
/*     */         }
/*     */       } else {
/*     */         
/* 319 */         for (byte b = 0; b < i; b++) {
/* 320 */           arrayOfFloat1[b] = 0.0F;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 328 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Mapping0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */