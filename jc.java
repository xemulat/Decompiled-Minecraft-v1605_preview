/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jc
/*    */   extends ln
/*    */ {
/*    */   protected jc(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, fs.i);
/* 13 */     this.aZ = paramInt2;
/* 14 */     float f = 0.375F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/* 16 */     b(true);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 20 */     if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) == 0) {
/* 21 */       byte b = 1;
/* 22 */       while (paramcj.a(paramInt1, paramInt2 - b, paramInt3) == this.ba) {
/* 23 */         b++;
/*    */       }
/* 25 */       if (b < 3) {
/* 26 */         int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 27 */         if (i == 15) {
/* 28 */           paramcj.d(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/* 29 */           paramcj.b(paramInt1, paramInt2, paramInt3, 0);
/*    */         } else {
/* 31 */           paramcj.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 38 */     int i = paramcj.a(paramInt1, paramInt2 - 1, paramInt3);
/* 39 */     if (i == this.ba) return true; 
/* 40 */     if (i != ln.u.ba && i != ln.v.ba) return false; 
/* 41 */     if (paramcj.f(paramInt1 - 1, paramInt2 - 1, paramInt3) == fs.f) return true; 
/* 42 */     if (paramcj.f(paramInt1 + 1, paramInt2 - 1, paramInt3) == fs.f) return true; 
/* 43 */     if (paramcj.f(paramInt1, paramInt2 - 1, paramInt3 - 1) == fs.f) return true; 
/* 44 */     if (paramcj.f(paramInt1, paramInt2 - 1, paramInt3 + 1) == fs.f) return true; 
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 49 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected final void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 53 */     if (!g(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 54 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 55 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean g(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 60 */     return a(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 64 */     return null;
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 68 */     return dd.aH.aQ;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 76 */     return false;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 80 */     return false;
/*    */   }
/*    */   
/*    */   public int f() {
/* 84 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */