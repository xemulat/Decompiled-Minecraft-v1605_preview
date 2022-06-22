/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hs
/*    */   extends dy
/*    */ {
/*    */   private ju k;
/*    */   
/*    */   public hs(en paramen, ju paramju) {
/* 11 */     this.k = paramju;
/*    */     
/* 13 */     this.i.add(new dl(this, paramju, 0, 56, 17));
/* 14 */     this.i.add(new dl(this, paramju, 1, 56, 53));
/* 15 */     this.i.add(new dl(this, paramju, 2, 116, 35));
/*    */     
/*    */     byte b;
/* 18 */     for (b = 0; b < 3; b++) {
/* 19 */       for (byte b1 = 0; b1 < 9; b1++) {
/* 20 */         this.i.add(new dl(this, paramen, b1 + (b + 1) * 9, 8 + b1 * 18, 84 + b * 18));
/*    */       }
/*    */     } 
/* 23 */     for (b = 0; b < 9; b++) {
/* 24 */       this.i.add(new dl(this, paramen, b, 8 + b * 18, 142));
/*    */     }
/*    */   }
/*    */   
/*    */   protected void j() {
/* 29 */     this.g.b("Furnace", 60, 6, 16777215);
/* 30 */     this.g.b("Inventory", 8, this.h - 96 + 2, 16777215);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat) {
/* 34 */     int i = this.b.n.a("/gui/furnace.png");
/* 35 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 36 */     this.b.n.b(i);
/* 37 */     int j = (this.c - this.a) / 2;
/* 38 */     int k = (this.d - this.h) / 2;
/* 39 */     b(j, k, 0, 0, this.a, this.h);
/* 40 */     if (this.k.g()) {
/* 41 */       int n = this.k.c(12);
/* 42 */       b(j + 56, k + 36 + 12 - n, 176, 12 - n, 14, n + 2);
/*    */     } 
/*    */     
/* 45 */     int m = this.k.b(24);
/* 46 */     b(j + 79, k + 34, 176, 14, m + 1, 16);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */