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
/*     */ public class Buffer
/*     */ {
/*     */   private static final int BUFFER_INCREMENT = 256;
/*  32 */   private static final int[] mask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   int ptr = 0;
/*  40 */   byte[] buffer = null;
/*  41 */   int endbit = 0;
/*  42 */   int endbyte = 0;
/*  43 */   int storage = 0;
/*     */   
/*     */   public void writeinit() {
/*  46 */     this.buffer = new byte[256];
/*  47 */     this.ptr = 0;
/*  48 */     this.buffer[0] = 0;
/*  49 */     this.storage = 256;
/*     */   }
/*     */   
/*     */   public void write(byte[] paramArrayOfbyte) {
/*  53 */     for (byte b = 0; b < paramArrayOfbyte.length && 
/*  54 */       paramArrayOfbyte[b] != 0; b++)
/*     */     {
/*  56 */       write(paramArrayOfbyte[b], 8);
/*     */     }
/*     */   }
/*     */   
/*     */   public void read(byte[] paramArrayOfbyte, int paramInt) {
/*  61 */     byte b = 0;
/*  62 */     while (paramInt-- != 0) {
/*  63 */       paramArrayOfbyte[b++] = (byte)read(8);
/*     */     }
/*     */   }
/*     */   
/*     */   void reset() {
/*  68 */     this.ptr = 0;
/*  69 */     this.buffer[0] = 0;
/*  70 */     this.endbit = this.endbyte = 0;
/*     */   }
/*     */   
/*     */   public void writeclear() {
/*  74 */     this.buffer = null;
/*     */   }
/*     */   
/*     */   public void readinit(byte[] paramArrayOfbyte, int paramInt) {
/*  78 */     readinit(paramArrayOfbyte, 0, paramInt);
/*     */   }
/*     */   
/*     */   public void readinit(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*  82 */     this.ptr = paramInt1;
/*  83 */     this.buffer = paramArrayOfbyte;
/*  84 */     this.endbit = this.endbyte = 0;
/*  85 */     this.storage = paramInt2;
/*     */   }
/*     */   
/*     */   public void write(int paramInt1, int paramInt2) {
/*  89 */     if (this.endbyte + 4 >= this.storage) {
/*  90 */       byte[] arrayOfByte = new byte[this.storage + 256];
/*  91 */       System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.storage);
/*  92 */       this.buffer = arrayOfByte;
/*  93 */       this.storage += 256;
/*     */     } 
/*     */     
/*  96 */     paramInt1 &= mask[paramInt2];
/*  97 */     paramInt2 += this.endbit;
/*  98 */     this.buffer[this.ptr] = (byte)(this.buffer[this.ptr] | (byte)(paramInt1 << this.endbit));
/*     */     
/* 100 */     if (paramInt2 >= 8) {
/* 101 */       this.buffer[this.ptr + 1] = (byte)(paramInt1 >>> 8 - this.endbit);
/* 102 */       if (paramInt2 >= 16) {
/* 103 */         this.buffer[this.ptr + 2] = (byte)(paramInt1 >>> 16 - this.endbit);
/* 104 */         if (paramInt2 >= 24) {
/* 105 */           this.buffer[this.ptr + 3] = (byte)(paramInt1 >>> 24 - this.endbit);
/* 106 */           if (paramInt2 >= 32) {
/* 107 */             if (this.endbit > 0) {
/* 108 */               this.buffer[this.ptr + 4] = (byte)(paramInt1 >>> 32 - this.endbit);
/*     */             } else {
/* 110 */               this.buffer[this.ptr + 4] = 0;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 116 */     this.endbyte += paramInt2 / 8;
/* 117 */     this.ptr += paramInt2 / 8;
/* 118 */     this.endbit = paramInt2 & 0x7;
/*     */   }
/*     */ 
/*     */   
/*     */   public int look(int paramInt) {
/* 123 */     int j = mask[paramInt];
/*     */     
/* 125 */     paramInt += this.endbit;
/*     */     
/* 127 */     if (this.endbyte + 4 >= this.storage && 
/* 128 */       this.endbyte + (paramInt - 1) / 8 >= this.storage) {
/* 129 */       return -1;
/*     */     }
/*     */     
/* 132 */     int i = (this.buffer[this.ptr] & 0xFF) >>> this.endbit;
/* 133 */     if (paramInt > 8) {
/* 134 */       i |= (this.buffer[this.ptr + 1] & 0xFF) << 8 - this.endbit;
/* 135 */       if (paramInt > 16) {
/* 136 */         i |= (this.buffer[this.ptr + 2] & 0xFF) << 16 - this.endbit;
/* 137 */         if (paramInt > 24) {
/* 138 */           i |= (this.buffer[this.ptr + 3] & 0xFF) << 24 - this.endbit;
/* 139 */           if (paramInt > 32 && this.endbit != 0) {
/* 140 */             i |= (this.buffer[this.ptr + 4] & 0xFF) << 32 - this.endbit;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 145 */     return j & i;
/*     */   }
/*     */   
/*     */   public int look1() {
/* 149 */     if (this.endbyte >= this.storage)
/* 150 */       return -1; 
/* 151 */     return this.buffer[this.ptr] >> this.endbit & 0x1;
/*     */   }
/*     */   
/*     */   public void adv(int paramInt) {
/* 155 */     paramInt += this.endbit;
/* 156 */     this.ptr += paramInt / 8;
/* 157 */     this.endbyte += paramInt / 8;
/* 158 */     this.endbit = paramInt & 0x7;
/*     */   }
/*     */   
/*     */   public void adv1() {
/* 162 */     this.endbit++;
/* 163 */     if (this.endbit > 7) {
/* 164 */       this.endbit = 0;
/* 165 */       this.ptr++;
/* 166 */       this.endbyte++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int read(int paramInt) {
/* 172 */     int j = mask[paramInt];
/*     */     
/* 174 */     paramInt += this.endbit;
/*     */     
/* 176 */     if (this.endbyte + 4 >= this.storage) {
/* 177 */       byte b = -1;
/* 178 */       if (this.endbyte + (paramInt - 1) / 8 >= this.storage) {
/* 179 */         this.ptr += paramInt / 8;
/* 180 */         this.endbyte += paramInt / 8;
/* 181 */         this.endbit = paramInt & 0x7;
/* 182 */         return b;
/*     */       } 
/*     */     } 
/*     */     
/* 186 */     int i = (this.buffer[this.ptr] & 0xFF) >>> this.endbit;
/* 187 */     if (paramInt > 8) {
/* 188 */       i |= (this.buffer[this.ptr + 1] & 0xFF) << 8 - this.endbit;
/* 189 */       if (paramInt > 16) {
/* 190 */         i |= (this.buffer[this.ptr + 2] & 0xFF) << 16 - this.endbit;
/* 191 */         if (paramInt > 24) {
/* 192 */           i |= (this.buffer[this.ptr + 3] & 0xFF) << 24 - this.endbit;
/* 193 */           if (paramInt > 32 && this.endbit != 0) {
/* 194 */             i |= (this.buffer[this.ptr + 4] & 0xFF) << 32 - this.endbit;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 200 */     i &= j;
/*     */     
/* 202 */     this.ptr += paramInt / 8;
/* 203 */     this.endbyte += paramInt / 8;
/* 204 */     this.endbit = paramInt & 0x7;
/* 205 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int readB(int paramInt) {
/* 210 */     int j = 32 - paramInt;
/*     */     
/* 212 */     paramInt += this.endbit;
/*     */     
/* 214 */     if (this.endbyte + 4 >= this.storage) {
/*     */       
/* 216 */       byte b = -1;
/* 217 */       if (this.endbyte * 8 + paramInt > this.storage * 8) {
/* 218 */         this.ptr += paramInt / 8;
/* 219 */         this.endbyte += paramInt / 8;
/* 220 */         this.endbit = paramInt & 0x7;
/* 221 */         return b;
/*     */       } 
/*     */     } 
/*     */     
/* 225 */     int i = (this.buffer[this.ptr] & 0xFF) << 24 + this.endbit;
/* 226 */     if (paramInt > 8) {
/* 227 */       i |= (this.buffer[this.ptr + 1] & 0xFF) << 16 + this.endbit;
/* 228 */       if (paramInt > 16) {
/* 229 */         i |= (this.buffer[this.ptr + 2] & 0xFF) << 8 + this.endbit;
/* 230 */         if (paramInt > 24) {
/* 231 */           i |= (this.buffer[this.ptr + 3] & 0xFF) << this.endbit;
/* 232 */           if (paramInt > 32 && this.endbit != 0)
/* 233 */             i |= (this.buffer[this.ptr + 4] & 0xFF) >> 8 - this.endbit; 
/*     */         } 
/*     */       } 
/*     */     } 
/* 237 */     i = i >>> j >> 1 >>> j + 1 >> 1;
/*     */     
/* 239 */     this.ptr += paramInt / 8;
/* 240 */     this.endbyte += paramInt / 8;
/* 241 */     this.endbit = paramInt & 0x7;
/* 242 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int read1() {
/* 247 */     if (this.endbyte >= this.storage) {
/* 248 */       byte b = -1;
/* 249 */       this.endbit++;
/* 250 */       if (this.endbit > 7) {
/* 251 */         this.endbit = 0;
/* 252 */         this.ptr++;
/* 253 */         this.endbyte++;
/*     */       } 
/* 255 */       return b;
/*     */     } 
/*     */     
/* 258 */     int i = this.buffer[this.ptr] >> this.endbit & 0x1;
/*     */     
/* 260 */     this.endbit++;
/* 261 */     if (this.endbit > 7) {
/* 262 */       this.endbit = 0;
/* 263 */       this.ptr++;
/* 264 */       this.endbyte++;
/*     */     } 
/* 266 */     return i;
/*     */   }
/*     */   
/*     */   public int bytes() {
/* 270 */     return this.endbyte + (this.endbit + 7) / 8;
/*     */   }
/*     */   
/*     */   public int bits() {
/* 274 */     return this.endbyte * 8 + this.endbit;
/*     */   }
/*     */   
/*     */   public byte[] buffer() {
/* 278 */     return this.buffer;
/*     */   }
/*     */   
/*     */   public static int ilog(int paramInt) {
/* 282 */     byte b = 0;
/* 283 */     while (paramInt > 0) {
/* 284 */       b++;
/* 285 */       paramInt >>>= 1;
/*     */     } 
/* 287 */     return b;
/*     */   }
/*     */   
/*     */   public static void report(String paramString) {
/* 291 */     System.err.println(paramString);
/* 292 */     System.exit(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jogg\Buffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */