/*    */ 
/*    */ public class mi
/*    */ {
/*    */   public final byte[] a;
/*    */   
/*    */   public mi(int paramInt) {
/*  7 */     this.a = new byte[paramInt >> 1];
/*    */   }
/*    */   
/*    */   public mi(byte[] paramArrayOfbyte) {
/* 11 */     this.a = paramArrayOfbyte;
/*    */   }
/*    */   
/*    */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/* 15 */     int i = paramInt1 << 11 | paramInt3 << 7 | paramInt2;
/* 16 */     int j = i >> 1;
/* 17 */     int k = i & 0x1;
/*    */     
/* 19 */     if (k == 0) {
/* 20 */       return this.a[j] & 0xF;
/*    */     }
/* 22 */     return this.a[j] >> 4 & 0xF;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 27 */     int i = paramInt1 << 11 | paramInt3 << 7 | paramInt2;
/*    */     
/* 29 */     int j = i >> 1;
/* 30 */     int k = i & 0x1;
/*    */     
/* 32 */     if (k == 0) {
/* 33 */       this.a[j] = (byte)(this.a[j] & 0xF0 | paramInt4 & 0xF);
/*    */     } else {
/* 35 */       this.a[j] = (byte)(this.a[j] & 0xF | (paramInt4 & 0xF) << 4);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 40 */     return (this.a != null);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */