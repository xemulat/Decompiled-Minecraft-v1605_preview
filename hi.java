/*    */ 
/*    */ 
/*    */ public class hi
/*    */   implements fy
/*    */ {
/*    */   private String a;
/*    */   private fy b;
/*    */   private fy c;
/*    */   
/*    */   public hi(String paramString, fy paramfy1, fy paramfy2) {
/* 11 */     this.a = paramString;
/* 12 */     this.b = paramfy1;
/* 13 */     this.c = paramfy2;
/*    */   }
/*    */   
/*    */   public int a() {
/* 17 */     return this.b.a() + this.c.a();
/*    */   }
/*    */   
/*    */   public String b() {
/* 21 */     return this.a;
/*    */   }
/*    */   
/*    */   public eo a_(int paramInt) {
/* 25 */     if (paramInt >= this.b.a()) return this.c.a_(paramInt - this.b.a()); 
/* 26 */     return this.b.a_(paramInt);
/*    */   }
/*    */   
/*    */   public eo a(int paramInt1, int paramInt2) {
/* 30 */     if (paramInt1 >= this.b.a()) return this.c.a(paramInt1 - this.b.a(), paramInt2); 
/* 31 */     return this.b.a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void a(int paramInt, eo parameo) {
/* 35 */     if (paramInt >= this.b.a()) { this.c.a(paramInt - this.b.a(), parameo); }
/* 36 */     else { this.b.a(paramInt, parameo); }
/*    */   
/*    */   }
/*    */   public int c() {
/* 40 */     return this.b.c();
/*    */   }
/*    */   
/*    */   public void d() {
/* 44 */     this.b.d();
/* 45 */     this.c.d();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */