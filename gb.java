/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gb
/*    */   extends ai
/*    */ {
/*    */   public void a(jw paramjw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 13 */     a("/item/arrows.png");
/*    */     
/* 15 */     GL11.glPushMatrix();
/*    */     
/* 17 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 18 */     GL11.glRotatef(paramjw.ap + (paramjw.an - paramjw.ap) * paramFloat2 - 90.0F, 0.0F, 1.0F, 0.0F);
/* 19 */     GL11.glRotatef(paramjw.aq + (paramjw.ao - paramjw.aq) * paramFloat2, 0.0F, 0.0F, 1.0F);
/*    */     
/* 21 */     he he = he.a;
/* 22 */     byte b1 = 0;
/*    */     
/* 24 */     float f1 = 0.0F;
/* 25 */     float f2 = 0.5F;
/* 26 */     float f3 = (0 + b1 * 10) / 32.0F;
/* 27 */     float f4 = (5 + b1 * 10) / 32.0F;
/*    */     
/* 29 */     float f5 = 0.0F;
/* 30 */     float f6 = 0.15625F;
/* 31 */     float f7 = (5 + b1 * 10) / 32.0F;
/* 32 */     float f8 = (10 + b1 * 10) / 32.0F;
/* 33 */     float f9 = 0.05625F;
/* 34 */     GL11.glEnable(32826);
/* 35 */     float f10 = paramjw.a - paramFloat2;
/* 36 */     if (f10 > 0.0F) {
/*    */       
/* 38 */       float f = -ei.a(f10 * 3.0F) * f10;
/* 39 */       GL11.glRotatef(f, 0.0F, 0.0F, 1.0F);
/*    */     } 
/* 41 */     GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
/* 42 */     GL11.glScalef(f9, f9, f9);
/*    */     
/* 44 */     GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
/*    */     
/* 46 */     GL11.glNormal3f(f9, 0.0F, 0.0F);
/* 47 */     he.b();
/* 48 */     he.a(-7.0D, -2.0D, -2.0D, f5, f7);
/* 49 */     he.a(-7.0D, -2.0D, 2.0D, f6, f7);
/* 50 */     he.a(-7.0D, 2.0D, 2.0D, f6, f8);
/* 51 */     he.a(-7.0D, 2.0D, -2.0D, f5, f8);
/* 52 */     he.a();
/*    */     
/* 54 */     GL11.glNormal3f(-f9, 0.0F, 0.0F);
/* 55 */     he.b();
/* 56 */     he.a(-7.0D, 2.0D, -2.0D, f5, f7);
/* 57 */     he.a(-7.0D, 2.0D, 2.0D, f6, f7);
/* 58 */     he.a(-7.0D, -2.0D, 2.0D, f6, f8);
/* 59 */     he.a(-7.0D, -2.0D, -2.0D, f5, f8);
/* 60 */     he.a();
/*    */     
/* 62 */     for (byte b2 = 0; b2 < 4; b2++) {
/*    */       
/* 64 */       GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 65 */       GL11.glNormal3f(0.0F, 0.0F, f9);
/* 66 */       he.b();
/* 67 */       he.a(-8.0D, -2.0D, 0.0D, f1, f3);
/* 68 */       he.a(8.0D, -2.0D, 0.0D, f2, f3);
/* 69 */       he.a(8.0D, 2.0D, 0.0D, f2, f4);
/* 70 */       he.a(-8.0D, 2.0D, 0.0D, f1, f4);
/* 71 */       he.a();
/*    */     } 
/*    */     
/* 74 */     GL11.glDisable(32826);
/* 75 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */