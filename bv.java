/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.zip.DataFormatException;
/*    */ import java.util.zip.Inflater;
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
/*    */ public class bv
/*    */   extends fd
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   public int f;
/*    */   public byte[] g;
/*    */   private int h;
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 40 */     this.a = paramDataInputStream.readInt();
/* 41 */     this.b = paramDataInputStream.readShort();
/* 42 */     this.c = paramDataInputStream.readInt();
/* 43 */     this.d = paramDataInputStream.read() + 1;
/* 44 */     this.e = paramDataInputStream.read() + 1;
/* 45 */     this.f = paramDataInputStream.read() + 1;
/*    */     
/* 47 */     int i = paramDataInputStream.readInt();
/* 48 */     byte[] arrayOfByte = new byte[i];
/* 49 */     paramDataInputStream.readFully(arrayOfByte);
/*    */     
/* 51 */     this.g = new byte[this.d * this.e * this.f * 5 / 2];
/*    */     
/* 53 */     Inflater inflater = new Inflater();
/* 54 */     inflater.setInput(arrayOfByte);
/*    */     try {
/* 56 */       inflater.inflate(this.g);
/* 57 */     } catch (DataFormatException dataFormatException) {
/* 58 */       throw new IOException("Bad compressed data format");
/*    */     } finally {
/* 60 */       inflater.end();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 65 */     paramDataOutputStream.writeInt(this.a);
/* 66 */     paramDataOutputStream.writeShort(this.b);
/* 67 */     paramDataOutputStream.writeInt(this.c);
/* 68 */     paramDataOutputStream.write(this.d - 1);
/* 69 */     paramDataOutputStream.write(this.e - 1);
/* 70 */     paramDataOutputStream.write(this.f - 1);
/*    */     
/* 72 */     paramDataOutputStream.writeInt(this.h);
/* 73 */     paramDataOutputStream.write(this.g, 0, this.h);
/*    */   }
/*    */   
/*    */   public void a(kq paramkq) {
/* 77 */     paramkq.a(this);
/*    */   }
/*    */   
/*    */   public int a() {
/* 81 */     return 17 + this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */