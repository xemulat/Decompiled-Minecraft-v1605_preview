/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bj
/*     */ {
/*     */   public cj a;
/*  20 */   private int C = -1;
/*     */   
/*  22 */   private static he D = he.a; public int c; public int d; public int e; public int f; public int g; public int h;
/*     */   public int i;
/*  24 */   public static int b = 0;
/*     */   
/*     */   public int j;
/*     */   public int k;
/*     */   public int l;
/*     */   public int m;
/*     */   public int n;
/*     */   public boolean o = false;
/*  32 */   public boolean[] p = new boolean[2]; public int q;
/*     */   public int r;
/*     */   public int s;
/*     */   public float t;
/*     */   public boolean u;
/*     */   public cb v;
/*     */   public int w;
/*     */   public boolean x = true;
/*     */   public boolean y;
/*     */   public int z;
/*     */   public boolean A;
/*     */   private boolean E = false;
/*  44 */   public List B = new ArrayList();
/*     */   
/*     */   private List F;
/*     */   
/*     */   public bj(cj paramcj, List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  49 */     this.a = paramcj;
/*  50 */     this.F = paramList;
/*     */     
/*  52 */     this.f = this.g = this.h = paramInt4;
/*  53 */     this.t = ei.c((this.f * this.f + this.g * this.g + this.h * this.h)) / 2.0F;
/*  54 */     this.C = paramInt5;
/*     */     
/*  56 */     this.c = -999;
/*  57 */     a(paramInt1, paramInt2, paramInt3);
/*     */     
/*  59 */     this.u = false;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  63 */     if (paramInt1 == this.c && paramInt2 == this.d && paramInt3 == this.e)
/*     */       return; 
/*  65 */     b();
/*  66 */     this.c = paramInt1;
/*  67 */     this.d = paramInt2;
/*  68 */     this.e = paramInt3;
/*  69 */     this.q = paramInt1 + this.f / 2;
/*  70 */     this.r = paramInt2 + this.g / 2;
/*  71 */     this.s = paramInt3 + this.h / 2;
/*     */     
/*  73 */     this.l = paramInt1 & 0x3FF;
/*  74 */     this.m = paramInt2;
/*  75 */     this.n = paramInt3 & 0x3FF;
/*  76 */     this.i = paramInt1 - this.l;
/*  77 */     this.j = paramInt2 - this.m;
/*  78 */     this.k = paramInt3 - this.n;
/*     */     
/*  80 */     float f = 2.0F;
/*  81 */     this.v = cb.a((paramInt1 - f), (paramInt2 - f), (paramInt3 - f), ((paramInt1 + this.f) + f), ((paramInt2 + this.g) + f), ((paramInt3 + this.h) + f));
/*     */     
/*  83 */     GL11.glNewList(this.C + 2, 4864);
/*  84 */     z.a(cb.b((this.l - f), (this.m - f), (this.n - f), ((this.l + this.f) + f), ((this.m + this.g) + f), ((this.n + this.h) + f)));
/*  85 */     GL11.glEndList();
/*  86 */     f();
/*     */   }
/*     */   
/*     */   private void g() {
/*  90 */     GL11.glTranslatef(this.l, this.m, this.n);
/*     */   }
/*     */   
/*     */   public void a() {
/*  94 */     if (!this.u)
/*  95 */       return;  b++;
/*     */     
/*  97 */     int i = this.c;
/*  98 */     int j = this.d;
/*  99 */     int k = this.e;
/* 100 */     int m = this.c + this.f;
/* 101 */     int n = this.d + this.g;
/* 102 */     int i1 = this.e + this.h;
/* 103 */     for (byte b1 = 0; b1 < 2; b1++) {
/* 104 */       this.p[b1] = true;
/*     */     }
/*     */     
/* 107 */     fr.a = false;
/*     */     
/* 109 */     HashSet<?> hashSet = new HashSet();
/* 110 */     hashSet.addAll(this.B);
/* 111 */     this.B.clear();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     byte b2 = 1;
/* 117 */     ce ce = new ce(this.a, i - b2, j - b2, k - b2, m + b2, n + b2, i1 + b2);
/* 118 */     ay ay = new ay(ce);
/*     */     
/* 120 */     for (byte b3 = 0; b3 < 2; b3++) {
/* 121 */       boolean bool1 = false;
/* 122 */       boolean bool = false;
/*     */       
/* 124 */       boolean bool2 = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 131 */       for (int i2 = j; i2 < n; i2++) {
/* 132 */         for (int i3 = k; i3 < i1; i3++) {
/* 133 */           for (int i4 = i; i4 < m; i4++) {
/* 134 */             int i5 = ce.a(i4, i2, i3);
/* 135 */             if (i5 > 0) {
/* 136 */               if (!bool2) {
/* 137 */                 bool2 = true;
/*     */                 
/* 139 */                 GL11.glNewList(this.C + b3, 4864);
/* 140 */                 GL11.glPushMatrix();
/* 141 */                 g();
/* 142 */                 float f = 1.000001F;
/* 143 */                 GL11.glTranslatef(-this.h / 2.0F, -this.g / 2.0F, -this.h / 2.0F);
/* 144 */                 GL11.glScalef(f, f, f);
/* 145 */                 GL11.glTranslatef(this.h / 2.0F, this.g / 2.0F, this.h / 2.0F);
/* 146 */                 D.b();
/* 147 */                 D.b(-this.c, -this.d, -this.e);
/*     */               } 
/*     */               
/* 150 */               if (b3 == 0 && ln.n[i5] instanceof jk) {
/* 151 */                 ht ht = ce.b(i4, i2, i3);
/* 152 */                 if (fq.a.a(ht)) {
/* 153 */                   this.B.add(ht);
/*     */                 }
/*     */               } 
/* 156 */               ln ln = ln.n[i5];
/* 157 */               int i6 = ln.g();
/* 158 */               if (i6 != b3) {
/* 159 */                 bool1 = true;
/* 160 */               } else if (i6 == b3) {
/* 161 */                 bool |= ay.a(ln, i4, i2, i3);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 167 */       if (bool2) {
/* 168 */         D.a();
/* 169 */         GL11.glPopMatrix();
/* 170 */         GL11.glEndList();
/* 171 */         D.b(0.0D, 0.0D, 0.0D);
/*     */       } else {
/* 173 */         bool = false;
/*     */       } 
/* 175 */       if (bool) this.p[b3] = false; 
/* 176 */       if (!bool1) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 182 */     HashSet hashSet1 = new HashSet();
/* 183 */     hashSet1.addAll(this.B);
/* 184 */     hashSet1.removeAll(hashSet);
/* 185 */     this.F.addAll(hashSet1);
/*     */     
/* 187 */     hashSet.removeAll(this.B);
/* 188 */     this.F.removeAll(hashSet);
/*     */     
/* 190 */     this.A = fr.a;
/* 191 */     this.E = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(jx paramjx) {
/* 196 */     float f1 = (float)(paramjx.ah - this.q);
/* 197 */     float f2 = (float)(paramjx.ai - this.r);
/* 198 */     float f3 = (float)(paramjx.aj - this.s);
/* 199 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 210 */     for (byte b = 0; b < 2; b++) {
/* 211 */       this.p[b] = true;
/*     */     }
/* 213 */     this.o = false;
/* 214 */     this.E = false;
/*     */   }
/*     */   
/*     */   public void c() {
/* 218 */     b();
/* 219 */     this.a = null;
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 223 */     if (!this.o) return -1; 
/* 224 */     if (!this.p[paramInt]) return this.C + paramInt; 
/* 225 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(nq paramnq) {
/* 235 */     this.o = paramnq.a(this.v);
/*     */   }
/*     */   
/*     */   public void d() {
/* 239 */     GL11.glCallList(this.C + 2);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 243 */     if (!this.E) return false; 
/* 244 */     return (this.p[0] && this.p[1]);
/*     */   }
/*     */   
/*     */   public void f() {
/* 248 */     this.u = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */