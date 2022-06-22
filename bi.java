/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bi
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 17 */     this.a = paramDataInputStream.readInt();
/* 18 */     this.b = paramDataInputStream.readInt();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 22 */     paramDataOutputStream.writeInt(this.a);
/* 23 */     paramDataOutputStream.writeInt(this.b);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 27 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 31 */     return 8;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */