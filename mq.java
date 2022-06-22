/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mq
/*    */ {
/*  7 */   private String[][] a = new String[][] { { "X", "X", "#" } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 13 */   private Object[][] b = new Object[][] { { ln.x, ln.w, dd.m, dd.l, dd.n }, { dd.p, dd.t, dd.o, dd.x, dd.E } };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dq paramdq) {
/* 19 */     for (byte b = 0; b < (this.b[0]).length; b++) {
/* 20 */       Object object = this.b[0][b];
/*    */       
/* 22 */       for (byte b1 = 0; b1 < this.b.length - 1; b1++) {
/* 23 */         dd dd = (dd)this.b[b1 + 1][b];
/* 24 */         paramdq.a(new eo(dd), new Object[] { this.a[b1], Character.valueOf('#'), dd.B, Character.valueOf('X'), object });
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     paramdq.a(new eo(dd.i, 1), new Object[] { " #X", "# X", " #X", Character.valueOf('X'), dd.I, Character.valueOf('#'), dd.B });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     paramdq.a(new eo(dd.j, 4), new Object[] { "X", "#", "Y", Character.valueOf('Y'), dd.J, Character.valueOf('X'), dd.an, Character.valueOf('#'), dd.B });
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */