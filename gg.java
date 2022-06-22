/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gg
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public String b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   public byte f;
/*    */   public byte g;
/*    */   public int h;
/*    */   
/*    */   public gg() {}
/*    */   
/*    */   public gg(dg paramdg) {
/* 21 */     this.a = paramdg.Z;
/* 22 */     this.b = paramdg.i;
/* 23 */     this.c = ei.b(paramdg.ah * 32.0D);
/* 24 */     this.d = ei.b(paramdg.ai * 32.0D);
/* 25 */     this.e = ei.b(paramdg.aj * 32.0D);
/* 26 */     this.f = (byte)(int)(paramdg.an * 256.0F / 360.0F);
/* 27 */     this.g = (byte)(int)(paramdg.ao * 256.0F / 360.0F);
/*    */     
/* 29 */     eo eo = paramdg.b.e();
/* 30 */     this.h = (eo == null) ? 0 : eo.c;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 34 */     this.a = paramDataInputStream.readInt();
/* 35 */     this.b = paramDataInputStream.readUTF();
/* 36 */     this.c = paramDataInputStream.readInt();
/* 37 */     this.d = paramDataInputStream.readInt();
/* 38 */     this.e = paramDataInputStream.readInt();
/* 39 */     this.f = paramDataInputStream.readByte();
/* 40 */     this.g = paramDataInputStream.readByte();
/* 41 */     this.h = paramDataInputStream.readShort();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 45 */     paramDataOutputStream.writeInt(this.a);
/* 46 */     paramDataOutputStream.writeUTF(this.b);
/* 47 */     paramDataOutputStream.writeInt(this.c);
/* 48 */     paramDataOutputStream.writeInt(this.d);
/* 49 */     paramDataOutputStream.writeInt(this.e);
/* 50 */     paramDataOutputStream.writeByte(this.f);
/* 51 */     paramDataOutputStream.writeByte(this.g);
/* 52 */     paramDataOutputStream.writeShort(this.h);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 56 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 60 */     return 28;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */