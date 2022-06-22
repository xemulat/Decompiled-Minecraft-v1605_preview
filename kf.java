/*    */ 
/*    */ 
/*    */ 
/*    */ public class kf
/*    */   extends ms
/*    */ {
/*    */   public kf(cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  8 */     super(paramcj, paramDouble1, paramDouble2, paramDouble3);
/*  9 */     this.h = 0.04F;
/* 10 */     this.b++;
/* 11 */     if (paramDouble5 == 0.0D && (paramDouble4 != 0.0D || paramDouble6 != 0.0D)) {
/* 12 */       this.ak = paramDouble4;
/* 13 */       this.al = paramDouble5 + 0.1D;
/* 14 */       this.am = paramDouble6;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */