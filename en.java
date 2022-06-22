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
/*     */ public class en
/*     */   implements fy
/*     */ {
/*  17 */   public eo[] a = new eo[36];
/*  18 */   public eo[] b = new eo[4];
/*  19 */   public eo[] c = new eo[4];
/*  20 */   public int d = 0;
/*     */   private dg e;
/*     */   
/*     */   public en(dg paramdg) {
/*  24 */     this.e = paramdg;
/*     */   }
/*     */   
/*     */   public eo e() {
/*  28 */     return this.a[this.d];
/*     */   }
/*     */   
/*     */   private int f(int paramInt) {
/*  32 */     for (byte b = 0; b < this.a.length; b++) {
/*  33 */       if (this.a[b] != null && (this.a[b]).c == paramInt) return b; 
/*     */     } 
/*  35 */     return -1;
/*     */   }
/*     */   
/*     */   private int g(int paramInt) {
/*  39 */     for (byte b = 0; b < this.a.length; b++) {
/*  40 */       if (this.a[b] != null && (this.a[b]).c == paramInt && (this.a[b]).a < this.a[b].c() && (this.a[b]).a < c()) return b; 
/*     */     } 
/*  42 */     return -1;
/*     */   }
/*     */   
/*     */   private int i() {
/*  46 */     for (byte b = 0; b < this.a.length; b++) {
/*  47 */       if (this.a[b] == null) return b; 
/*     */     } 
/*  49 */     return -1;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, boolean paramBoolean) {
/*  53 */     int i = f(paramInt);
/*  54 */     if (i >= 0 && i < 9) {
/*  55 */       this.d = i;
/*     */       return;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int paramInt) {
/*  67 */     if (paramInt > 0) paramInt = 1; 
/*  68 */     if (paramInt < 0) paramInt = -1;
/*     */     
/*  70 */     this.d -= paramInt;
/*     */     
/*  72 */     while (this.d < 0)
/*  73 */       this.d += 9; 
/*  74 */     while (this.d >= 9) {
/*  75 */       this.d -= 9;
/*     */     }
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
/*     */   private int b(int paramInt1, int paramInt2) {
/*  95 */     int i = g(paramInt1);
/*  96 */     if (i < 0) i = i(); 
/*  97 */     if (i < 0) return paramInt2; 
/*  98 */     if (this.a[i] == null) {
/*  99 */       this.a[i] = new eo(paramInt1, 0);
/*     */     }
/*     */     
/* 102 */     int j = paramInt2;
/* 103 */     if (j > this.a[i].c() - (this.a[i]).a) {
/* 104 */       j = this.a[i].c() - (this.a[i]).a;
/*     */     }
/* 106 */     if (j > c() - (this.a[i]).a) {
/* 107 */       j = c() - (this.a[i]).a;
/*     */     }
/*     */     
/* 110 */     if (j == 0) return paramInt2;
/*     */     
/* 112 */     paramInt2 -= j;
/* 113 */     (this.a[i]).a += j;
/* 114 */     (this.a[i]).b = 5;
/*     */     
/* 116 */     return paramInt2;
/*     */   }
/*     */   
/*     */   public void f() {
/* 120 */     for (byte b = 0; b < this.a.length; b++) {
/* 121 */       if (this.a[b] != null && (this.a[b]).b > 0) (this.a[b]).b--; 
/*     */     } 
/*     */   }
/*     */   public boolean c(int paramInt) {
/* 125 */     int i = f(paramInt);
/* 126 */     if (i < 0) return false; 
/* 127 */     if (--(this.a[i]).a <= 0) this.a[i] = null;
/*     */     
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(eo parameo) {
/* 139 */     if (parameo.d == 0) {
/* 140 */       parameo.a = b(parameo.c, parameo.a);
/* 141 */       if (parameo.a == 0) return true;
/*     */     
/*     */     } 
/* 144 */     int i = i();
/* 145 */     if (i >= 0) {
/* 146 */       this.a[i] = parameo;
/* 147 */       (this.a[i]).b = 5;
/* 148 */       return true;
/*     */     } 
/* 150 */     return false;
/*     */   }
/*     */   
/*     */   public eo a(int paramInt1, int paramInt2) {
/* 154 */     eo[] arrayOfEo = this.a;
/* 155 */     if (paramInt1 >= this.a.length) {
/* 156 */       arrayOfEo = this.b;
/* 157 */       paramInt1 -= this.a.length;
/*     */     } 
/*     */     
/* 160 */     if (arrayOfEo[paramInt1] != null) {
/* 161 */       if ((arrayOfEo[paramInt1]).a <= paramInt2) {
/* 162 */         eo eo2 = arrayOfEo[paramInt1];
/* 163 */         arrayOfEo[paramInt1] = null;
/* 164 */         return eo2;
/*     */       } 
/* 166 */       eo eo1 = arrayOfEo[paramInt1].a(paramInt2);
/* 167 */       if ((arrayOfEo[paramInt1]).a == 0) arrayOfEo[paramInt1] = null; 
/* 168 */       return eo1;
/*     */     } 
/*     */     
/* 171 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, eo parameo) {
/* 175 */     eo[] arrayOfEo = this.a;
/* 176 */     if (paramInt >= arrayOfEo.length) {
/* 177 */       paramInt -= arrayOfEo.length;
/* 178 */       arrayOfEo = this.b;
/*     */     } 
/* 180 */     if (paramInt >= arrayOfEo.length) {
/* 181 */       paramInt -= arrayOfEo.length;
/* 182 */       arrayOfEo = this.c;
/*     */     } 
/*     */     
/* 185 */     arrayOfEo[paramInt] = parameo;
/*     */   }
/*     */   
/*     */   public float a(ln paramln) {
/* 189 */     float f = 1.0F;
/* 190 */     if (this.a[this.d] != null) f *= this.a[this.d].a(paramln); 
/* 191 */     return f;
/*     */   }
/*     */   public jy a(jy paramjy) {
/*     */     byte b;
/* 195 */     for (b = 0; b < this.a.length; b++) {
/* 196 */       if (this.a[b] != null) {
/* 197 */         hc hc = new hc();
/* 198 */         hc.a("Slot", (byte)b);
/* 199 */         this.a[b].a(hc);
/* 200 */         paramjy.a(hc);
/*     */       } 
/*     */     } 
/* 203 */     for (b = 0; b < this.b.length; b++) {
/* 204 */       if (this.b[b] != null) {
/* 205 */         hc hc = new hc();
/* 206 */         hc.a("Slot", (byte)(b + 100));
/* 207 */         this.b[b].a(hc);
/* 208 */         paramjy.a(hc);
/*     */       } 
/*     */     } 
/* 211 */     for (b = 0; b < this.c.length; b++) {
/* 212 */       if (this.c[b] != null) {
/* 213 */         hc hc = new hc();
/* 214 */         hc.a("Slot", (byte)(b + 80));
/* 215 */         this.c[b].a(hc);
/* 216 */         paramjy.a(hc);
/*     */       } 
/*     */     } 
/* 219 */     return paramjy;
/*     */   }
/*     */   
/*     */   public void b(jy paramjy) {
/* 223 */     this.a = new eo[36];
/* 224 */     this.b = new eo[4];
/* 225 */     this.c = new eo[4];
/* 226 */     for (byte b = 0; b < paramjy.c(); b++) {
/* 227 */       hc hc = (hc)paramjy.a(b);
/* 228 */       int i = hc.c("Slot") & 0xFF;
/* 229 */       if (i >= 0 && i < this.a.length) this.a[i] = new eo(hc); 
/* 230 */       if (i >= 80 && i < this.c.length + 80) this.c[i - 80] = new eo(hc); 
/* 231 */       if (i >= 100 && i < this.b.length + 100) this.b[i - 100] = new eo(hc); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a() {
/* 236 */     return this.a.length + 4;
/*     */   }
/*     */   
/*     */   public eo a_(int paramInt) {
/* 240 */     eo[] arrayOfEo = this.a;
/* 241 */     if (paramInt >= arrayOfEo.length) {
/* 242 */       paramInt -= arrayOfEo.length;
/* 243 */       arrayOfEo = this.b;
/*     */     } 
/* 245 */     if (paramInt >= arrayOfEo.length) {
/* 246 */       paramInt -= arrayOfEo.length;
/* 247 */       arrayOfEo = this.c;
/*     */     } 
/*     */     
/* 250 */     return arrayOfEo[paramInt];
/*     */   }
/*     */   
/*     */   public String b() {
/* 254 */     return "Inventory";
/*     */   }
/*     */   
/*     */   public int c() {
/* 258 */     return 64;
/*     */   }
/*     */   
/*     */   public int a(jx paramjx) {
/* 262 */     eo eo1 = a_(this.d);
/* 263 */     if (eo1 != null) return eo1.a(paramjx); 
/* 264 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean b(ln paramln) {
/* 268 */     if (paramln.bl != fs.d && paramln.bl != fs.e && paramln.bl != fs.t && paramln.bl != fs.s) return true;
/*     */     
/* 270 */     eo eo1 = a_(this.d);
/* 271 */     if (eo1 != null) return eo1.b(paramln); 
/* 272 */     return false;
/*     */   }
/*     */   
/*     */   public eo d(int paramInt) {
/* 276 */     return this.b[paramInt];
/*     */   }
/*     */   
/*     */   public int g() {
/* 280 */     int i = 0;
/* 281 */     int j = 0;
/* 282 */     int k = 0;
/* 283 */     for (byte b = 0; b < this.b.length; b++) {
/* 284 */       if (this.b[b] != null && this.b[b].a() instanceof mf) {
/* 285 */         int m = this.b[b].d();
/* 286 */         int n = (this.b[b]).d;
/*     */         
/* 288 */         int i1 = m - n;
/* 289 */         j += i1;
/* 290 */         k += m;
/*     */         
/* 292 */         int i2 = ((mf)this.b[b].a()).aW;
/*     */         
/* 294 */         i += i2;
/*     */       } 
/*     */     } 
/* 297 */     if (k == 0) return 0; 
/* 298 */     return (i - 1) * j / k + 1;
/*     */   }
/*     */   
/*     */   public void e(int paramInt) {
/* 302 */     for (byte b = 0; b < this.b.length; b++) {
/* 303 */       if (this.b[b] != null && this.b[b].a() instanceof mf) {
/* 304 */         this.b[b].b(paramInt);
/* 305 */         if ((this.b[b]).a == 0) {
/* 306 */           this.b[b].a(this.e);
/* 307 */           this.b[b] = null;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void h() {
/*     */     byte b;
/* 314 */     for (b = 0; b < this.a.length; b++) {
/* 315 */       if (this.a[b] != null) {
/* 316 */         this.e.a(this.a[b], true);
/* 317 */         this.a[b] = null;
/*     */       } 
/*     */     } 
/* 320 */     for (b = 0; b < this.b.length; b++) {
/* 321 */       if (this.b[b] != null) {
/* 322 */         this.e.a(this.b[b], true);
/* 323 */         this.b[b] = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void d() {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\en.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */