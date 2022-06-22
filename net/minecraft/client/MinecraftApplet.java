/*     */ package net.minecraft.client;
/*     */ 
/*     */ import df;
/*     */ import g;
/*     */ import h;
/*     */ import java.applet.Applet;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Canvas;
/*     */ 
/*     */ public class MinecraftApplet extends Applet {
/*     */   private Canvas a;
/*  12 */   private Thread c = null;
/*     */ 
/*     */   
/*     */   private Minecraft b;
/*     */ 
/*     */ 
/*     */   
/*     */   public void init() {
/*  20 */     this.a = (Canvas)new h(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     boolean bool = false;
/*  37 */     if (getParameter("fullscreen") != null) {
/*  38 */       bool = getParameter("fullscreen").equalsIgnoreCase("true");
/*     */     }
/*     */     
/*  41 */     this.b = (Minecraft)new g(this, this, this.a, this, getWidth(), getHeight(), bool);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.b.j = getDocumentBase().getHost();
/*  52 */     if (getDocumentBase().getPort() > 0) {
/*  53 */       this.b.j += ":" + getDocumentBase().getPort();
/*     */     }
/*  55 */     if (getParameter("username") != null && getParameter("sessionid") != null) {
/*  56 */       this.b.i = new df(getParameter("username"), getParameter("sessionid"));
/*  57 */       System.out.println("Setting user: " + this.b.i.b + ", " + this.b.i.c);
/*  58 */       if (getParameter("mppass") != null) {
/*  59 */         this.b.i.d = getParameter("mppass");
/*     */       }
/*     */     } else {
/*  62 */       this.b.i = new df("Player", "");
/*     */     } 
/*     */     
/*  65 */     if (getParameter("loadmap_user") != null && getParameter("loadmap_id") != null) {
/*  66 */       this.b.s = getParameter("loadmap_user");
/*  67 */       this.b.t = Integer.parseInt(getParameter("loadmap_id"));
/*  68 */     } else if (getParameter("server") != null && getParameter("port") != null) {
/*  69 */       this.b.a(getParameter("server"), Integer.parseInt(getParameter("port")));
/*     */     } 
/*     */ 
/*     */     
/*  73 */     this.b.l = true;
/*  74 */     setLayout(new BorderLayout());
/*  75 */     add(this.a, "Center");
/*  76 */     this.a.setFocusable(true);
/*  77 */     validate();
/*     */   }
/*     */   
/*     */   public void a() {
/*  81 */     if (this.c != null)
/*  82 */       return;  this.c = new Thread(this.b, "Minecraft main thread");
/*  83 */     this.c.start();
/*     */   }
/*     */   
/*     */   public void start() {
/*  87 */     if (this.b != null) this.b.m = false; 
/*     */   }
/*     */   
/*     */   public void stop() {
/*  91 */     if (this.b != null) this.b.m = true; 
/*     */   }
/*     */   
/*     */   public void destroy() {
/*  95 */     b();
/*     */   }
/*     */   
/*     */   public void b() {
/*  99 */     if (this.c == null)
/* 100 */       return;  this.b.d();
/*     */     try {
/* 102 */       this.c.join(10000L);
/* 103 */     } catch (InterruptedException interruptedException) {
/*     */       try {
/* 105 */         this.b.c();
/* 106 */       } catch (Exception exception) {
/* 107 */         exception.printStackTrace();
/*     */       } 
/*     */     } 
/* 110 */     this.c = null;
/*     */   }
/*     */   
/*     */   public void c() {
/* 114 */     this.a = null;
/* 115 */     this.b = null;
/* 116 */     this.c = null;
/*     */     try {
/* 118 */       removeAll();
/* 119 */       validate();
/* 120 */     } catch (Exception exception) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\net\minecraft\client\MinecraftApplet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */