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
/*    */ public class ks
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 22 */     this.a = paramDataInputStream.readShort();
/* 23 */     this.b = paramDataInputStream.readByte();
/* 24 */     this.c = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 28 */     paramDataOutputStream.writeShort(this.a);
/* 29 */     paramDataOutputStream.writeByte(this.b);
/* 30 */     paramDataOutputStream.writeShort(this.c);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 34 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 38 */     return 5;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */