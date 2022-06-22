/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class la
/*    */ {
/*    */   public dx[] a;
/*  8 */   public int b = 0;
/*    */   private boolean c = false;
/*    */   
/*    */   public la(dx[] paramArrayOfdx) {
/* 12 */     this.a = paramArrayOfdx;
/* 13 */     this.b = paramArrayOfdx.length;
/*    */   }
/*    */   
/*    */   public la(dx[] paramArrayOfdx, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 17 */     this(paramArrayOfdx);
/*    */     
/* 19 */     float f1 = 0.0015625F;
/* 20 */     float f2 = 0.003125F;
/* 21 */     paramArrayOfdx[0] = paramArrayOfdx[0].a(paramInt3 / 64.0F - f1, paramInt2 / 32.0F + f2);
/* 22 */     paramArrayOfdx[1] = paramArrayOfdx[1].a(paramInt1 / 64.0F + f1, paramInt2 / 32.0F + f2);
/* 23 */     paramArrayOfdx[2] = paramArrayOfdx[2].a(paramInt1 / 64.0F + f1, paramInt4 / 32.0F - f2);
/* 24 */     paramArrayOfdx[3] = paramArrayOfdx[3].a(paramInt3 / 64.0F - f1, paramInt4 / 32.0F - f2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 37 */     dx[] arrayOfDx = new dx[this.a.length];
/* 38 */     for (byte b = 0; b < this.a.length; b++)
/* 39 */       arrayOfDx[b] = this.a[this.a.length - b - 1]; 
/* 40 */     this.a = arrayOfDx;
/*    */   }
/*    */   
/*    */   public void a(he paramhe, float paramFloat) {
/* 44 */     ah ah1 = (this.a[1]).a.a((this.a[0]).a);
/* 45 */     ah ah2 = (this.a[1]).a.a((this.a[2]).a);
/* 46 */     ah ah3 = ah2.b(ah1).b();
/*    */     
/* 48 */     paramhe.b();
/* 49 */     if (this.c) {
/* 50 */       paramhe.b(-((float)ah3.a), -((float)ah3.b), -((float)ah3.c));
/*    */     } else {
/* 52 */       paramhe.b((float)ah3.a, (float)ah3.b, (float)ah3.c);
/*    */     } 
/*    */     
/* 55 */     for (byte b = 0; b < 4; b++) {
/* 56 */       dx dx1 = this.a[b];
/* 57 */       paramhe.a(((float)dx1.a.a * paramFloat), ((float)dx1.a.b * paramFloat), ((float)dx1.a.c * paramFloat), dx1.b, dx1.c);
/*    */     } 
/* 59 */     paramhe.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\la.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */