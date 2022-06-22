/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class mc
/*    */   extends bd
/*    */ {
/*    */   private go a;
/*    */   private boolean h = false;
/*    */   
/*    */   public mc(Minecraft paramMinecraft, String paramString, int paramInt) {
/* 17 */     paramMinecraft.a(null);
/* 18 */     (new mp(this, paramMinecraft, paramString, paramInt)).start();
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void g() {
/* 40 */     if (this.a != null) {
/* 41 */       this.a.a();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(char paramChar, int paramInt) {}
/*    */   
/*    */   public void a() {
/* 49 */     this.e.clear();
/* 50 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Cancel"));
/*    */   }
/*    */   
/*    */   protected void a(fb paramfb) {
/* 54 */     if (paramfb.d == 0) {
/* 55 */       this.h = true;
/* 56 */       if (this.a != null) this.a.b(); 
/* 57 */       this.b.a(new ct());
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 62 */     i();
/*    */     
/* 64 */     if (this.a == null) {
/* 65 */       a(this.g, "Connecting to the server...", this.c / 2, this.d / 2 - 50, 16777215);
/* 66 */       a(this.g, "", this.c / 2, this.d / 2 - 10, 16777215);
/*    */     } else {
/* 68 */       a(this.g, "Logging in...", this.c / 2, this.d / 2 - 50, 16777215);
/* 69 */       a(this.g, this.a.a, this.c / 2, this.d / 2 - 10, 16777215);
/*    */     } 
/*    */     
/* 72 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */