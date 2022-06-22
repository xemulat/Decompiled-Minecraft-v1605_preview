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
/*     */ public class SyncState
/*     */ {
/*     */   public byte[] data;
/*     */   int storage;
/*     */   int fill;
/*     */   int returned;
/*     */   int unsynced;
/*     */   int headerbytes;
/*     */   int bodybytes;
/*     */   
/*     */   public int clear() {
/*  57 */     this.data = null;
/*  58 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int buffer(int paramInt) {
/*  63 */     if (this.returned != 0) {
/*  64 */       this.fill -= this.returned;
/*  65 */       if (this.fill > 0) {
/*  66 */         System.arraycopy(this.data, this.returned, this.data, 0, this.fill);
/*     */       }
/*  68 */       this.returned = 0;
/*     */     } 
/*     */     
/*  71 */     if (paramInt > this.storage - this.fill) {
/*     */       
/*  73 */       int i = paramInt + this.fill + 4096;
/*  74 */       if (this.data != null) {
/*  75 */         byte[] arrayOfByte = new byte[i];
/*  76 */         System.arraycopy(this.data, 0, arrayOfByte, 0, this.data.length);
/*  77 */         this.data = arrayOfByte;
/*     */       } else {
/*     */         
/*  80 */         this.data = new byte[i];
/*     */       } 
/*  82 */       this.storage = i;
/*     */     } 
/*     */     
/*  85 */     return this.fill;
/*     */   }
/*     */   
/*     */   public int wrote(int paramInt) {
/*  89 */     if (this.fill + paramInt > this.storage)
/*  90 */       return -1; 
/*  91 */     this.fill += paramInt;
/*  92 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 102 */   private Page pageseek = new Page();
/* 103 */   private byte[] chksum = new byte[4];
/*     */   
/*     */   public int pageseek(Page paramPage) {
/* 106 */     int i = this.returned;
/*     */     
/* 108 */     int j = this.fill - this.returned;
/*     */     
/* 110 */     if (this.headerbytes == 0) {
/*     */       
/* 112 */       if (j < 27) {
/* 113 */         return 0;
/*     */       }
/*     */       
/* 116 */       if (this.data[i] != 79 || this.data[i + 1] != 103 || this.data[i + 2] != 103 || this.data[i + 3] != 83) {
/*     */         
/* 118 */         this.headerbytes = 0;
/* 119 */         this.bodybytes = 0;
/*     */ 
/*     */         
/* 122 */         int m = 0;
/* 123 */         for (byte b1 = 0; b1 < j - 1; b1++) {
/* 124 */           if (this.data[i + 1 + b1] == 79) {
/* 125 */             m = i + 1 + b1;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/* 130 */         if (m == 0) {
/* 131 */           m = this.fill;
/*     */         }
/* 133 */         this.returned = m;
/* 134 */         return -(m - i);
/*     */       } 
/* 136 */       int k = (this.data[i + 26] & 0xFF) + 27;
/* 137 */       if (j < k) {
/* 138 */         return 0;
/*     */       }
/*     */ 
/*     */       
/* 142 */       for (byte b = 0; b < (this.data[i + 26] & 0xFF); b++) {
/* 143 */         this.bodybytes += this.data[i + 27 + b] & 0xFF;
/*     */       }
/* 145 */       this.headerbytes = k;
/*     */     } 
/*     */     
/* 148 */     if (this.bodybytes + this.headerbytes > j) {
/* 149 */       return 0;
/*     */     }
/*     */     
/* 152 */     synchronized (this.chksum) {
/*     */ 
/*     */       
/* 155 */       System.arraycopy(this.data, i + 22, this.chksum, 0, 4);
/* 156 */       this.data[i + 22] = 0;
/* 157 */       this.data[i + 23] = 0;
/* 158 */       this.data[i + 24] = 0;
/* 159 */       this.data[i + 25] = 0;
/*     */ 
/*     */       
/* 162 */       Page page = this.pageseek;
/* 163 */       page.header_base = this.data;
/* 164 */       page.header = i;
/* 165 */       page.header_len = this.headerbytes;
/*     */       
/* 167 */       page.body_base = this.data;
/* 168 */       page.body = i + this.headerbytes;
/* 169 */       page.body_len = this.bodybytes;
/* 170 */       page.checksum();
/*     */ 
/*     */       
/* 173 */       if (this.chksum[0] != this.data[i + 22] || this.chksum[1] != this.data[i + 23] || this.chksum[2] != this.data[i + 24] || this.chksum[3] != this.data[i + 25]) {
/*     */ 
/*     */ 
/*     */         
/* 177 */         System.arraycopy(this.chksum, 0, this.data, i + 22, 4);
/*     */ 
/*     */         
/* 180 */         this.headerbytes = 0;
/* 181 */         this.bodybytes = 0;
/*     */         
/* 183 */         int k = 0;
/* 184 */         for (byte b = 0; b < j - 1; b++) {
/* 185 */           if (this.data[i + 1 + b] == 79) {
/* 186 */             k = i + 1 + b;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/* 191 */         if (k == 0)
/* 192 */           k = this.fill; 
/* 193 */         this.returned = k;
/* 194 */         return -(k - i);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 200 */     i = this.returned;
/*     */     
/* 202 */     if (paramPage != null) {
/* 203 */       paramPage.header_base = this.data;
/* 204 */       paramPage.header = i;
/* 205 */       paramPage.header_len = this.headerbytes;
/* 206 */       paramPage.body_base = this.data;
/* 207 */       paramPage.body = i + this.headerbytes;
/* 208 */       paramPage.body_len = this.bodybytes;
/*     */     } 
/*     */     
/* 211 */     this.unsynced = 0;
/* 212 */     this.returned += j = this.headerbytes + this.bodybytes;
/* 213 */     this.headerbytes = 0;
/* 214 */     this.bodybytes = 0;
/* 215 */     return j;
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
/*     */   public int pageout(Page paramPage) {
/*     */     while (true) {
/* 236 */       int i = pageseek(paramPage);
/* 237 */       if (i > 0)
/*     */       {
/* 239 */         return 1;
/*     */       }
/* 241 */       if (i == 0)
/*     */       {
/* 243 */         return 0;
/*     */       }
/*     */ 
/*     */       
/* 247 */       if (this.unsynced == 0) {
/* 248 */         this.unsynced = 1;
/* 249 */         return -1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int reset() {
/* 257 */     this.fill = 0;
/* 258 */     this.returned = 0;
/* 259 */     this.unsynced = 0;
/* 260 */     this.headerbytes = 0;
/* 261 */     this.bodybytes = 0;
/* 262 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void init() {}
/*     */   
/*     */   public int getDataOffset() {
/* 269 */     return this.returned;
/*     */   }
/*     */   
/*     */   public int getBufferOffset() {
/* 273 */     return this.fill;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jogg\SyncState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */