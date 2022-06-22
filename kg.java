/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class kg
/*    */   extends ef
/*    */ {
/*    */   public double a;
/*    */   
/*    */   public kg() {}
/*    */   
/*    */   public kg(double paramDouble) {
/* 12 */     this.a = paramDouble;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeDouble(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readDouble();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 6;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */