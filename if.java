/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class if
/*     */ {
/*     */   private dx[] j;
/*     */   private la[] k;
/*     */   private int l;
/*     */   private int m;
/*     */   public float a;
/*     */   public float b;
/*     */   public float c;
/*     */   public float d;
/*     */   public float e;
/*     */   public float f;
/*     */   private boolean n = false;
/*  18 */   private int o = 0;
/*     */   
/*     */   public boolean g = false;
/*     */   public boolean h = true;
/*     */   public boolean i = false;
/*     */   
/*     */   public if(int paramInt1, int paramInt2) {
/*  25 */     this.l = paramInt1;
/*  26 */     this.m = paramInt2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3) {
/*  35 */     a(paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3, float paramFloat4) {
/*  39 */     this.j = new dx[8];
/*  40 */     this.k = new la[6];
/*     */     
/*  42 */     float f1 = paramFloat1 + paramInt1;
/*  43 */     float f2 = paramFloat2 + paramInt2;
/*  44 */     float f3 = paramFloat3 + paramInt3;
/*     */     
/*  46 */     paramFloat1 -= paramFloat4;
/*  47 */     paramFloat2 -= paramFloat4;
/*  48 */     paramFloat3 -= paramFloat4;
/*  49 */     f1 += paramFloat4;
/*  50 */     f2 += paramFloat4;
/*  51 */     f3 += paramFloat4;
/*     */     
/*  53 */     if (this.g) {
/*  54 */       float f = f1;
/*  55 */       f1 = paramFloat1;
/*  56 */       paramFloat1 = f;
/*     */     } 
/*     */     
/*  59 */     dx dx1 = new dx(paramFloat1, paramFloat2, paramFloat3, 0.0F, 0.0F);
/*  60 */     dx dx2 = new dx(f1, paramFloat2, paramFloat3, 0.0F, 8.0F);
/*  61 */     dx dx3 = new dx(f1, f2, paramFloat3, 8.0F, 8.0F);
/*  62 */     dx dx4 = new dx(paramFloat1, f2, paramFloat3, 8.0F, 0.0F);
/*     */     
/*  64 */     dx dx5 = new dx(paramFloat1, paramFloat2, f3, 0.0F, 0.0F);
/*  65 */     dx dx6 = new dx(f1, paramFloat2, f3, 0.0F, 8.0F);
/*  66 */     dx dx7 = new dx(f1, f2, f3, 8.0F, 8.0F);
/*  67 */     dx dx8 = new dx(paramFloat1, f2, f3, 8.0F, 0.0F);
/*     */     
/*  69 */     this.j[0] = dx1;
/*  70 */     this.j[1] = dx2;
/*  71 */     this.j[2] = dx3;
/*  72 */     this.j[3] = dx4;
/*  73 */     this.j[4] = dx5;
/*  74 */     this.j[5] = dx6;
/*  75 */     this.j[6] = dx7;
/*  76 */     this.j[7] = dx8;
/*     */     
/*  78 */     this.k[0] = new la(new dx[] { dx6, dx2, dx3, dx7 }, this.l + paramInt3 + paramInt1, this.m + paramInt3, this.l + paramInt3 + paramInt1 + paramInt3, this.m + paramInt3 + paramInt2);
/*  79 */     this.k[1] = new la(new dx[] { dx1, dx5, dx8, dx4 }, this.l + 0, this.m + paramInt3, this.l + paramInt3, this.m + paramInt3 + paramInt2);
/*     */ 
/*     */     
/*  82 */     this.k[2] = new la(new dx[] { dx6, dx5, dx1, dx2 }, this.l + paramInt3, this.m + 0, this.l + paramInt3 + paramInt1, this.m + paramInt3);
/*  83 */     this.k[3] = new la(new dx[] { dx3, dx4, dx8, dx7 }, this.l + paramInt3 + paramInt1, this.m + 0, this.l + paramInt3 + paramInt1 + paramInt1, this.m + paramInt3);
/*     */     
/*  85 */     this.k[4] = new la(new dx[] { dx2, dx1, dx4, dx3 }, this.l + paramInt3, this.m + paramInt3, this.l + paramInt3 + paramInt1, this.m + paramInt3 + paramInt2);
/*  86 */     this.k[5] = new la(new dx[] { dx5, dx6, dx7, dx8 }, this.l + paramInt3 + paramInt1 + paramInt3, this.m + paramInt3, this.l + paramInt3 + paramInt1 + paramInt3 + paramInt1, this.m + paramInt3 + paramInt2);
/*     */     
/*  88 */     if (this.g) {
/*  89 */       for (byte b = 0; b < this.k.length; b++) {
/*  90 */         this.k[b].a();
/*     */       }
/*     */     }
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
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 141 */     this.a = paramFloat1;
/* 142 */     this.b = paramFloat2;
/* 143 */     this.c = paramFloat3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 149 */     if (this.i)
/* 150 */       return;  if (!this.h)
/* 151 */       return;  if (!this.n) c(paramFloat);
/*     */     
/* 153 */     if (this.d != 0.0F || this.e != 0.0F || this.f != 0.0F) {
/* 154 */       GL11.glPushMatrix();
/* 155 */       GL11.glTranslatef(this.a * paramFloat, this.b * paramFloat, this.c * paramFloat);
/* 156 */       if (this.f != 0.0F) GL11.glRotatef(this.f * 57.295776F, 0.0F, 0.0F, 1.0F); 
/* 157 */       if (this.e != 0.0F) GL11.glRotatef(this.e * 57.295776F, 0.0F, 1.0F, 0.0F); 
/* 158 */       if (this.d != 0.0F) GL11.glRotatef(this.d * 57.295776F, 1.0F, 0.0F, 0.0F); 
/* 159 */       GL11.glCallList(this.o);
/* 160 */       GL11.glPopMatrix();
/* 161 */     } else if (this.a != 0.0F || this.b != 0.0F || this.c != 0.0F) {
/* 162 */       GL11.glTranslatef(this.a * paramFloat, this.b * paramFloat, this.c * paramFloat);
/* 163 */       GL11.glCallList(this.o);
/* 164 */       GL11.glTranslatef(-this.a * paramFloat, -this.b * paramFloat, -this.c * paramFloat);
/*     */     } else {
/* 166 */       GL11.glCallList(this.o);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 171 */     if (this.i)
/* 172 */       return;  if (!this.h)
/* 173 */       return;  if (!this.n) c(paramFloat);
/*     */     
/* 175 */     if (this.d != 0.0F || this.e != 0.0F || this.f != 0.0F) {
/* 176 */       GL11.glTranslatef(this.a * paramFloat, this.b * paramFloat, this.c * paramFloat);
/* 177 */       if (this.f != 0.0F) GL11.glRotatef(this.f * 57.295776F, 0.0F, 0.0F, 1.0F); 
/* 178 */       if (this.e != 0.0F) GL11.glRotatef(this.e * 57.295776F, 0.0F, 1.0F, 0.0F); 
/* 179 */       if (this.d != 0.0F) GL11.glRotatef(this.d * 57.295776F, 1.0F, 0.0F, 0.0F); 
/* 180 */     } else if (this.a != 0.0F || this.b != 0.0F || this.c != 0.0F) {
/* 181 */       GL11.glTranslatef(this.a * paramFloat, this.b * paramFloat, this.c * paramFloat);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(float paramFloat) {
/* 187 */     this.o = da.a(1);
/*     */ 
/*     */ 
/*     */     
/* 191 */     GL11.glNewList(this.o, 4864);
/* 192 */     he he = he.a;
/* 193 */     for (byte b = 0; b < this.k.length; b++) {
/* 194 */       this.k[b].a(he, paramFloat);
/*     */     }
/* 196 */     GL11.glEndList();
/*     */     
/* 198 */     this.n = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\if.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */