/*    */ import java.io.DataInput;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class w {
/*    */   public static hc a(InputStream paramInputStream) {
/*  8 */     DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(paramInputStream));
/*    */     try {
/* 10 */       return a(dataInputStream);
/*    */     } finally {
/* 12 */       dataInputStream.close();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(hc paramhc, OutputStream paramOutputStream) {
/* 17 */     DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(paramOutputStream));
/*    */     try {
/* 19 */       a(paramhc, dataOutputStream);
/*    */     } finally {
/* 21 */       dataOutputStream.close();
/*    */     } 
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
/*    */   public static hc a(DataInput paramDataInput) {
/* 46 */     ef ef = ef.b(paramDataInput);
/* 47 */     if (ef instanceof hc) return (hc)ef; 
/* 48 */     throw new IOException("Root tag must be a named compound tag");
/*    */   }
/*    */   
/*    */   public static void a(hc paramhc, DataOutput paramDataOutput) {
/* 52 */     ef.a(paramhc, paramDataOutput);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */