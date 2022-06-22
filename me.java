/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class me
/*    */   extends ln
/*    */ {
/*    */   protected me(int paramInt1, int paramInt2) {
/* 11 */     super(paramInt1, fs.i);
/* 12 */     this.aZ = paramInt2;
/* 13 */     b(true);
/* 14 */     float f = 0.2F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 19 */     return b(paramcj.a(paramInt1, paramInt2 - 1, paramInt3));
/*    */   }
/*    */   
/*    */   protected boolean b(int paramInt) {
/* 23 */     return (paramInt == ln.u.ba || paramInt == ln.v.ba || paramInt == ln.aA.ba);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 27 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/* 28 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 32 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected final void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 36 */     if (!g(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 37 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 38 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean g(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 43 */     return ((paramcj.j(paramInt1, paramInt2, paramInt3) >= 8 || paramcj.i(paramInt1, paramInt2, paramInt3)) && b(paramcj.a(paramInt1, paramInt2 - 1, paramInt3)));
/*    */   }
/*    */   
/*    */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 47 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 55 */     return false;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 59 */     return false;
/*    */   }
/*    */   
/*    */   public int f() {
/* 63 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\me.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */