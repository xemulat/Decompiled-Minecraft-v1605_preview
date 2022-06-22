/*    */ package net.minecraft.isom;
/*    */ 
/*    */ import ab;
/*    */ import java.applet.Applet;
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Component;
/*    */ 
/*    */ public class IsomPreviewApplet extends Applet {
/*  9 */   private ab a = new ab();
/*    */   
/*    */   public IsomPreviewApplet() {
/* 12 */     setLayout(new BorderLayout());
/* 13 */     add((Component)this.a, "Center");
/*    */   }
/*    */   
/*    */   public void start() {
/* 17 */     this.a.b();
/*    */   }
/*    */   
/*    */   public void stop() {
/* 21 */     this.a.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\net\minecraft\isom\IsomPreviewApplet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */