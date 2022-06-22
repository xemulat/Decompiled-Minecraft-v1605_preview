/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ClassDo
/*    */   extends me
/*    */ {
/*    */   protected ClassDo(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1, paramInt2);
/*    */     
/* 12 */     a(0.099999994F, 0.0F, 0.099999994F, 0.9F, 0.8F, 0.9F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 17 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/* 18 */     if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) >= 9 && paramRandom.nextInt(5) == 0) {
/* 19 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 20 */       if (i < 15) {
/* 21 */         paramcj.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */       } else {
/*    */         ed ed;
/* 24 */         paramcj.a(paramInt1, paramInt2, paramInt3, 0);
/* 25 */         nm nm = new nm();
/* 26 */         if (paramRandom.nextInt(10) == 0) {
/* 27 */           ed = new ed();
/*    */         }
/* 29 */         if (!ed.a(paramcj, paramRandom, paramInt1, paramInt2, paramInt3))
/* 30 */           paramcj.a(paramInt1, paramInt2, paramInt3, this.ba); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ClassDo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */