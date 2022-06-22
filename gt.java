/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gt
/*     */   extends me
/*     */ {
/*     */   protected gt(int paramInt1, int paramInt2) {
/*  11 */     super(paramInt1, paramInt2);
/*  12 */     this.aZ = paramInt2;
/*     */     
/*  14 */     b(true);
/*  15 */     float f = 0.5F;
/*  16 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*     */   }
/*     */   
/*     */   protected boolean b(int paramInt) {
/*  20 */     return (paramInt == ln.aA.ba);
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  24 */     super.a(paramcj, paramInt1, paramInt2, paramInt3, paramRandom);
/*  25 */     if (paramcj.j(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/*     */       
/*  27 */       int i = paramcj.e(paramInt1, paramInt2, paramInt3);
/*  28 */       if (i < 7) {
/*  29 */         float f = i(paramcj, paramInt1, paramInt2, paramInt3);
/*     */         
/*  31 */         if (paramRandom.nextInt((int)(100.0F / f)) == 0) {
/*  32 */           i++;
/*  33 */           paramcj.b(paramInt1, paramInt2, paramInt3, i);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private float i(cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     float f = 1.0F;
/*     */     
/*  42 */     int i = paramcj.a(paramInt1, paramInt2, paramInt3 - 1);
/*  43 */     int j = paramcj.a(paramInt1, paramInt2, paramInt3 + 1);
/*  44 */     int k = paramcj.a(paramInt1 - 1, paramInt2, paramInt3);
/*  45 */     int m = paramcj.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  47 */     int n = paramcj.a(paramInt1 - 1, paramInt2, paramInt3 - 1);
/*  48 */     int i1 = paramcj.a(paramInt1 + 1, paramInt2, paramInt3 - 1);
/*  49 */     int i2 = paramcj.a(paramInt1 + 1, paramInt2, paramInt3 + 1);
/*  50 */     int i3 = paramcj.a(paramInt1 - 1, paramInt2, paramInt3 + 1);
/*     */     
/*  52 */     boolean bool1 = (k == this.ba || m == this.ba) ? true : false;
/*  53 */     boolean bool2 = (i == this.ba || j == this.ba) ? true : false;
/*  54 */     boolean bool3 = (n == this.ba || i1 == this.ba || i2 == this.ba || i3 == this.ba) ? true : false;
/*     */     
/*  56 */     for (int i4 = paramInt1 - 1; i4 <= paramInt1 + 1; i4++) {
/*  57 */       for (int i5 = paramInt3 - 1; i5 <= paramInt3 + 1; i5++) {
/*  58 */         int i6 = paramcj.a(i4, paramInt2 - 1, i5);
/*     */         
/*  60 */         float f1 = 0.0F;
/*  61 */         if (i6 == ln.aA.ba) {
/*  62 */           f1 = 1.0F;
/*  63 */           if (paramcj.e(i4, paramInt2 - 1, i5) > 0) f1 = 3.0F;
/*     */         
/*     */         } 
/*  66 */         if (i4 != paramInt1 || i5 != paramInt3) f1 /= 4.0F;
/*     */         
/*  68 */         f += f1;
/*     */       } 
/*     */     } 
/*  71 */     if (bool3 || (bool1 && bool2)) f /= 2.0F;
/*     */     
/*  73 */     return f;
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, int paramInt2) {
/*  77 */     if (paramInt2 < 0) paramInt2 = 7; 
/*  78 */     return this.aZ + paramInt2;
/*     */   }
/*     */   
/*     */   public int f() {
/*  82 */     return 6;
/*     */   }
/*     */   
/*     */   public void b(cj paramcj, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  86 */     super.b(paramcj, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/*  88 */     for (byte b = 0; b < 3; b++) {
/*  89 */       if (paramcj.m.nextInt(15) <= paramInt4) {
/*  90 */         float f1 = 0.7F;
/*  91 */         float f2 = paramcj.m.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  92 */         float f3 = paramcj.m.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  93 */         float f4 = paramcj.m.nextFloat() * f1 + (1.0F - f1) * 0.5F;
/*  94 */         dr dr = new dr(paramcj, (paramInt1 + f2), (paramInt2 + f3), (paramInt3 + f4), new eo(dd.Q));
/*  95 */         dr.c = 10;
/*  96 */         paramcj.a(dr);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public int a(int paramInt, Random paramRandom) {
/* 101 */     System.out.println("Get resource: " + paramInt);
/* 102 */     if (paramInt == 7) {
/* 103 */       return dd.R.aQ;
/*     */     }
/*     */     
/* 106 */     return -1;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom) {
/* 110 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\gt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */