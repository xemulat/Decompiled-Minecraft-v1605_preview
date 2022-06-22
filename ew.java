/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ew
/*    */   extends ht
/*    */   implements fy
/*    */ {
/*  9 */   private eo[] a = new eo[36];
/*    */   
/*    */   public int a() {
/* 12 */     return 27;
/*    */   }
/*    */   
/*    */   public eo a_(int paramInt) {
/* 16 */     return this.a[paramInt];
/*    */   }
/*    */   
/*    */   public eo a(int paramInt1, int paramInt2) {
/* 20 */     if (this.a[paramInt1] != null) {
/* 21 */       if ((this.a[paramInt1]).a <= paramInt2) {
/* 22 */         eo eo2 = this.a[paramInt1];
/* 23 */         this.a[paramInt1] = null;
/* 24 */         return eo2;
/*    */       } 
/* 26 */       eo eo1 = this.a[paramInt1].a(paramInt2);
/* 27 */       if ((this.a[paramInt1]).a == 0) this.a[paramInt1] = null; 
/* 28 */       return eo1;
/*    */     } 
/*    */     
/* 31 */     return null;
/*    */   }
/*    */   
/*    */   public void a(int paramInt, eo parameo) {
/* 35 */     this.a[paramInt] = parameo;
/* 36 */     if (parameo != null && parameo.a > c()) parameo.a = c(); 
/*    */   }
/*    */   
/*    */   public String b() {
/* 40 */     return "Chest";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hc paramhc) {
/* 45 */     super.a(paramhc);
/* 46 */     jy jy = paramhc.l("Items");
/* 47 */     this.a = new eo[a()];
/* 48 */     for (byte b = 0; b < jy.c(); b++) {
/* 49 */       hc hc1 = (hc)jy.a(b);
/* 50 */       int i = hc1.c("Slot") & 0xFF;
/* 51 */       if (i >= 0 && i < this.a.length) this.a[i] = new eo(hc1); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void b(hc paramhc) {
/* 56 */     super.b(paramhc);
/* 57 */     jy jy = new jy();
/*    */     
/* 59 */     for (byte b = 0; b < this.a.length; b++) {
/* 60 */       if (this.a[b] != null) {
/* 61 */         hc hc1 = new hc();
/* 62 */         hc1.a("Slot", (byte)b);
/* 63 */         this.a[b].a(hc1);
/* 64 */         jy.a(hc1);
/*    */       } 
/*    */     } 
/* 67 */     paramhc.a("Items", jy);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int c() {
/* 74 */     return 64;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ew.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */