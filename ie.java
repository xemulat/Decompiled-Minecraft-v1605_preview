/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class ie
/*    */   extends ef
/*    */ {
/*    */   public int a;
/*    */   
/*    */   public ie() {}
/*    */   
/*    */   public ie(int paramInt) {
/* 12 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeInt(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readInt();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 3;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ie.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */