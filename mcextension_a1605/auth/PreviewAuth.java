/*    */ package mcextension_a1605.auth;
/*    */ 
/*    */ import ct;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.Scanner;
/*    */ import org.lwjgl.Sys;
/*    */ 
/*    */ 
/*    */ public class PreviewAuth
/*    */ {
/* 14 */   public static Thread authThread = null;
/*    */   public static boolean shownPreviewMessage = false;
/*    */   public static volatile long start;
/* 17 */   public static int rdMins = -1;
/*    */   public static volatile long endtime;
/*    */   
/*    */   public static void U3RhcnRUaW1lclRocmVhZA() {
/* 21 */     if (!shownPreviewMessage) {
/* 22 */       shownPreviewMessage = true;
/*    */       
/* 24 */       File file = new File(System.getProperty("user.dir") + "/preview_data");
/* 25 */       if (file.exists()) {
/*    */         try {
/* 27 */           Scanner scanner = new Scanner(file);
/*    */           try {
/* 29 */             rdMins = scanner.nextInt();
/* 30 */             if (rdMins > 40 || rdMins < 0) {
/* 31 */               throw new NumberFormatException();
/*    */             }
/* 33 */           } catch (NumberFormatException numberFormatException) {
/* 34 */             System.out.println("FILE TAMPERED; EXITING");
/* 35 */             System.exit(-1);
/*    */           } 
/*    */           
/* 38 */           if (rdMins == 0) {
/* 39 */             Sys.alert("", "Preview time expired");
/* 40 */             System.exit(0);
/*    */           } 
/* 42 */         } catch (FileNotFoundException fileNotFoundException) {
/* 43 */           System.out.println("????????????????????????????");
/* 44 */           System.exit(-1);
/*    */         } 
/*    */       } else {
/* 47 */         rdMins = 40;
/* 48 */         writePreviewFile("40");
/*    */       } 
/*    */       
/* 51 */       Sys.alert("1.0.16.05 Preview version", "Welcome to the preview version of 1.0.16.05. You will be given 40 minutes to play.\n\nPlease remember that this preview version is not representative of the final product.");
/* 52 */       authThread = new Thread(new Runnable()
/*    */           {
/*    */             public void run() {
/* 55 */               PreviewAuth.start = System.currentTimeMillis();
/* 56 */               PreviewAuth.endtime = PreviewAuth.start + (60000 * PreviewAuth.rdMins);
/* 57 */               while (System.currentTimeMillis() < PreviewAuth.endtime) {
/* 58 */                 if (ct.minRemaining() != PreviewAuth.rdMins) {
/* 59 */                   PreviewAuth.rdMins = ct.minRemaining();
/* 60 */                   PreviewAuth.writePreviewFile(Integer.toString(PreviewAuth.rdMins));
/*    */                 } 
/*    */                 try {
/* 63 */                   Thread.sleep(100L);
/* 64 */                 } catch (InterruptedException interruptedException) {}
/*    */               } 
/*    */               
/* 67 */               PreviewAuth.writePreviewFile("0");
/* 68 */               Sys.alert("", "Thanks for playing the preview");
/* 69 */               System.exit(0);
/*    */             }
/*    */           });
/* 72 */       authThread.start();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void writePreviewFile(String paramString) {
/*    */     try {
/* 78 */       File file = new File(System.getProperty("user.dir") + "/preview_data");
/* 79 */       if (file.exists()) {
/* 80 */         file.delete();
/*    */       }
/* 82 */       FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "/preview_data");
/* 83 */       fileWriter.write(paramString);
/* 84 */       fileWriter.close();
/* 85 */     } catch (IOException iOException) {
/* 86 */       System.out.println("Unable to write data. Exiting");
/* 87 */       System.exit(-1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int minRemaining() {
/* 92 */     return -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mcextension_a1605\auth\PreviewAuth.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */