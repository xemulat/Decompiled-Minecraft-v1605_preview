/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ 
/*    */ public class mr
/*    */   extends ef
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public mr() {}
/*    */   
/*    */   public mr(String paramString) {
/* 12 */     this.a = paramString;
/* 13 */     if (paramString == null) throw new IllegalArgumentException("Empty string not allowed"); 
/*    */   }
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 17 */     paramDataOutput.writeUTF(this.a);
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 21 */     this.a = paramDataInput.readUTF();
/*    */   }
/*    */   
/*    */   public byte a() {
/* 25 */     return 8;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 29 */     return "" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */