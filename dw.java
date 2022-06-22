/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dw
/*    */   extends dd
/*    */ {
/*    */   private fs a;
/*    */   
/*    */   public dw(int paramInt, fs paramfs) {
/* 13 */     super(paramInt);
/* 14 */     this.a = paramfs;
/* 15 */     this.aS = 64;
/* 16 */     this.aR = 1;
/*    */   }
/*    */   public boolean a(eo parameo, dg paramdg, cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     ln ln;
/* 20 */     if (paramInt4 != 1) return false; 
/* 21 */     paramInt2++;
/*    */ 
/*    */ 
/*    */     
/* 25 */     if (this.a == fs.c) { ln = ln.aE; }
/* 26 */     else { ln = ln.aL; }
/*    */     
/* 28 */     if (!ln.a(paramcj, paramInt1, paramInt2, paramInt3)) return false;
/*    */     
/* 30 */     int i = ei.b(((paramdg.an + 180.0F) * 4.0F / 360.0F) - 0.5D) & 0x3;
/*    */     
/* 32 */     byte b1 = 0;
/* 33 */     byte b2 = 0;
/* 34 */     if (i == 0) b2 = 1; 
/* 35 */     if (i == 1) b1 = -1; 
/* 36 */     if (i == 2) b2 = -1; 
/* 37 */     if (i == 3) b1 = 1;
/*    */ 
/*    */     
/* 40 */     int j = (paramcj.g(paramInt1 - b1, paramInt2, paramInt3 - b2) ? 1 : 0) + (paramcj.g(paramInt1 - b1, paramInt2 + 1, paramInt3 - b2) ? 1 : 0);
/* 41 */     int k = (paramcj.g(paramInt1 + b1, paramInt2, paramInt3 + b2) ? 1 : 0) + (paramcj.g(paramInt1 + b1, paramInt2 + 1, paramInt3 + b2) ? 1 : 0);
/*    */     
/* 43 */     boolean bool1 = (paramcj.a(paramInt1 - b1, paramInt2, paramInt3 - b2) == ln.ba || paramcj.a(paramInt1 - b1, paramInt2 + 1, paramInt3 - b2) == ln.ba) ? true : false;
/* 44 */     boolean bool2 = (paramcj.a(paramInt1 + b1, paramInt2, paramInt3 + b2) == ln.ba || paramcj.a(paramInt1 + b1, paramInt2 + 1, paramInt3 + b2) == ln.ba) ? true : false;
/*    */     
/* 46 */     boolean bool3 = false;
/* 47 */     if (bool1 && !bool2) { bool3 = true; }
/* 48 */     else if (k > j) { bool3 = true; }
/*    */     
/* 50 */     if (bool3) {
/* 51 */       i = i - 1 & 0x3;
/* 52 */       i += 4;
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     paramcj.d(paramInt1, paramInt2, paramInt3, ln.ba);
/* 59 */     paramcj.b(paramInt1, paramInt2, paramInt3, i);
/*    */     
/* 61 */     paramcj.d(paramInt1, paramInt2 + 1, paramInt3, ln.ba);
/* 62 */     paramcj.b(paramInt1, paramInt2 + 1, paramInt3, i + 8);
/*    */     
/* 64 */     parameo.a--;
/* 65 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */