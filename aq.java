/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aq
/*    */   extends bd
/*    */ {
/*    */   public void a() {
/* 10 */     this.e.clear();
/* 11 */     this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 72, "Respawn"));
/* 12 */     this.e.add(new fb(2, this.c / 2 - 100, this.d / 4 + 96, "Title menu"));
/*    */     
/* 14 */     if (this.b.i == null)
/*    */     {
/* 16 */       ((fb)this.e.get(1)).e = false;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {}
/*    */ 
/*    */   
/*    */   protected void a(fb paramfb) {
/* 26 */     if (paramfb.d == 0);
/*    */ 
/*    */ 
/*    */     
/* 30 */     if (paramfb.d == 1) {
/*    */       
/* 32 */       this.b.o();
/* 33 */       this.b.a(null);
/*    */     } 
/*    */     
/* 36 */     if (paramfb.d == 2) {
/* 37 */       this.b.a(null);
/* 38 */       this.b.a(new ct());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 44 */     a(0, 0, this.c, this.d, 1615855616, -1602211792);
/*    */     
/* 46 */     GL11.glPushMatrix();
/* 47 */     GL11.glScalef(2.0F, 2.0F, 2.0F);
/* 48 */     a(this.g, "Game over!", this.c / 2 / 2, 30, 16777215);
/* 49 */     GL11.glPopMatrix();
/* 50 */     a(this.g, "Score: &e" + this.b.g.p(), this.c / 2, 100, 16777215);
/*    */     
/* 52 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 56 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\aq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */