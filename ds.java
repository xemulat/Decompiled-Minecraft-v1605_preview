/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class ds
/*    */   extends ef {
/*    */   public byte[] a;
/*    */   
/*    */   public ds() {}
/*    */   
/*    */   public ds(byte[] paramArrayOfbyte) {
/* 11 */     this.a = paramArrayOfbyte;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 15 */     paramDataOutput.writeInt(this.a.length);
/* 16 */     paramDataOutput.write(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     int i = paramDataInput.readInt();
/* 21 */     this.a = new byte[i];
/* 22 */     paramDataInput.readFully(this.a);
/*    */   }
/*    */   
/*    */   public byte a() {
/* 26 */     return 7;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 30 */     return "[" + this.a.length + " bytes]";
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ds.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */