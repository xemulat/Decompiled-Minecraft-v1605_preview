/*     */ import net.minecraft.client.Minecraft;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hg
/*     */ {
/*     */   protected final Minecraft a;
/*     */   public boolean b = false;
/*     */   
/*     */   public hg(Minecraft paramMinecraft) {
/*  16 */     this.a = paramMinecraft;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */   
/*     */   public void a(cj paramcj) {}
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  26 */     b(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
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
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  46 */     this.a.h.a(paramInt1, paramInt2, paramInt3);
/*  47 */     cj cj = this.a.e;
/*  48 */     ln ln = ln.n[cj.a(paramInt1, paramInt2, paramInt3)];
/*  49 */     int i = cj.e(paramInt1, paramInt2, paramInt3);
/*  50 */     boolean bool = cj.d(paramInt1, paramInt2, paramInt3, 0);
/*  51 */     if (ln != null && bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  61 */       this.a.A.b(ln.bj.a(), paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, (ln.bj.b() + 1.0F) / 2.0F, ln.bj.c() * 0.8F);
/*  62 */       ln.b(cj, paramInt1, paramInt2, paramInt3, i);
/*     */     } 
/*  64 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */   
/*     */   public void b() {}
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {}
/*     */ 
/*     */   
/*     */   public float c() {
/*  78 */     return 5.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dg paramdg) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean e() {
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dg paramdg) {}
/*     */   
/*     */   public boolean a(dg paramdg, cj paramcj, eo parameo, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 103 */     return parameo.a(paramdg, paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public dg b(cj paramcj) {
/* 107 */     return new be(this.a, paramcj, this.a.i);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */