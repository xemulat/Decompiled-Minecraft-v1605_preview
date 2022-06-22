/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bn
/*    */   extends ln
/*    */ {
/*    */   protected bn(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, paramInt2, fs.n);
/*    */   }
/*    */   
/*    */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 15 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 16 */     float f = 0.125F;
/*    */     
/* 18 */     if (i == 2) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
/* 19 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
/* 20 */     if (i == 4) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 21 */     if (i == 5) a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*    */     
/* 23 */     return super.d(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public cb f(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 27 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 28 */     float f = 0.125F;
/*    */     
/* 30 */     if (i == 2) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
/* 31 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
/* 32 */     if (i == 4) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
/* 33 */     if (i == 5) a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*    */     
/* 35 */     return super.f(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 43 */     return false;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 47 */     return false;
/*    */   }
/*    */   
/*    */   public int f() {
/* 51 */     return 8;
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 55 */     if (paramcj.g(paramInt1 - 1, paramInt2, paramInt3))
/* 56 */       return true; 
/* 57 */     if (paramcj.g(paramInt1 + 1, paramInt2, paramInt3))
/* 58 */       return true; 
/* 59 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 - 1))
/* 60 */       return true; 
/* 61 */     if (paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) {
/* 62 */       return true;
/*    */     }
/* 64 */     return false;
/*    */   }
/*    */   
/*    */   public void d(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 68 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*    */     
/* 70 */     if ((i == 0 || paramInt4 == 2) && paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) i = 2; 
/* 71 */     if ((i == 0 || paramInt4 == 3) && paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) i = 3; 
/* 72 */     if ((i == 0 || paramInt4 == 4) && paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) i = 4; 
/* 73 */     if ((i == 0 || paramInt4 == 5) && paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) i = 5;
/*    */     
/* 75 */     paramcj.b(paramInt1, paramInt2, paramInt3, i);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 79 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 80 */     boolean bool = false;
/*    */     
/* 82 */     if (i == 2 && paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) bool = true; 
/* 83 */     if (i == 3 && paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) bool = true; 
/* 84 */     if (i == 4 && paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) bool = true; 
/* 85 */     if (i == 5 && paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) bool = true; 
/* 86 */     if (!bool) {
/* 87 */       b_(paramcj, paramInt1, paramInt2, paramInt3, i);
/* 88 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */     
/* 91 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom) {
/* 95 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */