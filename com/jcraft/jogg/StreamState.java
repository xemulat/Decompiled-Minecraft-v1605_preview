/*     */ package com.jcraft.jogg;
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
/*     */ public class StreamState
/*     */ {
/*     */   byte[] body_data;
/*     */   int body_storage;
/*     */   int body_fill;
/*     */   private int body_returned;
/*     */   int[] lacing_vals;
/*     */   long[] granule_vals;
/*     */   int lacing_storage;
/*     */   int lacing_fill;
/*     */   int lacing_packet;
/*     */   int lacing_returned;
/*  44 */   byte[] header = new byte[282];
/*     */   
/*     */   int header_fill;
/*     */   
/*     */   public int e_o_s;
/*     */   
/*     */   int b_o_s;
/*     */   
/*     */   int serialno;
/*     */   
/*     */   int pageno;
/*     */   
/*     */   long packetno;
/*     */   
/*     */   long granulepos;
/*     */   
/*     */   public StreamState() {
/*  61 */     init();
/*     */   }
/*     */   
/*     */   StreamState(int paramInt) {
/*  65 */     this();
/*  66 */     init(paramInt);
/*     */   }
/*     */   
/*     */   void init() {
/*  70 */     this.body_storage = 16384;
/*  71 */     this.body_data = new byte[this.body_storage];
/*  72 */     this.lacing_storage = 1024;
/*  73 */     this.lacing_vals = new int[this.lacing_storage];
/*  74 */     this.granule_vals = new long[this.lacing_storage];
/*     */   }
/*     */   
/*     */   public void init(int paramInt) {
/*  78 */     if (this.body_data == null) {
/*  79 */       init();
/*     */     } else {
/*     */       byte b;
/*  82 */       for (b = 0; b < this.body_data.length; b++)
/*  83 */         this.body_data[b] = 0; 
/*  84 */       for (b = 0; b < this.lacing_vals.length; b++)
/*  85 */         this.lacing_vals[b] = 0; 
/*  86 */       for (b = 0; b < this.granule_vals.length; b++)
/*  87 */         this.granule_vals[b] = 0L; 
/*     */     } 
/*  89 */     this.serialno = paramInt;
/*     */   }
/*     */   
/*     */   public void clear() {
/*  93 */     this.body_data = null;
/*  94 */     this.lacing_vals = null;
/*  95 */     this.granule_vals = null;
/*     */   }
/*     */   
/*     */   void destroy() {
/*  99 */     clear();
/*     */   }
/*     */   
/*     */   void body_expand(int paramInt) {
/* 103 */     if (this.body_storage <= this.body_fill + paramInt) {
/* 104 */       this.body_storage += paramInt + 1024;
/* 105 */       byte[] arrayOfByte = new byte[this.body_storage];
/* 106 */       System.arraycopy(this.body_data, 0, arrayOfByte, 0, this.body_data.length);
/* 107 */       this.body_data = arrayOfByte;
/*     */     } 
/*     */   }
/*     */   
/*     */   void lacing_expand(int paramInt) {
/* 112 */     if (this.lacing_storage <= this.lacing_fill + paramInt) {
/* 113 */       this.lacing_storage += paramInt + 32;
/* 114 */       int[] arrayOfInt = new int[this.lacing_storage];
/* 115 */       System.arraycopy(this.lacing_vals, 0, arrayOfInt, 0, this.lacing_vals.length);
/* 116 */       this.lacing_vals = arrayOfInt;
/*     */       
/* 118 */       long[] arrayOfLong = new long[this.lacing_storage];
/* 119 */       System.arraycopy(this.granule_vals, 0, arrayOfLong, 0, this.granule_vals.length);
/* 120 */       this.granule_vals = arrayOfLong;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int packetin(Packet paramPacket) {
/* 126 */     int i = paramPacket.bytes / 255 + 1;
/*     */     
/* 128 */     if (this.body_returned != 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 133 */       this.body_fill -= this.body_returned;
/* 134 */       if (this.body_fill != 0) {
/* 135 */         System.arraycopy(this.body_data, this.body_returned, this.body_data, 0, this.body_fill);
/*     */       }
/* 137 */       this.body_returned = 0;
/*     */     } 
/*     */ 
/*     */     
/* 141 */     body_expand(paramPacket.bytes);
/* 142 */     lacing_expand(i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     System.arraycopy(paramPacket.packet_base, paramPacket.packet, this.body_data, this.body_fill, paramPacket.bytes);
/* 150 */     this.body_fill += paramPacket.bytes;
/*     */     
/*     */     byte b;
/*     */     
/* 154 */     for (b = 0; b < i - 1; b++) {
/* 155 */       this.lacing_vals[this.lacing_fill + b] = 255;
/* 156 */       this.granule_vals[this.lacing_fill + b] = this.granulepos;
/*     */     } 
/* 158 */     this.lacing_vals[this.lacing_fill + b] = paramPacket.bytes % 255;
/* 159 */     this.granulepos = this.granule_vals[this.lacing_fill + b] = paramPacket.granulepos;
/*     */ 
/*     */     
/* 162 */     this.lacing_vals[this.lacing_fill] = this.lacing_vals[this.lacing_fill] | 0x100;
/*     */     
/* 164 */     this.lacing_fill += i;
/*     */ 
/*     */     
/* 167 */     this.packetno++;
/*     */     
/* 169 */     if (paramPacket.e_o_s != 0)
/* 170 */       this.e_o_s = 1; 
/* 171 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int packetout(Packet paramPacket) {
/* 180 */     int i = this.lacing_returned;
/*     */     
/* 182 */     if (this.lacing_packet <= i) {
/* 183 */       return 0;
/*     */     }
/*     */     
/* 186 */     if ((this.lacing_vals[i] & 0x400) != 0) {
/*     */       
/* 188 */       this.lacing_returned++;
/*     */ 
/*     */ 
/*     */       
/* 192 */       this.packetno++;
/* 193 */       return -1;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 198 */     int j = this.lacing_vals[i] & 0xFF;
/* 199 */     int k = 0;
/*     */     
/* 201 */     paramPacket.packet_base = this.body_data;
/* 202 */     paramPacket.packet = this.body_returned;
/* 203 */     paramPacket.e_o_s = this.lacing_vals[i] & 0x200;
/* 204 */     paramPacket.b_o_s = this.lacing_vals[i] & 0x100;
/* 205 */     k += j;
/*     */     
/* 207 */     while (j == 255) {
/* 208 */       int m = this.lacing_vals[++i];
/* 209 */       j = m & 0xFF;
/* 210 */       if ((m & 0x200) != 0)
/* 211 */         paramPacket.e_o_s = 512; 
/* 212 */       k += j;
/*     */     } 
/*     */     
/* 215 */     paramPacket.packetno = this.packetno;
/* 216 */     paramPacket.granulepos = this.granule_vals[i];
/* 217 */     paramPacket.bytes = k;
/*     */     
/* 219 */     this.body_returned += k;
/*     */     
/* 221 */     this.lacing_returned = i + 1;
/*     */     
/* 223 */     this.packetno++;
/* 224 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int pagein(Page paramPage) {
/* 231 */     byte[] arrayOfByte1 = paramPage.header_base;
/* 232 */     int i = paramPage.header;
/* 233 */     byte[] arrayOfByte2 = paramPage.body_base;
/* 234 */     int j = paramPage.body;
/* 235 */     int k = paramPage.body_len;
/* 236 */     byte b = 0;
/*     */     
/* 238 */     int m = paramPage.version();
/* 239 */     int n = paramPage.continued();
/* 240 */     int i1 = paramPage.bos();
/* 241 */     int i2 = paramPage.eos();
/* 242 */     long l = paramPage.granulepos();
/* 243 */     int i3 = paramPage.serialno();
/* 244 */     int i4 = paramPage.pageno();
/* 245 */     int i5 = arrayOfByte1[i + 26] & 0xFF;
/*     */ 
/*     */ 
/*     */     
/* 249 */     int i6 = this.lacing_returned;
/* 250 */     int i7 = this.body_returned;
/*     */ 
/*     */     
/* 253 */     if (i7 != 0) {
/* 254 */       this.body_fill -= i7;
/* 255 */       if (this.body_fill != 0) {
/* 256 */         System.arraycopy(this.body_data, i7, this.body_data, 0, this.body_fill);
/*     */       }
/* 258 */       this.body_returned = 0;
/*     */     } 
/*     */     
/* 261 */     if (i6 != 0) {
/*     */       
/* 263 */       if (this.lacing_fill - i6 != 0) {
/* 264 */         System.arraycopy(this.lacing_vals, i6, this.lacing_vals, 0, this.lacing_fill - i6);
/* 265 */         System.arraycopy(this.granule_vals, i6, this.granule_vals, 0, this.lacing_fill - i6);
/*     */       } 
/* 267 */       this.lacing_fill -= i6;
/* 268 */       this.lacing_packet -= i6;
/* 269 */       this.lacing_returned = 0;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 274 */     if (i3 != this.serialno)
/* 275 */       return -1; 
/* 276 */     if (m > 0) {
/* 277 */       return -1;
/*     */     }
/* 279 */     lacing_expand(i5 + 1);
/*     */ 
/*     */     
/* 282 */     if (i4 != this.pageno) {
/*     */ 
/*     */ 
/*     */       
/* 286 */       for (i6 = this.lacing_packet; i6 < this.lacing_fill; i6++) {
/* 287 */         this.body_fill -= this.lacing_vals[i6] & 0xFF;
/*     */       }
/*     */       
/* 290 */       this.lacing_fill = this.lacing_packet;
/*     */ 
/*     */       
/* 293 */       if (this.pageno != -1) {
/* 294 */         this.lacing_vals[this.lacing_fill++] = 1024;
/* 295 */         this.lacing_packet++;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 300 */       if (n != 0) {
/* 301 */         i1 = 0;
/* 302 */         for (; b < i5; b++) {
/* 303 */           i7 = arrayOfByte1[i + 27 + b] & 0xFF;
/* 304 */           j += i7;
/* 305 */           k -= i7;
/* 306 */           if (i7 < 255) {
/* 307 */             b++;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 314 */     if (k != 0) {
/* 315 */       body_expand(k);
/* 316 */       System.arraycopy(arrayOfByte2, j, this.body_data, this.body_fill, k);
/* 317 */       this.body_fill += k;
/*     */     } 
/*     */ 
/*     */     
/* 321 */     i6 = -1;
/* 322 */     while (b < i5) {
/* 323 */       i7 = arrayOfByte1[i + 27 + b] & 0xFF;
/* 324 */       this.lacing_vals[this.lacing_fill] = i7;
/* 325 */       this.granule_vals[this.lacing_fill] = -1L;
/*     */       
/* 327 */       if (i1 != 0) {
/* 328 */         this.lacing_vals[this.lacing_fill] = this.lacing_vals[this.lacing_fill] | 0x100;
/* 329 */         i1 = 0;
/*     */       } 
/*     */       
/* 332 */       if (i7 < 255) {
/* 333 */         i6 = this.lacing_fill;
/*     */       }
/* 335 */       this.lacing_fill++;
/* 336 */       b++;
/*     */       
/* 338 */       if (i7 < 255) {
/* 339 */         this.lacing_packet = this.lacing_fill;
/*     */       }
/*     */     } 
/*     */     
/* 343 */     if (i6 != -1) {
/* 344 */       this.granule_vals[i6] = l;
/*     */     }
/*     */ 
/*     */     
/* 348 */     if (i2 != 0) {
/* 349 */       this.e_o_s = 1;
/* 350 */       if (this.lacing_fill > 0) {
/* 351 */         this.lacing_vals[this.lacing_fill - 1] = this.lacing_vals[this.lacing_fill - 1] | 0x200;
/*     */       }
/*     */     } 
/* 354 */     this.pageno = i4 + 1;
/* 355 */     return 0;
/*     */   }
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
/*     */   public int flush(Page paramPage) {
/* 375 */     byte b2 = 0;
/* 376 */     byte b3 = (this.lacing_fill > 255) ? 255 : this.lacing_fill;
/* 377 */     int i = 0;
/* 378 */     int j = 0;
/* 379 */     long l = this.granule_vals[0];
/*     */     
/* 381 */     if (!b3) {
/* 382 */       return 0;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 389 */     if (this.b_o_s == 0) {
/* 390 */       l = 0L;
/* 391 */       for (b2 = 0; b2 < b3; b2++) {
/* 392 */         if ((this.lacing_vals[b2] & 0xFF) < 255) {
/* 393 */           b2++;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } else {
/* 399 */       for (b2 = 0; b2 < b3 && 
/* 400 */         j <= 4096; b2++) {
/*     */         
/* 402 */         j += this.lacing_vals[b2] & 0xFF;
/* 403 */         l = this.granule_vals[b2];
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 408 */     System.arraycopy("OggS".getBytes(), 0, this.header, 0, 4);
/*     */ 
/*     */     
/* 411 */     this.header[4] = 0;
/*     */ 
/*     */     
/* 414 */     this.header[5] = 0;
/* 415 */     if ((this.lacing_vals[0] & 0x100) == 0) {
/* 416 */       this.header[5] = (byte)(this.header[5] | 0x1);
/*     */     }
/* 418 */     if (this.b_o_s == 0) {
/* 419 */       this.header[5] = (byte)(this.header[5] | 0x2);
/*     */     }
/* 421 */     if (this.e_o_s != 0 && this.lacing_fill == b2)
/* 422 */       this.header[5] = (byte)(this.header[5] | 0x4); 
/* 423 */     this.b_o_s = 1;
/*     */     
/*     */     byte b1;
/* 426 */     for (b1 = 6; b1 < 14; b1++) {
/* 427 */       this.header[b1] = (byte)(int)l;
/* 428 */       l >>>= 8L;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 433 */     int k = this.serialno;
/* 434 */     for (b1 = 14; b1 < 18; b1++) {
/* 435 */       this.header[b1] = (byte)k;
/* 436 */       k >>>= 8;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 442 */     if (this.pageno == -1) {
/* 443 */       this.pageno = 0;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 449 */     k = this.pageno++;
/* 450 */     for (b1 = 18; b1 < 22; b1++) {
/* 451 */       this.header[b1] = (byte)k;
/* 452 */       k >>>= 8;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 457 */     this.header[22] = 0;
/* 458 */     this.header[23] = 0;
/* 459 */     this.header[24] = 0;
/* 460 */     this.header[25] = 0;
/*     */ 
/*     */     
/* 463 */     this.header[26] = (byte)b2;
/* 464 */     for (b1 = 0; b1 < b2; b1++) {
/* 465 */       this.header[b1 + 27] = (byte)this.lacing_vals[b1];
/* 466 */       i += this.header[b1 + 27] & 0xFF;
/*     */     } 
/*     */ 
/*     */     
/* 470 */     paramPage.header_base = this.header;
/* 471 */     paramPage.header = 0;
/* 472 */     paramPage.header_len = this.header_fill = b2 + 27;
/* 473 */     paramPage.body_base = this.body_data;
/* 474 */     paramPage.body = this.body_returned;
/* 475 */     paramPage.body_len = i;
/*     */ 
/*     */ 
/*     */     
/* 479 */     this.lacing_fill -= b2;
/* 480 */     System.arraycopy(this.lacing_vals, b2, this.lacing_vals, 0, this.lacing_fill * 4);
/* 481 */     System.arraycopy(this.granule_vals, b2, this.granule_vals, 0, this.lacing_fill * 8);
/* 482 */     this.body_returned += i;
/*     */ 
/*     */ 
/*     */     
/* 486 */     paramPage.checksum();
/*     */ 
/*     */     
/* 489 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int pageout(Page paramPage) {
/* 496 */     if ((this.e_o_s != 0 && this.lacing_fill != 0) || this.body_fill - this.body_returned > 4096 || this.lacing_fill >= 255 || (this.lacing_fill != 0 && this.b_o_s == 0))
/*     */     {
/*     */ 
/*     */       
/* 500 */       return flush(paramPage);
/*     */     }
/* 502 */     return 0;
/*     */   }
/*     */   
/*     */   public int eof() {
/* 506 */     return this.e_o_s;
/*     */   }
/*     */   
/*     */   public int reset() {
/* 510 */     this.body_fill = 0;
/* 511 */     this.body_returned = 0;
/*     */     
/* 513 */     this.lacing_fill = 0;
/* 514 */     this.lacing_packet = 0;
/* 515 */     this.lacing_returned = 0;
/*     */     
/* 517 */     this.header_fill = 0;
/*     */     
/* 519 */     this.e_o_s = 0;
/* 520 */     this.b_o_s = 0;
/* 521 */     this.pageno = -1;
/* 522 */     this.packetno = 0L;
/* 523 */     this.granulepos = 0L;
/* 524 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jogg\StreamState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */