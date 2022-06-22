/*    */ public class gw extends ff {
/*    */   public if d;
/*    */   public if e;
/*    */   public if f;
/*    */   
/*    */   public gw(int paramInt, float paramFloat) {
/*  7 */     this.d = new if(0, 0);
/*  8 */     this.d.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, paramFloat);
/*  9 */     this.d.a(0.0F, (18 - paramInt), -6.0F);
/*    */     
/* 11 */     this.e = new if(28, 8);
/* 12 */     this.e.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, paramFloat);
/* 13 */     this.e.a(0.0F, (17 - paramInt), 2.0F);
/*    */     
/* 15 */     this.f = new if(0, 16);
/* 16 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 17 */     this.f.a(-3.0F, (24 - paramInt), 7.0F);
/*    */     
/* 19 */     this.g = new if(0, 16);
/* 20 */     this.g.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 21 */     this.g.a(3.0F, (24 - paramInt), 7.0F);
/*    */     
/* 23 */     this.h = new if(0, 16);
/* 24 */     this.h.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 25 */     this.h.a(-3.0F, (24 - paramInt), -5.0F);
/*    */     
/* 27 */     this.i = new if(0, 16);
/* 28 */     this.i.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 29 */     this.i.a(3.0F, (24 - paramInt), -5.0F);
/*    */   }
/*    */   public if g; public if h; public if i;
/*    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 33 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */     
/* 35 */     this.d.a(paramFloat6);
/* 36 */     this.e.a(paramFloat6);
/* 37 */     this.f.a(paramFloat6);
/* 38 */     this.g.a(paramFloat6);
/* 39 */     this.h.a(paramFloat6);
/* 40 */     this.i.a(paramFloat6);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 44 */     this.d.d = -(paramFloat5 / 57.295776F);
/* 45 */     this.d.e = paramFloat4 / 57.295776F;
/* 46 */     this.e.d = 1.5707964F;
/*    */     
/* 48 */     this.f.d = ei.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
/* 49 */     this.g.d = ei.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
/* 50 */     this.h.d = ei.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
/* 51 */     this.i.d = ei.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */