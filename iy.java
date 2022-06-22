/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class iy
/*     */ {
/*     */   private Minecraft a;
/*  16 */   private eo b = null;
/*  17 */   private float c = 0.0F;
/*  18 */   private float d = 0.0F;
/*  19 */   private ay e = new ay();
/*     */   
/*     */   public iy(Minecraft paramMinecraft) {
/*  22 */     this.a = paramMinecraft;
/*     */   }
/*     */   
/*     */   public void a(eo parameo) {
/*  26 */     GL11.glPushMatrix();
/*  27 */     if (parameo.c < 256 && ay.a(ln.n[parameo.c].f())) {
/*  28 */       GL11.glBindTexture(3553, this.a.n.a("/terrain.png"));
/*  29 */       this.e.a(ln.n[parameo.c]);
/*     */     } else {
/*  31 */       if (parameo.c < 256) {
/*  32 */         GL11.glBindTexture(3553, this.a.n.a("/terrain.png"));
/*     */       } else {
/*  34 */         GL11.glBindTexture(3553, this.a.n.a("/gui/items.png"));
/*     */       } 
/*     */       
/*  37 */       he he = he.a;
/*     */ 
/*     */       
/*  40 */       float f1 = (parameo.b() % 16 * 16 + 0) / 256.0F;
/*  41 */       float f2 = (parameo.b() % 16 * 16 + 16) / 256.0F;
/*  42 */       float f3 = (parameo.b() / 16 * 16 + 0) / 256.0F;
/*  43 */       float f4 = (parameo.b() / 16 * 16 + 16) / 256.0F;
/*     */ 
/*     */       
/*  46 */       float f5 = 1.0F;
/*  47 */       float f6 = 0.0F;
/*  48 */       float f7 = 0.3F;
/*     */       
/*  50 */       GL11.glEnable(32826);
/*  51 */       GL11.glTranslatef(-f6, -f7, 0.0F);
/*  52 */       float f8 = 1.5F;
/*  53 */       GL11.glScalef(f8, f8, f8);
/*     */       
/*  55 */       GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
/*  56 */       GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
/*  57 */       GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
/*  58 */       float f9 = 0.0625F;
/*  59 */       he.b();
/*  60 */       he.b(0.0F, 0.0F, 1.0F);
/*  61 */       he.a(0.0D, 0.0D, 0.0D, f2, f4);
/*  62 */       he.a(f5, 0.0D, 0.0D, f1, f4);
/*  63 */       he.a(f5, 1.0D, 0.0D, f1, f3);
/*  64 */       he.a(0.0D, 1.0D, 0.0D, f2, f3);
/*  65 */       he.a();
/*     */       
/*  67 */       he.b();
/*  68 */       he.b(0.0F, 0.0F, -1.0F);
/*  69 */       he.a(0.0D, 1.0D, (0.0F - f9), f2, f3);
/*  70 */       he.a(f5, 1.0D, (0.0F - f9), f1, f3);
/*  71 */       he.a(f5, 0.0D, (0.0F - f9), f1, f4);
/*  72 */       he.a(0.0D, 0.0D, (0.0F - f9), f2, f4);
/*  73 */       he.a();
/*     */       
/*  75 */       he.b();
/*  76 */       he.b(-1.0F, 0.0F, 0.0F); byte b;
/*  77 */       for (b = 0; b < 16; b++) {
/*  78 */         float f10 = b / 16.0F;
/*  79 */         float f11 = f2 + (f1 - f2) * f10 - 0.001953125F;
/*  80 */         float f12 = f5 * f10;
/*  81 */         he.a(f12, 0.0D, (0.0F - f9), f11, f4);
/*  82 */         he.a(f12, 0.0D, 0.0D, f11, f4);
/*  83 */         he.a(f12, 1.0D, 0.0D, f11, f3);
/*  84 */         he.a(f12, 1.0D, (0.0F - f9), f11, f3);
/*     */       } 
/*  86 */       he.a();
/*     */       
/*  88 */       he.b();
/*  89 */       he.b(1.0F, 0.0F, 0.0F);
/*  90 */       for (b = 0; b < 16; b++) {
/*  91 */         float f10 = b / 16.0F;
/*  92 */         float f11 = f2 + (f1 - f2) * f10 - 0.001953125F;
/*  93 */         float f12 = f5 * f10 + 0.0625F;
/*  94 */         he.a(f12, 1.0D, (0.0F - f9), f11, f3);
/*  95 */         he.a(f12, 1.0D, 0.0D, f11, f3);
/*  96 */         he.a(f12, 0.0D, 0.0D, f11, f4);
/*  97 */         he.a(f12, 0.0D, (0.0F - f9), f11, f4);
/*     */       } 
/*  99 */       he.a();
/*     */       
/* 101 */       he.b();
/* 102 */       he.b(0.0F, 1.0F, 0.0F);
/* 103 */       for (b = 0; b < 16; b++) {
/* 104 */         float f10 = b / 16.0F;
/* 105 */         float f11 = f4 + (f3 - f4) * f10 - 0.001953125F;
/* 106 */         float f12 = f5 * f10 + 0.0625F;
/* 107 */         he.a(0.0D, f12, 0.0D, f2, f11);
/* 108 */         he.a(f5, f12, 0.0D, f1, f11);
/* 109 */         he.a(f5, f12, (0.0F - f9), f1, f11);
/* 110 */         he.a(0.0D, f12, (0.0F - f9), f2, f11);
/*     */       } 
/* 112 */       he.a();
/*     */       
/* 114 */       he.b();
/* 115 */       he.b(0.0F, -1.0F, 0.0F);
/* 116 */       for (b = 0; b < 16; b++) {
/* 117 */         float f10 = b / 16.0F;
/* 118 */         float f11 = f4 + (f3 - f4) * f10 - 0.001953125F;
/* 119 */         float f12 = f5 * f10;
/* 120 */         he.a(f5, f12, 0.0D, f1, f11);
/* 121 */         he.a(0.0D, f12, 0.0D, f2, f11);
/* 122 */         he.a(0.0D, f12, (0.0F - f9), f2, f11);
/* 123 */         he.a(f5, f12, (0.0F - f9), f1, f11);
/*     */       } 
/* 125 */       he.a();
/*     */       
/* 127 */       GL11.glDisable(32826);
/*     */     } 
/*     */ 
/*     */     
/* 131 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 135 */     float f1 = this.d + (this.c - this.d) * paramFloat;
/* 136 */     be be = this.a.g;
/*     */ 
/*     */ 
/*     */     
/* 140 */     GL11.glPushMatrix();
/* 141 */     GL11.glRotatef(be.aq + (be.ao - be.aq) * paramFloat, 1.0F, 0.0F, 0.0F);
/* 142 */     GL11.glRotatef(be.ap + (be.an - be.ap) * paramFloat, 0.0F, 1.0F, 0.0F);
/* 143 */     j.b();
/* 144 */     GL11.glPopMatrix();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     float f2 = this.a.e.c(ei.b(be.ah), ei.b(be.ai), ei.b(be.aj));
/* 150 */     GL11.glColor4f(f2, f2, f2, 1.0F);
/*     */     
/* 152 */     if (this.b != null) {
/* 153 */       GL11.glPushMatrix();
/* 154 */       float f3 = 0.8F;
/*     */ 
/*     */       
/* 157 */       float f4 = be.d(paramFloat);
/*     */       
/* 159 */       float f5 = ei.a(f4 * 3.1415927F);
/* 160 */       float f6 = ei.a(ei.c(f4) * 3.1415927F);
/* 161 */       GL11.glTranslatef(-f6 * 0.4F, ei.a(ei.c(f4) * 3.1415927F * 2.0F) * 0.2F, -f5 * 0.2F);
/*     */ 
/*     */       
/* 164 */       GL11.glTranslatef(0.7F * f3, -0.65F * f3 - (1.0F - f1) * 0.6F, -0.9F * f3);
/*     */       
/* 166 */       GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 167 */       GL11.glEnable(32826);
/*     */       
/* 169 */       f4 = be.d(paramFloat);
/* 170 */       f5 = ei.a(f4 * f4 * 3.1415927F);
/* 171 */       f6 = ei.a(ei.c(f4) * 3.1415927F);
/* 172 */       GL11.glRotatef(-f5 * 20.0F, 0.0F, 1.0F, 0.0F);
/* 173 */       GL11.glRotatef(-f6 * 20.0F, 0.0F, 0.0F, 1.0F);
/* 174 */       GL11.glRotatef(-f6 * 80.0F, 1.0F, 0.0F, 0.0F);
/*     */       
/* 176 */       f4 = 0.4F;
/* 177 */       GL11.glScalef(f4, f4, f4);
/* 178 */       a(this.b);
/* 179 */       GL11.glPopMatrix();
/*     */     } else {
/* 181 */       GL11.glPushMatrix();
/* 182 */       float f3 = 0.8F;
/*     */ 
/*     */       
/* 185 */       float f4 = be.d(paramFloat);
/*     */       
/* 187 */       float f5 = ei.a(f4 * 3.1415927F);
/* 188 */       float f6 = ei.a(ei.c(f4) * 3.1415927F);
/* 189 */       GL11.glTranslatef(-f6 * 0.3F, ei.a(ei.c(f4) * 3.1415927F * 2.0F) * 0.4F, -f5 * 0.4F);
/*     */ 
/*     */       
/* 192 */       GL11.glTranslatef(0.8F * f3, -0.75F * f3 - (1.0F - f1) * 0.6F, -0.9F * f3);
/*     */       
/* 194 */       GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 195 */       GL11.glEnable(32826);
/*     */       
/* 197 */       f4 = be.d(paramFloat);
/* 198 */       f5 = ei.a(f4 * f4 * 3.1415927F);
/* 199 */       f6 = ei.a(ei.c(f4) * 3.1415927F);
/* 200 */       GL11.glRotatef(f6 * 70.0F, 0.0F, 1.0F, 0.0F);
/* 201 */       GL11.glRotatef(-f5 * 20.0F, 0.0F, 0.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 206 */       GL11.glBindTexture(3553, this.a.n.a(this.a.g.aV, this.a.g.v()));
/* 207 */       GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
/* 208 */       GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
/* 209 */       GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
/* 210 */       GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/* 211 */       GL11.glScalef(1.0F, 1.0F, 1.0F);
/* 212 */       GL11.glTranslatef(5.6F, 0.0F, 0.0F);
/*     */       
/* 214 */       ai ai = km.a.a(this.a.g);
/* 215 */       bq bq = (bq)ai;
/* 216 */       f6 = 1.0F;
/* 217 */       GL11.glScalef(f6, f6, f6);
/* 218 */       bq.b();
/* 219 */       GL11.glPopMatrix();
/*     */     } 
/*     */     
/* 222 */     GL11.glDisable(32826);
/* 223 */     j.a();
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 227 */     GL11.glDisable(3008);
/* 228 */     if (this.a.g.aQ > 0) {
/* 229 */       int i = this.a.n.a("/terrain.png");
/* 230 */       GL11.glBindTexture(3553, i);
/* 231 */       d(paramFloat);
/*     */     } 
/*     */ 
/*     */     
/* 235 */     if (this.a.g.G()) {
/*     */       
/* 237 */       int i = ei.b(this.a.g.ah);
/* 238 */       int j = ei.b(this.a.g.ai);
/* 239 */       int k = ei.b(this.a.g.aj);
/*     */       
/* 241 */       int m = this.a.n.a("/terrain.png");
/* 242 */       GL11.glBindTexture(3553, m);
/* 243 */       int n = this.a.e.a(i, j, k);
/* 244 */       if (ln.n[n] != null) {
/* 245 */         a(paramFloat, ln.n[n].a(2));
/*     */       }
/*     */     } 
/*     */     
/* 249 */     if (this.a.g.a(fs.f)) {
/* 250 */       int i = this.a.n.a("/water.png");
/* 251 */       GL11.glBindTexture(3553, i);
/* 252 */       c(paramFloat);
/*     */     } 
/* 254 */     GL11.glEnable(3008);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat, int paramInt) {
/* 258 */     he he = he.a;
/*     */     
/* 260 */     float f1 = this.a.g.a(paramFloat);
/* 261 */     f1 = 0.1F;
/* 262 */     GL11.glColor4f(f1, f1, f1, 0.5F);
/*     */     
/* 264 */     GL11.glPushMatrix();
/*     */     
/* 266 */     float f2 = -1.0F;
/* 267 */     float f3 = 1.0F;
/* 268 */     float f4 = -1.0F;
/* 269 */     float f5 = 1.0F;
/* 270 */     float f6 = -0.5F;
/*     */     
/* 272 */     float f7 = 0.0078125F;
/* 273 */     float f8 = (paramInt % 16) / 256.0F - f7;
/* 274 */     float f9 = ((paramInt % 16) + 15.99F) / 256.0F + f7;
/* 275 */     float f10 = (paramInt / 16) / 256.0F - f7;
/* 276 */     float f11 = ((paramInt / 16) + 15.99F) / 256.0F + f7;
/*     */     
/* 278 */     he.b();
/* 279 */     he.a(f2, f4, f6, f9, f11);
/* 280 */     he.a(f3, f4, f6, f8, f11);
/* 281 */     he.a(f3, f5, f6, f8, f10);
/* 282 */     he.a(f2, f5, f6, f9, f10);
/* 283 */     he.a();
/* 284 */     GL11.glPopMatrix();
/*     */     
/* 286 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(float paramFloat) {
/* 291 */     he he = he.a;
/*     */     
/* 293 */     float f1 = this.a.g.a(paramFloat);
/* 294 */     GL11.glColor4f(f1, f1, f1, 0.5F);
/* 295 */     GL11.glEnable(3042);
/* 296 */     GL11.glBlendFunc(770, 771);
/*     */     
/* 298 */     GL11.glPushMatrix();
/*     */     
/* 300 */     float f2 = 4.0F;
/*     */     
/* 302 */     float f3 = -1.0F;
/* 303 */     float f4 = 1.0F;
/* 304 */     float f5 = -1.0F;
/* 305 */     float f6 = 1.0F;
/* 306 */     float f7 = -0.5F;
/*     */     
/* 308 */     float f8 = -this.a.g.an / 64.0F;
/* 309 */     float f9 = this.a.g.ao / 64.0F;
/*     */     
/* 311 */     he.b();
/* 312 */     he.a(f3, f5, f7, (f2 + f8), (f2 + f9));
/* 313 */     he.a(f4, f5, f7, (0.0F + f8), (f2 + f9));
/* 314 */     he.a(f4, f6, f7, (0.0F + f8), (0.0F + f9));
/* 315 */     he.a(f3, f6, f7, (f2 + f8), (0.0F + f9));
/* 316 */     he.a();
/* 317 */     GL11.glPopMatrix();
/*     */     
/* 319 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 320 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   private void d(float paramFloat) {
/* 324 */     he he = he.a;
/* 325 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
/* 326 */     GL11.glEnable(3042);
/* 327 */     GL11.glBlendFunc(770, 771);
/*     */     
/* 329 */     float f = 1.0F;
/* 330 */     for (byte b = 0; b < 2; b++) {
/* 331 */       GL11.glPushMatrix();
/* 332 */       int i = ln.ar.aZ + b * 16;
/* 333 */       int j = (i & 0xF) << 4;
/* 334 */       int k = i & 0xF0;
/*     */       
/* 336 */       float f1 = j / 256.0F;
/* 337 */       float f2 = (j + 15.99F) / 256.0F;
/* 338 */       float f3 = k / 256.0F;
/* 339 */       float f4 = (k + 15.99F) / 256.0F;
/*     */       
/* 341 */       float f5 = (0.0F - f) / 2.0F;
/* 342 */       float f6 = f5 + f;
/* 343 */       float f7 = 0.0F - f / 2.0F;
/* 344 */       float f8 = f7 + f;
/* 345 */       float f9 = -0.5F;
/* 346 */       GL11.glTranslatef(-(b * 2 - 1) * 0.24F, -0.3F, 0.0F);
/* 347 */       GL11.glRotatef((b * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
/*     */       
/* 349 */       he.b();
/* 350 */       he.a(f5, f7, f9, f2, f4);
/* 351 */       he.a(f6, f7, f9, f1, f4);
/* 352 */       he.a(f6, f8, f9, f1, f3);
/* 353 */       he.a(f5, f8, f9, f2, f3);
/* 354 */       he.a();
/* 355 */       GL11.glPopMatrix();
/*     */     } 
/* 357 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 358 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   public void a() {
/* 362 */     this.d = this.c;
/*     */ 
/*     */     
/* 365 */     be be = this.a.g;
/* 366 */     eo eo1 = be.b.e();
/*     */     
/* 368 */     eo eo2 = eo1;
/*     */     
/* 370 */     float f1 = 0.4F;
/* 371 */     float f2 = (eo2 == this.b) ? 1.0F : 0.0F;
/* 372 */     float f3 = f2 - this.c;
/* 373 */     if (f3 < -f1) f3 = -f1; 
/* 374 */     if (f3 > f1) f3 = f1;
/*     */     
/* 376 */     this.c += f3;
/* 377 */     if (this.c < 0.1F) {
/* 378 */       this.b = eo2;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 383 */     this.c = 0.0F;
/*     */   }
/*     */   
/*     */   public void c() {
/* 387 */     this.c = 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\iy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */