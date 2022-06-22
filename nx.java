/*    */ 
/*    */ 
/*    */ public class nx
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public nx(int paramInt1, int paramInt2) {
/*  9 */     this.a = paramInt1;
/* 10 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 14 */     return this.a << 8 | this.b;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 18 */     nx nx1 = (nx)paramObject;
/* 19 */     return (nx1.a == this.a && nx1.b == this.b);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */