/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fk
/*     */   implements as
/*     */ {
/*     */   private fr c;
/*     */   private as d;
/*     */   private ad e;
/*  16 */   private fr[] f = new fr[1024];
/*     */ 
/*     */   
/*     */   private cj g;
/*     */   
/*     */   int a;
/*     */   
/*     */   int b;
/*     */   
/*     */   private fr h;
/*     */ 
/*     */   
/*     */   public fk(cj paramcj, ad paramad, as paramas) {
/*  29 */     this.a = -999999999;
/*  30 */     this.b = -999999999; this.c = new fr(paramcj, new byte[32768], 0, 0); this.c.q = true;
/*     */     this.c.p = true;
/*     */     this.g = paramcj;
/*     */     this.e = paramad;
/*  34 */     this.d = paramas; } public boolean a(int paramInt1, int paramInt2) { if (paramInt1 == this.a && paramInt2 == this.b && this.h != null) {
/*  35 */       return true;
/*     */     }
/*  37 */     int i = paramInt1 & 0x1F;
/*  38 */     int j = paramInt2 & 0x1F;
/*  39 */     int k = i + j * 32;
/*  40 */     return (this.f[k] != null && (this.f[k] == this.c || this.f[k].a(paramInt1, paramInt2))); }
/*     */ 
/*     */ 
/*     */   
/*     */   public fr b(int paramInt1, int paramInt2) {
/*  45 */     if (paramInt1 == this.a && paramInt2 == this.b && this.h != null) {
/*  46 */       return this.h;
/*     */     }
/*  48 */     int i = paramInt1 & 0x1F;
/*  49 */     int j = paramInt2 & 0x1F;
/*  50 */     int k = i + j * 32;
/*  51 */     if (!a(paramInt1, paramInt2)) {
/*  52 */       if (this.f[k] != null) {
/*  53 */         this.f[k].e();
/*  54 */         b(this.f[k]);
/*  55 */         a(this.f[k]);
/*     */       } 
/*     */       
/*  58 */       fr fr1 = c(paramInt1, paramInt2);
/*  59 */       if (fr1 == null) {
/*  60 */         if (this.d == null) {
/*  61 */           fr1 = this.c;
/*     */         } else {
/*  63 */           fr1 = this.d.b(paramInt1, paramInt2);
/*     */         } 
/*     */       }
/*     */       
/*  67 */       this.f[k] = fr1;
/*     */       
/*  69 */       if (this.f[k] != null) {
/*  70 */         this.f[k].d();
/*     */       }
/*     */       
/*  73 */       if (!(this.f[k]).n && a(paramInt1 + 1, paramInt2 + 1) && a(paramInt1, paramInt2 + 1) && a(paramInt1 + 1, paramInt2)) a(this, paramInt1, paramInt2); 
/*  74 */       if (a(paramInt1 - 1, paramInt2) && !(b(paramInt1 - 1, paramInt2)).n && a(paramInt1 - 1, paramInt2 + 1) && a(paramInt1, paramInt2 + 1) && a(paramInt1 - 1, paramInt2)) a(this, paramInt1 - 1, paramInt2); 
/*  75 */       if (a(paramInt1, paramInt2 - 1) && !(b(paramInt1, paramInt2 - 1)).n && a(paramInt1 + 1, paramInt2 - 1) && a(paramInt1, paramInt2 - 1) && a(paramInt1 + 1, paramInt2)) a(this, paramInt1, paramInt2 - 1); 
/*  76 */       if (a(paramInt1 - 1, paramInt2 - 1) && !(b(paramInt1 - 1, paramInt2 - 1)).n && a(paramInt1 - 1, paramInt2 - 1) && a(paramInt1, paramInt2 - 1) && a(paramInt1 - 1, paramInt2)) a(this, paramInt1 - 1, paramInt2 - 1);
/*     */     
/*     */     } 
/*     */ 
/*     */     
/*  81 */     this.a = paramInt1;
/*  82 */     this.b = paramInt2;
/*  83 */     this.h = this.f[k];
/*  84 */     return this.f[k];
/*     */   }
/*     */   
/*     */   private fr c(int paramInt1, int paramInt2) {
/*  88 */     if (this.e == null) return null; 
/*     */     try {
/*  90 */       fr fr1 = this.e.a(this.g, paramInt1, paramInt2);
/*  91 */       if (fr1 != null) {
/*  92 */         fr1.s = this.g.c;
/*     */       }
/*  94 */       return fr1;
/*  95 */     } catch (Exception exception) {
/*  96 */       exception.printStackTrace();
/*  97 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(fr paramfr) {
/* 102 */     if (this.e == null)
/*     */       return;  try {
/* 104 */       this.e.b(this.g, paramfr);
/* 105 */     } catch (Exception exception) {
/* 106 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(fr paramfr) {
/* 111 */     if (this.e == null)
/*     */       return;  try {
/* 113 */       paramfr.s = this.g.c;
/* 114 */       this.e.a(this.g, paramfr);
/* 115 */     } catch (IOException iOException) {
/* 116 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(as paramas, int paramInt1, int paramInt2) {
/* 121 */     fr fr1 = b(paramInt1, paramInt2);
/* 122 */     if (!fr1.n) {
/* 123 */       fr1.n = true;
/* 124 */       if (this.d != null) {
/* 125 */         this.d.a(paramas, paramInt1, paramInt2);
/* 126 */         fr1.f();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(boolean paramBoolean, nh paramnh) {
/* 134 */     byte b1 = 0;
/* 135 */     byte b2 = 0;
/* 136 */     if (paramnh != null) {
/* 137 */       for (byte b = 0; b < this.f.length; b++) {
/* 138 */         if (this.f[b] != null && this.f[b].a(paramBoolean)) {
/* 139 */           b2++;
/*     */         }
/*     */       } 
/*     */     }
/* 143 */     byte b3 = 0;
/* 144 */     for (byte b4 = 0; b4 < this.f.length; b4++) {
/* 145 */       if (this.f[b4] != null) {
/* 146 */         if (paramBoolean && !(this.f[b4]).p) a(this.f[b4]); 
/* 147 */         if (this.f[b4].a(paramBoolean)) {
/* 148 */           b(this.f[b4]);
/* 149 */           (this.f[b4]).o = false;
/* 150 */           if (++b1 == 2 && !paramBoolean) return false; 
/* 151 */           if (paramnh != null && 
/* 152 */             ++b3 % 10 == 0) {
/* 153 */             paramnh.a(b3 * 100 / b2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 160 */     if (paramBoolean) {
/* 161 */       if (this.e == null) return true; 
/* 162 */       this.e.b();
/*     */     } 
/* 164 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 168 */     if (this.e != null) this.e.a(); 
/* 169 */     return this.d.a();
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 173 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */