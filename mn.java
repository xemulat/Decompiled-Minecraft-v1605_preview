/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mn
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public short[] c;
/*    */   public byte[] d;
/*    */   public byte[] e;
/*    */   public int f;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 40 */     this.a = paramDataInputStream.readInt();
/* 41 */     this.b = paramDataInputStream.readInt();
/*    */     
/* 43 */     this.f = paramDataInputStream.readShort() & 0xFFFF;
/* 44 */     this.c = new short[this.f];
/* 45 */     this.d = new byte[this.f];
/* 46 */     this.e = new byte[this.f];
/* 47 */     for (byte b = 0; b < this.f; b++) {
/* 48 */       this.c[b] = paramDataInputStream.readShort();
/*    */     }
/* 50 */     paramDataInputStream.readFully(this.d);
/* 51 */     paramDataInputStream.readFully(this.e);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 55 */     paramDataOutputStream.writeInt(this.a);
/* 56 */     paramDataOutputStream.writeInt(this.b);
/* 57 */     paramDataOutputStream.writeShort((short)this.f);
/* 58 */     for (byte b = 0; b < this.f; b++) {
/* 59 */       paramDataOutputStream.writeShort(this.c[b]);
/*    */     }
/* 61 */     paramDataOutputStream.write(this.d);
/* 62 */     paramDataOutputStream.write(this.e);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 66 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 70 */     return 10 + this.f * 4;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */