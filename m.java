/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class m
/*    */ {
/*  7 */   private String[][] a = new String[][] { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
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
/* 23 */   private Object[][] b = new Object[][] { { dd.aD, ln.ar, dd.m, dd.l, dd.n }, { dd.T, dd.X, dd.ab, dd.af, dd.aj }, { dd.U, dd.Y, dd.ac, dd.ag, dd.ak }, { dd.V, dd.Z, dd.ad, dd.ah, dd.al }, { dd.W, dd.aa, dd.ae, dd.ai, dd.am } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dq paramdq) {
/* 32 */     for (byte b = 0; b < (this.b[0]).length; b++) {
/* 33 */       Object object = this.b[0][b];
/*    */       
/* 35 */       for (byte b1 = 0; b1 < this.b.length - 1; b1++) {
/* 36 */         dd dd = (dd)this.b[b1 + 1][b];
/*    */         
/* 38 */         paramdq.a(new eo(dd), new Object[] { this.a[b1], Character.valueOf('X'), object });
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */