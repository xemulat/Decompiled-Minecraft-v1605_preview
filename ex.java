/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ex
/*    */   extends jx
/*    */ {
/*    */   public int a;
/* 13 */   public int b = 0;
/*    */   
/*    */   public ex(cj paramcj) {
/* 16 */     super(paramcj);
/*    */   }
/*    */   
/*    */   public ex(cj paramcj, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) {
/* 20 */     super(paramcj);
/* 21 */     this.a = paramInt;
/* 22 */     this.aa = true;
/* 23 */     a(0.98F, 0.98F);
/* 24 */     this.ay = this.aA / 2.0F;
/* 25 */     a(paramFloat1, paramFloat2, paramFloat3);
/*    */     
/* 27 */     this.ak = 0.0D;
/* 28 */     this.al = 0.0D;
/* 29 */     this.am = 0.0D;
/*    */     
/* 31 */     this.aD = false;
/*    */     
/* 33 */     this.ae = paramFloat1;
/* 34 */     this.af = paramFloat2;
/* 35 */     this.ag = paramFloat3;
/*    */   }
/*    */   
/*    */   public boolean c_() {
/* 39 */     return !this.ax;
/*    */   }
/*    */   
/*    */   public void e_() {
/* 43 */     if (this.a == 0) {
/* 44 */       D();
/*    */       
/*    */       return;
/*    */     } 
/* 48 */     this.ae = this.ah;
/* 49 */     this.af = this.ai;
/* 50 */     this.ag = this.aj;
/* 51 */     this.b++;
/*    */     
/* 53 */     this.al -= 0.03999999910593033D;
/* 54 */     c(this.ak, this.al, this.am);
/* 55 */     this.ak *= 0.9800000190734863D;
/* 56 */     this.al *= 0.9800000190734863D;
/* 57 */     this.am *= 0.9800000190734863D;
/*    */     
/* 59 */     int i = ei.b(this.ah);
/* 60 */     int j = ei.b(this.ai);
/* 61 */     int k = ei.b(this.aj);
/* 62 */     if (this.ad.a(i, j, k) == this.a) {
/* 63 */       this.ad.d(i, j, k, 0);
/*    */     }
/*    */     
/* 66 */     if (this.as) {
/* 67 */       this.ak *= 0.699999988079071D;
/* 68 */       this.am *= 0.699999988079071D;
/* 69 */       this.al *= -0.5D;
/*    */       
/* 71 */       D();
/*    */       
/* 73 */       if (!this.ad.a(this.a, i, j, k, true) || !this.ad.d(i, j, k, this.a))
/*    */       {
/* 75 */         b(this.a, 1);
/*    */       }
/* 77 */     } else if (this.b > 100) {
/* 78 */       b(this.a, 1);
/* 79 */       D();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(hc paramhc) {
/* 85 */     paramhc.a("Tile", (byte)this.a);
/*    */   }
/*    */   
/*    */   protected void b(hc paramhc) {
/* 89 */     this.a = paramhc.c("Tile") & 0xFF;
/*    */   }
/*    */   
/*    */   public float h_() {
/* 93 */     return 0.0F;
/*    */   }
/*    */   
/*    */   public cj i() {
/* 97 */     return this.ad;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ex.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */