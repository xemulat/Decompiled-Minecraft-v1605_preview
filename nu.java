/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nu
/*    */   extends ln
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public nu(int paramInt, boolean paramBoolean) {
/* 14 */     super(paramInt, 6, fs.d);
/* 15 */     this.a = paramBoolean;
/*    */     
/* 17 */     if (!paramBoolean)
/*    */     {
/* 19 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*    */     }
/* 21 */     d(255);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt) {
/* 26 */     if (paramInt <= 1) return 6; 
/* 27 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 32 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 37 */     if (this != ln.ak) {
/*    */       return;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 59 */     if (this != ln.ak) super.e(paramcj, paramInt1, paramInt2, paramInt3); 
/* 60 */     int i = paramcj.a(paramInt1, paramInt2 - 1, paramInt3);
/*    */     
/* 62 */     if (i == ak.ba) {
/*    */       
/* 64 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/* 65 */       paramcj.d(paramInt1, paramInt2 - 1, paramInt3, ln.aj.ba);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 71 */     return ln.ak.ba;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 76 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 81 */     if (this != ln.ak) super.c(parammz, paramInt1, paramInt2, paramInt3, paramInt4); 
/* 82 */     if (paramInt4 == 1) return true; 
/* 83 */     if (!super.c(parammz, paramInt1, paramInt2, paramInt3, paramInt4)) return false; 
/* 84 */     if (paramInt4 == 0) return true; 
/* 85 */     return (parammz.a(paramInt1, paramInt2, paramInt3) != this.ba);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */