/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ku
/*    */ {
/*  7 */   private Object[][] a = new Object[][] { { ln.ah, dd.n }, { ln.ai, dd.m }, { ln.ax, dd.l } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dq paramdq) {
/* 14 */     for (byte b = 0; b < this.a.length; b++) {
/*    */       
/* 16 */       ln ln = (ln)this.a[b][0];
/* 17 */       dd dd = (dd)this.a[b][1];
/* 18 */       paramdq.a(new eo(ln), new Object[] { "###", "###", "###", Character.valueOf('#'), dd });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 25 */       paramdq.a(new eo(dd, 9), new Object[] { "#", Character.valueOf('#'), ln });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ku.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */