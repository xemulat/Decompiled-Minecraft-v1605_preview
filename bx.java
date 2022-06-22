/*    */ 
/*    */ 
/*    */ public class bx
/*    */   extends cn
/*    */ {
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  7 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */     
/*  9 */     float f1 = ei.a(this.j * 3.1415927F);
/* 10 */     float f2 = ei.a((1.0F - (1.0F - this.j) * (1.0F - this.j)) * 3.1415927F);
/* 11 */     this.d.f = 0.0F;
/* 12 */     this.e.f = 0.0F;
/* 13 */     this.d.e = -(0.1F - f1 * 0.6F);
/* 14 */     this.e.e = 0.1F - f1 * 0.6F;
/* 15 */     this.d.d = -1.5707964F;
/* 16 */     this.e.d = -1.5707964F;
/* 17 */     this.d.d -= f1 * 1.2F - f2 * 0.4F;
/* 18 */     this.e.d -= f1 * 1.2F - f2 * 0.4F;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.d.f += ei.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 24 */     this.e.f -= ei.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 25 */     this.d.d += ei.a(paramFloat3 * 0.067F) * 0.05F;
/* 26 */     this.e.d -= ei.a(paramFloat3 * 0.067F) * 0.05F;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */