/*    */ import java.awt.Canvas;
/*    */ import net.minecraft.client.MinecraftApplet;
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
/*    */ public class h
/*    */   extends Canvas
/*    */ {
/*    */   public h(MinecraftApplet paramMinecraftApplet) {}
/*    */   
/*    */   public synchronized void addNotify() {
/* 26 */     super.addNotify();
/* 27 */     this.a.a();
/*    */   }
/*    */   
/*    */   public synchronized void removeNotify() {
/* 31 */     this.a.b();
/* 32 */     super.removeNotify();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */