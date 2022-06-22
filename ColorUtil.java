/*    */ import mcextension_a1605.auth.PreviewAuth;
/*    */ 
/*    */ public class ColorUtil {
/*    */   public static float[] BlendColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*  5 */     float f4, f1 = 0.58431375F;
/*  6 */     float f2 = 0.0F;
/*  7 */     float f3 = 1.0F;
/*    */     
/*  9 */     if (PreviewAuth.rdMins <= 5) {
/* 10 */       long l = PreviewAuth.endtime - System.currentTimeMillis();
/* 11 */       f4 = (1.0F - (float)l / 300000.0F) / 2.0F;
/*    */     } else {
/* 13 */       f4 = 0.0F;
/*    */     } 
/* 15 */     float[] arrayOfFloat = new float[3];
/*    */     
/* 17 */     arrayOfFloat[0] = f4 * f1 + (1.0F - f4) * paramFloat2;
/* 18 */     arrayOfFloat[1] = f4 * f2 + (1.0F - f4) * paramFloat3;
/* 19 */     arrayOfFloat[2] = f4 * f3 + (1.0F - f4) * paramFloat4;
/* 20 */     return arrayOfFloat;
/*    */   }
/*    */   public static String timeRemaining() {
/* 23 */     long l1 = (PreviewAuth.endtime - System.currentTimeMillis()) / 1000L;
/* 24 */     long l2 = l1 % 60L;
/* 25 */     return (l1 / 60L) + ":" + ((l2 < 10L) ? "0" : "") + l2;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ColorUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */