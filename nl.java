/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nl
/*    */   extends dh
/*    */ {
/*    */   private float f;
/*    */   
/*    */   public nl(ff paramff, float paramFloat1, float paramFloat2) {
/* 11 */     super(paramff, paramFloat1 * paramFloat2);
/* 12 */     this.f = paramFloat2;
/*    */   }
/*    */   
/*    */   protected void a(hb paramhb, float paramFloat) {
/* 16 */     GL11.glScalef(this.f, this.f, this.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */