/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mt
/*    */   extends ln
/*    */ {
/*    */   protected mt(int paramInt) {
/* 12 */     super(paramInt, fs.j);
/* 13 */     this.aZ = 48;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 18 */     byte b = 2;
/* 19 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 20 */       for (int j = paramInt2 - b; j <= paramInt2 + b; j++) {
/* 21 */         for (int k = paramInt3 - b; k <= paramInt3 + b; k++) {
/*    */           
/* 23 */           if (paramcj.f(i, j, k) == fs.f);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 32 */     byte b = 2;
/* 33 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 34 */       for (int j = paramInt2 - b; j <= paramInt2 + b; j++) {
/* 35 */         for (int k = paramInt3 - b; k <= paramInt3 + b; k++)
/*    */         {
/* 37 */           paramcj.g(i, j, k, paramcj.a(i, j, k));
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */