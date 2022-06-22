/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
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
/*    */ public class ke
/*    */   extends lf
/*    */ {
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 56 */     super.a(paramDataInputStream);
/* 57 */     this.b = paramDataInputStream.readByte();
/* 58 */     this.c = paramDataInputStream.readByte();
/* 59 */     this.d = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 63 */     super.a(paramDataOutputStream);
/* 64 */     paramDataOutputStream.writeByte(this.b);
/* 65 */     paramDataOutputStream.writeByte(this.c);
/* 66 */     paramDataOutputStream.writeByte(this.d);
/*    */   }
/*    */   
/*    */   public int a() {
/* 70 */     return 7;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ke.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */