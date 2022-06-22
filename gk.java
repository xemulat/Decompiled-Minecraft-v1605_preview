/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class gk
/*    */   extends fd
/*    */ {
/*    */   public String a;
/*    */   
/*    */   public gk() {}
/*    */   
/*    */   public gk(String paramString) {
/* 12 */     this.a = paramString;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 16 */     this.a = paramDataInputStream.readUTF();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 20 */     paramDataOutputStream.writeUTF(this.a);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 24 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 28 */     return 4 + this.a.length() + 4;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */