/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bp
/*    */ {
/* 23 */   public float[][] a = new float[16][16];
/* 24 */   public float[] b = new float[16];
/* 25 */   public float[] c = new float[16];
/* 26 */   public float[] d = new float[16];
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 78 */     for (byte b = 0; b < 6; ) {
/*    */       
/* 80 */       if (this.a[b][0] * paramDouble1 + this.a[b][1] * paramDouble2 + this.a[b][2] * paramDouble3 + this.a[b][3] > 0.0D || 
/* 81 */         this.a[b][0] * paramDouble4 + this.a[b][1] * paramDouble2 + this.a[b][2] * paramDouble3 + this.a[b][3] > 0.0D || 
/* 82 */         this.a[b][0] * paramDouble1 + this.a[b][1] * paramDouble5 + this.a[b][2] * paramDouble3 + this.a[b][3] > 0.0D || 
/* 83 */         this.a[b][0] * paramDouble4 + this.a[b][1] * paramDouble5 + this.a[b][2] * paramDouble3 + this.a[b][3] > 0.0D || 
/* 84 */         this.a[b][0] * paramDouble1 + this.a[b][1] * paramDouble2 + this.a[b][2] * paramDouble6 + this.a[b][3] > 0.0D || 
/* 85 */         this.a[b][0] * paramDouble4 + this.a[b][1] * paramDouble2 + this.a[b][2] * paramDouble6 + this.a[b][3] > 0.0D || 
/* 86 */         this.a[b][0] * paramDouble1 + this.a[b][1] * paramDouble5 + this.a[b][2] * paramDouble6 + this.a[b][3] > 0.0D || 
/* 87 */         this.a[b][0] * paramDouble4 + this.a[b][1] * paramDouble5 + this.a[b][2] * paramDouble6 + this.a[b][3] > 0.0D) {
/*    */         b++; continue;
/* 89 */       }  return false;
/*    */     } 
/*    */     
/* 92 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */