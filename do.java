/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class do
/*    */   extends me
/*    */ {
/*    */   protected do(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2);
/*    */     
/* 12 */     float f = 0.4F;
/* 13 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 17 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/*    */     
/* 19 */     if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) >= 9 && 
/* 20 */       paramRandom.nextInt(5) == 0) {
/* 21 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 22 */       if (i < 15) {
/* 23 */         paramcj.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */       } else {
/* 25 */         ed ed; paramcj.a(paramInt1, paramInt2, paramInt3, 0);
/* 26 */         nm nm = new nm();
/* 27 */         if (paramRandom.nextInt(10) == 0) {
/* 28 */           ed = new ed();
/*    */         }
/* 30 */         if (!ed.a(paramcj, paramRandom, paramInt1, paramInt2, paramInt3))
/* 31 */           paramcj.a(paramInt1, paramInt2, paramInt3, this.ba); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\do.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */