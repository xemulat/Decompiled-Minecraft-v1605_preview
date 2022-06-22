/*     */ import java.awt.Color;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class lk extends lb {
/*   9 */   private static z d = new z();
/*     */   
/*  11 */   private List e = new ArrayList();
/*     */   
/*  13 */   private Random f = new Random();
/*     */   
/*     */   private Minecraft g;
/*     */   
/*  17 */   public String a = null;
/*     */   
/*  19 */   private int h = 0;
/*     */   
/*  21 */   private String i = "";
/*     */   
/*  23 */   private int k = 0;
/*     */   
/*     */   public float b;
/*     */   
/*     */   float c;
/*     */   
/*     */   public void a(float paramFloat, boolean paramBoolean, int paramInt1, int paramInt2) {
/*  30 */     ip ip = new ip(this.g.c, this.g.d);
/*  31 */     int i = ip.a();
/*  32 */     int j = ip.b();
/*  33 */     jt jt = this.g.o;
/*  34 */     this.g.r.b();
/*  35 */     GL11.glEnable(3042);
/*  36 */     if (this.g.y.i)
/*  37 */       a(this.g.g.a(paramFloat), i, j); 
/*  38 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  39 */     GL11.glBindTexture(3553, this.g.n.a("/gui/gui.png"));
/*  40 */     en en = this.g.g.b;
/*  41 */     this.j = -90.0F;
/*  42 */     b(i / 2 - 91, j - 22, 0, 0, 182, 22);
/*  43 */     b(i / 2 - 91 - 1 + en.d * 20, j - 22 - 1, 0, 22, 24, 22);
/*  44 */     GL11.glBindTexture(3553, this.g.n.a("/gui/icons.png"));
/*  45 */     GL11.glEnable(3042);
/*  46 */     GL11.glBlendFunc(775, 769);
/*  47 */     b(i / 2 - 7, j / 2 - 7, 0, 0, 16, 16);
/*  48 */     GL11.glDisable(3042);
/*  49 */     boolean bool1 = (this.g.g.aT / 3 % 2 == 1) ? true : false;
/*  50 */     if (this.g.g.aT < 10)
/*  51 */       bool1 = false; 
/*  52 */     int k = this.g.g.D;
/*  53 */     int m = this.g.g.E;
/*  54 */     this.f.setSeed((this.h * 312871));
/*  55 */     if (this.g.b.e()) {
/*  56 */       int i1 = this.g.g.l();
/*     */       int i2;
/*  58 */       for (i2 = 0; i2 < 10; i2++) {
/*  59 */         int i3 = j - 32;
/*  60 */         if (i1 > 0) {
/*  61 */           int i5 = i / 2 + 91 - i2 * 8 - 9;
/*  62 */           if (i2 * 2 + 1 < i1)
/*  63 */             b(i5, i3, 34, 9, 9, 9); 
/*  64 */           if (i2 * 2 + 1 == i1)
/*  65 */             b(i5, i3, 25, 9, 9, 9); 
/*  66 */           if (i2 * 2 + 1 > i1)
/*  67 */             b(i5, i3, 16, 9, 9, 9); 
/*     */         } 
/*  69 */         byte b1 = 0;
/*  70 */         if (bool1)
/*  71 */           b1 = 1; 
/*  72 */         int i4 = i / 2 - 91 + i2 * 8;
/*  73 */         if (k <= 4)
/*  74 */           i3 += this.f.nextInt(2); 
/*  75 */         b(i4, i3, 16 + b1 * 9, 0, 9, 9);
/*  76 */         if (bool1) {
/*  77 */           if (i2 * 2 + 1 < m)
/*  78 */             b(i4, i3, 70, 0, 9, 9); 
/*  79 */           if (i2 * 2 + 1 == m)
/*  80 */             b(i4, i3, 79, 0, 9, 9); 
/*     */         } 
/*  82 */         if (i2 * 2 + 1 < k)
/*  83 */           b(i4, i3, 52, 0, 9, 9); 
/*  84 */         if (i2 * 2 + 1 == k)
/*  85 */           b(i4, i3, 61, 0, 9, 9); 
/*     */       } 
/*  87 */       if (this.g.g.a(fs.f)) {
/*  88 */         i2 = (int)Math.ceil((this.g.g.aU - 2) * 10.0D / 300.0D);
/*  89 */         int i3 = (int)Math.ceil(this.g.g.aU * 10.0D / 300.0D) - i2; byte b1;
/*  90 */         for (b1 = 0; b1 < i2 + i3; b1 = (byte)(b1 + 1)) {
/*  91 */           if (b1 < i2) {
/*  92 */             b(i / 2 - 91 + b1 * 8, j - 32 - 9, 16, 18, 9, 9);
/*     */           } else {
/*  94 */             b(i / 2 - 91 + b1 * 8, j - 32 - 9, 25, 18, 9, 9);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  99 */     GL11.glDisable(3042);
/* 100 */     GL11.glEnable(32826);
/* 101 */     GL11.glPushMatrix();
/* 102 */     GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/* 103 */     GLStatics.b();
/* 104 */     GL11.glPopMatrix();
/*     */     byte b;
/* 106 */     for (b = 0; b < 9; b = (byte)(b + 1)) {
/* 107 */       int i1 = i / 2 - 90 + b * 20 + 2;
/* 108 */       int i2 = j - 16 - 3;
/* 109 */       a(b, i1, i2, paramFloat);
/*     */     } 
/* 111 */     GLStatics.a();
/* 112 */     GL11.glDisable(32826);
/* 113 */     if (this.g.y.d) {
/* 114 */       jt.a("Minecraft Alpha v1.0.16.05 [PREVIEW] (" + this.g.G + ")", 2, 2, 16777215);
/* 115 */       jt.a(this.g.l(), 2, 12, 16777215);
/* 116 */       jt.a(this.g.m(), 2, 22, 16777215);
/* 117 */       jt.a(this.g.n(), 2, 32, 16777215);
/* 118 */       long l1 = Runtime.getRuntime().maxMemory();
/* 119 */       long l2 = Runtime.getRuntime().totalMemory();
/* 120 */       long l3 = Runtime.getRuntime().freeMemory();
/* 121 */       long l4 = l2 - l3;
/* 122 */       String str = "Used memory: " + (l4 * 100L / l1) + "% (" + (l4 / 1024L / 1024L) + "MB) of " + (l1 / 1024L / 1024L) + "MB";
/* 123 */       b(jt, str, i - jt.a(str) - 2, 2, 14737632);
/* 124 */       str = "Allocated memory: " + (l2 * 100L / l1) + "% (" + (l2 / 1024L / 1024L) + "MB)";
/* 125 */       b(jt, str, i - jt.a(str) - 2, 12, 14737632);
/*     */     } else {
/* 127 */       jt.a("Minecraft Alpha v1.0.16.05 [PREVIEW]", 2, 2, 16777215);
/* 128 */       jt.a(ct.timeRemaining(), 2, 12, 16777215);
/*     */     } 
/*     */ 
/*     */     
/* 132 */     if (this.k > 0) {
/* 133 */       float f = this.k - paramFloat;
/* 134 */       int i1 = (int)(f * 256.0F / 20.0F);
/* 135 */       if (i1 > 255)
/* 136 */         i1 = 255; 
/* 137 */       if (i1 > 0) {
/* 138 */         GL11.glPushMatrix();
/* 139 */         GL11.glTranslatef((i / 2), (j - 48), 0.0F);
/* 140 */         GL11.glEnable(3042);
/* 141 */         GL11.glBlendFunc(770, 771);
/* 142 */         int i2 = Color.HSBtoRGB(f / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
/* 143 */         jt.b(this.i, -jt.a(this.i) / 2, -4, i2 + (i1 << 24));
/* 144 */         GL11.glDisable(3042);
/* 145 */         GL11.glPopMatrix();
/*     */       } 
/*     */     } 
/* 148 */     b = 10;
/* 149 */     boolean bool2 = false;
/* 150 */     if (this.g.p instanceof cz) {
/* 151 */       b = 20;
/* 152 */       bool2 = true;
/*     */     } 
/* 154 */     GL11.glEnable(3042);
/* 155 */     GL11.glBlendFunc(770, 771);
/* 156 */     GL11.glDisable(3008);
/* 157 */     GL11.glPushMatrix();
/* 158 */     GL11.glTranslatef(0.0F, (j - 48), 0.0F); int n;
/* 159 */     for (n = 0; n < this.e.size() && n < b; n = (byte)(n + 1)) {
/* 160 */       if (((kd)this.e.get(n)).b < 200 || bool2) {
/* 161 */         double d = ((kd)this.e.get(n)).b / 200.0D;
/* 162 */         d = 1.0D - d;
/* 163 */         d *= 10.0D;
/* 164 */         if (d < 0.0D)
/* 165 */           d = 0.0D; 
/* 166 */         if (d > 1.0D)
/* 167 */           d = 1.0D; 
/* 168 */         d *= d;
/* 169 */         int i1 = (int)(255.0D * d);
/* 170 */         if (bool2)
/* 171 */           i1 = 255; 
/* 172 */         if (i1 > 0) {
/* 173 */           byte b1 = 2;
/* 174 */           int i2 = -n * 9;
/* 175 */           String str = ((kd)this.e.get(n)).a;
/* 176 */           a(b1, i2 - 1, b1 + 320, i2 + 8, i1 / 2 << 24);
/* 177 */           GL11.glEnable(3042);
/* 178 */           jt.a(str, b1, i2, 16777215 + (i1 << 24));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 183 */     if (bd.currentID != "") {
/* 184 */       jt.a("[Use numpad to enter, - to clear, + to give]", 2, 10, 16449390);
/* 185 */       jt.a("Give item: " + bd.currentID, 2, 20, 16449390);
/* 186 */       n = Integer.parseInt(bd.currentID);
/* 187 */       if ((ln.n.length <= n || ln.n[n] == null) && (dd.c.length <= n || dd.c[n] == null))
/*     */       {
/* 189 */         jt.a("(INVALID)", 2, 30, 16711680);
/*     */       }
/*     */     } 
/* 192 */     GL11.glPopMatrix();
/* 193 */     GL11.glEnable(3008);
/* 194 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   public lk(Minecraft paramMinecraft) {
/* 198 */     this.c = 1.0F;
/* 199 */     this.g = paramMinecraft;
/*     */   }
/*     */   
/*     */   private void a(float paramFloat, int paramInt1, int paramInt2) {
/* 203 */     paramFloat = 1.0F - paramFloat;
/* 204 */     if (paramFloat < 0.0F)
/* 205 */       paramFloat = 0.0F; 
/* 206 */     if (paramFloat > 1.0F)
/* 207 */       paramFloat = 1.0F; 
/* 208 */     this.c = (float)(this.c + (paramFloat - this.c) * 0.01D);
/* 209 */     GL11.glDisable(2929);
/* 210 */     GL11.glDepthMask(false);
/* 211 */     GL11.glBlendFunc(0, 769);
/* 212 */     GL11.glColor4f(this.c, this.c, this.c, 1.0F);
/* 213 */     GL11.glBindTexture(3553, this.g.n.a("/misc/vignette.png"));
/* 214 */     he he = he.a;
/* 215 */     he.b();
/* 216 */     he.a(0.0D, paramInt2, -90.0D, 0.0D, 1.0D);
/* 217 */     he.a(paramInt1, paramInt2, -90.0D, 1.0D, 1.0D);
/* 218 */     he.a(paramInt1, 0.0D, -90.0D, 1.0D, 0.0D);
/* 219 */     he.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 220 */     he.a();
/* 221 */     GL11.glDepthMask(true);
/* 222 */     GL11.glEnable(2929);
/* 223 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 224 */     GL11.glBlendFunc(770, 771);
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/* 228 */     eo eo = this.g.g.b.a[paramInt1];
/* 229 */     if (eo == null)
/*     */       return; 
/* 231 */     float f = eo.b - paramFloat;
/* 232 */     if (f > 0.0F) {
/* 233 */       GL11.glPushMatrix();
/* 234 */       float f1 = 1.0F + f / 5.0F;
/* 235 */       GL11.glTranslatef((paramInt2 + 8), (paramInt3 + 12), 0.0F);
/* 236 */       GL11.glScalef(1.0F / f1, (f1 + 1.0F) / 2.0F, 1.0F);
/* 237 */       GL11.glTranslatef(-(paramInt2 + 8), -(paramInt3 + 12), 0.0F);
/*     */     } 
/* 239 */     d.a(this.g.o, this.g.n, eo, paramInt2, paramInt3);
/* 240 */     if (f > 0.0F)
/* 241 */       GL11.glPopMatrix(); 
/* 242 */     d.b(this.g.o, this.g.n, eo, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a() {
/* 246 */     if (this.k > 0)
/* 247 */       this.k--; 
/* 248 */     this.h++;
/* 249 */     for (byte b = 0; b < this.e.size(); b = (byte)(b + 1))
/* 250 */       ((kd)this.e.get(b)).b++; 
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 254 */     while (this.g.o.a(paramString) > 320) {
/* 255 */       byte b = 1;
/* 256 */       while (b < paramString.length() && this.g.o.a(paramString.substring(0, b + 1)) <= 320)
/* 257 */         b = (byte)(b + 1); 
/* 258 */       a(paramString.substring(0, b));
/* 259 */       paramString = paramString.substring(b);
/*     */     } 
/* 261 */     this.e.add(0, new kd(paramString));
/* 262 */     while (this.e.size() > 50)
/* 263 */       this.e.remove(this.e.size() - 1); 
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/* 267 */     this.i = "Now playing: " + paramString;
/* 268 */     this.k = 60;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */