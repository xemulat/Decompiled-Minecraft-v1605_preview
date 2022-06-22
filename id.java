/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class id
/*    */   extends eq
/*    */ {
/* 10 */   private ja b = new ja();
/*    */ 
/*    */   
/*    */   public void a(nn paramnn, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/* 14 */     ln ln = paramnn.f();
/*    */ 
/*    */     
/* 17 */     GL11.glPushMatrix();
/* 18 */     float f1 = 0.6666667F;
/* 19 */     if (ln == ln.aD) {
/* 20 */       GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
/* 21 */       float f = (paramnn.e() * 360) / 16.0F;
/* 22 */       GL11.glRotatef(-f, 0.0F, 1.0F, 0.0F);
/* 23 */       this.b.b.h = true;
/*    */     } else {
/* 25 */       int i = paramnn.e();
/* 26 */       float f = 0.0F;
/*    */       
/* 28 */       if (i == 2) f = 180.0F; 
/* 29 */       if (i == 4) f = 90.0F; 
/* 30 */       if (i == 5) f = -90.0F;
/*    */       
/* 32 */       GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
/* 33 */       GL11.glRotatef(-f, 0.0F, 1.0F, 0.0F);
/* 34 */       GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
/*    */       
/* 36 */       this.b.b.h = false;
/*    */     } 
/*    */     
/* 39 */     a("/item/sign.png");
/*    */     
/* 41 */     GL11.glPushMatrix();
/*    */     
/* 43 */     GL11.glScalef(f1, -f1, -f1);
/* 44 */     this.b.a();
/* 45 */     GL11.glPopMatrix();
/* 46 */     jt jt = a();
/*    */     
/* 48 */     float f2 = 0.016666668F * f1;
/* 49 */     GL11.glTranslatef(0.0F, 0.5F * f1, 0.07F * f1);
/* 50 */     GL11.glScalef(f2, -f2, f2);
/* 51 */     GL11.glNormal3f(0.0F, 0.0F, -1.0F * f2);
/* 52 */     GL11.glDepthMask(false);
/*    */     
/* 54 */     boolean bool = false;
/* 55 */     for (byte b = 0; b < paramnn.a.length; b++) {
/* 56 */       String str = paramnn.a[b];
/* 57 */       if (b == paramnn.b) {
/* 58 */         str = "> " + str + " <";
/* 59 */         jt.b(str, -jt.a(str) / 2, b * 10 - paramnn.a.length * 5, bool);
/*    */       } else {
/* 61 */         jt.b(str, -jt.a(str) / 2, b * 10 - paramnn.a.length * 5, bool);
/*    */       } 
/*    */     } 
/* 64 */     GL11.glDepthMask(true);
/* 65 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 66 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\id.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */