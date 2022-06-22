/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.opengl.ARBVertexBufferObject;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class he
/*     */ {
/*     */   private static boolean b = true;
/*     */   private static boolean c = false;
/*     */   private ByteBuffer d;
/*     */   private IntBuffer e;
/*     */   private FloatBuffer f;
/*     */   private int[] g;
/*  24 */   private int h = 0;
/*     */   
/*     */   private double i;
/*     */   
/*     */   private double j;
/*     */   private int k;
/*  30 */   private int o = 0; private boolean l = false; private boolean m = false; private boolean n = false;
/*  31 */   private int p = 0; private boolean q = false;
/*     */   private int r;
/*     */   private double s;
/*     */   private double t;
/*     */   private double u;
/*     */   private int v;
/*  37 */   public static final he a = new he(2097152);
/*     */   
/*     */   private boolean w = false;
/*     */   
/*     */   private boolean x = false;
/*     */   
/*     */   private IntBuffer y;
/*  44 */   private int z = 0;
/*  45 */   private int A = 10;
/*     */   private int B;
/*     */   
/*     */   private he(int paramInt) {
/*  49 */     this.B = paramInt;
/*     */     
/*  51 */     this.d = da.b(paramInt * 4);
/*  52 */     this.e = this.d.asIntBuffer();
/*  53 */     this.f = this.d.asFloatBuffer();
/*  54 */     this.g = new int[paramInt];
/*     */     
/*  56 */     this.x = (c && (GLContext.getCapabilities()).GL_ARB_vertex_buffer_object);
/*  57 */     if (this.x) {
/*  58 */       this.y = da.c(this.A);
/*  59 */       ARBVertexBufferObject.glGenBuffersARB(this.y);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/*  68 */     if (!this.w) throw new IllegalStateException("Not tesselating!"); 
/*  69 */     this.w = false;
/*  70 */     if (this.h > 0) {
/*  71 */       this.e.clear();
/*  72 */       this.e.put(this.g, 0, this.o);
/*     */       
/*  74 */       this.d.position(0);
/*  75 */       this.d.limit(this.o * 4);
/*     */       
/*  77 */       if (this.x) {
/*  78 */         this.z = (this.z + 1) % this.A;
/*  79 */         ARBVertexBufferObject.glBindBufferARB(34962, this.y.get(this.z));
/*     */         
/*  81 */         ARBVertexBufferObject.glBufferDataARB(34962, this.d, 35040);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  92 */       if (this.m) {
/*  93 */         if (this.x) {
/*  94 */           GL11.glTexCoordPointer(2, 5126, 32, 12L);
/*     */         } else {
/*  96 */           this.f.position(3);
/*  97 */           GL11.glTexCoordPointer(2, 32, this.f);
/*     */         } 
/*  99 */         GL11.glEnableClientState(32888);
/*     */       } 
/* 101 */       if (this.l) {
/* 102 */         if (this.x) {
/* 103 */           GL11.glColorPointer(4, 5121, 32, 20L);
/*     */         } else {
/* 105 */           this.d.position(20);
/* 106 */           GL11.glColorPointer(4, true, 32, this.d);
/*     */         } 
/* 108 */         GL11.glEnableClientState(32886);
/*     */       } 
/* 110 */       if (this.n) {
/* 111 */         if (this.x) {
/* 112 */           GL11.glNormalPointer(5120, 32, 24L);
/*     */         } else {
/* 114 */           this.d.position(24);
/* 115 */           GL11.glNormalPointer(32, this.d);
/*     */         } 
/* 117 */         GL11.glEnableClientState(32885);
/*     */       } 
/* 119 */       if (this.x) {
/* 120 */         GL11.glVertexPointer(3, 5126, 32, 0L);
/*     */       } else {
/* 122 */         this.f.position(0);
/* 123 */         GL11.glVertexPointer(3, 32, this.f);
/*     */       } 
/* 125 */       GL11.glEnableClientState(32884);
/* 126 */       if (this.r == 7 && b) {
/* 127 */         GL11.glDrawArrays(4, 0, this.h);
/*     */       } else {
/* 129 */         GL11.glDrawArrays(this.r, 0, this.h);
/*     */       } 
/*     */       
/* 132 */       GL11.glDisableClientState(32884);
/* 133 */       if (this.m) GL11.glDisableClientState(32888); 
/* 134 */       if (this.l) GL11.glDisableClientState(32886); 
/* 135 */       if (this.n) GL11.glDisableClientState(32885);
/*     */     
/*     */     } 
/* 138 */     d();
/*     */   }
/*     */   
/*     */   private void d() {
/* 142 */     this.h = 0;
/*     */     
/* 144 */     this.d.clear();
/* 145 */     this.o = 0;
/* 146 */     this.p = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 151 */     a(7);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int paramInt) {
/* 156 */     if (this.w) {
/* 157 */       throw new IllegalStateException("Already tesselating!");
/*     */     }
/* 159 */     this.w = true;
/*     */     
/* 161 */     d();
/* 162 */     this.r = paramInt;
/* 163 */     this.n = false;
/* 164 */     this.l = false;
/* 165 */     this.m = false;
/* 166 */     this.q = false;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2) {
/* 170 */     this.m = true;
/* 171 */     this.i = paramDouble1;
/* 172 */     this.j = paramDouble2;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 176 */     a((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 181 */     a((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F), (int)(paramFloat4 * 255.0F));
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 185 */     a(paramInt1, paramInt2, paramInt3, 255);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 189 */     if (this.q)
/*     */       return; 
/* 191 */     if (paramInt1 > 255) paramInt1 = 255; 
/* 192 */     if (paramInt2 > 255) paramInt2 = 255; 
/* 193 */     if (paramInt3 > 255) paramInt3 = 255; 
/* 194 */     if (paramInt4 > 255) paramInt4 = 255; 
/* 195 */     if (paramInt1 < 0) paramInt1 = 0; 
/* 196 */     if (paramInt2 < 0) paramInt2 = 0; 
/* 197 */     if (paramInt3 < 0) paramInt3 = 0; 
/* 198 */     if (paramInt4 < 0) paramInt4 = 0;
/*     */     
/* 200 */     this.l = true;
/* 201 */     this.k = paramInt4 << 24 | paramInt3 << 16 | paramInt2 << 8 | paramInt1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5) {
/* 209 */     a(paramDouble4, paramDouble5);
/* 210 */     a(paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 214 */     this.p++;
/*     */ 
/*     */     
/* 217 */     if (this.r == 7 && b && this.p % 4 == 0) {
/* 218 */       for (byte b = 0; b < 2; b++) {
/* 219 */         int i = 8 * (3 - b);
/* 220 */         if (this.m) {
/* 221 */           this.g[this.o + 3] = this.g[this.o - i + 3];
/* 222 */           this.g[this.o + 4] = this.g[this.o - i + 4];
/*     */         } 
/* 224 */         if (this.l) {
/* 225 */           this.g[this.o + 5] = this.g[this.o - i + 5];
/*     */         }
/*     */         
/* 228 */         this.g[this.o + 0] = this.g[this.o - i + 0];
/* 229 */         this.g[this.o + 1] = this.g[this.o - i + 1];
/* 230 */         this.g[this.o + 2] = this.g[this.o - i + 2];
/*     */         
/* 232 */         this.h++;
/* 233 */         this.o += 8;
/*     */       } 
/*     */     }
/*     */     
/* 237 */     if (this.m) {
/* 238 */       this.g[this.o + 3] = Float.floatToRawIntBits((float)this.i);
/* 239 */       this.g[this.o + 4] = Float.floatToRawIntBits((float)this.j);
/*     */     } 
/* 241 */     if (this.l) {
/* 242 */       this.g[this.o + 5] = this.k;
/*     */     }
/* 244 */     if (this.n) {
/* 245 */       this.g[this.o + 6] = this.v;
/*     */     }
/*     */ 
/*     */     
/* 249 */     this.g[this.o + 0] = Float.floatToRawIntBits((float)(paramDouble1 + this.s));
/* 250 */     this.g[this.o + 1] = Float.floatToRawIntBits((float)(paramDouble2 + this.t));
/* 251 */     this.g[this.o + 2] = Float.floatToRawIntBits((float)(paramDouble3 + this.u));
/*     */     
/* 253 */     this.o += 8;
/*     */     
/* 255 */     this.h++;
/* 256 */     if (this.h % 4 == 0 && this.o >= this.B - 32) {
/* 257 */       a();
/* 258 */       this.w = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 263 */     int i = paramInt >> 16 & 0xFF;
/* 264 */     int j = paramInt >> 8 & 0xFF;
/* 265 */     int k = paramInt & 0xFF;
/* 266 */     a(i, j, k);
/*     */   }
/*     */   
/*     */   public void c() {
/* 270 */     this.q = true;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 274 */     if (!this.w) System.out.println("But.."); 
/* 275 */     this.n = true;
/* 276 */     byte b1 = (byte)(int)(paramFloat1 * 128.0F);
/* 277 */     byte b2 = (byte)(int)(paramFloat2 * 127.0F);
/* 278 */     byte b3 = (byte)(int)(paramFloat3 * 127.0F);
/*     */     
/* 280 */     this.v = b1 | b2 << 8 | b3 << 16;
/*     */   }
/*     */   
/*     */   public void b(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 284 */     this.s = paramDouble1;
/* 285 */     this.t = paramDouble2;
/* 286 */     this.u = paramDouble3;
/*     */   }
/*     */   
/*     */   public void c(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 290 */     this.s += paramFloat1;
/* 291 */     this.t += paramFloat2;
/* 292 */     this.u += paramFloat3;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\he.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */