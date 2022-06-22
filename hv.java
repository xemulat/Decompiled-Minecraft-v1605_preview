/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hv
/*     */   extends ln
/*     */ {
/*     */   protected hv(int paramInt1, int paramInt2) {
/* 234 */     super(paramInt1, paramInt2, fs.n);
/* 235 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */   }
/*     */   
/*     */   public cb d(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 239 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 247 */     return false;
/*     */   }
/*     */   
/*     */   public lv a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, ah paramah1, ah paramah2) {
/* 251 */     a(paramcj, paramInt1, paramInt2, paramInt3);
/* 252 */     return super.a(paramcj, paramInt1, paramInt2, paramInt3, paramah1, paramah2);
/*     */   }
/*     */   
/*     */   public void a(mz parammz, int paramInt1, int paramInt2, int paramInt3) {
/* 256 */     int i = parammz.e(paramInt1, paramInt2, paramInt3);
/* 257 */     if (i >= 2 && i <= 5) {
/* 258 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*     */     } else {
/* 260 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/* 265 */     if (paramInt2 >= 6) return this.aZ - 16; 
/* 266 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 270 */     return false;
/*     */   }
/*     */   
/*     */   public int f() {
/* 274 */     return 9;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 278 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 282 */     if (paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) {
/* 283 */       return true;
/*     */     }
/* 285 */     return false;
/*     */   }
/*     */   
/*     */   public void e(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 289 */     paramcj.b(paramInt1, paramInt2, paramInt3, 15);
/* 290 */     h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 294 */     int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/* 295 */     boolean bool = false;
/*     */     
/* 297 */     if (!paramcj.g(paramInt1, paramInt2 - 1, paramInt3)) bool = true; 
/* 298 */     if (i == 2 && !paramcj.g(paramInt1 + 1, paramInt2, paramInt3)) bool = true; 
/* 299 */     if (i == 3 && !paramcj.g(paramInt1 - 1, paramInt2, paramInt3)) bool = true; 
/* 300 */     if (i == 4 && !paramcj.g(paramInt1, paramInt2, paramInt3 - 1)) bool = true; 
/* 301 */     if (i == 5 && !paramcj.g(paramInt1, paramInt2, paramInt3 + 1)) bool = true;
/*     */     
/* 303 */     if (bool) {
/* 304 */       b_(paramcj, paramInt1, paramInt2, paramInt3, paramcj.e(paramInt1, paramInt2, paramInt3));
/* 305 */       paramcj.d(paramInt1, paramInt2, paramInt3, 0);
/*     */     }
/* 307 */     else if (paramInt4 > 0 && ln.n[paramInt4].d() && 
/* 308 */       ma.a(new ma(this, paramcj, paramInt1, paramInt2, paramInt3)) == 3) {
/* 309 */       h(paramcj, paramInt1, paramInt2, paramInt3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 316 */     (new ma(this, paramcj, paramInt1, paramInt2, paramInt3)).a(paramcj.p(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */