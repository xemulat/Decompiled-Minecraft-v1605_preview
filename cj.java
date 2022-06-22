/*      */ import java.io.DataInputStream;
/*      */ import java.io.DataOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.TreeSet;
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
/*      */ public class cj
/*      */   implements mz
/*      */ {
/*   30 */   private List w = new ArrayList();
/*   31 */   public List a = new ArrayList();
/*   32 */   private List x = new ArrayList();
/*      */ 
/*      */   
/*   35 */   private TreeSet y = new TreeSet();
/*   36 */   private Set z = new HashSet();
/*      */   
/*   38 */   public List b = new ArrayList();
/*      */   
/*   40 */   public long c = 0L;
/*      */   
/*      */   public boolean d = false;
/*   43 */   private long A = 8961023L;
/*   44 */   private long B = 12638463L;
/*      */   
/*   46 */   private long C = 16777215L;
/*   47 */   public int e = 0;
/*      */   
/*   49 */   protected int f = (new Random()).nextInt();
/*   50 */   protected int g = 1013904223;
/*      */   
/*      */   public boolean h = false;
/*      */   
/*   54 */   public static float[] i = new float[16];
/*      */   
/*   56 */   private final long D = System.currentTimeMillis();
/*      */   
/*      */   static {
/*   59 */     float f = 0.05F;
/*   60 */     for (byte b = 0; b <= 15; b++) {
/*   61 */       float f1 = 1.0F - b / 15.0F;
/*   62 */       i[b] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*   68 */   public List j = new ArrayList();
/*      */   public int k;
/*      */   public Object l;
/*   71 */   public Random m = new Random(); public int n;
/*      */   public int o;
/*      */   public int p;
/*      */   public boolean q = false;
/*   75 */   private List E = new ArrayList();
/*      */   
/*      */   private as F;
/*      */   
/*      */   private File G;
/*   80 */   public long r = 0L;
/*      */   private hc H;
/*   82 */   public long s = 0L; public final String t; public boolean u; private ArrayList I; private Set J; private int K;
/*      */   private List L;
/*      */   public boolean v;
/*      */   
/*      */   public static hc a(File paramFile, String paramString) {
/*   87 */     File file1 = new File(paramFile, "saves");
/*   88 */     File file2 = new File(file1, paramString);
/*   89 */     if (!file2.exists()) return null;
/*      */     
/*   91 */     File file3 = new File(file2, "level.dat");
/*   92 */     if (file3.exists()) {
/*      */       try {
/*   94 */         hc hc1 = w.a(new FileInputStream(file3));
/*   95 */         return hc1.k("Data");
/*      */       }
/*   97 */       catch (Exception exception) {
/*   98 */         exception.printStackTrace();
/*      */       } 
/*      */     }
/*  101 */     return null;
/*      */   }
/*      */   
/*      */   public static void b(File paramFile, String paramString) {
/*  105 */     File file1 = new File(paramFile, "saves");
/*  106 */     File file2 = new File(file1, paramString);
/*  107 */     if (!file2.exists())
/*      */       return; 
/*  109 */     a(file2.listFiles());
/*  110 */     file2.delete();
/*      */   }
/*      */   
/*      */   private static void a(File[] paramArrayOfFile) {
/*  114 */     for (byte b = 0; b < paramArrayOfFile.length; b++) {
/*  115 */       if (paramArrayOfFile[b].isDirectory()) {
/*  116 */         a(paramArrayOfFile[b].listFiles());
/*      */       }
/*  118 */       paramArrayOfFile[b].delete();
/*      */     } 
/*      */   }
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
/*      */   public cj(File paramFile, String paramString) {
/*  143 */     this(paramFile, paramString, (new Random()).nextLong());
/*      */   }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected as a(File paramFile) {
/*  222 */     return new fk(this, new kt(paramFile, true), new nj(this, this.r));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/*  228 */     if (this.o <= 0) this.o = 64; 
/*  229 */     while (g(this.n, this.p) == 0) {
/*  230 */       this.n += this.m.nextInt(8) - this.m.nextInt(8);
/*  231 */       this.p += this.m.nextInt(8) - this.m.nextInt(8);
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean f(int paramInt1, int paramInt2) {
/*  236 */     int i = g(paramInt1, paramInt2);
/*      */     
/*  238 */     if (i != ln.E.ba) return false; 
/*  239 */     return true;
/*      */   }
/*      */   
/*      */   private int g(int paramInt1, int paramInt2) {
/*  243 */     byte b = 63;
/*  244 */     while (a(paramInt1, b + 1, paramInt2) != 0) {
/*  245 */       b++;
/*      */     }
/*  247 */     return a(paramInt1, b, paramInt2);
/*      */   }
/*      */   
/*      */   public void a(dg paramdg) {
/*      */     try {
/*  252 */       if (this.H != null) {
/*  253 */         paramdg.e(this.H);
/*  254 */         this.H = null;
/*      */       } 
/*  256 */       a(paramdg);
/*  257 */     } catch (Exception exception) {
/*  258 */       exception.printStackTrace();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(boolean paramBoolean, nh paramnh) {
/*  263 */     if (!this.F.b())
/*      */       return; 
/*  265 */     if (paramnh != null) paramnh.b("Saving level"); 
/*  266 */     m();
/*      */     
/*  268 */     if (paramnh != null) paramnh.d("Saving chunks"); 
/*  269 */     this.F.a(paramBoolean, paramnh);
/*      */   }
/*      */   
/*      */   private void m() {
/*  273 */     l();
/*      */     
/*  275 */     hc hc1 = new hc();
/*  276 */     hc1.a("RandomSeed", this.r);
/*  277 */     hc1.a("SpawnX", this.n);
/*  278 */     hc1.a("SpawnY", this.o);
/*  279 */     hc1.a("SpawnZ", this.p);
/*  280 */     hc1.a("Time", this.c);
/*  281 */     hc1.a("SizeOnDisk", this.s);
/*  282 */     hc1.a("SnowCovered", this.d);
/*  283 */     hc1.a("LastPlayed", System.currentTimeMillis());
/*      */     
/*  285 */     dg dg = null;
/*  286 */     if (this.j.size() > 0) dg = this.j.get(0); 
/*  287 */     if (dg != null) {
/*  288 */       hc hc3 = new hc();
/*  289 */       dg.d(hc3);
/*  290 */       hc1.a("Player", hc3);
/*      */     } 
/*      */     
/*  293 */     hc hc2 = new hc();
/*  294 */     hc2.a("Data", hc1);
/*      */     
/*      */     try {
/*  297 */       File file1 = new File(this.G, "level.dat_new");
/*  298 */       File file2 = new File(this.G, "level.dat_old");
/*  299 */       File file3 = new File(this.G, "level.dat");
/*      */       
/*  301 */       w.a(hc2, new FileOutputStream(file1));
/*      */       
/*  303 */       if (file2.exists()) file2.delete(); 
/*  304 */       file3.renameTo(file2);
/*  305 */       if (file3.exists()) file3.delete(); 
/*  306 */       file1.renameTo(file3);
/*  307 */       if (file1.exists()) file1.delete(); 
/*  308 */     } catch (Exception exception) {
/*  309 */       exception.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt) {
/*  315 */     if (!this.F.b()) return true; 
/*  316 */     if (paramInt == 0) m(); 
/*  317 */     return this.F.a(false, (nh)null);
/*      */   }
/*      */   
/*      */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/*  321 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  322 */       return 0;
/*      */     }
/*  324 */     if (paramInt2 < 0) return 0; 
/*  325 */     if (paramInt2 >= 128) return 0; 
/*  326 */     return b(paramInt1 >> 4, paramInt3 >> 4).a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3) {
/*  330 */     if (paramInt2 < 0 || paramInt2 >= 128) return false; 
/*  331 */     return h(paramInt1 >> 4, paramInt3 >> 4);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  335 */     if (paramInt5 < 0 || paramInt2 >= 128) return false;
/*      */     
/*  337 */     paramInt1 >>= 4;
/*  338 */     paramInt2 >>= 4;
/*  339 */     paramInt3 >>= 4;
/*  340 */     paramInt4 >>= 4;
/*  341 */     paramInt5 >>= 4;
/*  342 */     paramInt6 >>= 4;
/*      */     
/*  344 */     for (int i = paramInt1; i <= paramInt4; i++) {
/*  345 */       for (int j = paramInt3; j <= paramInt6; j++) {
/*  346 */         if (!h(i, j)) return false; 
/*      */       } 
/*  348 */     }  return true;
/*      */   }
/*      */   
/*      */   private boolean h(int paramInt1, int paramInt2) {
/*  352 */     return this.F.a(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public fr a(int paramInt1, int paramInt2) {
/*  356 */     return b(paramInt1 >> 4, paramInt2 >> 4);
/*      */   }
/*      */   
/*      */   public fr b(int paramInt1, int paramInt2) {
/*  360 */     return this.F.b(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  364 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  365 */       return false;
/*      */     }
/*  367 */     if (paramInt2 < 0) return false; 
/*  368 */     if (paramInt2 >= 128) return false; 
/*  369 */     fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  370 */     return fr.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4, paramInt5);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  374 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  375 */       return false;
/*      */     }
/*  377 */     if (paramInt2 < 0) return false; 
/*  378 */     if (paramInt2 >= 128) return false; 
/*  379 */     fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  380 */     return fr.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4);
/*      */   }
/*      */   
/*      */   public fs f(int paramInt1, int paramInt2, int paramInt3) {
/*  384 */     int i = a(paramInt1, paramInt2, paramInt3);
/*  385 */     if (i == 0) return fs.a; 
/*  386 */     return (ln.n[i]).bl;
/*      */   }
/*      */   
/*      */   public int e(int paramInt1, int paramInt2, int paramInt3) {
/*  390 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  391 */       return 0;
/*      */     }
/*  393 */     if (paramInt2 < 0) return 0; 
/*  394 */     if (paramInt2 >= 128) return 0; 
/*  395 */     fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  396 */     paramInt1 &= 0xF;
/*  397 */     paramInt3 &= 0xF;
/*  398 */     return fr.b(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  402 */     c(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  406 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  407 */       return false;
/*      */     }
/*  409 */     if (paramInt2 < 0) return false; 
/*  410 */     if (paramInt2 >= 128) return false; 
/*  411 */     fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  412 */     paramInt1 &= 0xF;
/*  413 */     paramInt3 &= 0xF;
/*  414 */     fr.b(paramInt1, paramInt2, paramInt3, paramInt4);
/*  415 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  419 */     if (a(paramInt1, paramInt2, paramInt3, paramInt4)) {
/*  420 */       e(paramInt1, paramInt2, paramInt3, paramInt4);
/*  421 */       return true;
/*      */     } 
/*  423 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  427 */     if (a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5)) {
/*      */ 
/*      */       
/*  430 */       e(paramInt1, paramInt2, paramInt3, paramInt4);
/*  431 */       return true;
/*      */     } 
/*  433 */     return false;
/*      */   }
/*      */   
/*      */   public void h(int paramInt1, int paramInt2, int paramInt3) {
/*  437 */     for (byte b = 0; b < this.E.size(); b++) {
/*  438 */       ((ic)this.E.get(b)).a(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  443 */     h(paramInt1, paramInt2, paramInt3);
/*  444 */     g(paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  448 */     if (paramInt3 > paramInt4) {
/*  449 */       int i = paramInt4;
/*  450 */       paramInt4 = paramInt3;
/*  451 */       paramInt3 = i;
/*      */     } 
/*  453 */     b(paramInt1, paramInt3, paramInt2, paramInt1, paramInt4, paramInt2);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  457 */     for (byte b = 0; b < this.E.size(); b++) {
/*  458 */       ((ic)this.E.get(b)).b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*      */     }
/*      */   }
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
/*      */   public void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  476 */     l(paramInt1 - 1, paramInt2, paramInt3, paramInt4);
/*  477 */     l(paramInt1 + 1, paramInt2, paramInt3, paramInt4);
/*  478 */     l(paramInt1, paramInt2 - 1, paramInt3, paramInt4);
/*  479 */     l(paramInt1, paramInt2 + 1, paramInt3, paramInt4);
/*  480 */     l(paramInt1, paramInt2, paramInt3 - 1, paramInt4);
/*  481 */     l(paramInt1, paramInt2, paramInt3 + 1, paramInt4);
/*      */   }
/*      */   
/*      */   private void l(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  485 */     if (this.h || this.v)
/*  486 */       return;  ln ln = ln.n[a(paramInt1, paramInt2, paramInt3)];
/*  487 */     if (ln != null) ln.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   
/*      */   }
/*      */   
/*      */   public boolean i(int paramInt1, int paramInt2, int paramInt3) {
/*  492 */     return b(paramInt1 >> 4, paramInt3 >> 4).c(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public int j(int paramInt1, int paramInt2, int paramInt3) {
/*  496 */     return a(paramInt1, paramInt2, paramInt3, true);
/*      */   }
/*      */   
/*      */   public int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  500 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  501 */       return 15;
/*      */     }
/*      */     
/*  504 */     if (paramBoolean) {
/*  505 */       int i = a(paramInt1, paramInt2, paramInt3);
/*  506 */       if (i == ln.ak.ba || i == ln.aA.ba) {
/*  507 */         int j = a(paramInt1, paramInt2 + 1, paramInt3, false);
/*  508 */         int k = a(paramInt1 + 1, paramInt2, paramInt3, false);
/*  509 */         int m = a(paramInt1 - 1, paramInt2, paramInt3, false);
/*  510 */         int n = a(paramInt1, paramInt2, paramInt3 + 1, false);
/*  511 */         int i1 = a(paramInt1, paramInt2, paramInt3 - 1, false);
/*  512 */         if (k > j) j = k; 
/*  513 */         if (m > j) j = m; 
/*  514 */         if (n > j) j = n; 
/*  515 */         if (i1 > j) j = i1; 
/*  516 */         return j;
/*      */       } 
/*      */     } 
/*      */     
/*  520 */     if (paramInt2 < 0) return 0; 
/*  521 */     if (paramInt2 >= 128) {
/*  522 */       int i = 15 - this.e;
/*  523 */       if (i < 0) i = 0; 
/*  524 */       return i;
/*      */     } 
/*      */     
/*  527 */     fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  528 */     paramInt1 &= 0xF;
/*  529 */     paramInt3 &= 0xF;
/*  530 */     return fr.c(paramInt1, paramInt2, paramInt3, this.e);
/*      */   }
/*      */   
/*      */   public boolean k(int paramInt1, int paramInt2, int paramInt3) {
/*  534 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  535 */       return false;
/*      */     }
/*  537 */     if (paramInt2 < 0) return false; 
/*  538 */     if (paramInt2 >= 128) return true; 
/*  539 */     if (!h(paramInt1 >> 4, paramInt3 >> 4)) return false;
/*      */     
/*  541 */     fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  542 */     paramInt1 &= 0xF;
/*  543 */     paramInt3 &= 0xF;
/*  544 */     return fr.c(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public int c(int paramInt1, int paramInt2) {
/*  548 */     if (paramInt1 < -32000000 || paramInt2 < -32000000 || paramInt1 >= 32000000 || paramInt2 > 32000000) {
/*  549 */       return 0;
/*      */     }
/*  551 */     if (!h(paramInt1 >> 4, paramInt2 >> 4)) return 0;
/*      */     
/*  553 */     fr fr = b(paramInt1 >> 4, paramInt2 >> 4);
/*  554 */     return fr.b(paramInt1 & 0xF, paramInt2 & 0xF);
/*      */   }
/*      */   
/*      */   public void a(bu parambu, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  558 */     if (!d(paramInt1, paramInt2, paramInt3))
/*      */       return; 
/*  560 */     if (parambu == bu.a) {
/*  561 */       if (k(paramInt1, paramInt2, paramInt3)) paramInt4 = 15; 
/*  562 */     } else if (parambu == bu.b) {
/*  563 */       int i = a(paramInt1, paramInt2, paramInt3);
/*  564 */       if (ln.s[i] > paramInt4) paramInt4 = ln.s[i];
/*      */     
/*      */     } 
/*  567 */     if (a(parambu, paramInt1, paramInt2, paramInt3) != paramInt4) {
/*  568 */       a(parambu, paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public int a(bu parambu, int paramInt1, int paramInt2, int paramInt3) {
/*  573 */     if (paramInt2 < 0 || paramInt2 >= 128 || paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*  574 */       return parambu.c;
/*      */     }
/*  576 */     int i = paramInt1 >> 4;
/*  577 */     int j = paramInt3 >> 4;
/*  578 */     if (!h(i, j)) return 0; 
/*  579 */     fr fr = b(i, j);
/*  580 */     return fr.a(parambu, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public void b(bu parambu, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  584 */     if (paramInt1 < -32000000 || paramInt3 < -32000000 || paramInt1 >= 32000000 || paramInt3 > 32000000) {
/*      */       return;
/*      */     }
/*  587 */     if (paramInt2 < 0)
/*  588 */       return;  if (paramInt2 >= 128)
/*  589 */       return;  if (!h(paramInt1 >> 4, paramInt3 >> 4))
/*  590 */       return;  fr fr = b(paramInt1 >> 4, paramInt3 >> 4);
/*  591 */     fr.a(parambu, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4);
/*  592 */     for (byte b = 0; b < this.E.size(); b++) {
/*  593 */       ((ic)this.E.get(b)).a(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public float c(int paramInt1, int paramInt2, int paramInt3) {
/*  598 */     return i[j(paramInt1, paramInt2, paramInt3)];
/*      */   }
/*      */   
/*      */   public boolean b() {
/*  602 */     return (this.e < 4);
/*      */   }
/*      */   
/*      */   public lv a(ah paramah1, ah paramah2) {
/*  606 */     return a(paramah1, paramah2, false);
/*      */   }
/*      */   
/*      */   public lv a(ah paramah1, ah paramah2, boolean paramBoolean) {
/*  610 */     if (Double.isNaN(paramah1.a) || Double.isNaN(paramah1.b) || Double.isNaN(paramah1.c)) return null; 
/*  611 */     if (Double.isNaN(paramah2.a) || Double.isNaN(paramah2.b) || Double.isNaN(paramah2.c)) return null;
/*      */     
/*  613 */     int i = ei.b(paramah2.a);
/*  614 */     int j = ei.b(paramah2.b);
/*  615 */     int k = ei.b(paramah2.c);
/*      */     
/*  617 */     int m = ei.b(paramah1.a);
/*  618 */     int n = ei.b(paramah1.b);
/*  619 */     int i1 = ei.b(paramah1.c);
/*      */     
/*  621 */     byte b = 20;
/*  622 */     while (b-- >= 0) {
/*  623 */       if (Double.isNaN(paramah1.a) || Double.isNaN(paramah1.b) || Double.isNaN(paramah1.c)) return null; 
/*  624 */       if (m == i && n == j && i1 == k) return null;
/*      */       
/*  626 */       double d1 = 999.0D;
/*  627 */       double d2 = 999.0D;
/*  628 */       double d3 = 999.0D;
/*      */       
/*  630 */       if (i > m) d1 = m + 1.0D; 
/*  631 */       if (i < m) d1 = m + 0.0D;
/*      */       
/*  633 */       if (j > n) d2 = n + 1.0D; 
/*  634 */       if (j < n) d2 = n + 0.0D;
/*      */       
/*  636 */       if (k > i1) d3 = i1 + 1.0D; 
/*  637 */       if (k < i1) d3 = i1 + 0.0D;
/*      */       
/*  639 */       double d4 = 999.0D;
/*  640 */       double d5 = 999.0D;
/*  641 */       double d6 = 999.0D;
/*      */       
/*  643 */       double d7 = paramah2.a - paramah1.a;
/*  644 */       double d8 = paramah2.b - paramah1.b;
/*  645 */       double d9 = paramah2.c - paramah1.c;
/*      */       
/*  647 */       if (d1 != 999.0D) d4 = (d1 - paramah1.a) / d7; 
/*  648 */       if (d2 != 999.0D) d5 = (d2 - paramah1.b) / d8; 
/*  649 */       if (d3 != 999.0D) d6 = (d3 - paramah1.c) / d9;
/*      */       
/*  651 */       byte b1 = 0;
/*  652 */       if (d4 < d5 && d4 < d6) {
/*  653 */         if (i > m) { b1 = 4; }
/*  654 */         else { b1 = 5; }
/*      */         
/*  656 */         paramah1.a = d1;
/*  657 */         paramah1.b += d8 * d4;
/*  658 */         paramah1.c += d9 * d4;
/*  659 */       } else if (d5 < d6) {
/*  660 */         if (j > n) { b1 = 0; }
/*  661 */         else { b1 = 1; }
/*      */         
/*  663 */         paramah1.a += d7 * d5;
/*  664 */         paramah1.b = d2;
/*  665 */         paramah1.c += d9 * d5;
/*      */       } else {
/*  667 */         if (k > i1) { b1 = 2; }
/*  668 */         else { b1 = 3; }
/*      */         
/*  670 */         paramah1.a += d7 * d6;
/*  671 */         paramah1.b += d8 * d6;
/*  672 */         paramah1.c = d3;
/*      */       } 
/*      */       
/*  675 */       ah ah1 = ah.b(paramah1.a, paramah1.b, paramah1.c);
/*  676 */       m = (int)(ah1.a = ei.b(paramah1.a));
/*  677 */       if (b1 == 5) {
/*  678 */         m--;
/*  679 */         ah1.a++;
/*      */       } 
/*  681 */       n = (int)(ah1.b = ei.b(paramah1.b));
/*  682 */       if (b1 == 1) {
/*  683 */         n--;
/*  684 */         ah1.b++;
/*      */       } 
/*  686 */       i1 = (int)(ah1.c = ei.b(paramah1.c));
/*  687 */       if (b1 == 3) {
/*  688 */         i1--;
/*  689 */         ah1.c++;
/*      */       } 
/*      */       
/*  692 */       int i2 = a(m, n, i1);
/*  693 */       int i3 = e(m, n, i1);
/*  694 */       ln ln = ln.n[i2];
/*  695 */       if (i2 > 0 && ln.a(i3, paramBoolean)) {
/*  696 */         lv lv = ln.a(this, m, n, i1, paramah1, paramah2);
/*  697 */         if (lv != null) return lv;
/*      */       
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  708 */     return null;
/*      */   }
/*      */   
/*      */   public void a(jx paramjx, String paramString, float paramFloat1, float paramFloat2) {
/*  712 */     for (byte b = 0; b < this.E.size(); b++) {
/*  713 */       ((ic)this.E.get(b)).a(paramString, paramjx.ah, paramjx.ai - paramjx.ay, paramjx.aj, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2) {
/*  718 */     for (byte b = 0; b < this.E.size(); b++) {
/*  719 */       ((ic)this.E.get(b)).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  724 */     for (byte b = 0; b < this.E.size(); b++) {
/*  725 */       ((ic)this.E.get(b)).a(paramString, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  733 */     for (byte b = 0; b < this.E.size(); b++)
/*  734 */       ((ic)this.E.get(b)).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6); 
/*      */   }
/*      */   
/*      */   public boolean a(jx paramjx) {
/*  738 */     int i = ei.b(paramjx.ah / 16.0D);
/*  739 */     int j = ei.b(paramjx.aj / 16.0D);
/*      */     
/*  741 */     boolean bool = false;
/*  742 */     if (paramjx instanceof dg) {
/*  743 */       bool = true;
/*      */     }
/*      */     
/*  746 */     if (bool || h(i, j)) {
/*  747 */       if (paramjx instanceof dg) {
/*  748 */         this.j.add((dg)paramjx);
/*  749 */         System.out.println("Player count: " + this.j.size());
/*      */       } 
/*  751 */       b(i, j).a(paramjx);
/*  752 */       this.a.add(paramjx);
/*  753 */       b(paramjx);
/*  754 */       return true;
/*      */     } 
/*  756 */     return false;
/*      */   }
/*      */   
/*      */   protected void b(jx paramjx) {
/*  760 */     for (byte b = 0; b < this.E.size(); b++) {
/*  761 */       ((ic)this.E.get(b)).a(paramjx);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void c(jx paramjx) {
/*  766 */     for (byte b = 0; b < this.E.size(); b++) {
/*  767 */       ((ic)this.E.get(b)).b(paramjx);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(jx paramjx) {
/*  772 */     paramjx.D();
/*  773 */     if (paramjx instanceof dg) {
/*  774 */       this.j.remove(paramjx);
/*  775 */       System.out.println("Player count: " + this.j.size());
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(ic paramic) {
/*  780 */     this.E.add(paramic);
/*      */   }
/*      */   
/*      */   public void b(ic paramic) {
/*  784 */     this.E.remove(paramic);
/*      */   }
/*      */   
/*  787 */   public cj(String paramString) { this.I = new ArrayList();
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
/* 1331 */     this.J = new HashSet();
/*      */     
/* 1333 */     this.K = this.m.nextInt(12000);
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
/* 1450 */     this.L = new ArrayList();
/* 1451 */     this.v = false; this.t = paramString; this.F = a(this.G); f(); } public cj(File paramFile, String paramString, long paramLong) { this.I = new ArrayList(); this.J = new HashSet(); this.K = this.m.nextInt(12000); this.L = new ArrayList(); this.v = false; this.t = paramString; paramFile.mkdirs(); this.G = new File(paramFile, paramString); this.G.mkdirs(); try { File file1 = new File(this.G, "session.lock"); DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file1)); try { dataOutputStream.writeLong(this.D); } finally { dataOutputStream.close(); }  } catch (IOException iOException) { throw new RuntimeException("Failed to check session lock, aborting"); }  File file = new File(this.G, "level.dat"); this.q = !file.exists(); if (file.exists()) { try { hc hc1 = w.a(new FileInputStream(file)); hc hc2 = hc1.k("Data"); this.r = hc2.f("RandomSeed"); this.n = hc2.e("SpawnX"); this.o = hc2.e("SpawnY"); this.p = hc2.e("SpawnZ"); this.c = hc2.f("Time"); this.s = hc2.f("SizeOnDisk"); this.d = hc2.m("SnowCovered"); if (hc2.b("Player")) this.H = hc2.k("Player");  } catch (Exception exception) { exception.printStackTrace(); }  } else { this.d = (this.m.nextInt(4) == 0); }  boolean bool = false; if (this.r == 0L) { this.r = paramLong; bool = true; }  this.F = a(this.G); if (bool) { this.u = true; this.n = 0; this.o = 64; this.p = 0; while (!f(this.n, this.p)) { this.n += this.m.nextInt(64) - this.m.nextInt(64); this.p += this.m.nextInt(64) - this.m.nextInt(64); }  this.u = false; }  f(); }
/*      */   public List a(jx paramjx, cb paramcb) { this.I.clear(); int i = ei.b(paramcb.a); int j = ei.b(paramcb.d + 1.0D); int k = ei.b(paramcb.b); int m = ei.b(paramcb.e + 1.0D); int n = ei.b(paramcb.c); int i1 = ei.b(paramcb.f + 1.0D); for (int i2 = i; i2 < j; i2++) { for (int i3 = n; i3 < i1; i3++) { if (d(i2, 64, i3)) for (int i4 = k - 1; i4 < m; i4++) { ln ln = ln.n[a(i2, i4, i3)]; if (ln != null) ln.a(this, i2, i4, i3, paramcb, this.I);  }   }  }  double d = 0.25D; List<jx> list = b(paramjx, paramcb.b(d, d, d)); for (byte b = 0; b < list.size(); b++) { cb cb1 = ((jx)list.get(b)).f_(); if (cb1 != null && cb1.a(paramcb)) this.I.add(cb1);  cb1 = paramjx.b_(list.get(b)); if (cb1 != null && cb1.a(paramcb)) this.I.add(cb1);  }  return this.I; }
/*      */   public int a(float paramFloat) { float f1 = c(paramFloat); float f2 = 1.0F - ei.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F; if (f2 < 0.0F) f2 = 0.0F;  if (f2 > 1.0F) f2 = 1.0F;  return (int)(f2 * 11.0F); }
/* 1454 */   public ah b(float paramFloat) { float f1 = c(paramFloat); float f2 = ei.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F; if (f2 < 0.0F) f2 = 0.0F;  if (f2 > 1.0F) f2 = 1.0F;  float f3 = (float)(this.A >> 16L & 0xFFL) / 255.0F; float f4 = (float)(this.A >> 8L & 0xFFL) / 255.0F; float f5 = (float)(this.A & 0xFFL) / 255.0F; f3 *= f2; f4 *= f2; f5 *= f2; return ah.b(f3, f4, f5); } public float c(float paramFloat) { int i = (int)(this.c % 24000L); float f1 = (i + paramFloat) / 24000.0F - 0.25F; if (f1 < 0.0F) f1++;  if (f1 > 1.0F) f1--;  float f2 = f1; f1 = 1.0F - (float)((Math.cos(f1 * Math.PI) + 1.0D) / 2.0D); f1 = f2 + (f1 - f2) / 3.0F; return f1; } public ah d(float paramFloat) { float f1 = c(paramFloat); float f2 = ei.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F; if (f2 < 0.0F) f2 = 0.0F;  if (f2 > 1.0F) f2 = 1.0F;  float f3 = (float)(this.C >> 16L & 0xFFL) / 255.0F; float f4 = (float)(this.C >> 8L & 0xFFL) / 255.0F; float f5 = (float)(this.C & 0xFFL) / 255.0F; f3 *= f2 * 0.9F + 0.1F; f4 *= f2 * 0.9F + 0.1F; f5 *= f2 * 0.85F + 0.15F; return ah.b(f3, f4, f5); } public ah e(float paramFloat) { float f1 = c(paramFloat); float f2 = ei.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F; if (f2 < 0.0F) f2 = 0.0F;  if (f2 > 1.0F) f2 = 1.0F;  float f3 = (float)(this.B >> 16L & 0xFFL) / 255.0F; float f4 = (float)(this.B >> 8L & 0xFFL) / 255.0F; float f5 = (float)(this.B & 0xFFL) / 255.0F; f3 *= f2 * 0.94F + 0.06F; f4 *= f2 * 0.94F + 0.06F; f5 *= f2 * 0.91F + 0.09F; return ah.b(f3, f4, f5); } public int d(int paramInt1, int paramInt2) { fr fr = a(paramInt1, paramInt2); byte b = 127; paramInt1 &= 0xF; paramInt2 &= 0xF; while (b > 0) { int i = fr.a(paramInt1, b, paramInt2); if (i == 0 || (!(ln.n[i]).bl.c() && !(ln.n[i]).bl.d())) { b--; continue; }  return b + 1; }  return -1; } public int e(int paramInt1, int paramInt2) { return a(paramInt1, paramInt2).b(paramInt1 & 0xF, paramInt2 & 0xF); } public float f(float paramFloat) { float f1 = c(paramFloat); float f2 = 1.0F - ei.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.75F; if (f2 < 0.0F) f2 = 0.0F;  if (f2 > 1.0F) f2 = 1.0F;  return f2 * f2 * 0.5F; } public void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { iw iw = new iw(paramInt1, paramInt2, paramInt3, paramInt4); byte b = 8; if (a(paramInt1 - b, paramInt2 - b, paramInt3 - b, paramInt1 + b, paramInt2 + b, paramInt3 + b)) { if (paramInt4 > 0) iw.a(ln.n[paramInt4].a() + this.c);  if (!this.z.contains(iw)) { this.z.add(iw); this.y.add(iw); }  }  } public void c() { this.a.removeAll(this.x); byte b; for (b = 0; b < this.x.size(); b++) { jx jx = this.x.get(b); int i = jx.aX; int j = jx.aZ; if (jx.aW && h(i, j)) b(i, j).b(jx);  }  for (b = 0; b < this.x.size(); b++) c(this.x.get(b));  this.x.clear(); for (b = 0; b < this.a.size(); b++) { jx jx = this.a.get(b); if (jx.ac != null) if (jx.ac.ax || jx.ac.ab != jx) { jx.ac.ab = null; jx.ac = null; } else { continue; }   if (!jx.ax) e(jx);  if (jx.ax) { int i = jx.aX; int j = jx.aZ; if (jx.aW && h(i, j)) b(i, j).b(jx);  this.a.remove(b--); c(jx); }  continue; }  for (b = 0; b < this.b.size(); b++) { ht ht = this.b.get(b); ht.k_(); }  } protected void e(jx paramjx) { int i = ei.b(paramjx.ah); int j = ei.b(paramjx.aj); byte b = 16; if (!a(i - b, 0, j - b, i + b, 128, j + b)) return;  paramjx.aF = paramjx.ah; paramjx.aG = paramjx.ai; paramjx.aH = paramjx.aj; paramjx.ap = paramjx.an; paramjx.aq = paramjx.ao; if (paramjx.ac != null) { paramjx.n(); } else { paramjx.e_(); }  int k = ei.b(paramjx.ah / 16.0D); int m = ei.b(paramjx.ai / 16.0D); int n = ei.b(paramjx.aj / 16.0D); if (!paramjx.aW || paramjx.aX != k || paramjx.aY != m || paramjx.aZ != n) { if (paramjx.aW && h(paramjx.aX, paramjx.aZ)) b(paramjx.aX, paramjx.aZ).a(paramjx, paramjx.aY);  if (h(k, n)) { b(k, n).a(paramjx); } else { paramjx.aW = false; System.out.println("Removing entity because it's not in a chunk!!"); paramjx.D(); }  }  if (paramjx.ab != null) if (paramjx.ab.ax || paramjx.ab.ac != paramjx) { paramjx.ab.ac = null; paramjx.ab = null; } else { e(paramjx.ab); }   if (Double.isNaN(paramjx.ah) || Double.isInfinite(paramjx.ah)) paramjx.ah = paramjx.aF;  if (Double.isNaN(paramjx.ai) || Double.isInfinite(paramjx.ai)) paramjx.ai = paramjx.aG;  if (Double.isNaN(paramjx.aj) || Double.isInfinite(paramjx.aj)) paramjx.aj = paramjx.aH;  if (Double.isNaN(paramjx.ao) || Double.isInfinite(paramjx.ao)) paramjx.ao = paramjx.aq;  if (Double.isNaN(paramjx.an) || Double.isInfinite(paramjx.an)) paramjx.an = paramjx.ap;  } public boolean a(cb paramcb) { List<jx> list = b((jx)null, paramcb); for (byte b = 0; b < list.size(); b++) { jx jx = list.get(b); if (!jx.ax && jx.aa) return false;  }  return true; } public boolean b(cb paramcb) { int i = ei.b(paramcb.a); int j = ei.b(paramcb.d + 1.0D); int k = ei.b(paramcb.b); int m = ei.b(paramcb.e + 1.0D); int n = ei.b(paramcb.c); int i1 = ei.b(paramcb.f + 1.0D); if (paramcb.a < 0.0D) i--;  if (paramcb.b < 0.0D) k--;  if (paramcb.c < 0.0D) n--;  for (int i2 = i; i2 < j; i2++) { for (int i3 = k; i3 < m; i3++) { for (int i4 = n; i4 < i1; i4++) { ln ln = ln.n[a(i2, i3, i4)]; if (ln != null && ln.bl.d()) return true;  }  }  }  return false; } public boolean c(cb paramcb) { int i = ei.b(paramcb.a); int j = ei.b(paramcb.d + 1.0D); int k = ei.b(paramcb.b); int m = ei.b(paramcb.e + 1.0D); int n = ei.b(paramcb.c); int i1 = ei.b(paramcb.f + 1.0D); for (int i2 = i; i2 < j; i2++) { for (int i3 = k; i3 < m; i3++) { for (int i4 = n; i4 < i1; i4++) { int i5 = a(i2, i3, i4); if (i5 == ln.ar.ba || i5 == ln.C.ba || i5 == ln.D.ba) return true;  }  }  }  return false; } public boolean a(cb paramcb, fs paramfs, jx paramjx) { int i = ei.b(paramcb.a); int j = ei.b(paramcb.d + 1.0D); int k = ei.b(paramcb.b); int m = ei.b(paramcb.e + 1.0D); int n = ei.b(paramcb.c); int i1 = ei.b(paramcb.f + 1.0D); boolean bool = false; ah ah = ah.b(0.0D, 0.0D, 0.0D); for (int i2 = i; i2 < j; i2++) { for (int i3 = k; i3 < m; i3++) { for (int i4 = n; i4 < i1; i4++) { ln ln = ln.n[a(i2, i3, i4)]; if (ln != null && ln.bl == paramfs) { double d = ((i3 + 1) - jf.b(e(i2, i3, i4))); if (m >= d) { bool = true; ln.a(this, i2, i3, i4, paramjx, ah); }  }  }  }  }  if (ah.c() > 0.0D) { ah = ah.b(); double d = 0.004D; paramjx.ak += ah.a * d; paramjx.al += ah.b * d; paramjx.am += ah.c * d; }  return bool; } public boolean a(cb paramcb, fs paramfs) { int i = ei.b(paramcb.a); int j = ei.b(paramcb.d + 1.0D); int k = ei.b(paramcb.b); int m = ei.b(paramcb.e + 1.0D); int n = ei.b(paramcb.c); int i1 = ei.b(paramcb.f + 1.0D); for (int i2 = i; i2 < j; i2++) { for (int i3 = k; i3 < m; i3++) { for (int i4 = n; i4 < i1; i4++) { ln ln = ln.n[a(i2, i3, i4)]; if (ln != null && ln.bl == paramfs) return true;  }  }  }  return false; } public boolean b(cb paramcb, fs paramfs) { int i = ei.b(paramcb.a); int j = ei.b(paramcb.d + 1.0D); int k = ei.b(paramcb.b); int m = ei.b(paramcb.e + 1.0D); int n = ei.b(paramcb.c); int i1 = ei.b(paramcb.f + 1.0D); for (int i2 = i; i2 < j; i2++) { for (int i3 = k; i3 < m; i3++) { for (int i4 = n; i4 < i1; i4++) { ln ln = ln.n[a(i2, i3, i4)]; if (ln != null && ln.bl == paramfs) { int i5 = e(i2, i3, i4); double d = (i3 + 1); if (i5 < 8) d = (i3 + 1) - i5 / 8.0D;  if (d >= paramcb.b) return true;  }  }  }  }  return false; } public List b(jx paramjx, cb paramcb) { this.L.clear();
/* 1455 */     int i = ei.b((paramcb.a - 2.0D) / 16.0D);
/* 1456 */     int j = ei.b((paramcb.d + 2.0D) / 16.0D);
/* 1457 */     int k = ei.b((paramcb.c - 2.0D) / 16.0D);
/* 1458 */     int m = ei.b((paramcb.f + 2.0D) / 16.0D);
/* 1459 */     for (int n = i; n <= j; n++) {
/* 1460 */       for (int i1 = k; i1 <= m; i1++) {
/* 1461 */         if (h(n, i1))
/* 1462 */           b(n, i1).a(paramjx, paramcb, this.L); 
/*      */       } 
/*      */     } 
/* 1465 */     return this.L; }
/*      */   public void a(jx paramjx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) { (new iv()).a(this, paramjx, paramDouble1, paramDouble2, paramDouble3, paramFloat); }
/*      */   public float a(ah paramah, cb paramcb) { double d1 = 1.0D / ((paramcb.d - paramcb.a) * 2.0D + 1.0D); double d2 = 1.0D / ((paramcb.e - paramcb.b) * 2.0D + 1.0D); double d3 = 1.0D / ((paramcb.f - paramcb.c) * 2.0D + 1.0D); byte b1 = 0; byte b2 = 0; float f; for (f = 0.0F; f <= 1.0F; f = (float)(f + d1)) { float f1; for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d2)) { float f2; for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d3)) { double d4 = paramcb.a + (paramcb.d - paramcb.a) * f; double d5 = paramcb.b + (paramcb.e - paramcb.b) * f1; double d6 = paramcb.c + (paramcb.f - paramcb.c) * f2; if (a(ah.b(d4, d5, d6), paramah) == null) b1++;  b2++; }  }  }  return b1 / b2; }
/*      */   public void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (paramInt4 == 0) paramInt2--;  if (paramInt4 == 1) paramInt2++;  if (paramInt4 == 2) paramInt3--;  if (paramInt4 == 3) paramInt3++;  if (paramInt4 == 4) paramInt1--;  if (paramInt4 == 5) paramInt1++;  if (a(paramInt1, paramInt2, paramInt3) == ln.ar.ba) { a((paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), "random.fizz", 0.5F, 2.6F + (this.m.nextFloat() - this.m.nextFloat()) * 0.8F); d(paramInt1, paramInt2, paramInt3, 0); }  }
/* 1469 */   public jx a(Class paramClass) { return null; } public String d() { return "All: " + this.a.size(); } public ht b(int paramInt1, int paramInt2, int paramInt3) { fr fr = b(paramInt1 >> 4, paramInt3 >> 4); if (fr != null) return fr.d(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);  return null; } public void a(int paramInt1, int paramInt2, int paramInt3, ht paramht) { fr fr = b(paramInt1 >> 4, paramInt3 >> 4); if (fr != null) fr.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramht);  } public void l(int paramInt1, int paramInt2, int paramInt3) { fr fr = b(paramInt1 >> 4, paramInt3 >> 4); if (fr != null) fr.e(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);  } public boolean g(int paramInt1, int paramInt2, int paramInt3) { ln ln = ln.n[a(paramInt1, paramInt2, paramInt3)]; if (ln == null) return false;  return ln.b(); } public void a(nh paramnh) { a(true, paramnh); } public boolean e() { char c = 'Ϩ'; while (this.w.size() > 0) { if (--c <= '\000') return true;  ((kc)this.w.remove(this.w.size() - 1)).a(this); }  return false; } public void a(bu parambu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { a(parambu, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, true); } public void a(bu parambu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean) { int i = (paramInt4 + paramInt1) / 2; int j = (paramInt6 + paramInt3) / 2; if (!d(i, 64, j)) return;  int k = this.w.size(); if (paramBoolean) { int m = 4; if (m > k) m = k;  for (byte b = 0; b < m; b++) { kc kc = this.w.get(this.w.size() - b - 1); if (kc.a == parambu && kc.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6)) return;  }  }  this.w.add(new kc(parambu, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6)); if (this.w.size() > 100000) while (this.w.size() > 50000) e();   } public void f() { int i = a(1.0F); if (i != this.e) this.e = i;  } public void g() { this.F.a(); int i = a(1.0F); if (i != this.e) { this.e = i; for (byte b = 0; b < this.E.size(); b++) ((ic)this.E.get(b)).e();  }  this.c++; if (this.c % 4L == 0L) a(false, (nh)null);  a(false); h(); } protected void h() { this.J.clear(); for (byte b = 0; b < this.j.size(); b++) { dg dg = this.j.get(b); int i = ei.b(dg.ah / 16.0D); int j = ei.b(dg.aj / 16.0D); byte b1 = 9; for (byte b2 = -b1; b2 <= b1; b2++) { for (byte b3 = -b1; b3 <= b1; b3++) this.J.add(new nx(b2 + i, b3 + j));  }  }  if (this.K > 0) this.K--;  for (nx nx : this.J) { int i = nx.a * 16; int j = nx.b * 16; fr fr = b(nx.a, nx.b); if (this.K == 0) { this.f = this.f * 3 + this.g; int k = this.f >> 2; int m = k & 0xF; int n = k >> 8 & 0xF; int i1 = k >> 16 & 0x7F; int i2 = fr.a(m, i1, n); m += i; n += j; if (i2 == 0 && j(m, i1, n) <= this.m.nextInt(8) && a(bu.a, m, i1, n) <= 0) { dg dg = a(m + 0.5D, i1 + 0.5D, n + 0.5D, 8.0D); if (dg != null && dg.d(m + 0.5D, i1 + 0.5D, n + 0.5D) > 4.0D) { a(m + 0.5D, i1 + 0.5D, n + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.m.nextFloat() * 0.2F); this.K = this.m.nextInt(12000) + 6000; }  }  }  if (this.d && this.m.nextInt(4) == 0) { this.f = this.f * 3 + this.g; int k = this.f >> 2; int m = k & 0xF; int n = k >> 8 & 0xF; int i1 = d(m + i, n + j); if (i1 >= 0 && i1 < 128 && fr.a(bu.b, m, i1, n) < 10) { int i2 = fr.a(m, i1 - 1, n); if (fr.a(m, i1, n) == 0 && i2 != 0 && i2 != ln.aT.ba && (ln.n[i2]).bl.c()) d(m + i, i1, n + j, ln.aS.ba);  if (i2 == ln.B.ba && fr.b(m, i1 - 1, n) == 0) d(m + i, i1 - 1, n + j, ln.aT.ba);  }  }  for (byte b1 = 0; b1 < 80; b1++) { this.f = this.f * 3 + this.g; int k = this.f >> 2; int m = k & 0xF; int n = k >> 8 & 0xF; int i1 = k >> 16 & 0x7F; byte b2 = fr.b[m << 11 | n << 7 | i1]; if (ln.o[b2]) ln.n[b2].a(this, m + i, i1, n + j, this.m);  }  }  } public boolean a(boolean paramBoolean) { int i = this.y.size(); if (i != this.z.size()) throw new IllegalStateException("TickNextTick list out of synch");  if (i > 1000) i = 1000;  for (byte b = 0; b < i; b++) { iw iw = this.y.first(); if (!paramBoolean && iw.e > this.c) break;  this.y.remove(iw); this.z.remove(iw); byte b1 = 8; if (a(iw.a - b1, iw.b - b1, iw.c - b1, iw.a + b1, iw.b + b1, iw.c + b1)) { int j = a(iw.a, iw.b, iw.c); if (j == iw.d && j > 0) ln.n[j].a(this, iw.a, iw.b, iw.c, this.m);  }  }  return (this.y.size() != 0); } public void m(int paramInt1, int paramInt2, int paramInt3) { byte b1 = 16; Random random = new Random(); for (byte b2 = 0; b2 < 'Ϩ'; b2++) { int i = paramInt1 + this.m.nextInt(b1) - this.m.nextInt(b1); int j = paramInt2 + this.m.nextInt(b1) - this.m.nextInt(b1); int k = paramInt3 + this.m.nextInt(b1) - this.m.nextInt(b1); int m = a(i, j, k); if (m > 0) ln.n[m].b(this, i, j, k, random);  }  } public List a(Class paramClass, cb paramcb) { int i = ei.b((paramcb.a - 2.0D) / 16.0D);
/* 1470 */     int j = ei.b((paramcb.d + 2.0D) / 16.0D);
/* 1471 */     int k = ei.b((paramcb.c - 2.0D) / 16.0D);
/* 1472 */     int m = ei.b((paramcb.f + 2.0D) / 16.0D);
/* 1473 */     ArrayList arrayList = new ArrayList();
/* 1474 */     for (int n = i; n <= j; n++) {
/* 1475 */       for (int i1 = k; i1 <= m; i1++) {
/* 1476 */         if (h(n, i1))
/* 1477 */           b(n, i1).a(paramClass, paramcb, arrayList); 
/*      */       } 
/*      */     } 
/* 1480 */     return arrayList; }
/*      */ 
/*      */ 
/*      */   
/*      */   public List i() {
/* 1485 */     return this.a;
/*      */   }
/*      */   
/*      */   public void n(int paramInt1, int paramInt2, int paramInt3) {
/* 1489 */     if (d(paramInt1, paramInt2, paramInt3)) {
/* 1490 */       a(paramInt1, paramInt3).f();
/*      */     }
/*      */   }
/*      */   
/*      */   public int b(Class paramClass) {
/* 1495 */     byte b1 = 0;
/* 1496 */     for (byte b2 = 0; b2 < this.a.size(); b2++) {
/* 1497 */       jx jx = this.a.get(b2);
/* 1498 */       if (paramClass.isAssignableFrom(jx.getClass())) b1++; 
/*      */     } 
/* 1500 */     return b1;
/*      */   }
/*      */   
/*      */   public void a(List<jx> paramList) {
/* 1504 */     this.a.addAll(paramList);
/* 1505 */     for (byte b = 0; b < paramList.size(); b++) {
/* 1506 */       b(paramList.get(b));
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(List paramList) {
/* 1511 */     this.x.addAll(paramList);
/*      */   }
/*      */   
/*      */   public void j() {
/* 1515 */     while (this.F.a());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/* 1520 */     int i = a(paramInt2, paramInt3, paramInt4);
/* 1521 */     ln ln1 = ln.n[i];
/*      */     
/* 1523 */     ln ln2 = ln.n[paramInt1];
/*      */     
/* 1525 */     cb cb = ln2.d(this, paramInt2, paramInt3, paramInt4);
/* 1526 */     if (paramBoolean) cb = null; 
/* 1527 */     if (cb != null && !a(cb)) return false; 
/* 1528 */     if (ln1 == ln.A || ln1 == ln.B || ln1 == ln.C || ln1 == ln.D || ln1 == ln.ar || ln1 == ln.aS) return true; 
/* 1529 */     if (paramInt1 > 0 && ln1 == null && 
/* 1530 */       ln2.a(this, paramInt2, paramInt3, paramInt4)) {
/* 1531 */       return true;
/*      */     }
/*      */     
/* 1534 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bh a(jx paramjx1, jx paramjx2, float paramFloat) {
/* 1542 */     int i = ei.b(paramjx1.ah);
/* 1543 */     int j = ei.b(paramjx1.ai);
/* 1544 */     int k = ei.b(paramjx1.aj);
/*      */     
/* 1546 */     int m = (int)(paramFloat + 16.0F);
/* 1547 */     int n = i - m;
/* 1548 */     int i1 = j - m;
/* 1549 */     int i2 = k - m;
/* 1550 */     int i3 = i + m;
/* 1551 */     int i4 = j + m;
/* 1552 */     int i5 = k + m;
/* 1553 */     ce ce = new ce(this, n, i1, i2, i3, i4, i5);
/* 1554 */     return (new cu(ce)).a(paramjx1, paramjx2, paramFloat);
/*      */   }
/*      */   
/*      */   public bh a(jx paramjx, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/* 1558 */     int i = ei.b(paramjx.ah);
/* 1559 */     int j = ei.b(paramjx.ai);
/* 1560 */     int k = ei.b(paramjx.aj);
/*      */     
/* 1562 */     int m = (int)(paramFloat + 8.0F);
/* 1563 */     int n = i - m;
/* 1564 */     int i1 = j - m;
/* 1565 */     int i2 = k - m;
/* 1566 */     int i3 = i + m;
/* 1567 */     int i4 = j + m;
/* 1568 */     int i5 = k + m;
/* 1569 */     ce ce = new ce(this, n, i1, i2, i3, i4, i5);
/* 1570 */     return (new cu(ce)).a(paramjx, paramInt1, paramInt2, paramInt3, paramFloat);
/*      */   }
/*      */   
/*      */   public boolean j(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1574 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 1575 */     if (i == 0) return false; 
/* 1576 */     return ln.n[i].c(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean o(int paramInt1, int paramInt2, int paramInt3) {
/* 1580 */     if (j(paramInt1, paramInt2 - 1, paramInt3, 0)) return true; 
/* 1581 */     if (j(paramInt1, paramInt2 + 1, paramInt3, 1)) return true; 
/* 1582 */     if (j(paramInt1, paramInt2, paramInt3 - 1, 2)) return true; 
/* 1583 */     if (j(paramInt1, paramInt2, paramInt3 + 1, 3)) return true; 
/* 1584 */     if (j(paramInt1 - 1, paramInt2, paramInt3, 4)) return true; 
/* 1585 */     if (j(paramInt1 + 1, paramInt2, paramInt3, 5)) return true; 
/* 1586 */     return false;
/*      */   }
/*      */   
/*      */   public boolean k(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1590 */     if (g(paramInt1, paramInt2, paramInt3)) {
/* 1591 */       return o(paramInt1, paramInt2, paramInt3);
/*      */     }
/* 1593 */     int i = a(paramInt1, paramInt2, paramInt3);
/* 1594 */     if (i == 0) return false; 
/* 1595 */     return ln.n[i].b(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean p(int paramInt1, int paramInt2, int paramInt3) {
/* 1599 */     if (k(paramInt1, paramInt2 - 1, paramInt3, 0)) return true; 
/* 1600 */     if (k(paramInt1, paramInt2 + 1, paramInt3, 1)) return true; 
/* 1601 */     if (k(paramInt1, paramInt2, paramInt3 - 1, 2)) return true; 
/* 1602 */     if (k(paramInt1, paramInt2, paramInt3 + 1, 3)) return true; 
/* 1603 */     if (k(paramInt1 - 1, paramInt2, paramInt3, 4)) return true; 
/* 1604 */     if (k(paramInt1 + 1, paramInt2, paramInt3, 5)) return true; 
/* 1605 */     return false;
/*      */   }
/*      */   
/*      */   public dg a(jx paramjx, double paramDouble) {
/* 1609 */     return a(paramjx.ah, paramjx.ai, paramjx.aj, paramDouble);
/*      */   }
/*      */   
/*      */   public dg a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 1613 */     double d = -1.0D;
/* 1614 */     dg dg = null;
/* 1615 */     for (byte b = 0; b < this.j.size(); b++) {
/* 1616 */       dg dg1 = this.j.get(b);
/* 1617 */       double d1 = dg1.d(paramDouble1, paramDouble2, paramDouble3);
/* 1618 */       if ((paramDouble4 < 0.0D || d1 < paramDouble4 * paramDouble4) && (d == -1.0D || d1 < d)) {
/* 1619 */         d = d1;
/* 1620 */         dg = dg1;
/*      */       } 
/*      */     } 
/* 1623 */     return dg;
/*      */   }
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
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfbyte) {
/* 1657 */     int i = paramInt1 >> 4;
/* 1658 */     int j = paramInt3 >> 4;
/* 1659 */     int k = paramInt1 + paramInt4 - 1 >> 4;
/* 1660 */     int m = paramInt3 + paramInt6 - 1 >> 4;
/*      */     
/* 1662 */     int n = 0;
/*      */     
/* 1664 */     int i1 = paramInt2;
/* 1665 */     int i2 = paramInt2 + paramInt5;
/* 1666 */     if (i1 < 0) i1 = 0; 
/* 1667 */     if (i2 > 128) i2 = 128; 
/* 1668 */     for (int i3 = i; i3 <= k; i3++) {
/* 1669 */       int i4 = paramInt1 - i3 * 16;
/* 1670 */       int i5 = paramInt1 + paramInt4 - i3 * 16;
/* 1671 */       if (i4 < 0) i4 = 0; 
/* 1672 */       if (i5 > 16) i5 = 16; 
/* 1673 */       for (int i6 = j; i6 <= m; i6++) {
/* 1674 */         int i7 = paramInt3 - i6 * 16;
/* 1675 */         int i8 = paramInt3 + paramInt6 - i6 * 16;
/* 1676 */         if (i7 < 0) i7 = 0; 
/* 1677 */         if (i8 > 16) i8 = 16; 
/* 1678 */         n = b(i3, i6).a(paramArrayOfbyte, i4, i1, i7, i5, i2, i8, n);
/* 1679 */         b(i3 * 16 + i4, i1, i6 * 16 + i7, i3 * 16 + i5, i2, i6 * 16 + i8);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {}
/*      */   
/*      */   public void l() {
/*      */     try {
/* 1689 */       File file = new File(this.G, "session.lock");
/* 1690 */       DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
/*      */       try {
/* 1692 */         if (dataInputStream.readLong() != this.D) {
/* 1693 */           throw new lm("The save is being accessed from another location, aborting");
/*      */         }
/*      */       } finally {
/* 1696 */         dataInputStream.close();
/*      */       } 
/* 1698 */     } catch (IOException iOException) {
/* 1699 */       throw new lm("Failed to check session lock, aborting");
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */