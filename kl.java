/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public class kl
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private float d;
/*    */   private float e;
/*    */   private float f;
/* 12 */   private IntBuffer g = da.c(65536);
/*    */   private boolean h = false;
/*    */   private boolean i = false;
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 17 */     this.h = true;
/* 18 */     this.g.clear();
/* 19 */     this.a = paramInt1;
/* 20 */     this.b = paramInt2;
/* 21 */     this.c = paramInt3;
/*    */     
/* 23 */     this.d = (float)paramDouble1;
/* 24 */     this.e = (float)paramDouble2;
/* 25 */     this.f = (float)paramDouble3;
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2, int paramInt3) {
/* 29 */     if (!this.h) return false; 
/* 30 */     return (paramInt1 == this.a && paramInt2 == this.b && paramInt3 == this.c);
/*    */   }
/*    */   
/*    */   public void a(int paramInt) {
/* 34 */     this.g.put(paramInt);
/* 35 */     if (this.g.remaining() == 0) a(); 
/*    */   }
/*    */   
/*    */   public void a() {
/* 39 */     if (!this.h)
/* 40 */       return;  if (!this.i) {
/* 41 */       this.g.flip();
/* 42 */       this.i = true;
/*    */     } 
/* 44 */     if (this.g.remaining() > 0) {
/* 45 */       GL11.glPushMatrix();
/* 46 */       GL11.glTranslatef(this.a - this.d, this.b - this.e, this.c - this.f);
/* 47 */       GL11.glCallLists(this.g);
/* 48 */       GL11.glPopMatrix();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b() {
/* 53 */     this.h = false;
/* 54 */     this.i = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */