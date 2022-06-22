/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class i
/*    */   implements fy
/*    */ {
/*    */   private eo[] a;
/*    */   private int b;
/*    */   private dy c;
/*    */   
/*    */   public i(dy paramdy, int paramInt1, int paramInt2) {
/* 15 */     this.b = paramInt1 * paramInt2;
/* 16 */     this.a = new eo[this.b];
/* 17 */     this.c = paramdy;
/*    */   }
/*    */   
/*    */   public i(dy paramdy, eo[] paramArrayOfeo) {
/* 21 */     this.b = paramArrayOfeo.length;
/* 22 */     this.a = paramArrayOfeo;
/* 23 */     this.c = paramdy;
/*    */   }
/*    */   
/*    */   public int a() {
/* 27 */     return this.b;
/*    */   }
/*    */   
/*    */   public eo a_(int paramInt) {
/* 31 */     return this.a[paramInt];
/*    */   }
/*    */   
/*    */   public String b() {
/* 35 */     return "Crafting";
/*    */   }
/*    */   
/*    */   public eo a(int paramInt1, int paramInt2) {
/* 39 */     if (this.a[paramInt1] != null) {
/* 40 */       if ((this.a[paramInt1]).a <= paramInt2) {
/* 41 */         eo eo2 = this.a[paramInt1];
/* 42 */         this.a[paramInt1] = null;
/* 43 */         this.c.a(this);
/* 44 */         return eo2;
/*    */       } 
/* 46 */       eo eo1 = this.a[paramInt1].a(paramInt2);
/* 47 */       if ((this.a[paramInt1]).a == 0) this.a[paramInt1] = null; 
/* 48 */       this.c.a(this);
/* 49 */       return eo1;
/*    */     } 
/*    */     
/* 52 */     return null;
/*    */   }
/*    */   
/*    */   public void a(int paramInt, eo parameo) {
/* 56 */     this.a[paramInt] = parameo;
/* 57 */     this.c.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 61 */     return 64;
/*    */   }
/*    */   
/*    */   public void d() {}
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */