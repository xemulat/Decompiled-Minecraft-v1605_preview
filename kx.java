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
/*    */ public class kx
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 25 */     this.a = paramDataInputStream.readInt();
/* 26 */     this.b = paramDataInputStream.read();
/* 27 */     this.c = paramDataInputStream.readInt();
/* 28 */     this.d = paramDataInputStream.read();
/* 29 */     this.e = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 33 */     paramDataOutputStream.writeInt(this.a);
/* 34 */     paramDataOutputStream.write(this.b);
/* 35 */     paramDataOutputStream.writeInt(this.c);
/* 36 */     paramDataOutputStream.write(this.d);
/* 37 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 41 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 45 */     return 11;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */