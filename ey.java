/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ public class ey
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public ey() {}
/*    */   
/*    */   public ey(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 17 */     this.e = paramInt1;
/* 18 */     this.a = paramInt2;
/* 19 */     this.b = paramInt3;
/* 20 */     this.c = paramInt4;
/* 21 */     this.d = paramInt5;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 25 */     this.e = paramDataInputStream.read();
/* 26 */     this.a = paramDataInputStream.readInt();
/* 27 */     this.b = paramDataInputStream.read();
/* 28 */     this.c = paramDataInputStream.readInt();
/* 29 */     this.d = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 33 */     paramDataOutputStream.write(this.e);
/* 34 */     paramDataOutputStream.writeInt(this.a);
/* 35 */     paramDataOutputStream.write(this.b);
/* 36 */     paramDataOutputStream.writeInt(this.c);
/* 37 */     paramDataOutputStream.write(this.d);
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


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */