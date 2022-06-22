/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public abstract class dy
/*     */   extends bd
/*     */ {
/*  19 */   private static z k = new z();
/*  20 */   private eo l = null;
/*  21 */   protected int a = 176;
/*  22 */   protected int h = 166;
/*     */   
/*  24 */   protected List i = new ArrayList();
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/*  27 */     i();
/*  28 */     int i = (this.c - this.a) / 2;
/*  29 */     int j = (this.d - this.h) / 2;
/*     */     
/*  31 */     a(paramFloat);
/*     */     
/*  33 */     GL11.glPushMatrix();
/*  34 */     GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*  35 */     j.b();
/*  36 */     GL11.glPopMatrix();
/*     */     
/*  38 */     GL11.glPushMatrix();
/*  39 */     GL11.glTranslatef(i, j, 0.0F);
/*     */     
/*  41 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  42 */     GL11.glEnable(32826);
/*  43 */     for (byte b = 0; b < this.i.size(); b++) {
/*  44 */       dl dl = this.i.get(b);
/*     */       
/*  46 */       a(dl);
/*     */       
/*  48 */       if (dl.a(paramInt1, paramInt2)) {
/*  49 */         GL11.glDisable(2896);
/*  50 */         GL11.glDisable(2929);
/*     */         
/*  52 */         int k = dl.b;
/*  53 */         int m = dl.c;
/*  54 */         a(k, m, k + 16, m + 16, -2130706433, -2130706433);
/*  55 */         GL11.glEnable(2896);
/*  56 */         GL11.glEnable(2929);
/*     */       } 
/*     */     } 
/*  59 */     if (this.l != null) {
/*  60 */       GL11.glTranslatef(0.0F, 0.0F, 32.0F);
/*     */ 
/*     */       
/*  63 */       k.a(this.g, this.b.n, this.l, paramInt1 - i - 8, paramInt2 - j - 8);
/*  64 */       k.b(this.g, this.b.n, this.l, paramInt1 - i - 8, paramInt2 - j - 8);
/*     */     } 
/*     */     
/*  67 */     GL11.glDisable(32826);
/*  68 */     j.a();
/*     */     
/*  70 */     GL11.glDisable(2896);
/*  71 */     GL11.glDisable(2929);
/*  72 */     j();
/*  73 */     GL11.glEnable(2896);
/*  74 */     GL11.glEnable(2929);
/*     */ 
/*     */     
/*  77 */     GL11.glPopMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void j() {}
/*     */   
/*     */   protected abstract void a(float paramFloat);
/*     */   
/*     */   private void a(dl paramdl) {
/*  86 */     fy fy = paramdl.d;
/*  87 */     int i = paramdl.a;
/*  88 */     int j = paramdl.b;
/*  89 */     int k = paramdl.c;
/*  90 */     eo eo1 = fy.a_(i);
/*     */     
/*  92 */     if (eo1 == null) {
/*  93 */       int m = paramdl.c();
/*  94 */       if (m >= 0) {
/*  95 */         GL11.glDisable(2896);
/*  96 */         this.b.n.b(this.b.n.a("/gui/items.png"));
/*  97 */         b(j, k, m % 16 * 16, m / 16 * 16, 16, 16);
/*  98 */         GL11.glEnable(2896);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     k.a(this.g, this.b.n, eo1, j, k);
/* 112 */     k.b(this.g, this.b.n, eo1, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   private dl a(int paramInt1, int paramInt2) {
/* 117 */     for (byte b = 0; b < this.i.size(); b++) {
/* 118 */       dl dl = this.i.get(b);
/* 119 */       if (dl.a(paramInt1, paramInt2)) return dl; 
/*     */     } 
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3) {
/* 125 */     if (paramInt3 == 0 || paramInt3 == 1) {
/* 126 */       dl dl = a(paramInt1, paramInt2);
/*     */       
/* 128 */       if (dl != null) {
/* 129 */         dl.d();
/* 130 */         eo eo1 = dl.b();
/* 131 */         if (eo1 != null || this.l != null) {
/* 132 */           if (eo1 != null && this.l == null) {
/* 133 */             int i = (paramInt3 == 0) ? eo1.a : ((eo1.a + 1) / 2);
/* 134 */             this.l = dl.d.a(dl.a, i);
/* 135 */             if (eo1.a == 0) dl.b(null); 
/* 136 */             dl.a();
/* 137 */           } else if (eo1 == null && this.l != null && dl.a(this.l)) {
/* 138 */             int i = (paramInt3 == 0) ? this.l.a : 1;
/* 139 */             if (i > dl.d.c()) i = dl.d.c(); 
/* 140 */             dl.b(this.l.a(i));
/* 141 */             if (this.l.a == 0) this.l = null; 
/* 142 */           } else if (eo1 != null && this.l != null) {
/*     */             
/* 144 */             if (dl.a(this.l)) {
/* 145 */               if (eo1.c != this.l.c) {
/* 146 */                 if (this.l.a <= dl.d.c()) {
/* 147 */                   eo eo2 = eo1;
/* 148 */                   dl.b(this.l);
/* 149 */                   this.l = eo2;
/*     */                 } 
/* 151 */               } else if (eo1.c == this.l.c) {
/* 152 */                 if (paramInt3 == 0) {
/* 153 */                   int i = this.l.a;
/* 154 */                   if (i > dl.d.c() - eo1.a) i = dl.d.c() - eo1.a; 
/* 155 */                   if (i > this.l.c() - eo1.a) i = this.l.c() - eo1.a; 
/* 156 */                   this.l.a(i);
/* 157 */                   if (this.l.a == 0) this.l = null; 
/* 158 */                   eo1.a += i;
/* 159 */                 } else if (paramInt3 == 1) {
/* 160 */                   int i = 1;
/* 161 */                   if (i > dl.d.c() - eo1.a) i = dl.d.c() - eo1.a; 
/* 162 */                   if (i > this.l.c() - eo1.a) i = this.l.c() - eo1.a; 
/* 163 */                   this.l.a(i);
/* 164 */                   if (this.l.a == 0) this.l = null; 
/* 165 */                   eo1.a += i;
/*     */                 }
/*     */               
/*     */               } 
/* 169 */             } else if (eo1.c == this.l.c && this.l.c() > 1) {
/* 170 */               int i = eo1.a;
/* 171 */               if (i > 0 && i + this.l.a <= this.l.c()) {
/* 172 */                 this.l.a += i;
/* 173 */                 eo1.a(i);
/* 174 */                 if (eo1.a == 0) dl.b(null); 
/* 175 */                 dl.a();
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }
/* 180 */       } else if (this.l != null) {
/* 181 */         int i = (this.c - this.a) / 2;
/* 182 */         int j = (this.d - this.h) / 2;
/* 183 */         if (paramInt1 < i || paramInt2 < j || paramInt1 >= i + this.a || paramInt2 >= j + this.a) {
/* 184 */           be be = this.b.g;
/* 185 */           if (paramInt3 == 0) {
/* 186 */             be.a(this.l);
/* 187 */             this.l = null;
/*     */           } 
/* 189 */           if (paramInt3 == 1) {
/* 190 */             be.a(this.l.a(1));
/* 191 */             if (this.l.a == 0) this.l = null; 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3) {
/* 199 */     if (paramInt3 == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(char paramChar, int paramInt) {
/* 204 */     if (paramInt == 1 || paramInt == this.b.y.o.b) {
/* 205 */       this.b.a(null);
/*     */     }
/*     */   }
/*     */   
/*     */   public void h() {
/* 210 */     if (this.l != null) this.b.g.a(this.l);
/*     */   
/*     */   }
/*     */   
/*     */   public void a(fy paramfy) {}
/*     */   
/*     */   public boolean b() {
/* 217 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */