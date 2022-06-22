/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ld
/*     */   extends dy
/*     */ {
/*     */   private i k;
/*  14 */   private fy l = new lo(); private float m;
/*     */   
/*     */   public ld(fy paramfy, eo[] paramArrayOfeo) {
/*  17 */     this.f = true;
/*  18 */     this.k = new i(this, paramArrayOfeo);
/*     */     
/*  20 */     this.i.add(new io(this, this.k, this.l, 0, 144, 36));
/*     */     byte b;
/*  22 */     for (b = 0; b < 2; b++) {
/*  23 */       for (byte b1 = 0; b1 < 2; b1++) {
/*  24 */         this.i.add(new dl(this, this.k, b1 + b * 2, 88 + b1 * 18, 26 + b * 18));
/*     */       }
/*     */     } 
/*     */     
/*  28 */     for (b = 0; b < 4; b++) {
/*  29 */       byte b1 = b;
/*  30 */       this.i.add(new ky(this, this, paramfy, paramfy.a() - 1 - b, 8, 8 + b * 18, b1));
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
/*  44 */     for (b = 0; b < 3; b++) {
/*  45 */       for (byte b1 = 0; b1 < 9; b1++) {
/*  46 */         this.i.add(new dl(this, paramfy, b1 + (b + 1) * 9, 8 + b1 * 18, 84 + b * 18));
/*     */       }
/*     */     } 
/*  49 */     for (b = 0; b < 9; b++) {
/*  50 */       this.i.add(new dl(this, paramfy, b, 8 + b * 18, 142));
/*     */     }
/*     */     
/*  53 */     a(this.k);
/*     */   }
/*     */   private float n;
/*     */   public void a(fy paramfy) {
/*  57 */     int[] arrayOfInt = new int[9];
/*  58 */     for (byte b = 0; b < 3; b++) {
/*  59 */       for (byte b1 = 0; b1 < 3; b1++) {
/*  60 */         int j = -1;
/*  61 */         if (b < 2 && b1 < 2) {
/*  62 */           eo eo = this.k.a_(b + b1 * 2);
/*  63 */           if (eo != null) j = eo.c;
/*     */         
/*     */         } 
/*  66 */         arrayOfInt[b + b1 * 3] = j;
/*     */       } 
/*     */     } 
/*  69 */     this.l.a(0, dq.a().a(arrayOfInt));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void j() {
/*  74 */     this.g.b("Crafting", 86, 16, 16777215);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/*  80 */     super.a(paramInt1, paramInt2, paramFloat);
/*  81 */     this.m = paramInt1;
/*  82 */     this.n = paramInt2;
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat) {
/*  86 */     int j = this.b.n.a("/gui/inventory.png");
/*  87 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  88 */     this.b.n.b(j);
/*  89 */     int k = (this.c - this.a) / 2;
/*  90 */     int m = (this.d - this.h) / 2;
/*  91 */     b(k, m, 0, 0, this.a, this.h);
/*     */     
/*  93 */     GL11.glEnable(32826);
/*  94 */     GL11.glEnable(2903);
/*     */     
/*  96 */     GL11.glPushMatrix();
/*  97 */     GL11.glTranslatef((k + 51), (m + 75), 50.0F);
/*  98 */     float f1 = 30.0F;
/*  99 */     GL11.glScalef(-f1, f1, f1);
/* 100 */     GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*     */     
/* 102 */     float f2 = this.b.g.n;
/* 103 */     float f3 = this.b.g.an;
/* 104 */     float f4 = this.b.g.ao;
/*     */     
/* 106 */     float f5 = (k + 51) - this.m;
/* 107 */     float f6 = (m + 75 - 50) - this.n;
/*     */     
/* 109 */     GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
/* 110 */     j.b();
/* 111 */     GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/*     */     
/* 113 */     GL11.glRotatef(-((float)Math.atan((f6 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
/*     */     
/* 115 */     this.b.g.n = (float)Math.atan((f5 / 40.0F)) * 20.0F;
/* 116 */     this.b.g.an = (float)Math.atan((f5 / 40.0F)) * 40.0F;
/* 117 */     this.b.g.ao = -((float)Math.atan((f6 / 40.0F))) * 20.0F;
/* 118 */     GL11.glTranslatef(0.0F, this.b.g.ay, 0.0F);
/* 119 */     km.a.a(this.b.g, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
/* 120 */     this.b.g.n = f2;
/* 121 */     this.b.g.an = f3;
/* 122 */     this.b.g.ao = f4;
/* 123 */     GL11.glPopMatrix();
/* 124 */     j.a();
/* 125 */     GL11.glDisable(32826);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ld.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */