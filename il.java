/*    */ 
/*    */ 
/*    */ public class il
/*    */   extends bd
/*    */ {
/*  6 */   private int a = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void g() {
/* 12 */     this.a++;
/*    */   }
/*    */   
/*    */   public void a() {
/* 16 */     this.e.clear();
/* 17 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Back to title screen"));
/*    */   }
/*    */   
/*    */   protected void a(fb paramfb) {
/* 21 */     if (!paramfb.e)
/* 22 */       return;  if (paramfb.d == 0) {
/* 23 */       this.b.a(new ct());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 29 */     i();
/*    */     
/* 31 */     a(this.g, "Level save conflict", this.c / 2, this.d / 4 - 60 + 20, 16777215);
/* 32 */     b(this.g, "Minecraft detected a conflict in the level save data.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 0, 10526880);
/* 33 */     b(this.g, "This could be caused by two copies of the game", this.c / 2 - 140, this.d / 4 - 60 + 60 + 18, 10526880);
/* 34 */     b(this.g, "accessing the same level.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 27, 10526880);
/* 35 */     b(this.g, "To prevent level corruption, the current game has quit.", this.c / 2 - 140, this.d / 4 - 60 + 60 + 45, 10526880);
/*    */     
/* 37 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\il.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */