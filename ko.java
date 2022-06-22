/*    */ import java.io.File;
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ import javax.imageio.ImageIO;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ko
/*    */   extends Thread
/*    */ {
/*    */   private by paramby2;
/*    */   private String paramString2;
/*    */   private gr paramgr2;
/*    */   
/*    */   ko(by paramby, String paramString, gr paramgr) {
/* 19 */     this.paramby2 = paramby;
/* 20 */     this.paramString2 = paramString;
/* 21 */     this.paramgr2 = paramgr;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 29 */     if (this.paramString2.startsWith("file:///")) {
/*    */       try {
/* 31 */         if (this.paramgr2 == null) {
/* 32 */           this.paramby2.a = ImageIO.read(new File(this.paramString2.substring(8)));
/*    */         } else {
/* 34 */           this.paramby2.a = this.paramgr2.a(ImageIO.read(new File(this.paramString2.substring(8))));
/* 35 */         }  System.out.println("Loaded from local file");
/* 36 */       } catch (Exception exception) {
/* 37 */         exception.printStackTrace();
/*    */       } 
/*    */       
/*    */       return;
/*    */     } 
/* 42 */     HttpURLConnection httpURLConnection = null;
/*    */ 
/*    */     
/*    */     try {
/* 46 */       URL uRL = new URL(this.paramString2);
/* 47 */       httpURLConnection = (HttpURLConnection)uRL.openConnection();
/* 48 */       httpURLConnection.setDoInput(true);
/* 49 */       httpURLConnection.setDoOutput(false);
/* 50 */       httpURLConnection.connect();
/* 51 */       if (httpURLConnection.getResponseCode() == 404) {
/*    */         return;
/*    */       }
/*    */       
/* 55 */       if (this.paramgr2 == null)
/* 56 */       { this.paramby2.a = ImageIO.read(httpURLConnection.getInputStream()); }
/*    */       else
/* 58 */       { this.paramby2.a = this.paramgr2.a(ImageIO.read(httpURLConnection.getInputStream())); } 
/* 59 */     } catch (Exception exception) {
/* 60 */       exception.printStackTrace();
/*    */     } finally {
/* 62 */       httpURLConnection.disconnect();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ko.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */