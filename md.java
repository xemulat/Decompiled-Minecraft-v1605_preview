/*    */ import java.awt.Component;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.LWJGLException;
/*    */ import org.lwjgl.input.Cursor;
/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class md
/*    */ {
/*    */   private Component c;
/*    */   private Cursor d;
/*    */   public int a;
/*    */   public int b;
/*    */   private int e;
/*    */   
/*    */   public md(Component paramComponent) {
/* 20 */     this.e = 10;
/* 21 */     this.c = paramComponent;
/* 22 */     IntBuffer intBuffer1 = da.c(1);
/* 23 */     intBuffer1.put(0);
/* 24 */     intBuffer1.flip();
/* 25 */     IntBuffer intBuffer2 = da.c(1024);
/*    */     try {
/* 27 */       this.d = new Cursor(32, 32, 16, 16, 1, intBuffer2, intBuffer1);
/*    */     }
/* 29 */     catch (LWJGLException lWJGLException) {
/* 30 */       lWJGLException.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/* 35 */     Mouse.setGrabbed(true);
/* 36 */     this.a = 0;
/* 37 */     this.b = 0;
/*    */   }
/*    */   
/*    */   public void b() {
/* 41 */     Mouse.setCursorPosition(this.c.getWidth() / 2, this.c.getHeight() / 2);
/* 42 */     Mouse.setGrabbed(false);
/*    */   }
/*    */   
/*    */   public void c() {
/* 46 */     if (InputHandler.gamepads != null) {
/* 47 */       for (byte b = 0; b != InputHandler.gamepads.length; b++) {
/* 48 */         if (InputHandler.gamepads[b] != null && (InputHandler.gamepads[b].getRXAxisValue() != 0.0F || InputHandler.gamepads[b].getRYAxisValue() != 0.0F) && (InputHandler.gamepads[b].getRXAxisValue() != -1.0F || InputHandler.gamepads[b].getRYAxisValue() != -1.0F)) {
/* 49 */           this.a = (int)(InputHandler.gamepads[b].getRXAxisValue() * 10.0F);
/* 50 */           if (this.a > -1 && this.a < 1) {
/* 51 */             this.a = 0;
/*    */           }
/* 53 */           this.b = (int)(-InputHandler.gamepads[b].getRYAxisValue() * 5.0F);
/* 54 */           if (this.b > -1 && this.b < 1) {
/* 55 */             this.b = 0;
/*    */           }
/* 57 */           if (this.a != 0 || this.b != 0) {
/*    */             return;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     }
/* 63 */     this.a = Mouse.getDX();
/* 64 */     this.b = Mouse.getDY();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\md.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */