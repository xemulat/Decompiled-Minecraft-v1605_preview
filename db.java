/*    */ 
/*    */ 
/*    */ 
/*    */ public class db
/*    */   extends bd
/*    */ {
/*    */   private go a;
/*  8 */   private int h = 0;
/*    */   
/*    */   public db(go paramgo) {
/* 11 */     this.a = paramgo;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {}
/*    */   
/*    */   public void a() {
/* 18 */     this.e.clear();
/*    */   }
/*    */   
/*    */   public void g() {
/* 22 */     this.h++;
/* 23 */     if (this.h % 20 == 0) {
/* 24 */       this.a.a(new fz());
/*    */     }
/* 26 */     if (this.a != null) {
/* 27 */       this.a.a();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(fb paramfb) {}
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 35 */     b(0);
/*    */     
/* 37 */     a(this.g, "Downloading terrain", this.c / 2, this.d / 2 - 50, 16777215);
/*    */     
/* 39 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\db.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */