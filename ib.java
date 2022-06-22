/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ib
/*    */   extends hg
/*    */ {
/*    */   public ib(Minecraft paramMinecraft) {
/* 12 */     super(paramMinecraft);
/* 13 */     this.b = true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(dg paramdg) {
/* 36 */     for (byte b = 0; b < 9; b++) {
/*    */       
/* 38 */       if (paramdg.b.a[b] == null) {
/* 39 */         this.a.g.b.a[b] = new eo(((ln)df.a.get(b)).ba);
/*    */       } else {
/*    */         
/* 42 */         (this.a.g.b.a[b]).a = 1;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 48 */     return false;
/*    */   }
/*    */   
/*    */   public void a(cj paramcj) {
/* 52 */     super.a(paramcj);
/*    */   }
/*    */   
/*    */   public void d() {}
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ib.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */