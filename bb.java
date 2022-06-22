/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.nio.file.CopyOption;
/*     */ import java.nio.file.FileVisitResult;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.nio.file.SimpleFileVisitor;
/*     */ import java.nio.file.StandardCopyOption;
/*     */ import java.nio.file.attribute.BasicFileAttributes;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import net.minecraft.client.Minecraft;
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
/*     */ public class bb
/*     */   extends Thread
/*     */ {
/*     */   public File a;
/*     */   private Minecraft b;
/*     */   private boolean c = false;
/*     */   
/*     */   public bb(File paramFile, Minecraft paramMinecraft) {
/*  42 */     this.b = paramMinecraft;
/*  43 */     setName("Resource unpack thread");
/*  44 */     setDaemon(true);
/*  45 */     this.a = new File(paramFile, "resources/");
/*  46 */     if (!this.a.exists() && !this.a.mkdirs())
/*  47 */       throw new RuntimeException("The working directory could not be created: " + this.a); 
/*     */   }
/*     */   
/*     */   void deleteDirectoryWalkTree(Path paramPath) throws IOException {
/*  51 */     SimpleFileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>()
/*     */       {
/*     */         public FileVisitResult visitFile(Path param1Path, BasicFileAttributes param1BasicFileAttributes) throws IOException
/*     */         {
/*  55 */           Files.delete(param1Path);
/*  56 */           return FileVisitResult.CONTINUE;
/*     */         }
/*     */ 
/*     */         
/*     */         public FileVisitResult visitFileFailed(Path param1Path, IOException param1IOException) throws IOException {
/*  61 */           Files.delete(param1Path);
/*  62 */           return FileVisitResult.CONTINUE;
/*     */         }
/*     */ 
/*     */         
/*     */         public FileVisitResult postVisitDirectory(Path param1Path, IOException param1IOException) throws IOException {
/*  67 */           if (param1IOException != null) {
/*  68 */             throw param1IOException;
/*     */           }
/*  70 */           Files.delete(param1Path);
/*  71 */           return FileVisitResult.CONTINUE;
/*     */         }
/*     */       };
/*  74 */     Files.walkFileTree(paramPath, simpleFileVisitor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     try {
/*     */       try {
/*  83 */         deleteDirectoryWalkTree(Paths.get(System.getProperty("user.dir") + "/resources/", new String[0]));
/*  84 */         this.a.mkdirs();
/*  85 */       } catch (Exception exception) {
/*  86 */         System.out.println("Error removing existing resources...");
/*     */       } 
/*     */       
/*  89 */       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
/*  90 */       int i = Integer.parseInt(simpleDateFormat.format(Calendar.getInstance().getTime()));
/*  91 */       InputStream inputStream = getClass().getResourceAsStream((i > 22 || i < 5) ? "/soundres_a.txt" : "/soundres.txt");
/*  92 */       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
/*     */       
/*     */       String str;
/*  95 */       while ((str = bufferedReader.readLine()) != null) {
/*  96 */         if (str != "") {
/*  97 */           String str1 = str.replace("sounddata", "resources");
/*  98 */           InputStream inputStream1 = getClass().getResourceAsStream(str);
/*  99 */           File file = new File(System.getProperty("user.dir") + str1);
/* 100 */           file.mkdirs();
/* 101 */           Files.copy(inputStream1, Paths.get(System.getProperty("user.dir") + str1, new String[0]), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
/*     */           
/* 103 */           inputStream1.close();
/*     */         } 
/*     */       } 
/* 106 */       System.out.println("Resources unpacked");
/* 107 */       bufferedReader.close();
/* 108 */       a(this.a, "");
/* 109 */     } catch (Exception exception) {
/* 110 */       exception.printStackTrace();
/* 111 */       a(this.a, "");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 117 */     a(this.a, "");
/*     */   }
/*     */   
/*     */   public void b() {
/* 121 */     this.c = true;
/*     */   }
/*     */   
/*     */   private void a(File paramFile, String paramString) {
/* 125 */     File[] arrayOfFile = paramFile.listFiles(); byte b;
/* 126 */     for (b = 0; b < arrayOfFile.length; b = (byte)(b + 1)) {
/* 127 */       if (arrayOfFile[b].isDirectory()) {
/* 128 */         a(arrayOfFile[b], paramString + arrayOfFile[b].getName() + "/");
/*     */       } else {
/*     */         try {
/* 131 */           this.b.a(paramString + arrayOfFile[b].getName(), arrayOfFile[b]);
/* 132 */         } catch (Exception exception) {
/* 133 */           System.out.println("Failed to add " + paramString + arrayOfFile[b].getName());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(URL paramURL, String paramString, long paramLong, int paramInt) {
/*     */     try {
/* 141 */       int i = paramString.indexOf("/");
/* 142 */       String str = paramString.substring(0, i);
/* 143 */       if (str.equals("sound") || str.equals("newsound")) {
/* 144 */         if (paramInt != 0)
/*     */           return; 
/* 146 */       } else if (paramInt != 1) {
/*     */         return;
/*     */       } 
/* 149 */       File file = new File(this.a, paramString);
/* 150 */       if (!file.exists() || file.length() != paramLong) {
/* 151 */         file.getParentFile().mkdirs();
/* 152 */         String str1 = paramString.replaceAll(" ", "%20");
/* 153 */         a(new URL(paramURL, str1), file, paramLong);
/* 154 */         if (this.c)
/*     */           return; 
/*     */       } 
/* 157 */       this.b.a(paramString, file);
/* 158 */     } catch (Exception exception) {
/* 159 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(URL paramURL, File paramFile, long paramLong) {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bb.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */