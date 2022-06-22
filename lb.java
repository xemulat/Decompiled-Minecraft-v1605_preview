/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lb
/*    */ {
/*  8 */   protected float j = 0.0F;
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 11 */     float f1 = (paramInt5 >> 24 & 0xFF) / 255.0F;
/* 12 */     float f2 = (paramInt5 >> 16 & 0xFF) / 255.0F;
/* 13 */     float f3 = (paramInt5 >> 8 & 0xFF) / 255.0F;
/* 14 */     float f4 = (paramInt5 & 0xFF) / 255.0F;
/* 15 */     he he = he.a;
/* 16 */     GL11.glEnable(3042);
/* 17 */     GL11.glDisable(3553);
/* 18 */     GL11.glBlendFunc(770, 771);
/* 19 */     GL11.glColor4f(f2, f3, f4, f1);
/* 20 */     he.b();
/* 21 */     he.a(paramInt1, paramInt4, 0.0D);
/* 22 */     he.a(paramInt3, paramInt4, 0.0D);
/* 23 */     he.a(paramInt3, paramInt2, 0.0D);
/* 24 */     he.a(paramInt1, paramInt2, 0.0D);
/* 25 */     he.a();
/* 26 */     GL11.glEnable(3553);
/* 27 */     GL11.glDisable(3042);
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 31 */     float f1 = (paramInt5 >> 24 & 0xFF) / 255.0F;
/* 32 */     float f2 = (paramInt5 >> 16 & 0xFF) / 255.0F;
/* 33 */     float f3 = (paramInt5 >> 8 & 0xFF) / 255.0F;
/* 34 */     float f4 = (paramInt5 & 0xFF) / 255.0F;
/*    */     
/* 36 */     float f5 = (paramInt6 >> 24 & 0xFF) / 255.0F;
/* 37 */     float f6 = (paramInt6 >> 16 & 0xFF) / 255.0F;
/* 38 */     float f7 = (paramInt6 >> 8 & 0xFF) / 255.0F;
/* 39 */     float f8 = (paramInt6 & 0xFF) / 255.0F;
/* 40 */     GL11.glDisable(3553);
/* 41 */     GL11.glEnable(3042);
/* 42 */     GL11.glDisable(3008);
/* 43 */     GL11.glBlendFunc(770, 771);
/* 44 */     GL11.glShadeModel(7425);
/*    */     
/* 46 */     he he = he.a;
/* 47 */     he.b();
/* 48 */     he.a(f2, f3, f4, f1);
/* 49 */     he.a(paramInt3, paramInt2, 0.0D);
/* 50 */     he.a(paramInt1, paramInt2, 0.0D);
/* 51 */     he.a(f6, f7, f8, f5);
/* 52 */     he.a(paramInt1, paramInt4, 0.0D);
/* 53 */     he.a(paramInt3, paramInt4, 0.0D);
/* 54 */     he.a();
/*    */     
/* 56 */     GL11.glShadeModel(7424);
/* 57 */     GL11.glDisable(3042);
/* 58 */     GL11.glEnable(3008);
/* 59 */     GL11.glEnable(3553);
/*    */   }
/*    */   
/*    */   public void a(jt paramjt, String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 63 */     paramjt.a(paramString, paramInt1 - paramjt.a(paramString) / 2, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void b(jt paramjt, String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 67 */     paramjt.a(paramString, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 71 */     float f1 = 0.00390625F;
/* 72 */     float f2 = 0.00390625F;
/* 73 */     he he = he.a;
/* 74 */     he.b();
/* 75 */     he.a((paramInt1 + 0), (paramInt2 + paramInt6), this.j, ((paramInt3 + 0) * f1), ((paramInt4 + paramInt6) * f2));
/* 76 */     he.a((paramInt1 + paramInt5), (paramInt2 + paramInt6), this.j, ((paramInt3 + paramInt5) * f1), ((paramInt4 + paramInt6) * f2));
/* 77 */     he.a((paramInt1 + paramInt5), (paramInt2 + 0), this.j, ((paramInt3 + paramInt5) * f1), ((paramInt4 + 0) * f2));
/* 78 */     he.a((paramInt1 + 0), (paramInt2 + 0), this.j, ((paramInt3 + 0) * f1), ((paramInt4 + 0) * f2));
/* 79 */     he.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */