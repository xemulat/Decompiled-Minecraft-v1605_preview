/*    */ import java.io.InputStream;
/*    */ import paulscode.sound.codecs.CodecJOrbis;
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
/*    */ public class ej
/*    */   extends CodecJOrbis
/*    */ {
/*    */   protected InputStream openInputStream() {
/* 40 */     return new ha(this, this.url, this.urlConnection.getInputStream());
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ej.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */