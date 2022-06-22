/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class j
/*    */ {
/* 10 */   private static FloatBuffer a = da.d(16);
/*    */   
/*    */   public static void a() {
/* 13 */     GL11.glDisable(2896);
/* 14 */     GL11.glDisable(16384);
/* 15 */     GL11.glDisable(16385);
/* 16 */     GL11.glDisable(2903);
/*    */   }
/*    */   
/*    */   public static void b() {
/* 20 */     GL11.glEnable(2896);
/* 21 */     GL11.glEnable(16384);
/* 22 */     GL11.glEnable(16385);
/* 23 */     GL11.glEnable(2903);
/* 24 */     GL11.glColorMaterial(1032, 5634);
/* 25 */     float f1 = 0.4F;
/* 26 */     float f2 = 0.6F;
/* 27 */     float f3 = 0.0F;
/*    */     
/* 29 */     ah ah = ah.b(0.20000000298023224D, 1.0D, -0.699999988079071D).b();
/* 30 */     GL11.glLight(16384, 4611, a(ah.a, ah.b, ah.c, 0.0D));
/* 31 */     GL11.glLight(16384, 4609, a(f2, f2, f2, 1.0F));
/* 32 */     GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 33 */     GL11.glLight(16384, 4610, a(f3, f3, f3, 1.0F));
/*    */     
/* 35 */     ah = ah.b(-0.20000000298023224D, 1.0D, 0.699999988079071D).b();
/* 36 */     GL11.glLight(16385, 4611, a(ah.a, ah.b, ah.c, 0.0D));
/* 37 */     GL11.glLight(16385, 4609, a(f2, f2, f2, 1.0F));
/* 38 */     GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 39 */     GL11.glLight(16385, 4610, a(f3, f3, f3, 1.0F));
/*    */     
/* 41 */     GL11.glShadeModel(7424);
/* 42 */     GL11.glLightModel(2899, a(f1, f1, f1, 1.0F));
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 46 */     return a((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4);
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 50 */     a.clear();
/* 51 */     a.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 52 */     a.flip();
/* 53 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */