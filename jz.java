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
/*    */ public class jz
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 31 */     this.a = paramDataInputStream.readInt();
/* 32 */     this.e = paramDataInputStream.readByte();
/* 33 */     this.b = paramDataInputStream.readInt();
/* 34 */     this.c = paramDataInputStream.readInt();
/* 35 */     this.d = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 39 */     paramDataOutputStream.writeInt(this.a);
/* 40 */     paramDataOutputStream.writeByte(this.e);
/* 41 */     paramDataOutputStream.writeInt(this.b);
/* 42 */     paramDataOutputStream.writeInt(this.c);
/* 43 */     paramDataOutputStream.writeInt(this.d);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 47 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 51 */     return 17;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */