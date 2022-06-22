/*    */ package com.jcraft.jorbis;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Residue1
/*    */   extends Residue0
/*    */ {
/*    */   int inverse(Block paramBlock, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
/* 32 */     byte b1 = 0;
/* 33 */     for (byte b2 = 0; b2 < paramInt; b2++) {
/* 34 */       if (paramArrayOfint[b2] != 0) {
/* 35 */         paramArrayOffloat[b1++] = paramArrayOffloat[b2];
/*    */       }
/*    */     } 
/* 38 */     if (b1 != 0) {
/* 39 */       return _01inverse(paramBlock, paramObject, paramArrayOffloat, b1, 1);
/*    */     }
/*    */     
/* 42 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Residue1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */