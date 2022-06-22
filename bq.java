/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bq
/*     */   extends dh
/*     */ {
/*     */   private cn f;
/*     */   private cn g;
/*     */   private cn h;
/*     */   
/*     */   public bq() {
/*  18 */     super(new cn(0.0F), 0.5F);
/*     */     
/*  20 */     this.f = (cn)this.d;
/*     */     
/*  22 */     this.g = new cn(1.0F);
/*  23 */     this.h = new cn(0.5F);
/*     */   }
/*     */   
/*  26 */   private static final String[] i = new String[] { "cloth", "chain", "iron", "diamond", "gold" };
/*     */   
/*     */   protected boolean a(dg paramdg, int paramInt) {
/*  29 */     eo eo = paramdg.b.d(3 - paramInt);
/*  30 */     if (eo != null) {
/*  31 */       dd dd = eo.a();
/*  32 */       if (dd instanceof mf) {
/*  33 */         mf mf = (mf)dd;
/*  34 */         a("/armor/" + i[mf.aX] + "_" + ((paramInt == 2) ? 2 : 1) + ".png");
/*     */         
/*  36 */         cn cn1 = (paramInt == 2) ? this.h : this.g;
/*     */         
/*  38 */         cn1.a.h = (paramInt == 0);
/*  39 */         cn1.b.h = (paramInt == 0);
/*  40 */         cn1.c.h = (paramInt == 1 || paramInt == 2);
/*  41 */         cn1.d.h = (paramInt == 1);
/*  42 */         cn1.e.h = (paramInt == 1);
/*  43 */         cn1.f.h = (paramInt == 2 || paramInt == 3);
/*  44 */         cn1.g.h = (paramInt == 2 || paramInt == 3);
/*     */         
/*  46 */         a(cn1);
/*  47 */         return true;
/*     */       } 
/*     */     } 
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
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dg paramdg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  69 */     eo eo = paramdg.b.e();
/*  70 */     cn cn1 = (cn)this.d;
/*  71 */     cn1.i = (eo != null);
/*  72 */     super.a(paramdg, paramDouble1, paramDouble2 - paramdg.ay, paramDouble3, paramFloat1, paramFloat2);
/*  73 */     cn1.i = false;
/*     */ 
/*     */ 
/*     */     
/*  77 */     jt jt = a();
/*  78 */     float f1 = 1.6F;
/*  79 */     float f2 = 0.016666668F * f1;
/*  80 */     GL11.glPushMatrix();
/*  81 */     GL11.glTranslatef((float)paramDouble1 + 0.0F, (float)paramDouble2 + 2.3F, (float)paramDouble3);
/*  82 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/*     */     
/*  84 */     GL11.glRotatef(-this.a.i, 0.0F, 1.0F, 0.0F);
/*  85 */     GL11.glRotatef(this.a.j, 1.0F, 0.0F, 0.0F);
/*     */     
/*  87 */     float f3 = paramdg.d(this.a.h);
/*  88 */     f2 = (float)(f2 * Math.sqrt(f3) / 2.0D);
/*  89 */     GL11.glScalef(-f2, -f2, f2);
/*  90 */     String str = paramdg.i;
/*  91 */     GL11.glDisable(2896);
/*  92 */     GL11.glDepthMask(false);
/*  93 */     GL11.glDisable(2929);
/*  94 */     GL11.glEnable(3042);
/*  95 */     GL11.glBlendFunc(770, 771);
/*  96 */     he he = he.a;
/*     */     
/*  98 */     GL11.glDisable(3553);
/*  99 */     he.b();
/* 100 */     int i = jt.a(str) / 2;
/* 101 */     he.a(0.0F, 0.0F, 0.0F, 0.25F);
/* 102 */     he.a((-i - 1), -1.0D, 0.0D);
/* 103 */     he.a((-i - 1), 8.0D, 0.0D);
/* 104 */     he.a((i + 1), 8.0D, 0.0D);
/* 105 */     he.a((i + 1), -1.0D, 0.0D);
/* 106 */     he.a();
/* 107 */     GL11.glEnable(3553);
/* 108 */     jt.b(str, -jt.a(str) / 2, 0, 553648127);
/* 109 */     GL11.glEnable(2929);
/* 110 */     GL11.glDepthMask(true);
/* 111 */     jt.b(str, -jt.a(str) / 2, 0, -1);
/* 112 */     GL11.glEnable(2896);
/* 113 */     GL11.glDisable(3042);
/* 114 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 115 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(dg paramdg, float paramFloat) {
/* 121 */     eo eo = paramdg.b.e();
/*     */     
/* 123 */     if (eo != null) {
/* 124 */       GL11.glPushMatrix();
/* 125 */       this.f.d.b(0.0625F);
/* 126 */       GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
/*     */       
/* 128 */       if (eo.c < 256 && ay.a(ln.n[eo.c].f())) {
/* 129 */         float f = 0.5F;
/* 130 */         GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 131 */         f *= 0.75F;
/* 132 */         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 133 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 134 */         GL11.glScalef(f, -f, f);
/* 135 */       } else if (dd.c[eo.c].a()) {
/* 136 */         float f = 0.625F;
/* 137 */         GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
/* 138 */         GL11.glScalef(f, -f, f);
/* 139 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 140 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       } else {
/* 142 */         float f = 0.375F;
/* 143 */         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
/* 144 */         GL11.glScalef(f, f, f);
/* 145 */         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/* 146 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 147 */         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
/*     */       } 
/*     */ 
/*     */       
/* 151 */       this.a.f.a(eo);
/* 152 */       GL11.glPopMatrix();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(dg paramdg, float paramFloat) {
/* 157 */     float f = 0.9375F;
/* 158 */     GL11.glScalef(f, f, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 163 */     this.f.j = 0.0F;
/* 164 */     this.f.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
/* 165 */     this.f.d.a(0.0625F);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */