/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ly
/*    */   extends ln
/*    */ {
/*    */   protected ly(int paramInt) {
/* 12 */     super(paramInt, fs.b);
/* 13 */     this.aZ = 87;
/* 14 */     b(true);
/* 15 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
/* 16 */     d(255);
/*    */   }
/*    */   
/*    */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 20 */     return cb.b((paramInt1 + 0), (paramInt2 + 0), (paramInt3 + 0), (paramInt1 + 1), (paramInt2 + 1), (paramInt3 + 1));
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 24 */     return false;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 28 */     return false;
/*    */   }
/*    */   
/*    */   public int a(int paramInt1, int paramInt2) {
/* 32 */     if (paramInt1 == 1 && paramInt2 > 0) return this.aZ - 1; 
/* 33 */     if (paramInt1 == 1) return this.aZ; 
/* 34 */     return 2;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 38 */     if (paramRandom.nextInt(5) == 0) {
/* 39 */       if (i(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 40 */         paramcj.b(paramInt1, paramInt2, paramInt3, 7);
/*    */       } else {
/* 42 */         int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 43 */         if (i > 0) {
/* 44 */           paramcj.b(paramInt1, paramInt2, paramInt3, i - 1);
/*    */         }
/* 46 */         else if (!h(paramcj, paramInt1, paramInt2, paramInt3)) {
/* 47 */           paramcj.d(paramInt1, paramInt2, paramInt3, ln.v.ba);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, jx paramjx) {
/* 55 */     if (paramcj.m.nextInt(4) == 0) {
/* 56 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.v.ba);
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 61 */     byte b = 0;
/* 62 */     for (int i = paramInt1 - b; i <= paramInt1 + b; i++) {
/* 63 */       for (int j = paramInt3 - b; j <= paramInt3 + b; j++) {
/* 64 */         if (paramcj.a(i, paramInt2 + 1, j) == ln.az.ba)
/* 65 */           return true; 
/*    */       } 
/*    */     } 
/* 68 */     return false;
/*    */   }
/*    */   
/*    */   private boolean i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 72 */     for (int i = paramInt1 - 4; i <= paramInt1 + 4; i++) {
/* 73 */       for (int j = paramInt2; j <= paramInt2 + 1; j++) {
/* 74 */         for (int k = paramInt3 - 4; k <= paramInt3 + 4; k++) {
/* 75 */           if (paramcj.f(i, j, k) == fs.f)
/* 76 */             return true; 
/*    */         } 
/*    */       } 
/* 79 */     }  return false;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 83 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/* 84 */     fs fs = paramcj.f(paramInt1, paramInt2 + 1, paramInt3);
/* 85 */     if (fs.a()) {
/* 86 */       paramcj.d(paramInt1, paramInt2, paramInt3, ln.v.ba);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(int paramInt, Random paramRandom) {
/* 95 */     return ln.v.a(0, paramRandom);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ly.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */