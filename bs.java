/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bs
/*     */   extends ai
/*     */ {
/*  15 */   private Random d = new Random();
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  20 */     a_lt((it)paramjx, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   public void a_lt(it paramit, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  24 */     this.d.setSeed(187L);
/*  25 */     GL11.glPushMatrix();
/*  26 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*  27 */     GL11.glRotatef(paramFloat1, 0.0F, 1.0F, 0.0F);
/*  28 */     GL11.glEnable(32826);
/*  29 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
/*  30 */     int i = Integer.parseInt(simpleDateFormat.format(Calendar.getInstance().getTime()));
/*  31 */     a((i > 22 || i < 5) ? "/art/zz.png" : "/art/kz.png");
/*  32 */     el el = paramit.b;
/*     */     
/*  34 */     GL11.glScalef(0.0625F, 0.0625F, 0.0625F);
/*  35 */     a(paramit, el.u, el.v, el.w, el.x);
/*  36 */     GL11.glDisable(32826);
/*  37 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   private void a(it paramit, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  41 */     float f1 = -paramInt1 / 2.0F;
/*  42 */     float f2 = -paramInt2 / 2.0F;
/*     */ 
/*     */     
/*  45 */     for (byte b = 0; b < paramInt1 / 16; b++) {
/*  46 */       for (byte b1 = 0; b1 < paramInt2 / 16; b1++) {
/*  47 */         float f3 = f1 + ((b + 1) * 16);
/*  48 */         float f4 = f1 + (b * 16);
/*  49 */         float f5 = f2 + ((b1 + 1) * 16);
/*  50 */         float f6 = f2 + (b1 * 16);
/*  51 */         a(paramit, (f3 + f4) / 2.0F, (f5 + f6) / 2.0F);
/*  52 */         float f7 = (paramInt3 + paramInt1 - b * 16) / 256.0F;
/*  53 */         float f8 = (paramInt3 + paramInt1 - (b + 1) * 16) / 256.0F;
/*  54 */         float f9 = (paramInt4 + paramInt2 - b1 * 16) / 256.0F;
/*  55 */         float f10 = (paramInt4 + paramInt2 - (b1 + 1) * 16) / 256.0F;
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
/*  68 */         he he = he.a;
/*  69 */         he.b();
/*  70 */         he.b(0.0F, 0.0F, -1.0F);
/*  71 */         he.a(f3, f6, -0.5D, f8, f9);
/*  72 */         he.a(f4, f6, -0.5D, f7, f9);
/*  73 */         he.a(f4, f5, -0.5D, f7, f10);
/*  74 */         he.a(f3, f5, -0.5D, f8, f10);
/*  75 */         he.b(0.0F, 0.0F, 1.0F);
/*  76 */         he.a(f3, f5, 0.5D, 0.75D, 0.0D);
/*  77 */         he.a(f4, f5, 0.5D, 0.8125D, 0.0D);
/*  78 */         he.a(f4, f6, 0.5D, 0.8125D, 0.0625D);
/*  79 */         he.a(f3, f6, 0.5D, 0.75D, 0.0625D);
/*  80 */         he.b(0.0F, -1.0F, 0.0F);
/*  81 */         he.a(f3, f5, -0.5D, 0.75D, 0.001953125D);
/*  82 */         he.a(f4, f5, -0.5D, 0.8125D, 0.001953125D);
/*  83 */         he.a(f4, f5, 0.5D, 0.8125D, 0.001953125D);
/*  84 */         he.a(f3, f5, 0.5D, 0.75D, 0.001953125D);
/*  85 */         he.b(0.0F, 1.0F, 0.0F);
/*  86 */         he.a(f3, f6, 0.5D, 0.75D, 0.001953125D);
/*  87 */         he.a(f4, f6, 0.5D, 0.8125D, 0.001953125D);
/*  88 */         he.a(f4, f6, -0.5D, 0.8125D, 0.001953125D);
/*  89 */         he.a(f3, f6, -0.5D, 0.75D, 0.001953125D);
/*  90 */         he.b(-1.0F, 0.0F, 0.0F);
/*  91 */         he.a(f3, f5, 0.5D, 0.751953125D, 0.0D);
/*  92 */         he.a(f3, f6, 0.5D, 0.751953125D, 0.0625D);
/*  93 */         he.a(f3, f6, -0.5D, 0.751953125D, 0.0625D);
/*  94 */         he.a(f3, f5, -0.5D, 0.751953125D, 0.0D);
/*  95 */         he.b(1.0F, 0.0F, 0.0F);
/*  96 */         he.a(f4, f5, -0.5D, 0.751953125D, 0.0D);
/*  97 */         he.a(f4, f6, -0.5D, 0.751953125D, 0.0625D);
/*  98 */         he.a(f4, f6, 0.5D, 0.751953125D, 0.0625D);
/*  99 */         he.a(f4, f5, 0.5D, 0.751953125D, 0.0D);
/* 100 */         he.a();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(it paramit, float paramFloat1, float paramFloat2) {
/* 106 */     int i = ei.b(paramit.ah);
/* 107 */     int j = ei.b(paramit.ai + (paramFloat2 / 16.0F));
/* 108 */     int k = ei.b(paramit.aj);
/* 109 */     if (paramit.a == 0) {
/* 110 */       i = ei.b(paramit.ah + (paramFloat1 / 16.0F));
/*     */     }
/* 112 */     if (paramit.a == 1) {
/* 113 */       k = ei.b(paramit.aj - (paramFloat1 / 16.0F));
/*     */     }
/* 115 */     if (paramit.a == 2) {
/* 116 */       i = ei.b(paramit.ah - (paramFloat1 / 16.0F));
/*     */     }
/* 118 */     if (paramit.a == 3) {
/* 119 */       k = ei.b(paramit.aj + (paramFloat1 / 16.0F));
/*     */     }
/* 121 */     float f = this.a.g.c(i, j, k);
/* 122 */     GL11.glColor3f(f, f, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bs.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */