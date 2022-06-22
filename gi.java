/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.opengl.Display;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gi
/*     */   implements nh
/*     */ {
/*  14 */   private String a = "";
/*     */   private Minecraft b;
/*  16 */   private String c = "";
/*  17 */   private long d = System.currentTimeMillis();
/*     */   private boolean e = false;
/*     */   
/*     */   public gi(Minecraft paramMinecraft) {
/*  21 */     this.b = paramMinecraft;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  25 */     this.e = false;
/*  26 */     c(paramString);
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  30 */     this.e = true;
/*  31 */     c(this.c);
/*     */   }
/*     */   
/*     */   public void c(String paramString) {
/*  35 */     if (!this.b.F) {
/*  36 */       if (this.e)
/*  37 */         return;  throw new ne();
/*     */     } 
/*     */     
/*  40 */     this.c = paramString;
/*  41 */     ip ip = new ip(this.b.c, this.b.d);
/*  42 */     int i = ip.a();
/*  43 */     int j = ip.b();
/*     */     
/*  45 */     GL11.glClear(256);
/*  46 */     GL11.glMatrixMode(5889);
/*  47 */     GL11.glLoadIdentity();
/*  48 */     GL11.glOrtho(0.0D, i, j, 0.0D, 100.0D, 300.0D);
/*  49 */     GL11.glMatrixMode(5888);
/*  50 */     GL11.glLoadIdentity();
/*  51 */     GL11.glTranslatef(0.0F, 0.0F, -200.0F);
/*     */   }
/*     */   
/*     */   public void d(String paramString) {
/*  55 */     if (!this.b.F) {
/*  56 */       if (this.e)
/*  57 */         return;  throw new ne();
/*     */     } 
/*     */ 
/*     */     
/*  61 */     this.d = 0L;
/*  62 */     this.a = paramString;
/*  63 */     a(-1);
/*  64 */     this.d = 0L;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  68 */     if (!this.b.F) {
/*  69 */       if (this.e)
/*  70 */         return;  throw new ne();
/*     */     } 
/*     */ 
/*     */     
/*  74 */     long l = System.currentTimeMillis();
/*  75 */     if (l - this.d < 20L)
/*  76 */       return;  this.d = l;
/*     */     
/*  78 */     ip ip = new ip(this.b.c, this.b.d);
/*  79 */     int i = ip.a();
/*  80 */     int j = ip.b();
/*     */     
/*  82 */     GL11.glClear(256);
/*  83 */     GL11.glMatrixMode(5889);
/*  84 */     GL11.glLoadIdentity();
/*  85 */     GL11.glOrtho(0.0D, i, j, 0.0D, 100.0D, 300.0D);
/*  86 */     GL11.glMatrixMode(5888);
/*  87 */     GL11.glLoadIdentity();
/*  88 */     GL11.glTranslatef(0.0F, 0.0F, -200.0F);
/*     */     
/*  90 */     GL11.glClear(16640);
/*     */     
/*  92 */     he he = he.a;
/*  93 */     int k = this.b.n.a("/dirt.png");
/*  94 */     GL11.glBindTexture(3553, k);
/*  95 */     float f = 32.0F;
/*  96 */     he.b();
/*  97 */     he.b(4210752);
/*  98 */     he.a(0.0D, j, 0.0D, 0.0D, (j / f));
/*  99 */     he.a(i, j, 0.0D, (i / f), (j / f));
/* 100 */     he.a(i, 0.0D, 0.0D, (i / f), 0.0D);
/* 101 */     he.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 102 */     he.a();
/*     */     
/* 104 */     if (paramInt >= 0) {
/* 105 */       byte b1 = 100;
/* 106 */       byte b2 = 2;
/* 107 */       int m = i / 2 - b1 / 2;
/* 108 */       int n = j / 2 + 16;
/*     */       
/* 110 */       GL11.glDisable(3553);
/* 111 */       he.b();
/* 112 */       he.b(8421504);
/* 113 */       he.a(m, n, 0.0D);
/* 114 */       he.a(m, (n + b2), 0.0D);
/* 115 */       he.a((m + b1), (n + b2), 0.0D);
/* 116 */       he.a((m + b1), n, 0.0D);
/*     */       
/* 118 */       he.b(8454016);
/* 119 */       he.a(m, n, 0.0D);
/* 120 */       he.a(m, (n + b2), 0.0D);
/* 121 */       he.a((m + paramInt), (n + b2), 0.0D);
/* 122 */       he.a((m + paramInt), n, 0.0D);
/* 123 */       he.a();
/* 124 */       GL11.glEnable(3553);
/*     */     } 
/*     */     
/* 127 */     this.b.o.a(this.c, (i - this.b.o.a(this.c)) / 2, j / 2 - 4 - 16, 16777215);
/* 128 */     this.b.o.a(this.a, (i - this.b.o.a(this.a)) / 2, j / 2 - 4 + 8, 16777215);
/* 129 */     Display.update();
/*     */     
/*     */     try {
/* 132 */       Thread.yield();
/* 133 */     } catch (Exception exception) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */