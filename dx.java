/*    */ 
/*    */ 
/*    */ 
/*    */ public class dx
/*    */ {
/*    */   public ah a;
/*    */   public float b;
/*    */   public float c;
/*    */   
/*    */   public dx(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/* 11 */     this(ah.a(paramFloat1, paramFloat2, paramFloat3), paramFloat4, paramFloat5);
/*    */   }
/*    */   
/*    */   public dx a(float paramFloat1, float paramFloat2) {
/* 15 */     return new dx(this, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   public dx(dx paramdx, float paramFloat1, float paramFloat2) {
/* 19 */     this.a = paramdx.a;
/* 20 */     this.b = paramFloat1;
/* 21 */     this.c = paramFloat2;
/*    */   }
/*    */   
/*    */   public dx(ah paramah, float paramFloat1, float paramFloat2) {
/* 25 */     this.a = paramah;
/* 26 */     this.b = paramFloat1;
/* 27 */     this.c = paramFloat2;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */