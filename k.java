/*     */ import java.nio.FloatBuffer;
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
/*     */ public class k
/*     */   extends bp
/*     */ {
/*  32 */   private static k e = new k();
/*     */ 
/*     */   
/*     */   public static bp a() {
/*  36 */     e.b();
/*  37 */     return e;
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
/*     */   private void a(float[][] paramArrayOffloat, int paramInt) {
/*  51 */     float f = ei.c(paramArrayOffloat[paramInt][0] * paramArrayOffloat[paramInt][0] + paramArrayOffloat[paramInt][1] * paramArrayOffloat[paramInt][1] + paramArrayOffloat[paramInt][2] * paramArrayOffloat[paramInt][2]);
/*     */ 
/*     */ 
/*     */     
/*  55 */     paramArrayOffloat[paramInt][0] = paramArrayOffloat[paramInt][0] / f;
/*  56 */     paramArrayOffloat[paramInt][1] = paramArrayOffloat[paramInt][1] / f;
/*  57 */     paramArrayOffloat[paramInt][2] = paramArrayOffloat[paramInt][2] / f;
/*  58 */     paramArrayOffloat[paramInt][3] = paramArrayOffloat[paramInt][3] / f;
/*     */   }
/*     */   
/*  61 */   private FloatBuffer f = da.d(16);
/*  62 */   private FloatBuffer g = da.d(16);
/*  63 */   private FloatBuffer h = da.d(16);
/*     */ 
/*     */   
/*     */   private void b() {
/*  67 */     this.f.clear();
/*  68 */     this.g.clear();
/*  69 */     this.h.clear();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     GL11.glGetFloat(2983, this.f);
/*     */ 
/*     */ 
/*     */     
/*  78 */     GL11.glGetFloat(2982, this.g);
/*     */     
/*  80 */     this.f.flip().limit(16);
/*  81 */     this.f.get(this.b);
/*  82 */     this.g.flip().limit(16);
/*  83 */     this.g.get(this.c);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     this.d[0] = this.c[0] * this.b[0] + this.c[1] * this.b[4] + this.c[2] * this.b[8] + this.c[3] * this.b[12];
/*  89 */     this.d[1] = this.c[0] * this.b[1] + this.c[1] * this.b[5] + this.c[2] * this.b[9] + this.c[3] * this.b[13];
/*  90 */     this.d[2] = this.c[0] * this.b[2] + this.c[1] * this.b[6] + this.c[2] * this.b[10] + this.c[3] * this.b[14];
/*  91 */     this.d[3] = this.c[0] * this.b[3] + this.c[1] * this.b[7] + this.c[2] * this.b[11] + this.c[3] * this.b[15];
/*     */     
/*  93 */     this.d[4] = this.c[4] * this.b[0] + this.c[5] * this.b[4] + this.c[6] * this.b[8] + this.c[7] * this.b[12];
/*  94 */     this.d[5] = this.c[4] * this.b[1] + this.c[5] * this.b[5] + this.c[6] * this.b[9] + this.c[7] * this.b[13];
/*  95 */     this.d[6] = this.c[4] * this.b[2] + this.c[5] * this.b[6] + this.c[6] * this.b[10] + this.c[7] * this.b[14];
/*  96 */     this.d[7] = this.c[4] * this.b[3] + this.c[5] * this.b[7] + this.c[6] * this.b[11] + this.c[7] * this.b[15];
/*     */     
/*  98 */     this.d[8] = this.c[8] * this.b[0] + this.c[9] * this.b[4] + this.c[10] * this.b[8] + this.c[11] * this.b[12];
/*  99 */     this.d[9] = this.c[8] * this.b[1] + this.c[9] * this.b[5] + this.c[10] * this.b[9] + this.c[11] * this.b[13];
/* 100 */     this.d[10] = this.c[8] * this.b[2] + this.c[9] * this.b[6] + this.c[10] * this.b[10] + this.c[11] * this.b[14];
/* 101 */     this.d[11] = this.c[8] * this.b[3] + this.c[9] * this.b[7] + this.c[10] * this.b[11] + this.c[11] * this.b[15];
/*     */     
/* 103 */     this.d[12] = this.c[12] * this.b[0] + this.c[13] * this.b[4] + this.c[14] * this.b[8] + this.c[15] * this.b[12];
/* 104 */     this.d[13] = this.c[12] * this.b[1] + this.c[13] * this.b[5] + this.c[14] * this.b[9] + this.c[15] * this.b[13];
/* 105 */     this.d[14] = this.c[12] * this.b[2] + this.c[13] * this.b[6] + this.c[14] * this.b[10] + this.c[15] * this.b[14];
/* 106 */     this.d[15] = this.c[12] * this.b[3] + this.c[13] * this.b[7] + this.c[14] * this.b[11] + this.c[15] * this.b[15];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     this.a[0][0] = this.d[3] - this.d[0];
/* 113 */     this.a[0][1] = this.d[7] - this.d[4];
/* 114 */     this.a[0][2] = this.d[11] - this.d[8];
/* 115 */     this.a[0][3] = this.d[15] - this.d[12];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     a(this.a, 0);
/*     */ 
/*     */     
/* 124 */     this.a[1][0] = this.d[3] + this.d[0];
/* 125 */     this.a[1][1] = this.d[7] + this.d[4];
/* 126 */     this.a[1][2] = this.d[11] + this.d[8];
/* 127 */     this.a[1][3] = this.d[15] + this.d[12];
/*     */ 
/*     */     
/* 130 */     a(this.a, 1);
/*     */ 
/*     */     
/* 133 */     this.a[2][0] = this.d[3] + this.d[1];
/* 134 */     this.a[2][1] = this.d[7] + this.d[5];
/* 135 */     this.a[2][2] = this.d[11] + this.d[9];
/* 136 */     this.a[2][3] = this.d[15] + this.d[13];
/*     */ 
/*     */     
/* 139 */     a(this.a, 2);
/*     */ 
/*     */     
/* 142 */     this.a[3][0] = this.d[3] - this.d[1];
/* 143 */     this.a[3][1] = this.d[7] - this.d[5];
/* 144 */     this.a[3][2] = this.d[11] - this.d[9];
/* 145 */     this.a[3][3] = this.d[15] - this.d[13];
/*     */ 
/*     */     
/* 148 */     a(this.a, 3);
/*     */ 
/*     */     
/* 151 */     this.a[4][0] = this.d[3] - this.d[2];
/* 152 */     this.a[4][1] = this.d[7] - this.d[6];
/* 153 */     this.a[4][2] = this.d[11] - this.d[10];
/* 154 */     this.a[4][3] = this.d[15] - this.d[14];
/*     */ 
/*     */     
/* 157 */     a(this.a, 4);
/*     */ 
/*     */     
/* 160 */     this.a[5][0] = this.d[3] + this.d[2];
/* 161 */     this.a[5][1] = this.d[7] + this.d[6];
/* 162 */     this.a[5][2] = this.d[11] + this.d[10];
/* 163 */     this.a[5][3] = this.d[15] + this.d[14];
/*     */ 
/*     */     
/* 166 */     a(this.a, 5);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */