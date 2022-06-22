/*     */ import java.awt.Canvas;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.image.BufferStrategy;
/*     */ import java.awt.image.ImageObserver;
/*     */ import java.io.File;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public class ab
/*     */   extends Canvas
/*     */   implements KeyListener, MouseListener, MouseMotionListener, Runnable
/*     */ {
/*  25 */   private int a = 0;
/*  26 */   private int b = 2;
/*     */   
/*     */   private boolean c = true;
/*     */   
/*     */   private cj d;
/*     */   
/*     */   private File e;
/*     */   private boolean f = true;
/*  34 */   private List g = Collections.synchronizedList(new LinkedList()); private int i; private int j;
/*  35 */   private iz[][] h = new iz[64][64]; private int k;
/*     */   private int l;
/*     */   
/*     */   public File a() {
/*  39 */     if (this.e == null) this.e = a("minecraft"); 
/*  40 */     return this.e;
/*     */   }
/*     */   public File a(String paramString) {
/*     */     File file;
/*  44 */     String str2, str1 = System.getProperty("user.home", ".");
/*     */     
/*  46 */     switch (lc.a[e().ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/*  49 */         file = new File(str1, '.' + paramString + '/');
/*     */         break;
/*     */       case 3:
/*  52 */         str2 = System.getenv("APPDATA");
/*  53 */         if (str2 != null) { file = new File(str2, "." + paramString + '/'); break; }
/*  54 */          file = new File(str1, '.' + paramString + '/');
/*     */         break;
/*     */       case 4:
/*  57 */         file = new File(str1, "Library/Application Support/" + paramString);
/*     */         break;
/*     */       default:
/*  60 */         file = new File(str1, paramString + '/'); break;
/*     */     } 
/*  62 */     if (!file.exists() && !file.mkdirs()) throw new RuntimeException("The working directory could not be created: " + file); 
/*  63 */     return file;
/*     */   }
/*     */   
/*     */   private static es e() {
/*  67 */     String str = System.getProperty("os.name").toLowerCase();
/*  68 */     if (str.contains("win")) return es.c; 
/*  69 */     if (str.contains("mac")) return es.d; 
/*  70 */     if (str.contains("solaris")) return es.b; 
/*  71 */     if (str.contains("sunos")) return es.b; 
/*  72 */     if (str.contains("linux")) return es.a; 
/*  73 */     if (str.contains("unix")) return es.a; 
/*  74 */     return es.e;
/*     */   }
/*     */   
/*     */   public ab() {
/*  78 */     this.e = a();
/*     */     
/*  80 */     for (byte b = 0; b < 64; b++) {
/*  81 */       for (byte b1 = 0; b1 < 64; b1++) {
/*  82 */         this.h[b][b1] = new iz(null, b, b1);
/*     */       }
/*     */     } 
/*  85 */     addMouseListener(this);
/*  86 */     addMouseMotionListener(this);
/*  87 */     addKeyListener(this);
/*  88 */     setFocusable(true);
/*  89 */     requestFocus();
/*  90 */     setBackground(Color.red);
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  94 */     this.i = this.j = 0;
/*  95 */     this.d = new kz(this, new File(this.e, "saves"), paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.d.e = 0;
/*     */     
/* 104 */     synchronized (this.g) {
/* 105 */       this.g.clear();
/*     */       
/* 107 */       for (byte b = 0; b < 64; b++) {
/* 108 */         for (byte b1 = 0; b1 < 64; b1++) {
/* 109 */           this.h[b][b1].a(this.d, b, b1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int paramInt) {
/* 116 */     synchronized (this.g) {
/* 117 */       this.d.e = paramInt;
/* 118 */       this.g.clear();
/*     */       
/* 120 */       for (byte b = 0; b < 64; b++) {
/* 121 */         for (byte b1 = 0; b1 < 64; b1++)
/* 122 */           this.h[b][b1].a(this.d, b, b1); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/* 128 */     (new kw(this)).start();
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
/* 140 */     for (byte b = 0; b < 8; b++) {
/* 141 */       (new Thread(this)).start();
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 146 */     this.f = false;
/*     */   }
/*     */   
/*     */   private iz a(int paramInt1, int paramInt2) {
/* 150 */     int i = paramInt1 & 0x3F;
/* 151 */     int j = paramInt2 & 0x3F;
/* 152 */     iz iz1 = this.h[i][j];
/* 153 */     if (iz1.c == paramInt1 && iz1.d == paramInt2) {
/* 154 */       return iz1;
/*     */     }
/* 156 */     synchronized (this.g) {
/* 157 */       this.g.remove(iz1);
/*     */     } 
/* 159 */     iz1.a(paramInt1, paramInt2);
/* 160 */     return iz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/* 165 */     ll ll = new ll();
/*     */     
/* 167 */     while (this.f) {
/* 168 */       iz iz1 = null;
/* 169 */       synchronized (this.g) {
/* 170 */         if (this.g.size() > 0) {
/* 171 */           iz1 = this.g.remove(0);
/*     */         }
/*     */       } 
/*     */       
/* 175 */       if (iz1 != null) {
/* 176 */         if (this.a - iz1.g < 2) {
/* 177 */           ll.a(iz1);
/* 178 */           repaint();
/*     */         } else {
/* 180 */           iz1.h = false;
/*     */         } 
/*     */       }
/*     */       try {
/* 184 */         Thread.sleep(2L);
/* 185 */       } catch (InterruptedException interruptedException) {
/* 186 */         interruptedException.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void update(Graphics paramGraphics) {}
/*     */ 
/*     */   
/*     */   public void paint(Graphics paramGraphics) {}
/*     */   
/*     */   public void d() {
/* 198 */     BufferStrategy bufferStrategy = getBufferStrategy();
/* 199 */     if (bufferStrategy == null) {
/* 200 */       createBufferStrategy(2);
/*     */       return;
/*     */     } 
/* 203 */     a((Graphics2D)bufferStrategy.getDrawGraphics());
/* 204 */     bufferStrategy.show();
/*     */   }
/*     */   
/*     */   public void a(Graphics2D paramGraphics2D) {
/* 208 */     this.a++;
/*     */     
/* 210 */     AffineTransform affineTransform = paramGraphics2D.getTransform();
/* 211 */     paramGraphics2D.setClip(0, 0, getWidth(), getHeight());
/* 212 */     paramGraphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
/*     */     
/* 214 */     paramGraphics2D.translate(getWidth() / 2, getHeight() / 2);
/* 215 */     paramGraphics2D.scale(this.b, this.b);
/* 216 */     paramGraphics2D.translate(this.i, this.j);
/* 217 */     if (this.d != null) {
/* 218 */       paramGraphics2D.translate(-(this.d.n + this.d.p), -(-this.d.n + this.d.p) + 64);
/*     */     }
/* 220 */     Rectangle rectangle = paramGraphics2D.getClipBounds();
/* 221 */     paramGraphics2D.setColor(new Color(-15724512));
/* 222 */     paramGraphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
/*     */     
/* 224 */     byte b1 = 16;
/*     */     
/* 226 */     byte b2 = 3;
/* 227 */     int i = rectangle.x / b1 / 2 - 2 - b2;
/* 228 */     int j = (rectangle.x + rectangle.width) / b1 / 2 + 1 + b2;
/* 229 */     int k = rectangle.y / b1 - 1 - b2 * 2;
/* 230 */     int m = (rectangle.y + rectangle.height + 16 + 128) / b1 + 1 + b2 * 2;
/*     */     int n;
/* 232 */     for (n = k; n <= m; n++) {
/* 233 */       for (int i1 = i; i1 <= j; i1++) {
/* 234 */         int i2 = i1 - (n >> 1);
/* 235 */         int i3 = i1 + (n + 1 >> 1);
/* 236 */         iz iz1 = a(i2, i3);
/* 237 */         iz1.g = this.a;
/* 238 */         if (!iz1.e) {
/* 239 */           if (!iz1.h) {
/* 240 */             iz1.h = true;
/* 241 */             this.g.add(iz1);
/*     */           } 
/*     */         } else {
/* 244 */           iz1.h = false;
/* 245 */           if (!iz1.f) {
/* 246 */             int i4 = i1 * b1 * 2 + (n & 0x1) * b1;
/* 247 */             int i5 = n * b1 - 128 - 16;
/*     */             
/* 249 */             paramGraphics2D.drawImage(iz1.a, i4, i5, (ImageObserver)null);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 255 */     if (this.c) {
/* 256 */       paramGraphics2D.setTransform(affineTransform);
/* 257 */       n = getHeight() - 32 - 4;
/* 258 */       paramGraphics2D.setColor(new Color(-2147483648, true));
/*     */ 
/*     */       
/* 261 */       paramGraphics2D.fillRect(4, getHeight() - 32 - 4, getWidth() - 8, 32);
/*     */       
/* 263 */       paramGraphics2D.setColor(Color.WHITE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 271 */       String str = "F1 - F5: load levels   |   0-9: Set time of day   |   Space: return to spawn   |   Double click: zoom   |   Escape: hide this text";
/* 272 */       paramGraphics2D.drawString(str, getWidth() / 2 - paramGraphics2D.getFontMetrics().stringWidth(str) / 2, n + 20);
/*     */     } 
/*     */     
/* 275 */     paramGraphics2D.dispose();
/*     */   }
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
/*     */ 
/*     */   
/*     */   public void mouseDragged(MouseEvent paramMouseEvent) {
/* 295 */     int i = paramMouseEvent.getX() / this.b;
/* 296 */     int j = paramMouseEvent.getY() / this.b;
/* 297 */     this.i += i - this.k;
/* 298 */     this.j += j - this.l;
/* 299 */     this.k = i;
/* 300 */     this.l = j;
/* 301 */     repaint();
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseMoved(MouseEvent paramMouseEvent) {}
/*     */   
/*     */   public void mouseClicked(MouseEvent paramMouseEvent) {
/* 308 */     if (paramMouseEvent.getClickCount() == 2) {
/* 309 */       this.b = 3 - this.b;
/* 310 */       repaint();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseEntered(MouseEvent paramMouseEvent) {}
/*     */ 
/*     */   
/*     */   public void mouseExited(MouseEvent paramMouseEvent) {}
/*     */   
/*     */   public void mousePressed(MouseEvent paramMouseEvent) {
/* 321 */     int i = paramMouseEvent.getX() / this.b;
/* 322 */     int j = paramMouseEvent.getY() / this.b;
/* 323 */     this.k = i;
/* 324 */     this.l = j;
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseReleased(MouseEvent paramMouseEvent) {}
/*     */   
/*     */   public void keyPressed(KeyEvent paramKeyEvent) {
/* 331 */     if (paramKeyEvent.getKeyCode() == 48) a(11); 
/* 332 */     if (paramKeyEvent.getKeyCode() == 49) a(10); 
/* 333 */     if (paramKeyEvent.getKeyCode() == 50) a(9); 
/* 334 */     if (paramKeyEvent.getKeyCode() == 51) a(7); 
/* 335 */     if (paramKeyEvent.getKeyCode() == 52) a(6); 
/* 336 */     if (paramKeyEvent.getKeyCode() == 53) a(5); 
/* 337 */     if (paramKeyEvent.getKeyCode() == 54) a(3); 
/* 338 */     if (paramKeyEvent.getKeyCode() == 55) a(2); 
/* 339 */     if (paramKeyEvent.getKeyCode() == 56) a(1); 
/* 340 */     if (paramKeyEvent.getKeyCode() == 57) a(0);
/*     */     
/* 342 */     if (paramKeyEvent.getKeyCode() == 112) b("World1"); 
/* 343 */     if (paramKeyEvent.getKeyCode() == 113) b("World2"); 
/* 344 */     if (paramKeyEvent.getKeyCode() == 114) b("World3"); 
/* 345 */     if (paramKeyEvent.getKeyCode() == 115) b("World4"); 
/* 346 */     if (paramKeyEvent.getKeyCode() == 116) b("World5");
/*     */     
/* 348 */     if (paramKeyEvent.getKeyCode() == 32) this.i = this.j = 0; 
/* 349 */     if (paramKeyEvent.getKeyCode() == 27) this.c = !this.c; 
/* 350 */     repaint();
/*     */   }
/*     */   
/*     */   public void keyReleased(KeyEvent paramKeyEvent) {}
/*     */   
/*     */   public void keyTyped(KeyEvent paramKeyEvent) {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */