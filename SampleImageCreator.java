/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.nio.file.CopyOption;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Paths;
/*    */ import java.nio.file.StandardCopyOption;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SampleImageCreator
/*    */ {
/*    */   public static void main(String[] paramArrayOfString) {
/*    */     try {
/* 14 */       String[] arrayOfString = { "/sample/s1.dat", "/sample/s2.dat", "/sample/s3.dat" };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 20 */       for (String str1 : arrayOfString) {
/* 21 */         InputStream inputStream = SampleImageCreator.class.getResourceAsStream(str1);
/* 22 */         String str2 = str1.replace("/sample", "").replace("dat", "png");
/* 23 */         Files.copy(inputStream, Paths.get(System.getProperty("user.dir") + str2, new String[0]), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
/*    */         
/* 25 */         inputStream.close();
/*    */       } 
/* 27 */     } catch (IOException iOException) {
/* 28 */       iOException.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\SampleImageCreator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */