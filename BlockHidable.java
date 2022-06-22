/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockHidable
/*    */   extends eu
/*    */ {
/*    */   private boolean hide = false;
/*    */   private int texID;
/*    */   
/*    */   public BlockHidable(int paramInt1, int paramInt2, fs paramfs, boolean paramBoolean) {
/* 12 */     super(paramInt1, paramInt2, paramfs, paramBoolean);
/* 13 */     this.texID = paramInt2;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int paramInt) {
/* 18 */     return this.hide ? 160 : this.texID;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/* 24 */     this.hide = !this.hide;
/* 25 */     System.out.println("Toggled block: " + this.hide);
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\BlockHidable.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */