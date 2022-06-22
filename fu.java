/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fu
/*    */   extends li
/*    */ {
/*    */   private boolean[] e;
/*    */   private fi f;
/*    */   
/*    */   public fu(fi paramfi) {
/* 14 */     InputHandler.CaptureGamepad();
/* 15 */     this.e = new boolean[10];
/* 16 */     this.f = paramfi;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int paramInt, boolean paramBoolean) {
/* 21 */     byte b = -1;
/*    */     
/* 23 */     if (paramInt == this.f.j.b) {
/* 24 */       b = 0;
/*    */     }
/* 26 */     if (paramInt == this.f.l.b) {
/* 27 */       b = 1;
/*    */     }
/* 29 */     if (paramInt == this.f.k.b) {
/* 30 */       b = 2;
/*    */     }
/* 32 */     if (paramInt == this.f.m.b) {
/* 33 */       b = 3;
/*    */     }
/* 35 */     if (paramInt == this.f.n.b) {
/* 36 */       b = 4;
/*    */     }
/* 38 */     if (b >= 0) {
/* 39 */       this.e[b] = paramBoolean;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 45 */     for (byte b = 0; b < 10; b++) {
/* 46 */       this.e[b] = false;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dg paramdg) {
/* 52 */     this.a = 0.0F;
/* 53 */     this.b = 0.0F;
/* 54 */     this.d = this.e[4];
/* 55 */     if (InputHandler.gamepads != null) {
/* 56 */       for (byte b = 0; b != InputHandler.gamepads.length; b++) {
/* 57 */         if (InputHandler.gamepads[b] != null && (InputHandler.gamepads[b].getXAxisValue() != -1.0F || InputHandler.gamepads[b].getYAxisValue() != -1.0F)) {
/* 58 */           this.a = -InputHandler.gamepads[b].getXAxisValue();
/* 59 */           if (this.a > -0.15D && this.a < 0.15D) {
/* 60 */             this.a = 0.0F;
/*    */           }
/* 62 */           this.b = -InputHandler.gamepads[b].getYAxisValue();
/* 63 */           if (this.b > -0.15D && this.b < 0.15D) {
/* 64 */             this.b = 0.0F;
/*    */           }
/* 66 */           if (this.a != 0.0F || this.b != 0.0F) {
/*    */             return;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     }
/* 72 */     if (this.e[0]) {
/* 73 */       this.b++;
/*    */     }
/* 75 */     if (this.e[1]) {
/* 76 */       this.b--;
/*    */     }
/* 78 */     if (this.e[2]) {
/* 79 */       this.a++;
/*    */     }
/* 81 */     if (this.e[3])
/*    */     {
/* 83 */       this.a--;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */