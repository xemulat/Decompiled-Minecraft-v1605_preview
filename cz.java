/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cz
/*    */   extends bd
/*    */ {
/*  8 */   private String a = "";
/*  9 */   private int h = 0;
/*    */   
/*    */   public void a() {
/* 12 */     Keyboard.enableRepeatEvents(true);
/*    */   }
/*    */   
/*    */   public void h() {
/* 16 */     Keyboard.enableRepeatEvents(false);
/*    */   }
/*    */   
/*    */   public void g() {
/* 20 */     this.h++;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {
/* 26 */     if (paramInt == 1) {
/* 27 */       this.b.a(null);
/*    */       return;
/*    */     } 
/* 30 */     if (paramInt == 28) {
/* 31 */       String str = this.a.trim();
/* 32 */       if (str.length() > 0) {
/* 33 */         this.b.g.a(this.a.trim());
/*    */       }
/* 35 */       this.b.a(null);
/*    */       return;
/*    */     } 
/* 38 */     if (paramInt == 14 && this.a.length() > 0) this.a = this.a.substring(0, this.a.length() - 1); 
/* 39 */     if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(paramChar) >= 0 && this.a.length() < 100) {
/* 40 */       this.a += paramChar;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 45 */     a(2, this.d - 14, this.c - 2, this.d - 2, -2147483648);
/* 46 */     b(this.g, "> " + this.a + ((this.h / 6 % 2 == 0) ? "_" : ""), 4, this.d - 12, 14737632);
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3) {
/* 50 */     if (paramInt3 == 0 && 
/* 51 */       this.b.u.a != null) {
/* 52 */       if (this.a.length() > 0 && !this.a.endsWith(" ")) {
/* 53 */         this.a += " ";
/*    */       }
/* 55 */       this.a += this.b.u.a;
/* 56 */       byte b = 100;
/* 57 */       if (this.a.length() > b)
/* 58 */         this.a = this.a.substring(0, b); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */