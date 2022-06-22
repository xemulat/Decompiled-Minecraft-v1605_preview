/*    */ public class mh {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   
/*    */   public mh(int paramInt1, int paramInt2, int paramInt3) {
/*  7 */     this.a = paramInt1;
/*  8 */     this.b = paramInt2;
/*  9 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 13 */     if (paramObject instanceof mh) {
/*    */       
/* 15 */       mh mh1 = (mh)paramObject;
/* 16 */       return (mh1.a == this.a && mh1.b == this.b && mh1.c == this.c);
/*    */     } 
/*    */     
/* 19 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 23 */     return this.a * 8976890 + this.b * 981131 + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */