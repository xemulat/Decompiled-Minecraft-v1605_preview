/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ public class gq
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public byte e;
/*    */   public byte f;
/*    */   public byte g;
/*    */   public int h;
/*    */   public int i;
/*    */   
/*    */   public gq() {}
/*    */   
/*    */   public gq(dr paramdr) {
/* 21 */     this.a = paramdr.Z;
/* 22 */     this.h = paramdr.a.c;
/* 23 */     this.i = paramdr.a.a;
/* 24 */     this.b = ei.b(paramdr.ah * 32.0D);
/* 25 */     this.c = ei.b(paramdr.ai * 32.0D);
/* 26 */     this.d = ei.b(paramdr.aj * 32.0D);
/* 27 */     this.e = (byte)(int)(paramdr.ak * 128.0D);
/* 28 */     this.f = (byte)(int)(paramdr.al * 128.0D);
/* 29 */     this.g = (byte)(int)(paramdr.am * 128.0D);
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 33 */     this.a = paramDataInputStream.readInt();
/* 34 */     this.h = paramDataInputStream.readShort();
/* 35 */     this.i = paramDataInputStream.readByte();
/* 36 */     this.b = paramDataInputStream.readInt();
/* 37 */     this.c = paramDataInputStream.readInt();
/* 38 */     this.d = paramDataInputStream.readInt();
/* 39 */     this.e = paramDataInputStream.readByte();
/* 40 */     this.f = paramDataInputStream.readByte();
/* 41 */     this.g = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 45 */     paramDataOutputStream.writeInt(this.a);
/* 46 */     paramDataOutputStream.writeShort(this.h);
/* 47 */     paramDataOutputStream.writeByte(this.i);
/* 48 */     paramDataOutputStream.writeInt(this.b);
/* 49 */     paramDataOutputStream.writeInt(this.c);
/* 50 */     paramDataOutputStream.writeInt(this.d);
/* 51 */     paramDataOutputStream.writeByte(this.e);
/* 52 */     paramDataOutputStream.writeByte(this.f);
/* 53 */     paramDataOutputStream.writeByte(this.g);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 57 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 61 */     return 22;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */