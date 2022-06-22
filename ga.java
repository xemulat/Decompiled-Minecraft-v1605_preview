/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ga
/*    */   extends ai
/*    */ {
/*    */   public void a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 12 */     GL11.glPushMatrix();
/* 13 */     a(paramjx.ar, paramDouble1 - paramjx.aF, paramDouble2 - paramjx.aG, paramDouble3 - paramjx.aH);
/* 14 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ga.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */