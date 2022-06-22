/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ft
/*    */   extends bd
/*    */ {
/*    */   private bd a;
/* 11 */   private int h = 0;
/* 12 */   private String i = "";
/*    */   
/*    */   public ft(bd parambd) {
/* 15 */     this.a = parambd;
/*    */   }
/*    */   
/*    */   public void g() {
/* 19 */     this.h++;
/*    */   }
/*    */   
/*    */   public void a() {
/* 23 */     this.e.clear();
/* 24 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 96 + 12, "Connect"));
/* 25 */     this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 120 + 12, "Cancel"));
/* 26 */     ((fb)this.e.get(0)).e = false;
/*    */   }
/*    */   
/*    */   protected void a(fb paramfb) {
/* 30 */     if (!paramfb.e)
/* 31 */       return;  if (paramfb.d == 1) {
/* 32 */       this.b.a(this.a);
/* 33 */     } else if (paramfb.d == 0) {
/*    */ 
/*    */       
/* 36 */       String[] arrayOfString = this.i.split(":");
/*    */ 
/*    */       
/* 39 */       this.b.a(new mc(this.b, arrayOfString[0], (arrayOfString.length > 1) ? Integer.parseInt(arrayOfString[1]) : 25565));
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {
/* 44 */     if (paramChar == '\026') {
/* 45 */       String str = bd.c();
/* 46 */       if (str == null) str = ""; 
/* 47 */       int i = 32 - this.i.length();
/* 48 */       if (i > str.length()) i = str.length(); 
/* 49 */       if (i > 0) {
/* 50 */         this.i += str.substring(0, i);
/*    */       }
/*    */     } 
/* 53 */     if (paramChar == '\r') {
/* 54 */       a(this.e.get(0));
/*    */     }
/*    */     
/* 57 */     if (paramInt == 14 && this.i.length() > 0) this.i = this.i.substring(0, this.i.length() - 1); 
/* 58 */     if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(paramChar) >= 0 && this.i.length() < 32) {
/* 59 */       this.i += paramChar;
/*    */     }
/* 61 */     ((fb)this.e.get(0)).e = (this.i.length() > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 66 */     i();
/*    */     
/* 68 */     a(this.g, "Play Multiplayer", this.c / 2, this.d / 4 - 60 + 20, 16777215);
/* 69 */     b(this.g, "Minecraft Multiplayer is currently not finished, but there", this.c / 2 - 140, this.d / 4 - 60 + 60 + 0, 10526880);
/* 70 */     b(this.g, "is some buggy early testing going on.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 9, 10526880);
/* 71 */     b(this.g, "Enter the IP of a server to connect to it:", this.c / 2 - 140, this.d / 4 - 60 + 60 + 36, 10526880);
/*    */ 
/*    */     
/* 74 */     int i = this.c / 2 - 100;
/* 75 */     int j = this.d / 4 - 10 + 50 + 18;
/* 76 */     char c = 'È';
/* 77 */     byte b = 20;
/* 78 */     a(i - 1, j - 1, i + c + 1, j + b + 1, -6250336);
/* 79 */     a(i, j, i + c, j + b, -16777216);
/* 80 */     b(this.g, this.i + ((this.h / 6 % 2 == 0) ? "_" : ""), i + 4, j + (b - 8) / 2, 14737632);
/*    */     
/* 82 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ft.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */