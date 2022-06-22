/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class du
/*    */   extends dy
/*    */ {
/*    */   private fy k;
/*    */   private fy l;
/* 11 */   private int m = 0;
/*    */   
/*    */   public du(fy paramfy1, fy paramfy2) {
/* 14 */     this.k = paramfy1;
/* 15 */     this.l = paramfy2;
/* 16 */     this.f = false;
/*    */     
/* 18 */     char c = 'Þ';
/* 19 */     int i = c - 108;
/* 20 */     this.m = paramfy2.a() / 9;
/*    */     
/* 22 */     this.h = i + this.m * 18;
/*    */     
/* 24 */     int j = (this.m - 4) * 18;
/*    */     byte b;
/* 26 */     for (b = 0; b < this.m; b++) {
/* 27 */       for (byte b1 = 0; b1 < 9; b1++) {
/* 28 */         this.i.add(new dl(this, paramfy2, b1 + b * 9, 8 + b1 * 18, 18 + b * 18));
/*    */       }
/*    */     } 
/*    */     
/* 32 */     for (b = 0; b < 3; b++) {
/* 33 */       for (byte b1 = 0; b1 < 9; b1++) {
/* 34 */         this.i.add(new dl(this, paramfy1, b1 + (b + 1) * 9, 8 + b1 * 18, 103 + b * 18 + j));
/*    */       }
/*    */     } 
/* 37 */     for (b = 0; b < 9; b++) {
/* 38 */       this.i.add(new dl(this, paramfy1, b, 8 + b * 18, 161 + j));
/*    */     }
/*    */   }
/*    */   
/*    */   protected void j() {
/* 43 */     this.g.b(this.l.b(), 8, 6, 4210752);
/* 44 */     this.g.b(this.k.b(), 8, this.h - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat) {
/* 48 */     int i = this.b.n.a("/gui/container.png");
/* 49 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 50 */     this.b.n.b(i);
/* 51 */     int j = (this.c - this.a) / 2;
/* 52 */     int k = (this.d - this.h) / 2;
/* 53 */     b(j, k, 0, 0, this.a, this.m * 18 + 17);
/* 54 */     b(j, k + this.m * 18 + 17, 0, 126, this.a, 96);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\du.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */