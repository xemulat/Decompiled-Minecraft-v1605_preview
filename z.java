/*     */ import java.util.Random;
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
/*     */ 
/*     */ public class z
/*     */   extends ai
/*     */ {
/*  17 */   private ay d = new ay();
/*  18 */   private Random e = new Random();
/*     */   
/*     */   public z() {
/*  21 */     this.b = 0.15F;
/*  22 */     this.c = 0.75F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dr paramdr, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  27 */     this.e.setSeed(187L);
/*  28 */     eo eo = paramdr.a;
/*     */     
/*  30 */     GL11.glPushMatrix();
/*  31 */     float f1 = ei.a((paramdr.b + paramFloat2) / 10.0F + paramdr.d) * 0.1F + 0.1F;
/*  32 */     float f2 = ((paramdr.b + paramFloat2) / 20.0F + paramdr.d) * 57.295776F;
/*     */     
/*  34 */     byte b = 1;
/*  35 */     if (paramdr.a.a > 1) b = 2; 
/*  36 */     if (paramdr.a.a > 5) b = 3; 
/*  37 */     if (paramdr.a.a > 20) b = 4;
/*     */     
/*  39 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + f1, (float)paramDouble3);
/*  40 */     GL11.glEnable(32826);
/*  41 */     if (eo.c < 256 && ay.a(ln.n[eo.c].f())) {
/*  42 */       GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*     */       
/*  44 */       a("/terrain.png");
/*  45 */       float f = 0.25F;
/*  46 */       if (!ln.n[eo.c].c() && eo.c != ln.ak.ba) {
/*  47 */         f = 0.5F;
/*     */       }
/*     */       
/*  50 */       GL11.glScalef(f, f, f);
/*  51 */       for (byte b1 = 0; b1 < b; b1++) {
/*  52 */         GL11.glPushMatrix();
/*  53 */         if (b1 > 0) {
/*  54 */           float f3 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / f;
/*  55 */           float f4 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / f;
/*  56 */           float f5 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.2F / f;
/*  57 */           GL11.glTranslatef(f3, f4, f5);
/*     */         } 
/*  59 */         this.d.a(ln.n[eo.c]);
/*  60 */         GL11.glPopMatrix();
/*     */       } 
/*     */     } else {
/*  63 */       GL11.glScalef(0.5F, 0.5F, 0.5F);
/*  64 */       int i = eo.b();
/*  65 */       if (eo.c < 256) {
/*  66 */         a("/terrain.png");
/*     */       } else {
/*  68 */         a("/gui/items.png");
/*     */       } 
/*  70 */       he he = he.a;
/*     */       
/*  72 */       float f3 = (i % 16 * 16 + 0) / 256.0F;
/*  73 */       float f4 = (i % 16 * 16 + 16) / 256.0F;
/*  74 */       float f5 = (i / 16 * 16 + 0) / 256.0F;
/*  75 */       float f6 = (i / 16 * 16 + 16) / 256.0F;
/*     */ 
/*     */       
/*  78 */       float f7 = 1.0F;
/*  79 */       float f8 = 0.5F;
/*  80 */       float f9 = 0.25F;
/*     */ 
/*     */ 
/*     */       
/*  84 */       for (byte b1 = 0; b1 < b; b1++) {
/*  85 */         GL11.glPushMatrix();
/*  86 */         if (b1 > 0) {
/*  87 */           float f10 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
/*  88 */           float f11 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
/*  89 */           float f12 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.3F;
/*  90 */           GL11.glTranslatef(f10, f11, f12);
/*     */         } 
/*  92 */         GL11.glRotatef(180.0F - this.a.i, 0.0F, 1.0F, 0.0F);
/*  93 */         he.b();
/*  94 */         he.b(0.0F, 1.0F, 0.0F);
/*  95 */         he.a((0.0F - f8), (0.0F - f9), 0.0D, f3, f6);
/*  96 */         he.a((f7 - f8), (0.0F - f9), 0.0D, f4, f6);
/*  97 */         he.a((f7 - f8), (1.0F - f9), 0.0D, f4, f5);
/*  98 */         he.a((0.0F - f8), (1.0F - f9), 0.0D, f3, f5);
/*  99 */         he.a();
/*     */         
/* 101 */         GL11.glPopMatrix();
/*     */       } 
/*     */     } 
/* 104 */     GL11.glDisable(32826);
/* 105 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public void a(jt paramjt, er paramer, eo parameo, int paramInt1, int paramInt2) {
/* 109 */     if (parameo == null) {
/*     */       return;
/*     */     }
/*     */     
/* 113 */     if (parameo.c < 256 && ay.a(ln.n[parameo.c].f())) {
/* 114 */       int i = parameo.c;
/* 115 */       paramer.b(paramer.a("/terrain.png"));
/*     */       
/* 117 */       ln ln = ln.n[i];
/* 118 */       GL11.glPushMatrix();
/* 119 */       GL11.glTranslatef((paramInt1 - 2), (paramInt2 + 3), 0.0F);
/* 120 */       GL11.glScalef(10.0F, 10.0F, 10.0F);
/* 121 */       GL11.glTranslatef(1.0F, 0.5F, 8.0F);
/* 122 */       GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
/* 123 */       GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       
/* 125 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 126 */       this.d.a(ln);
/*     */       
/* 128 */       GL11.glPopMatrix();
/* 129 */     } else if (parameo.b() >= 0) {
/* 130 */       GL11.glDisable(2896);
/* 131 */       if (parameo.c < 256) {
/* 132 */         paramer.b(paramer.a("/terrain.png"));
/*     */       } else {
/* 134 */         paramer.b(paramer.a("/gui/items.png"));
/*     */       } 
/* 136 */       a(paramInt1, paramInt2, parameo.b() % 16 * 16, parameo.b() / 16 * 16, 16, 16);
/* 137 */       GL11.glEnable(2896);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(jt paramjt, er paramer, eo parameo, int paramInt1, int paramInt2) {
/* 142 */     if (parameo == null) {
/*     */       return;
/*     */     }
/*     */     
/* 146 */     if (parameo.a > 1) {
/* 147 */       String str = "" + parameo.a;
/* 148 */       GL11.glDisable(2896);
/* 149 */       GL11.glDisable(2929);
/* 150 */       paramjt.a(str, paramInt1 + 19 - 2 - paramjt.a(str), paramInt2 + 6 + 3, 16777215);
/* 151 */       GL11.glEnable(2896);
/* 152 */       GL11.glEnable(2929);
/*     */     } 
/*     */     
/* 155 */     if (parameo.d > 0) {
/* 156 */       int i = 13 - parameo.d * 13 / parameo.d();
/* 157 */       int j = 255 - parameo.d * 255 / parameo.d();
/* 158 */       GL11.glDisable(2896);
/* 159 */       GL11.glDisable(2929);
/* 160 */       GL11.glDisable(3553);
/*     */       
/* 162 */       he he = he.a;
/*     */       
/* 164 */       int k = 255 - j << 16 | j << 8;
/* 165 */       int m = (255 - j) / 4 << 16 | 0x3F00;
/* 166 */       a(he, paramInt1 + 2, paramInt2 + 13, 13, 2, 0);
/* 167 */       a(he, paramInt1 + 2, paramInt2 + 13, 12, 1, m);
/* 168 */       a(he, paramInt1 + 2, paramInt2 + 13, i, 1, k);
/*     */       
/* 170 */       GL11.glEnable(3553);
/* 171 */       GL11.glEnable(2896);
/* 172 */       GL11.glEnable(2929);
/* 173 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(he paramhe, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 178 */     paramhe.b();
/* 179 */     paramhe.b(paramInt5);
/* 180 */     paramhe.a((paramInt1 + 0), (paramInt2 + 0), 0.0D);
/* 181 */     paramhe.a((paramInt1 + 0), (paramInt2 + paramInt4), 0.0D);
/* 182 */     paramhe.a((paramInt1 + paramInt3), (paramInt2 + paramInt4), 0.0D);
/* 183 */     paramhe.a((paramInt1 + paramInt3), (paramInt2 + 0), 0.0D);
/* 184 */     paramhe.a();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 188 */     float f1 = 0.0F;
/* 189 */     float f2 = 0.00390625F;
/* 190 */     float f3 = 0.00390625F;
/* 191 */     he he = he.a;
/* 192 */     he.b();
/* 193 */     he.a((paramInt1 + 0), (paramInt2 + paramInt6), f1, ((paramInt3 + 0) * f2), ((paramInt4 + paramInt6) * f3));
/* 194 */     he.a((paramInt1 + paramInt5), (paramInt2 + paramInt6), f1, ((paramInt3 + paramInt5) * f2), ((paramInt4 + paramInt6) * f3));
/* 195 */     he.a((paramInt1 + paramInt5), (paramInt2 + 0), f1, ((paramInt3 + paramInt5) * f2), ((paramInt4 + 0) * f3));
/* 196 */     he.a((paramInt1 + 0), (paramInt2 + 0), f1, ((paramInt3 + 0) * f2), ((paramInt4 + 0) * f3));
/* 197 */     he.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */