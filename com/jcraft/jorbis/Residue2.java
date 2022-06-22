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
/*    */ class Residue2
/*    */   extends Residue0
/*    */ {
/*    */   int inverse(Block paramBlock, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
/* 32 */     byte b = 0;
/* 33 */     for (b = 0; b < paramInt && 
/* 34 */       paramArrayOfint[b] == 0; b++);
/*    */     
/* 36 */     if (b == paramInt) {
/* 37 */       return 0;
/*    */     }
/* 39 */     return _2inverse(paramBlock, paramObject, paramArrayOffloat, paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Residue2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */