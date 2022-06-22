/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nw
/*    */   extends dh
/*    */ {
/*    */   public nw() {
/*  9 */     super(new jo(), 1.0F);
/* 10 */     a(new jo());
/*    */   }
/*    */   
/*    */   protected float a(at paramat) {
/* 14 */     return 180.0F;
/*    */   }
/*    */   
/*    */   protected boolean a(at paramat, int paramInt) {
/* 18 */     if (paramInt != 0) return false; 
/* 19 */     if (paramInt != 0) return false; 
/* 20 */     a("/mob/spider_eyes.png");
/* 21 */     float f = (1.0F - paramat.a(1.0F)) * 0.5F;
/* 22 */     GL11.glEnable(3042);
/* 23 */     GL11.glDisable(3008);
/* 24 */     GL11.glBlendFunc(770, 771);
/* 25 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */