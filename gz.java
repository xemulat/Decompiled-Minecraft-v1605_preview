/*    */ 
/*    */ 
/*    */ public class gz
/*    */   extends ff
/*    */ {
/*  6 */   public if[] a = new if[7];
/*    */   
/*    */   public gz() {
/*  9 */     this.a[0] = new if(0, 10);
/* 10 */     this.a[1] = new if(0, 0);
/* 11 */     this.a[2] = new if(0, 0);
/* 12 */     this.a[3] = new if(0, 0);
/* 13 */     this.a[4] = new if(0, 0);
/* 14 */     this.a[5] = new if(44, 10);
/*    */     
/* 16 */     byte b1 = 20;
/* 17 */     byte b2 = 8;
/* 18 */     byte b3 = 16;
/* 19 */     byte b4 = 4;
/*    */     
/* 21 */     this.a[0].a((-b1 / 2), (-b3 / 2), -1.0F, b1, b3, 2, 0.0F);
/* 22 */     this.a[0].a(0.0F, (0 + b4), 0.0F);
/*    */     
/* 24 */     this.a[5].a((-b1 / 2 + 1), (-b3 / 2 + 1), -1.0F, b1 - 2, b3 - 2, 1, 0.0F);
/* 25 */     this.a[5].a(0.0F, (0 + b4), 0.0F);
/*    */     
/* 27 */     this.a[1].a((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
/* 28 */     this.a[1].a((-b1 / 2 + 1), (0 + b4), 0.0F);
/*    */     
/* 30 */     this.a[2].a((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
/* 31 */     this.a[2].a((b1 / 2 - 1), (0 + b4), 0.0F);
/*    */     
/* 33 */     this.a[3].a((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
/* 34 */     this.a[3].a(0.0F, (0 + b4), (-b3 / 2 + 1));
/*    */     
/* 36 */     this.a[4].a((-b1 / 2 + 2), (-b2 - 1), -1.0F, b1 - 4, b2, 2, 0.0F);
/* 37 */     this.a[4].a(0.0F, (0 + b4), (b3 / 2 - 1));
/*    */     
/* 39 */     (this.a[0]).d = 1.5707964F;
/* 40 */     (this.a[1]).e = 4.712389F;
/* 41 */     (this.a[2]).e = 1.5707964F;
/* 42 */     (this.a[3]).e = 3.1415927F;
/* 43 */     (this.a[5]).d = -1.5707964F;
/*    */   }
/*    */   
/*    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 47 */     (this.a[5]).b = 4.0F - paramFloat3;
/* 48 */     for (byte b = 0; b < 6; b++)
/* 49 */       this.a[b].a(paramFloat6); 
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */