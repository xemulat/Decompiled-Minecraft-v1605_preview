/*      */ import org.lwjgl.opengl.GL11;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ay
/*      */ {
/*      */   private mz a;
/*   12 */   private int b = -1;
/*      */   
/*      */   private boolean c = false;
/*      */   
/*      */   private boolean d = false;
/*      */   
/*      */   public ay(mz parammz) {
/*   19 */     this.a = parammz;
/*      */   }
/*      */ 
/*      */   
/*      */   public ay() {}
/*      */   
/*      */   public void a(ln paramln, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   26 */     this.b = paramInt4;
/*   27 */     a(paramln, paramInt1, paramInt2, paramInt3);
/*   28 */     this.b = -1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*   38 */     int i = paramln.f();
/*   39 */     paramln.a(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/*   41 */     if (i == 0)
/*   42 */       return k(paramln, paramInt1, paramInt2, paramInt3); 
/*   43 */     if (i == 4)
/*   44 */       return j(paramln, paramInt1, paramInt2, paramInt3); 
/*   45 */     if (i == 13)
/*   46 */       return l(paramln, paramInt1, paramInt2, paramInt3); 
/*   47 */     if (i == 1)
/*   48 */       return h(paramln, paramInt1, paramInt2, paramInt3); 
/*   49 */     if (i == 6)
/*   50 */       return i(paramln, paramInt1, paramInt2, paramInt3); 
/*   51 */     if (i == 2)
/*   52 */       return b(paramln, paramInt1, paramInt2, paramInt3); 
/*   53 */     if (i == 3)
/*   54 */       return d(paramln, paramInt1, paramInt2, paramInt3); 
/*   55 */     if (i == 5)
/*   56 */       return e(paramln, paramInt1, paramInt2, paramInt3); 
/*   57 */     if (i == 8)
/*   58 */       return g(paramln, paramInt1, paramInt2, paramInt3); 
/*   59 */     if (i == 7)
/*   60 */       return o(paramln, paramInt1, paramInt2, paramInt3); 
/*   61 */     if (i == 9)
/*   62 */       return f(paramln, paramInt1, paramInt2, paramInt3); 
/*   63 */     if (i == 10)
/*   64 */       return n(paramln, paramInt1, paramInt2, paramInt3); 
/*   65 */     if (i == 11)
/*   66 */       return m(paramln, paramInt1, paramInt2, paramInt3); 
/*   67 */     if (i == 12) {
/*   68 */       return c(paramln, paramInt1, paramInt2, paramInt3);
/*      */     }
/*   70 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*   75 */     int i = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*   77 */     he he = he.a;
/*      */     
/*   79 */     float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*   80 */     if (ln.s[paramln.ba] > 0) f = 1.0F; 
/*   81 */     he.a(f, f, f);
/*      */     
/*   83 */     double d1 = 0.4000000059604645D;
/*   84 */     double d2 = 0.5D - d1;
/*   85 */     double d3 = 0.20000000298023224D;
/*   86 */     if (i == 1) {
/*   87 */       a(paramln, paramInt1 - d2, paramInt2 + d3, paramInt3, -d1, 0.0D);
/*   88 */     } else if (i == 2) {
/*   89 */       a(paramln, paramInt1 + d2, paramInt2 + d3, paramInt3, d1, 0.0D);
/*   90 */     } else if (i == 3) {
/*   91 */       a(paramln, paramInt1, paramInt2 + d3, paramInt3 - d2, 0.0D, -d1);
/*   92 */     } else if (i == 4) {
/*   93 */       a(paramln, paramInt1, paramInt2 + d3, paramInt3 + d2, 0.0D, d1);
/*      */     } else {
/*   95 */       a(paramln, paramInt1, paramInt2, paramInt3, 0.0D, 0.0D);
/*      */     } 
/*   97 */     return true;
/*      */   }
/*      */   
/*      */   public boolean c(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  101 */     int i = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  103 */     int j = i & 0x7;
/*  104 */     boolean bool1 = ((i & 0x8) > 0) ? true : false;
/*      */     
/*  106 */     he he = he.a;
/*      */     
/*  108 */     boolean bool2 = (this.b >= 0) ? true : false;
/*  109 */     if (!bool2) this.b = ln.w.aZ; 
/*  110 */     float f1 = 0.25F;
/*  111 */     float f2 = 0.1875F;
/*  112 */     float f3 = 0.1875F;
/*  113 */     if (j == 5) {
/*  114 */       paramln.a(0.5F - f2, 0.0F, 0.5F - f1, 0.5F + f2, f3, 0.5F + f1);
/*  115 */     } else if (j == 6) {
/*  116 */       paramln.a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, f3, 0.5F + f2);
/*  117 */     } else if (j == 4) {
/*  118 */       paramln.a(0.5F - f2, 0.5F - f1, 1.0F - f3, 0.5F + f2, 0.5F + f1, 1.0F);
/*  119 */     } else if (j == 3) {
/*  120 */       paramln.a(0.5F - f2, 0.5F - f1, 0.0F, 0.5F + f2, 0.5F + f1, f3);
/*  121 */     } else if (j == 2) {
/*  122 */       paramln.a(1.0F - f3, 0.5F - f1, 0.5F - f2, 1.0F, 0.5F + f1, 0.5F + f2);
/*  123 */     } else if (j == 1) {
/*  124 */       paramln.a(0.0F, 0.5F - f1, 0.5F - f2, f3, 0.5F + f1, 0.5F + f2);
/*      */     } 
/*  126 */     k(paramln, paramInt1, paramInt2, paramInt3);
/*  127 */     if (!bool2) this.b = -1;
/*      */     
/*  129 */     float f4 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  130 */     if (ln.s[paramln.ba] > 0) f4 = 1.0F; 
/*  131 */     he.a(f4, f4, f4);
/*  132 */     int k = paramln.a(0);
/*      */     
/*  134 */     if (this.b >= 0) k = this.b; 
/*  135 */     int m = (k & 0xF) << 4;
/*  136 */     int n = k & 0xF0;
/*  137 */     float f5 = m / 256.0F;
/*  138 */     float f6 = (m + 15.99F) / 256.0F;
/*  139 */     float f7 = n / 256.0F;
/*  140 */     float f8 = (n + 15.99F) / 256.0F;
/*      */     
/*  142 */     ah[] arrayOfAh = new ah[8];
/*  143 */     float f9 = 0.0625F;
/*  144 */     float f10 = 0.0625F;
/*  145 */     float f11 = 0.625F;
/*  146 */     arrayOfAh[0] = ah.b(-f9, 0.0D, -f10);
/*  147 */     arrayOfAh[1] = ah.b(f9, 0.0D, -f10);
/*  148 */     arrayOfAh[2] = ah.b(f9, 0.0D, f10);
/*  149 */     arrayOfAh[3] = ah.b(-f9, 0.0D, f10);
/*  150 */     arrayOfAh[4] = ah.b(-f9, f11, -f10);
/*  151 */     arrayOfAh[5] = ah.b(f9, f11, -f10);
/*  152 */     arrayOfAh[6] = ah.b(f9, f11, f10);
/*  153 */     arrayOfAh[7] = ah.b(-f9, f11, f10);
/*      */     
/*  155 */     for (byte b1 = 0; b1 < 8; b1++) {
/*  156 */       if (bool1) {
/*  157 */         (arrayOfAh[b1]).c -= 0.0625D;
/*  158 */         arrayOfAh[b1].a(0.69813174F);
/*      */       } else {
/*  160 */         (arrayOfAh[b1]).c += 0.0625D;
/*  161 */         arrayOfAh[b1].a(-0.69813174F);
/*      */       } 
/*  163 */       if (j == 6) {
/*  164 */         arrayOfAh[b1].b(1.5707964F);
/*      */       }
/*      */       
/*  167 */       if (j < 5) {
/*  168 */         (arrayOfAh[b1]).b -= 0.375D;
/*  169 */         arrayOfAh[b1].a(1.5707964F);
/*      */         
/*  171 */         if (j == 4) arrayOfAh[b1].b(0.0F); 
/*  172 */         if (j == 3) arrayOfAh[b1].b(3.1415927F); 
/*  173 */         if (j == 2) arrayOfAh[b1].b(1.5707964F); 
/*  174 */         if (j == 1) arrayOfAh[b1].b(-1.5707964F);
/*      */         
/*  176 */         (arrayOfAh[b1]).a += paramInt1 + 0.5D;
/*  177 */         (arrayOfAh[b1]).b += (paramInt2 + 0.5F);
/*  178 */         (arrayOfAh[b1]).c += paramInt3 + 0.5D;
/*      */       } else {
/*  180 */         (arrayOfAh[b1]).a += paramInt1 + 0.5D;
/*  181 */         (arrayOfAh[b1]).b += (paramInt2 + 0.125F);
/*  182 */         (arrayOfAh[b1]).c += paramInt3 + 0.5D;
/*      */       } 
/*      */     } 
/*      */     
/*  186 */     ah ah1 = null, ah2 = null, ah3 = null, ah4 = null;
/*  187 */     for (byte b2 = 0; b2 < 6; b2++) {
/*  188 */       if (b2 == 0) {
/*  189 */         f5 = (m + 7) / 256.0F;
/*  190 */         f6 = ((m + 9) - 0.01F) / 256.0F;
/*  191 */         f7 = (n + 6) / 256.0F;
/*  192 */         f8 = ((n + 8) - 0.01F) / 256.0F;
/*  193 */       } else if (b2 == 2) {
/*  194 */         f5 = (m + 7) / 256.0F;
/*  195 */         f6 = ((m + 9) - 0.01F) / 256.0F;
/*  196 */         f7 = (n + 6) / 256.0F;
/*  197 */         f8 = ((n + 16) - 0.01F) / 256.0F;
/*      */       } 
/*  199 */       if (b2 == 0) {
/*  200 */         ah1 = arrayOfAh[0];
/*  201 */         ah2 = arrayOfAh[1];
/*  202 */         ah3 = arrayOfAh[2];
/*  203 */         ah4 = arrayOfAh[3];
/*  204 */       } else if (b2 == 1) {
/*  205 */         ah1 = arrayOfAh[7];
/*  206 */         ah2 = arrayOfAh[6];
/*  207 */         ah3 = arrayOfAh[5];
/*  208 */         ah4 = arrayOfAh[4];
/*  209 */       } else if (b2 == 2) {
/*  210 */         ah1 = arrayOfAh[1];
/*  211 */         ah2 = arrayOfAh[0];
/*  212 */         ah3 = arrayOfAh[4];
/*  213 */         ah4 = arrayOfAh[5];
/*  214 */       } else if (b2 == 3) {
/*  215 */         ah1 = arrayOfAh[2];
/*  216 */         ah2 = arrayOfAh[1];
/*  217 */         ah3 = arrayOfAh[5];
/*  218 */         ah4 = arrayOfAh[6];
/*  219 */       } else if (b2 == 4) {
/*  220 */         ah1 = arrayOfAh[3];
/*  221 */         ah2 = arrayOfAh[2];
/*  222 */         ah3 = arrayOfAh[6];
/*  223 */         ah4 = arrayOfAh[7];
/*  224 */       } else if (b2 == 5) {
/*  225 */         ah1 = arrayOfAh[0];
/*  226 */         ah2 = arrayOfAh[3];
/*  227 */         ah3 = arrayOfAh[7];
/*  228 */         ah4 = arrayOfAh[4];
/*      */       } 
/*  230 */       he.a(ah1.a, ah1.b, ah1.c, f5, f8);
/*  231 */       he.a(ah2.a, ah2.b, ah2.c, f6, f8);
/*  232 */       he.a(ah3.a, ah3.b, ah3.c, f6, f7);
/*  233 */       he.a(ah4.a, ah4.b, ah4.c, f5, f7);
/*      */     } 
/*  235 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  239 */     he he = he.a;
/*      */     
/*  241 */     int i = paramln.a(0);
/*      */     
/*  243 */     if (this.b >= 0) i = this.b;
/*      */     
/*  245 */     float f1 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  246 */     he.a(f1, f1, f1);
/*  247 */     int j = (i & 0xF) << 4;
/*  248 */     int k = i & 0xF0;
/*      */     
/*  250 */     double d1 = (j / 256.0F);
/*  251 */     double d2 = ((j + 15.99F) / 256.0F);
/*  252 */     double d3 = (k / 256.0F);
/*  253 */     double d4 = ((k + 15.99F) / 256.0F);
/*  254 */     float f2 = 1.4F;
/*      */     
/*  256 */     if (this.a.g(paramInt1, paramInt2 - 1, paramInt3) || ln.ar.b(this.a, paramInt1, paramInt2 - 1, paramInt3)) {
/*  257 */       double d5 = paramInt1 + 0.5D + 0.2D;
/*  258 */       double d6 = paramInt1 + 0.5D - 0.2D;
/*  259 */       double d7 = paramInt3 + 0.5D + 0.2D;
/*  260 */       double d8 = paramInt3 + 0.5D - 0.2D;
/*      */       
/*  262 */       double d9 = paramInt1 + 0.5D - 0.3D;
/*  263 */       double d10 = paramInt1 + 0.5D + 0.3D;
/*  264 */       double d11 = paramInt3 + 0.5D - 0.3D;
/*  265 */       double d12 = paramInt3 + 0.5D + 0.3D;
/*      */       
/*  267 */       he.a(d9, (paramInt2 + f2), (paramInt3 + 1), d2, d3);
/*  268 */       he.a(d5, (paramInt2 + 0), (paramInt3 + 1), d2, d4);
/*  269 */       he.a(d5, (paramInt2 + 0), (paramInt3 + 0), d1, d4);
/*  270 */       he.a(d9, (paramInt2 + f2), (paramInt3 + 0), d1, d3);
/*      */       
/*  272 */       he.a(d10, (paramInt2 + f2), (paramInt3 + 0), d2, d3);
/*  273 */       he.a(d6, (paramInt2 + 0), (paramInt3 + 0), d2, d4);
/*  274 */       he.a(d6, (paramInt2 + 0), (paramInt3 + 1), d1, d4);
/*  275 */       he.a(d10, (paramInt2 + f2), (paramInt3 + 1), d1, d3);
/*      */       
/*  277 */       d1 = (j / 256.0F);
/*  278 */       d2 = ((j + 15.99F) / 256.0F);
/*  279 */       d3 = ((k + 16) / 256.0F);
/*  280 */       d4 = ((k + 15.99F + 16.0F) / 256.0F);
/*      */       
/*  282 */       he.a((paramInt1 + 1), (paramInt2 + f2), d12, d2, d3);
/*  283 */       he.a((paramInt1 + 1), (paramInt2 + 0), d8, d2, d4);
/*  284 */       he.a((paramInt1 + 0), (paramInt2 + 0), d8, d1, d4);
/*  285 */       he.a((paramInt1 + 0), (paramInt2 + f2), d12, d1, d3);
/*      */       
/*  287 */       he.a((paramInt1 + 0), (paramInt2 + f2), d11, d2, d3);
/*  288 */       he.a((paramInt1 + 0), (paramInt2 + 0), d7, d2, d4);
/*  289 */       he.a((paramInt1 + 1), (paramInt2 + 0), d7, d1, d4);
/*  290 */       he.a((paramInt1 + 1), (paramInt2 + f2), d11, d1, d3);
/*      */       
/*  292 */       d5 = paramInt1 + 0.5D - 0.5D;
/*  293 */       d6 = paramInt1 + 0.5D + 0.5D;
/*  294 */       d7 = paramInt3 + 0.5D - 0.5D;
/*  295 */       d8 = paramInt3 + 0.5D + 0.5D;
/*      */       
/*  297 */       d9 = paramInt1 + 0.5D - 0.4D;
/*  298 */       d10 = paramInt1 + 0.5D + 0.4D;
/*  299 */       d11 = paramInt3 + 0.5D - 0.4D;
/*  300 */       d12 = paramInt3 + 0.5D + 0.4D;
/*      */       
/*  302 */       he.a(d9, (paramInt2 + f2), (paramInt3 + 0), d1, d3);
/*  303 */       he.a(d5, (paramInt2 + 0), (paramInt3 + 0), d1, d4);
/*  304 */       he.a(d5, (paramInt2 + 0), (paramInt3 + 1), d2, d4);
/*  305 */       he.a(d9, (paramInt2 + f2), (paramInt3 + 1), d2, d3);
/*      */       
/*  307 */       he.a(d10, (paramInt2 + f2), (paramInt3 + 1), d1, d3);
/*  308 */       he.a(d6, (paramInt2 + 0), (paramInt3 + 1), d1, d4);
/*  309 */       he.a(d6, (paramInt2 + 0), (paramInt3 + 0), d2, d4);
/*  310 */       he.a(d10, (paramInt2 + f2), (paramInt3 + 0), d2, d3);
/*      */       
/*  312 */       d1 = (j / 256.0F);
/*  313 */       d2 = ((j + 15.99F) / 256.0F);
/*  314 */       d3 = (k / 256.0F);
/*  315 */       d4 = ((k + 15.99F) / 256.0F);
/*      */       
/*  317 */       he.a((paramInt1 + 0), (paramInt2 + f2), d12, d1, d3);
/*  318 */       he.a((paramInt1 + 0), (paramInt2 + 0), d8, d1, d4);
/*  319 */       he.a((paramInt1 + 1), (paramInt2 + 0), d8, d2, d4);
/*  320 */       he.a((paramInt1 + 1), (paramInt2 + f2), d12, d2, d3);
/*      */       
/*  322 */       he.a((paramInt1 + 1), (paramInt2 + f2), d11, d1, d3);
/*  323 */       he.a((paramInt1 + 1), (paramInt2 + 0), d7, d1, d4);
/*  324 */       he.a((paramInt1 + 0), (paramInt2 + 0), d7, d2, d4);
/*  325 */       he.a((paramInt1 + 0), (paramInt2 + f2), d11, d2, d3);
/*      */     } else {
/*  327 */       float f3 = 0.2F;
/*  328 */       float f4 = 0.0625F;
/*  329 */       if ((paramInt1 + paramInt2 + paramInt3 & 0x1) == 1) {
/*  330 */         d1 = (j / 256.0F);
/*  331 */         d2 = ((j + 15.99F) / 256.0F);
/*  332 */         d3 = ((k + 16) / 256.0F);
/*  333 */         d4 = ((k + 15.99F + 16.0F) / 256.0F);
/*      */       } 
/*  335 */       if ((paramInt1 / 2 + paramInt2 / 2 + paramInt3 / 2 & 0x1) == 1) {
/*  336 */         double d = d2;
/*  337 */         d2 = d1;
/*  338 */         d1 = d;
/*      */       } 
/*  340 */       if (ln.ar.b(this.a, paramInt1 - 1, paramInt2, paramInt3)) {
/*  341 */         he.a((paramInt1 + f3), (paramInt2 + f2 + f4), (paramInt3 + 1), d2, d3);
/*  342 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 1), d2, d4);
/*  343 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 0), d1, d4);
/*  344 */         he.a((paramInt1 + f3), (paramInt2 + f2 + f4), (paramInt3 + 0), d1, d3);
/*      */         
/*  346 */         he.a((paramInt1 + f3), (paramInt2 + f2 + f4), (paramInt3 + 0), d1, d3);
/*  347 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 0), d1, d4);
/*  348 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 1), d2, d4);
/*  349 */         he.a((paramInt1 + f3), (paramInt2 + f2 + f4), (paramInt3 + 1), d2, d3);
/*      */       } 
/*  351 */       if (ln.ar.b(this.a, paramInt1 + 1, paramInt2, paramInt3)) {
/*  352 */         he.a(((paramInt1 + 1) - f3), (paramInt2 + f2 + f4), (paramInt3 + 0), d1, d3);
/*  353 */         he.a((paramInt1 + 1 - 0), ((paramInt2 + 0) + f4), (paramInt3 + 0), d1, d4);
/*  354 */         he.a((paramInt1 + 1 - 0), ((paramInt2 + 0) + f4), (paramInt3 + 1), d2, d4);
/*  355 */         he.a(((paramInt1 + 1) - f3), (paramInt2 + f2 + f4), (paramInt3 + 1), d2, d3);
/*      */         
/*  357 */         he.a(((paramInt1 + 1) - f3), (paramInt2 + f2 + f4), (paramInt3 + 1), d2, d3);
/*  358 */         he.a((paramInt1 + 1 - 0), ((paramInt2 + 0) + f4), (paramInt3 + 1), d2, d4);
/*  359 */         he.a((paramInt1 + 1 - 0), ((paramInt2 + 0) + f4), (paramInt3 + 0), d1, d4);
/*  360 */         he.a(((paramInt1 + 1) - f3), (paramInt2 + f2 + f4), (paramInt3 + 0), d1, d3);
/*      */       } 
/*  362 */       if (ln.ar.b(this.a, paramInt1, paramInt2, paramInt3 - 1)) {
/*  363 */         he.a((paramInt1 + 0), (paramInt2 + f2 + f4), (paramInt3 + f3), d2, d3);
/*  364 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 0), d2, d4);
/*  365 */         he.a((paramInt1 + 1), ((paramInt2 + 0) + f4), (paramInt3 + 0), d1, d4);
/*  366 */         he.a((paramInt1 + 1), (paramInt2 + f2 + f4), (paramInt3 + f3), d1, d3);
/*      */         
/*  368 */         he.a((paramInt1 + 1), (paramInt2 + f2 + f4), (paramInt3 + f3), d1, d3);
/*  369 */         he.a((paramInt1 + 1), ((paramInt2 + 0) + f4), (paramInt3 + 0), d1, d4);
/*  370 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 0), d2, d4);
/*  371 */         he.a((paramInt1 + 0), (paramInt2 + f2 + f4), (paramInt3 + f3), d2, d3);
/*      */       } 
/*  373 */       if (ln.ar.b(this.a, paramInt1, paramInt2, paramInt3 + 1)) {
/*  374 */         he.a((paramInt1 + 1), (paramInt2 + f2 + f4), ((paramInt3 + 1) - f3), d1, d3);
/*  375 */         he.a((paramInt1 + 1), ((paramInt2 + 0) + f4), (paramInt3 + 1 - 0), d1, d4);
/*  376 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 1 - 0), d2, d4);
/*  377 */         he.a((paramInt1 + 0), (paramInt2 + f2 + f4), ((paramInt3 + 1) - f3), d2, d3);
/*      */         
/*  379 */         he.a((paramInt1 + 0), (paramInt2 + f2 + f4), ((paramInt3 + 1) - f3), d2, d3);
/*  380 */         he.a((paramInt1 + 0), ((paramInt2 + 0) + f4), (paramInt3 + 1 - 0), d2, d4);
/*  381 */         he.a((paramInt1 + 1), ((paramInt2 + 0) + f4), (paramInt3 + 1 - 0), d1, d4);
/*  382 */         he.a((paramInt1 + 1), (paramInt2 + f2 + f4), ((paramInt3 + 1) - f3), d1, d3);
/*      */       } 
/*  384 */       if (ln.ar.b(this.a, paramInt1, paramInt2 + 1, paramInt3)) {
/*  385 */         double d5 = paramInt1 + 0.5D + 0.5D;
/*  386 */         double d6 = paramInt1 + 0.5D - 0.5D;
/*  387 */         double d7 = paramInt3 + 0.5D + 0.5D;
/*  388 */         double d8 = paramInt3 + 0.5D - 0.5D;
/*      */         
/*  390 */         double d9 = paramInt1 + 0.5D - 0.5D;
/*  391 */         double d10 = paramInt1 + 0.5D + 0.5D;
/*  392 */         double d11 = paramInt3 + 0.5D - 0.5D;
/*  393 */         double d12 = paramInt3 + 0.5D + 0.5D;
/*      */         
/*  395 */         d1 = (j / 256.0F);
/*  396 */         d2 = ((j + 15.99F) / 256.0F);
/*  397 */         d3 = (k / 256.0F);
/*  398 */         d4 = ((k + 15.99F) / 256.0F);
/*      */         
/*  400 */         paramInt2++;
/*  401 */         f2 = -0.2F;
/*      */         
/*  403 */         if ((paramInt1 + paramInt2 + paramInt3 & 0x1) == 0) {
/*      */           
/*  405 */           he.a(d9, (paramInt2 + f2), (paramInt3 + 0), d2, d3);
/*  406 */           he.a(d5, (paramInt2 + 0), (paramInt3 + 0), d2, d4);
/*  407 */           he.a(d5, (paramInt2 + 0), (paramInt3 + 1), d1, d4);
/*  408 */           he.a(d9, (paramInt2 + f2), (paramInt3 + 1), d1, d3);
/*      */           
/*  410 */           d1 = (j / 256.0F);
/*  411 */           d2 = ((j + 15.99F) / 256.0F);
/*  412 */           d3 = ((k + 16) / 256.0F);
/*  413 */           d4 = ((k + 15.99F + 16.0F) / 256.0F);
/*      */           
/*  415 */           he.a(d10, (paramInt2 + f2), (paramInt3 + 1), d2, d3);
/*  416 */           he.a(d6, (paramInt2 + 0), (paramInt3 + 1), d2, d4);
/*  417 */           he.a(d6, (paramInt2 + 0), (paramInt3 + 0), d1, d4);
/*  418 */           he.a(d10, (paramInt2 + f2), (paramInt3 + 0), d1, d3);
/*      */         }
/*      */         else {
/*      */           
/*  422 */           he.a((paramInt1 + 0), (paramInt2 + f2), d12, d2, d3);
/*  423 */           he.a((paramInt1 + 0), (paramInt2 + 0), d8, d2, d4);
/*  424 */           he.a((paramInt1 + 1), (paramInt2 + 0), d8, d1, d4);
/*  425 */           he.a((paramInt1 + 1), (paramInt2 + f2), d12, d1, d3);
/*      */           
/*  427 */           d1 = (j / 256.0F);
/*  428 */           d2 = ((j + 15.99F) / 256.0F);
/*  429 */           d3 = ((k + 16) / 256.0F);
/*  430 */           d4 = ((k + 15.99F + 16.0F) / 256.0F);
/*      */           
/*  432 */           he.a((paramInt1 + 1), (paramInt2 + f2), d11, d2, d3);
/*  433 */           he.a((paramInt1 + 1), (paramInt2 + 0), d7, d2, d4);
/*  434 */           he.a((paramInt1 + 0), (paramInt2 + 0), d7, d1, d4);
/*  435 */           he.a((paramInt1 + 0), (paramInt2 + f2), d11, d1, d3);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  440 */     return true;
/*      */   }
/*      */   
/*      */   public boolean e(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  444 */     he he = he.a;
/*      */     
/*  446 */     int i = paramln.a(1, this.a.e(paramInt1, paramInt2, paramInt3));
/*      */     
/*  448 */     if (this.b >= 0) i = this.b;
/*      */     
/*  450 */     float f1 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  451 */     he.a(f1, f1, f1);
/*  452 */     int j = (i & 0xF) << 4;
/*  453 */     int k = i & 0xF0;
/*      */     
/*  455 */     double d1 = (j / 256.0F);
/*  456 */     double d2 = ((j + 15.99F) / 256.0F);
/*  457 */     double d3 = (k / 256.0F);
/*  458 */     double d4 = ((k + 15.99F) / 256.0F);
/*  459 */     float f2 = 0.0F;
/*  460 */     float f3 = 0.03125F;
/*      */     
/*  462 */     boolean bool1 = (jv.b(this.a, paramInt1 - 1, paramInt2, paramInt3) || (!this.a.g(paramInt1 - 1, paramInt2, paramInt3) && jv.b(this.a, paramInt1 - 1, paramInt2 - 1, paramInt3))) ? true : false;
/*  463 */     boolean bool2 = (jv.b(this.a, paramInt1 + 1, paramInt2, paramInt3) || (!this.a.g(paramInt1 + 1, paramInt2, paramInt3) && jv.b(this.a, paramInt1 + 1, paramInt2 - 1, paramInt3))) ? true : false;
/*  464 */     boolean bool3 = (jv.b(this.a, paramInt1, paramInt2, paramInt3 - 1) || (!this.a.g(paramInt1, paramInt2, paramInt3 - 1) && jv.b(this.a, paramInt1, paramInt2 - 1, paramInt3 - 1))) ? true : false;
/*  465 */     boolean bool4 = (jv.b(this.a, paramInt1, paramInt2, paramInt3 + 1) || (!this.a.g(paramInt1, paramInt2, paramInt3 + 1) && jv.b(this.a, paramInt1, paramInt2 - 1, paramInt3 + 1))) ? true : false;
/*  466 */     if (!this.a.g(paramInt1, paramInt2 + 1, paramInt3)) {
/*  467 */       if (this.a.g(paramInt1 - 1, paramInt2, paramInt3) && jv.b(this.a, paramInt1 - 1, paramInt2 + 1, paramInt3)) bool1 = true; 
/*  468 */       if (this.a.g(paramInt1 + 1, paramInt2, paramInt3) && jv.b(this.a, paramInt1 + 1, paramInt2 + 1, paramInt3)) bool2 = true; 
/*  469 */       if (this.a.g(paramInt1, paramInt2, paramInt3 - 1) && jv.b(this.a, paramInt1, paramInt2 + 1, paramInt3 - 1)) bool3 = true; 
/*  470 */       if (this.a.g(paramInt1, paramInt2, paramInt3 + 1) && jv.b(this.a, paramInt1, paramInt2 + 1, paramInt3 + 1)) bool4 = true;
/*      */     
/*      */     } 
/*      */     
/*  474 */     float f4 = 0.3125F;
/*  475 */     float f5 = (paramInt1 + 0);
/*  476 */     float f6 = (paramInt1 + 1);
/*  477 */     float f7 = (paramInt3 + 0);
/*  478 */     float f8 = (paramInt3 + 1);
/*      */     
/*  480 */     byte b = 0;
/*  481 */     if ((bool1 || bool2) && !bool3 && !bool4) b = 1; 
/*  482 */     if ((bool3 || bool4) && !bool2 && !bool1) b = 2; 
/*  483 */     if (b != 0) {
/*  484 */       d1 = ((j + 16) / 256.0F);
/*  485 */       d2 = (((j + 16) + 15.99F) / 256.0F);
/*  486 */       d3 = (k / 256.0F);
/*  487 */       d4 = ((k + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/*  490 */     if (b == 0) {
/*  491 */       if (bool2 || bool3 || bool4 || bool1) {
/*  492 */         if (!bool1) f5 += f4; 
/*  493 */         if (!bool1) d1 += (f4 / 16.0F); 
/*  494 */         if (!bool2) f6 -= f4; 
/*  495 */         if (!bool2) d2 -= (f4 / 16.0F); 
/*  496 */         if (!bool3) f7 += f4; 
/*  497 */         if (!bool3) d3 += (f4 / 16.0F); 
/*  498 */         if (!bool4) f8 -= f4; 
/*  499 */         if (!bool4) d4 -= (f4 / 16.0F); 
/*      */       } 
/*  501 */       he.a((f6 + f2), (paramInt2 + f3), (f8 + f2), d2, d4);
/*  502 */       he.a((f6 + f2), (paramInt2 + f3), (f7 - f2), d2, d3);
/*  503 */       he.a((f5 - f2), (paramInt2 + f3), (f7 - f2), d1, d3);
/*  504 */       he.a((f5 - f2), (paramInt2 + f3), (f8 + f2), d1, d4);
/*      */     } 
/*  506 */     if (b == 1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  515 */       he.a((f6 + f2), (paramInt2 + f3), (f8 + f2), d2, d4);
/*  516 */       he.a((f6 + f2), (paramInt2 + f3), (f7 - f2), d2, d3);
/*  517 */       he.a((f5 - f2), (paramInt2 + f3), (f7 - f2), d1, d3);
/*  518 */       he.a((f5 - f2), (paramInt2 + f3), (f8 + f2), d1, d4);
/*      */     } 
/*  520 */     if (b == 2) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  529 */       he.a((f6 + f2), (paramInt2 + f3), (f8 + f2), d2, d4);
/*  530 */       he.a((f6 + f2), (paramInt2 + f3), (f7 - f2), d1, d4);
/*  531 */       he.a((f5 - f2), (paramInt2 + f3), (f7 - f2), d1, d3);
/*  532 */       he.a((f5 - f2), (paramInt2 + f3), (f8 + f2), d2, d3);
/*      */     } 
/*      */     
/*  535 */     d1 = ((j + 16) / 256.0F);
/*  536 */     d2 = (((j + 16) + 15.99F) / 256.0F);
/*  537 */     d3 = (k / 256.0F);
/*  538 */     d4 = ((k + 15.99F) / 256.0F);
/*  539 */     if (!this.a.g(paramInt1, paramInt2 + 1, paramInt3)) {
/*      */       
/*  541 */       if (this.a.g(paramInt1 - 1, paramInt2, paramInt3) && this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3) == ln.av.ba) {
/*  542 */         he.a((paramInt1 + f3), ((paramInt2 + 1) + f2), ((paramInt3 + 1) + f2), d2, d3);
/*  543 */         he.a((paramInt1 + f3), ((paramInt2 + 0) - f2), ((paramInt3 + 1) + f2), d1, d3);
/*  544 */         he.a((paramInt1 + f3), ((paramInt2 + 0) - f2), ((paramInt3 + 0) - f2), d1, d4);
/*  545 */         he.a((paramInt1 + f3), ((paramInt2 + 1) + f2), ((paramInt3 + 0) - f2), d2, d4);
/*      */       } 
/*  547 */       if (this.a.g(paramInt1 + 1, paramInt2, paramInt3) && this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3) == ln.av.ba) {
/*  548 */         he.a(((paramInt1 + 1) - f3), ((paramInt2 + 0) - f2), ((paramInt3 + 1) + f2), d1, d4);
/*  549 */         he.a(((paramInt1 + 1) - f3), ((paramInt2 + 1) + f2), ((paramInt3 + 1) + f2), d2, d4);
/*  550 */         he.a(((paramInt1 + 1) - f3), ((paramInt2 + 1) + f2), ((paramInt3 + 0) - f2), d2, d3);
/*  551 */         he.a(((paramInt1 + 1) - f3), ((paramInt2 + 0) - f2), ((paramInt3 + 0) - f2), d1, d3);
/*      */       } 
/*  553 */       if (this.a.g(paramInt1, paramInt2, paramInt3 - 1) && this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1) == ln.av.ba) {
/*  554 */         he.a(((paramInt1 + 1) + f2), ((paramInt2 + 0) - f2), (paramInt3 + f3), d1, d4);
/*  555 */         he.a(((paramInt1 + 1) + f2), ((paramInt2 + 1) + f2), (paramInt3 + f3), d2, d4);
/*  556 */         he.a(((paramInt1 + 0) - f2), ((paramInt2 + 1) + f2), (paramInt3 + f3), d2, d3);
/*  557 */         he.a(((paramInt1 + 0) - f2), ((paramInt2 + 0) - f2), (paramInt3 + f3), d1, d3);
/*      */       } 
/*  559 */       if (this.a.g(paramInt1, paramInt2, paramInt3 + 1) && this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1) == ln.av.ba) {
/*  560 */         he.a(((paramInt1 + 1) + f2), ((paramInt2 + 1) + f2), ((paramInt3 + 1) - f3), d2, d3);
/*  561 */         he.a(((paramInt1 + 1) + f2), ((paramInt2 + 0) - f2), ((paramInt3 + 1) - f3), d1, d3);
/*  562 */         he.a(((paramInt1 + 0) - f2), ((paramInt2 + 0) - f2), ((paramInt3 + 1) - f3), d1, d4);
/*  563 */         he.a(((paramInt1 + 0) - f2), ((paramInt2 + 1) + f2), ((paramInt3 + 1) - f3), d2, d4);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  568 */     return true;
/*      */   }
/*      */   
/*      */   public boolean f(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  572 */     he he = he.a;
/*  573 */     int i = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  575 */     int j = paramln.a(0, i);
/*  576 */     if (this.b >= 0) j = this.b;
/*      */     
/*  578 */     float f1 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  579 */     he.a(f1, f1, f1);
/*      */     
/*  581 */     int k = (j & 0xF) << 4;
/*  582 */     int m = j & 0xF0;
/*      */     
/*  584 */     double d1 = (k / 256.0F);
/*  585 */     double d2 = ((k + 15.99F) / 256.0F);
/*  586 */     double d3 = (m / 256.0F);
/*  587 */     double d4 = ((m + 15.99F) / 256.0F);
/*      */     
/*  589 */     float f2 = 0.0625F;
/*      */     
/*  591 */     float f3 = (paramInt1 + 1);
/*  592 */     float f4 = (paramInt1 + 1);
/*  593 */     float f5 = (paramInt1 + 0);
/*  594 */     float f6 = (paramInt1 + 0);
/*      */     
/*  596 */     float f7 = (paramInt3 + 0);
/*  597 */     float f8 = (paramInt3 + 1);
/*  598 */     float f9 = (paramInt3 + 1);
/*  599 */     float f10 = (paramInt3 + 0);
/*      */     
/*  601 */     float f11 = paramInt2 + f2;
/*  602 */     float f12 = paramInt2 + f2;
/*  603 */     float f13 = paramInt2 + f2;
/*  604 */     float f14 = paramInt2 + f2;
/*      */     
/*  606 */     if (i == 1 || i == 2 || i == 3 || i == 7) {
/*  607 */       f3 = f6 = (paramInt1 + 1);
/*  608 */       f4 = f5 = (paramInt1 + 0);
/*  609 */       f7 = f8 = (paramInt3 + 1);
/*  610 */       f9 = f10 = (paramInt3 + 0);
/*  611 */     } else if (i == 8) {
/*  612 */       f3 = f4 = (paramInt1 + 0);
/*  613 */       f5 = f6 = (paramInt1 + 1);
/*  614 */       f7 = f10 = (paramInt3 + 1);
/*  615 */       f8 = f9 = (paramInt3 + 0);
/*  616 */     } else if (i == 9) {
/*  617 */       f3 = f6 = (paramInt1 + 0);
/*  618 */       f4 = f5 = (paramInt1 + 1);
/*  619 */       f7 = f8 = (paramInt3 + 0);
/*  620 */       f9 = f10 = (paramInt3 + 1);
/*      */     } 
/*      */     
/*  623 */     if (i == 2 || i == 4) {
/*  624 */       f11++;
/*  625 */       f14++;
/*  626 */     } else if (i == 3 || i == 5) {
/*  627 */       f12++;
/*  628 */       f13++;
/*      */     } 
/*      */     
/*  631 */     he.a(f3, f11, f7, d2, d3);
/*  632 */     he.a(f4, f12, f8, d2, d4);
/*  633 */     he.a(f5, f13, f9, d1, d4);
/*  634 */     he.a(f6, f14, f10, d1, d3);
/*      */     
/*  636 */     he.a(f6, f14, f10, d1, d3);
/*  637 */     he.a(f5, f13, f9, d1, d4);
/*  638 */     he.a(f4, f12, f8, d2, d4);
/*  639 */     he.a(f3, f11, f7, d2, d3);
/*      */     
/*  641 */     return true;
/*      */   }
/*      */   
/*      */   public boolean g(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  645 */     he he = he.a;
/*      */     
/*  647 */     int i = paramln.a(0);
/*      */     
/*  649 */     if (this.b >= 0) i = this.b;
/*      */     
/*  651 */     float f1 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  652 */     he.a(f1, f1, f1);
/*  653 */     int j = (i & 0xF) << 4;
/*  654 */     int k = i & 0xF0;
/*      */     
/*  656 */     double d1 = (j / 256.0F);
/*  657 */     double d2 = ((j + 15.99F) / 256.0F);
/*  658 */     double d3 = (k / 256.0F);
/*  659 */     double d4 = ((k + 15.99F) / 256.0F);
/*      */     
/*  661 */     int m = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  663 */     float f2 = 0.0F;
/*  664 */     float f3 = 0.05F;
/*  665 */     if (m == 5) {
/*  666 */       he.a((paramInt1 + f3), ((paramInt2 + 1) + f2), ((paramInt3 + 1) + f2), d1, d3);
/*  667 */       he.a((paramInt1 + f3), ((paramInt2 + 0) - f2), ((paramInt3 + 1) + f2), d1, d4);
/*  668 */       he.a((paramInt1 + f3), ((paramInt2 + 0) - f2), ((paramInt3 + 0) - f2), d2, d4);
/*  669 */       he.a((paramInt1 + f3), ((paramInt2 + 1) + f2), ((paramInt3 + 0) - f2), d2, d3);
/*      */     } 
/*  671 */     if (m == 4) {
/*  672 */       he.a(((paramInt1 + 1) - f3), ((paramInt2 + 0) - f2), ((paramInt3 + 1) + f2), d2, d4);
/*  673 */       he.a(((paramInt1 + 1) - f3), ((paramInt2 + 1) + f2), ((paramInt3 + 1) + f2), d2, d3);
/*  674 */       he.a(((paramInt1 + 1) - f3), ((paramInt2 + 1) + f2), ((paramInt3 + 0) - f2), d1, d3);
/*  675 */       he.a(((paramInt1 + 1) - f3), ((paramInt2 + 0) - f2), ((paramInt3 + 0) - f2), d1, d4);
/*      */     } 
/*  677 */     if (m == 3) {
/*  678 */       he.a(((paramInt1 + 1) + f2), ((paramInt2 + 0) - f2), (paramInt3 + f3), d2, d4);
/*  679 */       he.a(((paramInt1 + 1) + f2), ((paramInt2 + 1) + f2), (paramInt3 + f3), d2, d3);
/*  680 */       he.a(((paramInt1 + 0) - f2), ((paramInt2 + 1) + f2), (paramInt3 + f3), d1, d3);
/*  681 */       he.a(((paramInt1 + 0) - f2), ((paramInt2 + 0) - f2), (paramInt3 + f3), d1, d4);
/*      */     } 
/*  683 */     if (m == 2) {
/*  684 */       he.a(((paramInt1 + 1) + f2), ((paramInt2 + 1) + f2), ((paramInt3 + 1) - f3), d1, d3);
/*  685 */       he.a(((paramInt1 + 1) + f2), ((paramInt2 + 0) - f2), ((paramInt3 + 1) - f3), d1, d4);
/*  686 */       he.a(((paramInt1 + 0) - f2), ((paramInt2 + 0) - f2), ((paramInt3 + 1) - f3), d2, d4);
/*  687 */       he.a(((paramInt1 + 0) - f2), ((paramInt2 + 1) + f2), ((paramInt3 + 1) - f3), d2, d3);
/*      */     } 
/*      */     
/*  690 */     return true;
/*      */   }
/*      */   
/*      */   public boolean h(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  694 */     he he = he.a;
/*      */     
/*  696 */     float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  697 */     he.a(f, f, f);
/*      */     
/*  699 */     a(paramln, this.a.e(paramInt1, paramInt2, paramInt3), paramInt1, paramInt2, paramInt3);
/*  700 */     return true;
/*      */   }
/*      */   
/*      */   public boolean i(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  704 */     he he = he.a;
/*      */     
/*  706 */     float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  707 */     he.a(f, f, f);
/*      */     
/*  709 */     b(paramln, this.a.e(paramInt1, paramInt2, paramInt3), paramInt1, (paramInt2 - 0.0625F), paramInt3);
/*  710 */     return true;
/*      */   }
/*      */   
/*      */   public void a(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5) {
/*  714 */     he he = he.a;
/*  715 */     int i = paramln.a(0);
/*      */     
/*  717 */     if (this.b >= 0) i = this.b; 
/*  718 */     int j = (i & 0xF) << 4;
/*  719 */     int k = i & 0xF0;
/*  720 */     float f1 = j / 256.0F;
/*  721 */     float f2 = (j + 15.99F) / 256.0F;
/*  722 */     float f3 = k / 256.0F;
/*  723 */     float f4 = (k + 15.99F) / 256.0F;
/*      */ 
/*      */     
/*  726 */     double d1 = f1 + 0.02734375D;
/*  727 */     double d2 = f3 + 0.0234375D;
/*  728 */     double d3 = f1 + 0.03515625D;
/*  729 */     double d4 = f3 + 0.03125D;
/*  730 */     paramDouble1 += 0.5D;
/*  731 */     paramDouble3 += 0.5D;
/*      */     
/*  733 */     double d5 = paramDouble1 - 0.5D;
/*  734 */     double d6 = paramDouble1 + 0.5D;
/*  735 */     double d7 = paramDouble3 - 0.5D;
/*  736 */     double d8 = paramDouble3 + 0.5D;
/*  737 */     double d9 = 0.0625D;
/*      */     
/*  739 */     double d10 = 0.625D;
/*  740 */     he.a(paramDouble1 + paramDouble4 * (1.0D - d10) - d9, paramDouble2 + d10, paramDouble3 + paramDouble5 * (1.0D - d10) - d9, d1, d2);
/*  741 */     he.a(paramDouble1 + paramDouble4 * (1.0D - d10) - d9, paramDouble2 + d10, paramDouble3 + paramDouble5 * (1.0D - d10) + d9, d1, d4);
/*  742 */     he.a(paramDouble1 + paramDouble4 * (1.0D - d10) + d9, paramDouble2 + d10, paramDouble3 + paramDouble5 * (1.0D - d10) + d9, d3, d4);
/*  743 */     he.a(paramDouble1 + paramDouble4 * (1.0D - d10) + d9, paramDouble2 + d10, paramDouble3 + paramDouble5 * (1.0D - d10) - d9, d3, d2);
/*      */     
/*  745 */     he.a(paramDouble1 - d9, paramDouble2 + 1.0D, d7, f1, f3);
/*  746 */     he.a(paramDouble1 - d9 + paramDouble4, paramDouble2 + 0.0D, d7 + paramDouble5, f1, f4);
/*  747 */     he.a(paramDouble1 - d9 + paramDouble4, paramDouble2 + 0.0D, d8 + paramDouble5, f2, f4);
/*  748 */     he.a(paramDouble1 - d9, paramDouble2 + 1.0D, d8, f2, f3);
/*      */     
/*  750 */     he.a(paramDouble1 + d9, paramDouble2 + 1.0D, d8, f1, f3);
/*  751 */     he.a(paramDouble1 + paramDouble4 + d9, paramDouble2 + 0.0D, d8 + paramDouble5, f1, f4);
/*  752 */     he.a(paramDouble1 + paramDouble4 + d9, paramDouble2 + 0.0D, d7 + paramDouble5, f2, f4);
/*  753 */     he.a(paramDouble1 + d9, paramDouble2 + 1.0D, d7, f2, f3);
/*      */     
/*  755 */     he.a(d5, paramDouble2 + 1.0D, paramDouble3 + d9, f1, f3);
/*  756 */     he.a(d5 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 + d9 + paramDouble5, f1, f4);
/*  757 */     he.a(d6 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 + d9 + paramDouble5, f2, f4);
/*  758 */     he.a(d6, paramDouble2 + 1.0D, paramDouble3 + d9, f2, f3);
/*      */     
/*  760 */     he.a(d6, paramDouble2 + 1.0D, paramDouble3 - d9, f1, f3);
/*  761 */     he.a(d6 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 - d9 + paramDouble5, f1, f4);
/*  762 */     he.a(d5 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 - d9 + paramDouble5, f2, f4);
/*  763 */     he.a(d5, paramDouble2 + 1.0D, paramDouble3 - d9, f2, f3);
/*      */   }
/*      */   
/*      */   public void a(ln paramln, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  767 */     he he = he.a;
/*      */     
/*  769 */     int i = paramln.a(0, paramInt);
/*      */     
/*  771 */     if (this.b >= 0) i = this.b; 
/*  772 */     int j = (i & 0xF) << 4;
/*  773 */     int k = i & 0xF0;
/*  774 */     double d1 = (j / 256.0F);
/*  775 */     double d2 = ((j + 15.99F) / 256.0F);
/*  776 */     double d3 = (k / 256.0F);
/*  777 */     double d4 = ((k + 15.99F) / 256.0F);
/*      */     
/*  779 */     double d5 = paramDouble1 + 0.5D - 0.44999998807907104D;
/*  780 */     double d6 = paramDouble1 + 0.5D + 0.44999998807907104D;
/*  781 */     double d7 = paramDouble3 + 0.5D - 0.44999998807907104D;
/*  782 */     double d8 = paramDouble3 + 0.5D + 0.44999998807907104D;
/*      */     
/*  784 */     he.a(d5, paramDouble2 + 1.0D, d7, d1, d3);
/*  785 */     he.a(d5, paramDouble2 + 0.0D, d7, d1, d4);
/*  786 */     he.a(d6, paramDouble2 + 0.0D, d8, d2, d4);
/*  787 */     he.a(d6, paramDouble2 + 1.0D, d8, d2, d3);
/*      */     
/*  789 */     he.a(d6, paramDouble2 + 1.0D, d8, d1, d3);
/*  790 */     he.a(d6, paramDouble2 + 0.0D, d8, d1, d4);
/*  791 */     he.a(d5, paramDouble2 + 0.0D, d7, d2, d4);
/*  792 */     he.a(d5, paramDouble2 + 1.0D, d7, d2, d3);
/*      */     
/*  794 */     he.a(d5, paramDouble2 + 1.0D, d8, d1, d3);
/*  795 */     he.a(d5, paramDouble2 + 0.0D, d8, d1, d4);
/*  796 */     he.a(d6, paramDouble2 + 0.0D, d7, d2, d4);
/*  797 */     he.a(d6, paramDouble2 + 1.0D, d7, d2, d3);
/*      */     
/*  799 */     he.a(d6, paramDouble2 + 1.0D, d7, d1, d3);
/*  800 */     he.a(d6, paramDouble2 + 0.0D, d7, d1, d4);
/*  801 */     he.a(d5, paramDouble2 + 0.0D, d8, d2, d4);
/*  802 */     he.a(d5, paramDouble2 + 1.0D, d8, d2, d3);
/*      */   }
/*      */   
/*      */   public void b(ln paramln, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  806 */     he he = he.a;
/*      */     
/*  808 */     int i = paramln.a(0, paramInt);
/*      */     
/*  810 */     if (this.b >= 0) i = this.b; 
/*  811 */     int j = (i & 0xF) << 4;
/*  812 */     int k = i & 0xF0;
/*  813 */     double d1 = (j / 256.0F);
/*  814 */     double d2 = ((j + 15.99F) / 256.0F);
/*  815 */     double d3 = (k / 256.0F);
/*  816 */     double d4 = ((k + 15.99F) / 256.0F);
/*      */     
/*  818 */     double d5 = paramDouble1 + 0.5D - 0.25D;
/*  819 */     double d6 = paramDouble1 + 0.5D + 0.25D;
/*  820 */     double d7 = paramDouble3 + 0.5D - 0.5D;
/*  821 */     double d8 = paramDouble3 + 0.5D + 0.5D;
/*      */     
/*  823 */     he.a(d5, paramDouble2 + 1.0D, d7, d1, d3);
/*  824 */     he.a(d5, paramDouble2 + 0.0D, d7, d1, d4);
/*  825 */     he.a(d5, paramDouble2 + 0.0D, d8, d2, d4);
/*  826 */     he.a(d5, paramDouble2 + 1.0D, d8, d2, d3);
/*      */     
/*  828 */     he.a(d5, paramDouble2 + 1.0D, d8, d1, d3);
/*  829 */     he.a(d5, paramDouble2 + 0.0D, d8, d1, d4);
/*  830 */     he.a(d5, paramDouble2 + 0.0D, d7, d2, d4);
/*  831 */     he.a(d5, paramDouble2 + 1.0D, d7, d2, d3);
/*      */     
/*  833 */     he.a(d6, paramDouble2 + 1.0D, d8, d1, d3);
/*  834 */     he.a(d6, paramDouble2 + 0.0D, d8, d1, d4);
/*  835 */     he.a(d6, paramDouble2 + 0.0D, d7, d2, d4);
/*  836 */     he.a(d6, paramDouble2 + 1.0D, d7, d2, d3);
/*      */     
/*  838 */     he.a(d6, paramDouble2 + 1.0D, d7, d1, d3);
/*  839 */     he.a(d6, paramDouble2 + 0.0D, d7, d1, d4);
/*  840 */     he.a(d6, paramDouble2 + 0.0D, d8, d2, d4);
/*  841 */     he.a(d6, paramDouble2 + 1.0D, d8, d2, d3);
/*      */     
/*  843 */     d5 = paramDouble1 + 0.5D - 0.5D;
/*  844 */     d6 = paramDouble1 + 0.5D + 0.5D;
/*  845 */     d7 = paramDouble3 + 0.5D - 0.25D;
/*  846 */     d8 = paramDouble3 + 0.5D + 0.25D;
/*      */     
/*  848 */     he.a(d5, paramDouble2 + 1.0D, d7, d1, d3);
/*  849 */     he.a(d5, paramDouble2 + 0.0D, d7, d1, d4);
/*  850 */     he.a(d6, paramDouble2 + 0.0D, d7, d2, d4);
/*  851 */     he.a(d6, paramDouble2 + 1.0D, d7, d2, d3);
/*      */     
/*  853 */     he.a(d6, paramDouble2 + 1.0D, d7, d1, d3);
/*  854 */     he.a(d6, paramDouble2 + 0.0D, d7, d1, d4);
/*  855 */     he.a(d5, paramDouble2 + 0.0D, d7, d2, d4);
/*  856 */     he.a(d5, paramDouble2 + 1.0D, d7, d2, d3);
/*      */     
/*  858 */     he.a(d6, paramDouble2 + 1.0D, d8, d1, d3);
/*  859 */     he.a(d6, paramDouble2 + 0.0D, d8, d1, d4);
/*  860 */     he.a(d5, paramDouble2 + 0.0D, d8, d2, d4);
/*  861 */     he.a(d5, paramDouble2 + 1.0D, d8, d2, d3);
/*      */     
/*  863 */     he.a(d5, paramDouble2 + 1.0D, d8, d1, d3);
/*  864 */     he.a(d5, paramDouble2 + 0.0D, d8, d1, d4);
/*  865 */     he.a(d6, paramDouble2 + 0.0D, d8, d2, d4);
/*  866 */     he.a(d6, paramDouble2 + 1.0D, d8, d2, d3);
/*      */   }
/*      */   
/*      */   public boolean j(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/*  870 */     he he = he.a;
/*      */     
/*  872 */     boolean bool1 = paramln.c(this.a, paramInt1, paramInt2 + 1, paramInt3, 1);
/*  873 */     boolean bool2 = paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3, 0);
/*  874 */     boolean[] arrayOfBoolean = new boolean[4];
/*  875 */     arrayOfBoolean[0] = paramln.c(this.a, paramInt1, paramInt2, paramInt3 - 1, 2);
/*  876 */     arrayOfBoolean[1] = paramln.c(this.a, paramInt1, paramInt2, paramInt3 + 1, 3);
/*  877 */     arrayOfBoolean[2] = paramln.c(this.a, paramInt1 - 1, paramInt2, paramInt3, 4);
/*  878 */     arrayOfBoolean[3] = paramln.c(this.a, paramInt1 + 1, paramInt2, paramInt3, 5);
/*      */     
/*  880 */     if (!bool1 && !bool2 && !arrayOfBoolean[0] && !arrayOfBoolean[1] && !arrayOfBoolean[2] && !arrayOfBoolean[3]) return false;
/*      */     
/*  882 */     boolean bool = false;
/*  883 */     float f1 = 0.5F;
/*  884 */     float f2 = 1.0F;
/*  885 */     float f3 = 0.8F;
/*  886 */     float f4 = 0.6F;
/*      */     
/*  888 */     double d1 = 0.0D;
/*  889 */     double d2 = 1.0D;
/*      */     
/*  891 */     fs fs = paramln.bl;
/*  892 */     int i = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  894 */     float f5 = a(paramInt1, paramInt2, paramInt3, fs);
/*  895 */     float f6 = a(paramInt1, paramInt2, paramInt3 + 1, fs);
/*  896 */     float f7 = a(paramInt1 + 1, paramInt2, paramInt3 + 1, fs);
/*  897 */     float f8 = a(paramInt1 + 1, paramInt2, paramInt3, fs);
/*      */ 
/*      */     
/*  900 */     if (this.d || bool1) {
/*  901 */       bool = true;
/*  902 */       int j = paramln.a(1, i);
/*  903 */       float f9 = (float)jf.a(this.a, paramInt1, paramInt2, paramInt3, fs);
/*  904 */       if (f9 > -999.0F) {
/*  905 */         j = paramln.a(2, i);
/*      */       }
/*  907 */       int k = (j & 0xF) << 4;
/*  908 */       int m = j & 0xF0;
/*      */       
/*  910 */       double d3 = (k + 8.0D) / 256.0D;
/*  911 */       double d4 = (m + 8.0D) / 256.0D;
/*  912 */       if (f9 < -999.0F) {
/*  913 */         f9 = 0.0F;
/*      */       } else {
/*  915 */         d3 = ((k + 16) / 256.0F);
/*  916 */         d4 = ((m + 16) / 256.0F);
/*      */       } 
/*  918 */       float f10 = ei.a(f9) * 8.0F / 256.0F;
/*  919 */       float f11 = ei.b(f9) * 8.0F / 256.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  926 */       float f12 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*  927 */       he.a(f2 * f12, f2 * f12, f2 * f12);
/*  928 */       he.a((paramInt1 + 0), (paramInt2 + f5), (paramInt3 + 0), d3 - f11 - f10, d4 - f11 + f10);
/*  929 */       he.a((paramInt1 + 0), (paramInt2 + f6), (paramInt3 + 1), d3 - f11 + f10, d4 + f11 + f10);
/*  930 */       he.a((paramInt1 + 1), (paramInt2 + f7), (paramInt3 + 1), d3 + f11 + f10, d4 + f11 - f10);
/*  931 */       he.a((paramInt1 + 1), (paramInt2 + f8), (paramInt3 + 0), d3 + f11 - f10, d4 - f11 - f10);
/*      */     } 
/*      */     
/*  934 */     if (this.d || bool2) {
/*  935 */       float f = paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/*  936 */       he.a(f1 * f, f1 * f, f1 * f);
/*  937 */       a(paramln, paramInt1, paramInt2, paramInt3, paramln.a(0));
/*  938 */       bool = true;
/*      */     } 
/*      */     
/*  941 */     for (byte b = 0; b < 4; b++) {
/*  942 */       int j = paramInt1;
/*  943 */       int k = paramInt2;
/*  944 */       int m = paramInt3;
/*      */       
/*  946 */       if (b == 0) m--; 
/*  947 */       if (b == 1) m++; 
/*  948 */       if (b == 2) j--; 
/*  949 */       if (b == 3) j++;
/*      */       
/*  951 */       int n = paramln.a(b + 2, i);
/*  952 */       int i1 = (n & 0xF) << 4;
/*  953 */       int i2 = n & 0xF0;
/*      */       
/*  955 */       if (this.d || arrayOfBoolean[b]) {
/*      */         float f9, f10, f11, f12, f13, f14;
/*      */ 
/*      */         
/*  959 */         if (b == 0) {
/*  960 */           f9 = f5;
/*  961 */           f10 = f8;
/*  962 */           f11 = paramInt1;
/*  963 */           f13 = (paramInt1 + 1);
/*  964 */           f12 = paramInt3;
/*  965 */           f14 = paramInt3;
/*  966 */         } else if (b == 1) {
/*  967 */           f9 = f7;
/*  968 */           f10 = f6;
/*  969 */           f11 = (paramInt1 + 1);
/*  970 */           f13 = paramInt1;
/*  971 */           f12 = (paramInt3 + 1);
/*  972 */           f14 = (paramInt3 + 1);
/*  973 */         } else if (b == 2) {
/*  974 */           f9 = f6;
/*  975 */           f10 = f5;
/*  976 */           f11 = paramInt1;
/*  977 */           f13 = paramInt1;
/*  978 */           f12 = (paramInt3 + 1);
/*  979 */           f14 = paramInt3;
/*      */         } else {
/*  981 */           f9 = f8;
/*  982 */           f10 = f7;
/*  983 */           f11 = (paramInt1 + 1);
/*  984 */           f13 = (paramInt1 + 1);
/*  985 */           f12 = paramInt3;
/*  986 */           f14 = (paramInt3 + 1);
/*      */         } 
/*      */ 
/*      */         
/*  990 */         bool = true;
/*  991 */         double d3 = ((i1 + 0) / 256.0F);
/*  992 */         double d4 = ((i1 + 16) - 0.01D) / 256.0D;
/*      */         
/*  994 */         double d5 = ((i2 + (1.0F - f9) * 16.0F) / 256.0F);
/*  995 */         double d6 = ((i2 + (1.0F - f10) * 16.0F) / 256.0F);
/*  996 */         double d7 = ((i2 + 16) - 0.01D) / 256.0D;
/*      */         
/*  998 */         float f15 = paramln.c(this.a, j, k, m);
/*  999 */         if (b < 2) { f15 *= f3; }
/* 1000 */         else { f15 *= f4; }
/*      */         
/* 1002 */         he.a(f2 * f15, f2 * f15, f2 * f15);
/* 1003 */         he.a(f11, (paramInt2 + f9), f12, d3, d5);
/* 1004 */         he.a(f13, (paramInt2 + f10), f14, d4, d6);
/* 1005 */         he.a(f13, (paramInt2 + 0), f14, d4, d7);
/* 1006 */         he.a(f11, (paramInt2 + 0), f12, d3, d7);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1044 */     paramln.be = d1;
/* 1045 */     paramln.bh = d2;
/*      */     
/* 1047 */     return bool;
/*      */   }
/*      */   
/*      */   private float a(int paramInt1, int paramInt2, int paramInt3, fs paramfs) {
/* 1051 */     byte b1 = 0;
/* 1052 */     float f = 0.0F;
/* 1053 */     for (byte b2 = 0; b2 < 4; b2++) {
/* 1054 */       int i = paramInt1 - (b2 & 0x1);
/* 1055 */       int j = paramInt2;
/* 1056 */       int k = paramInt3 - (b2 >> 1 & 0x1);
/* 1057 */       if (this.a.f(i, j + 1, k) == paramfs) {
/* 1058 */         return 1.0F;
/*      */       }
/* 1060 */       fs fs1 = this.a.f(i, j, k);
/* 1061 */       if (fs1 == paramfs) {
/* 1062 */         int m = this.a.e(i, j, k);
/* 1063 */         if (m >= 8 || m == 0) {
/* 1064 */           f += jf.b(m) * 10.0F;
/* 1065 */           b1 += true;
/*      */         } 
/* 1067 */         f += jf.b(m);
/* 1068 */         b1++;
/* 1069 */       } else if (!fs1.a()) {
/* 1070 */         f++;
/* 1071 */         b1++;
/*      */       } 
/*      */     } 
/* 1074 */     return 1.0F - f / b1;
/*      */   }
/*      */   
/*      */   public void a(ln paramln, cj paramcj, int paramInt1, int paramInt2, int paramInt3) {
/* 1078 */     float f1 = 0.5F;
/* 1079 */     float f2 = 1.0F;
/* 1080 */     float f3 = 0.8F;
/* 1081 */     float f4 = 0.6F;
/*      */     
/* 1083 */     he he = he.a;
/* 1084 */     he.b();
/* 1085 */     float f5 = paramln.c(paramcj, paramInt1, paramInt2, paramInt3);
/*      */     
/* 1087 */     float f6 = paramln.c(paramcj, paramInt1, paramInt2 - 1, paramInt3);
/* 1088 */     if (f6 < f5) f6 = f5; 
/* 1089 */     he.a(f1 * f6, f1 * f6, f1 * f6);
/* 1090 */     a(paramln, -0.5D, -0.5D, -0.5D, paramln.a(0));
/*      */     
/* 1092 */     f6 = paramln.c(paramcj, paramInt1, paramInt2 + 1, paramInt3);
/* 1093 */     if (f6 < f5) f6 = f5; 
/* 1094 */     he.a(f2 * f6, f2 * f6, f2 * f6);
/* 1095 */     b(paramln, -0.5D, -0.5D, -0.5D, paramln.a(1));
/*      */     
/* 1097 */     f6 = paramln.c(paramcj, paramInt1, paramInt2, paramInt3 - 1);
/* 1098 */     if (f6 < f5) f6 = f5; 
/* 1099 */     he.a(f3 * f6, f3 * f6, f3 * f6);
/* 1100 */     c(paramln, -0.5D, -0.5D, -0.5D, paramln.a(2));
/*      */     
/* 1102 */     f6 = paramln.c(paramcj, paramInt1, paramInt2, paramInt3 + 1);
/* 1103 */     if (f6 < f5) f6 = f5; 
/* 1104 */     he.a(f3 * f6, f3 * f6, f3 * f6);
/* 1105 */     d(paramln, -0.5D, -0.5D, -0.5D, paramln.a(3));
/*      */     
/* 1107 */     f6 = paramln.c(paramcj, paramInt1 - 1, paramInt2, paramInt3);
/* 1108 */     if (f6 < f5) f6 = f5; 
/* 1109 */     he.a(f4 * f6, f4 * f6, f4 * f6);
/* 1110 */     e(paramln, -0.5D, -0.5D, -0.5D, paramln.a(4));
/*      */     
/* 1112 */     f6 = paramln.c(paramcj, paramInt1 + 1, paramInt2, paramInt3);
/* 1113 */     if (f6 < f5) f6 = f5; 
/* 1114 */     he.a(f4 * f6, f4 * f6, f4 * f6);
/* 1115 */     f(paramln, -0.5D, -0.5D, -0.5D, paramln.a(5));
/* 1116 */     he.a();
/*      */   }
/*      */   
/*      */   public boolean k(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/* 1120 */     int i = paramln.d(this.a, paramInt1, paramInt2, paramInt3);
/* 1121 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 1122 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 1123 */     float f3 = (i & 0xFF) / 255.0F;
/* 1124 */     return a(paramln, paramInt1, paramInt2, paramInt3, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public boolean a(ln paramln, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1128 */     he he = he.a;
/*      */     
/* 1130 */     boolean bool = false;
/* 1131 */     float f1 = 0.5F;
/* 1132 */     float f2 = 1.0F;
/* 1133 */     float f3 = 0.8F;
/* 1134 */     float f4 = 0.6F;
/*      */     
/* 1136 */     float f5 = f1 * paramFloat1;
/* 1137 */     float f6 = f2 * paramFloat1;
/* 1138 */     float f7 = f3 * paramFloat1;
/* 1139 */     float f8 = f4 * paramFloat1;
/*      */     
/* 1141 */     float f9 = f1 * paramFloat2;
/* 1142 */     float f10 = f2 * paramFloat2;
/* 1143 */     float f11 = f3 * paramFloat2;
/* 1144 */     float f12 = f4 * paramFloat2;
/*      */     
/* 1146 */     float f13 = f1 * paramFloat3;
/* 1147 */     float f14 = f2 * paramFloat3;
/* 1148 */     float f15 = f3 * paramFloat3;
/* 1149 */     float f16 = f4 * paramFloat3;
/*      */     
/* 1151 */     float f17 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 1153 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3, 0)) {
/* 1154 */       float f = paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/*      */       
/* 1156 */       he.a(f5 * f, f9 * f, f13 * f);
/* 1157 */       a(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 0));
/* 1158 */       bool = true;
/*      */     } 
/*      */     
/* 1161 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2 + 1, paramInt3, 1)) {
/* 1162 */       float f = paramln.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 1163 */       if (paramln.bh != 1.0D && !paramln.bl.d()) f = f17;
/*      */       
/* 1165 */       he.a(f6 * f, f10 * f, f14 * f);
/* 1166 */       b(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 1));
/* 1167 */       bool = true;
/*      */     } 
/*      */     
/* 1170 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2, paramInt3 - 1, 2)) {
/* 1171 */       float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 1172 */       if (paramln.bf > 0.0D) f = f17;
/*      */       
/* 1174 */       he.a(f7 * f, f11 * f, f15 * f);
/* 1175 */       c(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 2));
/* 1176 */       bool = true;
/*      */     } 
/*      */     
/* 1179 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2, paramInt3 + 1, 3)) {
/* 1180 */       float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 1181 */       if (paramln.bi < 1.0D) f = f17;
/*      */       
/* 1183 */       he.a(f7 * f, f11 * f, f15 * f);
/* 1184 */       d(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 3));
/* 1185 */       bool = true;
/*      */     } 
/*      */     
/* 1188 */     if (this.d || paramln.c(this.a, paramInt1 - 1, paramInt2, paramInt3, 4)) {
/* 1189 */       float f = paramln.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 1190 */       if (paramln.bd > 0.0D) f = f17;
/*      */       
/* 1192 */       he.a(f8 * f, f12 * f, f16 * f);
/* 1193 */       e(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 4));
/* 1194 */       bool = true;
/*      */     } 
/*      */     
/* 1197 */     if (this.d || paramln.c(this.a, paramInt1 + 1, paramInt2, paramInt3, 5)) {
/* 1198 */       float f = paramln.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 1199 */       if (paramln.bg < 1.0D) f = f17;
/*      */       
/* 1201 */       he.a(f8 * f, f12 * f, f16 * f);
/* 1202 */       f(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 5));
/* 1203 */       bool = true;
/*      */     } 
/*      */     
/* 1206 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean l(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/* 1210 */     int i = paramln.d(this.a, paramInt1, paramInt2, paramInt3);
/* 1211 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 1212 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 1213 */     float f3 = (i & 0xFF) / 255.0F;
/* 1214 */     return b(paramln, paramInt1, paramInt2, paramInt3, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public boolean b(ln paramln, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 1218 */     he he = he.a;
/*      */     
/* 1220 */     boolean bool = false;
/* 1221 */     float f1 = 0.5F;
/* 1222 */     float f2 = 1.0F;
/* 1223 */     float f3 = 0.8F;
/* 1224 */     float f4 = 0.6F;
/*      */     
/* 1226 */     float f5 = f1 * paramFloat1;
/* 1227 */     float f6 = f2 * paramFloat1;
/* 1228 */     float f7 = f3 * paramFloat1;
/* 1229 */     float f8 = f4 * paramFloat1;
/*      */     
/* 1231 */     float f9 = f1 * paramFloat2;
/* 1232 */     float f10 = f2 * paramFloat2;
/* 1233 */     float f11 = f3 * paramFloat2;
/* 1234 */     float f12 = f4 * paramFloat2;
/*      */     
/* 1236 */     float f13 = f1 * paramFloat3;
/* 1237 */     float f14 = f2 * paramFloat3;
/* 1238 */     float f15 = f3 * paramFloat3;
/* 1239 */     float f16 = f4 * paramFloat3;
/*      */     
/* 1241 */     float f17 = 0.0625F;
/*      */     
/* 1243 */     float f18 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 1245 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3, 0)) {
/* 1246 */       float f = paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/*      */       
/* 1248 */       he.a(f5 * f, f9 * f, f13 * f);
/* 1249 */       a(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 0));
/* 1250 */       bool = true;
/*      */     } 
/*      */     
/* 1253 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2 + 1, paramInt3, 1)) {
/* 1254 */       float f = paramln.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 1255 */       if (paramln.bh != 1.0D && !paramln.bl.d()) f = f18;
/*      */       
/* 1257 */       he.a(f6 * f, f10 * f, f14 * f);
/* 1258 */       b(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 1));
/* 1259 */       bool = true;
/*      */     } 
/*      */     
/* 1262 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2, paramInt3 - 1, 2)) {
/* 1263 */       float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 1264 */       if (paramln.bf > 0.0D) f = f18;
/*      */       
/* 1266 */       he.a(f7 * f, f11 * f, f15 * f);
/* 1267 */       he.c(0.0F, 0.0F, f17);
/* 1268 */       c(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 2));
/* 1269 */       he.c(0.0F, 0.0F, -f17);
/* 1270 */       bool = true;
/*      */     } 
/*      */     
/* 1273 */     if (this.d || paramln.c(this.a, paramInt1, paramInt2, paramInt3 + 1, 3)) {
/* 1274 */       float f = paramln.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 1275 */       if (paramln.bi < 1.0D) f = f18;
/*      */       
/* 1277 */       he.a(f7 * f, f11 * f, f15 * f);
/* 1278 */       he.c(0.0F, 0.0F, -f17);
/* 1279 */       d(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 3));
/* 1280 */       he.c(0.0F, 0.0F, f17);
/* 1281 */       bool = true;
/*      */     } 
/*      */     
/* 1284 */     if (this.d || paramln.c(this.a, paramInt1 - 1, paramInt2, paramInt3, 4)) {
/* 1285 */       float f = paramln.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 1286 */       if (paramln.bd > 0.0D) f = f18;
/*      */       
/* 1288 */       he.a(f8 * f, f12 * f, f16 * f);
/* 1289 */       he.c(f17, 0.0F, 0.0F);
/* 1290 */       e(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 4));
/* 1291 */       he.c(-f17, 0.0F, 0.0F);
/* 1292 */       bool = true;
/*      */     } 
/*      */     
/* 1295 */     if (this.d || paramln.c(this.a, paramInt1 + 1, paramInt2, paramInt3, 5)) {
/* 1296 */       float f = paramln.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 1297 */       if (paramln.bg < 1.0D) f = f18;
/*      */       
/* 1299 */       he.a(f8 * f, f12 * f, f16 * f);
/* 1300 */       he.c(-f17, 0.0F, 0.0F);
/* 1301 */       f(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 5));
/* 1302 */       he.c(f17, 0.0F, 0.0F);
/* 1303 */       bool = true;
/*      */     } 
/*      */     
/* 1306 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean m(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/* 1310 */     boolean bool1 = false;
/*      */     
/* 1312 */     float f1 = 0.375F;
/* 1313 */     float f2 = 0.625F;
/* 1314 */     paramln.a(f1, 0.0F, f1, f2, 1.0F, f2);
/* 1315 */     k(paramln, paramInt1, paramInt2, paramInt3);
/*      */     
/* 1317 */     boolean bool2 = false;
/* 1318 */     boolean bool3 = false;
/*      */     
/* 1320 */     if (this.a.a(paramInt1 - 1, paramInt2, paramInt3) == paramln.ba || this.a.a(paramInt1 + 1, paramInt2, paramInt3) == paramln.ba) bool2 = true; 
/* 1321 */     if (this.a.a(paramInt1, paramInt2, paramInt3 - 1) == paramln.ba || this.a.a(paramInt1, paramInt2, paramInt3 + 1) == paramln.ba) bool3 = true;
/*      */     
/* 1323 */     if (!bool2 && !bool3) bool2 = true;
/*      */     
/* 1325 */     f1 = 0.4375F;
/* 1326 */     f2 = 0.5625F;
/* 1327 */     float f3 = 0.75F;
/* 1328 */     float f4 = 0.9375F;
/* 1329 */     if (bool2) {
/* 1330 */       paramln.a(0.0F, f3, f1, 1.0F, f4, f2);
/* 1331 */       k(paramln, paramInt1, paramInt2, paramInt3);
/*      */     } 
/* 1333 */     if (bool3) {
/* 1334 */       paramln.a(f1, f3, 0.0F, f2, f4, 1.0F);
/* 1335 */       k(paramln, paramInt1, paramInt2, paramInt3);
/*      */     } 
/*      */     
/* 1338 */     f3 = 0.375F;
/* 1339 */     f4 = 0.5625F;
/* 1340 */     if (bool2) {
/* 1341 */       paramln.a(0.0F, f3, f1, 1.0F, f4, f2);
/* 1342 */       k(paramln, paramInt1, paramInt2, paramInt3);
/*      */     } 
/* 1344 */     if (bool3) {
/* 1345 */       paramln.a(f1, f3, 0.0F, f2, f4, 1.0F);
/* 1346 */       k(paramln, paramInt1, paramInt2, paramInt3);
/*      */     } 
/*      */     
/* 1349 */     paramln.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 1350 */     return bool1;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean n(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/* 1355 */     boolean bool = false;
/*      */     
/* 1357 */     int i = this.a.e(paramInt1, paramInt2, paramInt3);
/* 1358 */     if (i == 0) {
/* 1359 */       paramln.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
/* 1360 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1361 */       paramln.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 1362 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1363 */     } else if (i == 1) {
/* 1364 */       paramln.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
/* 1365 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1366 */       paramln.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/* 1367 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1368 */     } else if (i == 2) {
/* 1369 */       paramln.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
/* 1370 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1371 */       paramln.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
/* 1372 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1373 */     } else if (i == 3) {
/* 1374 */       paramln.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
/* 1375 */       k(paramln, paramInt1, paramInt2, paramInt3);
/* 1376 */       paramln.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
/* 1377 */       k(paramln, paramInt1, paramInt2, paramInt3);
/*      */     } 
/* 1379 */     paramln.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 1380 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean o(ln paramln, int paramInt1, int paramInt2, int paramInt3) {
/* 1384 */     he he = he.a;
/*      */     
/* 1386 */     fn fn = (fn)paramln;
/*      */     
/* 1388 */     boolean bool = false;
/* 1389 */     float f1 = 0.5F;
/* 1390 */     float f2 = 1.0F;
/* 1391 */     float f3 = 0.8F;
/* 1392 */     float f4 = 0.6F;
/*      */     
/* 1394 */     float f5 = paramln.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */ 
/*      */     
/* 1397 */     float f6 = paramln.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 1398 */     if (fn.be > 0.0D) f6 = f5; 
/* 1399 */     if (ln.s[paramln.ba] > 0) f6 = 1.0F; 
/* 1400 */     he.a(f1 * f6, f1 * f6, f1 * f6);
/* 1401 */     a(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 0));
/* 1402 */     bool = true;
/*      */ 
/*      */ 
/*      */     
/* 1406 */     f6 = paramln.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 1407 */     if (fn.bh < 1.0D) f6 = f5; 
/* 1408 */     if (ln.s[paramln.ba] > 0) f6 = 1.0F; 
/* 1409 */     he.a(f2 * f6, f2 * f6, f2 * f6);
/* 1410 */     b(paramln, paramInt1, paramInt2, paramInt3, paramln.a(this.a, paramInt1, paramInt2, paramInt3, 1));
/* 1411 */     bool = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1418 */     f6 = paramln.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 1419 */     if (fn.bf > 0.0D) f6 = f5; 
/* 1420 */     if (ln.s[paramln.ba] > 0) f6 = 1.0F; 
/* 1421 */     he.a(f3 * f6, f3 * f6, f3 * f6);
/* 1422 */     int i = paramln.a(this.a, paramInt1, paramInt2, paramInt3, 2);
/* 1423 */     if (i < 0) {
/* 1424 */       this.c = true;
/* 1425 */       i = -i;
/*      */     } 
/* 1427 */     c(paramln, paramInt1, paramInt2, paramInt3, i);
/* 1428 */     bool = true;
/* 1429 */     this.c = false;
/*      */ 
/*      */ 
/*      */     
/* 1433 */     f6 = paramln.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 1434 */     if (fn.bi < 1.0D) f6 = f5; 
/* 1435 */     if (ln.s[paramln.ba] > 0) f6 = 1.0F; 
/* 1436 */     he.a(f3 * f6, f3 * f6, f3 * f6);
/* 1437 */     i = paramln.a(this.a, paramInt1, paramInt2, paramInt3, 3);
/* 1438 */     if (i < 0) {
/* 1439 */       this.c = true;
/* 1440 */       i = -i;
/*      */     } 
/* 1442 */     d(paramln, paramInt1, paramInt2, paramInt3, i);
/* 1443 */     bool = true;
/* 1444 */     this.c = false;
/*      */ 
/*      */ 
/*      */     
/* 1448 */     f6 = paramln.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 1449 */     if (fn.bd > 0.0D) f6 = f5; 
/* 1450 */     if (ln.s[paramln.ba] > 0) f6 = 1.0F; 
/* 1451 */     he.a(f4 * f6, f4 * f6, f4 * f6);
/* 1452 */     i = paramln.a(this.a, paramInt1, paramInt2, paramInt3, 4);
/* 1453 */     if (i < 0) {
/* 1454 */       this.c = true;
/* 1455 */       i = -i;
/*      */     } 
/* 1457 */     e(paramln, paramInt1, paramInt2, paramInt3, i);
/* 1458 */     bool = true;
/* 1459 */     this.c = false;
/*      */ 
/*      */ 
/*      */     
/* 1463 */     f6 = paramln.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 1464 */     if (fn.bg < 1.0D) f6 = f5; 
/* 1465 */     if (ln.s[paramln.ba] > 0) f6 = 1.0F; 
/* 1466 */     he.a(f4 * f6, f4 * f6, f4 * f6);
/* 1467 */     i = paramln.a(this.a, paramInt1, paramInt2, paramInt3, 5);
/* 1468 */     if (i < 0) {
/* 1469 */       this.c = true;
/* 1470 */       i = -i;
/*      */     } 
/* 1472 */     f(paramln, paramInt1, paramInt2, paramInt3, i);
/* 1473 */     bool = true;
/* 1474 */     this.c = false;
/*      */ 
/*      */ 
/*      */     
/* 1478 */     return bool;
/*      */   }
/*      */   
/*      */   public void a(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/* 1482 */     he he = he.a;
/*      */     
/* 1484 */     if (this.b >= 0) paramInt = this.b; 
/* 1485 */     int i = (paramInt & 0xF) << 4;
/* 1486 */     int j = paramInt & 0xF0;
/*      */     
/* 1488 */     double d1 = (i + paramln.bd * 16.0D) / 256.0D;
/* 1489 */     double d2 = (i + paramln.bg * 16.0D - 0.01D) / 256.0D;
/* 1490 */     double d3 = (j + paramln.bf * 16.0D) / 256.0D;
/* 1491 */     double d4 = (j + paramln.bi * 16.0D - 0.01D) / 256.0D;
/*      */     
/* 1493 */     if (paramln.bd < 0.0D || paramln.bg > 1.0D) {
/* 1494 */       d1 = ((i + 0.0F) / 256.0F);
/* 1495 */       d2 = ((i + 15.99F) / 256.0F);
/*      */     } 
/* 1497 */     if (paramln.bf < 0.0D || paramln.bi > 1.0D) {
/* 1498 */       d3 = ((j + 0.0F) / 256.0F);
/* 1499 */       d4 = ((j + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/* 1502 */     double d5 = paramDouble1 + paramln.bd;
/* 1503 */     double d6 = paramDouble1 + paramln.bg;
/* 1504 */     double d7 = paramDouble2 + paramln.be;
/* 1505 */     double d8 = paramDouble3 + paramln.bf;
/* 1506 */     double d9 = paramDouble3 + paramln.bi;
/*      */     
/* 1508 */     he.a(d5, d7, d9, d1, d4);
/* 1509 */     he.a(d5, d7, d8, d1, d3);
/* 1510 */     he.a(d6, d7, d8, d2, d3);
/* 1511 */     he.a(d6, d7, d9, d2, d4);
/*      */   }
/*      */   
/*      */   public void b(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/* 1515 */     he he = he.a;
/*      */     
/* 1517 */     if (this.b >= 0) paramInt = this.b; 
/* 1518 */     int i = (paramInt & 0xF) << 4;
/* 1519 */     int j = paramInt & 0xF0;
/*      */     
/* 1521 */     double d1 = (i + paramln.bd * 16.0D) / 256.0D;
/* 1522 */     double d2 = (i + paramln.bg * 16.0D - 0.01D) / 256.0D;
/* 1523 */     double d3 = (j + paramln.bf * 16.0D) / 256.0D;
/* 1524 */     double d4 = (j + paramln.bi * 16.0D - 0.01D) / 256.0D;
/*      */     
/* 1526 */     if (paramln.bd < 0.0D || paramln.bg > 1.0D) {
/* 1527 */       d1 = ((i + 0.0F) / 256.0F);
/* 1528 */       d2 = ((i + 15.99F) / 256.0F);
/*      */     } 
/* 1530 */     if (paramln.bf < 0.0D || paramln.bi > 1.0D) {
/* 1531 */       d3 = ((j + 0.0F) / 256.0F);
/* 1532 */       d4 = ((j + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/* 1535 */     double d5 = paramDouble1 + paramln.bd;
/* 1536 */     double d6 = paramDouble1 + paramln.bg;
/* 1537 */     double d7 = paramDouble2 + paramln.bh;
/* 1538 */     double d8 = paramDouble3 + paramln.bf;
/* 1539 */     double d9 = paramDouble3 + paramln.bi;
/*      */     
/* 1541 */     he.a(d6, d7, d9, d2, d4);
/* 1542 */     he.a(d6, d7, d8, d2, d3);
/* 1543 */     he.a(d5, d7, d8, d1, d3);
/* 1544 */     he.a(d5, d7, d9, d1, d4);
/*      */   }
/*      */   
/*      */   public void c(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/* 1548 */     he he = he.a;
/*      */     
/* 1550 */     if (this.b >= 0) paramInt = this.b; 
/* 1551 */     int i = (paramInt & 0xF) << 4;
/* 1552 */     int j = paramInt & 0xF0;
/*      */     
/* 1554 */     double d1 = (i + paramln.bd * 16.0D) / 256.0D;
/* 1555 */     double d2 = (i + paramln.bg * 16.0D - 0.01D) / 256.0D;
/* 1556 */     double d3 = (j + paramln.be * 16.0D) / 256.0D;
/* 1557 */     double d4 = (j + paramln.bh * 16.0D - 0.01D) / 256.0D;
/* 1558 */     if (this.c) {
/* 1559 */       double d = d1;
/* 1560 */       d1 = d2;
/* 1561 */       d2 = d;
/*      */     } 
/*      */     
/* 1564 */     if (paramln.bd < 0.0D || paramln.bg > 1.0D) {
/* 1565 */       d1 = ((i + 0.0F) / 256.0F);
/* 1566 */       d2 = ((i + 15.99F) / 256.0F);
/*      */     } 
/* 1568 */     if (paramln.be < 0.0D || paramln.bh > 1.0D) {
/* 1569 */       d3 = ((j + 0.0F) / 256.0F);
/* 1570 */       d4 = ((j + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/* 1573 */     double d5 = paramDouble1 + paramln.bd;
/* 1574 */     double d6 = paramDouble1 + paramln.bg;
/* 1575 */     double d7 = paramDouble2 + paramln.be;
/* 1576 */     double d8 = paramDouble2 + paramln.bh;
/* 1577 */     double d9 = paramDouble3 + paramln.bf;
/*      */     
/* 1579 */     he.a(d5, d8, d9, d2, d3);
/* 1580 */     he.a(d6, d8, d9, d1, d3);
/* 1581 */     he.a(d6, d7, d9, d1, d4);
/* 1582 */     he.a(d5, d7, d9, d2, d4);
/*      */   }
/*      */   
/*      */   public void d(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/* 1586 */     he he = he.a;
/*      */     
/* 1588 */     if (this.b >= 0) paramInt = this.b; 
/* 1589 */     int i = (paramInt & 0xF) << 4;
/* 1590 */     int j = paramInt & 0xF0;
/*      */     
/* 1592 */     double d1 = (i + paramln.bd * 16.0D) / 256.0D;
/* 1593 */     double d2 = (i + paramln.bg * 16.0D - 0.01D) / 256.0D;
/* 1594 */     double d3 = (j + paramln.be * 16.0D) / 256.0D;
/* 1595 */     double d4 = (j + paramln.bh * 16.0D - 0.01D) / 256.0D;
/* 1596 */     if (this.c) {
/* 1597 */       double d = d1;
/* 1598 */       d1 = d2;
/* 1599 */       d2 = d;
/*      */     } 
/*      */     
/* 1602 */     if (paramln.bd < 0.0D || paramln.bg > 1.0D) {
/* 1603 */       d1 = ((i + 0.0F) / 256.0F);
/* 1604 */       d2 = ((i + 15.99F) / 256.0F);
/*      */     } 
/* 1606 */     if (paramln.be < 0.0D || paramln.bh > 1.0D) {
/* 1607 */       d3 = ((j + 0.0F) / 256.0F);
/* 1608 */       d4 = ((j + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/* 1611 */     double d5 = paramDouble1 + paramln.bd;
/* 1612 */     double d6 = paramDouble1 + paramln.bg;
/* 1613 */     double d7 = paramDouble2 + paramln.be;
/* 1614 */     double d8 = paramDouble2 + paramln.bh;
/* 1615 */     double d9 = paramDouble3 + paramln.bi;
/*      */     
/* 1617 */     he.a(d5, d8, d9, d1, d3);
/* 1618 */     he.a(d5, d7, d9, d1, d4);
/* 1619 */     he.a(d6, d7, d9, d2, d4);
/* 1620 */     he.a(d6, d8, d9, d2, d3);
/*      */   }
/*      */   
/*      */   public void e(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/* 1624 */     he he = he.a;
/*      */     
/* 1626 */     if (this.b >= 0) paramInt = this.b; 
/* 1627 */     int i = (paramInt & 0xF) << 4;
/* 1628 */     int j = paramInt & 0xF0;
/*      */     
/* 1630 */     double d1 = (i + paramln.bf * 16.0D) / 256.0D;
/* 1631 */     double d2 = (i + paramln.bi * 16.0D - 0.01D) / 256.0D;
/* 1632 */     double d3 = (j + paramln.be * 16.0D) / 256.0D;
/* 1633 */     double d4 = (j + paramln.bh * 16.0D - 0.01D) / 256.0D;
/* 1634 */     if (this.c) {
/* 1635 */       double d = d1;
/* 1636 */       d1 = d2;
/* 1637 */       d2 = d;
/*      */     } 
/*      */     
/* 1640 */     if (paramln.bf < 0.0D || paramln.bi > 1.0D) {
/* 1641 */       d1 = ((i + 0.0F) / 256.0F);
/* 1642 */       d2 = ((i + 15.99F) / 256.0F);
/*      */     } 
/* 1644 */     if (paramln.be < 0.0D || paramln.bh > 1.0D) {
/* 1645 */       d3 = ((j + 0.0F) / 256.0F);
/* 1646 */       d4 = ((j + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/* 1649 */     double d5 = paramDouble1 + paramln.bd;
/* 1650 */     double d6 = paramDouble2 + paramln.be;
/* 1651 */     double d7 = paramDouble2 + paramln.bh;
/* 1652 */     double d8 = paramDouble3 + paramln.bf;
/* 1653 */     double d9 = paramDouble3 + paramln.bi;
/*      */     
/* 1655 */     he.a(d5, d7, d9, d2, d3);
/* 1656 */     he.a(d5, d7, d8, d1, d3);
/* 1657 */     he.a(d5, d6, d8, d1, d4);
/* 1658 */     he.a(d5, d6, d9, d2, d4);
/*      */   }
/*      */   
/*      */   public void f(ln paramln, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/* 1662 */     he he = he.a;
/*      */     
/* 1664 */     if (this.b >= 0) paramInt = this.b; 
/* 1665 */     int i = (paramInt & 0xF) << 4;
/* 1666 */     int j = paramInt & 0xF0;
/*      */     
/* 1668 */     double d1 = (i + paramln.bf * 16.0D) / 256.0D;
/* 1669 */     double d2 = (i + paramln.bi * 16.0D - 0.01D) / 256.0D;
/* 1670 */     double d3 = (j + paramln.be * 16.0D) / 256.0D;
/* 1671 */     double d4 = (j + paramln.bh * 16.0D - 0.01D) / 256.0D;
/* 1672 */     if (this.c) {
/* 1673 */       double d = d1;
/* 1674 */       d1 = d2;
/* 1675 */       d2 = d;
/*      */     } 
/*      */     
/* 1678 */     if (paramln.bf < 0.0D || paramln.bi > 1.0D) {
/* 1679 */       d1 = ((i + 0.0F) / 256.0F);
/* 1680 */       d2 = ((i + 15.99F) / 256.0F);
/*      */     } 
/* 1682 */     if (paramln.be < 0.0D || paramln.bh > 1.0D) {
/* 1683 */       d3 = ((j + 0.0F) / 256.0F);
/* 1684 */       d4 = ((j + 15.99F) / 256.0F);
/*      */     } 
/*      */     
/* 1687 */     double d5 = paramDouble1 + paramln.bg;
/* 1688 */     double d6 = paramDouble2 + paramln.be;
/* 1689 */     double d7 = paramDouble2 + paramln.bh;
/* 1690 */     double d8 = paramDouble3 + paramln.bf;
/* 1691 */     double d9 = paramDouble3 + paramln.bi;
/*      */     
/* 1693 */     he.a(d5, d6, d9, d1, d4);
/* 1694 */     he.a(d5, d6, d8, d2, d4);
/* 1695 */     he.a(d5, d7, d8, d2, d3);
/* 1696 */     he.a(d5, d7, d9, d1, d3);
/*      */   }
/*      */   
/*      */   public void a(ln paramln, float paramFloat) {
/* 1700 */     int i = paramln.f();
/* 1701 */     he he = he.a;
/*      */     
/* 1703 */     if (i == 0) {
/* 1704 */       paramln.e();
/* 1705 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 1706 */       float f1 = 0.5F;
/* 1707 */       float f2 = 1.0F;
/* 1708 */       float f3 = 0.8F;
/* 1709 */       float f4 = 0.6F;
/*      */       
/* 1711 */       he.b();
/* 1712 */       he.a(f2, f2, f2, paramFloat);
/* 1713 */       a(paramln, 0.0D, 0.0D, 0.0D, paramln.a(0));
/* 1714 */       he.a(f1, f1, f1, paramFloat);
/* 1715 */       b(paramln, 0.0D, 0.0D, 0.0D, paramln.a(1));
/* 1716 */       he.a(f3, f3, f3, paramFloat);
/* 1717 */       c(paramln, 0.0D, 0.0D, 0.0D, paramln.a(2));
/* 1718 */       d(paramln, 0.0D, 0.0D, 0.0D, paramln.a(3));
/* 1719 */       he.a(f4, f4, f4, paramFloat);
/* 1720 */       e(paramln, 0.0D, 0.0D, 0.0D, paramln.a(4));
/* 1721 */       f(paramln, 0.0D, 0.0D, 0.0D, paramln.a(5));
/*      */       
/* 1723 */       he.a();
/*      */       
/* 1725 */       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(ln paramln) {
/* 1730 */     byte b = -1;
/* 1731 */     he he = he.a;
/*      */     
/* 1733 */     int i = paramln.f();
/*      */     
/* 1735 */     if (i == 0) {
/* 1736 */       paramln.e();
/* 1737 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 1738 */       he.b();
/* 1739 */       he.b(0.0F, -1.0F, 0.0F);
/* 1740 */       a(paramln, 0.0D, 0.0D, 0.0D, paramln.a(0));
/* 1741 */       he.a();
/*      */       
/* 1743 */       he.b();
/* 1744 */       he.b(0.0F, 1.0F, 0.0F);
/* 1745 */       b(paramln, 0.0D, 0.0D, 0.0D, paramln.a(1));
/* 1746 */       he.a();
/*      */       
/* 1748 */       he.b();
/* 1749 */       he.b(0.0F, 0.0F, -1.0F);
/* 1750 */       c(paramln, 0.0D, 0.0D, 0.0D, paramln.a(2));
/* 1751 */       he.a();
/*      */       
/* 1753 */       he.b();
/* 1754 */       he.b(0.0F, 0.0F, 1.0F);
/* 1755 */       d(paramln, 0.0D, 0.0D, 0.0D, paramln.a(3));
/* 1756 */       he.a();
/*      */       
/* 1758 */       he.b();
/* 1759 */       he.b(-1.0F, 0.0F, 0.0F);
/* 1760 */       e(paramln, 0.0D, 0.0D, 0.0D, paramln.a(4));
/* 1761 */       he.a();
/*      */       
/* 1763 */       he.b();
/* 1764 */       he.b(1.0F, 0.0F, 0.0F);
/* 1765 */       f(paramln, 0.0D, 0.0D, 0.0D, paramln.a(5));
/* 1766 */       he.a();
/*      */       
/* 1768 */       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 1769 */     } else if (i == 1) {
/* 1770 */       he.b();
/* 1771 */       he.b(0.0F, -1.0F, 0.0F);
/* 1772 */       a(paramln, b, -0.5D, -0.5D, -0.5D);
/* 1773 */       he.a();
/* 1774 */     } else if (i == 13) {
/* 1775 */       paramln.e();
/* 1776 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 1777 */       float f = 0.0625F;
/* 1778 */       he.b();
/* 1779 */       he.b(0.0F, -1.0F, 0.0F);
/* 1780 */       a(paramln, 0.0D, 0.0D, 0.0D, paramln.a(0));
/* 1781 */       he.a();
/*      */       
/* 1783 */       he.b();
/* 1784 */       he.b(0.0F, 1.0F, 0.0F);
/* 1785 */       b(paramln, 0.0D, 0.0D, 0.0D, paramln.a(1));
/* 1786 */       he.a();
/*      */       
/* 1788 */       he.b();
/* 1789 */       he.b(0.0F, 0.0F, -1.0F);
/* 1790 */       he.c(0.0F, 0.0F, f);
/* 1791 */       c(paramln, 0.0D, 0.0D, 0.0D, paramln.a(2));
/* 1792 */       he.c(0.0F, 0.0F, -f);
/* 1793 */       he.a();
/*      */       
/* 1795 */       he.b();
/* 1796 */       he.b(0.0F, 0.0F, 1.0F);
/* 1797 */       he.c(0.0F, 0.0F, -f);
/* 1798 */       d(paramln, 0.0D, 0.0D, 0.0D, paramln.a(3));
/* 1799 */       he.c(0.0F, 0.0F, f);
/* 1800 */       he.a();
/*      */       
/* 1802 */       he.b();
/* 1803 */       he.b(-1.0F, 0.0F, 0.0F);
/* 1804 */       he.c(f, 0.0F, 0.0F);
/* 1805 */       e(paramln, 0.0D, 0.0D, 0.0D, paramln.a(4));
/* 1806 */       he.c(-f, 0.0F, 0.0F);
/* 1807 */       he.a();
/*      */       
/* 1809 */       he.b();
/* 1810 */       he.b(1.0F, 0.0F, 0.0F);
/* 1811 */       he.c(-f, 0.0F, 0.0F);
/* 1812 */       f(paramln, 0.0D, 0.0D, 0.0D, paramln.a(5));
/* 1813 */       he.c(f, 0.0F, 0.0F);
/* 1814 */       he.a();
/*      */       
/* 1816 */       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 1817 */     } else if (i == 6) {
/* 1818 */       he.b();
/* 1819 */       he.b(0.0F, -1.0F, 0.0F);
/* 1820 */       b(paramln, b, -0.5D, -0.5D, -0.5D);
/* 1821 */       he.a();
/* 1822 */     } else if (i == 2) {
/* 1823 */       he.b();
/* 1824 */       he.b(0.0F, -1.0F, 0.0F);
/* 1825 */       a(paramln, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D);
/* 1826 */       he.a();
/* 1827 */     } else if (i == 10) {
/* 1828 */       for (byte b1 = 0; b1 < 2; b1++) {
/* 1829 */         if (b1 == 0) paramln.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F); 
/* 1830 */         if (b1 == 1) paramln.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
/*      */         
/* 1832 */         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 1833 */         he.b();
/* 1834 */         he.b(0.0F, -1.0F, 0.0F);
/* 1835 */         a(paramln, 0.0D, 0.0D, 0.0D, paramln.a(0));
/* 1836 */         he.a();
/*      */         
/* 1838 */         he.b();
/* 1839 */         he.b(0.0F, 1.0F, 0.0F);
/* 1840 */         b(paramln, 0.0D, 0.0D, 0.0D, paramln.a(1));
/* 1841 */         he.a();
/*      */         
/* 1843 */         he.b();
/* 1844 */         he.b(0.0F, 0.0F, -1.0F);
/* 1845 */         c(paramln, 0.0D, 0.0D, 0.0D, paramln.a(2));
/* 1846 */         he.a();
/*      */         
/* 1848 */         he.b();
/* 1849 */         he.b(0.0F, 0.0F, 1.0F);
/* 1850 */         d(paramln, 0.0D, 0.0D, 0.0D, paramln.a(3));
/* 1851 */         he.a();
/*      */         
/* 1853 */         he.b();
/* 1854 */         he.b(-1.0F, 0.0F, 0.0F);
/* 1855 */         e(paramln, 0.0D, 0.0D, 0.0D, paramln.a(4));
/* 1856 */         he.a();
/*      */         
/* 1858 */         he.b();
/* 1859 */         he.b(1.0F, 0.0F, 0.0F);
/* 1860 */         f(paramln, 0.0D, 0.0D, 0.0D, paramln.a(5));
/* 1861 */         he.a();
/*      */         
/* 1863 */         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */       } 
/* 1865 */       paramln.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean a(int paramInt) {
/* 1870 */     if (paramInt == 0) return true; 
/* 1871 */     if (paramInt == 13) return true; 
/* 1872 */     if (paramInt == 10) return true; 
/* 1873 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */