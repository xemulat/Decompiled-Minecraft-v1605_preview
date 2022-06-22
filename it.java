/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class it
/*     */   extends jx
/*     */ {
/*  15 */   private int c = 0;
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
/*     */   
/*  51 */   public int a = 0;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   public el b;
/*     */   
/*     */   public it(cj paramcj) {
/*  58 */     super(paramcj);
/*  59 */     this.ay = 0.0F;
/*  60 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public it(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  64 */     this(paramcj);
/*  65 */     this.d = paramInt1;
/*  66 */     this.e = paramInt2;
/*  67 */     this.f = paramInt3;
/*     */     
/*  69 */     ArrayList<el> arrayList = new ArrayList();
/*  70 */     for (el el1 : el.values()) {
/*  71 */       this.b = el1;
/*  72 */       b(paramInt4);
/*  73 */       if (i()) {
/*  74 */         arrayList.add(el1);
/*     */       }
/*     */     } 
/*  77 */     if (arrayList.size() > 0) {
/*  78 */       this.b = arrayList.get(this.aN.nextInt(arrayList.size()));
/*     */     }
/*  80 */     b(paramInt4);
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*  84 */     this.a = paramInt;
/*  85 */     this.ap = this.an = (paramInt * 90);
/*     */     
/*  87 */     float f1 = this.b.u;
/*  88 */     float f2 = this.b.v;
/*  89 */     float f3 = this.b.u;
/*     */     
/*  91 */     if (paramInt == 0 || paramInt == 2) {
/*  92 */       f3 = 0.5F;
/*     */     } else {
/*  94 */       f1 = 0.5F;
/*     */     } 
/*     */     
/*  97 */     f1 /= 32.0F;
/*  98 */     f2 /= 32.0F;
/*  99 */     f3 /= 32.0F;
/*     */     
/* 101 */     float f4 = this.d + 0.5F;
/* 102 */     float f5 = this.e + 0.5F;
/* 103 */     float f6 = this.f + 0.5F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     float f7 = 0.5625F;
/*     */     
/* 111 */     if (paramInt == 0) f6 -= f7; 
/* 112 */     if (paramInt == 1) f4 -= f7; 
/* 113 */     if (paramInt == 2) f6 += f7; 
/* 114 */     if (paramInt == 3) f4 += f7;
/*     */     
/* 116 */     if (paramInt == 0) f4 -= c(this.b.u); 
/* 117 */     if (paramInt == 1) f6 += c(this.b.u); 
/* 118 */     if (paramInt == 2) f4 += c(this.b.u); 
/* 119 */     if (paramInt == 3) f6 -= c(this.b.u); 
/* 120 */     f5 += c(this.b.v);
/*     */     
/* 122 */     a(f4, f5, f6);
/*     */     
/* 124 */     float f8 = -0.00625F;
/* 125 */     this.ar.c((f4 - f1 - f8), (f5 - f2 - f8), (f6 - f3 - f8), (f4 + f1 + f8), (f5 + f2 + f8), (f6 + f3 + f8));
/*     */   }
/*     */   
/*     */   private float c(int paramInt) {
/* 129 */     if (paramInt == 32) return 0.5F; 
/* 130 */     if (paramInt == 64) return 0.5F; 
/* 131 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void e_() {
/* 135 */     if (this.c++ == 100 && !i()) {
/* 136 */       this.c = 0;
/* 137 */       D();
/* 138 */       this.ad.a(new dr(this.ad, this.ah, this.ai, this.aj, new eo(dd.aq)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 143 */     if (this.ad.a(this, this.ar).size() > 0) {
/* 144 */       return false;
/*     */     }
/* 146 */     int i = this.b.u / 16;
/* 147 */     int j = this.b.v / 16;
/*     */     
/* 149 */     int k = this.d;
/* 150 */     int m = this.e;
/* 151 */     int n = this.f;
/* 152 */     if (this.a == 0) k = ei.b(this.ah - (this.b.u / 32.0F)); 
/* 153 */     if (this.a == 1) n = ei.b(this.aj - (this.b.u / 32.0F)); 
/* 154 */     if (this.a == 2) k = ei.b(this.ah - (this.b.u / 32.0F)); 
/* 155 */     if (this.a == 3) n = ei.b(this.aj - (this.b.u / 32.0F)); 
/* 156 */     m = ei.b(this.ai - (this.b.v / 32.0F));
/*     */ 
/*     */     
/* 159 */     for (byte b1 = 0; b1 < i; b1++) {
/* 160 */       for (byte b = 0; b < j; b++) {
/*     */         fs fs;
/* 162 */         if (this.a == 0 || this.a == 2) {
/* 163 */           fs = this.ad.f(k + b1, m + b, this.f);
/*     */         } else {
/* 165 */           fs = this.ad.f(this.d, m + b, n + b1);
/*     */         } 
/* 167 */         if (!fs.a()) return false; 
/*     */       } 
/* 169 */     }  List list = this.ad.b(this, this.ar);
/* 170 */     for (byte b2 = 0; b2 < list.size(); b2++) {
/* 171 */       if (list.get(b2) instanceof it) return false;
/*     */     
/*     */     } 
/* 174 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c_() {
/* 178 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(jx paramjx, int paramInt) {
/* 182 */     D();
/* 183 */     this.ad.a(new dr(this.ad, this.ah, this.ai, this.aj, new eo(dd.aq)));
/* 184 */     return true;
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/* 188 */     paramhc.a("Dir", (byte)this.a);
/* 189 */     paramhc.a("Motive", this.b.t);
/* 190 */     paramhc.a("TileX", this.d);
/* 191 */     paramhc.a("TileY", this.e);
/* 192 */     paramhc.a("TileZ", this.f);
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/* 196 */     this.a = paramhc.c("Dir");
/* 197 */     this.d = paramhc.e("TileX");
/* 198 */     this.e = paramhc.e("TileY");
/* 199 */     this.f = paramhc.e("TileZ");
/* 200 */     String str = paramhc.i("Motive");
/* 201 */     for (el el1 : el.values()) {
/* 202 */       if (el1.t.equals(str)) {
/* 203 */         this.b = el1;
/*     */       }
/*     */     } 
/* 206 */     if (this.b == null) this.b = el.a; 
/* 207 */     b(this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\it.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */