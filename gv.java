/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gv
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public gv() {}
/*    */   
/*    */   public gv(jx paramjx, int paramInt) {
/* 19 */     this.a = paramjx.Z;
/* 20 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 24 */     this.a = paramDataInputStream.readInt();
/* 25 */     this.b = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 29 */     paramDataOutputStream.writeInt(this.a);
/* 30 */     paramDataOutputStream.writeByte(this.b);
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


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */