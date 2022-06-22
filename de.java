/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class de
/*    */   extends ai
/*    */ {
/* 12 */   private ay d = new ay();
/*    */   
/*    */   public de() {
/* 15 */     this.b = 0.5F;
/*    */   }
/*    */   
/*    */   public void a(ex paramex, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 19 */     GL11.glPushMatrix();
/* 20 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 22 */     a("/terrain.png");
/* 23 */     ln ln = ln.n[paramex.a];
/*    */     
/* 25 */     cj cj = paramex.i();
/*    */     
/* 27 */     GL11.glDisable(2896);
/* 28 */     this.d.a(ln, cj, ei.b(paramex.ah), ei.b(paramex.ai), ei.b(paramex.aj));
/* 29 */     GL11.glEnable(2896);
/* 30 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\de.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */