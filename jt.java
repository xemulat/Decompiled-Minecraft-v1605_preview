/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.nio.IntBuffer;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class jt
/*     */ {
/*     */   private int[] b;
/*     */   public int a;
/*     */   private int c;
/*     */   private IntBuffer d;
/*     */   
/*     */   public jt(fi paramfi, String paramString, er paramer) {
/*     */     BufferedImage bufferedImage;
/*  19 */     this.b = new int[256];
/*  20 */     this.a = 0;
/*     */     
/*  22 */     this.d = da.c(1024);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  27 */       bufferedImage = ImageIO.read(er.class.getResourceAsStream(paramString));
/*  28 */     } catch (IOException iOException) {
/*  29 */       throw new RuntimeException(iOException);
/*     */     } 
/*  31 */     int i = bufferedImage.getWidth();
/*  32 */     int j = bufferedImage.getHeight();
/*  33 */     int[] arrayOfInt = new int[i * j];
/*  34 */     bufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i);
/*     */     
/*  36 */     for (byte b1 = 0; b1 < 'Ā'; b1++) {
/*  37 */       int k = b1 % 16;
/*  38 */       int m = b1 / 16;
/*     */ 
/*     */       
/*  41 */       byte b = 7;
/*  42 */       for (; b >= 0; b--) {
/*  43 */         int n = k * 8 + b;
/*  44 */         boolean bool = true;
/*  45 */         for (byte b3 = 0; b3 < 8 && bool; b3++) {
/*  46 */           int i1 = (m * 8 + b3) * i;
/*  47 */           int i2 = arrayOfInt[n + i1] & 0xFF;
/*  48 */           if (i2 > 0) bool = false; 
/*     */         } 
/*  50 */         if (!bool) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */       
/*  55 */       if (b1 == 32) b = 2; 
/*  56 */       this.b[b1] = b + 2;
/*     */     } 
/*     */ 
/*     */     
/*  60 */     this.a = paramer.a(bufferedImage);
/*     */     
/*  62 */     this.c = da.a(288);
/*  63 */     he he = he.a; byte b2;
/*  64 */     for (b2 = 0; b2 < 'Ā'; b2++) {
/*  65 */       GL11.glNewList(this.c + b2, 4864);
/*  66 */       he.b();
/*  67 */       int k = b2 % 16 * 8;
/*  68 */       int m = b2 / 16 * 8;
/*     */       
/*  70 */       float f1 = 7.99F;
/*     */       
/*  72 */       float f2 = 0.0F;
/*  73 */       float f3 = 0.0F;
/*     */       
/*  75 */       he.a(0.0D, (0.0F + f1), 0.0D, (k / 128.0F + f2), ((m + f1) / 128.0F + f3));
/*  76 */       he.a((0.0F + f1), (0.0F + f1), 0.0D, ((k + f1) / 128.0F + f2), ((m + f1) / 128.0F + f3));
/*  77 */       he.a((0.0F + f1), 0.0D, 0.0D, ((k + f1) / 128.0F + f2), (m / 128.0F + f3));
/*  78 */       he.a(0.0D, 0.0D, 0.0D, (k / 128.0F + f2), (m / 128.0F + f3));
/*     */       
/*  80 */       he.a();
/*     */       
/*  82 */       GL11.glTranslatef(this.b[b2], 0.0F, 0.0F);
/*  83 */       GL11.glEndList();
/*     */     } 
/*     */     
/*  86 */     for (b2 = 0; b2 < 32; b2++) {
/*  87 */       int k = (b2 >> 3 & 0x1) * 85;
/*  88 */       int m = (b2 >> 2 & 0x1) * 170 + k;
/*  89 */       int n = (b2 >> 1 & 0x1) * 170 + k;
/*  90 */       int i1 = (b2 >> 0 & 0x1) * 170 + k;
/*  91 */       if (b2 == 6) {
/*  92 */         m += 85;
/*     */       }
/*  94 */       boolean bool = (b2 >= 16) ? true : false;
/*     */       
/*  96 */       if (paramfi.g) {
/*  97 */         int i2 = (m * 30 + n * 59 + i1 * 11) / 100;
/*  98 */         int i3 = (m * 30 + n * 70) / 100;
/*  99 */         int i4 = (m * 30 + i1 * 70) / 100;
/*     */         
/* 101 */         m = i2;
/* 102 */         n = i3;
/* 103 */         i1 = i4;
/*     */       } 
/*     */ 
/*     */       
/* 107 */       if (bool) {
/* 108 */         m /= 4;
/* 109 */         n /= 4;
/* 110 */         i1 /= 4;
/*     */       } 
/* 112 */       GL11.glNewList(this.c + 256 + b2, 4864);
/* 113 */       GL11.glColor3f(m / 255.0F, n / 255.0F, i1 / 255.0F);
/* 114 */       GL11.glEndList();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 119 */     a(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3, true);
/* 120 */     b(paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 124 */     a(paramString, paramInt1, paramInt2, paramInt3, false);
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 128 */     if (paramString == null)
/*     */       return; 
/* 130 */     if (paramBoolean) {
/* 131 */       int i = paramInt3 & 0xFF000000;
/* 132 */       paramInt3 = (paramInt3 & 0xFCFCFC) >> 2;
/* 133 */       paramInt3 += i;
/*     */     } 
/*     */ 
/*     */     
/* 137 */     GL11.glBindTexture(3553, this.a);
/*     */     
/* 139 */     float f1 = (paramInt3 >> 16 & 0xFF) / 255.0F;
/* 140 */     float f2 = (paramInt3 >> 8 & 0xFF) / 255.0F;
/* 141 */     float f3 = (paramInt3 & 0xFF) / 255.0F;
/* 142 */     float f4 = (paramInt3 >> 24 & 0xFF) / 255.0F;
/* 143 */     if (f4 == 0.0F) f4 = 1.0F;
/*     */     
/* 145 */     GL11.glColor4f(f1, f2, f3, f4);
/*     */ 
/*     */     
/* 148 */     this.d.clear();
/* 149 */     GL11.glPushMatrix();
/* 150 */     GL11.glTranslatef(paramInt1, paramInt2, 0.0F);
/* 151 */     for (byte b = 0; b < paramString.length(); b++) {
/* 152 */       while (paramString.charAt(b) == '§' && paramString.length() > b + 1) {
/* 153 */         int j = "0123456789abcdef".indexOf(paramString.toLowerCase().charAt(b + 1));
/* 154 */         if (j < 0 || j > 15) j = 15; 
/* 155 */         this.d.put(this.c + 256 + j + (paramBoolean ? 16 : 0));
/*     */         
/* 157 */         if (this.d.remaining() == 0) {
/* 158 */           this.d.flip();
/* 159 */           GL11.glCallLists(this.d);
/* 160 */           this.d.clear();
/*     */         } 
/*     */         
/* 163 */         b += 2;
/*     */       } 
/*     */       
/* 166 */       int i = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(paramString.charAt(b));
/* 167 */       if (i >= 0) {
/* 168 */         this.d.put(this.c + i + 32);
/*     */       }
/*     */       
/* 171 */       if (this.d.remaining() == 0) {
/* 172 */         this.d.flip();
/* 173 */         GL11.glCallLists(this.d);
/* 174 */         this.d.clear();
/*     */       } 
/*     */     } 
/* 177 */     this.d.flip();
/* 178 */     GL11.glCallLists(this.d);
/* 179 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public int a(String paramString) {
/* 183 */     if (paramString == null) return 0; 
/* 184 */     int i = 0;
/*     */     
/* 186 */     for (byte b = 0; b < paramString.length(); b++) {
/* 187 */       if (paramString.charAt(b) == '§') {
/* 188 */         b++;
/*     */       } else {
/* 190 */         int j = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(paramString.charAt(b));
/* 191 */         if (j >= 0) {
/* 192 */           i += this.b[j + 32];
/*     */         }
/*     */       } 
/*     */     } 
/* 196 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */