/*     */ import java.awt.Graphics;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class er
/*     */ {
/*     */   public static boolean a = false;
/*  19 */   private HashMap b = new HashMap<Object, Object>();
/*  20 */   private HashMap c = new HashMap<Object, Object>();
/*  21 */   private IntBuffer d = da.c(1);
/*  22 */   private ByteBuffer e = da.b(1048576);
/*     */   
/*  24 */   private List f = new ArrayList();
/*  25 */   private Map g = new HashMap<Object, Object>();
/*     */   
/*     */   private fi h;
/*     */   
/*     */   private boolean i = false;
/*     */   
/*     */   public er(fi paramfi) {
/*  32 */     this.h = paramfi;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(String paramString) {
/*  37 */     Integer integer = (Integer)this.b.get(paramString);
/*  38 */     if (integer != null) return integer.intValue();
/*     */ 
/*     */     
/*     */     try {
/*  42 */       this.d.clear();
/*  43 */       da.a(this.d);
/*  44 */       int i = this.d.get(0);
/*     */       
/*  46 */       if (paramString.startsWith("##")) {
/*  47 */         a(b(ImageIO.read(er.class.getResourceAsStream(paramString.substring(2)))), i);
/*  48 */       } else if (paramString.startsWith("%%")) {
/*  49 */         this.i = true;
/*  50 */         a(ImageIO.read(er.class.getResourceAsStream(paramString.substring(2))), i);
/*  51 */         this.i = false;
/*     */       } else {
/*  53 */         a(ImageIO.read(er.class.getResourceAsStream(paramString)), i);
/*     */       } 
/*     */       
/*  56 */       this.b.put(paramString, Integer.valueOf(i));
/*  57 */       return i;
/*  58 */     } catch (IOException iOException) {
/*  59 */       throw new RuntimeException("!!");
/*     */     } 
/*     */   }
/*     */   
/*     */   private BufferedImage b(BufferedImage paramBufferedImage) {
/*  64 */     int i = paramBufferedImage.getWidth() / 16;
/*     */     
/*  66 */     BufferedImage bufferedImage = new BufferedImage(16, paramBufferedImage.getHeight() * i, 2);
/*  67 */     Graphics graphics = bufferedImage.getGraphics();
/*  68 */     for (byte b = 0; b < i; b++) {
/*  69 */       graphics.drawImage(paramBufferedImage, -b * 16, b * paramBufferedImage.getHeight(), null);
/*     */     }
/*  71 */     graphics.dispose();
/*  72 */     return bufferedImage;
/*     */   }
/*     */   
/*     */   public int a(BufferedImage paramBufferedImage) {
/*  76 */     this.d.clear();
/*  77 */     da.a(this.d);
/*  78 */     int i = this.d.get(0);
/*  79 */     a(paramBufferedImage, i);
/*  80 */     this.c.put(Integer.valueOf(i), paramBufferedImage);
/*  81 */     return i;
/*     */   }
/*     */   
/*     */   public void a(BufferedImage paramBufferedImage, int paramInt) {
/*  85 */     GL11.glBindTexture(3553, paramInt);
/*     */     
/*  87 */     if (a) {
/*  88 */       GL11.glTexParameteri(3553, 10241, 9987);
/*  89 */       GL11.glTexParameteri(3553, 10240, 9729);
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/*  95 */       GL11.glTexParameteri(3553, 10241, 9728);
/*  96 */       GL11.glTexParameteri(3553, 10240, 9728);
/*     */     } 
/*     */     
/*  99 */     if (this.i) {
/* 100 */       GL11.glTexParameteri(3553, 10242, 10496);
/* 101 */       GL11.glTexParameteri(3553, 10243, 10496);
/*     */     } else {
/* 103 */       GL11.glTexParameteri(3553, 10242, 10497);
/* 104 */       GL11.glTexParameteri(3553, 10243, 10497);
/*     */     } 
/*     */     
/* 107 */     int i = paramBufferedImage.getWidth();
/* 108 */     int j = paramBufferedImage.getHeight();
/*     */     
/* 110 */     int[] arrayOfInt = new int[i * j];
/* 111 */     byte[] arrayOfByte = new byte[i * j * 4];
/* 112 */     paramBufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i); byte b;
/* 113 */     for (b = 0; b < arrayOfInt.length; b++) {
/* 114 */       int k = arrayOfInt[b] >> 24 & 0xFF;
/* 115 */       int m = arrayOfInt[b] >> 16 & 0xFF;
/* 116 */       int n = arrayOfInt[b] >> 8 & 0xFF;
/* 117 */       int i1 = arrayOfInt[b] & 0xFF;
/*     */       
/* 119 */       if (this.h != null && this.h.g) {
/* 120 */         int i2 = (m * 30 + n * 59 + i1 * 11) / 100;
/* 121 */         int i3 = (m * 30 + n * 70) / 100;
/* 122 */         int i4 = (m * 30 + i1 * 70) / 100;
/*     */         
/* 124 */         m = i2;
/* 125 */         n = i3;
/* 126 */         i1 = i4;
/*     */       } 
/*     */       
/* 129 */       arrayOfByte[b * 4 + 0] = (byte)m;
/* 130 */       arrayOfByte[b * 4 + 1] = (byte)n;
/* 131 */       arrayOfByte[b * 4 + 2] = (byte)i1;
/* 132 */       arrayOfByte[b * 4 + 3] = (byte)k;
/*     */     } 
/* 134 */     this.e.clear();
/* 135 */     this.e.put(arrayOfByte);
/* 136 */     this.e.position(0).limit(arrayOfByte.length);
/*     */ 
/*     */     
/* 139 */     GL11.glTexImage2D(3553, 0, 6408, i, j, 0, 6408, 5121, this.e);
/* 140 */     if (a) {
/* 141 */       for (b = 1; b <= 4; b++) {
/* 142 */         int k = i >> b - 1;
/*     */ 
/*     */         
/* 145 */         int m = i >> b;
/* 146 */         int n = j >> b;
/*     */         
/* 148 */         for (byte b1 = 0; b1 < m; b1++) {
/* 149 */           for (byte b2 = 0; b2 < n; b2++) {
/* 150 */             int i1 = this.e.getInt((b1 * 2 + 0 + (b2 * 2 + 0) * k) * 4);
/* 151 */             int i2 = this.e.getInt((b1 * 2 + 1 + (b2 * 2 + 0) * k) * 4);
/* 152 */             int i3 = this.e.getInt((b1 * 2 + 1 + (b2 * 2 + 1) * k) * 4);
/* 153 */             int i4 = this.e.getInt((b1 * 2 + 0 + (b2 * 2 + 1) * k) * 4);
/* 154 */             int i5 = b(b(i1, i2), b(i3, i4));
/* 155 */             this.e.putInt((b1 + b2 * m) * 4, i5);
/*     */           } 
/* 157 */         }  GL11.glTexImage2D(3553, b, 6408, m, n, 0, 6408, 5121, this.e);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {
/* 168 */     this.c.remove(Integer.valueOf(paramInt));
/* 169 */     this.d.clear();
/* 170 */     this.d.put(paramInt);
/* 171 */     this.d.flip();
/* 172 */     GL11.glDeleteTextures(this.d);
/*     */   }
/*     */   
/*     */   public int a(String paramString1, String paramString2) {
/* 176 */     by by = (by)this.g.get(paramString1);
/* 177 */     if (by != null && 
/* 178 */       by.a != null && !by.d) {
/* 179 */       if (by.c < 0) {
/* 180 */         by.c = a(by.a);
/*     */       } else {
/* 182 */         a(by.a, by.c);
/*     */       } 
/* 184 */       by.d = true;
/*     */     } 
/*     */     
/* 187 */     if (by == null || by.c < 0) return a(paramString2); 
/* 188 */     return by.c;
/*     */   }
/*     */   
/*     */   public by a(String paramString, gr paramgr) {
/* 192 */     by by = (by)this.g.get(paramString);
/* 193 */     if (by == null) {
/* 194 */       this.g.put(paramString, new by(paramString, paramgr));
/*     */     } else {
/* 196 */       by.b++;
/*     */     } 
/* 198 */     return by;
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/* 202 */     by by = (by)this.g.get(paramString);
/* 203 */     if (by != null) {
/* 204 */       by.b--;
/* 205 */       if (by.b == 0) {
/* 206 */         if (by.c >= 0) a(by.c); 
/* 207 */         this.g.remove(paramString);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(y paramy) {
/* 213 */     this.f.add(paramy);
/* 214 */     paramy.a();
/*     */   }
/*     */   public void a() {
/*     */     byte b;
/* 218 */     for (b = 0; b < this.f.size(); b++) {
/* 219 */       y y = this.f.get(b);
/* 220 */       y.c = this.h.g;
/* 221 */       y.a();
/*     */       
/* 223 */       this.e.clear();
/* 224 */       this.e.put(y.a);
/* 225 */       this.e.position(0).limit(y.a.length);
/*     */       
/* 227 */       for (byte b1 = 0; b1 < y.e; b1++) {
/* 228 */         for (byte b2 = 0; b2 < y.e; b2++) {
/*     */           
/* 230 */           GL11.glTexSubImage2D(3553, 0, y.b % 16 * 16 + b1 * 16, y.b / 16 * 16 + b2 * 16, 16, 16, 6408, 5121, this.e);
/* 231 */           if (a) {
/* 232 */             for (byte b3 = 1; b3 <= 4; b3++) {
/* 233 */               int i = 16 >> b3 - 1;
/* 234 */               int j = 16 >> b3;
/*     */               
/* 236 */               for (byte b4 = 0; b4 < j; b4++) {
/* 237 */                 for (byte b5 = 0; b5 < j; b5++) {
/* 238 */                   int k = this.e.getInt((b4 * 2 + 0 + (b5 * 2 + 0) * i) * 4);
/* 239 */                   int m = this.e.getInt((b4 * 2 + 1 + (b5 * 2 + 0) * i) * 4);
/* 240 */                   int n = this.e.getInt((b4 * 2 + 1 + (b5 * 2 + 1) * i) * 4);
/* 241 */                   int i1 = this.e.getInt((b4 * 2 + 0 + (b5 * 2 + 1) * i) * 4);
/* 242 */                   int i2 = a(a(k, m), a(n, i1));
/* 243 */                   this.e.putInt((b4 + b5 * j) * 4, i2);
/*     */                 } 
/* 245 */               }  GL11.glTexSubImage2D(3553, b3, y.b % 16 * j, y.b / 16 * j, j, j, 6408, 5121, this.e);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 251 */     for (b = 0; b < this.f.size(); b++) {
/* 252 */       y y = this.f.get(b);
/*     */       
/* 254 */       if (y.d > 0) {
/* 255 */         this.e.clear();
/* 256 */         this.e.put(y.a);
/* 257 */         this.e.position(0).limit(y.a.length);
/* 258 */         GL11.glBindTexture(3553, y.d);
/* 259 */         GL11.glTexSubImage2D(3553, 0, 0, 0, 16, 16, 6408, 5121, this.e);
/* 260 */         if (a) {
/* 261 */           for (byte b1 = 1; b1 <= 4; b1++) {
/* 262 */             int i = 16 >> b1 - 1;
/* 263 */             int j = 16 >> b1;
/*     */             
/* 265 */             for (byte b2 = 0; b2 < j; b2++) {
/* 266 */               for (byte b3 = 0; b3 < j; b3++) {
/* 267 */                 int k = this.e.getInt((b2 * 2 + 0 + (b3 * 2 + 0) * i) * 4);
/* 268 */                 int m = this.e.getInt((b2 * 2 + 1 + (b3 * 2 + 0) * i) * 4);
/* 269 */                 int n = this.e.getInt((b2 * 2 + 1 + (b3 * 2 + 1) * i) * 4);
/* 270 */                 int i1 = this.e.getInt((b2 * 2 + 0 + (b3 * 2 + 1) * i) * 4);
/* 271 */                 int i2 = a(a(k, m), a(n, i1));
/* 272 */                 this.e.putInt((b2 + b3 * j) * 4, i2);
/*     */               } 
/* 274 */             }  GL11.glTexSubImage2D(3553, b1, 0, 0, j, j, 6408, 5121, this.e);
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(int paramInt1, int paramInt2) {
/* 282 */     int i = (paramInt1 & 0xFF000000) >> 24 & 0xFF;
/* 283 */     int j = (paramInt2 & 0xFF000000) >> 24 & 0xFF;
/* 284 */     return (i + j >> 1 << 24) + ((paramInt1 & 0xFEFEFE) + (paramInt2 & 0xFEFEFE) >> 1);
/*     */   }
/*     */   
/*     */   private int b(int paramInt1, int paramInt2) {
/* 288 */     int i = (paramInt1 & 0xFF000000) >> 24 & 0xFF;
/* 289 */     int j = (paramInt2 & 0xFF000000) >> 24 & 0xFF;
/*     */     
/* 291 */     char c = 'ÿ';
/* 292 */     if (i + j == 0) {
/* 293 */       i = 1;
/* 294 */       j = 1;
/* 295 */       c = Character.MIN_VALUE;
/*     */     } 
/*     */     
/* 298 */     int k = (paramInt1 >> 16 & 0xFF) * i;
/* 299 */     int m = (paramInt1 >> 8 & 0xFF) * i;
/* 300 */     int n = (paramInt1 & 0xFF) * i;
/*     */     
/* 302 */     int i1 = (paramInt2 >> 16 & 0xFF) * j;
/* 303 */     int i2 = (paramInt2 >> 8 & 0xFF) * j;
/* 304 */     int i3 = (paramInt2 & 0xFF) * j;
/*     */     
/* 306 */     int i4 = (k + i1) / (i + j);
/* 307 */     int i5 = (m + i2) / (i + j);
/* 308 */     int i6 = (n + i3) / (i + j);
/*     */     
/* 310 */     return c << 24 | i4 << 16 | i5 << 8 | i6;
/*     */   }
/*     */   
/*     */   public void b() {
/* 314 */     for (null = this.c.keySet().iterator(); null.hasNext(); ) { int i = ((Integer)null.next()).intValue();
/* 315 */       BufferedImage bufferedImage = (BufferedImage)this.c.get(Integer.valueOf(i));
/* 316 */       a(bufferedImage, i); }
/*     */ 
/*     */     
/* 319 */     for (by by : this.g.values()) {
/* 320 */       by.d = false;
/*     */     }
/*     */     
/* 323 */     for (String str : this.b.keySet()) {
/*     */       try {
/*     */         BufferedImage bufferedImage;
/* 326 */         if (str.startsWith("##")) {
/* 327 */           bufferedImage = b(ImageIO.read(er.class.getResourceAsStream(str.substring(2))));
/* 328 */         } else if (str.startsWith("%%")) {
/* 329 */           this.i = true;
/* 330 */           bufferedImage = ImageIO.read(er.class.getResourceAsStream(str.substring(2)));
/* 331 */           this.i = false;
/*     */         } else {
/* 333 */           bufferedImage = ImageIO.read(er.class.getResourceAsStream(str));
/*     */         } 
/* 335 */         int i = ((Integer)this.b.get(str)).intValue();
/* 336 */         a(bufferedImage, i);
/* 337 */       } catch (IOException iOException) {
/* 338 */         iOException.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 344 */     if (paramInt < 0)
/* 345 */       return;  GL11.glBindTexture(3553, paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\er.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */