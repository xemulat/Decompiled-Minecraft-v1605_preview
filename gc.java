/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gc
/*    */   implements Comparator
/*    */ {
/*    */   private dg a;
/*    */   
/*    */   public gc(dg paramdg) {
/* 14 */     this.a = paramdg;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(bj parambj1, bj parambj2) {
/* 19 */     boolean bool1 = parambj1.o;
/* 20 */     boolean bool2 = parambj2.o;
/* 21 */     if (bool1 && !bool2) return 1; 
/* 22 */     if (bool2 && !bool1) return -1; 
/* 23 */     return (parambj1.a(this.a) < parambj2.a(this.a)) ? 1 : -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */