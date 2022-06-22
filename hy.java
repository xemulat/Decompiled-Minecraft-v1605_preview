/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.net.Socket;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class hy
/*     */ {
/*  10 */   public static final Object a = new Object();
/*     */   public static int b;
/*     */   public static int c;
/*  13 */   private Object d = new Object();
/*     */ 
/*     */   
/*     */   private Socket e;
/*     */ 
/*     */   
/*     */   private DataInputStream f;
/*     */ 
/*     */   
/*     */   private DataOutputStream g;
/*     */ 
/*     */   
/*     */   private boolean h = true;
/*     */   
/*  27 */   private List i = Collections.synchronizedList(new LinkedList());
/*  28 */   private List j = Collections.synchronizedList(new LinkedList());
/*  29 */   private List k = Collections.synchronizedList(new LinkedList());
/*     */   
/*     */   private kq l;
/*     */   
/*     */   private boolean m = false;
/*     */   
/*     */   private Thread n;
/*     */   private Thread o;
/*     */   private boolean p = false;
/*  38 */   private String q = "";
/*     */   
/*  40 */   private int r = 0;
/*  41 */   private int s = 0;
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
/*     */   private int t;
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
/*     */   public void a(fd paramfd) {
/*  93 */     if (this.m)
/*  94 */       return;  synchronized (this.d) {
/*  95 */       this.s += paramfd.a() + 1;
/*  96 */       if (paramfd.j) {
/*  97 */         this.k.add(paramfd);
/*     */       } else {
/*  99 */         this.j.add(paramfd);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public hy(Socket paramSocket, String paramString, kq paramkq) {
/* 109 */     this.t = 0; this.e = paramSocket; this.l = paramkq; paramSocket.setTrafficClass(24); this.f = new DataInputStream(paramSocket.getInputStream()); this.g = new DataOutputStream(paramSocket.getOutputStream()); this.o = new mv(this, paramString + " read thread");
/*     */     this.n = new mx(this, paramString + " write thread");
/*     */     this.o.start();
/*     */     this.n.start(); } private void b() { 
/* 113 */     try { boolean bool = true;
/* 114 */       if (!this.j.isEmpty()) {
/* 115 */         fd fd; bool = false;
/*     */         
/* 117 */         synchronized (this.d) {
/* 118 */           fd = this.j.remove(0);
/* 119 */           this.s -= fd.a() + 1;
/*     */         } 
/* 121 */         fd.a(fd, this.g);
/*     */       } 
/*     */ 
/*     */       
/* 125 */       if ((bool || this.t-- <= 0) && !this.k.isEmpty()) {
/* 126 */         fd fd; bool = false;
/*     */         
/* 128 */         synchronized (this.d) {
/* 129 */           fd = this.k.remove(0);
/* 130 */           this.s -= fd.a() + 1;
/*     */         } 
/* 132 */         fd.a(fd, this.g);
/* 133 */         this.t = 50;
/*     */       } 
/*     */       
/* 136 */       if (bool) {
/* 137 */         Thread.sleep(10L);
/*     */       } }
/* 139 */     catch (InterruptedException interruptedException) {  }
/* 140 */     catch (Exception exception)
/* 141 */     { if (!this.p) a(exception);  }
/*     */      }
/*     */ 
/*     */   
/*     */   private void c() {
/*     */     try {
/* 147 */       fd fd = fd.b(this.f);
/* 148 */       if (fd != null) { this.i.add(fd); }
/* 149 */       else { a("End of stream"); } 
/* 150 */     } catch (Exception exception) {
/* 151 */       if (!this.p) a(exception); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(Exception paramException) {
/* 156 */     paramException.printStackTrace();
/* 157 */     a("Internal exception: " + paramException.toString());
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 161 */     if (!this.h)
/* 162 */       return;  this.p = true;
/* 163 */     this.q = paramString;
/*     */     
/* 165 */     (new mu(this)).start();
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
/* 188 */     this.h = false;
/*     */     try {
/* 190 */       this.f.close();
/* 191 */     } catch (Throwable throwable) {}
/*     */     
/*     */     try {
/* 194 */       this.g.close();
/* 195 */     } catch (Throwable throwable) {}
/*     */     
/*     */     try {
/* 198 */       this.e.close();
/* 199 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 204 */     if (this.s > 1048576) {
/* 205 */       a("Send buffer overflow");
/*     */     }
/* 207 */     if (this.i.isEmpty()) {
/* 208 */       if (this.r++ == 1200) {
/* 209 */         a("Timed out");
/*     */       }
/*     */     } else {
/* 212 */       this.r = 0;
/*     */     } 
/*     */     
/* 215 */     byte b = 100;
/* 216 */     while (!this.i.isEmpty() && b-- >= 0) {
/* 217 */       fd fd = this.i.remove(0);
/* 218 */       fd.a(this.l);
/*     */     } 
/*     */     
/* 221 */     if (this.p && this.i.isEmpty())
/* 222 */       this.l.a(this.q); 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */