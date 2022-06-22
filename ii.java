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
/*    */ public class ii
/*    */   extends lf
/*    */ {
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 22 */     super.a(paramDataInputStream);
/* 23 */     this.b = paramDataInputStream.readByte();
/* 24 */     this.c = paramDataInputStream.readByte();
/* 25 */     this.d = paramDataInputStream.readByte();
/* 26 */     this.e = paramDataInputStream.readByte();
/* 27 */     this.f = paramDataInputStream.readByte();
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 31 */     super.a(paramDataOutputStream);
/* 32 */     paramDataOutputStream.writeByte(this.b);
/* 33 */     paramDataOutputStream.writeByte(this.c);
/* 34 */     paramDataOutputStream.writeByte(this.d);
/* 35 */     paramDataOutputStream.writeByte(this.e);
/* 36 */     paramDataOutputStream.writeByte(this.f);
/*    */   }
/*    */   
/*    */   public int a() {
/* 40 */     return 9;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ii.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */