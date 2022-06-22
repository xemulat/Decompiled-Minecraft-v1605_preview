/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dm
/*    */ {
/*  7 */   private String[][] a = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
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
/* 25 */   private Object[][] b = new Object[][] { { ln.x, ln.w, dd.m, dd.l, dd.n }, { dd.r, dd.v, dd.e, dd.z, dd.G }, { dd.q, dd.u, dd.d, dd.y, dd.F }, { dd.s, dd.w, dd.f, dd.A, dd.H }, { dd.L, dd.M, dd.N, dd.O, dd.P } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dq paramdq) {
/* 34 */     for (byte b = 0; b < (this.b[0]).length; b++) {
/* 35 */       Object object = this.b[0][b];
/*    */       
/* 37 */       for (byte b1 = 0; b1 < this.b.length - 1; b1++) {
/* 38 */         dd dd = (dd)this.b[b1 + 1][b];
/* 39 */         paramdq.a(new eo(dd), new Object[] { this.a[b1], Character.valueOf('#'), dd.B, Character.valueOf('X'), object });
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */