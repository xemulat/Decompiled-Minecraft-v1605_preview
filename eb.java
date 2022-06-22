/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eb
/*     */   extends fd
/*     */ {
/*     */   public double a;
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   public float e;
/*     */   public float f;
/*     */   public boolean g;
/*     */   public boolean h;
/*     */   public boolean i;
/*     */   
/*     */   public eb() {}
/*     */   
/*     */   public eb(boolean paramBoolean) {
/* 122 */     this.g = paramBoolean;
/*     */   }
/*     */   
/*     */   public void a(kq paramkq) {
/* 126 */     paramkq.a(this);
/*     */   }
/*     */   
/*     */   public void a(DataInputStream paramDataInputStream) {
/* 130 */     this.g = (paramDataInputStream.read() != 0);
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) {
/* 134 */     paramDataOutputStream.write(this.g ? 1 : 0);
/*     */   }
/*     */   
/*     */   public int a() {
/* 138 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\eb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */