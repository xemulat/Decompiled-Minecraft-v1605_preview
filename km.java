/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public class km
/*     */ {
/*  20 */   private Map o = new HashMap<Object, Object>();
/*     */   
/*  22 */   public static km a = new km();
/*     */   
/*     */   private jt p;
/*     */   
/*     */   public static double b;
/*     */   
/*     */   public static double c;
/*     */   
/*     */   public static double d;
/*     */   
/*     */   public er e;
/*     */   
/*     */   public iy f;
/*     */   public cj g;
/*     */   
/*     */   private km() {
/*  38 */     this.o.put(at.class, new nw());
/*  39 */     this.o.put(mj.class, new gd(new bw(), new bw(0.5F), 0.7F));
/*  40 */     this.o.put(bk.class, new nf(new gn(), new bt(), 0.7F));
/*  41 */     this.o.put(ak.class, new ls(new dp(), 0.7F));
/*  42 */     this.o.put(mm.class, new ek(new kk(), 0.3F));
/*  43 */     this.o.put(cy.class, new d());
/*  44 */     this.o.put(cs.class, new dh(new fm(), 0.5F));
/*  45 */     this.o.put(lr.class, new dh(new bx(), 0.5F));
/*  46 */     this.o.put(lq.class, new gh(new gx(16), new gx(0), 0.25F));
/*  47 */     this.o.put(dg.class, new bq());
/*  48 */     this.o.put(hb.class, new nl(new bx(), 0.5F, 6.0F));
/*  49 */     this.o.put(fv.class, new dh(new cn(), 0.5F));
/*     */     
/*  51 */     this.o.put(jx.class, new ga());
/*     */     
/*  53 */     this.o.put(it.class, new bs());
/*  54 */     this.o.put(jw.class, new gb());
/*  55 */     this.o.put(al.class, new ec());
/*  56 */     this.o.put(dr.class, new z());
/*  57 */     this.o.put(iu.class, new hm());
/*  58 */     this.o.put(ex.class, new de());
/*     */     
/*  60 */     this.o.put(no.class, new ki());
/*  61 */     this.o.put(cx.class, new cl());
/*     */     
/*  63 */     for (ai ai : this.o.values())
/*  64 */       ai.a(this); 
/*     */   }
/*     */   public dg h; public float i; public float j; public fi k; public double l; public double m;
/*     */   public double n;
/*     */   
/*     */   public ai a(Class<jx> paramClass) {
/*  70 */     ai ai = (ai)this.o.get(paramClass);
/*  71 */     if (ai == null && paramClass != jx.class) {
/*  72 */       ai = a(paramClass.getSuperclass());
/*  73 */       this.o.put(paramClass, ai);
/*     */     } 
/*  75 */     return ai;
/*     */   }
/*     */   
/*     */   public ai a(jx paramjx) {
/*  79 */     return a(paramjx.getClass());
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, er paramer, jt paramjt, dg paramdg, fi paramfi, float paramFloat) {
/*  83 */     this.g = paramcj;
/*  84 */     this.e = paramer;
/*  85 */     this.k = paramfi;
/*  86 */     this.h = paramdg;
/*  87 */     this.p = paramjt;
/*     */     
/*  89 */     this.i = paramdg.ap + (paramdg.an - paramdg.ap) * paramFloat;
/*  90 */     this.j = paramdg.aq + (paramdg.ao - paramdg.aq) * paramFloat;
/*     */     
/*  92 */     this.l = paramdg.aF + (paramdg.ah - paramdg.aF) * paramFloat;
/*  93 */     this.m = paramdg.aG + (paramdg.ai - paramdg.aG) * paramFloat;
/*  94 */     this.n = paramdg.aH + (paramdg.aj - paramdg.aH) * paramFloat;
/*     */   }
/*     */   
/*     */   public void a(jx paramjx, float paramFloat) {
/*  98 */     double d1 = paramjx.aF + (paramjx.ah - paramjx.aF) * paramFloat;
/*  99 */     double d2 = paramjx.aG + (paramjx.ai - paramjx.aG) * paramFloat;
/* 100 */     double d3 = paramjx.aH + (paramjx.aj - paramjx.aH) * paramFloat;
/* 101 */     float f1 = paramjx.ap + (paramjx.an - paramjx.ap) * paramFloat;
/*     */     
/* 103 */     float f2 = paramjx.a(paramFloat);
/* 104 */     GL11.glColor3f(f2, f2, f2);
/*     */     
/* 106 */     a(paramjx, d1 - b, d2 - c, d3 - d, f1, paramFloat);
/*     */   }
/*     */   
/*     */   public void a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 110 */     ai ai = a(paramjx);
/* 111 */     if (ai != null) {
/* 112 */       ai.a(paramjx, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 113 */       ai.b(paramjx, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cj paramcj) {
/* 119 */     this.g = paramcj;
/*     */   }
/*     */   
/*     */   public double a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 123 */     double d1 = paramDouble1 - this.l;
/* 124 */     double d2 = paramDouble2 - this.m;
/* 125 */     double d3 = paramDouble3 - this.n;
/* 126 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public jt a() {
/* 130 */     return this.p;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\km.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */