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
/*     */ public class lx
/*     */   extends eb
/*     */ {
/*     */   public lx() {
/*  86 */     this.i = true;
/*     */   }
/*     */   
/*     */   public lx(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*  90 */     this.e = paramFloat1;
/*  91 */     this.f = paramFloat2;
/*  92 */     this.g = paramBoolean;
/*  93 */     this.i = true;
/*     */   }
/*     */   
/*     */   public void a(DataInputStream paramDataInputStream) {
/*  97 */     this.e = paramDataInputStream.readFloat();
/*  98 */     this.f = paramDataInputStream.readFloat();
/*  99 */     super.a(paramDataInputStream);
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) {
/* 103 */     paramDataOutputStream.writeFloat(this.e);
/* 104 */     paramDataOutputStream.writeFloat(this.f);
/* 105 */     super.a(paramDataOutputStream);
/*     */   }
/*     */   
/*     */   public int a() {
/* 109 */     return 9;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */