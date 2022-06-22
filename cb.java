/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class cb
/*     */ {
/*   6 */   private static List g = new ArrayList();
/*   7 */   private static int h = 0; public double a; public double b; public double c;
/*     */   
/*     */   public static cb a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  10 */     return new cb(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*     */   }
/*     */   public double d; public double e; public double f;
/*     */   public static void a() {
/*  14 */     h = 0;
/*     */   }
/*     */   
/*     */   public static cb b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  18 */     if (h >= g.size()) {
/*  19 */       g.add(a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
/*     */     }
/*  21 */     return ((cb)g.get(h++)).c(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private cb(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  29 */     this.a = paramDouble1;
/*  30 */     this.b = paramDouble2;
/*  31 */     this.c = paramDouble3;
/*  32 */     this.d = paramDouble4;
/*  33 */     this.e = paramDouble5;
/*  34 */     this.f = paramDouble6;
/*     */   }
/*     */   
/*     */   public cb c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  38 */     this.a = paramDouble1;
/*  39 */     this.b = paramDouble2;
/*  40 */     this.c = paramDouble3;
/*  41 */     this.d = paramDouble4;
/*  42 */     this.e = paramDouble5;
/*  43 */     this.f = paramDouble6;
/*  44 */     return this;
/*     */   }
/*     */   
/*     */   public cb a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  48 */     double d1 = this.a;
/*  49 */     double d2 = this.b;
/*  50 */     double d3 = this.c;
/*  51 */     double d4 = this.d;
/*  52 */     double d5 = this.e;
/*  53 */     double d6 = this.f;
/*     */     
/*  55 */     if (paramDouble1 < 0.0D) d1 += paramDouble1; 
/*  56 */     if (paramDouble1 > 0.0D) d4 += paramDouble1;
/*     */     
/*  58 */     if (paramDouble2 < 0.0D) d2 += paramDouble2; 
/*  59 */     if (paramDouble2 > 0.0D) d5 += paramDouble2;
/*     */     
/*  61 */     if (paramDouble3 < 0.0D) d3 += paramDouble3; 
/*  62 */     if (paramDouble3 > 0.0D) d6 += paramDouble3;
/*     */     
/*  64 */     return b(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public cb b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  68 */     double d1 = this.a - paramDouble1;
/*  69 */     double d2 = this.b - paramDouble2;
/*  70 */     double d3 = this.c - paramDouble3;
/*  71 */     double d4 = this.d + paramDouble1;
/*  72 */     double d5 = this.e + paramDouble2;
/*  73 */     double d6 = this.f + paramDouble3;
/*     */     
/*  75 */     return b(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public cb c(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  79 */     return b(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3, this.d + paramDouble1, this.e + paramDouble2, this.f + paramDouble3);
/*     */   }
/*     */   
/*     */   public double a(cb paramcb, double paramDouble) {
/*  83 */     if (paramcb.e <= this.b || paramcb.b >= this.e) return paramDouble; 
/*  84 */     if (paramcb.f <= this.c || paramcb.c >= this.f) return paramDouble;
/*     */     
/*  86 */     if (paramDouble > 0.0D && paramcb.d <= this.a) {
/*  87 */       double d = this.a - paramcb.d;
/*  88 */       if (d < paramDouble) paramDouble = d; 
/*     */     } 
/*  90 */     if (paramDouble < 0.0D && paramcb.a >= this.d) {
/*  91 */       double d = this.d - paramcb.a;
/*  92 */       if (d > paramDouble) paramDouble = d;
/*     */     
/*     */     } 
/*  95 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public double b(cb paramcb, double paramDouble) {
/*  99 */     if (paramcb.d <= this.a || paramcb.a >= this.d) return paramDouble; 
/* 100 */     if (paramcb.f <= this.c || paramcb.c >= this.f) return paramDouble;
/*     */     
/* 102 */     if (paramDouble > 0.0D && paramcb.e <= this.b) {
/* 103 */       double d = this.b - paramcb.e;
/* 104 */       if (d < paramDouble) paramDouble = d; 
/*     */     } 
/* 106 */     if (paramDouble < 0.0D && paramcb.b >= this.e) {
/* 107 */       double d = this.e - paramcb.b;
/* 108 */       if (d > paramDouble) paramDouble = d;
/*     */     
/*     */     } 
/* 111 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public double c(cb paramcb, double paramDouble) {
/* 115 */     if (paramcb.d <= this.a || paramcb.a >= this.d) return paramDouble; 
/* 116 */     if (paramcb.e <= this.b || paramcb.b >= this.e) return paramDouble;
/*     */     
/* 118 */     if (paramDouble > 0.0D && paramcb.f <= this.c) {
/* 119 */       double d = this.c - paramcb.f;
/* 120 */       if (d < paramDouble) paramDouble = d; 
/*     */     } 
/* 122 */     if (paramDouble < 0.0D && paramcb.c >= this.f) {
/* 123 */       double d = this.f - paramcb.c;
/* 124 */       if (d > paramDouble) paramDouble = d;
/*     */     
/*     */     } 
/* 127 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public boolean a(cb paramcb) {
/* 131 */     if (paramcb.d <= this.a || paramcb.a >= this.d) return false; 
/* 132 */     if (paramcb.e <= this.b || paramcb.b >= this.e) return false; 
/* 133 */     if (paramcb.f <= this.c || paramcb.c >= this.f) return false; 
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cb d(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 145 */     this.a += paramDouble1;
/* 146 */     this.b += paramDouble2;
/* 147 */     this.c += paramDouble3;
/* 148 */     this.d += paramDouble1;
/* 149 */     this.e += paramDouble2;
/* 150 */     this.f += paramDouble3;
/* 151 */     return this;
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
/*     */   public double b() {
/* 169 */     double d1 = this.d - this.a;
/* 170 */     double d2 = this.e - this.b;
/* 171 */     double d3 = this.f - this.c;
/* 172 */     return (d1 + d2 + d3) / 3.0D;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cb c() {
/* 196 */     return b(this.a, this.b, this.c, this.d, this.e, this.f);
/*     */   }
/*     */   
/*     */   public lv a(ah paramah1, ah paramah2) {
/* 200 */     ah ah1 = paramah1.a(paramah2, this.a);
/* 201 */     ah ah2 = paramah1.a(paramah2, this.d);
/*     */     
/* 203 */     ah ah3 = paramah1.b(paramah2, this.b);
/* 204 */     ah ah4 = paramah1.b(paramah2, this.e);
/*     */     
/* 206 */     ah ah5 = paramah1.c(paramah2, this.c);
/* 207 */     ah ah6 = paramah1.c(paramah2, this.f);
/*     */     
/* 209 */     if (!a(ah1)) ah1 = null; 
/* 210 */     if (!a(ah2)) ah2 = null; 
/* 211 */     if (!b(ah3)) ah3 = null; 
/* 212 */     if (!b(ah4)) ah4 = null; 
/* 213 */     if (!c(ah5)) ah5 = null; 
/* 214 */     if (!c(ah6)) ah6 = null;
/*     */     
/* 216 */     ah ah7 = null;
/*     */     
/* 218 */     if (ah1 != null && (ah7 == null || paramah1.d(ah1) < paramah1.d(ah7))) ah7 = ah1; 
/* 219 */     if (ah2 != null && (ah7 == null || paramah1.d(ah2) < paramah1.d(ah7))) ah7 = ah2; 
/* 220 */     if (ah3 != null && (ah7 == null || paramah1.d(ah3) < paramah1.d(ah7))) ah7 = ah3; 
/* 221 */     if (ah4 != null && (ah7 == null || paramah1.d(ah4) < paramah1.d(ah7))) ah7 = ah4; 
/* 222 */     if (ah5 != null && (ah7 == null || paramah1.d(ah5) < paramah1.d(ah7))) ah7 = ah5; 
/* 223 */     if (ah6 != null && (ah7 == null || paramah1.d(ah6) < paramah1.d(ah7))) ah7 = ah6;
/*     */     
/* 225 */     if (ah7 == null) return null;
/*     */     
/* 227 */     byte b = -1;
/*     */     
/* 229 */     if (ah7 == ah1) b = 4; 
/* 230 */     if (ah7 == ah2) b = 5; 
/* 231 */     if (ah7 == ah3) b = 0; 
/* 232 */     if (ah7 == ah4) b = 1; 
/* 233 */     if (ah7 == ah5) b = 2; 
/* 234 */     if (ah7 == ah6) b = 3;
/*     */     
/* 236 */     return new lv(0, 0, 0, b, ah7);
/*     */   }
/*     */   
/*     */   private boolean a(ah paramah) {
/* 240 */     if (paramah == null) return false; 
/* 241 */     return (paramah.b >= this.b && paramah.b <= this.e && paramah.c >= this.c && paramah.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean b(ah paramah) {
/* 245 */     if (paramah == null) return false; 
/* 246 */     return (paramah.a >= this.a && paramah.a <= this.d && paramah.c >= this.c && paramah.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean c(ah paramah) {
/* 250 */     if (paramah == null) return false; 
/* 251 */     return (paramah.a >= this.a && paramah.a <= this.d && paramah.b >= this.b && paramah.b <= this.e);
/*     */   }
/*     */   
/*     */   public void b(cb paramcb) {
/* 255 */     this.a = paramcb.a;
/* 256 */     this.b = paramcb.b;
/* 257 */     this.c = paramcb.c;
/* 258 */     this.d = paramcb.d;
/* 259 */     this.e = paramcb.e;
/* 260 */     this.f = paramcb.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */