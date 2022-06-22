/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hd
/*    */   extends jf
/*    */ {
/*    */   protected hd(int paramInt, fs paramfs) {
/* 10 */     super(paramInt, paramfs);
/*    */     
/* 12 */     b(false);
/* 13 */     if (paramfs == fs.g) b(true);
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 21 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/* 22 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) == this.ba) {
/* 23 */       j(paramcj, paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   private void j(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 28 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 29 */     paramcj.h = true;
/* 30 */     paramcj.a(paramInt1, paramInt2, paramInt3, this.ba - 1, i);
/* 31 */     paramcj.b(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/* 32 */     paramcj.h(paramInt1, paramInt2, paramInt3, this.ba - 1);
/* 33 */     paramcj.h = false;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 37 */     if (this.bl == fs.g) {
/* 38 */       int i = paramRandom.nextInt(3);
/* 39 */       for (byte b = 0; b < i; b++) {
/* 40 */         paramInt1 += paramRandom.nextInt(3) - 1;
/* 41 */         paramInt2++;
/* 42 */         paramInt3 += paramRandom.nextInt(3) - 1;
/* 43 */         int j = paramcj.a(paramInt1, paramInt2, paramInt3);
/* 44 */         if (j == 0) {
/* 45 */           if (k(paramcj, paramInt1 - 1, paramInt2, paramInt3) || k(paramcj, paramInt1 + 1, paramInt2, paramInt3) || k(paramcj, paramInt1, paramInt2, paramInt3 - 1) || k(paramcj, paramInt1, paramInt2, paramInt3 + 1) || k(paramcj, paramInt1, paramInt2 - 1, paramInt3) || k(paramcj, paramInt1, paramInt2 + 1, paramInt3)) {
/* 46 */             paramcj.d(paramInt1, paramInt2, paramInt3, ln.ar.ba);
/*    */             return;
/*    */           } 
/* 49 */         } else if ((ln.n[j]).bl.c()) {
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean k(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 58 */     return paramcj.f(paramInt1, paramInt2, paramInt3).e();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */