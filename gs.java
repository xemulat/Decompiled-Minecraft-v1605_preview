/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class gs
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   
/*    */   public gs(int paramInt1, int paramInt2) {
/* 16 */     this.a = paramInt1;
/* 17 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 21 */     if (paramObject instanceof gs) {
/* 22 */       gs gs1 = (gs)paramObject;
/* 23 */       return (this.a == gs1.a && this.b == gs1.b);
/*    */     } 
/* 25 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 30 */     return this.a << 16 ^ this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */