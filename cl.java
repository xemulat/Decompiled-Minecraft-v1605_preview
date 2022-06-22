/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cl
/*    */   extends ai
/*    */ {
/* 13 */   protected ff d = new ch();
/*    */ 
/*    */   
/*    */   public void a(cx paramcx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 17 */     GL11.glPushMatrix();
/*    */     
/* 19 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 21 */     GL11.glRotatef(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/* 22 */     float f1 = paramcx.b - paramFloat2;
/* 23 */     float f2 = paramcx.a - paramFloat2;
/* 24 */     if (f2 < 0.0F) f2 = 0.0F; 
/* 25 */     if (f1 > 0.0F) {
/* 26 */       GL11.glRotatef(ei.a(f1) * f1 * f2 / 10.0F * paramcx.c, 1.0F, 0.0F, 0.0F);
/*    */     }
/*    */     
/* 29 */     a("/terrain.png");
/* 30 */     float f3 = 0.75F;
/* 31 */     GL11.glScalef(f3, f3, f3);
/*    */     
/* 33 */     GL11.glScalef(1.0F / f3, 1.0F / f3, 1.0F / f3);
/*    */     
/* 35 */     a("/item/boat.png");
/* 36 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*    */ 
/*    */     
/* 39 */     this.d.b(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/* 40 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */