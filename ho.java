/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ho
/*    */   extends ln
/*    */ {
/*    */   protected ho(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, paramInt2, fs.u);
/* 13 */     b(true);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 17 */     if (paramcj.a(paramInt1, paramInt2 + 1, paramInt3) == 0) {
/* 18 */       byte b = 1;
/* 19 */       while (paramcj.a(paramInt1, paramInt2 - b, paramInt3) == this.ba) {
/* 20 */         b++;
/*    */       }
/* 22 */       if (b < 3) {
/* 23 */         int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 24 */         if (i == 15) {
/* 25 */           paramcj.d(paramInt1, paramInt2 + 1, paramInt3, this.ba);
/* 26 */           paramcj.b(paramInt1, paramInt2, paramInt3, 0);
/*    */         } else {
/* 28 */           paramcj.b(paramInt1, paramInt2, paramInt3, i + 1);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 35 */     float f = 0.0625F;
/* 36 */     return cb.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), ((paramInt2 + 1) - f), ((paramInt3 + 1) - f));
/*    */   }
/*    */   
/*    */   public cb f(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 40 */     float f = 0.0625F;
/* 41 */     return cb.b((paramInt1 + f), paramInt2, (paramInt3 + f), ((paramInt1 + 1) - f), (paramInt2 + 1), ((paramInt3 + 1) - f));
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 45 */     if (paramInt == 1) return this.aZ - 1; 
/* 46 */     if (paramInt == 0) return this.aZ + 1; 
/* 47 */     return this.aZ;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 51 */     return false;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 55 */     return false;
/*    */   }
/*    */   
/*    */   public int f() {
/* 59 */     return 13;
/*    */   }
/*    */   
/*    */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 63 */     if (!super.a(paramcj, paramInt1, paramInt2, paramInt3)) return false;
/*    */     
/* 65 */     return g(paramcj, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 69 */     if (!g(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 70 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 71 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean g(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 76 */     if (paramcj.f(paramInt1 - 1, paramInt2, paramInt3).a()) return false; 
/* 77 */     if (paramcj.f(paramInt1 + 1, paramInt2, paramInt3).a()) return false; 
/* 78 */     if (paramcj.f(paramInt1, paramInt2, paramInt3 - 1).a()) return false; 
/* 79 */     if (paramcj.f(paramInt1, paramInt2, paramInt3 + 1).a()) return false; 
/* 80 */     int i = paramcj.a(paramInt1, paramInt2 - 1, paramInt3);
/* 81 */     return (i == ln.aV.ba || i == ln.E.ba);
/*    */   }
/*    */   
/*    */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {
/* 85 */     paramjx.a((jx)null, 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ho.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */