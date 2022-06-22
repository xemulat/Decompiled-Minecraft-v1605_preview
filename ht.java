/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ht
/*    */ {
/* 11 */   private static Map a = new HashMap<Object, Object>();
/* 12 */   private static Map b = new HashMap<Object, Object>(); public cj e; public int f;
/*    */   
/*    */   private static void a(Class<?> paramClass, String paramString) {
/* 15 */     if (b.containsKey(paramString)) throw new IllegalArgumentException("Duplicate id: " + paramString); 
/* 16 */     a.put(paramString, paramClass);
/* 17 */     b.put(paramClass, paramString);
/*    */   }
/*    */   public int g; public int h;
/*    */   static {
/* 21 */     a(ju.class, "Furnace");
/* 22 */     a(ew.class, "Chest");
/* 23 */     a(nn.class, "Sign");
/* 24 */     a(ba.class, "MobSpawner");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(hc paramhc) {
/* 31 */     this.f = paramhc.e("x");
/* 32 */     this.g = paramhc.e("y");
/* 33 */     this.h = paramhc.e("z");
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 37 */     String str = (String)b.get(getClass());
/* 38 */     if (str == null) {
/* 39 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*    */     }
/* 41 */     paramhc.a("id", str);
/* 42 */     paramhc.a("x", this.f);
/* 43 */     paramhc.a("y", this.g);
/* 44 */     paramhc.a("z", this.h);
/*    */   }
/*    */ 
/*    */   
/*    */   public void k_() {}
/*    */   
/*    */   public static ht c(hc paramhc) {
/* 51 */     ht ht1 = null;
/*    */     try {
/* 53 */       Class<ht> clazz = (Class)a.get(paramhc.i("id"));
/* 54 */       if (clazz != null) ht1 = clazz.newInstance(); 
/* 55 */     } catch (Exception exception) {
/* 56 */       exception.printStackTrace();
/*    */     } 
/* 58 */     if (ht1 != null) {
/* 59 */       ht1.a(paramhc);
/*    */     } else {
/* 61 */       System.out.println("Skipping TileEntity with id " + paramhc.i("id"));
/*    */     } 
/* 63 */     return ht1;
/*    */   }
/*    */   
/*    */   public int e() {
/* 67 */     return this.e.e(this.f, this.g, this.h);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void d() {
/* 75 */     this.e.n(this.f, this.g, this.h);
/*    */   }
/*    */   
/*    */   public double a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 79 */     double d1 = this.f + 0.5D - paramDouble1;
/* 80 */     double d2 = this.g + 0.5D - paramDouble2;
/* 81 */     double d3 = this.h + 0.5D - paramDouble3;
/* 82 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*    */   }
/*    */   
/*    */   public ln f() {
/* 86 */     return ln.n[this.e.a(this.f, this.g, this.h)];
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ht.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */