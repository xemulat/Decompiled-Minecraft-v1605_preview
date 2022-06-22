/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gh
/*    */   extends dh
/*    */ {
/*    */   private ff f;
/*    */   
/*    */   public gh(ff paramff1, ff paramff2, float paramFloat) {
/* 12 */     super(paramff1, paramFloat);
/* 13 */     this.f = paramff2;
/*    */   }
/*    */   
/*    */   protected boolean a(lq paramlq, int paramInt) {
/* 17 */     if (paramInt == 0) {
/* 18 */       a(this.f);
/*    */       
/* 20 */       GL11.glEnable(2977);
/* 21 */       GL11.glEnable(3042);
/* 22 */       GL11.glBlendFunc(770, 771);
/*    */       
/* 24 */       return true;
/*    */     } 
/* 26 */     if (paramInt == 1) {
/* 27 */       GL11.glDisable(3042);
/* 28 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     } 
/* 30 */     return false;
/*    */   }
/*    */   
/*    */   protected void a(lq paramlq, float paramFloat) {
/* 34 */     float f1 = (paramlq.b + (paramlq.a - paramlq.b) * paramFloat) / (paramlq.c * 0.5F + 1.0F);
/* 35 */     float f2 = 1.0F / (f1 + 1.0F);
/* 36 */     float f3 = paramlq.c;
/* 37 */     GL11.glScalef(f2 * f3, 1.0F / f2 * f3, f2 * f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */