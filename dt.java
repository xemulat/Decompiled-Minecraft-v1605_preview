/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ public class dt
/*    */   extends fd {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public dt() {}
/*    */   
/*    */   public dt(int paramInt1, int paramInt2) {
/* 12 */     this.a = paramInt1;
/* 13 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 17 */     this.a = paramDataInputStream.readInt();
/* 18 */     this.b = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 22 */     paramDataOutputStream.writeInt(this.a);
/* 23 */     paramDataOutputStream.writeShort(this.b);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 27 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 31 */     return 6;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */