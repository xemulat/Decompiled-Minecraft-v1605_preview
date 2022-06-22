/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hm
/*    */   extends ai
/*    */ {
/* 10 */   private ay d = new ay();
/*    */   
/*    */   public hm() {
/* 13 */     this.b = 0.5F;
/*    */   }
/*    */   
/*    */   public void a(iu paramiu, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 17 */     GL11.glPushMatrix();
/* 18 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 19 */     if (paramiu.a - paramFloat2 + 1.0F < 10.0F) {
/* 20 */       float f1 = 1.0F - (paramiu.a - paramFloat2 + 1.0F) / 10.0F;
/* 21 */       if (f1 < 0.0F) f1 = 0.0F; 
/* 22 */       if (f1 > 1.0F) f1 = 1.0F; 
/* 23 */       f1 *= f1;
/* 24 */       f1 *= f1;
/* 25 */       float f2 = 1.0F + f1 * 0.3F;
/* 26 */       GL11.glScalef(f2, f2, f2);
/*    */     } 
/*    */     
/* 29 */     float f = (1.0F - (paramiu.a - paramFloat2 + 1.0F) / 100.0F) * 0.8F;
/* 30 */     a("/terrain.png");
/* 31 */     this.d.a(ln.am);
/* 32 */     if (paramiu.a / 5 % 2 == 0) {
/* 33 */       GL11.glDisable(3553);
/* 34 */       GL11.glDisable(2896);
/* 35 */       GL11.glEnable(3042);
/* 36 */       GL11.glBlendFunc(770, 772);
/* 37 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
/* 38 */       this.d.a(ln.am);
/* 39 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 40 */       GL11.glDisable(3042);
/* 41 */       GL11.glEnable(2896);
/* 42 */       GL11.glEnable(3553);
/*    */     } 
/* 44 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */