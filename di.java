/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ public class di
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   
/*    */   public di() {}
/*    */   
/*    */   public di(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 17 */     this.a = paramInt1;
/* 18 */     this.b = paramInt2;
/* 19 */     this.c = paramInt3;
/* 20 */     this.d = paramInt4;
/* 21 */     this.e = paramInt5;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 25 */     this.a = paramDataInputStream.readShort();
/* 26 */     this.b = paramDataInputStream.readInt();
/* 27 */     this.c = paramDataInputStream.read();
/* 28 */     this.d = paramDataInputStream.readInt();
/* 29 */     this.e = paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 33 */     paramDataOutputStream.writeShort(this.a);
/* 34 */     paramDataOutputStream.writeInt(this.b);
/* 35 */     paramDataOutputStream.write(this.c);
/* 36 */     paramDataOutputStream.writeInt(this.d);
/* 37 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 41 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 45 */     return 12;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\di.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */