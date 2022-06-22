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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ai
/*     */ {
/*     */   protected km a;
/*  25 */   private ff d = new cn();
/*  26 */   private ay e = new ay();
/*     */   
/*  28 */   protected float b = 0.0F;
/*  29 */   protected float c = 1.0F;
/*     */   
/*     */   public abstract void a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);
/*     */   
/*     */   protected void a(String paramString) {
/*  34 */     er er = this.a.e;
/*  35 */     er.b(er.a(paramString));
/*     */   }
/*     */   
/*     */   protected void a(String paramString1, String paramString2) {
/*  39 */     er er = this.a.e;
/*     */     
/*  41 */     er.b(er.a(paramString1, paramString2));
/*     */   }
/*     */   
/*     */   private void a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  45 */     GL11.glDisable(2896);
/*  46 */     int i = ln.ar.aZ;
/*     */     
/*  48 */     int j = (i & 0xF) << 4;
/*  49 */     int k = i & 0xF0;
/*     */     
/*  51 */     float f1 = j / 256.0F;
/*  52 */     float f2 = (j + 15.99F) / 256.0F;
/*  53 */     float f3 = k / 256.0F;
/*  54 */     float f4 = (k + 15.99F) / 256.0F;
/*     */     
/*  56 */     GL11.glPushMatrix();
/*  57 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*     */     
/*  59 */     float f5 = paramjx.az * 1.4F;
/*  60 */     GL11.glScalef(f5, f5, f5);
/*  61 */     a("/terrain.png");
/*  62 */     he he = he.a;
/*     */     
/*  64 */     float f6 = 1.0F;
/*  65 */     float f7 = 0.5F;
/*  66 */     float f8 = 0.0F;
/*     */     
/*  68 */     float f9 = paramjx.aA / paramjx.az;
/*     */     
/*  70 */     GL11.glRotatef(-this.a.i, 0.0F, 1.0F, 0.0F);
/*  71 */     GL11.glTranslatef(0.0F, 0.0F, 0.4F + (int)f9 * 0.02F);
/*  72 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/*  74 */     he.b();
/*  75 */     while (f9 > 0.0F) {
/*  76 */       he.a((f6 - f7), (0.0F - f8), 0.0D, f2, f4);
/*  77 */       he.a((0.0F - f7), (0.0F - f8), 0.0D, f1, f4);
/*  78 */       he.a((0.0F - f7), (1.4F - f8), 0.0D, f1, f3);
/*  79 */       he.a((f6 - f7), (1.4F - f8), 0.0D, f2, f3);
/*  80 */       f9--;
/*  81 */       f8--;
/*  82 */       f6 *= 0.9F;
/*  83 */       GL11.glTranslatef(0.0F, 0.0F, -0.04F);
/*     */     } 
/*  85 */     he.a();
/*  86 */     GL11.glPopMatrix();
/*  87 */     GL11.glEnable(2896);
/*     */   }
/*     */   
/*     */   private void c(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  91 */     GL11.glEnable(3042);
/*  92 */     GL11.glBlendFunc(770, 771);
/*     */     
/*  94 */     er er = this.a.e;
/*  95 */     er.b(er.a("%%/shadow.png"));
/*     */ 
/*     */     
/*  98 */     cj cj = b();
/*     */     
/* 100 */     GL11.glDepthMask(false);
/* 101 */     float f = this.b;
/*     */     
/* 103 */     double d1 = paramjx.aF + (paramjx.ah - paramjx.aF) * paramFloat2;
/* 104 */     double d2 = paramjx.aG + (paramjx.ai - paramjx.aG) * paramFloat2 + paramjx.h_();
/* 105 */     double d3 = paramjx.aH + (paramjx.aj - paramjx.aH) * paramFloat2;
/*     */     
/* 107 */     int i = ei.b(d1 - f);
/* 108 */     int j = ei.b(d1 + f);
/* 109 */     int k = ei.b(d2 - f);
/* 110 */     int m = ei.b(d2);
/* 111 */     int n = ei.b(d3 - f);
/* 112 */     int i1 = ei.b(d3 + f);
/*     */     
/* 114 */     double d4 = paramDouble1 - d1;
/* 115 */     double d5 = paramDouble2 - d2;
/* 116 */     double d6 = paramDouble3 - d3;
/*     */     
/* 118 */     he he = he.a;
/* 119 */     he.b();
/* 120 */     for (int i2 = i; i2 <= j; i2++) {
/* 121 */       for (int i3 = k; i3 <= m; i3++) {
/* 122 */         for (int i4 = n; i4 <= i1; i4++) {
/* 123 */           int i5 = cj.a(i2, i3 - 1, i4);
/* 124 */           if (i5 > 0 && cj.j(i2, i3, i4) > 3)
/* 125 */             a(ln.n[i5], paramDouble1, paramDouble2 + paramjx.h_(), paramDouble3, i2, i3, i4, paramFloat1, f, d4, d5 + paramjx.h_(), d6); 
/*     */         } 
/*     */       } 
/* 128 */     }  he.a();
/*     */     
/* 130 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 131 */     GL11.glDisable(3042);
/* 132 */     GL11.glDepthMask(true);
/*     */   }
/*     */   
/*     */   private cj b() {
/* 136 */     return this.a.g;
/*     */   }
/*     */   
/*     */   private void a(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 140 */     he he = he.a;
/* 141 */     if (!paramln.c())
/*     */       return; 
/* 143 */     double d1 = (paramFloat1 - (paramDouble2 - paramInt2 + paramDouble5) / 2.0D) * 0.5D * b().c(paramInt1, paramInt2, paramInt3);
/* 144 */     if (d1 < 0.0D)
/* 145 */       return;  if (d1 > 1.0D) d1 = 1.0D; 
/* 146 */     he.a(1.0F, 1.0F, 1.0F, (float)d1);
/*     */ 
/*     */     
/* 149 */     double d2 = paramInt1 + paramln.bd + paramDouble4;
/* 150 */     double d3 = paramInt1 + paramln.bg + paramDouble4;
/* 151 */     double d4 = paramInt2 + paramln.be + paramDouble5 + 0.015625D;
/* 152 */     double d5 = paramInt3 + paramln.bf + paramDouble6;
/* 153 */     double d6 = paramInt3 + paramln.bi + paramDouble6;
/*     */     
/* 155 */     float f1 = (float)((paramDouble1 - d2) / 2.0D / paramFloat2 + 0.5D);
/* 156 */     float f2 = (float)((paramDouble1 - d3) / 2.0D / paramFloat2 + 0.5D);
/* 157 */     float f3 = (float)((paramDouble3 - d5) / 2.0D / paramFloat2 + 0.5D);
/* 158 */     float f4 = (float)((paramDouble3 - d6) / 2.0D / paramFloat2 + 0.5D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     he.a(d2, d4, d5, f1, f3);
/* 166 */     he.a(d2, d4, d6, f1, f4);
/* 167 */     he.a(d3, d4, d6, f2, f4);
/* 168 */     he.a(d3, d4, d5, f2, f3);
/*     */   }
/*     */   
/*     */   public static void a(cb paramcb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 172 */     GL11.glDisable(3553);
/* 173 */     he he = he.a;
/* 174 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 175 */     he.b();
/* 176 */     he.b(paramDouble1, paramDouble2, paramDouble3);
/* 177 */     he.b(0.0F, 0.0F, -1.0F);
/* 178 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/* 179 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/* 180 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/* 181 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/*     */     
/* 183 */     he.b(0.0F, 0.0F, 1.0F);
/* 184 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/* 185 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/* 186 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/* 187 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/*     */     
/* 189 */     he.b(0.0F, -1.0F, 0.0F);
/* 190 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/* 191 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/* 192 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/* 193 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/*     */     
/* 195 */     he.b(0.0F, 1.0F, 0.0F);
/* 196 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/* 197 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/* 198 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/* 199 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/*     */     
/* 201 */     he.b(-1.0F, 0.0F, 0.0F);
/* 202 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/* 203 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/* 204 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/* 205 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/*     */     
/* 207 */     he.b(1.0F, 0.0F, 0.0F);
/* 208 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/* 209 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/* 210 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/* 211 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/* 212 */     he.b(0.0D, 0.0D, 0.0D);
/* 213 */     he.a();
/* 214 */     GL11.glEnable(3553);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(cb paramcb) {
/* 219 */     he he = he.a;
/* 220 */     he.b();
/* 221 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/* 222 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/* 223 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/* 224 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/* 225 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/* 226 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/* 227 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/* 228 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/* 229 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/* 230 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/* 231 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/* 232 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/* 233 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/* 234 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/* 235 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/* 236 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/* 237 */     he.a(paramcb.a, paramcb.b, paramcb.f);
/* 238 */     he.a(paramcb.a, paramcb.e, paramcb.f);
/* 239 */     he.a(paramcb.a, paramcb.e, paramcb.c);
/* 240 */     he.a(paramcb.a, paramcb.b, paramcb.c);
/* 241 */     he.a(paramcb.d, paramcb.b, paramcb.c);
/* 242 */     he.a(paramcb.d, paramcb.e, paramcb.c);
/* 243 */     he.a(paramcb.d, paramcb.e, paramcb.f);
/* 244 */     he.a(paramcb.d, paramcb.b, paramcb.f);
/* 245 */     he.a();
/*     */   }
/*     */   
/*     */   public void a(km paramkm) {
/* 249 */     this.a = paramkm;
/*     */   }
/*     */   
/*     */   public void b(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 253 */     if (this.a.k.i && this.b > 0.0F) {
/* 254 */       double d = this.a.a(paramjx.ah, paramjx.ai, paramjx.aj);
/* 255 */       float f = (float)((1.0D - d / 256.0D) * this.c);
/* 256 */       if (f > 0.0F) {
/* 257 */         c(paramjx, paramDouble1, paramDouble2, paramDouble3, f, paramFloat2);
/*     */       }
/*     */     } 
/* 260 */     if (paramjx.aQ > 0) a(paramjx, paramDouble1, paramDouble2, paramDouble3, paramFloat2);
/*     */   
/*     */   }
/*     */   
/*     */   public jt a() {
/* 265 */     return this.a.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ai.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */