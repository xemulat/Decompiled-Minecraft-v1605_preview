/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ah
/*     */ {
/*   8 */   private static List d = new ArrayList();
/*   9 */   private static int e = 0; public double a;
/*     */   
/*     */   public static ah a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  12 */     return new ah(paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   public double b; public double c;
/*     */   public static void a() {
/*  16 */     e = 0;
/*     */   }
/*     */   
/*     */   public static ah b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  20 */     if (e >= d.size()) {
/*  21 */       d.add(a(0.0D, 0.0D, 0.0D));
/*     */     }
/*  23 */     return ((ah)d.get(e++)).e(paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private ah(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  29 */     if (paramDouble1 == -0.0D) paramDouble1 = 0.0D; 
/*  30 */     if (paramDouble2 == -0.0D) paramDouble2 = 0.0D; 
/*  31 */     if (paramDouble3 == -0.0D) paramDouble3 = 0.0D; 
/*  32 */     this.a = paramDouble1;
/*  33 */     this.b = paramDouble2;
/*  34 */     this.c = paramDouble3;
/*     */   }
/*     */   
/*     */   private ah e(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  38 */     this.a = paramDouble1;
/*  39 */     this.b = paramDouble2;
/*  40 */     this.c = paramDouble3;
/*  41 */     return this;
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
/*     */   public ah a(ah paramah) {
/*  58 */     return b(paramah.a - this.a, paramah.b - this.b, paramah.c - this.c);
/*     */   }
/*     */   
/*     */   public ah b() {
/*  62 */     double d = ei.a(this.a * this.a + this.b * this.b + this.c * this.c);
/*  63 */     if (d < 1.0E-4D) return b(0.0D, 0.0D, 0.0D); 
/*  64 */     return b(this.a / d, this.b / d, this.c / d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ah b(ah paramah) {
/*  72 */     return b(this.b * paramah.c - this.c * paramah.b, this.c * paramah.a - this.a * paramah.c, this.a * paramah.b - this.b * paramah.a);
/*     */   }
/*     */   
/*     */   public ah c(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  76 */     return b(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3);
/*     */   }
/*     */   
/*     */   public double c(ah paramah) {
/*  80 */     double d1 = paramah.a - this.a;
/*  81 */     double d2 = paramah.b - this.b;
/*  82 */     double d3 = paramah.c - this.c;
/*  83 */     return ei.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double d(ah paramah) {
/*  87 */     double d1 = paramah.a - this.a;
/*  88 */     double d2 = paramah.b - this.b;
/*  89 */     double d3 = paramah.c - this.c;
/*  90 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double d(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  94 */     double d1 = paramDouble1 - this.a;
/*  95 */     double d2 = paramDouble2 - this.b;
/*  96 */     double d3 = paramDouble3 - this.c;
/*  97 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double c() {
/* 105 */     return ei.a(this.a * this.a + this.b * this.b + this.c * this.c);
/*     */   }
/*     */   
/*     */   public ah a(ah paramah, double paramDouble) {
/* 109 */     double d1 = paramah.a - this.a;
/* 110 */     double d2 = paramah.b - this.b;
/* 111 */     double d3 = paramah.c - this.c;
/*     */     
/* 113 */     if (d1 * d1 < 1.0000000116860974E-7D) return null;
/*     */     
/* 115 */     double d4 = (paramDouble - this.a) / d1;
/* 116 */     if (d4 < 0.0D || d4 > 1.0D) return null; 
/* 117 */     return b(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public ah b(ah paramah, double paramDouble) {
/* 121 */     double d1 = paramah.a - this.a;
/* 122 */     double d2 = paramah.b - this.b;
/* 123 */     double d3 = paramah.c - this.c;
/*     */     
/* 125 */     if (d2 * d2 < 1.0000000116860974E-7D) return null;
/*     */     
/* 127 */     double d4 = (paramDouble - this.b) / d2;
/* 128 */     if (d4 < 0.0D || d4 > 1.0D) return null; 
/* 129 */     return b(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public ah c(ah paramah, double paramDouble) {
/* 133 */     double d1 = paramah.a - this.a;
/* 134 */     double d2 = paramah.b - this.b;
/* 135 */     double d3 = paramah.c - this.c;
/*     */     
/* 137 */     if (d3 * d3 < 1.0000000116860974E-7D) return null;
/*     */     
/* 139 */     double d4 = (paramDouble - this.c) / d3;
/* 140 */     if (d4 < 0.0D || d4 > 1.0D) return null; 
/* 141 */     return b(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 145 */     return "(" + this.a + ", " + this.b + ", " + this.c + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float paramFloat) {
/* 153 */     float f1 = ei.b(paramFloat);
/* 154 */     float f2 = ei.a(paramFloat);
/*     */     
/* 156 */     double d1 = this.a;
/* 157 */     double d2 = this.b * f1 + this.c * f2;
/* 158 */     double d3 = this.c * f1 - this.b * f2;
/*     */     
/* 160 */     this.a = d1;
/* 161 */     this.b = d2;
/* 162 */     this.c = d3;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 166 */     float f1 = ei.b(paramFloat);
/* 167 */     float f2 = ei.a(paramFloat);
/*     */     
/* 169 */     double d1 = this.a * f1 + this.c * f2;
/* 170 */     double d2 = this.b;
/* 171 */     double d3 = this.c * f1 - this.a * f2;
/*     */     
/* 173 */     this.a = d1;
/* 174 */     this.b = d2;
/* 175 */     this.c = d3;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */