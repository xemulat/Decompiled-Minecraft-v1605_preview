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
/*    */ public class r
/*    */   extends eb
/*    */ {
/*    */   public r() {
/* 51 */     this.h = true;
/*    */   }
/*    */   
/*    */   public r(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean) {
/* 55 */     this.a = paramDouble1;
/* 56 */     this.b = paramDouble2;
/* 57 */     this.d = paramDouble3;
/* 58 */     this.c = paramDouble4;
/* 59 */     this.g = paramBoolean;
/* 60 */     this.h = true;
/*    */   }
/*    */   
/*    */   public void a(DataInputStream paramDataInputStream) {
/* 64 */     this.a = paramDataInputStream.readDouble();
/* 65 */     this.b = paramDataInputStream.readDouble();
/* 66 */     this.d = paramDataInputStream.readDouble();
/* 67 */     this.c = paramDataInputStream.readDouble();
/* 68 */     super.a(paramDataInputStream);
/*    */   }
/*    */   
/*    */   public void a(DataOutputStream paramDataOutputStream) {
/* 72 */     paramDataOutputStream.writeDouble(this.a);
/* 73 */     paramDataOutputStream.writeDouble(this.b);
/* 74 */     paramDataOutputStream.writeDouble(this.d);
/* 75 */     paramDataOutputStream.writeDouble(this.c);
/* 76 */     super.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public int a() {
/* 80 */     return 33;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */