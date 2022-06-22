/*     */ package com.jcraft.jorbis;
/*     */ 
/*     */ import com.jcraft.jogg.Buffer;
/*     */ import com.jcraft.jogg.Packet;
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
/*     */ public class Info
/*     */ {
/*     */   private static final int OV_EBADPACKET = -136;
/*     */   private static final int OV_ENOTAUDIO = -135;
/*  35 */   private static byte[] _vorbis = "vorbis".getBytes();
/*     */ 
/*     */   
/*     */   private static final int VI_TIMEB = 1;
/*     */ 
/*     */   
/*     */   private static final int VI_FLOORB = 2;
/*     */ 
/*     */   
/*     */   private static final int VI_RESB = 3;
/*     */ 
/*     */   
/*     */   private static final int VI_MAPB = 1;
/*     */ 
/*     */   
/*     */   private static final int VI_WINDOWB = 1;
/*     */ 
/*     */   
/*     */   public int version;
/*     */ 
/*     */   
/*     */   public int channels;
/*     */ 
/*     */   
/*     */   public int rate;
/*     */ 
/*     */   
/*     */   int bitrate_upper;
/*     */ 
/*     */   
/*     */   int bitrate_nominal;
/*     */   
/*     */   int bitrate_lower;
/*     */   
/*  69 */   int[] blocksizes = new int[2];
/*     */   
/*     */   int modes;
/*     */   
/*     */   int maps;
/*     */   
/*     */   int times;
/*     */   
/*     */   int floors;
/*     */   
/*     */   int residues;
/*     */   
/*     */   int books;
/*     */   
/*     */   int psys;
/*  84 */   InfoMode[] mode_param = null;
/*     */   
/*  86 */   int[] map_type = null;
/*  87 */   Object[] map_param = null;
/*     */   
/*  89 */   int[] time_type = null;
/*  90 */   Object[] time_param = null;
/*     */   
/*  92 */   int[] floor_type = null;
/*  93 */   Object[] floor_param = null;
/*     */   
/*  95 */   int[] residue_type = null;
/*  96 */   Object[] residue_param = null;
/*     */   
/*  98 */   StaticCodeBook[] book_param = null;
/*     */   
/* 100 */   PsyInfo[] psy_param = new PsyInfo[64];
/*     */   
/*     */   int envelopesa;
/*     */   
/*     */   float preecho_thresh;
/*     */   
/*     */   float preecho_clamp;
/*     */   
/*     */   public void init() {
/* 109 */     this.rate = 0;
/*     */   }
/*     */   public void clear() {
/*     */     byte b;
/* 113 */     for (b = 0; b < this.modes; b++) {
/* 114 */       this.mode_param[b] = null;
/*     */     }
/* 116 */     this.mode_param = null;
/*     */     
/* 118 */     for (b = 0; b < this.maps; b++) {
/* 119 */       FuncMapping.mapping_P[this.map_type[b]].free_info(this.map_param[b]);
/*     */     }
/* 121 */     this.map_param = null;
/*     */     
/* 123 */     for (b = 0; b < this.times; b++) {
/* 124 */       FuncTime.time_P[this.time_type[b]].free_info(this.time_param[b]);
/*     */     }
/* 126 */     this.time_param = null;
/*     */     
/* 128 */     for (b = 0; b < this.floors; b++) {
/* 129 */       FuncFloor.floor_P[this.floor_type[b]].free_info(this.floor_param[b]);
/*     */     }
/* 131 */     this.floor_param = null;
/*     */     
/* 133 */     for (b = 0; b < this.residues; b++) {
/* 134 */       FuncResidue.residue_P[this.residue_type[b]].free_info(this.residue_param[b]);
/*     */     }
/* 136 */     this.residue_param = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     for (b = 0; b < this.books; b++) {
/*     */       
/* 144 */       if (this.book_param[b] != null) {
/* 145 */         this.book_param[b].clear();
/* 146 */         this.book_param[b] = null;
/*     */       } 
/*     */     } 
/*     */     
/* 150 */     this.book_param = null;
/*     */     
/* 152 */     for (b = 0; b < this.psys; b++) {
/* 153 */       this.psy_param[b].free();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int unpack_info(Buffer paramBuffer) {
/* 160 */     this.version = paramBuffer.read(32);
/* 161 */     if (this.version != 0) {
/* 162 */       return -1;
/*     */     }
/* 164 */     this.channels = paramBuffer.read(8);
/* 165 */     this.rate = paramBuffer.read(32);
/*     */     
/* 167 */     this.bitrate_upper = paramBuffer.read(32);
/* 168 */     this.bitrate_nominal = paramBuffer.read(32);
/* 169 */     this.bitrate_lower = paramBuffer.read(32);
/*     */     
/* 171 */     this.blocksizes[0] = 1 << paramBuffer.read(4);
/* 172 */     this.blocksizes[1] = 1 << paramBuffer.read(4);
/*     */     
/* 174 */     if (this.rate < 1 || this.channels < 1 || this.blocksizes[0] < 8 || this.blocksizes[1] < this.blocksizes[0] || paramBuffer.read(1) != 1) {
/*     */       
/* 176 */       clear();
/* 177 */       return -1;
/*     */     } 
/* 179 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int unpack_books(Buffer paramBuffer) {
/* 186 */     this.books = paramBuffer.read(8) + 1;
/*     */     
/* 188 */     if (this.book_param == null || this.book_param.length != this.books)
/* 189 */       this.book_param = new StaticCodeBook[this.books];  byte b;
/* 190 */     for (b = 0; b < this.books; b++) {
/* 191 */       this.book_param[b] = new StaticCodeBook();
/* 192 */       if (this.book_param[b].unpack(paramBuffer) != 0) {
/* 193 */         clear();
/* 194 */         return -1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 199 */     this.times = paramBuffer.read(6) + 1;
/* 200 */     if (this.time_type == null || this.time_type.length != this.times)
/* 201 */       this.time_type = new int[this.times]; 
/* 202 */     if (this.time_param == null || this.time_param.length != this.times)
/* 203 */       this.time_param = new Object[this.times]; 
/* 204 */     for (b = 0; b < this.times; b++) {
/* 205 */       this.time_type[b] = paramBuffer.read(16);
/* 206 */       if (this.time_type[b] < 0 || this.time_type[b] >= 1) {
/* 207 */         clear();
/* 208 */         return -1;
/*     */       } 
/* 210 */       this.time_param[b] = FuncTime.time_P[this.time_type[b]].unpack(this, paramBuffer);
/* 211 */       if (this.time_param[b] == null) {
/* 212 */         clear();
/* 213 */         return -1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 218 */     this.floors = paramBuffer.read(6) + 1;
/* 219 */     if (this.floor_type == null || this.floor_type.length != this.floors)
/* 220 */       this.floor_type = new int[this.floors]; 
/* 221 */     if (this.floor_param == null || this.floor_param.length != this.floors) {
/* 222 */       this.floor_param = new Object[this.floors];
/*     */     }
/* 224 */     for (b = 0; b < this.floors; b++) {
/* 225 */       this.floor_type[b] = paramBuffer.read(16);
/* 226 */       if (this.floor_type[b] < 0 || this.floor_type[b] >= 2) {
/* 227 */         clear();
/* 228 */         return -1;
/*     */       } 
/*     */       
/* 231 */       this.floor_param[b] = FuncFloor.floor_P[this.floor_type[b]].unpack(this, paramBuffer);
/* 232 */       if (this.floor_param[b] == null) {
/* 233 */         clear();
/* 234 */         return -1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 239 */     this.residues = paramBuffer.read(6) + 1;
/*     */     
/* 241 */     if (this.residue_type == null || this.residue_type.length != this.residues) {
/* 242 */       this.residue_type = new int[this.residues];
/*     */     }
/* 244 */     if (this.residue_param == null || this.residue_param.length != this.residues) {
/* 245 */       this.residue_param = new Object[this.residues];
/*     */     }
/* 247 */     for (b = 0; b < this.residues; b++) {
/* 248 */       this.residue_type[b] = paramBuffer.read(16);
/* 249 */       if (this.residue_type[b] < 0 || this.residue_type[b] >= 3) {
/* 250 */         clear();
/* 251 */         return -1;
/*     */       } 
/* 253 */       this.residue_param[b] = FuncResidue.residue_P[this.residue_type[b]].unpack(this, paramBuffer);
/* 254 */       if (this.residue_param[b] == null) {
/* 255 */         clear();
/* 256 */         return -1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 261 */     this.maps = paramBuffer.read(6) + 1;
/* 262 */     if (this.map_type == null || this.map_type.length != this.maps)
/* 263 */       this.map_type = new int[this.maps]; 
/* 264 */     if (this.map_param == null || this.map_param.length != this.maps)
/* 265 */       this.map_param = new Object[this.maps]; 
/* 266 */     for (b = 0; b < this.maps; b++) {
/* 267 */       this.map_type[b] = paramBuffer.read(16);
/* 268 */       if (this.map_type[b] < 0 || this.map_type[b] >= 1) {
/* 269 */         clear();
/* 270 */         return -1;
/*     */       } 
/* 272 */       this.map_param[b] = FuncMapping.mapping_P[this.map_type[b]].unpack(this, paramBuffer);
/* 273 */       if (this.map_param[b] == null) {
/* 274 */         clear();
/* 275 */         return -1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 280 */     this.modes = paramBuffer.read(6) + 1;
/* 281 */     if (this.mode_param == null || this.mode_param.length != this.modes)
/* 282 */       this.mode_param = new InfoMode[this.modes]; 
/* 283 */     for (b = 0; b < this.modes; b++) {
/* 284 */       this.mode_param[b] = new InfoMode();
/* 285 */       (this.mode_param[b]).blockflag = paramBuffer.read(1);
/* 286 */       (this.mode_param[b]).windowtype = paramBuffer.read(16);
/* 287 */       (this.mode_param[b]).transformtype = paramBuffer.read(16);
/* 288 */       (this.mode_param[b]).mapping = paramBuffer.read(8);
/*     */       
/* 290 */       if ((this.mode_param[b]).windowtype >= 1 || (this.mode_param[b]).transformtype >= 1 || (this.mode_param[b]).mapping >= this.maps) {
/*     */ 
/*     */         
/* 293 */         clear();
/* 294 */         return -1;
/*     */       } 
/*     */     } 
/*     */     
/* 298 */     if (paramBuffer.read(1) != 1) {
/* 299 */       clear();
/* 300 */       return -1;
/*     */     } 
/*     */     
/* 303 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int synthesis_headerin(Comment paramComment, Packet paramPacket) {
/* 312 */     Buffer buffer = new Buffer();
/*     */     
/* 314 */     if (paramPacket != null) {
/* 315 */       buffer.readinit(paramPacket.packet_base, paramPacket.packet, paramPacket.bytes);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 320 */       byte[] arrayOfByte = new byte[6];
/* 321 */       int i = buffer.read(8);
/* 322 */       buffer.read(arrayOfByte, 6);
/* 323 */       if (arrayOfByte[0] != 118 || arrayOfByte[1] != 111 || arrayOfByte[2] != 114 || arrayOfByte[3] != 98 || arrayOfByte[4] != 105 || arrayOfByte[5] != 115)
/*     */       {
/*     */         
/* 326 */         return -1;
/*     */       }
/* 328 */       switch (i) {
/*     */         case 1:
/* 330 */           if (paramPacket.b_o_s == 0)
/*     */           {
/* 332 */             return -1;
/*     */           }
/* 334 */           if (this.rate != 0)
/*     */           {
/* 336 */             return -1;
/*     */           }
/* 338 */           return unpack_info(buffer);
/*     */         case 3:
/* 340 */           if (this.rate == 0)
/*     */           {
/* 342 */             return -1;
/*     */           }
/* 344 */           return paramComment.unpack(buffer);
/*     */         case 5:
/* 346 */           if (this.rate == 0 || paramComment.vendor == null)
/*     */           {
/* 348 */             return -1;
/*     */           }
/* 350 */           return unpack_books(buffer);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 358 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int pack_info(Buffer paramBuffer) {
/* 364 */     paramBuffer.write(1, 8);
/* 365 */     paramBuffer.write(_vorbis);
/*     */ 
/*     */     
/* 368 */     paramBuffer.write(0, 32);
/* 369 */     paramBuffer.write(this.channels, 8);
/* 370 */     paramBuffer.write(this.rate, 32);
/*     */     
/* 372 */     paramBuffer.write(this.bitrate_upper, 32);
/* 373 */     paramBuffer.write(this.bitrate_nominal, 32);
/* 374 */     paramBuffer.write(this.bitrate_lower, 32);
/*     */     
/* 376 */     paramBuffer.write(Util.ilog2(this.blocksizes[0]), 4);
/* 377 */     paramBuffer.write(Util.ilog2(this.blocksizes[1]), 4);
/* 378 */     paramBuffer.write(1, 1);
/* 379 */     return 0;
/*     */   }
/*     */   
/*     */   int pack_books(Buffer paramBuffer) {
/* 383 */     paramBuffer.write(5, 8);
/* 384 */     paramBuffer.write(_vorbis);
/*     */ 
/*     */     
/* 387 */     paramBuffer.write(this.books - 1, 8); byte b;
/* 388 */     for (b = 0; b < this.books; b++) {
/* 389 */       if (this.book_param[b].pack(paramBuffer) != 0)
/*     */       {
/* 391 */         return -1;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 396 */     paramBuffer.write(this.times - 1, 6);
/* 397 */     for (b = 0; b < this.times; b++) {
/* 398 */       paramBuffer.write(this.time_type[b], 16);
/* 399 */       FuncTime.time_P[this.time_type[b]].pack(this.time_param[b], paramBuffer);
/*     */     } 
/*     */ 
/*     */     
/* 403 */     paramBuffer.write(this.floors - 1, 6);
/* 404 */     for (b = 0; b < this.floors; b++) {
/* 405 */       paramBuffer.write(this.floor_type[b], 16);
/* 406 */       FuncFloor.floor_P[this.floor_type[b]].pack(this.floor_param[b], paramBuffer);
/*     */     } 
/*     */ 
/*     */     
/* 410 */     paramBuffer.write(this.residues - 1, 6);
/* 411 */     for (b = 0; b < this.residues; b++) {
/* 412 */       paramBuffer.write(this.residue_type[b], 16);
/* 413 */       FuncResidue.residue_P[this.residue_type[b]].pack(this.residue_param[b], paramBuffer);
/*     */     } 
/*     */ 
/*     */     
/* 417 */     paramBuffer.write(this.maps - 1, 6);
/* 418 */     for (b = 0; b < this.maps; b++) {
/* 419 */       paramBuffer.write(this.map_type[b], 16);
/* 420 */       FuncMapping.mapping_P[this.map_type[b]].pack(this, this.map_param[b], paramBuffer);
/*     */     } 
/*     */ 
/*     */     
/* 424 */     paramBuffer.write(this.modes - 1, 6);
/* 425 */     for (b = 0; b < this.modes; b++) {
/* 426 */       paramBuffer.write((this.mode_param[b]).blockflag, 1);
/* 427 */       paramBuffer.write((this.mode_param[b]).windowtype, 16);
/* 428 */       paramBuffer.write((this.mode_param[b]).transformtype, 16);
/* 429 */       paramBuffer.write((this.mode_param[b]).mapping, 8);
/*     */     } 
/* 431 */     paramBuffer.write(1, 1);
/* 432 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int blocksize(Packet paramPacket) {
/* 437 */     Buffer buffer = new Buffer();
/*     */ 
/*     */ 
/*     */     
/* 441 */     buffer.readinit(paramPacket.packet_base, paramPacket.packet, paramPacket.bytes);
/*     */ 
/*     */     
/* 444 */     if (buffer.read(1) != 0)
/*     */     {
/* 446 */       return -135;
/*     */     }
/*     */     
/* 449 */     byte b = 0;
/* 450 */     int j = this.modes;
/* 451 */     while (j > 1) {
/* 452 */       b++;
/* 453 */       j >>>= 1;
/*     */     } 
/*     */ 
/*     */     
/* 457 */     int i = buffer.read(b);
/*     */     
/* 459 */     if (i == -1)
/* 460 */       return -136; 
/* 461 */     return this.blocksizes[(this.mode_param[i]).blockflag];
/*     */   }
/*     */   
/*     */   public String toString() {
/* 465 */     return "version:" + new Integer(this.version) + ", channels:" + new Integer(this.channels) + ", rate:" + new Integer(this.rate) + ", bitrate:" + new Integer(this.bitrate_upper) + "," + new Integer(this.bitrate_nominal) + "," + new Integer(this.bitrate_lower);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Info.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */