/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class hf
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public String b;
/*    */   public String c;
/*    */   
/*    */   public hf() {}
/*    */   
/*    */   public hf(String paramString1, String paramString2, int paramInt) {
/* 14 */     this.b = paramString1;
/* 15 */     this.c = paramString2;
/* 16 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 20 */     this.a = paramDataInputStream.readInt();
/* 21 */     this.b = paramDataInputStream.readUTF();
/* 22 */     this.c = paramDataInputStream.readUTF();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 26 */     paramDataOutputStream.writeInt(this.a);
/* 27 */     paramDataOutputStream.writeUTF(this.b);
/* 28 */     paramDataOutputStream.writeUTF(this.c);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 32 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 36 */     return 4 + this.b.length() + this.c.length() + 4;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */