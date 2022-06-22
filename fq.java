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
/*     */ public class fq
/*     */ {
/*  14 */   private Map m = new HashMap<Object, Object>();
/*     */   
/*  16 */   public static fq a = new fq();
/*     */   
/*     */   private jt n;
/*     */   
/*     */   public static double b;
/*     */   
/*     */   public static double c;
/*     */   
/*     */   public static double d;
/*     */   
/*     */   public er e;
/*     */   public cj f;
/*     */   
/*     */   private fq() {
/*  30 */     this.m.put(nn.class, new id());
/*  31 */     this.m.put(ba.class, new q());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     for (eq eq : this.m.values())
/*  39 */       eq.a(this); 
/*     */   }
/*     */   public dg g; public float h; public float i; public double j; public double k;
/*     */   public double l;
/*     */   
/*     */   public eq a(Class<ht> paramClass) {
/*  45 */     eq eq = (eq)this.m.get(paramClass);
/*  46 */     if (eq == null && paramClass != ht.class) {
/*  47 */       eq = a(paramClass.getSuperclass());
/*  48 */       this.m.put(paramClass, eq);
/*     */     } 
/*  50 */     return eq;
/*     */   }
/*     */   
/*     */   public boolean a(ht paramht) {
/*  54 */     return (b(paramht) != null);
/*     */   }
/*     */   
/*     */   public eq b(ht paramht) {
/*  58 */     return a(paramht.getClass());
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, er paramer, jt paramjt, dg paramdg, float paramFloat) {
/*  62 */     this.f = paramcj;
/*  63 */     this.e = paramer;
/*  64 */     this.g = paramdg;
/*  65 */     this.n = paramjt;
/*     */     
/*  67 */     this.h = paramdg.ap + (paramdg.an - paramdg.ap) * paramFloat;
/*  68 */     this.i = paramdg.aq + (paramdg.ao - paramdg.aq) * paramFloat;
/*     */     
/*  70 */     this.j = paramdg.aF + (paramdg.ah - paramdg.aF) * paramFloat;
/*  71 */     this.k = paramdg.aG + (paramdg.ai - paramdg.aG) * paramFloat;
/*  72 */     this.l = paramdg.aH + (paramdg.aj - paramdg.aH) * paramFloat;
/*     */   }
/*     */   
/*     */   public void a(ht paramht, float paramFloat) {
/*  76 */     if (paramht.a(this.j, this.k, this.l) < 4096.0D) {
/*  77 */       float f = this.f.c(paramht.f, paramht.g, paramht.h);
/*  78 */       GL11.glColor3f(f, f, f);
/*  79 */       a(paramht, paramht.f - b, paramht.g - c, paramht.h - d, paramFloat);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(ht paramht, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  84 */     eq eq = b(paramht);
/*  85 */     if (eq != null) {
/*  86 */       eq.a(paramht, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*     */     }
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
/*     */   public jt a() {
/* 102 */     return this.n;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */