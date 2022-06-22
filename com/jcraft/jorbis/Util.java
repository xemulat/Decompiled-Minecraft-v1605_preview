/*    */ package com.jcraft.jorbis;
/*    */ 
/*    */ class Util {
/*    */   static int ilog(int paramInt) {
/*  5 */     byte b = 0;
/*  6 */     while (paramInt != 0) {
/*  7 */       b++;
/*  8 */       paramInt >>>= 1;
/*    */     } 
/* 10 */     return b;
/*    */   }
/*    */   
/*    */   static int ilog2(int paramInt) {
/* 14 */     byte b = 0;
/* 15 */     while (paramInt > 1) {
/* 16 */       b++;
/* 17 */       paramInt >>>= 1;
/*    */     } 
/* 19 */     return b;
/*    */   }
/*    */   
/*    */   static int icount(int paramInt) {
/* 23 */     int i = 0;
/* 24 */     while (paramInt != 0) {
/* 25 */       i += paramInt & 0x1;
/* 26 */       paramInt >>>= 1;
/*    */     } 
/* 28 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Util.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */