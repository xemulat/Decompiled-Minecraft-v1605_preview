/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ae
/*    */   extends ee
/*    */ {
/*    */   public ae(cj paramcj) {
/* 13 */     super(paramcj);
/*    */   }
/*    */   
/*    */   protected float a(int paramInt1, int paramInt2, int paramInt3) {
/* 17 */     if (this.ad.a(paramInt1, paramInt2 - 1, paramInt3) == ln.u.ba) return 10.0F; 
/* 18 */     return this.ad.c(paramInt1, paramInt2, paramInt3) - 0.5F;
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 22 */     super.a(paramhc);
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 26 */     super.b(paramhc);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 30 */     int i = ei.b(this.ah);
/* 31 */     int j = ei.b(this.ar.b);
/* 32 */     int k = ei.b(this.aj);
/* 33 */     return (this.ad.a(i, j - 1, k) == ln.u.ba && this.ad.j(i, j, k) > 8 && super.a());
/*    */   }
/*    */   
/*    */   public int b() {
/* 37 */     return 120;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */