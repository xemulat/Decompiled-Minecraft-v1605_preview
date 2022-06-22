/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Random;
/*     */ import mcextension_a1605.auth.PreviewAuth;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.util.glu.GLU;
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
/*     */ public class ct
/*     */   extends bd
/*     */ {
/*  26 */   private String[] splashes = new String[] { "MINECRAFT DEMO", "(Stay tuned for more)" };
/*     */   
/*     */   private String l;
/*     */   private float k;
/*     */   
/*     */   public static int minRemaining() {
/*  32 */     long l = (PreviewAuth.endtime - System.currentTimeMillis()) / 1000L;
/*  33 */     return (int)(l / 60L);
/*     */   }
/*     */   private js[][] i; String[] a;
/*     */   public static String timeRemaining() {
/*  37 */     long l1 = (PreviewAuth.endtime - System.currentTimeMillis()) / 1000L;
/*  38 */     long l2 = l1 % 60L;
/*  39 */     return (l1 / 60L) + ":" + ((l2 < 10L) ? "0" : "") + l2;
/*     */   }
/*     */ 
/*     */   
/*     */   public ct() {
/*  44 */     this.a = new String[] { " *   * * *   * *** *** *** *** *** ***", " ** ** * **  * *   *   * * * * *    * ", " * * * * * * * **  *   **  *** **   * ", " *   * * *  ** *   *   * * * * *    * ", " *   * * *   * *** *** * * * * *    * " };
/*  45 */     this.k = 0.0F;
/*  46 */     this.l = "missingno";
/*  47 */     if (!PreviewAuth.shownPreviewMessage) {
/*  48 */       PreviewAuth.U3RhcnRUaW1lclRocmVhZA();
/*     */     }
/*     */     try {
/*  51 */       this.l = this.splashes[h.nextInt(this.splashes.length)];
/*     */     }
/*  53 */     catch (Exception exception) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {
/*  58 */     this.k++;
/*  59 */     if (this.i != null) {
/*  60 */       for (byte b = 0; b < this.i.length; b++) {
/*  61 */         for (byte b1 = 0; b1 < (this.i[b]).length; b1++) {
/*  62 */           this.i[b][b1].a();
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(char paramChar, int paramInt) {}
/*     */ 
/*     */   
/*     */   public void a() {
/*  74 */     Calendar calendar = Calendar.getInstance();
/*  75 */     calendar.setTime(new Date());
/*  76 */     if (this.b.i.b.equals("athna") && calendar.get(2) + 1 == 7 && calendar.get(5) == 26 && calendar.get(1) == 2010) {
/*  77 */       this.l = "Happy birthday! I love you! Alex x";
/*     */     }
/*  79 */     else if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
/*  80 */       this.l = "Happy birthday, ez!";
/*     */     }
/*  82 */     else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
/*  83 */       this.l = "Happy birthday, Notch!";
/*     */     }
/*  85 */     else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
/*  86 */       this.l = "Merry X-mas!";
/*     */     }
/*  88 */     else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
/*  89 */       this.l = "Happy new year!";
/*     */     } 
/*  91 */     this.e.clear();
/*  92 */     this.e.add(new fb(1, this.c / 2 - 100, this.d / 4 + 48, "Preview singleplayer"));
/*     */ 
/*     */     
/*  95 */     this.e.add(new fb(0, this.c / 2 - 100, this.d / 4 + 120 + 12, "Options..."));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(fb paramfb) {
/* 104 */     if (paramfb.d == 0) {
/* 105 */       this.b.a(new au(this, this.b.y));
/*     */     }
/* 107 */     if (paramfb.d == 1) {
/* 108 */       this.b.a(new jg(this));
/*     */     }
/* 110 */     if (paramfb.d == 2) {
/* 111 */       this.b.a(new ft(this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 117 */     i();
/* 118 */     he he = he.a;
/* 119 */     a(paramFloat);
/* 120 */     GL11.glBindTexture(3553, this.b.n.a("/gui/logo.png"));
/* 121 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 122 */     he.b(16777215);
/* 123 */     GL11.glPushMatrix();
/* 124 */     GL11.glTranslatef((this.c / 2 + 90), 70.0F, 0.0F);
/* 125 */     GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 126 */     float f = (1.8F - ei.e(ei.a((float)(System.currentTimeMillis() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F)) * 100.0F / (this.g.a(this.l) + 32);
/* 127 */     GL11.glScalef(f, f, f);
/* 128 */     a(this.g, this.l, 0, -8, 16776960);
/* 129 */     GL11.glPopMatrix();
/*     */     
/* 131 */     b(this.g, "Copyright Mojang. Distribution strictly prohibited.", this.c - this.g.a("Copyright Mojang. Distribution strictly prohibited.") - 2, this.d - 10, 16777215);
/* 132 */     long l1 = Runtime.getRuntime().maxMemory();
/* 133 */     long l2 = Runtime.getRuntime().totalMemory();
/* 134 */     String str1 = "Free memory: " + ((l1 - Runtime.getRuntime().freeMemory()) * 100L / l1) + "% of " + (l1 / 1024L / 1024L) + "MB";
/* 135 */     b(this.g, str1, this.c - this.g.a(str1) - 2, 2, 8421504);
/* 136 */     String str2 = "Allocated memory: " + (l2 * 100L / l1) + "% (" + (l2 / 1024L / 1024L) + "MB)";
/* 137 */     b(this.g, str2, this.c - this.g.a(str2) - 2, 12, 8421504);
/*     */     
/* 139 */     b(this.g, "Remaining time: " + timeRemaining(), 10, 10, 1077952576);
/*     */     
/* 141 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat) {
/* 145 */     if (this.i == null) {
/* 146 */       this.i = new js[this.a[0].length()][this.a.length];
/* 147 */       for (byte b1 = 0; b1 < this.i.length; b1++) {
/* 148 */         for (byte b2 = 0; b2 < (this.i[b1]).length; b2++) {
/* 149 */           this.i[b1][b2] = new js(this, b1, b2);
/*     */         }
/*     */       } 
/*     */     } 
/* 153 */     GL11.glMatrixMode(5889);
/* 154 */     GL11.glPushMatrix();
/* 155 */     GL11.glLoadIdentity();
/* 156 */     int i = 120 * (new ip(this.b.c, this.b.d)).a;
/* 157 */     GLU.gluPerspective(70.0F, this.b.c / i, 0.05F, 100.0F);
/* 158 */     GL11.glViewport(0, this.b.d - i, this.b.c, i);
/* 159 */     GL11.glMatrixMode(5888);
/* 160 */     GL11.glPushMatrix();
/* 161 */     GL11.glLoadIdentity();
/* 162 */     GL11.glDisable(2884);
/* 163 */     GL11.glCullFace(1029);
/* 164 */     GL11.glDepthMask(true);
/* 165 */     for (byte b = 0; b < 3; b++) {
/* 166 */       GL11.glPushMatrix();
/* 167 */       GL11.glTranslatef(0.4F, 0.6F, -12.0F);
/* 168 */       if (b == 0) {
/* 169 */         GL11.glClear(256);
/* 170 */         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
/* 171 */         GL11.glScalef(0.98F, 1.0F, 1.0F);
/* 172 */         GL11.glEnable(3042);
/* 173 */         GL11.glBlendFunc(770, 771);
/*     */       } 
/* 175 */       if (b == 1) {
/* 176 */         GL11.glDisable(3042);
/* 177 */         GL11.glClear(256);
/*     */       } 
/* 179 */       if (b == 2) {
/* 180 */         GL11.glEnable(3042);
/* 181 */         GL11.glBlendFunc(768, 1);
/*     */       } 
/* 183 */       GL11.glScalef(1.0F, -1.0F, 1.0F);
/* 184 */       GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
/* 185 */       GL11.glScalef(0.89F, 1.0F, 0.4F);
/* 186 */       GL11.glTranslatef(-this.a[0].length() * 0.5F, -this.a.length * 0.5F, 0.0F);
/* 187 */       GL11.glBindTexture(3553, this.b.n.a("/terrain.png"));
/* 188 */       if (b == 0) {
/* 189 */         GL11.glBindTexture(3553, this.b.n.a("/title/black.png"));
/*     */       }
/* 191 */       ay ay = new ay();
/* 192 */       for (byte b1 = 0; b1 < this.a.length; b1++) {
/* 193 */         for (byte b2 = 0; b2 < this.a[b1].length(); b2++) {
/* 194 */           if (this.a[b1].charAt(b2) != ' ') {
/* 195 */             GL11.glPushMatrix();
/* 196 */             js js1 = this.i[b2][b1];
/* 197 */             float f1 = (float)(js1.b + (js1.a - js1.b) * paramFloat);
/* 198 */             float f2 = 1.0F;
/* 199 */             float f3 = 1.0F;
/*     */             
/* 201 */             if (b == 0) {
/* 202 */               f2 = f1 * 0.04F + 1.0F;
/* 203 */               f3 = 1.0F / f2;
/* 204 */               f1 = 0.0F;
/*     */             } 
/* 206 */             GL11.glTranslatef(b2, b1, f1);
/* 207 */             GL11.glScalef(f2, f2, f2);
/* 208 */             GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
/* 209 */             ay.a(ln.t, f3);
/* 210 */             GL11.glPopMatrix();
/*     */           } 
/*     */         } 
/*     */       } 
/* 214 */       GL11.glPopMatrix();
/*     */     } 
/* 216 */     GL11.glDisable(3042);
/* 217 */     GL11.glMatrixMode(5889);
/* 218 */     GL11.glPopMatrix();
/* 219 */     GL11.glMatrixMode(5888);
/* 220 */     GL11.glPopMatrix();
/* 221 */     GL11.glViewport(0, 0, this.b.c, this.b.d);
/* 222 */     GL11.glEnable(2884);
/*     */   }
/*     */ 
/*     */   
/* 226 */   public static final Random h = new Random();
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ct.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */