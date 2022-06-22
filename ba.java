/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ba
/*     */   extends ht
/*     */ {
/*  10 */   public int a = -1;
/*     */   public String b;
/*  12 */   public double d = 0.0D;
/*     */   public double c;
/*     */   
/*     */   public ba() {
/*  16 */     this.b = "Pig";
/*  17 */     this.a = 20;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  21 */     return (this.e.a(this.f + 0.5D, this.g + 0.5D, this.h + 0.5D, 16.0D) != null);
/*     */   }
/*     */   
/*     */   public void k_() {
/*  25 */     this.d = this.c;
/*     */     
/*  27 */     if (!a()) {
/*     */       return;
/*     */     }
/*     */     
/*  31 */     double d1 = (this.f + this.e.m.nextFloat());
/*  32 */     double d2 = (this.g + this.e.m.nextFloat());
/*  33 */     double d3 = (this.h + this.e.m.nextFloat());
/*  34 */     this.e.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  35 */     this.e.a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */ 
/*     */     
/*  38 */     this.c += (1000.0F / (this.a + 200.0F));
/*  39 */     while (this.c > 360.0D) {
/*  40 */       this.c -= 360.0D;
/*  41 */       this.d -= 360.0D;
/*     */     } 
/*     */     
/*  44 */     if (this.a == -1) c();
/*     */     
/*  46 */     if (this.a > 0) {
/*  47 */       this.a--;
/*     */       
/*     */       return;
/*     */     } 
/*  51 */     byte b1 = 4;
/*  52 */     for (byte b2 = 0; b2 < b1; b2++) {
/*  53 */       fv fv = (fv)ep.a(this.b, this.e);
/*  54 */       if (fv == null)
/*     */         return; 
/*  56 */       int i = this.e.a(fv.getClass(), cb.b(this.f, this.g, this.h, (this.f + 1), (this.g + 1), (this.h + 1)).b(8.0D, 4.0D, 8.0D)).size();
/*  57 */       if (i >= 6) {
/*  58 */         c();
/*     */         
/*     */         return;
/*     */       } 
/*  62 */       if (fv != null) {
/*  63 */         double d4 = this.f + (this.e.m.nextDouble() - this.e.m.nextDouble()) * 4.0D;
/*  64 */         double d5 = (this.g + this.e.m.nextInt(3) - 1);
/*  65 */         double d6 = this.h + (this.e.m.nextDouble() - this.e.m.nextDouble()) * 4.0D;
/*     */         
/*  67 */         fv.c(d4, d5, d6, this.e.m.nextFloat() * 360.0F, 0.0F);
/*     */         
/*  69 */         if (fv.a()) {
/*  70 */           this.e.a(fv);
/*     */           
/*  72 */           for (byte b = 0; b < 20; b++) {
/*     */             
/*  74 */             d1 = this.f + 0.5D + (this.e.m.nextFloat() - 0.5D) * 2.0D;
/*  75 */             d2 = this.g + 0.5D + (this.e.m.nextFloat() - 0.5D) * 2.0D;
/*  76 */             d3 = this.h + 0.5D + (this.e.m.nextFloat() - 0.5D) * 2.0D;
/*     */             
/*  78 */             this.e.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  79 */             this.e.a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */           } 
/*     */           
/*  82 */           fv.x();
/*  83 */           c();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  88 */     super.k_();
/*     */   }
/*     */   
/*     */   private void c() {
/*  92 */     this.a = 200 + this.e.m.nextInt(600);
/*     */   }
/*     */   
/*     */   public void a(hc paramhc) {
/*  96 */     super.a(paramhc);
/*  97 */     this.b = paramhc.i("EntityId");
/*  98 */     this.a = paramhc.d("Delay");
/*     */   }
/*     */   
/*     */   public void b(hc paramhc) {
/* 102 */     super.b(paramhc);
/* 103 */     paramhc.a("EntityId", this.b);
/* 104 */     paramhc.a("Delay", (short)this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */