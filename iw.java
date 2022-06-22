/*    */ public class iw
/*    */   implements Comparable
/*    */ {
/*  4 */   private static long f = 0L;
/*    */   public int a;
/*    */   public int b;
/*  7 */   private long g = f++; public int c; public int d; public long e;
/*    */   
/*    */   public iw(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 10 */     this.a = paramInt1;
/* 11 */     this.b = paramInt2;
/* 12 */     this.c = paramInt3;
/* 13 */     this.d = paramInt4;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 17 */     if (paramObject instanceof iw) {
/* 18 */       iw iw1 = (iw)paramObject;
/* 19 */       return (this.a == iw1.a && this.b == iw1.b && this.c == iw1.c && this.d == iw1.d);
/*    */     } 
/* 21 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 25 */     return (this.a * 128 * 1024 + this.c * 128 + this.b) * 256 + this.d;
/*    */   }
/*    */   
/*    */   public iw a(long paramLong) {
/* 29 */     this.e = paramLong;
/* 30 */     return this;
/*    */   }
/*    */   
/*    */   public int a(iw paramiw) {
/* 34 */     if (this.e < paramiw.e) return -1; 
/* 35 */     if (this.e > paramiw.e) return 1; 
/* 36 */     if (this.g < paramiw.g) return -1; 
/* 37 */     if (this.g > paramiw.g) return 1; 
/* 38 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\iw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */