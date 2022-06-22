/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hn
/*    */   extends dy
/*    */ {
/* 11 */   private i k = new i(this, 3, 3);
/* 12 */   private fy l = new lo();
/*    */   
/*    */   public hn(en paramen) {
/* 15 */     this.i.add(new io(this, this.k, this.l, 0, 124, 35));
/*    */     byte b;
/* 17 */     for (b = 0; b < 3; b++) {
/* 18 */       for (byte b1 = 0; b1 < 3; b1++) {
/* 19 */         this.i.add(new dl(this, this.k, b1 + b * 3, 30 + b1 * 18, 17 + b * 18));
/*    */       }
/*    */     } 
/*    */     
/* 23 */     for (b = 0; b < 3; b++) {
/* 24 */       for (byte b1 = 0; b1 < 9; b1++) {
/* 25 */         this.i.add(new dl(this, paramen, b1 + (b + 1) * 9, 8 + b1 * 18, 84 + b * 18));
/*    */       }
/*    */     } 
/* 28 */     for (b = 0; b < 9; b++) {
/* 29 */       this.i.add(new dl(this, paramen, b, 8 + b * 18, 142));
/*    */     }
/*    */   }
/*    */   
/*    */   public void h() {
/* 34 */     super.h();
/* 35 */     for (byte b = 0; b < 9; b++) {
/* 36 */       eo eo = this.k.a_(b);
/* 37 */       if (eo != null) {
/* 38 */         this.b.g.a(eo);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(fy paramfy) {
/* 44 */     int[] arrayOfInt = new int[9];
/* 45 */     for (byte b = 0; b < 3; b++) {
/* 46 */       for (byte b1 = 0; b1 < 3; b1++) {
/* 47 */         int j = b + b1 * 3;
/* 48 */         eo eo = this.k.a_(j);
/* 49 */         if (eo == null) { arrayOfInt[j] = -1; }
/* 50 */         else { arrayOfInt[j] = eo.c; }
/*    */       
/*    */       } 
/* 53 */     }  this.l.a(0, dq.a().a(arrayOfInt));
/*    */   }
/*    */   
/*    */   protected void j() {
/* 57 */     this.g.b("Crafting", 28, 6, 16777215);
/* 58 */     this.g.b("Inventory", 8, this.h - 96 + 2, 16777215);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat) {
/* 62 */     int j = this.b.n.a("/gui/crafting.png");
/* 63 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 64 */     this.b.n.b(j);
/* 65 */     int k = (this.c - this.a) / 2;
/* 66 */     int m = (this.d - this.h) / 2;
/* 67 */     b(k, m, 0, 0, this.a, this.h);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */