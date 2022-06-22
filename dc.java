/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dc
/*    */   extends ln
/*    */ {
/*    */   public static boolean a = false;
/*    */   
/*    */   public dc(int paramInt1, int paramInt2) {
/* 13 */     super(paramInt1, paramInt2, fs.m);
/*    */   }
/*    */   
/*    */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     paramcj.h(paramInt1, paramInt2, paramInt3, this.ba);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 25 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 29 */     int i = paramInt1;
/* 30 */     int j = paramInt2;
/* 31 */     int k = paramInt3;
/* 32 */     if (a_(paramcj, i, j - 1, k) && j >= 0) {
/* 33 */       ex ex = new ex(paramcj, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.ba);
/* 34 */       if (a) {
/* 35 */         while (!ex.ax) {
/* 36 */           ex.e_();
/*    */         }
/*    */       } else {
/* 39 */         paramcj.a(ex);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public int a() {
/* 45 */     return 3;
/*    */   }
/*    */   
/*    */   public static boolean a_(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 49 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3);
/* 50 */     if (i == 0) return true; 
/* 51 */     if (i == ln.ar.ba) return true; 
/* 52 */     fs fs = (ln.n[i]).bl;
/* 53 */     if (fs == fs.f) return true; 
/* 54 */     if (fs == fs.g) return true; 
/* 55 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */