/*    */ import java.io.InputStream;
/*    */ import java.net.URL;
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
/*    */ class ha
/*    */   extends InputStream
/*    */ {
/*    */   private int c;
/*    */   private InputStream d;
/*    */   byte[] a;
/*    */   
/*    */   public ha(ej paramej, URL paramURL, InputStream paramInputStream) {
/* 21 */     this.a = new byte[1]; this.d = paramInputStream;
/*    */     String str = paramURL.getPath();
/*    */     str = str.substring(str.lastIndexOf("/") + 1);
/* 24 */     this.c = str.hashCode(); } public int read() { int i = read(this.a, 0, 1);
/* 25 */     if (i < 0) return i; 
/* 26 */     return this.a[0]; }
/*    */ 
/*    */   
/*    */   public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 30 */     paramInt2 = this.d.read(paramArrayOfbyte, paramInt1, paramInt2);
/* 31 */     for (byte b = 0; b < paramInt2; b++) {
/* 32 */       byte b1 = paramArrayOfbyte[paramInt1 + b] = (byte)(paramArrayOfbyte[paramInt1 + b] ^ this.c >> 8);
/* 33 */       this.c = this.c * 498729871 + 85731 * b1;
/*    */     } 
/* 35 */     return paramInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ha.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */