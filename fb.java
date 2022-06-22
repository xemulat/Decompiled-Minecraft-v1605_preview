/*    */ import net.minecraft.client.Minecraft;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fb
/*    */   extends lb
/*    */ {
/*  9 */   private int g = 200;
/* 10 */   private int h = 20;
/*    */   public int a;
/*    */   public int b;
/*    */   public String c;
/*    */   public int d;
/*    */   public boolean e = true;
/*    */   public boolean f = true;
/*    */   
/*    */   public fb(int paramInt1, int paramInt2, int paramInt3, String paramString) {
/* 19 */     this(paramInt1, paramInt2, paramInt3, 200, 20, paramString);
/*    */   }
/*    */ 
/*    */   
/*    */   protected fb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString) {
/* 24 */     this.d = paramInt1;
/* 25 */     this.a = paramInt2;
/* 26 */     this.b = paramInt3;
/* 27 */     this.g = paramInt4;
/* 28 */     this.h = paramInt5;
/* 29 */     this.c = paramString;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
/* 34 */     if (!this.f)
/*    */       return; 
/* 36 */     jt jt = paramMinecraft.o;
/*    */     
/* 38 */     GL11.glBindTexture(3553, paramMinecraft.n.a("/gui/gui.png"));
/* 39 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */ 
/*    */     
/* 42 */     byte b = 1;
/* 43 */     boolean bool = (paramInt1 >= this.a && paramInt2 >= this.b && paramInt1 < this.a + this.g && paramInt2 < this.b + this.h) ? true : false;
/* 44 */     if (!this.e) { b = 0; }
/* 45 */     else if (bool) { b = 2; }
/*    */     
/* 47 */     b(this.a, this.b, 0, 46 + b * 20, this.g / 2, this.h);
/* 48 */     b(this.a + this.g / 2, this.b, 200 - this.g / 2, 46 + b * 20, this.g / 2, this.h);
/*    */     
/* 50 */     if (!this.e) {
/*    */       
/* 52 */       a(jt, this.c, this.a + this.g / 2, this.b + (this.h - 8) / 2, -6250336);
/*    */ 
/*    */     
/*    */     }
/* 56 */     else if (bool) {
/*    */       
/* 58 */       a(jt, this.c, this.a + this.g / 2, this.b + (this.h - 8) / 2, 16777120);
/*    */     }
/*    */     else {
/*    */       
/* 62 */       a(jt, this.c, this.a + this.g / 2, this.b + (this.h - 8) / 2, 14737632);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2) {
/* 69 */     return (this.e && paramInt1 >= this.a && paramInt2 >= this.b && paramInt1 < this.a + this.g && paramInt2 < this.b + this.h);
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */