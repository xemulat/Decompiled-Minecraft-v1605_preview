/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ju
/*     */   extends ht
/*     */   implements fy
/*     */ {
/*  13 */   private eo[] a = new eo[3];
/*  14 */   private int b = 0;
/*  15 */   private int c = 0;
/*  16 */   private int d = 0;
/*     */   
/*     */   public int a() {
/*  19 */     return this.a.length;
/*     */   }
/*     */   
/*     */   public eo a_(int paramInt) {
/*  23 */     return this.a[paramInt];
/*     */   }
/*     */   
/*     */   public eo a(int paramInt1, int paramInt2) {
/*  27 */     if (this.a[paramInt1] != null) {
/*  28 */       if ((this.a[paramInt1]).a <= paramInt2) {
/*  29 */         eo eo2 = this.a[paramInt1];
/*  30 */         this.a[paramInt1] = null;
/*  31 */         return eo2;
/*     */       } 
/*  33 */       eo eo1 = this.a[paramInt1].a(paramInt2);
/*  34 */       if ((this.a[paramInt1]).a == 0) this.a[paramInt1] = null; 
/*  35 */       return eo1;
/*     */     } 
/*     */     
/*  38 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, eo parameo) {
/*  42 */     this.a[paramInt] = parameo;
/*  43 */     if (parameo != null && parameo.a > c()) parameo.a = c(); 
/*     */   }
/*     */   
/*     */   public String b() {
/*  47 */     return "Chest";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(hc paramhc) {
/*  52 */     super.a(paramhc);
/*  53 */     jy jy = paramhc.l("Items");
/*  54 */     this.a = new eo[a()];
/*  55 */     for (byte b = 0; b < jy.c(); b++) {
/*  56 */       hc hc1 = (hc)jy.a(b);
/*  57 */       byte b1 = hc1.c("Slot");
/*  58 */       if (b1 >= 0 && b1 < this.a.length) this.a[b1] = new eo(hc1);
/*     */     
/*     */     } 
/*  61 */     this.b = paramhc.d("BurnTime");
/*  62 */     this.d = paramhc.d("CookTime");
/*  63 */     this.c = a(this.a[1]);
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/*  67 */     super.b(paramhc);
/*  68 */     paramhc.a("BurnTime", (short)this.b);
/*  69 */     paramhc.a("CookTime", (short)this.d);
/*  70 */     jy jy = new jy();
/*     */     
/*  72 */     for (byte b = 0; b < this.a.length; b++) {
/*  73 */       if (this.a[b] != null) {
/*  74 */         hc hc1 = new hc();
/*  75 */         hc1.a("Slot", (byte)b);
/*  76 */         this.a[b].a(hc1);
/*  77 */         jy.a(hc1);
/*     */       } 
/*     */     } 
/*  80 */     paramhc.a("Items", jy);
/*     */   }
/*     */   
/*     */   public int c() {
/*  84 */     return 64;
/*     */   }
/*     */   
/*     */   public int b(int paramInt) {
/*  88 */     return this.d * paramInt / 200;
/*     */   }
/*     */   
/*     */   public int c(int paramInt) {
/*  92 */     if (this.c == 0) this.c = 200; 
/*  93 */     return this.b * paramInt / this.c;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  97 */     return (this.b > 0);
/*     */   }
/*     */   
/*     */   public void k_() {
/* 101 */     boolean bool1 = (this.b > 0) ? true : false;
/* 102 */     boolean bool2 = false;
/* 103 */     if (this.b > 0) {
/* 104 */       this.b--;
/* 105 */       bool2 = true;
/*     */     } 
/*     */     
/* 108 */     if (this.b == 0 && i()) {
/* 109 */       this.c = this.b = a(this.a[1]);
/* 110 */       if (this.b > 0) {
/* 111 */         bool2 = true;
/* 112 */         if (this.a[1] != null) {
/* 113 */           (this.a[1]).a--;
/* 114 */           if ((this.a[1]).a == 0) this.a[1] = null;
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/* 119 */     if (g() && i()) {
/* 120 */       this.d++;
/* 121 */       if (this.d == 200) {
/* 122 */         this.d = 0;
/* 123 */         h();
/* 124 */         bool2 = true;
/*     */       } 
/*     */     } else {
/* 127 */       this.d = 0;
/*     */     } 
/*     */     
/* 130 */     if (bool1 != ((this.b > 0) ? true : false)) {
/* 131 */       bool2 = true;
/* 132 */       kj.a((this.b > 0), this.e, this.f, this.g, this.h);
/*     */     } 
/*     */     
/* 135 */     if (bool2) this.e.n(this.f, this.g, this.h); 
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 139 */     if (this.a[0] == null) return false; 
/* 140 */     int i = d((this.a[0].a()).aQ);
/* 141 */     if (i < 0) return false; 
/* 142 */     if (this.a[2] == null) return true; 
/* 143 */     if ((this.a[2]).c != i) return false; 
/* 144 */     if ((this.a[2]).a < c() && (this.a[2]).a < this.a[2].c()) return true; 
/* 145 */     if ((this.a[2]).a < dd.c[i].b()) return true; 
/* 146 */     return false;
/*     */   }
/*     */   
/*     */   public void h() {
/* 150 */     if (!i())
/*     */       return; 
/* 152 */     int i = d((this.a[0].a()).aQ);
/* 153 */     if (this.a[2] == null) { this.a[2] = new eo(i, 1); }
/* 154 */     else if ((this.a[2]).c == i) { (this.a[2]).a++; }
/*     */     
/* 156 */     (this.a[0]).a--;
/* 157 */     if ((this.a[0]).a <= 0) this.a[0] = null; 
/*     */   }
/*     */   
/*     */   private int d(int paramInt) {
/* 161 */     if (paramInt == ln.H.ba) return dd.m.aQ; 
/* 162 */     if (paramInt == ln.G.ba) return dd.n.aQ; 
/* 163 */     if (paramInt == ln.aw.ba) return dd.l.aQ; 
/* 164 */     if (paramInt == ln.E.ba) return ln.M.ba; 
/* 165 */     if (paramInt == dd.ao.aQ) return dd.ap.aQ; 
/* 166 */     if (paramInt == ln.w.ba) return ln.t.ba; 
/* 167 */     if (paramInt == dd.aG.aQ) return dd.aF.aQ; 
/* 168 */     return -1;
/*     */   }
/*     */   
/*     */   private int a(eo parameo) {
/* 172 */     if (parameo == null) return 0; 
/* 173 */     int i = (parameo.a()).aQ;
/*     */     
/* 175 */     if (i < 256 && (ln.n[i]).bl == fs.c) {
/* 176 */       return 300;
/*     */     }
/*     */     
/* 179 */     if (i == dd.B.aQ) {
/* 180 */       return 100;
/*     */     }
/*     */     
/* 183 */     if (i == dd.k.aQ) return 1600;
/*     */     
/* 185 */     return 0;
/*     */   }
/*     */   
/*     */   public void d() {
/* 189 */     this.e.n(this.f, this.g, this.h);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ju.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */