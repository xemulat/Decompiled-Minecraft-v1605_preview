/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Canvas;
/*    */ import java.awt.Component;
/*    */ import net.minecraft.client.Minecraft;
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
/*    */ public class g
/*    */   extends Minecraft
/*    */ {
/*    */   public g(MinecraftApplet paramMinecraftApplet1, Component paramComponent, Canvas paramCanvas, MinecraftApplet paramMinecraftApplet2, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 41 */     super(paramComponent, paramCanvas, paramMinecraftApplet2, paramInt1, paramInt2, paramBoolean);
/*    */   }
/*    */   public void a(gf paramgf) {
/* 44 */     this.a.removeAll();
/* 45 */     this.a.setLayout(new BorderLayout());
/* 46 */     this.a.add(new an(paramgf), "Center");
/* 47 */     this.a.validate();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */