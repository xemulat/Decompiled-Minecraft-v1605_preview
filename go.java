/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Socket;
/*     */ import java.net.URL;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
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
/*     */ public class go
/*     */   extends kq
/*     */ {
/*     */   private boolean c = false;
/*     */   private hy d;
/*     */   public String a;
/*     */   private Minecraft e;
/*     */   private gj f;
/*     */   private boolean g = false;
/*     */   Random b;
/*     */   
/*     */   public void a() {
/*  34 */     if (this.c)
/*     */       return; 
/*  36 */     this.d.a();
/*     */   }
/*     */   
/*     */   public void a(hf paramhf) {
/*  40 */     this.e.b = new mw(this.e, this);
/*     */     
/*  42 */     this.f = new gj(this);
/*  43 */     this.f.v = true;
/*  44 */     this.e.a(this.f);
/*  45 */     this.e.a(new db(this));
/*     */   }
/*     */   
/*     */   public void a(gq paramgq) {
/*  49 */     double d1 = paramgq.b / 32.0D;
/*  50 */     double d2 = paramgq.c / 32.0D;
/*  51 */     double d3 = paramgq.d / 32.0D;
/*  52 */     dr dr = new dr(this.f, d1, d2, d3, new eo(paramgq.h, paramgq.i));
/*  53 */     dr.ak = paramgq.e / 128.0D;
/*  54 */     dr.al = paramgq.f / 128.0D;
/*  55 */     dr.am = paramgq.g / 128.0D;
/*  56 */     dr.ba = paramgq.b;
/*  57 */     dr.bb = paramgq.c;
/*  58 */     dr.bc = paramgq.d;
/*     */     
/*  60 */     this.f.a(paramgq.a, dr);
/*     */   }
/*     */   public void a(jz paramjz) {
/*     */     cx cx;
/*  64 */     double d1 = paramjz.b / 32.0D;
/*  65 */     double d2 = paramjz.c / 32.0D;
/*  66 */     double d3 = paramjz.d / 32.0D;
/*     */ 
/*     */ 
/*     */     
/*  70 */     no no = null;
/*  71 */     if (paramjz.e == 10) no = new no(this.f, d1, d2, d3, 0); 
/*  72 */     if (paramjz.e == 11) no = new no(this.f, d1, d2, d3, 1); 
/*  73 */     if (paramjz.e == 12) no = new no(this.f, d1, d2, d3, 2); 
/*  74 */     if (paramjz.e == 1) cx = new cx(this.f, d1, d2, d3); 
/*  75 */     if (cx != null) {
/*  76 */       cx.ba = paramjz.b;
/*  77 */       cx.bb = paramjz.c;
/*  78 */       cx.bc = paramjz.d;
/*  79 */       cx.an = 0.0F;
/*  80 */       cx.ao = 0.0F;
/*  81 */       cx.Z = paramjz.a;
/*  82 */       this.f.a(paramjz.a, cx);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(gg paramgg) {
/*  87 */     double d1 = paramgg.c / 32.0D;
/*  88 */     double d2 = paramgg.d / 32.0D;
/*  89 */     double d3 = paramgg.e / 32.0D;
/*  90 */     float f1 = (paramgg.f * 360) / 256.0F;
/*  91 */     float f2 = (paramgg.g * 360) / 256.0F;
/*  92 */     ng ng = new ng(this.e.e, paramgg.b);
/*  93 */     ng.ba = paramgg.c;
/*  94 */     ng.bb = paramgg.d;
/*  95 */     ng.bc = paramgg.e;
/*     */     
/*  97 */     int i = paramgg.h;
/*  98 */     if (i == 0) {
/*  99 */       ng.b.a[ng.b.d] = null;
/*     */     } else {
/* 101 */       ng.b.a[ng.b.d] = new eo(i);
/*     */     } 
/* 103 */     ng.b(d1, d2, d3, f1, f2);
/* 104 */     this.f.a(paramgg.a, ng);
/*     */   }
/*     */   
/*     */   public void a(jb paramjb) {
/* 108 */     jx jx = this.f.b(paramjb.a);
/* 109 */     if (jx == null)
/* 110 */       return;  jx.ba = paramjb.b;
/* 111 */     jx.bb = paramjb.c;
/* 112 */     jx.bc = paramjb.d;
/* 113 */     double d1 = jx.ba / 32.0D;
/* 114 */     double d2 = jx.bb / 32.0D;
/* 115 */     double d3 = jx.bc / 32.0D;
/* 116 */     float f1 = (paramjb.e * 360) / 256.0F;
/* 117 */     float f2 = (paramjb.f * 360) / 256.0F;
/* 118 */     jx.a(d1, d2, d3, f1, f2, 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(lf paramlf) {
/* 123 */     jx jx = this.f.b(paramlf.a);
/* 124 */     if (jx == null)
/* 125 */       return;  jx.ba += paramlf.b;
/* 126 */     jx.bb += paramlf.c;
/* 127 */     jx.bc += paramlf.d;
/* 128 */     double d1 = jx.ba / 32.0D;
/* 129 */     double d2 = jx.bb / 32.0D;
/* 130 */     double d3 = jx.bc / 32.0D;
/* 131 */     float f1 = paramlf.g ? ((paramlf.e * 360) / 256.0F) : jx.an;
/* 132 */     float f2 = paramlf.g ? ((paramlf.f * 360) / 256.0F) : jx.ao;
/* 133 */     jx.a(d1, d2, d3, f1, f2, 3);
/*     */   }
/*     */   
/*     */   public void a(jj paramjj) {
/* 137 */     this.f.c(paramjj.a);
/*     */   }
/*     */   
/*     */   public void a(eb parameb) {
/* 141 */     be be = this.e.g;
/*     */     
/* 143 */     double d1 = be.ah;
/* 144 */     double d2 = be.ai;
/* 145 */     double d3 = be.aj;
/* 146 */     float f1 = be.an;
/* 147 */     float f2 = be.ao;
/*     */     
/* 149 */     if (parameb.h) {
/* 150 */       d1 = parameb.a;
/* 151 */       d2 = parameb.b;
/* 152 */       d3 = parameb.c;
/*     */     } 
/* 154 */     if (parameb.i) {
/* 155 */       f1 = parameb.e;
/* 156 */       f2 = parameb.f;
/*     */     } 
/*     */     
/* 159 */     be.aI = 0.0F;
/* 160 */     be.ak = be.al = be.am = 0.0D;
/* 161 */     be.b(d1, d2, d3, f1, f2);
/* 162 */     parameb.a = be.ah;
/* 163 */     parameb.b = be.ar.b;
/* 164 */     parameb.c = be.aj;
/* 165 */     parameb.d = be.ai;
/* 166 */     this.d.a(parameb);
/* 167 */     if (!this.g) {
/* 168 */       this.e.g.ae = this.e.g.ah;
/* 169 */       this.e.g.af = this.e.g.ai;
/* 170 */       this.e.g.ag = this.e.g.aj;
/* 171 */       this.g = true;
/* 172 */       this.e.a(null);
/*     */     } 
/*     */   }
/*     */   
/* 176 */   public go(Minecraft paramMinecraft, String paramString, int paramInt) { this.b = new Random();
/*     */     this.e = paramMinecraft;
/*     */     Socket socket = new Socket(InetAddress.getByName(paramString), paramInt);
/* 179 */     this.d = new hy(socket, "Client", this); } public void a(jq paramjq) { this.f.a(paramjq.a, paramjq.b, paramjq.c); }
/*     */ 
/*     */   
/*     */   public void a(mn parammn) {
/* 183 */     fr fr = this.f.b(parammn.a, parammn.b);
/* 184 */     int i = parammn.a * 16;
/* 185 */     int j = parammn.b * 16;
/* 186 */     for (byte b = 0; b < parammn.f; b++) {
/* 187 */       short s = parammn.c[b];
/* 188 */       int k = parammn.d[b] & 0xFF;
/* 189 */       byte b1 = parammn.e[b];
/*     */ 
/*     */       
/* 192 */       int m = s >> 12 & 0xF;
/* 193 */       int n = s >> 8 & 0xF;
/* 194 */       int i1 = s & 0xFF;
/*     */ 
/*     */       
/* 197 */       fr.a(m, i1, n, k, b1);
/* 198 */       this.f.c(m + i, i1, n + j, m + i, i1, n + j);
/* 199 */       this.f.b(m + i, i1, n + j, m + i, i1, n + j);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bv parambv) {
/* 204 */     this.f.c(parambv.a, parambv.b, parambv.c, parambv.a + parambv.d - 1, parambv.b + parambv.e - 1, parambv.c + parambv.f - 1);
/* 205 */     this.f.a(parambv.a, parambv.b, parambv.c, parambv.d, parambv.e, parambv.f, parambv.g);
/*     */   }
/*     */   
/*     */   public void a(kx paramkx) {
/* 209 */     this.f.c(paramkx.a, paramkx.b, paramkx.c, paramkx.d, paramkx.e);
/*     */   }
/*     */   
/*     */   public void a(nt paramnt) {
/* 213 */     this.d.a("Got kicked");
/* 214 */     this.c = true;
/* 215 */     this.e.a(null);
/* 216 */     this.e.a(new cf("Disconnected by server", paramnt.a));
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 220 */     if (this.c)
/* 221 */       return;  this.c = true;
/* 222 */     this.e.a(null);
/* 223 */     this.e.a(new cf("Connection lost", paramString));
/*     */   }
/*     */   
/*     */   public void a(fd paramfd) {
/* 227 */     if (this.c)
/* 228 */       return;  this.d.a(paramfd);
/*     */   }
/*     */   
/*     */   public void a(bi parambi) {
/* 232 */     dr dr = (dr)this.f.b(parambi.a);
/* 233 */     fv fv = (fv)this.f.b(parambi.b);
/* 234 */     if (fv == null) {
/* 235 */       fv = this.e.g;
/*     */     }
/* 237 */     if (dr != null) {
/* 238 */       this.f.a(dr, "random.pop", 0.2F, ((this.b.nextFloat() - this.b.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*     */       
/* 240 */       this.e.h.a(new ca(this.e.e, dr, fv, -0.5F));
/* 241 */       this.f.c(parambi.a);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dt paramdt) {
/* 246 */     jx jx = this.f.b(paramdt.a);
/* 247 */     if (jx == null)
/* 248 */       return;  dg dg = (dg)jx;
/* 249 */     int i = paramdt.b;
/* 250 */     if (i == 0) {
/* 251 */       dg.b.a[dg.b.d] = null;
/*     */     } else {
/* 253 */       dg.b.a[dg.b.d] = new eo(i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(hz paramhz) {
/* 258 */     this.e.u.a(paramhz.a);
/*     */   }
/*     */   
/*     */   public void a(gv paramgv) {
/* 262 */     jx jx = this.f.b(paramgv.a);
/* 263 */     if (jx == null)
/* 264 */       return;  dg dg = (dg)jx;
/* 265 */     dg.u();
/*     */   }
/*     */   
/*     */   public void a(ks paramks) {
/* 269 */     this.e.g.b.a(new eo(paramks.a, paramks.b, paramks.c));
/*     */   }
/*     */   
/*     */   public void a(gk paramgk) {
/* 273 */     if (paramgk.a.equals("-")) {
/* 274 */       a(new hf(this.e.i.b, "Password", 14));
/*     */     } else {
/*     */       try {
/* 277 */         URL uRL = new URL("http://www.minecraft.net/game/joinserver.jsp?user=" + this.e.i.b + "&sessionId=" + this.e.i.c + "&serverId=" + paramgk.a);
/* 278 */         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
/* 279 */         String str = bufferedReader.readLine();
/* 280 */         bufferedReader.close();
/*     */         
/* 282 */         if (str.equalsIgnoreCase("ok")) {
/* 283 */           a(new hf(this.e.i.b, "Password", 14));
/*     */         } else {
/* 285 */           this.d.a("Failed to login: " + str);
/*     */         } 
/* 287 */       } catch (Exception exception) {
/* 288 */         exception.printStackTrace();
/* 289 */         this.d.a("Internal client error: " + exception.toString());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/* 295 */     this.c = true;
/* 296 */     this.d.a("Closed");
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\go.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */