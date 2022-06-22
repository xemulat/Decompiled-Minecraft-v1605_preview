/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Panel;
/*     */ import java.awt.TextArea;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import org.lwjgl.Sys;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class an
/*     */   extends Panel
/*     */ {
/*     */   public an(gf paramgf) {
/*  48 */     setBackground(new Color(3028036));
/*  49 */     setLayout(new BorderLayout());
/*  50 */     StringWriter stringWriter = new StringWriter();
/*  51 */     paramgf.b.printStackTrace(new PrintWriter(stringWriter));
/*  52 */     String str1 = stringWriter.toString();
/*     */     
/*  54 */     String str2 = "";
/*     */     
/*  56 */     String str3 = "";
/*     */     try {
/*  58 */       str3 = str3 + "Generated " + (new SimpleDateFormat()).format(new Date()) + "\n";
/*  59 */       str3 = str3 + "\n";
/*  60 */       str3 = str3 + "Minecraft: Minecraft Alpha v1.0.16_02\n";
/*  61 */       str3 = str3 + "OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version") + "\n";
/*  62 */       str3 = str3 + "Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor") + "\n";
/*  63 */       str3 = str3 + "VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor") + "\n";
/*  64 */       str3 = str3 + "LWJGL: " + Sys.getVersion() + "\n";
/*     */       
/*  66 */       str2 = GL11.glGetString(7936);
/*  67 */       str3 = str3 + "OpenGL: " + GL11.glGetString(7937) + " version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936) + "\n";
/*     */     }
/*  69 */     catch (Throwable throwable) {
/*  70 */       str3 = str3 + "[failed to get system properties (" + throwable + ")]\n";
/*     */     } 
/*  72 */     str3 = str3 + "\n";
/*  73 */     str3 = str3 + str1;
/*     */ 
/*     */     
/*  76 */     String str4 = "";
/*  77 */     str4 = str4 + "\n";
/*  78 */     str4 = str4 + "\n";
/*     */     
/*  80 */     if (str1.contains("Pixel format not accelerated")) {
/*  81 */       str4 = str4 + "      Bad video card drivers!      \n";
/*  82 */       str4 = str4 + "      -----------------------      \n";
/*  83 */       str4 = str4 + "\n";
/*  84 */       str4 = str4 + "Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n";
/*  85 */       str4 = str4 + "This can usually be fixed by updating the video card drivers.\n";
/*  86 */       if (str2.toLowerCase().contains("nvidia")) {
/*  87 */         str4 = str4 + "\n";
/*  88 */         str4 = str4 + "You might be able to find drivers for your video card here:\n";
/*  89 */         str4 = str4 + "  http://www.nvidia.com/\n";
/*  90 */       } else if (str2.toLowerCase().contains("ati")) {
/*  91 */         str4 = str4 + "\n";
/*  92 */         str4 = str4 + "You might be able to find drivers for your video card here:\n";
/*  93 */         str4 = str4 + "  http://www.amd.com/\n";
/*     */       } 
/*     */     } else {
/*  96 */       str4 = str4 + "      Minecraft has crashed!      \n";
/*  97 */       str4 = str4 + "      ----------------------      \n";
/*  98 */       str4 = str4 + "\n";
/*  99 */       str4 = str4 + "Minecraft has stopped running because it encountered a problem.\n";
/* 100 */       str4 = str4 + "\n";
/* 101 */       str4 = str4 + "If you wish to report this, please copy this entire text and email it to support@mojang.com.\n";
/* 102 */       str4 = str4 + "Please include a description of what you did when the error occured.\n";
/*     */     } 
/* 104 */     str4 = str4 + "\n";
/* 105 */     str4 = str4 + "\n";
/* 106 */     str4 = str4 + "\n";
/* 107 */     str4 = str4 + "--- BEGIN ERROR REPORT " + Integer.toHexString(str4.hashCode()) + " --------\n";
/* 108 */     str4 = str4 + str3;
/*     */     
/* 110 */     str4 = str4 + "--- END ERROR REPORT " + Integer.toHexString(str4.hashCode()) + " ----------\n";
/* 111 */     str4 = str4 + "\n";
/* 112 */     str4 = str4 + "\n";
/*     */     
/* 114 */     TextArea textArea = new TextArea(str4, 0, 0, 1);
/* 115 */     textArea.setFont(new Font("Monospaced", 0, 12));
/* 116 */     add(new cw(), "North");
/* 117 */     add(new mo(80), "East");
/* 118 */     add(new mo(80), "West");
/* 119 */     add(new mo(100), "South");
/* 120 */     add(textArea, "Center");
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */