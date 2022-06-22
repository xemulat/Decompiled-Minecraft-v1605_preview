/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ec
/*    */   extends ai
/*    */ {
/*    */   public void a(al paramal, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 12 */     GL11.glPushMatrix();
/*    */     
/* 14 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 15 */     GL11.glEnable(32826);
/* 16 */     GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 17 */     int i = dd.aB.a((eo)null);
/* 18 */     a("/gui/items.png");
/* 19 */     he he = he.a;
/*    */     
/* 21 */     float f1 = (i % 16 * 16 + 0) / 256.0F;
/* 22 */     float f2 = (i % 16 * 16 + 16) / 256.0F;
/* 23 */     float f3 = (i / 16 * 16 + 0) / 256.0F;
/* 24 */     float f4 = (i / 16 * 16 + 16) / 256.0F;
/*    */ 
/*    */     
/* 27 */     float f5 = 1.0F;
/* 28 */     float f6 = 0.5F;
/* 29 */     float f7 = 0.25F;
/*    */ 
/*    */ 
/*    */     
/* 33 */     GL11.glRotatef(180.0F - this.a.i, 0.0F, 1.0F, 0.0F);
/* 34 */     GL11.glRotatef(-this.a.j, 1.0F, 0.0F, 0.0F);
/* 35 */     he.b();
/* 36 */     he.b(0.0F, 1.0F, 0.0F);
/* 37 */     he.a((0.0F - f6), (0.0F - f7), 0.0D, f1, f4);
/* 38 */     he.a((f5 - f6), (0.0F - f7), 0.0D, f2, f4);
/* 39 */     he.a((f5 - f6), (1.0F - f7), 0.0D, f2, f3);
/* 40 */     he.a((0.0F - f6), (1.0F - f7), 0.0D, f1, f3);
/* 41 */     he.a();
/*    */     
/* 43 */     GL11.glDisable(32826);
/* 44 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */