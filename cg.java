/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cg
/*    */   implements as
/*    */ {
/* 13 */   private fr[] b = new fr[256];
/*    */   
/*    */   private cj c;
/*    */   
/*    */   private ad d;
/*    */   
/*    */   byte[] a;
/*    */ 
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2) {
/* 23 */     int i = paramInt1 & 0xF | (paramInt2 & 0xF) * 16;
/* 24 */     return (this.b[i] != null && this.b[i].a(paramInt1, paramInt2));
/*    */   }
/*    */   
/* 27 */   public cg(cj paramcj, ad paramad) { this.a = new byte[32768];
/*    */     this.c = paramcj;
/*    */     this.d = paramad; } public fr b(int paramInt1, int paramInt2) {
/* 30 */     int i = paramInt1 & 0xF | (paramInt2 & 0xF) * 16;
/*    */     try {
/* 32 */       if (!a(paramInt1, paramInt2)) {
/* 33 */         fr fr1 = c(paramInt1, paramInt2);
/* 34 */         if (fr1 == null) {
/* 35 */           fr1 = new fr(this.c, this.a, paramInt1, paramInt2);
/* 36 */           fr1.q = true;
/* 37 */           fr1.p = true;
/*    */         } 
/* 39 */         this.b[i] = fr1;
/*    */       } 
/* 41 */       return this.b[i];
/* 42 */     } catch (Exception exception) {
/* 43 */       exception.printStackTrace();
/* 44 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private synchronized fr c(int paramInt1, int paramInt2) {
/*    */     try {
/* 51 */       return this.d.a(this.c, paramInt1, paramInt2);
/* 52 */     } catch (IOException iOException) {
/* 53 */       iOException.printStackTrace();
/* 54 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(as paramas, int paramInt1, int paramInt2) {}
/*    */   
/*    */   public boolean a(boolean paramBoolean, nh paramnh) {
/* 62 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 66 */     return false;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 70 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\cg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */