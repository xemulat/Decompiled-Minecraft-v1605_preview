/*     */ import net.minecraft.client.Minecraft;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hp
/*     */   extends hg
/*     */ {
/*  14 */   private int c = -1;
/*  15 */   private int d = -1;
/*  16 */   private int e = -1;
/*  17 */   private float f = 0.0F;
/*  18 */   private float g = 0.0F;
/*  19 */   private float h = 0.0F;
/*  20 */   private int i = 0;
/*     */   
/*  22 */   private av j = new l(this, 200, ck.class, new Class[] { lr.class, cs.class, cy.class, at.class, lq.class });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  32 */   private av k = new av(20, ae.class, new Class[] { bk.class, mj.class, ak.class, mm.class });
/*     */   
/*     */   public hp(Minecraft paramMinecraft) {
/*  35 */     super(paramMinecraft);
/*     */   }
/*     */   
/*     */   public void a(dg paramdg) {
/*  39 */     paramdg.an = -180.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  46 */     int i = this.a.e.a(paramInt1, paramInt2, paramInt3);
/*  47 */     int j = this.a.e.e(paramInt1, paramInt2, paramInt3);
/*  48 */     boolean bool1 = super.b(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/*  50 */     eo eo = this.a.g.r();
/*  51 */     boolean bool2 = this.a.g.b(ln.n[i]);
/*  52 */     if (eo != null) {
/*  53 */       eo.a(i, paramInt1, paramInt2, paramInt3);
/*  54 */       if (eo.a == 0) {
/*  55 */         eo.a(this.a.g);
/*  56 */         this.a.g.s();
/*     */       } 
/*     */     } 
/*  59 */     if (bool1 && bool2) ln.n[i].a_(this.a.e, paramInt1, paramInt2, paramInt3, j); 
/*  60 */     return bool1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  69 */     int i = this.a.e.a(paramInt1, paramInt2, paramInt3);
/*  70 */     if (i > 0 && this.f == 0.0F) ln.n[i].b(this.a.e, paramInt1, paramInt2, paramInt3, this.a.g); 
/*  71 */     if (i > 0 && ln.n[i].a(this.a.g) >= 1.0F) {
/*  72 */       b(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*  77 */     this.f = 0.0F;
/*  78 */     this.i = 0;
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  82 */     if (this.i > 0) {
/*  83 */       this.i--;
/*     */       return;
/*     */     } 
/*  86 */     if (paramInt1 == this.c && paramInt2 == this.d && paramInt3 == this.e) {
/*  87 */       int i = this.a.e.a(paramInt1, paramInt2, paramInt3);
/*  88 */       if (i == 0)
/*  89 */         return;  ln ln = ln.n[i];
/*     */       
/*  91 */       this.f += ln.a(this.a.g);
/*     */       
/*  93 */       if (this.h % 4.0F == 0.0F && 
/*  94 */         ln != null) {
/*  95 */         this.a.A.b(ln.bj.d(), paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, (ln.bj.b() + 1.0F) / 8.0F, ln.bj.c() * 0.5F);
/*     */       }
/*     */ 
/*     */       
/*  99 */       this.h++;
/*     */       
/* 101 */       if (this.f >= 1.0F) {
/* 102 */         b(paramInt1, paramInt2, paramInt3, paramInt4);
/* 103 */         this.f = 0.0F;
/* 104 */         this.g = 0.0F;
/* 105 */         this.h = 0.0F;
/* 106 */         this.i = 5;
/*     */       } 
/*     */     } else {
/* 109 */       this.f = 0.0F;
/* 110 */       this.g = 0.0F;
/* 111 */       this.h = 0.0F;
/* 112 */       this.c = paramInt1;
/* 113 */       this.d = paramInt2;
/* 114 */       this.e = paramInt3;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 119 */     if (this.f <= 0.0F) {
/* 120 */       this.a.u.b = 0.0F;
/* 121 */       this.a.f.i = 0.0F;
/*     */     } else {
/* 123 */       float f = this.g + (this.f - this.g) * paramFloat;
/* 124 */       this.a.u.b = f;
/* 125 */       this.a.f.i = f;
/*     */     } 
/*     */   }
/*     */   
/*     */   public float c() {
/* 130 */     return 4.0F;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj) {
/* 134 */     super.a(paramcj);
/*     */   }
/*     */   
/*     */   public void d() {
/* 138 */     this.g = this.f;
/* 139 */     this.j.a(this.a.e);
/* 140 */     this.k.a(this.a.e);
/*     */     
/* 142 */     this.a.A.c();
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */