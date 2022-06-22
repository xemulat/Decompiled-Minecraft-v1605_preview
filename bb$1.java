/*    */ import java.io.IOException;
/*    */ import java.nio.file.FileVisitResult;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.SimpleFileVisitor;
/*    */ import java.nio.file.attribute.BasicFileAttributes;
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
/*    */ class null
/*    */   extends SimpleFileVisitor<Path>
/*    */ {
/*    */   public FileVisitResult visitFile(Path paramPath, BasicFileAttributes paramBasicFileAttributes) throws IOException {
/* 55 */     Files.delete(paramPath);
/* 56 */     return FileVisitResult.CONTINUE;
/*    */   }
/*    */ 
/*    */   
/*    */   public FileVisitResult visitFileFailed(Path paramPath, IOException paramIOException) throws IOException {
/* 61 */     Files.delete(paramPath);
/* 62 */     return FileVisitResult.CONTINUE;
/*    */   }
/*    */ 
/*    */   
/*    */   public FileVisitResult postVisitDirectory(Path paramPath, IOException paramIOException) throws IOException {
/* 67 */     if (paramIOException != null) {
/* 68 */       throw paramIOException;
/*    */     }
/* 70 */     Files.delete(paramPath);
/* 71 */     return FileVisitResult.CONTINUE;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bb$1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */