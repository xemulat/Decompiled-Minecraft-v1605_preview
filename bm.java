/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bm
/*     */ {
/*     */   protected cj a;
/*  23 */   private List[] b = new List[4];
/*     */   private er c;
/*  25 */   private Random d = new Random();
/*     */   
/*     */   public bm(cj paramcj, er paramer) {
/*  28 */     if (paramcj != null) {
/*  29 */       this.a = paramcj;
/*     */     }
/*  31 */     this.c = paramer;
/*  32 */     for (byte b = 0; b < 4; b++) {
/*  33 */       this.b[b] = new ArrayList();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(nd paramnd) {
/*  38 */     int i = paramnd.c();
/*  39 */     this.b[i].add(paramnd);
/*     */   }
/*     */   
/*     */   public void a() {
/*  43 */     for (byte b = 0; b < 4; b++) {
/*  44 */       for (byte b1 = 0; b1 < this.b[b].size(); b1++) {
/*  45 */         nd nd = this.b[b].get(b1);
/*  46 */         nd.e_();
/*  47 */         if (nd.ax) {
/*  48 */           this.b[b].remove(b1--);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(jx paramjx, float paramFloat) {
/*  55 */     float f1 = ei.b(paramjx.an * 3.1415927F / 180.0F);
/*  56 */     float f2 = ei.a(paramjx.an * 3.1415927F / 180.0F);
/*     */     
/*  58 */     float f3 = -f2 * ei.a(paramjx.ao * 3.1415927F / 180.0F);
/*  59 */     float f4 = f1 * ei.a(paramjx.ao * 3.1415927F / 180.0F);
/*  60 */     float f5 = ei.b(paramjx.ao * 3.1415927F / 180.0F);
/*     */     
/*  62 */     nd.l = paramjx.aF + (paramjx.ah - paramjx.aF) * paramFloat;
/*  63 */     nd.m = paramjx.aG + (paramjx.ai - paramjx.aG) * paramFloat;
/*  64 */     nd.n = paramjx.aH + (paramjx.aj - paramjx.aH) * paramFloat;
/*  65 */     for (byte b = 0; b < 3; b++) {
/*  66 */       if (this.b[b].size() != 0) {
/*     */         
/*  68 */         int i = 0;
/*  69 */         if (b == 0) i = this.c.a("/particles.png"); 
/*  70 */         if (b == 1) i = this.c.a("/terrain.png"); 
/*  71 */         if (b == 2) i = this.c.a("/gui/items.png"); 
/*  72 */         GL11.glBindTexture(3553, i);
/*  73 */         he he = he.a;
/*     */         
/*  75 */         he.b();
/*  76 */         for (byte b1 = 0; b1 < this.b[b].size(); b1++) {
/*  77 */           nd nd = this.b[b].get(b1);
/*     */           
/*  79 */           nd.a(he, paramFloat, f1, f5, f2, f3, f4);
/*     */         } 
/*  81 */         he.a();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(jx paramjx, float paramFloat) {
/*  87 */     byte b1 = 3;
/*  88 */     if (this.b[b1].size() == 0)
/*     */       return; 
/*  90 */     he he = he.a;
/*  91 */     for (byte b2 = 0; b2 < this.b[b1].size(); b2++) {
/*  92 */       nd nd = this.b[b1].get(b2);
/*  93 */       nd.a(he, paramFloat, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(cj paramcj) {
/*  98 */     this.a = paramcj;
/*     */     
/* 100 */     for (byte b = 0; b < 4; b++) {
/* 101 */       this.b[b].clear();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 107 */     int i = this.a.a(paramInt1, paramInt2, paramInt3);
/* 108 */     if (i == 0)
/*     */       return; 
/* 110 */     ln ln = ln.n[i];
/* 111 */     byte b1 = 4;
/* 112 */     for (byte b2 = 0; b2 < b1; b2++) {
/* 113 */       for (byte b = 0; b < b1; b++) {
/* 114 */         for (byte b3 = 0; b3 < b1; b3++) {
/* 115 */           double d1 = paramInt1 + (b2 + 0.5D) / b1;
/* 116 */           double d2 = paramInt2 + (b + 0.5D) / b1;
/* 117 */           double d3 = paramInt3 + (b3 + 0.5D) / b1;
/* 118 */           a(new im(this.a, d1, d2, d3, d1 - paramInt1 - 0.5D, d2 - paramInt2 - 0.5D, d3 - paramInt3 - 0.5D, ln));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 123 */     int i = this.a.a(paramInt1, paramInt2, paramInt3);
/* 124 */     if (i == 0)
/* 125 */       return;  ln ln = ln.n[i];
/* 126 */     float f = 0.1F;
/* 127 */     double d1 = paramInt1 + this.d.nextDouble() * (ln.bg - ln.bd - (f * 2.0F)) + f + ln.bd;
/* 128 */     double d2 = paramInt2 + this.d.nextDouble() * (ln.bh - ln.be - (f * 2.0F)) + f + ln.be;
/* 129 */     double d3 = paramInt3 + this.d.nextDouble() * (ln.bi - ln.bf - (f * 2.0F)) + f + ln.bf;
/* 130 */     if (paramInt4 == 0) d2 = paramInt2 + ln.be - f; 
/* 131 */     if (paramInt4 == 1) d2 = paramInt2 + ln.bh + f; 
/* 132 */     if (paramInt4 == 2) d3 = paramInt3 + ln.bf - f; 
/* 133 */     if (paramInt4 == 3) d3 = paramInt3 + ln.bi + f; 
/* 134 */     if (paramInt4 == 4) d1 = paramInt1 + ln.bd - f; 
/* 135 */     if (paramInt4 == 5) d1 = paramInt1 + ln.bg + f; 
/* 136 */     a((new im(this.a, d1, d2, d3, 0.0D, 0.0D, 0.0D, ln)).b(0.2F).d(0.6F));
/*     */   }
/*     */   
/*     */   public String b() {
/* 140 */     return "" + (this.b[0].size() + this.b[1].size() + this.b[2].size());
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */