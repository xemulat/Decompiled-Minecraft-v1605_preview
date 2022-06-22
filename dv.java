/*    */ import java.io.File;
/*    */ import java.net.MalformedURLException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class dv {
/*  8 */   private Random c = new Random();
/*    */   
/* 10 */   private Map d = new HashMap<Object, Object>();
/* 11 */   private List e = new ArrayList();
/*    */   
/* 13 */   public int a = 0;
/*    */   public boolean b = true;
/*    */   
/*    */   public af a(String paramString, File paramFile) {
/*    */     try {
/* 18 */       String str = paramString;
/* 19 */       paramString = paramString.substring(0, paramString.indexOf("."));
/* 20 */       if (this.b) {
/* 21 */         while (Character.isDigit(paramString.charAt(paramString.length() - 1))) {
/* 22 */           paramString = paramString.substring(0, paramString.length() - 1);
/*    */         }
/*    */       }
/* 25 */       paramString = paramString.replaceAll("/", ".");
/*    */       
/* 27 */       if (!this.d.containsKey(paramString)) {
/* 28 */         this.d.put(paramString, new ArrayList());
/*    */       }
/* 30 */       af af = new af(str, paramFile.toURI().toURL());
/* 31 */       ((List<af>)this.d.get(paramString)).add(af);
/* 32 */       this.e.add(af);
/* 33 */       this.a++;
/* 34 */       return af;
/* 35 */     } catch (MalformedURLException malformedURLException) {
/* 36 */       malformedURLException.printStackTrace();
/* 37 */       throw new RuntimeException(malformedURLException);
/*    */     } 
/*    */   }
/*    */   
/*    */   public af a(String paramString) {
/* 42 */     List<af> list = (List)this.d.get(paramString);
/* 43 */     if (list == null) return null; 
/* 44 */     return list.get(this.c.nextInt(list.size()));
/*    */   }
/*    */   
/*    */   public af a() {
/* 48 */     if (this.e.size() == 0) return null; 
/* 49 */     return this.e.get(this.c.nextInt(this.e.size()));
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */