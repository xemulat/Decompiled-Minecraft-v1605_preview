/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dh
/*     */   extends ai
/*     */ {
/*     */   protected ff d;
/*     */   protected ff e;
/*     */   
/*     */   public dh(ff paramff, float paramFloat) {
/*  17 */     this.d = paramff;
/*  18 */     this.b = paramFloat;
/*     */   }
/*     */   
/*     */   public void a(ff paramff) {
/*  22 */     this.e = paramff;
/*     */   }
/*     */   
/*     */   public void a(fv paramfv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  26 */     GL11.glPushMatrix();
/*  27 */     GL11.glDisable(2884);
/*     */     
/*  29 */     this.d.j = c(paramfv, paramFloat2);
/*  30 */     this.d.k = (paramfv.ac != null);
/*  31 */     if (this.e != null) this.e.k = this.d.k;
/*     */     
/*     */     try {
/*  34 */       float f1 = paramfv.o + (paramfv.n - paramfv.o) * paramFloat2;
/*  35 */       float f2 = paramfv.ap + (paramfv.an - paramfv.ap) * paramFloat2;
/*  36 */       float f3 = paramfv.aq + (paramfv.ao - paramfv.aq) * paramFloat2;
/*     */       
/*  38 */       GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
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
/*  55 */       float f4 = d(paramfv, paramFloat2);
/*  56 */       GL11.glRotatef(180.0F - f1, 0.0F, 1.0F, 0.0F);
/*  57 */       if (paramfv.I > 0) {
/*  58 */         float f = (paramfv.I + paramFloat2 - 1.0F) / 20.0F * 1.6F;
/*  59 */         f = ei.c(f);
/*  60 */         if (f > 1.0F) f = 1.0F; 
/*  61 */         GL11.glRotatef(f * a(paramfv), 0.0F, 0.0F, 1.0F);
/*     */       } 
/*     */       
/*  64 */       float f5 = 0.0625F;
/*  65 */       GL11.glEnable(32826);
/*  66 */       GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*     */       
/*  68 */       a(paramfv, paramFloat2);
/*  69 */       GL11.glTranslatef(0.0F, -24.0F * f5 - 0.0078125F, 0.0F);
/*     */ 
/*     */       
/*  72 */       float f6 = paramfv.P + (paramfv.Q - paramfv.P) * paramFloat2;
/*  73 */       float f7 = paramfv.R - paramfv.Q * (1.0F - paramFloat2);
/*     */       
/*  75 */       if (f6 > 1.0F) f6 = 1.0F;
/*     */       
/*  77 */       a(paramfv.aV, paramfv.v());
/*  78 */       GL11.glEnable(3008);
/*     */       
/*  80 */       this.d.b(f7, f6, f4, f2 - f1, f3, f5);
/*  81 */       for (byte b = 0; b < 4; b++) {
/*  82 */         if (a(paramfv, b)) {
/*  83 */           this.e.b(f7, f6, f4, f2 - f1, f3, f5);
/*  84 */           GL11.glDisable(3042);
/*  85 */           GL11.glEnable(3008);
/*     */         } 
/*     */       } 
/*     */       
/*  89 */       b(paramfv, paramFloat2);
/*  90 */       float f8 = paramfv.a(paramFloat2);
/*  91 */       int i = a(paramfv, f8, paramFloat2);
/*     */       
/*  93 */       if ((i >> 24 & 0xFF) > 0 || paramfv.F > 0 || paramfv.I > 0) {
/*  94 */         GL11.glDisable(3553);
/*  95 */         GL11.glDisable(3008);
/*  96 */         GL11.glEnable(3042);
/*  97 */         GL11.glBlendFunc(770, 771);
/*  98 */         GL11.glDepthFunc(514);
/*     */         
/* 100 */         if (paramfv.F > 0 || paramfv.I > 0) {
/* 101 */           GL11.glColor4f(f8, 0.0F, 0.0F, 0.4F);
/* 102 */           this.d.b(f7, f6, f4, f2 - f1, f3, f5);
/* 103 */           for (byte b1 = 0; b1 < 4; b1++) {
/* 104 */             if (a(paramfv, b1)) {
/* 105 */               GL11.glColor4f(f8, 0.0F, 0.0F, 0.4F);
/* 106 */               this.e.b(f7, f6, f4, f2 - f1, f3, f5);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 111 */         if ((i >> 24 & 0xFF) > 0) {
/* 112 */           float f9 = (i >> 16 & 0xFF) / 255.0F;
/* 113 */           float f10 = (i >> 8 & 0xFF) / 255.0F;
/* 114 */           float f11 = (i & 0xFF) / 255.0F;
/* 115 */           float f12 = (i >> 24 & 0xFF) / 255.0F;
/* 116 */           GL11.glColor4f(f9, f10, f11, f12);
/* 117 */           this.d.b(f7, f6, f4, f2 - f1, f3, f5);
/* 118 */           for (byte b1 = 0; b1 < 4; b1++) {
/* 119 */             if (a(paramfv, b1)) {
/* 120 */               GL11.glColor4f(f9, f10, f11, f12);
/* 121 */               this.e.b(f7, f6, f4, f2 - f1, f3, f5);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 126 */         GL11.glDepthFunc(515);
/* 127 */         GL11.glDisable(3042);
/* 128 */         GL11.glEnable(3008);
/* 129 */         GL11.glEnable(3553);
/*     */       } 
/* 131 */       GL11.glDisable(32826);
/* 132 */     } catch (Exception exception) {
/*     */       
/* 134 */       exception.printStackTrace();
/*     */     } 
/*     */     
/* 137 */     GL11.glEnable(2884);
/*     */     
/* 139 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   protected float c(fv paramfv, float paramFloat) {
/* 143 */     return paramfv.d(paramFloat);
/*     */   }
/*     */   
/*     */   protected float d(fv paramfv, float paramFloat) {
/* 147 */     return paramfv.aO + paramFloat;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fv paramfv, float paramFloat) {}
/*     */   
/*     */   protected boolean a(fv paramfv, int paramInt) {
/* 154 */     return false;
/*     */   }
/*     */   
/*     */   protected float a(fv paramfv) {
/* 158 */     return 90.0F;
/*     */   }
/*     */   
/*     */   protected int a(fv paramfv, float paramFloat1, float paramFloat2) {
/* 162 */     return 0;
/*     */   }
/*     */   
/*     */   protected void a(fv paramfv, float paramFloat) {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */