/*    */ import java.io.File;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jg
/*    */   extends bd
/*    */ {
/*    */   protected bd a;
/*    */   protected String h;
/*    */   private boolean i;
/*    */   
/*    */   public jg(bd parambd) {
/* 15 */     this.h = "Select world";
/* 16 */     this.i = false;
/* 17 */     this.a = parambd;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 22 */     File file = Minecraft.b();
/* 23 */     hc hc = cj.a(file, "World1");
/* 24 */     if (hc == null) {
/* 25 */       this.e.add(new fb(0, this.c / 2 - 100, this.d / 6 + 24, "Start preview"));
/*    */     } else {
/*    */       
/* 28 */       this.e.add(new fb(0, this.c / 2 - 100, this.d / 6 + 24, "Resume preview world  (" + ((float)(hc.f("SizeOnDisk") / 1024L * 100L / 1024L) / 100.0F) + " MB)"));
/*    */     } 
/* 30 */     j();
/*    */   }
/*    */   
/*    */   protected String d(int paramInt) {
/* 34 */     return (cj.a(Minecraft.b(), "World" + paramInt) != null) ? ("World" + paramInt) : null;
/*    */   }
/*    */   
/*    */   public void j() {
/* 38 */     this.e.add(new fb(5, this.c / 2 - 100, this.d / 6 + 120 + 12, "Delete world..."));
/* 39 */     this.e.add(new fb(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(fb paramfb) {
/* 44 */     if (!paramfb.e) {
/*    */       return;
/*    */     }
/* 47 */     if (paramfb.d < 5) {
/* 48 */       c(paramfb.d + 1);
/*    */     }
/* 50 */     else if (paramfb.d == 5) {
/* 51 */       this.b.a(new hr(this));
/*    */     }
/* 53 */     else if (paramfb.d == 6) {
/* 54 */       this.b.a(this.a);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 59 */     this.b.a((bd)null);
/* 60 */     if (this.i) {
/*    */       return;
/*    */     }
/* 63 */     this.i = true;
/* 64 */     this.b.b("World" + paramInt);
/* 65 */     this.b.a((bd)null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 70 */     i();
/* 71 */     a(this.g, this.h, this.c / 2, 20, 16777215);
/* 72 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jg.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */