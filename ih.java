/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ih
/*    */ {
/*    */   public float a;
/*    */   private double f;
/*    */   public int b;
/*    */   public float c;
/* 13 */   public float d = 1.0F;
/* 14 */   public float e = 0.0F;
/*    */   
/*    */   private long g;
/*    */   private long h;
/* 18 */   private double i = 1.0D;
/*    */ 
/*    */   
/*    */   public ih(float paramFloat) {
/* 22 */     this.a = paramFloat;
/* 23 */     this.g = System.currentTimeMillis();
/* 24 */     this.h = System.nanoTime() / 1000000L;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 29 */     long l1 = System.currentTimeMillis();
/* 30 */     long l2 = l1 - this.g;
/* 31 */     long l3 = System.nanoTime() / 1000000L;
/*    */     
/* 33 */     if (l2 > 1000L) {
/*    */       
/* 35 */       long l = l3 - this.h;
/*    */       
/* 37 */       double d = l2 / l;
/* 38 */       this.i += (d - this.i) * 0.20000000298023224D;
/*    */       
/* 40 */       this.g = l1;
/* 41 */       this.h = l3;
/*    */     } 
/* 43 */     if (l2 < 0L) {
/*    */       
/* 45 */       this.g = l1;
/* 46 */       this.h = l3;
/*    */     } 
/*    */ 
/*    */     
/* 50 */     double d1 = l3 / 1000.0D;
/* 51 */     double d2 = (d1 - this.f) * this.i;
/* 52 */     this.f = d1;
/*    */     
/* 54 */     if (d2 < 0.0D) d2 = 0.0D; 
/* 55 */     if (d2 > 1.0D) d2 = 1.0D;
/*    */     
/* 57 */     this.e = (float)(this.e + d2 * this.d * this.a);
/*    */     
/* 59 */     this.b = (int)this.e;
/* 60 */     this.e -= this.b;
/* 61 */     if (this.b > 10) this.b = 10; 
/* 62 */     this.c = this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ih.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */