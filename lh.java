/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class lh
/*    */   extends ef
/*    */ {
/*    */   public short a;
/*    */   
/*    */   public lh() {}
/*    */   
/*    */   public lh(short paramShort) {
/* 12 */     this.a = paramShort;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeShort(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readShort();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 2;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */