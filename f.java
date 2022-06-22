/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class f
/*    */   extends ef
/*    */ {
/*    */   public float a;
/*    */   
/*    */   public f() {}
/*    */   
/*    */   public f(float paramFloat) {
/* 12 */     this.a = paramFloat;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeFloat(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readFloat();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 5;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */