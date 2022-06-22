/*    */ 
/*    */ 
/*    */ public class nn
/*    */   extends ht
/*    */ {
/*  6 */   public String[] a = new String[] { "", "", "", "" };
/*  7 */   public int b = -1;
/*    */   
/*    */   public void b(hc paramhc) {
/* 10 */     super.b(paramhc);
/* 11 */     paramhc.a("Text1", this.a[0]);
/* 12 */     paramhc.a("Text2", this.a[1]);
/* 13 */     paramhc.a("Text3", this.a[2]);
/* 14 */     paramhc.a("Text4", this.a[3]);
/*    */   }
/*    */   
/*    */   public void a(hc paramhc) {
/* 18 */     super.a(paramhc);
/* 19 */     for (byte b = 0; b < 4; b++) {
/* 20 */       this.a[b] = paramhc.i("Text" + (b + 1));
/* 21 */       if (this.a[b].length() > 15) this.a[b] = this.a[b].substring(0, 15); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */