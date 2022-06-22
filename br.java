/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class br
/*    */ {
/*    */   private int b;
/*    */   private int c;
/*    */   private int[] d;
/*    */   private eo e;
/*    */   public final int a;
/*    */   
/*    */   public br(int paramInt1, int paramInt2, int[] paramArrayOfint, eo parameo) {
/* 14 */     this.a = parameo.c;
/* 15 */     this.b = paramInt1;
/* 16 */     this.c = paramInt2;
/* 17 */     this.d = paramArrayOfint;
/* 18 */     this.e = parameo;
/*    */   }
/*    */   
/*    */   public boolean a(int[] paramArrayOfint) {
/* 22 */     for (byte b = 0; b <= 3 - this.b; b++) {
/* 23 */       for (byte b1 = 0; b1 <= 3 - this.c; b1++) {
/* 24 */         if (a(paramArrayOfint, b, b1, true)) return true; 
/* 25 */         if (a(paramArrayOfint, b, b1, false)) return true; 
/*    */       } 
/*    */     } 
/* 28 */     return false;
/*    */   }
/*    */   
/*    */   private boolean a(int[] paramArrayOfint, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 32 */     for (byte b = 0; b < 3; b++) {
/* 33 */       for (byte b1 = 0; b1 < 3; b1++) {
/* 34 */         int i = b - paramInt1;
/* 35 */         int j = b1 - paramInt2;
/* 36 */         int k = -1;
/* 37 */         if (i >= 0 && j >= 0 && i < this.b && j < this.c)
/* 38 */           if (paramBoolean) { k = this.d[this.b - i - 1 + j * this.b]; }
/* 39 */           else { k = this.d[i + j * this.b]; }
/*    */            
/* 41 */         if (paramArrayOfint[b + b1 * 3] != k) return false; 
/*    */       } 
/*    */     } 
/* 44 */     return true;
/*    */   }
/*    */   
/*    */   public eo b(int[] paramArrayOfint) {
/* 48 */     return new eo(this.e.c, this.e.a);
/*    */   }
/*    */   
/*    */   public int a() {
/* 52 */     return this.b * this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\br.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */