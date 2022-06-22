/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ public class kp extends be {
/*    */   private go bd;
/*    */   private double be;
/*    */   private double bf;
/*    */   private double bg;
/*    */   private double bh;
/*    */   private float bi;
/*    */   private float bj;
/*    */   
/*    */   public kp(Minecraft paramMinecraft, cj paramcj, df paramdf, go paramgo) {
/* 13 */     super(paramMinecraft, paramcj, paramdf);
/* 14 */     this.bd = paramgo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void e_() {
/* 21 */     super.e_();
/* 22 */     H();
/*    */   }
/*    */   
/*    */   public void m() {
/* 26 */     H();
/*    */   }
/*    */   
/*    */   public void H() {
/* 30 */     double d1 = this.ah - this.be;
/* 31 */     double d2 = this.ar.b - this.bf;
/* 32 */     double d3 = this.ai - this.bg;
/* 33 */     double d4 = this.aj - this.bh;
/*    */     
/* 35 */     double d5 = (this.an - this.bi);
/* 36 */     double d6 = (this.ao - this.bj);
/*    */     
/* 38 */     boolean bool1 = (d2 != 0.0D || d3 != 0.0D || d1 != 0.0D || d4 != 0.0D) ? true : false;
/* 39 */     boolean bool2 = (d5 != 0.0D || d6 != 0.0D) ? true : false;
/*    */     
/* 41 */     if (bool1 && bool2) {
/* 42 */       this.bd.a(new cd(this.ah, this.ar.b, this.ai, this.aj, this.an, this.ao, this.as));
/* 43 */     } else if (bool1) {
/* 44 */       this.bd.a(new r(this.ah, this.ar.b, this.ai, this.aj, this.as));
/* 45 */     } else if (bool2) {
/* 46 */       this.bd.a(new lx(this.an, this.ao, this.as));
/*    */     } else {
/* 48 */       this.bd.a(new eb(this.as));
/*    */     } 
/*    */     
/* 51 */     if (bool1) {
/* 52 */       this.be = this.ah;
/* 53 */       this.bf = this.ar.b;
/* 54 */       this.bg = this.ai;
/* 55 */       this.bh = this.aj;
/*    */     } 
/* 57 */     if (bool2) {
/* 58 */       this.bi = this.an;
/* 59 */       this.bj = this.ao;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void a(dr paramdr) {
/* 64 */     gq gq = new gq(paramdr);
/* 65 */     this.bd.a(gq);
/* 66 */     paramdr.ah = gq.b / 32.0D;
/* 67 */     paramdr.ai = gq.c / 32.0D;
/* 68 */     paramdr.aj = gq.d / 32.0D;
/* 69 */     paramdr.ak = gq.e / 128.0D;
/* 70 */     paramdr.al = gq.f / 128.0D;
/* 71 */     paramdr.am = gq.g / 128.0D;
/*    */   }
/*    */   
/*    */   public void a(String paramString) {
/* 75 */     this.bd.a(new hz(paramString));
/*    */   }
/*    */   
/*    */   public void u() {
/* 79 */     super.u();
/* 80 */     this.bd.a(new gv(this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */