/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class au
/*    */   extends bd
/*    */ {
/*    */   private bd h;
/*  9 */   protected String a = "Options";
/*    */   
/*    */   private fi i;
/*    */   
/*    */   public au(bd parambd, fi paramfi) {
/* 14 */     this.h = parambd;
/* 15 */     this.i = paramfi;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 20 */     for (byte b = 0; b < this.i.u; b++)
/*    */     {
/* 22 */       this.e.add(new n(b, this.c / 2 - 155 + b % 2 * 160, this.d / 6 + 24 * (b >> 1), this.i.b(b)));
/*    */     }
/*    */     
/* 25 */     this.e.add(new fb(100, this.c / 2 - 100, this.d / 6 + 120 + 12, "Controls..."));
/* 26 */     this.e.add(new fb(200, this.c / 2 - 100, this.d / 6 + 168, "Done"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(fb paramfb) {
/* 31 */     if (!paramfb.e)
/* 32 */       return;  if (paramfb.d < 100) {
/*    */       
/* 34 */       this.i.b(paramfb.d, 1);
/* 35 */       paramfb.c = this.i.b(paramfb.d);
/*    */     } 
/* 37 */     if (paramfb.d == 100)
/*    */     {
/* 39 */       this.b.a(new lj(this, this.i));
/*    */     }
/* 41 */     if (paramfb.d == 200)
/*    */     {
/* 43 */       this.b.a(this.h);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 49 */     i();
/* 50 */     a(this.g, this.a, this.c / 2, 20, 16777215);
/* 51 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\au.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */