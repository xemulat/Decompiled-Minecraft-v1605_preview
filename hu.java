/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hu
/*    */   extends bd
/*    */ {
/*  8 */   private int a = 0;
/*  9 */   private int h = 0;
/*    */   
/*    */   public void a() {
/* 12 */     this.a = 0;
/* 13 */     this.e.clear();
/* 14 */     this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 48, "Save and quit to title"));
/* 15 */     if (this.b.j()) {
/* 16 */       ((fb)this.e.get(0)).c = "Disconnect";
/*    */     }
/* 18 */     this.e.add(new fb(4, this.c / 2 - 100, this.d / 4 + 24, "Back to game"));
/*    */     
/* 20 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 96, "Options..."));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(fb paramfb) {
/* 30 */     if (paramfb.d == 0) {
/* 31 */       this.b.a(new au(this, this.b.y));
/*    */     }
/* 33 */     if (paramfb.d == 1) {
/* 34 */       if (this.b.j()) {
/* 35 */         this.b.e.k();
/*    */       }
/*    */       
/* 38 */       this.b.a(null);
/* 39 */       this.b.a(new ct());
/*    */     } 
/* 41 */     if (paramfb.d == 4) {
/* 42 */       this.b.a(null);
/* 43 */       this.b.e();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void g() {
/* 48 */     super.g();
/* 49 */     this.h++;
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 53 */     i();
/*    */     
/* 55 */     boolean bool = !this.b.e.a(this.a++) ? true : false;
/* 56 */     if (bool || this.h < 20) {
/* 57 */       float f = ((this.h % 10) + paramFloat) / 10.0F;
/* 58 */       f = ei.a(f * 3.1415927F * 2.0F) * 0.2F + 0.8F;
/* 59 */       int i = (int)(255.0F * f);
/*    */       
/* 61 */       b(this.g, "Saving level..", 8, this.d - 16, i << 16 | i << 8 | i);
/*    */     } 
/*    */     
/* 64 */     a(this.g, "Game menu", this.c / 2, 40, 16777215);
/*    */     
/* 66 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */