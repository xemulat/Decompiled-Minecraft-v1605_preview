/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class d
/*    */   extends dh
/*    */ {
/*    */   public d() {
/* 10 */     super(new eg(), 0.5F);
/*    */   }
/*    */   
/*    */   protected void a(cy paramcy, float paramFloat) {
/* 14 */     cy cy1 = paramcy;
/*    */     
/* 16 */     float f1 = cy1.b(paramFloat);
/*    */     
/* 18 */     float f2 = 1.0F + ei.a(f1 * 100.0F) * f1 * 0.01F;
/* 19 */     if (f1 < 0.0F) f1 = 0.0F; 
/* 20 */     if (f1 > 1.0F) f1 = 1.0F; 
/* 21 */     f1 *= f1;
/* 22 */     f1 *= f1;
/* 23 */     float f3 = (1.0F + f1 * 0.4F) * f2;
/* 24 */     float f4 = (1.0F + f1 * 0.1F) / f2;
/* 25 */     GL11.glScalef(f3, f4, f3);
/*    */   }
/*    */   
/*    */   protected int a(cy paramcy, float paramFloat1, float paramFloat2) {
/* 29 */     cy cy1 = paramcy;
/*    */     
/* 31 */     float f = cy1.b(paramFloat2);
/*    */     
/* 33 */     if ((int)(f * 10.0F) % 2 == 0) return 0;
/*    */     
/* 35 */     int i = (int)(f * 0.2F * 255.0F);
/* 36 */     if (i < 0) i = 0; 
/* 37 */     if (i > 255) i = 255;
/*    */     
/* 39 */     char c1 = 'ÿ';
/* 40 */     char c2 = 'ÿ';
/* 41 */     char c3 = 'ÿ';
/*    */     
/* 43 */     return i << 24 | c1 << 16 | c2 << 8 | c3;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */