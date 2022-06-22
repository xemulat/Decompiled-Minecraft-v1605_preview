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
/*    */ public class jq
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public boolean c;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 20 */     this.a = paramDataInputStream.readInt();
/* 21 */     this.b = paramDataInputStream.readInt();
/* 22 */     this.c = (paramDataInputStream.read() != 0);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 26 */     paramDataOutputStream.writeInt(this.a);
/* 27 */     paramDataOutputStream.writeInt(this.b);
/* 28 */     paramDataOutputStream.write(this.c ? 1 : 0);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 32 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 36 */     return 9;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */