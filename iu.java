/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class iu
/*    */   extends jx
/*    */ {
/* 11 */   public int a = 0;
/*    */   
/*    */   public iu(cj paramcj) {
/* 14 */     super(paramcj);
/* 15 */     this.aa = true;
/* 16 */     a(0.98F, 0.98F);
/* 17 */     this.ay = this.aA / 2.0F;
/*    */   }
/*    */   
/*    */   public iu(cj paramcj, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 21 */     this(paramcj);
/*    */     
/* 23 */     a(paramFloat1, paramFloat2, paramFloat3);
/*    */     
/* 25 */     float f = (float)(Math.random() * 3.1415927410125732D * 2.0D);
/* 26 */     this.ak = (-ei.a(f * 3.1415927F / 180.0F) * 0.02F);
/* 27 */     this.al = 0.20000000298023224D;
/* 28 */     this.am = (-ei.b(f * 3.1415927F / 180.0F) * 0.02F);
/*    */     
/* 30 */     this.aD = false;
/* 31 */     this.a = 80;
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
/* 43 */     this.ae = this.ah;
/* 44 */     this.af = this.ai;
/* 45 */     this.ag = this.aj;
/*    */     
/* 47 */     this.al -= 0.03999999910593033D;
/* 48 */     c(this.ak, this.al, this.am);
/* 49 */     this.ak *= 0.9800000190734863D;
/* 50 */     this.al *= 0.9800000190734863D;
/* 51 */     this.am *= 0.9800000190734863D;
/*    */     
/* 53 */     if (this.as) {
/* 54 */       this.ak *= 0.699999988079071D;
/* 55 */       this.am *= 0.699999988079071D;
/* 56 */       this.al *= -0.5D;
/*    */     } 
/*    */     
/* 59 */     if (this.a-- <= 0) {
/* 60 */       D();
/* 61 */       i();
/*    */     } else {
/* 63 */       this.ad.a("smoke", this.ah, this.ai + 0.5D, this.aj, 0.0D, 0.0D, 0.0D);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void i() {
/* 69 */     float f = 4.0F;
/* 70 */     this.ad.a((jx)null, this.ah, this.ai, this.aj, f);
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
/*    */ 
/*    */   
/*    */   protected void a(hc paramhc) {
/* 85 */     paramhc.a("Fuse", (byte)this.a);
/*    */   }
/*    */   
/*    */   protected void b(hc paramhc) {
/* 89 */     this.a = paramhc.c("Fuse");
/*    */   }
/*    */   
/*    */   public float h_() {
/* 93 */     return 0.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\iu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */