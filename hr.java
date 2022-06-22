/*    */ import java.io.File;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hr
/*    */   extends jg
/*    */ {
/*    */   public hr(bd parambd) {
/* 10 */     super(parambd);
/* 11 */     this.h = "Delete world";
/*    */   }
/*    */   
/*    */   public void j() {
/* 15 */     this.e.add(new fb(6, this.c / 2 - 100, this.d / 6 + 168, "Cancel"));
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 19 */     String str = d(paramInt);
/* 20 */     if (str != null)
/*    */     {
/* 22 */       this.b.a(new ir(this, "Are you sure you want to delete this world?", "'" + str + "' will be lost forever!", paramInt));
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(boolean paramBoolean, int paramInt) {
/* 27 */     if (paramBoolean) {
/* 28 */       File file = Minecraft.b();
/* 29 */       cj.b(file, d(paramInt));
/*    */     } 
/* 31 */     this.b.a(this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */