/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ca
/*    */   extends nd
/*    */ {
/*    */   private jx a;
/*    */   private jx o;
/* 14 */   private int p = 0;
/* 15 */   private int q = 0;
/*    */   private float r;
/*    */   
/*    */   public ca(cj paramcj, jx paramjx1, jx paramjx2, float paramFloat) {
/* 19 */     super(paramcj, paramjx1.ah, paramjx1.ai, paramjx1.aj, paramjx1.ak, paramjx1.al, paramjx1.am);
/* 20 */     this.a = paramjx1;
/* 21 */     this.o = paramjx2;
/* 22 */     this.q = 3;
/* 23 */     this.r = paramFloat;
/*    */   }
/*    */   
/*    */   public void a(he paramhe, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 27 */     float f1 = (this.p + paramFloat1) / this.q;
/* 28 */     f1 *= f1;
/*    */     
/* 30 */     double d1 = this.a.ah;
/* 31 */     double d2 = this.a.ai;
/* 32 */     double d3 = this.a.aj;
/*    */     
/* 34 */     double d4 = this.o.aF + (this.o.ah - this.o.aF) * paramFloat1;
/* 35 */     double d5 = this.o.aG + (this.o.ai - this.o.aG) * paramFloat1 + this.r;
/* 36 */     double d6 = this.o.aH + (this.o.aj - this.o.aH) * paramFloat1;
/*    */     
/* 38 */     double d7 = d1 + (d4 - d1) * f1;
/* 39 */     double d8 = d2 + (d5 - d2) * f1;
/* 40 */     double d9 = d3 + (d6 - d3) * f1;
/*    */     
/* 42 */     int i = ei.b(d7);
/* 43 */     int j = ei.b(d8 + (this.ay / 2.0F));
/* 44 */     int k = ei.b(d9);
/* 45 */     float f2 = this.ad.c(i, j, k);
/*    */     
/* 47 */     d7 -= l;
/* 48 */     d8 -= m;
/* 49 */     d9 -= n;
/*    */     
/* 51 */     GL11.glColor4f(f2, f2, f2, 1.0F);
/* 52 */     km.a.a(this.a, (float)d7, (float)d8, (float)d9, this.a.an, paramFloat1);
/*    */   }
/*    */   
/*    */   public void e_() {
/* 56 */     this.p++;
/* 57 */     if (this.p == this.q) D(); 
/*    */   }
/*    */   
/*    */   public int c() {
/* 61 */     return 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ca.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */