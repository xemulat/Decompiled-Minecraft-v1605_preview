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
/*     */ 
/*     */ public class Comment
/*     */ {
/*  34 */   private static byte[] _vorbis = "vorbis".getBytes();
/*  35 */   private static byte[] _vendor = "Xiphophorus libVorbis I 20000508".getBytes();
/*     */   
/*     */   private static final int OV_EIMPL = -130;
/*     */   
/*     */   public byte[][] user_comments;
/*     */   
/*     */   public int[] comment_lengths;
/*     */   public int comments;
/*     */   public byte[] vendor;
/*     */   
/*     */   public void init() {
/*  46 */     this.user_comments = (byte[][])null;
/*  47 */     this.comments = 0;
/*  48 */     this.vendor = null;
/*     */   }
/*     */   
/*     */   public void add(String paramString) {
/*  52 */     add(paramString.getBytes());
/*     */   }
/*     */   
/*     */   private void add(byte[] paramArrayOfbyte) {
/*  56 */     byte[][] arrayOfByte = new byte[this.comments + 2][];
/*  57 */     if (this.user_comments != null) {
/*  58 */       System.arraycopy(this.user_comments, 0, arrayOfByte, 0, this.comments);
/*     */     }
/*  60 */     this.user_comments = arrayOfByte;
/*     */     
/*  62 */     int[] arrayOfInt = new int[this.comments + 2];
/*  63 */     if (this.comment_lengths != null) {
/*  64 */       System.arraycopy(this.comment_lengths, 0, arrayOfInt, 0, this.comments);
/*     */     }
/*  66 */     this.comment_lengths = arrayOfInt;
/*     */     
/*  68 */     byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + 1];
/*  69 */     System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 0, paramArrayOfbyte.length);
/*  70 */     this.user_comments[this.comments] = arrayOfByte1;
/*  71 */     this.comment_lengths[this.comments] = paramArrayOfbyte.length;
/*  72 */     this.comments++;
/*  73 */     this.user_comments[this.comments] = null;
/*     */   }
/*     */   
/*     */   public void add_tag(String paramString1, String paramString2) {
/*  77 */     if (paramString2 == null)
/*  78 */       paramString2 = ""; 
/*  79 */     add(paramString1 + "=" + paramString2);
/*     */   }
/*     */   
/*     */   static boolean tagcompare(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
/*  83 */     byte b = 0;
/*     */     
/*  85 */     while (b < paramInt) {
/*  86 */       byte b1 = paramArrayOfbyte1[b];
/*  87 */       byte b2 = paramArrayOfbyte2[b];
/*  88 */       if (90 >= b1 && b1 >= 65)
/*  89 */         b1 = (byte)(b1 - 65 + 97); 
/*  90 */       if (90 >= b2 && b2 >= 65)
/*  91 */         b2 = (byte)(b2 - 65 + 97); 
/*  92 */       if (b1 != b2) {
/*  93 */         return false;
/*     */       }
/*  95 */       b++;
/*     */     } 
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public String query(String paramString) {
/* 101 */     return query(paramString, 0);
/*     */   }
/*     */   
/*     */   public String query(String paramString, int paramInt) {
/* 105 */     int i = query(paramString.getBytes(), paramInt);
/* 106 */     if (i == -1)
/* 107 */       return null; 
/* 108 */     byte[] arrayOfByte = this.user_comments[i];
/* 109 */     for (byte b = 0; b < this.comment_lengths[i]; b++) {
/* 110 */       if (arrayOfByte[b] == 61) {
/* 111 */         return new String(arrayOfByte, b + 1, this.comment_lengths[i] - b + 1);
/*     */       }
/*     */     } 
/* 114 */     return null;
/*     */   }
/*     */   
/*     */   private int query(byte[] paramArrayOfbyte, int paramInt) {
/* 118 */     byte b1 = 0;
/* 119 */     byte b2 = 0;
/* 120 */     int i = paramArrayOfbyte.length + 1;
/* 121 */     byte[] arrayOfByte = new byte[i];
/* 122 */     System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
/* 123 */     arrayOfByte[paramArrayOfbyte.length] = 61;
/*     */     
/* 125 */     for (b1 = 0; b1 < this.comments; b1++) {
/* 126 */       if (tagcompare(this.user_comments[b1], arrayOfByte, i)) {
/* 127 */         if (paramInt == b2)
/*     */         {
/*     */           
/* 130 */           return b1;
/*     */         }
/*     */         
/* 133 */         b2++;
/*     */       } 
/*     */     } 
/*     */     
/* 137 */     return -1;
/*     */   }
/*     */   
/*     */   int unpack(Buffer paramBuffer) {
/* 141 */     int i = paramBuffer.read(32);
/* 142 */     if (i < 0) {
/* 143 */       clear();
/* 144 */       return -1;
/*     */     } 
/* 146 */     this.vendor = new byte[i + 1];
/* 147 */     paramBuffer.read(this.vendor, i);
/* 148 */     this.comments = paramBuffer.read(32);
/* 149 */     if (this.comments < 0) {
/* 150 */       clear();
/* 151 */       return -1;
/*     */     } 
/* 153 */     this.user_comments = new byte[this.comments + 1][];
/* 154 */     this.comment_lengths = new int[this.comments + 1];
/*     */     
/* 156 */     for (byte b = 0; b < this.comments; b++) {
/* 157 */       int j = paramBuffer.read(32);
/* 158 */       if (j < 0) {
/* 159 */         clear();
/* 160 */         return -1;
/*     */       } 
/* 162 */       this.comment_lengths[b] = j;
/* 163 */       this.user_comments[b] = new byte[j + 1];
/* 164 */       paramBuffer.read(this.user_comments[b], j);
/*     */     } 
/* 166 */     if (paramBuffer.read(1) != 1) {
/* 167 */       clear();
/* 168 */       return -1;
/*     */     } 
/*     */     
/* 171 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   int pack(Buffer paramBuffer) {
/* 176 */     paramBuffer.write(3, 8);
/* 177 */     paramBuffer.write(_vorbis);
/*     */ 
/*     */     
/* 180 */     paramBuffer.write(_vendor.length, 32);
/* 181 */     paramBuffer.write(_vendor);
/*     */ 
/*     */     
/* 184 */     paramBuffer.write(this.comments, 32);
/* 185 */     if (this.comments != 0) {
/* 186 */       for (byte b = 0; b < this.comments; b++) {
/* 187 */         if (this.user_comments[b] != null) {
/* 188 */           paramBuffer.write(this.comment_lengths[b], 32);
/* 189 */           paramBuffer.write(this.user_comments[b]);
/*     */         } else {
/*     */           
/* 192 */           paramBuffer.write(0, 32);
/*     */         } 
/*     */       } 
/*     */     }
/* 196 */     paramBuffer.write(1, 1);
/* 197 */     return 0;
/*     */   }
/*     */   
/*     */   public int header_out(Packet paramPacket) {
/* 201 */     Buffer buffer = new Buffer();
/* 202 */     buffer.writeinit();
/*     */     
/* 204 */     if (pack(buffer) != 0) {
/* 205 */       return -130;
/*     */     }
/* 207 */     paramPacket.packet_base = new byte[buffer.bytes()];
/* 208 */     paramPacket.packet = 0;
/* 209 */     paramPacket.bytes = buffer.bytes();
/* 210 */     System.arraycopy(buffer.buffer(), 0, paramPacket.packet_base, 0, paramPacket.bytes);
/* 211 */     paramPacket.b_o_s = 0;
/* 212 */     paramPacket.e_o_s = 0;
/* 213 */     paramPacket.granulepos = 0L;
/* 214 */     return 0;
/*     */   }
/*     */   
/*     */   void clear() {
/* 218 */     for (byte b = 0; b < this.comments; b++)
/* 219 */       this.user_comments[b] = null; 
/* 220 */     this.user_comments = (byte[][])null;
/* 221 */     this.vendor = null;
/*     */   }
/*     */   
/*     */   public String getVendor() {
/* 225 */     return new String(this.vendor, 0, this.vendor.length - 1);
/*     */   }
/*     */   
/*     */   public String getComment(int paramInt) {
/* 229 */     if (this.comments <= paramInt)
/* 230 */       return null; 
/* 231 */     return new String(this.user_comments[paramInt], 0, (this.user_comments[paramInt]).length - 1);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 235 */     String str = "Vendor: " + new String(this.vendor, 0, this.vendor.length - 1);
/* 236 */     for (byte b = 0; b < this.comments; b++) {
/* 237 */       str = str + "\nComment: " + new String(this.user_comments[b], 0, (this.user_comments[b]).length - 1);
/*     */     }
/*     */     
/* 240 */     str = str + "\n";
/* 241 */     return str;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Comment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */