/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class q
/*    */   extends eq
/*    */ {
/* 12 */   private Map b = new HashMap<Object, Object>();
/*    */ 
/*    */   
/*    */   public void a(ba paramba, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/* 16 */     GL11.glPushMatrix();
/* 17 */     GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2, (float)paramDouble3 + 0.5F);
/*    */     
/* 19 */     jx jx = (jx)this.b.get(paramba.b);
/* 20 */     if (jx == null) {
/* 21 */       jx = ep.a(paramba.b, (cj)null);
/* 22 */       this.b.put(paramba.b, jx);
/*    */     } 
/* 24 */     if (jx != null) {
/* 25 */       jx.a(paramba.e);
/* 26 */       float f = 0.4375F;
/* 27 */       GL11.glTranslatef(0.0F, 0.4F, 0.0F);
/* 28 */       GL11.glRotatef((float)(paramba.d + (paramba.c - paramba.d) * paramFloat) * 10.0F, 0.0F, 1.0F, 0.0F);
/* 29 */       GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
/* 30 */       GL11.glTranslatef(0.0F, -0.4F, 0.0F);
/* 31 */       GL11.glScalef(f, f, f);
/* 32 */       jx.c(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
/* 33 */       km.a.a(jx, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat);
/*    */     } 
/* 35 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */