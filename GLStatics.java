/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GLStatics
/*    */ {
/*    */   public static void a() {
/* 14 */     GL11.glDisable(2896);
/* 15 */     GL11.glDisable(16384);
/* 16 */     GL11.glDisable(16385);
/* 17 */     GL11.glDisable(2903);
/*    */   }
/*    */   
/*    */   public static void b() {
/* 21 */     GL11.glEnable(2896);
/* 22 */     GL11.glEnable(16384);
/* 23 */     GL11.glEnable(16385);
/* 24 */     GL11.glEnable(2903);
/* 25 */     GL11.glColorMaterial(1032, 5634);
/*    */ 
/*    */ 
/*    */     
/* 29 */     ah ah1 = ah.b(0.20000000298023224D, 1.0D, -0.699999988079071D).b();
/* 30 */     GL11.glLight(16384, 4611, a(ah1.a, ah1.b, ah1.c, 0.0D));
/* 31 */     GL11.glLight(16384, 4609, a(0.6F, 0.6F, 0.6F, 1.0F));
/* 32 */     GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 33 */     GL11.glLight(16384, 4610, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 34 */     ah ah2 = ah.b(-0.20000000298023224D, 1.0D, 0.699999988079071D).b();
/* 35 */     GL11.glLight(16385, 4611, a(ah2.a, ah2.b, ah2.c, 0.0D));
/* 36 */     GL11.glLight(16385, 4609, a(0.6F, 0.6F, 0.6F, 1.0F));
/* 37 */     GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 38 */     GL11.glLight(16385, 4610, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 39 */     GL11.glShadeModel(7424);
/* 40 */     GL11.glLightModel(2899, a(0.4F, 0.4F, 0.4F, 1.0F));
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 44 */     return a((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4);
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 48 */     a.clear();
/* 49 */     a.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 50 */     a.flip();
/* 51 */     return a;
/*    */   }
/*    */ 
/*    */   
/* 55 */   private static FloatBuffer a = da.d(16);
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\GLStatics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */