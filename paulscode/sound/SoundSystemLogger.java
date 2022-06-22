/*     */ package paulscode.sound;
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
/*     */ public class SoundSystemLogger
/*     */ {
/*     */   public void message(String paramString, int paramInt) {
/*  60 */     String str2 = "";
/*  61 */     for (byte b = 0; b < paramInt; b++)
/*     */     {
/*  63 */       str2 = str2 + "    ";
/*     */     }
/*     */     
/*  66 */     String str1 = str2 + paramString;
/*     */ 
/*     */     
/*  69 */     System.out.println(str1);
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
/*     */   public void importantMessage(String paramString, int paramInt) {
/*  81 */     String str2 = "";
/*  82 */     for (byte b = 0; b < paramInt; b++)
/*     */     {
/*  84 */       str2 = str2 + "    ";
/*     */     }
/*     */     
/*  87 */     String str1 = str2 + paramString;
/*     */ 
/*     */     
/*  90 */     System.out.println(str1);
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
/*     */   
/*     */   public boolean errorCheck(boolean paramBoolean, String paramString1, String paramString2, int paramInt) {
/* 104 */     if (paramBoolean)
/* 105 */       errorMessage(paramString1, paramString2, paramInt); 
/* 106 */     return paramBoolean;
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
/*     */   
/*     */   public void errorMessage(String paramString1, String paramString2, int paramInt) {
/* 120 */     String str3 = "";
/* 121 */     for (byte b = 0; b < paramInt; b++)
/*     */     {
/* 123 */       str3 = str3 + "    ";
/*     */     }
/*     */     
/* 126 */     String str1 = str3 + "Error in class '" + paramString1 + "'";
/*     */     
/* 128 */     String str2 = "    " + str3 + paramString2;
/*     */ 
/*     */     
/* 131 */     System.out.println(str1);
/* 132 */     System.out.println(str2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void printStackTrace(Exception paramException, int paramInt) {
/* 142 */     printExceptionMessage(paramException, paramInt);
/* 143 */     importantMessage("STACK TRACE:", paramInt);
/* 144 */     if (paramException == null) {
/*     */       return;
/*     */     }
/* 147 */     StackTraceElement[] arrayOfStackTraceElement = paramException.getStackTrace();
/* 148 */     if (arrayOfStackTraceElement == null) {
/*     */       return;
/*     */     }
/*     */     
/* 152 */     for (byte b = 0; b < arrayOfStackTraceElement.length; b++) {
/*     */       
/* 154 */       StackTraceElement stackTraceElement = arrayOfStackTraceElement[b];
/* 155 */       if (stackTraceElement != null) {
/* 156 */         message(stackTraceElement.toString(), paramInt + 1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void printExceptionMessage(Exception paramException, int paramInt) {
/* 167 */     importantMessage("ERROR MESSAGE:", paramInt);
/* 168 */     if (paramException.getMessage() == null) {
/* 169 */       message("(none)", paramInt + 1);
/*     */     } else {
/* 171 */       message(paramException.getMessage(), paramInt + 1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\SoundSystemLogger.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */