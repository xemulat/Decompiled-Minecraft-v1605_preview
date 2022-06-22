/*    */ 
/*    */ 
/*    */ 
/*    */ public class bo
/*    */   extends dd
/*    */ {
/*    */   private ln[] aV;
/*  8 */   private float aW = 4.0F;
/*    */   private int aX;
/*    */   protected int a;
/*    */   
/*    */   public bo(int paramInt1, int paramInt2, int paramInt3, ln[] paramArrayOfln) {
/* 13 */     super(paramInt1);
/* 14 */     this.a = paramInt3;
/* 15 */     this.aV = paramArrayOfln;
/* 16 */     this.aR = 1;
/* 17 */     this.aS = 32 << paramInt3;
/* 18 */     if (paramInt3 == 3) this.aS *= 4; 
/* 19 */     this.aW = ((paramInt3 + 1) * 2);
/* 20 */     this.aX = paramInt2 + paramInt3;
/*    */   }
/*    */   
/*    */   public float a(eo parameo, ln paramln) {
/* 24 */     for (byte b = 0; b < this.aV.length; b++) {
/* 25 */       if (this.aV[b] == paramln) return this.aW; 
/* 26 */     }  return 1.0F;
/*    */   }
/*    */   
/*    */   public void a(eo parameo, fv paramfv) {
/* 30 */     parameo.b(2);
/*    */   }
/*    */   
/*    */   public void a(eo parameo, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 34 */     parameo.b(1);
/*    */   }
/*    */   
/*    */   public int a(jx paramjx) {
/* 38 */     return this.aX;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 42 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */