/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
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
/*     */ public class av
/*     */ {
/*     */   private int a;
/*     */   private Class b;
/*     */   private Class[] c;
/*     */   private Set d;
/*     */   
/*     */   public av(int paramInt, Class paramClass, Class[] paramArrayOfClass) {
/*  24 */     this.d = new HashSet();
/*     */     this.a = paramInt;
/*     */     this.b = paramClass;
/*  27 */     this.c = paramArrayOfClass; } public void a(cj paramcj) { int i = paramcj.b(this.b);
/*  28 */     if (i < this.a) {
/*  29 */       for (byte b = 0; b < 3; b++) {
/*  30 */         a(paramcj, 1, (nh)null);
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   protected mh a(cj paramcj, int paramInt1, int paramInt2) {
/*  36 */     int i = paramInt1 + paramcj.m.nextInt(16);
/*  37 */     int j = paramcj.m.nextInt(128);
/*  38 */     int k = paramInt2 + paramcj.m.nextInt(16);
/*     */     
/*  40 */     return new mh(i, j, k);
/*     */   }
/*     */   
/*     */   private int a(cj paramcj, int paramInt, nh paramnh) {
/*  44 */     this.d.clear();
/*     */     byte b;
/*  46 */     for (b = 0; b < paramcj.j.size(); b++) {
/*  47 */       dg dg = paramcj.j.get(b);
/*  48 */       int i = ei.b(dg.ah / 16.0D);
/*  49 */       int j = ei.b(dg.aj / 16.0D);
/*     */       
/*  51 */       byte b1 = 4;
/*  52 */       for (byte b2 = -b1; b2 <= b1; b2++) {
/*  53 */         for (byte b3 = -b1; b3 <= b1; b3++) {
/*  54 */           this.d.add(new nx(b2 + i, b3 + j));
/*     */         }
/*     */       } 
/*     */     } 
/*  58 */     b = 0;
/*  59 */     for (nx nx : this.d) {
/*  60 */       if (paramcj.m.nextInt(10) != 0)
/*  61 */         continue;  int i = paramcj.m.nextInt(this.c.length);
/*     */       
/*  63 */       mh mh = a(paramcj, nx.a * 16, nx.b * 16);
/*  64 */       int j = mh.a;
/*  65 */       int k = mh.b;
/*  66 */       int m = mh.c;
/*     */       
/*  68 */       if (paramcj.g(j, k, m)) return 0; 
/*  69 */       if (paramcj.f(j, k, m) != fs.a) return 0;
/*     */       
/*  71 */       for (byte b1 = 0; b1 < 3; b1++) {
/*  72 */         int n = j;
/*  73 */         int i1 = k;
/*  74 */         int i2 = m;
/*  75 */         byte b2 = 6;
/*  76 */         for (byte b3 = 0; b3 < 2; b3++) {
/*  77 */           n += paramcj.m.nextInt(b2) - paramcj.m.nextInt(b2);
/*  78 */           i1 += paramcj.m.nextInt(1) - paramcj.m.nextInt(1);
/*  79 */           i2 += paramcj.m.nextInt(b2) - paramcj.m.nextInt(b2);
/*     */ 
/*     */           
/*  82 */           if (paramcj.g(n, i1 - 1, i2) && !paramcj.g(n, i1, i2) && !paramcj.f(n, i1, i2).d() && !paramcj.g(n, i1 + 1, i2)) {
/*  83 */             float f1 = n + 0.5F;
/*  84 */             float f2 = i1;
/*  85 */             float f3 = i2 + 0.5F;
/*  86 */             if (paramcj.a(f1, f2, f3, 24.0D) == null) {
/*     */ 
/*     */               
/*  89 */               float f4 = f1 - paramcj.n;
/*  90 */               float f5 = f2 - paramcj.o;
/*  91 */               float f6 = f3 - paramcj.p;
/*  92 */               float f7 = f4 * f4 + f5 * f5 + f6 * f6;
/*  93 */               if (f7 >= 576.0F) {
/*     */                 fv fv;
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 try {
/* 100 */                   fv = this.c[i].getConstructor(new Class[] { cj.class }).newInstance(new Object[] { paramcj });
/* 101 */                 } catch (Exception exception) {
/* 102 */                   exception.printStackTrace();
/* 103 */                   return b;
/*     */                 } 
/*     */                 
/* 106 */                 fv.c(f1, f2, f3, paramcj.m.nextFloat() * 360.0F, 0.0F);
/*     */                 
/* 108 */                 if (fv.a())
/* 109 */                 { b++;
/* 110 */                   paramcj.a(fv); } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 116 */     }  return b;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\av.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */