/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class js
/*    */ {
/*    */   public double a;
/*    */   public double b;
/*    */   public double c;
/*    */   final ct d;
/*    */   
/*    */   public js(ct paramct, int paramInt1, int paramInt2) {
/* 13 */     this.d = paramct;
/* 14 */     double d = (10 + paramInt2) + ct.h.nextDouble() * 32.0D + paramInt1;
/* 15 */     this.b = d;
/* 16 */     this.a = d;
/*    */   }
/*    */   
/*    */   public void a() {
/* 20 */     this.b = this.a;
/* 21 */     if (this.a > 0.0D) {
/* 22 */       this.c -= 0.6D;
/*    */     }
/* 24 */     this.a += this.c;
/* 25 */     this.c *= 0.9D;
/* 26 */     if (this.a < 0.0D) {
/* 27 */       this.a = 0.0D;
/* 28 */       this.c = 0.0D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\js.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */