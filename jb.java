/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ 
/*    */ 
/*    */ public class jb
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public byte e;
/*    */   public byte f;
/*    */   
/*    */   public jb() {}
/*    */   
/*    */   public jb(jx paramjx) {
/* 18 */     this.a = paramjx.Z;
/* 19 */     this.b = ei.b(paramjx.ah * 32.0D);
/* 20 */     this.c = ei.b(paramjx.ai * 32.0D);
/* 21 */     this.d = ei.b(paramjx.aj * 32.0D);
/* 22 */     this.e = (byte)(int)(paramjx.an * 256.0F / 360.0F);
/* 23 */     this.f = (byte)(int)(paramjx.ao * 256.0F / 360.0F);
/*    */   }
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
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 36 */     this.a = paramDataInputStream.readInt();
/* 37 */     this.b = paramDataInputStream.readInt();
/* 38 */     this.c = paramDataInputStream.readInt();
/* 39 */     this.d = paramDataInputStream.readInt();
/* 40 */     this.e = (byte)paramDataInputStream.read();
/* 41 */     this.f = (byte)paramDataInputStream.read();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 45 */     paramDataOutputStream.writeInt(this.a);
/* 46 */     paramDataOutputStream.writeInt(this.b);
/* 47 */     paramDataOutputStream.writeInt(this.c);
/* 48 */     paramDataOutputStream.writeInt(this.d);
/* 49 */     paramDataOutputStream.write(this.e);
/* 50 */     paramDataOutputStream.write(this.f);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 54 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 58 */     return 34;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */