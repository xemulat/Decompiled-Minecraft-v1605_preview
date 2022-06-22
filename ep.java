/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ep
/*    */ {
/* 14 */   private static Map a = new HashMap<Object, Object>();
/* 15 */   private static Map b = new HashMap<Object, Object>();
/*    */   
/*    */   private static void a(Class<?> paramClass, String paramString) {
/* 18 */     a.put(paramString, paramClass);
/* 19 */     b.put(paramClass, paramString);
/*    */   }
/*    */   
/*    */   static {
/* 23 */     a(jw.class, "Arrow");
/* 24 */     a(al.class, "Snowball");
/* 25 */     a(dr.class, "Item");
/* 26 */     a(it.class, "Painting");
/*    */     
/* 28 */     a(fv.class, "Mob");
/* 29 */     a(dk.class, "Monster");
/*    */     
/* 31 */     a(cy.class, "Creeper");
/* 32 */     a(cs.class, "Skeleton");
/* 33 */     a(at.class, "Spider");
/* 34 */     a(hb.class, "Giant");
/* 35 */     a(lr.class, "Zombie");
/* 36 */     a(lq.class, "Slime");
/*    */     
/* 38 */     a(mj.class, "Pig");
/* 39 */     a(bk.class, "Sheep");
/* 40 */     a(ak.class, "Cow");
/* 41 */     a(mm.class, "Chicken");
/*    */     
/* 43 */     a(iu.class, "PrimedTnt");
/* 44 */     a(ex.class, "FallingSand");
/*    */     
/* 46 */     a(no.class, "Minecart");
/* 47 */     a(cx.class, "Boat");
/*    */   }
/*    */   
/*    */   public static jx a(String paramString, cj paramcj) {
/* 51 */     jx jx = null;
/*    */     try {
/* 53 */       Class<jx> clazz = (Class)a.get(paramString);
/* 54 */       if (clazz != null) jx = clazz.getConstructor(new Class[] { cj.class }).newInstance(new Object[] { paramcj });
/*    */     
/* 56 */     } catch (Exception exception) {
/* 57 */       exception.printStackTrace();
/*    */     } 
/* 59 */     return jx;
/*    */   }
/*    */   
/*    */   public static jx a(hc paramhc, cj paramcj) {
/* 63 */     jx jx = null;
/*    */     try {
/* 65 */       Class<jx> clazz = (Class)a.get(paramhc.i("id"));
/* 66 */       if (clazz != null) jx = clazz.getConstructor(new Class[] { cj.class }).newInstance(new Object[] { paramcj });
/*    */     
/* 68 */     } catch (Exception exception) {
/* 69 */       exception.printStackTrace();
/*    */     } 
/* 71 */     if (jx != null) {
/* 72 */       jx.e(paramhc);
/*    */     } else {
/* 74 */       System.out.println("Skipping Entity with id " + paramhc.i("id"));
/*    */     } 
/* 76 */     return jx;
/*    */   }
/*    */   
/*    */   public static String a(jx paramjx) {
/* 80 */     return (String)b.get(paramjx.getClass());
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ep.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */