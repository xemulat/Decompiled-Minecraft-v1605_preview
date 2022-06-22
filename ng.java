/*    */ 
/*    */ public class ng
/*    */   extends dg
/*    */ {
/*    */   private int bd;
/*    */   private double be;
/*    */   private double bf;
/*    */   private double bg;
/*    */   private double bh;
/*    */   private double bi;
/*    */   float a;
/*    */   
/*    */   public ng(cj paramcj, String paramString) {
/* 14 */     super(paramcj);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     this.a = 0.0F; this.i = paramString; this.ay = 0.0F; this.aJ = 0.0F; if (paramString != null && paramString.length() > 0) {
/*    */       this.aV = "file:///C:/skincache/" + paramString + ".png"; System.out.println("Loading texture " + this.aV);
/*    */     }  this.aK = true;
/* 48 */   } public boolean a(jx paramjx, int paramInt) { return true; } public void e_() { super.e_();
/*    */ 
/*    */     
/* 51 */     this.P = this.Q;
/* 52 */     double d1 = this.ah - this.ae;
/* 53 */     double d2 = this.aj - this.ag;
/* 54 */     float f = ei.a(d1 * d1 + d2 * d2) * 4.0F;
/* 55 */     if (f > 1.0F) f = 1.0F; 
/* 56 */     this.Q += (f - this.Q) * 0.4F;
/* 57 */     this.R += this.Q; }
/*    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) { this.ay = 0.0F; this.be = paramDouble1; this.bf = paramDouble2; this.bg = paramDouble3;
/*    */     this.bh = paramFloat1;
/*    */     this.bi = paramFloat2;
/* 61 */     this.bd = paramInt; } public float h_() { return 0.0F; }
/*    */ 
/*    */   
/*    */   public void i() {
/* 65 */     b_();
/* 66 */     if (this.bd > 0) {
/* 67 */       double d1 = this.ah + (this.be - this.ah) / this.bd;
/* 68 */       double d2 = this.ai + (this.bf - this.ai) / this.bd;
/* 69 */       double d3 = this.aj + (this.bg - this.aj) / this.bd;
/*    */       
/* 71 */       double d4 = this.bh - this.an;
/* 72 */       while (d4 < -180.0D)
/* 73 */         d4 += 360.0D; 
/* 74 */       while (d4 >= 180.0D) {
/* 75 */         d4 -= 360.0D;
/*    */       }
/* 77 */       this.an = (float)(this.an + d4 / this.bd);
/* 78 */       this.ao = (float)(this.ao + (this.bi - this.ao) / this.bd);
/*    */       
/* 80 */       this.bd--;
/* 81 */       a(d1, d2, d3);
/* 82 */       c(this.an, this.ao);
/*    */     } 
/* 84 */     this.e = this.f;
/*    */     
/* 86 */     float f1 = ei.a(this.ak * this.ak + this.am * this.am);
/* 87 */     float f2 = (float)Math.atan(-this.al * 0.20000000298023224D) * 15.0F;
/* 88 */     if (f1 > 0.1F) f1 = 0.1F; 
/* 89 */     if (!this.as || this.D <= 0) f1 = 0.0F; 
/* 90 */     if (this.as || this.D <= 0) f2 = 0.0F; 
/* 91 */     this.f += (f1 - this.f) * 0.4F;
/* 92 */     this.L += (f2 - this.L) * 0.8F;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ng.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */