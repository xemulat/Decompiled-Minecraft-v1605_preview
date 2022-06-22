/*    */ 
/*    */ 
/*    */ 
/*    */ public class ik
/*    */   extends dd
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public ik(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1);
/* 11 */     this.aR = 1;
/* 12 */     this.aS = 32 << paramInt2;
/* 13 */     if (paramInt2 == 3) this.aS *= 4;
/*    */     
/* 15 */     this.a = 4 + paramInt2 * 2;
/*    */   }
/*    */   
/*    */   public float a(eo parameo, ln paramln) {
/* 19 */     return 1.5F;
/*    */   }
/*    */   
/*    */   public void a(eo parameo, fv paramfv) {
/* 23 */     parameo.b(1);
/*    */   }
/*    */   
/*    */   public void a(eo parameo, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 27 */     parameo.b(2);
/*    */   }
/*    */   
/*    */   public int a(jx paramjx) {
/* 31 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 35 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ik.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */