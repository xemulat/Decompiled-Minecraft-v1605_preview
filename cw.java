/*    */ import java.awt.Canvas;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import javax.imageio.ImageIO;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class cw
/*    */   extends Canvas
/*    */ {
/*    */   private BufferedImage a;
/*    */   
/*    */   public cw() {
/*    */     try {
/* 22 */       this.a = ImageIO.read(an.class.getResource("/gui/logo.png"));
/* 23 */     } catch (IOException iOException) {}
/*    */     
/* 25 */     byte b = 100;
/* 26 */     setPreferredSize(new Dimension(b, b));
/* 27 */     setMinimumSize(new Dimension(b, b));
/*    */   }
/*    */   
/*    */   public void paint(Graphics paramGraphics) {
/* 31 */     super.paint(paramGraphics);
/* 32 */     paramGraphics.drawImage(this.a, getWidth() / 2 - this.a.getWidth() / 2, 32, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */