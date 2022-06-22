/*    */ public class eg
/*    */   extends ff
/*    */ {
/*    */   public if a;
/*    */   public if b;
/*    */   public if c;
/*    */   
/*    */   public eg() {
/*  9 */     float f = 0.0F;
/*    */     
/* 11 */     byte b = 4;
/*    */     
/* 13 */     this.a = new if(0, 0);
/* 14 */     this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f);
/* 15 */     this.a.a(0.0F, b, 0.0F);
/*    */     
/* 17 */     this.b = new if(32, 0);
/* 18 */     this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f + 0.5F);
/* 19 */     this.b.a(0.0F, b, 0.0F);
/*    */     
/* 21 */     this.c = new if(16, 16);
/* 22 */     this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, f);
/* 23 */     this.c.a(0.0F, b, 0.0F);
/*    */     
/* 25 */     this.d = new if(0, 16);
/* 26 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 27 */     this.d.a(-2.0F, (12 + b), 4.0F);
/*    */     
/* 29 */     this.e = new if(0, 16);
/* 30 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 31 */     this.e.a(2.0F, (12 + b), 4.0F);
/*    */     
/* 33 */     this.f = new if(0, 16);
/* 34 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 35 */     this.f.a(-2.0F, (12 + b), -4.0F);
/*    */     
/* 37 */     this.g = new if(0, 16);
/* 38 */     this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 39 */     this.g.a(2.0F, (12 + b), -4.0F);
/*    */   }
/*    */   public if d; public if e; public if f; public if g;
/*    */   
/*    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 44 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */     
/* 46 */     this.a.a(paramFloat6);
/* 47 */     this.c.a(paramFloat6);
/* 48 */     this.d.a(paramFloat6);
/* 49 */     this.e.a(paramFloat6);
/* 50 */     this.f.a(paramFloat6);
/* 51 */     this.g.a(paramFloat6);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 56 */     this.a.e = paramFloat4 / 57.295776F;
/* 57 */     this.a.d = paramFloat5 / 57.295776F;
/*    */     
/* 59 */     this.d.d = ei.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
/* 60 */     this.e.d = ei.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
/* 61 */     this.f.d = ei.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
/* 62 */     this.g.d = ei.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\eg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */