/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class in
/*    */   extends ef
/*    */ {
/*    */   public byte a;
/*    */   
/*    */   public in() {}
/*    */   
/*    */   public in(byte paramByte) {
/* 12 */     this.a = paramByte;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeByte(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readByte();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 1;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\in.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */