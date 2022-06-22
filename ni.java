/*    */ import org.lwjgl.input.Keyboard;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ni
/*    */   extends bd
/*    */ {
/* 14 */   protected String a = "Edit sign message:";
/*    */   private nn h;
/*    */   private int i;
/* 17 */   private int k = 0;
/*    */   
/*    */   public ni(nn paramnn) {
/* 20 */     this.h = paramnn;
/*    */   }
/*    */   
/*    */   public void a() {
/* 24 */     this.e.clear();
/* 25 */     Keyboard.enableRepeatEvents(true);
/* 26 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120, "Done"));
/*    */   }
/*    */   
/*    */   public void h() {
/* 30 */     Keyboard.enableRepeatEvents(false);
/*    */   }
/*    */   
/*    */   public void g() {
/* 34 */     this.i++;
/*    */   }
/*    */   
/*    */   protected void a(fb paramfb) {
/* 38 */     if (!paramfb.e)
/*    */       return; 
/* 40 */     if (paramfb.d == 0) {
/* 41 */       this.h.d();
/* 42 */       this.b.a(null);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {
/* 49 */     if (paramInt == 200) this.k = this.k - 1 & 0x3; 
/* 50 */     if (paramInt == 208 || paramInt == 28) this.k = this.k + 1 & 0x3; 
/* 51 */     if (paramInt == 14 && this.h.a[this.k].length() > 0) this.h.a[this.k] = this.h.a[this.k].substring(0, this.h.a[this.k].length() - 1); 
/* 52 */     if (" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(paramChar) >= 0 && this.h.a[this.k].length() < 15) {
/* 53 */       this.h.a[this.k] = this.h.a[this.k] + paramChar;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 58 */     i();
/*    */     
/* 60 */     a(this.g, this.a, this.c / 2, 40, 16777215);
/*    */     
/* 62 */     GL11.glPushMatrix();
/* 63 */     GL11.glTranslatef((this.c / 2), (this.d / 2), 50.0F);
/* 64 */     float f = 93.75F;
/* 65 */     GL11.glScalef(-f, -f, -f);
/* 66 */     GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*    */     
/* 68 */     ln ln = this.h.f();
/*    */     
/* 70 */     if (ln == ln.aD) {
/* 71 */       float f1 = (this.h.e() * 360) / 16.0F;
/* 72 */       GL11.glRotatef(f1, 0.0F, 1.0F, 0.0F);
/*    */     } else {
/* 74 */       int i = this.h.e();
/* 75 */       float f1 = 0.0F;
/*    */       
/* 77 */       if (i == 2) f1 = 180.0F; 
/* 78 */       if (i == 4) f1 = 90.0F; 
/* 79 */       if (i == 5) f1 = -90.0F; 
/* 80 */       GL11.glRotatef(f1, 0.0F, 1.0F, 0.0F);
/* 81 */       GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
/*    */     } 
/*    */     
/* 84 */     if (this.i / 6 % 2 == 0) this.h.b = this.k;
/*    */ 
/*    */ 
/*    */     
/* 88 */     fq.a.a(this.h, -0.5D, -0.75D, -0.5D, 0.0F);
/* 89 */     this.h.b = -1;
/*    */     
/* 91 */     GL11.glPopMatrix();
/*    */     
/* 93 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ni.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */