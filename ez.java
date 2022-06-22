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
/*     */ public class ez
/*     */ {
/*     */   private volatile transient int e;
/*  18 */   private final float d = 0.75F;
/*  19 */   private int c = 12;
/*  20 */   private transient mk[] a = new mk[16];
/*     */   private transient int b;
/*     */   
/*     */   private static int e(int paramInt) {
/*  24 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  25 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*     */   }
/*     */   
/*     */   private static int a(int paramInt1, int paramInt2) {
/*  29 */     return paramInt1 & paramInt2 - 1;
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
/*     */   public Object a(int paramInt) {
/*  41 */     int i = e(paramInt);
/*  42 */     for (mk mk1 = this.a[a(i, this.a.length)]; mk1 != null; mk1 = mk1.c) {
/*  43 */       if (mk1.a == paramInt) return mk1.b; 
/*     */     } 
/*  45 */     return null;
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
/*     */   public void a(int paramInt, Object paramObject) {
/*  61 */     int i = e(paramInt);
/*  62 */     int j = a(i, this.a.length);
/*  63 */     for (mk mk1 = this.a[j]; mk1 != null; mk1 = mk1.c) {
/*  64 */       if (mk1.a == paramInt) {
/*  65 */         mk1.b = paramObject;
/*     */       }
/*     */     } 
/*     */     
/*  69 */     this.e++;
/*  70 */     a(i, paramInt, paramObject, j);
/*     */   }
/*     */ 
/*     */   
/*     */   private void f(int paramInt) {
/*  75 */     mk[] arrayOfMk1 = this.a;
/*  76 */     int i = arrayOfMk1.length;
/*  77 */     if (i == 1073741824) {
/*  78 */       this.c = Integer.MAX_VALUE;
/*     */       
/*     */       return;
/*     */     } 
/*  82 */     mk[] arrayOfMk2 = new mk[paramInt];
/*  83 */     a(arrayOfMk2);
/*  84 */     this.a = arrayOfMk2;
/*  85 */     this.c = (int)(paramInt * this.d);
/*     */   }
/*     */   
/*     */   private void a(mk[] paramArrayOfmk) {
/*  89 */     mk[] arrayOfMk = this.a;
/*  90 */     int i = paramArrayOfmk.length;
/*  91 */     for (byte b = 0; b < arrayOfMk.length; b++) {
/*  92 */       mk mk1 = arrayOfMk[b];
/*  93 */       if (mk1 != null) {
/*  94 */         arrayOfMk[b] = null;
/*     */         do {
/*  96 */           mk mk2 = mk1.c;
/*  97 */           int j = a(mk1.d, i);
/*  98 */           mk1.c = paramArrayOfmk[j];
/*  99 */           paramArrayOfmk[j] = mk1;
/* 100 */           mk1 = mk2;
/* 101 */         } while (mk1 != null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object b(int paramInt) {
/* 107 */     mk mk1 = c(paramInt);
/* 108 */     return (mk1 == null) ? null : mk1.b;
/*     */   }
/*     */   
/*     */   final mk c(int paramInt) {
/* 112 */     int i = e(paramInt);
/* 113 */     int j = a(i, this.a.length);
/* 114 */     mk mk1 = this.a[j];
/* 115 */     mk mk2 = mk1;
/*     */     
/* 117 */     while (mk2 != null) {
/* 118 */       mk mk3 = mk2.c;
/* 119 */       if (mk2.a == paramInt) {
/* 120 */         this.e++;
/* 121 */         this.b--;
/* 122 */         if (mk1 == mk2) { this.a[j] = mk3; }
/* 123 */         else { mk1.c = mk3; }
/* 124 */          return mk2;
/*     */       } 
/* 126 */       mk1 = mk2;
/* 127 */       mk2 = mk3;
/*     */     } 
/*     */     
/* 130 */     return mk2;
/*     */   }
/*     */   
/*     */   public void a() {
/* 134 */     this.e++;
/* 135 */     mk[] arrayOfMk = this.a;
/* 136 */     for (byte b = 0; b < arrayOfMk.length; b++)
/* 137 */       arrayOfMk[b] = null; 
/* 138 */     this.b = 0;
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
/*     */   private void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3) {
/* 215 */     mk mk1 = this.a[paramInt3];
/* 216 */     this.a[paramInt3] = new mk(paramInt1, paramInt2, paramObject, mk1);
/* 217 */     if (this.b++ >= this.c) f(2 * this.a.length); 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ez.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */