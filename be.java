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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class be
/*     */   extends dg
/*     */ {
/*     */   public li a;
/*     */   private Minecraft bd;
/*     */   
/*     */   public be(Minecraft paramMinecraft, cj paramcj, df paramdf) {
/*  21 */     super(paramcj);
/*  22 */     this.bd = paramMinecraft;
/*     */     
/*  24 */     if (paramdf != null && paramdf.b != null && paramdf.b.length() > 0) {
/*  25 */       this.aV = "file:///C:/skincache/" + paramdf.b + ".png";
/*  26 */       System.out.println("Loading texture " + this.aV);
/*     */     } 
/*  28 */     this.i = paramdf.b;
/*     */   }
/*     */   
/*     */   public void b_() {
/*  32 */     super.b_();
/*  33 */     this.T = this.a.a;
/*  34 */     this.U = this.a.b;
/*  35 */     this.W = this.a.d;
/*     */   }
/*     */   
/*     */   public void i() {
/*  39 */     this.a.a(this);
/*  40 */     super.i();
/*     */   }
/*     */   
/*     */   public void j() {
/*  44 */     this.a.a();
/*     */   }
/*     */   
/*     */   public void a(int paramInt, boolean paramBoolean) {
/*  48 */     this.a.a(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/*  52 */     super.a(paramhc);
/*  53 */     paramhc.a("Score", this.d);
/*  54 */     paramhc.a("Inventory", this.b.a(new jy()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(hc paramhc) {
/*  59 */     super.b(paramhc);
/*  60 */     this.d = paramhc.e("Score");
/*     */     
/*  62 */     jy jy = paramhc.l("Inventory");
/*  63 */     this.b.b(jy);
/*     */   }
/*     */   
/*     */   public void a(fy paramfy) {
/*  67 */     this.bd.a(new du(this.b, paramfy));
/*     */   }
/*     */   
/*     */   public void a(nn paramnn) {
/*  71 */     this.bd.a(new ni(paramnn));
/*     */   }
/*     */   
/*     */   public void k() {
/*  75 */     this.bd.a(new hn(this.b));
/*     */   }
/*     */   
/*     */   public void a(ju paramju) {
/*  79 */     this.bd.a(new hs(this.b, paramju));
/*     */   }
/*     */   
/*     */   public void a(jx paramjx) {
/*  83 */     int i = this.b.a(paramjx);
/*  84 */     if (i > 0) {
/*  85 */       paramjx.a(this, i);
/*  86 */       eo eo = r();
/*  87 */       if (eo != null && paramjx instanceof fv) {
/*  88 */         eo.a((fv)paramjx);
/*  89 */         if (eo.a <= 0) {
/*  90 */           eo.a(this);
/*  91 */           s();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a_(jx paramjx, int paramInt) {
/*  98 */     this.bd.h.a(new ca(this.bd.e, paramjx, this, -0.5F));
/*     */   }
/*     */   
/*     */   public int l() {
/* 102 */     return this.b.g();
/*     */   }
/*     */   
/*     */   public void a_(jx paramjx) {
/* 106 */     if (paramjx.a(this))
/* 107 */       return;  eo eo = r();
/* 108 */     if (eo != null && paramjx instanceof fv) {
/* 109 */       eo.b((fv)paramjx);
/* 110 */       if (eo.a <= 0) {
/* 111 */         eo.a(this);
/* 112 */         s();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String paramString) {}
/*     */   
/*     */   public void m() {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\be.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */