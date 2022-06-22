/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class ge
/*    */   extends ef
/*    */ {
/*    */   public long a;
/*    */   
/*    */   public ge() {}
/*    */   
/*    */   public ge(long paramLong) {
/* 12 */     this.a = paramLong;
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 16 */     paramDataOutput.writeLong(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 20 */     this.a = paramDataInput.readLong();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return 4;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 28 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ge.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */