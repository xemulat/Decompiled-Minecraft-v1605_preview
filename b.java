/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   extends jk
/*     */ {
/*  14 */   private Random a = new Random();
/*     */   
/*     */   protected b(int paramInt) {
/*  17 */     super(paramInt, fs.c);
/*  18 */     this.aZ = 26;
/*     */   }
/*     */   
/*     */   public int a(mz parammz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  22 */     if (paramInt4 == 1) return this.aZ - 1; 
/*  23 */     if (paramInt4 == 0) return this.aZ - 1;
/*     */     
/*  25 */     int i = parammz.a(paramInt1, paramInt2, paramInt3 - 1);
/*  26 */     int j = parammz.a(paramInt1, paramInt2, paramInt3 + 1);
/*  27 */     int k = parammz.a(paramInt1 - 1, paramInt2, paramInt3);
/*  28 */     int m = parammz.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */ 
/*     */     
/*  31 */     if (i == this.ba || j == this.ba) {
/*  32 */       if (paramInt4 == 2 || paramInt4 == 3) return this.aZ; 
/*  33 */       int n = 0;
/*  34 */       if (i == this.ba) {
/*  35 */         n = -1;
/*     */       }
/*     */       
/*  38 */       int i1 = parammz.a(paramInt1 - 1, paramInt2, (i == this.ba) ? (paramInt3 - 1) : (paramInt3 + 1));
/*  39 */       int i2 = parammz.a(paramInt1 + 1, paramInt2, (i == this.ba) ? (paramInt3 - 1) : (paramInt3 + 1));
/*     */       
/*  41 */       if (paramInt4 == 4) n = -1 - n;
/*     */       
/*  43 */       byte b2 = 5;
/*  44 */       if ((ln.p[k] || ln.p[i1]) && !ln.p[m] && !ln.p[i2]) b2 = 5; 
/*  45 */       if ((ln.p[m] || ln.p[i2]) && !ln.p[k] && !ln.p[i1]) b2 = 4; 
/*  46 */       return ((paramInt4 == b2) ? (this.aZ + 16) : (this.aZ + 32)) + n;
/*  47 */     }  if (k == this.ba || m == this.ba) {
/*  48 */       if (paramInt4 == 4 || paramInt4 == 5) return this.aZ; 
/*  49 */       int n = 0;
/*  50 */       if (k == this.ba) {
/*  51 */         n = -1;
/*     */       }
/*     */       
/*  54 */       int i1 = parammz.a((k == this.ba) ? (paramInt1 - 1) : (paramInt1 + 1), paramInt2, paramInt3 - 1);
/*  55 */       int i2 = parammz.a((k == this.ba) ? (paramInt1 - 1) : (paramInt1 + 1), paramInt2, paramInt3 + 1);
/*     */       
/*  57 */       if (paramInt4 == 3) n = -1 - n; 
/*  58 */       byte b2 = 3;
/*  59 */       if ((ln.p[i] || ln.p[i1]) && !ln.p[j] && !ln.p[i2]) b2 = 3; 
/*  60 */       if ((ln.p[j] || ln.p[i2]) && !ln.p[i] && !ln.p[i1]) b2 = 2;
/*     */       
/*  62 */       return ((paramInt4 == b2) ? (this.aZ + 16) : (this.aZ + 32)) + n;
/*     */     } 
/*  64 */     byte b1 = 3;
/*  65 */     if (ln.p[i] && !ln.p[j]) b1 = 3; 
/*  66 */     if (ln.p[j] && !ln.p[i]) b1 = 2; 
/*  67 */     if (ln.p[k] && !ln.p[m]) b1 = 5; 
/*  68 */     if (ln.p[m] && !ln.p[k]) b1 = 4; 
/*  69 */     return (paramInt4 == b1) ? (this.aZ + 1) : this.aZ;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int paramInt) {
/*  74 */     if (paramInt == 1) return this.aZ - 1; 
/*  75 */     if (paramInt == 0) return this.aZ - 1; 
/*  76 */     if (paramInt == 3) return this.aZ + 1; 
/*  77 */     return this.aZ;
/*     */   }
/*     */   
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  81 */     byte b1 = 0;
/*     */     
/*  83 */     if (paramcj.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba) b1++; 
/*  84 */     if (paramcj.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba) b1++; 
/*  85 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba) b1++; 
/*  86 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba) b1++;
/*     */     
/*  88 */     if (b1 > 1) return false;
/*     */     
/*  90 */     if (h(paramcj, paramInt1 - 1, paramInt2, paramInt3)) return false; 
/*  91 */     if (h(paramcj, paramInt1 + 1, paramInt2, paramInt3)) return false; 
/*  92 */     if (h(paramcj, paramInt1, paramInt2, paramInt3 - 1)) return false; 
/*  93 */     if (h(paramcj, paramInt1, paramInt2, paramInt3 + 1)) return false; 
/*  94 */     return true;
/*     */   }
/*     */   
/*     */   private boolean h(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  98 */     if (paramcj.a(paramInt1, paramInt2, paramInt3) != this.ba) return false; 
/*  99 */     if (paramcj.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba) return true; 
/* 100 */     if (paramcj.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba) return true; 
/* 101 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba) return true; 
/* 102 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba) return true; 
/* 103 */     return false;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 107 */     ew ew = (ew)paramcj.b(paramInt1, paramInt2, paramInt3);
/* 108 */     for (byte b1 = 0; b1 < ew.a(); b1++) {
/* 109 */       eo eo = ew.a_(b1);
/* 110 */       if (eo != null) {
/* 111 */         float f1 = this.a.nextFloat() * 0.8F + 0.1F;
/* 112 */         float f2 = this.a.nextFloat() * 0.8F + 0.1F;
/* 113 */         float f3 = this.a.nextFloat() * 0.8F + 0.1F;
/*     */         
/* 115 */         while (eo.a > 0) {
/* 116 */           int i = this.a.nextInt(21) + 10;
/* 117 */           if (i > eo.a) i = eo.a; 
/* 118 */           eo.a -= i;
/*     */           
/* 120 */           dr dr = new dr(paramcj, (paramInt1 + f1), (paramInt2 + f2), (paramInt3 + f3), new eo(eo.c, i, eo.d));
/* 121 */           float f = 0.05F;
/* 122 */           dr.ak = ((float)this.a.nextGaussian() * f);
/* 123 */           dr.al = ((float)this.a.nextGaussian() * f + 0.2F);
/* 124 */           dr.am = ((float)this.a.nextGaussian() * f);
/* 125 */           paramcj.a(dr);
/*     */         } 
/*     */       } 
/*     */     } 
/* 129 */     super.b(paramcj, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   public boolean a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, dg paramdg) {
/*     */     hi hi;
/* 133 */     ew ew = (ew)paramcj.b(paramInt1, paramInt2, paramInt3);
/*     */     
/* 135 */     if (paramcj.g(paramInt1, paramInt2 + 1, paramInt3)) return true;
/*     */     
/* 137 */     if (paramcj.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba && paramcj.g(paramInt1 - 1, paramInt2 + 1, paramInt3)) return true; 
/* 138 */     if (paramcj.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba && paramcj.g(paramInt1 + 1, paramInt2 + 1, paramInt3)) return true; 
/* 139 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba && paramcj.g(paramInt1, paramInt2 + 1, paramInt3 - 1)) return true; 
/* 140 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba && paramcj.g(paramInt1, paramInt2 + 1, paramInt3 + 1)) return true;
/*     */     
/* 142 */     if (paramcj.a(paramInt1 - 1, paramInt2, paramInt3) == this.ba) hi = new hi("Large chest", (ew)paramcj.b(paramInt1 - 1, paramInt2, paramInt3), ew); 
/* 143 */     if (paramcj.a(paramInt1 + 1, paramInt2, paramInt3) == this.ba) hi = new hi("Large chest", hi, (ew)paramcj.b(paramInt1 + 1, paramInt2, paramInt3)); 
/* 144 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 - 1) == this.ba) hi = new hi("Large chest", (ew)paramcj.b(paramInt1, paramInt2, paramInt3 - 1), hi); 
/* 145 */     if (paramcj.a(paramInt1, paramInt2, paramInt3 + 1) == this.ba) hi = new hi("Large chest", hi, (ew)paramcj.b(paramInt1, paramInt2, paramInt3 + 1));
/*     */     
/* 147 */     paramdg.a(hi);
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   protected ht a_() {
/* 152 */     return new ew();
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */