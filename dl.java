/*    */ 
/*    */ 
/*    */ public class dl
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   public final fy d;
/*    */   private final dy e;
/*    */   
/*    */   public dl(dy paramdy, fy paramfy, int paramInt1, int paramInt2, int paramInt3) {
/* 12 */     this.e = paramdy;
/* 13 */     this.d = paramfy;
/* 14 */     this.a = paramInt1;
/* 15 */     this.b = paramInt2;
/* 16 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2) {
/* 20 */     int i = (this.e.c - this.e.a) / 2;
/* 21 */     int j = (this.e.d - this.e.h) / 2;
/* 22 */     paramInt1 -= i;
/* 23 */     paramInt2 -= j;
/*    */     
/* 25 */     return (paramInt1 >= this.b - 1 && paramInt1 < this.b + 16 + 1 && paramInt2 >= this.c - 1 && paramInt2 < this.c + 16 + 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 47 */     d();
/*    */   }
/*    */   
/*    */   public boolean a(eo parameo) {
/* 51 */     return true;
/*    */   }
/*    */   
/*    */   public eo b() {
/* 55 */     return this.d.a_(this.a);
/*    */   }
/*    */   
/*    */   public void b(eo parameo) {
/* 59 */     this.d.a(this.a, parameo);
/* 60 */     d();
/*    */   }
/*    */   
/*    */   public int c() {
/* 64 */     return -1;
/*    */   }
/*    */   
/*    */   public void d() {
/* 68 */     this.d.d();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */