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
/*     */ public class Page
/*     */ {
/*  30 */   private static int[] crc_lookup = new int[256]; public byte[] header_base; public int header; public int header_len;
/*     */   static {
/*  32 */     for (byte b = 0; b < crc_lookup.length; b++)
/*  33 */       crc_lookup[b] = crc_entry(b); 
/*     */   }
/*     */   public byte[] body_base; public int body; public int body_len;
/*     */   
/*     */   private static int crc_entry(int paramInt) {
/*  38 */     int i = paramInt << 24;
/*  39 */     for (byte b = 0; b < 8; b++) {
/*  40 */       if ((i & Integer.MIN_VALUE) != 0) {
/*  41 */         i = i << 1 ^ 0x4C11DB7;
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  47 */         i <<= 1;
/*     */       } 
/*     */     } 
/*  50 */     return i & 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int version() {
/*  61 */     return this.header_base[this.header + 4] & 0xFF;
/*     */   }
/*     */   
/*     */   int continued() {
/*  65 */     return this.header_base[this.header + 5] & 0x1;
/*     */   }
/*     */   
/*     */   public int bos() {
/*  69 */     return this.header_base[this.header + 5] & 0x2;
/*     */   }
/*     */   
/*     */   public int eos() {
/*  73 */     return this.header_base[this.header + 5] & 0x4;
/*     */   }
/*     */   
/*     */   public long granulepos() {
/*  77 */     long l = (this.header_base[this.header + 13] & 0xFF);
/*  78 */     l = l << 8L | (this.header_base[this.header + 12] & 0xFF);
/*  79 */     l = l << 8L | (this.header_base[this.header + 11] & 0xFF);
/*  80 */     l = l << 8L | (this.header_base[this.header + 10] & 0xFF);
/*  81 */     l = l << 8L | (this.header_base[this.header + 9] & 0xFF);
/*  82 */     l = l << 8L | (this.header_base[this.header + 8] & 0xFF);
/*  83 */     l = l << 8L | (this.header_base[this.header + 7] & 0xFF);
/*  84 */     l = l << 8L | (this.header_base[this.header + 6] & 0xFF);
/*  85 */     return l;
/*     */   }
/*     */   
/*     */   public int serialno() {
/*  89 */     return this.header_base[this.header + 14] & 0xFF | (this.header_base[this.header + 15] & 0xFF) << 8 | (this.header_base[this.header + 16] & 0xFF) << 16 | (this.header_base[this.header + 17] & 0xFF) << 24;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   int pageno() {
/*  95 */     return this.header_base[this.header + 18] & 0xFF | (this.header_base[this.header + 19] & 0xFF) << 8 | (this.header_base[this.header + 20] & 0xFF) << 16 | (this.header_base[this.header + 21] & 0xFF) << 24;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   void checksum() {
/* 101 */     int i = 0;
/*     */     byte b;
/* 103 */     for (b = 0; b < this.header_len; b++) {
/* 104 */       i = i << 8 ^ crc_lookup[i >>> 24 & 0xFF ^ this.header_base[this.header + b] & 0xFF];
/*     */     }
/*     */     
/* 107 */     for (b = 0; b < this.body_len; b++) {
/* 108 */       i = i << 8 ^ crc_lookup[i >>> 24 & 0xFF ^ this.body_base[this.body + b] & 0xFF];
/*     */     }
/*     */     
/* 111 */     this.header_base[this.header + 22] = (byte)i;
/* 112 */     this.header_base[this.header + 23] = (byte)(i >>> 8);
/* 113 */     this.header_base[this.header + 24] = (byte)(i >>> 16);
/* 114 */     this.header_base[this.header + 25] = (byte)(i >>> 24);
/*     */   }
/*     */   
/*     */   public Page copy() {
/* 118 */     return copy(new Page());
/*     */   }
/*     */   
/*     */   public Page copy(Page paramPage) {
/* 122 */     byte[] arrayOfByte = new byte[this.header_len];
/* 123 */     System.arraycopy(this.header_base, this.header, arrayOfByte, 0, this.header_len);
/* 124 */     paramPage.header_len = this.header_len;
/* 125 */     paramPage.header_base = arrayOfByte;
/* 126 */     paramPage.header = 0;
/* 127 */     arrayOfByte = new byte[this.body_len];
/* 128 */     System.arraycopy(this.body_base, this.body, arrayOfByte, 0, this.body_len);
/* 129 */     paramPage.body_len = this.body_len;
/* 130 */     paramPage.body_base = arrayOfByte;
/* 131 */     paramPage.body = 0;
/* 132 */     return paramPage;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jogg\Page.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */