/*      */ package net.minecraft.client;
/*      */ import InputHandler;
/*      */ import ap;
/*      */ import az;
/*      */ import bb;
/*      */ import bd;
/*      */ import be;
/*      */ import bj;
/*      */ import bm;
/*      */ import cj;
/*      */ import cn;
/*      */ import ct;
/*      */ import df;
/*      */ import dg;
/*      */ import e;
/*      */ import ei;
/*      */ import eo;
/*      */ import er;
/*      */ import fe;
/*      */ import fi;
/*      */ import fu;
/*      */ import gf;
/*      */ import gi;
/*      */ import he;
/*      */ import hx;
/*      */ import ig;
/*      */ import ih;
/*      */ import ip;
/*      */ import java.awt.Canvas;
/*      */ import java.awt.Component;
/*      */ import java.awt.Frame;
/*      */ import java.awt.Graphics;
/*      */ import java.io.File;
/*      */ import jp;
/*      */ import jt;
/*      */ import jx;
/*      */ import li;
/*      */ import ln;
/*      */ import mb;
/*      */ import mcextension_a1605.auth.PreviewAuth;
/*      */ import md;
/*      */ import nh;
/*      */ import nr;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.DisplayMode;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import y;
/*      */ 
/*      */ public abstract class Minecraft implements Runnable {
/*   53 */   public hg b = (hg)new hp(this);
/*      */   
/*      */   private boolean a = false;
/*      */   public int c;
/*      */   public int d;
/*      */   private az L;
/*   59 */   private ih M = new ih(20.0F);
/*      */   
/*      */   public cj e;
/*      */   public e f;
/*      */   public be g;
/*      */   public bm h;
/*   65 */   public df i = null;
/*      */   
/*      */   public String j;
/*      */   
/*      */   public Canvas k;
/*      */   public boolean l = true;
/*      */   public volatile boolean m = false;
/*      */   public er n;
/*      */   public jt o;
/*   74 */   public bd p = null;
/*   75 */   public gi q = new gi(this);
/*   76 */   public ig r = new ig(this);
/*      */   private bb N;
/*   78 */   private int O = 0;
/*   79 */   private int P = 0;
/*      */   private int Q;
/*      */   private int R;
/*   82 */   public String s = null;
/*   83 */   public int t = 0;
/*      */   
/*      */   public lk u;
/*      */   public boolean v = false;
/*   87 */   public cn w = new cn(0.0F);
/*   88 */   public lv x = null;
/*      */   public fi y;
/*      */   protected MinecraftApplet z;
/*   91 */   public nr A = new nr();
/*      */   
/*      */   public md B;
/*      */   
/*      */   public File C;
/*   96 */   public static long[] D = new long[512];
/*   97 */   public static int E = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String S;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int T;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private mb U;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private ap V;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, int paramInt) {
/*  133 */     this.S = paramString;
/*  134 */     this.T = paramInt;
/*      */   }
/*      */   
/*  137 */   public Minecraft(Component paramComponent, Canvas paramCanvas, MinecraftApplet paramMinecraftApplet, int paramInt1, int paramInt2, boolean paramBoolean) { this.U = new mb();
/*  138 */     this.V = new ap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  443 */     this.F = true;
/*  444 */     this.G = "";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  663 */     this.H = -1L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  725 */     this.I = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  918 */     this.X = 0;
/*  919 */     this.J = false;
/*      */     
/*  921 */     this.K = System.currentTimeMillis(); this.Q = paramInt1; this.R = paramInt2; this.a = paramBoolean; this.z = paramMinecraftApplet; new fc(this, "Timer hack thread"); this.k = paramCanvas; this.c = paramInt1; this.d = paramInt2; this.a = paramBoolean; }
/*      */   public void a() { if (this.k != null) {
/*      */       Graphics graphics = this.k.getGraphics(); if (graphics != null) {
/*      */         graphics.setColor(Color.BLACK); graphics.fillRect(0, 0, this.c, this.d); graphics.dispose();
/*      */       }  Display.setParent(this.k);
/*      */     } else if (this.a) {
/*      */       Display.setFullscreen(true); this.c = Display.getDisplayMode().getWidth(); this.d = Display.getDisplayMode().getHeight(); if (this.c <= 0)
/*      */         this.c = 1;  if (this.d <= 0)
/*      */         this.d = 1; 
/*      */     } else {
/*      */       Display.setDisplayMode(new DisplayMode(this.c, this.d));
/*      */     }  Display.setTitle("Minecraft Minecraft Alpha v1.0.16_02"); try {
/*      */       Display.create();
/*      */     } catch (LWJGLException lWJGLException) {
/*      */       lWJGLException.printStackTrace(); try {
/*      */         Thread.sleep(1000L);
/*      */       } catch (InterruptedException interruptedException) {} Display.create();
/*      */     }  km.a.f = new iy(this); this.C = b(); this.y = new fi(this, this.C); this.n = new er(this.y); this.o = new jt(this.y, "/default.png", this.n); p(); Keyboard.create(); Mouse.create(); this.B = new md(this.k); try {
/*      */       Controllers.create();
/*      */     } catch (Exception exception) {
/*      */       exception.printStackTrace();
/*      */     }  c("Pre startup"); GL11.glEnable(3553); GL11.glShadeModel(7425); GL11.glClearDepth(1.0D); GL11.glEnable(2929); GL11.glDepthFunc(515); GL11.glEnable(3008); GL11.glAlphaFunc(516, 0.1F); GL11.glCullFace(1029); GL11.glMatrixMode(5889); GL11.glLoadIdentity(); GL11.glMatrixMode(5888); c("Startup"); this.L = new az(); this.A.a(this.y); this.n.a((y)this.V); this.n.a((y)this.U); this.n.a((y)new hj()); this.n.a((y)new ea()); this.n.a((y)new jp(0)); this.n.a((y)new jp(1)); this.f = new e(this, this.n); GL11.glViewport(0, 0, this.c, this.d); this.h = new bm(this.e, this.n); try {
/*      */       this.N = new bb(this.C, this); this.N.start();
/*      */     } catch (Exception exception) {} c("Post startup"); this.u = new lk(this); this.b.a(); if (this.S != null) {
/*      */       a((bd)new mc(this, this.S, this.T));
/*      */     } else {
/*      */       a((bd)new ct());
/*      */     }  }
/*      */   private void p() { ip ip = new ip(this.c, this.d); int i = ip.a(); int j = ip.b(); GL11.glClear(16640); GL11.glMatrixMode(5889); GL11.glLoadIdentity(); GL11.glOrtho(0.0D, i, j, 0.0D, 1000.0D, 3000.0D); GL11.glMatrixMode(5888); GL11.glLoadIdentity(); GL11.glTranslatef(0.0F, 0.0F, -2000.0F); GL11.glViewport(0, 0, this.c, this.d); GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F); he he = he.a; GL11.glDisable(2896); GL11.glEnable(3553); GL11.glDisable(2912); GL11.glBindTexture(3553, this.n.a("/title/mojang.png")); he.b(); he.b(16777215); he.a(0.0D, this.d, 0.0D, 0.0D, 0.0D); he.a(this.c, this.d, 0.0D, 0.0D, 0.0D); he.a(this.c, 0.0D, 0.0D, 0.0D, 0.0D); he.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D); he.a(); char c1 = 'Ā'; char c2 = 'Ā'; GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); he.b(16777215); a((this.c / 2 - c1) / 2, (this.d / 2 - c2) / 2, 0, 0, c1, c2); GL11.glDisable(2896); GL11.glDisable(2912); GL11.glEnable(3008); GL11.glAlphaFunc(516, 0.1F); Display.swapBuffers(); }
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { float f1 = 0.00390625F; float f2 = 0.00390625F; he he = he.a; he.b(); he.a((paramInt1 + 0), (paramInt2 + paramInt6), 0.0D, ((paramInt3 + 0) * f1), ((paramInt4 + paramInt6) * f2)); he.a((paramInt1 + paramInt5), (paramInt2 + paramInt6), 0.0D, ((paramInt3 + paramInt5) * f1), ((paramInt4 + paramInt6) * f2)); he.a((paramInt1 + paramInt5), (paramInt2 + 0), 0.0D, ((paramInt3 + paramInt5) * f1), ((paramInt4 + 0) * f2)); he.a((paramInt1 + 0), (paramInt2 + 0), 0.0D, ((paramInt3 + 0) * f1), ((paramInt4 + 0) * f2)); he.a(); }
/*      */   private static File W = null;
/*      */   public volatile boolean F;
/*      */   public String G;
/*      */   long H;
/*      */   public boolean I;
/*      */   private int X; public boolean J; long K; public static File b() { if (W == null)
/*      */       W = a("minecraft");  return W; } public static File a(String paramString) { File file; String str2, str1 = System.getProperty("user.home", "."); switch (fh.a[q().ordinal()]) {
/*      */       case 1:
/*      */       case 2:
/*      */         file = new File(str1, '.' + paramString + '/'); break;
/*      */       case 3:
/*      */         str2 = System.getenv("APPDATA"); if (str2 != null) {
/*      */           file = new File(str2, "." + paramString + '/'); break;
/*      */         }  file = new File(str1, '.' + paramString + '/'); break;
/*      */       case 4:
/*      */         file = new File(str1, "Library/Application Support/" + paramString); break;
/*      */       default:
/*      */         file = new File(str1, paramString + '/'); break;
/*      */     }  if (!file.exists() && !file.mkdirs())
/*      */       throw new RuntimeException("The working directory could not be created: " + file);  return file; } private static hx q() { String str = System.getProperty("os.name").toLowerCase(); if (str.contains("win"))
/*      */       return hx.c;  if (str.contains("mac"))
/*      */       return hx.d;  if (str.contains("solaris"))
/*      */       return hx.b;  if (str.contains("sunos"))
/*      */       return hx.b;  if (str.contains("linux"))
/*      */       return hx.a;  if (str.contains("unix"))
/*      */       return hx.a;  return hx.e; } private void c(String paramString) { int i = GL11.glGetError(); if (i != 0) {
/*      */       String str = GLU.gluErrorString(i); System.out.println("########## GL ERROR ##########"); System.out.println("@ " + paramString); System.out.println(i + ": " + str);
/*      */       System.exit(0);
/*      */     }  } public void c() { if (this.z != null)
/*      */       this.z.c(); 
/*      */     try {
/*      */       if (this.N != null)
/*      */         this.N.a(); 
/*      */     } catch (Exception exception) {}
/*      */     try {
/*      */       System.out.println("Stopping!");
/*      */       a((cj)null);
/*      */       try {
/*      */         da.a();
/*      */       } catch (Exception exception) {}
/*      */       this.A.b();
/*      */       Mouse.destroy();
/*      */       Keyboard.destroy();
/*      */     } finally {
/*      */       Display.destroy();
/*      */     } 
/*      */     System.gc(); } public void run() { this.F = true;
/*      */     try {
/*      */       a();
/*      */     } catch (Exception exception) {
/*      */       exception.printStackTrace();
/*      */       a(new gf("Failed to start game", exception));
/*      */       return;
/*      */     } 
/*      */     try {
/*      */       long l = System.currentTimeMillis();
/*      */       byte b = 0;
/*      */       while (this.F && (this.z == null || this.z.isActive())) {
/*      */         cb.a();
/*      */         ah.a();
/*      */         if (this.k == null && Display.isCloseRequested())
/*      */           d(); 
/*      */         if (this.m && this.e != null) {
/*      */           float f = this.M.c;
/*      */           this.M.a();
/*      */           this.M.c = f;
/*      */         } else {
/*      */           this.M.a();
/*      */         } 
/*      */         for (byte b1 = 0; b1 < this.M.b; b1++) {
/*      */           this.O++;
/*      */           try {
/*      */             i();
/*      */           } catch (lm lm) {
/*      */             this.e = null;
/*      */             a((cj)null);
/*      */             a((bd)new il());
/*      */           } 
/*      */         } 
/*      */         c("Pre render");
/*      */         this.A.a((fv)this.g, this.M.c);
/*      */         GL11.glEnable(3553);
/*      */         if (this.e != null)
/*      */           while (this.e.e()); 
/*      */         if (!this.v) {
/*      */           this.b.a(this.M.c);
/*      */           this.r.b(this.M.c);
/*      */         } 
/*      */         if (!Display.isActive()) {
/*      */           if (this.a)
/*      */             h(); 
/*      */           Thread.sleep(10L);
/*      */         } 
/*      */         if (Keyboard.isKeyDown(64)) {
/*      */           r();
/*      */         } else {
/*      */           this.H = System.nanoTime();
/*      */         } 
/*      */         Thread.yield();
/*      */         Display.update();
/*      */         if (this.k != null && !this.a && (this.k.getWidth() != this.c || this.k.getHeight() != this.d)) {
/*      */           this.c = this.k.getWidth();
/*      */           this.d = this.k.getHeight();
/*      */           if (this.c <= 0)
/*      */             this.c = 1; 
/*      */           if (this.d <= 0)
/*      */             this.d = 1; 
/*      */           a(this.c, this.d);
/*      */         } 
/*      */         if (this.y.h)
/*      */           Thread.sleep(5L); 
/*      */         c("Post render");
/*      */         b++;
/*      */         this.m = (!j() && this.p != null && this.p.b());
/*      */         while (System.currentTimeMillis() >= l + 1000L) {
/*      */           this.G = b + " fps, " + bj.b + " chunk updates";
/*      */           bj.b = 0;
/*      */           l += 1000L;
/*      */           b = 0;
/*      */         } 
/*      */       } 
/*      */     } catch (ne ne) {
/*      */     
/*      */     } catch (Throwable throwable) {
/*      */       this.e = null;
/*      */       throwable.printStackTrace();
/*      */       a(new gf("Unexpected error", throwable));
/*      */     } finally {
/*      */       c();
/* 1080 */     }  } public boolean j() { return (this.e != null && this.e.v); }
/*      */   private void r() { if (this.H == -1L)
/*      */       this.H = System.nanoTime();  long l1 = System.nanoTime(); D[E++ & D.length - 1] = l1 - this.H; this.H = l1; GL11.glClear(256); GL11.glMatrixMode(5889); GL11.glLoadIdentity(); GL11.glOrtho(0.0D, this.c, this.d, 0.0D, 1000.0D, 3000.0D); GL11.glMatrixMode(5888); GL11.glLoadIdentity(); GL11.glTranslatef(0.0F, 0.0F, -2000.0F); GL11.glLineWidth(1.0F); GL11.glDisable(3553); he he = he.a; he.a(7); he.b(538968064); he.a(0.0D, (this.d - 100), 0.0D); he.a(0.0D, this.d, 0.0D); he.a(D.length, this.d, 0.0D); he.a(D.length, (this.d - 100), 0.0D); he.a(); long l2 = 0L; int i; for (i = 0; i < D.length; i++)
/*      */       l2 += D[i];  i = (int)(l2 / 200000L / D.length); he.a(7); he.b(541065216); he.a(0.0D, (this.d - i), 0.0D); he.a(0.0D, this.d, 0.0D); he.a(D.length, this.d, 0.0D); he.a(D.length, (this.d - i), 0.0D); he.a(); he.a(1); for (byte b = 0; b < D.length; b++) {
/*      */       int j = (b - E & D.length - 1) * 255 / D.length; int k = j * j / 255; k = k * k / 255; int m = k * k / 255; m = m * m / 255; he.b(-16777216 + m + k * 256 + j * 65536); long l = D[b] / 200000L; he.a((b + 0.5F), ((float)(this.d - l) + 0.5F), 0.0D); he.a((b + 0.5F), (this.d + 0.5F), 0.0D);
/*      */     }  he.a(); GL11.glEnable(3553); }
/*      */   public void d() { this.F = false; }
/*      */   public void e() { if (!Display.isActive())
/*      */       return;  if (this.I)
/*      */       return;  this.I = true; this.B.a();
/*      */     a((bd)null);
/* 1091 */     this.X = this.O + 10000; } public void b(String paramString) { a((cj)null);
/* 1092 */     System.gc();
/*      */     
/* 1094 */     cj cj1 = new cj(new File(b(), "saves"), paramString);
/* 1095 */     if (cj1.q)
/* 1096 */     { a(cj1, "Generating level"); }
/*      */     else
/* 1098 */     { a(cj1, "Loading level"); }  } public void f() { if (!this.I) return;  if (this.g != null) this.g.j();  this.I = false; this.B.b(); }
/*      */   public void g() { if (this.p != null) return;  a((bd)new hu()); }
/*      */   private void a(int paramInt, boolean paramBoolean) { if (this.b.b) return;  if (paramInt == 0 && this.P > 0) return;  if (paramBoolean && this.x != null && this.x.a == 0 && paramInt == 0) { int i = this.x.b; int j = this.x.c; int k = this.x.d; this.b.c(i, j, k, this.x.e); this.h.a(i, j, k, this.x.e); } else { this.b.b(); }  }
/*      */   private void a(int paramInt) { if (paramInt == 0 && this.P > 0) return;  if (paramInt == 0) this.g.u();  if (this.x == null) { if (paramInt == 0 && !(this.b instanceof ib)) this.P = 10;  } else if (this.x.a == 1) { if (paramInt == 0) this.g.a(this.x.g);  if (paramInt == 1)
/*      */         this.g.a_(this.x.g);  } else if (this.x.a == 0) { int i = this.x.b; int j = this.x.c; int k = this.x.d; int m = this.x.e; ln ln = ln.n[this.e.a(i, j, k)]; if (paramInt == 0) { this.e.i(i, j, k, this.x.e); if (ln != ln.z || this.g.c >= 100)
/*      */           this.b.a(i, j, k, this.x.e);  } else { eo eo = this.g.b.e(); int n = this.e.a(i, j, k); if (n > 0 && ln.n[n].a(this.e, i, j, k, (dg)this.g))
/*      */           return;  if (eo == null)
/*      */           return;  int i1 = eo.a; if (this.b.a((dg)this.g, this.e, eo, i, j, k, m))
/*      */           this.g.u();  if (eo.a == 0) { this.g.b.a[this.g.b.d] = null; } else if (eo.a != i1) { this.r.a.b(); }  }  }  if (paramInt == 1) { eo eo = this.g.b.e(); if (eo != null) { int i = eo.a; eo eo1 = eo.a(this.e, (dg)this.g); if (eo1 != eo || (eo1 != null && eo1.a != i)) { this.g.b.a[this.g.b.d] = eo1; this.r.a.c(); if (eo1.a == 0)
/*      */             this.g.b.a[this.g.b.d] = null;  }  }  }  }
/*      */   public void h() { try { this.a = !this.a; System.out.println("Toggle fullscreen!"); if (this.a) { Display.setDisplayMode(Display.getDesktopDisplayMode()); this.c = Display.getDisplayMode().getWidth(); this.d = Display.getDisplayMode().getHeight(); if (this.c <= 0)
/*      */           this.c = 1;  if (this.d <= 0)
/*      */           this.d = 1;  } else { if (this.k != null) { this.c = this.k.getWidth(); this.d = this.k.getHeight(); } else { this.c = this.Q; this.d = this.R; }  if (this.c <= 0)
/*      */           this.c = 1;  if (this.d <= 0)
/*      */           this.d = 1;  Display.setDisplayMode(new DisplayMode(this.Q, this.R)); }  f(); Display.setFullscreen(this.a); Display.update(); Thread.sleep(1000L); if (this.a)
/*      */         e();  if (this.p != null) { f(); a(this.c, this.d); }  System.out.println("Size: " + this.c + ", " + this.d); } catch (Exception exception) { exception.printStackTrace(); }  }
/*      */   private void a(int paramInt1, int paramInt2) { if (paramInt1 <= 0)
/*      */       paramInt1 = 1;  if (paramInt2 <= 0)
/*      */       paramInt2 = 1;  this.c = paramInt1; this.d = paramInt2; if (this.p != null) { ip ip = new ip(paramInt1, paramInt2); int i = ip.a(); int j = ip.b(); this.p.a(this, i, j); }  }
/*      */   private void s() { if (this.x != null) { int i = this.e.a(this.x.b, this.x.c, this.x.d); if (i == ln.u.ba)
/*      */         i = ln.v.ba;  if (i == ln.aj.ba)
/*      */         i = ln.ak.ba;  if (i == ln.z.ba)
/*      */         i = ln.t.ba;  this.g.b.a(i, this.b instanceof ib); }  }
/* 1121 */   public void a(cj paramcj) { a(paramcj, ""); }
/*      */ 
/*      */   
/*      */   public void a(cj paramcj, String paramString) {
/* 1125 */     this.A.a(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1146 */     if (this.e != null) this.e.a((nh)this.q); 
/* 1147 */     this.e = paramcj;
/*      */     
/* 1149 */     if (paramcj != null) {
/* 1150 */       this.b.a(paramcj);
/* 1151 */       paramcj.l = this.o;
/*      */       
/* 1153 */       if (!j()) {
/* 1154 */         this.g = (be)paramcj.a(be.class);
/*      */       }
/* 1156 */       else if (this.g != null) {
/* 1157 */         this.g.o();
/*      */         
/* 1159 */         if (paramcj != null) {
/* 1160 */           paramcj.a((jx)this.g);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1165 */       if (!paramcj.v) d(paramString);
/*      */       
/* 1167 */       if (this.g == null) {
/* 1168 */         this.g = (be)this.b.b(paramcj);
/* 1169 */         this.g.o();
/* 1170 */         this.b.a((dg)this.g);
/*      */       } 
/*      */       
/* 1173 */       this.g.a = (li)new fu(this.y);
/* 1174 */       if (this.f != null) this.f.a(paramcj); 
/* 1175 */       if (this.h != null) this.h.a(paramcj); 
/* 1176 */       this.b.b((dg)this.g);
/* 1177 */       paramcj.a((dg)this.g);
/*      */       
/* 1179 */       if (paramcj.q) {
/* 1180 */         paramcj.a((nh)this.q);
/*      */       }
/*      */     } else {
/* 1183 */       this.g = null;
/*      */     } 
/*      */     
/* 1186 */     System.gc();
/* 1187 */     this.K = 0L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void d(String paramString) {
/* 1211 */     this.q.a(paramString);
/* 1212 */     this.q.d("Building terrain");
/* 1213 */     char c1 = '';
/* 1214 */     byte b = 0;
/* 1215 */     int i = c1 * 2 / 16 + 1;
/* 1216 */     i *= i;
/* 1217 */     for (char c2 = -c1; c2 <= c1; c2 += '\020') {
/* 1218 */       int j = this.e.n;
/* 1219 */       int k = this.e.p;
/* 1220 */       if (this.g != null) {
/* 1221 */         j = (int)this.g.ah;
/* 1222 */         k = (int)this.g.aj;
/*      */       } 
/* 1224 */       for (char c = -c1; c <= c1; c += '\020') {
/* 1225 */         this.q.a(b++ * 100 / i);
/* 1226 */         this.e.a(j + c2, 64, k + c);
/* 1227 */         while (this.e.e());
/*      */       } 
/*      */     } 
/*      */     
/* 1231 */     this.q.d("Simulating world for a bit");
/* 1232 */     i = 2000;
/* 1233 */     this.e.j();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, File paramFile) {
/* 1254 */     int i = paramString.indexOf("/");
/* 1255 */     String str = paramString.substring(0, i);
/* 1256 */     paramString = paramString.substring(i + 1);
/* 1257 */     if (str.equalsIgnoreCase("sound")) {
/* 1258 */       this.A.a(paramString, paramFile);
/* 1259 */     } else if (str.equalsIgnoreCase("newsound")) {
/* 1260 */       this.A.a(paramString, paramFile);
/* 1261 */     } else if (str.equalsIgnoreCase("streaming")) {
/* 1262 */       this.A.b(paramString, paramFile);
/* 1263 */     } else if (str.equalsIgnoreCase("music")) {
/* 1264 */       this.A.c(paramString, paramFile);
/* 1265 */     } else if (str.equalsIgnoreCase("newmusic")) {
/* 1266 */       this.A.c(paramString, paramFile);
/*      */     } 
/*      */   }
/*      */   
/*      */   public az k() {
/* 1271 */     return this.L;
/*      */   }
/*      */   
/*      */   public String l() {
/* 1275 */     return this.f.b();
/*      */   }
/*      */   
/*      */   public String m() {
/* 1279 */     return this.f.c();
/*      */   }
/*      */   
/*      */   public String n() {
/* 1283 */     return "P: " + this.h.b() + ". T: " + this.e.d();
/*      */   }
/*      */   
/*      */   public void o() {
/* 1287 */     this.e.a();
/*      */     
/* 1289 */     if (this.g != null) {
/* 1290 */       this.e.d((jx)this.g);
/*      */     }
/*      */     
/* 1293 */     this.g = (be)this.b.b(this.e);
/* 1294 */     this.g.o();
/* 1295 */     this.b.a((dg)this.g);
/* 1296 */     this.e.a((dg)this.g);
/* 1297 */     this.g.a = (li)new fu(this.y);
/* 1298 */     this.b.b((dg)this.g);
/* 1299 */     d("Respawning");
/*      */   }
/*      */   
/*      */   public static void a(String paramString1, String paramString2) {
/* 1303 */     a(paramString1, paramString2, null);
/*      */   }
/*      */   
/*      */   public static void a(String paramString1, String paramString2, String paramString3) {
/* 1307 */     boolean bool = false;
/* 1308 */     String str = paramString1;
/*      */     
/* 1310 */     Frame frame = new Frame("Minecraft");
/* 1311 */     Canvas canvas = new Canvas();
/* 1312 */     frame.setLayout(new BorderLayout());
/*      */     
/* 1314 */     frame.add(canvas, "Center");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1320 */     canvas.setPreferredSize(new Dimension(854, 480));
/* 1321 */     frame.pack();
/* 1322 */     frame.setLocationRelativeTo((Component)null);
/*      */ 
/*      */     
/* 1325 */     fe fe = new fe(frame, canvas, null, 854, 480, bool, frame);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1333 */     Thread thread = new Thread((Runnable)fe, "Minecraft main thread");
/* 1334 */     thread.setPriority(10);
/* 1335 */     ((Minecraft)fe).l = false;
/* 1336 */     ((Minecraft)fe).j = "www.minecraft.net";
/* 1337 */     if (str != null && paramString2 != null) {
/* 1338 */       ((Minecraft)fe).i = new df(str, paramString2);
/*      */     } else {
/* 1340 */       ((Minecraft)fe).i = new df("Player" + (System.currentTimeMillis() % 1000L), "");
/*      */     } 
/*      */     
/* 1343 */     if (paramString3 != null) {
/* 1344 */       String[] arrayOfString = paramString3.split(":");
/* 1345 */       fe.a(arrayOfString[0], Integer.parseInt(arrayOfString[1]));
/*      */     } 
/*      */     
/* 1348 */     frame.setVisible(true);
/* 1349 */     frame.addWindowListener((WindowListener)new fg((Minecraft)fe, thread));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1361 */     thread.start();
/*      */   }
/*      */   
/*      */   public static void main(String[] paramArrayOfString) {
/* 1365 */     String str1 = "Player" + (System.currentTimeMillis() % 1000L);
/* 1366 */     if (paramArrayOfString.length > 0) str1 = paramArrayOfString[0]; 
/* 1367 */     String str2 = "-";
/* 1368 */     if (paramArrayOfString.length > 1) str2 = paramArrayOfString[1];
/*      */     
/* 1370 */     a(str1, str2);
/*      */   }
/*      */   
/*      */   public abstract void a(gf paramgf);
/*      */   
/*      */   public void a(bd parambd) {
/*      */     ct ct;
/*      */     if (this.p instanceof ao)
/*      */       return; 
/*      */     if (this.p != null)
/*      */       this.p.h(); 
/*      */     if (parambd == null && this.e == null) {
/*      */       v();
/*      */       ct = new ct();
/*      */     } 
/*      */     while (true) {
/*      */       this.p = (bd)ct;
/*      */       if (ct != null) {
/*      */         f();
/*      */         ip ip = new ip(this.c, this.d);
/*      */         int i = ip.a();
/*      */         int j = ip.b();
/*      */         ct.a(this, i, j);
/*      */         this.v = false;
/*      */       } else {
/*      */         e();
/*      */       } 
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void i() {
/*      */     this.u.a();
/*      */     this.r.a(1.0F);
/*      */     if (this.g != null)
/*      */       this.g.m(); 
/*      */     if (!this.m && this.e != null)
/*      */       this.b.d(); 
/*      */     GL11.glBindTexture(3553, this.n.a("/terrain.png"));
/*      */     if (!this.m)
/*      */       this.n.a(); 
/*      */     if (this.p == null && this.g != null && this.g.D <= 0)
/*      */       a((bd)null); 
/*      */     if (this.p != null)
/*      */       this.X = this.O + 10000; 
/*      */     if (this.p != null) {
/*      */       this.p.d();
/*      */       if (this.p != null)
/*      */         this.p.g(); 
/*      */     } 
/*      */     if (this.p == null || this.p.f) {
/*      */       while (InputHandler.NextEvent()) {
/*      */         long l = System.currentTimeMillis() - this.K;
/*      */         if (l > 200L)
/*      */           continue; 
/*      */         int i = InputHandler.GetDWheel();
/*      */         if (i != 0)
/*      */           this.g.b.b(i); 
/*      */         if (this.p == null) {
/*      */           if (!this.I && InputHandler.GetEventButtonState()) {
/*      */             e();
/*      */             continue;
/*      */           } 
/*      */           if (InputHandler.GetEventButton() == 0 && InputHandler.GetEventButtonState()) {
/*      */             a(0);
/*      */             this.X = this.O;
/*      */           } 
/*      */           if (InputHandler.GetEventButton() == 1 && InputHandler.GetEventButtonState()) {
/*      */             a(1);
/*      */             this.X = this.O;
/*      */           } 
/*      */           if (InputHandler.GetEventButton() == 2 && InputHandler.GetEventButtonState())
/*      */             s(); 
/*      */           continue;
/*      */         } 
/*      */         if (this.p != null)
/*      */           this.p.e(); 
/*      */       } 
/*      */       if (this.P > 0)
/*      */         this.P--; 
/*      */       while (InputHandler.NextKBEvent()) {
/*      */         this.g.a(InputHandler.GetKBEventKey(), InputHandler.GetKBEventKeyState());
/*      */         if (InputHandler.GetKBEventKeyState()) {
/*      */           if (InputHandler.GetKBEventKey() == 87) {
/*      */             h();
/*      */             continue;
/*      */           } 
/*      */           if (this.p != null) {
/*      */             this.p.f();
/*      */           } else {
/*      */             if (InputHandler.GetKBEventKey() == 1)
/*      */               g(); 
/*      */             if (InputHandler.GetKBEventKey() == 63)
/*      */               this.y.w = !this.y.w; 
/*      */             if (InputHandler.GetKBEventKey() == this.y.o.b)
/*      */               a((bd)new ld((fy)this.g.b, this.g.b.c)); 
/*      */             if (InputHandler.GetKBEventKey() == this.y.p.b)
/*      */               this.g.a(this.g.b.a(this.g.b.d, 1), false); 
/*      */             if (j() && InputHandler.GetKBEventKey() == this.y.q.b)
/*      */               a((bd)new cz()); 
/*      */           } 
/*      */           for (byte b = 0; b < 9; b++) {
/*      */             if (InputHandler.GetKBEventKey() == 2 + b)
/*      */               this.g.b.d = b; 
/*      */           } 
/*      */           if (InputHandler.GetKBEventKey() == this.y.r.b)
/*      */             this.y.b(4, (InputHandler.IsKeyDown(42) || InputHandler.IsKeyDown(54)) ? -1 : 1); 
/*      */         } 
/*      */       } 
/*      */       if (this.p == null) {
/*      */         if (InputHandler.InputMouseAction(0) && (this.O - this.X) >= this.M.a / 4.0F && this.I) {
/*      */           a(0);
/*      */           this.X = this.O;
/*      */         } 
/*      */         if (InputHandler.InputMouseAction(1) && (this.O - this.X) >= this.M.a / 4.0F && this.I) {
/*      */           a(1);
/*      */           this.X = this.O;
/*      */         } 
/*      */       } 
/*      */       a(0, (this.p == null && InputHandler.InputMouseAction(0) && this.I));
/*      */     } 
/*      */     if (this.e != null) {
/*      */       this.e.k = this.y.v;
/*      */       if (!this.m)
/*      */         this.r.a(); 
/*      */       if (!this.m)
/*      */         this.f.d(); 
/*      */       if (!this.m)
/*      */         this.e.c(); 
/*      */       if (!this.m || j())
/*      */         this.e.g(); 
/*      */       if (!this.m && this.e != null)
/*      */         this.e.m(ei.b(this.g.ah), ei.b(this.g.ai), ei.b(this.g.aj)); 
/*      */       if (!this.m)
/*      */         this.h.a(); 
/*      */     } 
/*      */     this.K = System.currentTimeMillis();
/*      */   }
/*      */   
/*      */   private static void v() {
/*      */     if (PreviewAuth.shownPreviewMessage && PreviewAuth.authThread != null)
/*      */       return; 
/*      */     System.exit(-1);
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\net\minecraft\client\Minecraft.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */