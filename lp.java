/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lp
/*    */   implements as
/*    */ {
/*    */   private fr a;
/* 36 */   private Map b = new HashMap<Object, Object>();
/* 37 */   private List c = new ArrayList();
/*    */   private cj d;
/*    */   
/*    */   public lp(cj paramcj) {
/* 41 */     this.a = new fr(paramcj, new byte[32768], 0, 0);
/* 42 */     this.a.q = true;
/* 43 */     this.a.p = true;
/*    */     
/* 45 */     this.d = paramcj;
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2) {
/* 49 */     gs gs = new gs(paramInt1, paramInt2);
/* 50 */     return this.b.containsKey(gs);
/*    */   }
/*    */   
/*    */   public void c(int paramInt1, int paramInt2) {
/* 54 */     fr fr1 = b(paramInt1, paramInt2);
/* 55 */     if (!fr1.q) {
/* 56 */       fr1.e();
/*    */     }
/*    */     
/* 59 */     this.b.remove(new gs(paramInt1, paramInt2));
/* 60 */     this.c.remove(fr1);
/*    */   }
/*    */   
/*    */   public fr d(int paramInt1, int paramInt2) {
/* 64 */     gs gs = new gs(paramInt1, paramInt2);
/*    */     
/* 66 */     byte[] arrayOfByte = new byte[32768];
/*    */     
/* 68 */     fr fr1 = new fr(this.d, arrayOfByte, paramInt1, paramInt2);
/* 69 */     Arrays.fill(fr1.f.a, (byte)-1);
/* 70 */     this.b.put(gs, fr1);
/* 71 */     fr1.c = true;
/*    */     
/* 73 */     return fr1;
/*    */   }
/*    */ 
/*    */   
/*    */   public fr b(int paramInt1, int paramInt2) {
/* 78 */     gs gs = new gs(paramInt1, paramInt2);
/*    */     
/* 80 */     fr fr1 = (fr)this.b.get(gs);
/* 81 */     if (fr1 == null) {
/* 82 */       return this.a;
/*    */     }
/*    */     
/* 85 */     return fr1;
/*    */   }
/*    */   
/*    */   public boolean a(boolean paramBoolean, nh paramnh) {
/* 89 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 93 */     return false;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 97 */     return false;
/*    */   }
/*    */   
/*    */   public void a(as paramas, int paramInt1, int paramInt2) {}
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */