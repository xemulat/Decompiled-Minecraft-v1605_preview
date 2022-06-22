/*     */ package paulscode.sound;
/*     */ 
/*     */ import java.net.URL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FilenameURL
/*     */ {
/*     */   private SoundSystemLogger logger;
/*  52 */   private String filename = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   private URL url = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FilenameURL(URL paramURL, String paramString) {
/*  69 */     this.logger = SoundSystemConfig.getLogger();
/*     */     
/*  71 */     this.filename = paramString;
/*  72 */     this.url = paramURL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FilenameURL(String paramString) {
/*  85 */     this.logger = SoundSystemConfig.getLogger();
/*     */     
/*  87 */     this.filename = paramString;
/*  88 */     this.url = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFilename() {
/*  97 */     return this.filename;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public URL getURL() {
/* 108 */     if (this.url == null)
/*     */     {
/*     */       
/* 111 */       if (this.filename.matches("^[hH][tT][tT][pP]://.*")) {
/*     */         
/*     */         try
/*     */         {
/*     */           
/* 116 */           this.url = new URL(this.filename);
/*     */         }
/* 118 */         catch (Exception exception)
/*     */         {
/* 120 */           errorMessage("Unable to access online URL in method 'getURL'");
/*     */           
/* 122 */           printStackTrace(exception);
/* 123 */           return null;
/*     */         }
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 129 */         this.url = getClass().getClassLoader().getResource(SoundSystemConfig.getSoundFilesPackage() + this.filename);
/*     */       } 
/*     */     }
/*     */     
/* 133 */     return this.url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void errorMessage(String paramString) {
/* 142 */     this.logger.errorMessage("MidiChannel", paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void printStackTrace(Exception paramException) {
/* 151 */     this.logger.printStackTrace(paramException, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\FilenameURL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */