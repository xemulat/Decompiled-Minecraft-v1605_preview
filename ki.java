/*    */ import org.lwjgl.opengl.GL11;
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
/*    */ public class ki
/*    */   extends ai
/*    */ {
/* 16 */   protected ff d = new gz();
/*    */ 
/*    */   
/*    */   public void a(no paramno, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 20 */     GL11.glPushMatrix();
/*    */     
/* 22 */     double d1 = paramno.aF + (paramno.ah - paramno.aF) * paramFloat2;
/* 23 */     double d2 = paramno.aG + (paramno.ai - paramno.aG) * paramFloat2;
/* 24 */     double d3 = paramno.aH + (paramno.aj - paramno.aH) * paramFloat2;
/*    */     
/* 26 */     double d4 = 0.30000001192092896D;
/*    */     
/* 28 */     ah ah = paramno.g(d1, d2, d3);
/*    */     
/* 30 */     float f1 = paramno.aq + (paramno.ao - paramno.aq) * paramFloat2;
/*    */     
/* 32 */     if (ah != null) {
/* 33 */       ah ah1 = paramno.a(d1, d2, d3, d4);
/* 34 */       ah ah2 = paramno.a(d1, d2, d3, -d4);
/* 35 */       if (ah1 == null) ah1 = ah; 
/* 36 */       if (ah2 == null) ah2 = ah;
/*    */       
/* 38 */       paramDouble1 += ah.a - d1;
/* 39 */       paramDouble2 += (ah1.b + ah2.b) / 2.0D - d2;
/* 40 */       paramDouble3 += ah.c - d3;
/*    */       
/* 42 */       ah ah3 = ah2.c(-ah1.a, -ah1.b, -ah1.c);
/* 43 */       if (ah3.c() != 0.0D) {
/*    */         
/* 45 */         ah3 = ah3.b();
/* 46 */         paramFloat1 = (float)(Math.atan2(ah3.c, ah3.a) * 180.0D / Math.PI);
/* 47 */         f1 = (float)(Math.atan(ah3.b) * 73.0D);
/*    */       } 
/*    */     } 
/* 50 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 52 */     GL11.glRotatef(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/* 53 */     GL11.glRotatef(-f1, 0.0F, 0.0F, 1.0F);
/* 54 */     float f2 = paramno.b - paramFloat2;
/* 55 */     float f3 = paramno.a - paramFloat2;
/* 56 */     if (f3 < 0.0F) f3 = 0.0F; 
/* 57 */     if (f2 > 0.0F) {
/* 58 */       GL11.glRotatef(ei.a(f2) * f2 * f3 / 10.0F * paramno.c, 1.0F, 0.0F, 0.0F);
/*    */     }
/*    */     
/* 61 */     if (paramno.d != 0) {
/* 62 */       a("/terrain.png");
/* 63 */       float f = 0.75F;
/* 64 */       GL11.glScalef(f, f, f);
/* 65 */       GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
/* 66 */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 67 */       if (paramno.d == 1) {
/* 68 */         (new ay()).a(ln.au);
/* 69 */       } else if (paramno.d == 2) {
/* 70 */         (new ay()).a(ln.aB);
/*    */       } 
/* 72 */       GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/* 73 */       GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
/* 74 */       GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
/*    */     } 
/*    */     
/* 77 */     a("/item/cart.png");
/* 78 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*    */     
/* 80 */     this.d.b(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/* 81 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ki.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */