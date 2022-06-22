/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lj
/*    */   extends bd
/*    */ {
/*    */   private bd h;
/*  9 */   protected String a = "Controls";
/*    */   private fi i;
/* 11 */   private int k = -1;
/*    */ 
/*    */   
/*    */   public lj(bd parambd, fi paramfi) {
/* 15 */     this.h = parambd;
/* 16 */     this.i = paramfi;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 21 */     for (byte b = 0; b < this.i.s.length; b++)
/*    */     {
/* 23 */       this.e.add(new n(b, this.c / 2 - 155 + b % 2 * 160, this.d / 6 + 24 * (b >> 1), this.i.a(b)));
/*    */     }
/*    */     
/* 26 */     this.e.add(new fb(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(fb paramfb) {
/* 31 */     for (byte b = 0; b < this.i.s.length; b++)
/*    */     {
/* 33 */       ((fb)this.e.get(b)).c = this.i.a(b);
/*    */     }
/* 35 */     if (paramfb.d == 200) {
/*    */       
/* 37 */       this.b.a(this.h);
/*    */     }
/*    */     else {
/*    */       
/* 41 */       this.k = paramfb.d;
/* 42 */       paramfb.c = "> " + this.i.a(paramfb.d) + " <";
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {
/* 48 */     if (this.k >= 0) {
/*    */       
/* 50 */       this.i.a(this.k, paramInt);
/* 51 */       ((fb)this.e.get(this.k)).c = this.i.a(this.k);
/* 52 */       this.k = -1;
/*    */     }
/*    */     else {
/*    */       
/* 56 */       super.a(paramChar, paramInt);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 62 */     i();
/* 63 */     a(this.g, this.a, this.c / 2, 20, 16777215);
/* 64 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */