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
/*     */ public class lf
/*     */   extends fd
/*     */ {
/*     */   public int a;
/*     */   public byte b;
/*     */   public byte c;
/*     */   public byte d;
/*     */   public byte e;
/*     */   public byte f;
/*     */   public boolean g = false;
/*     */   
/*     */   public void a(DataInputStream paramDataInputStream) {
/* 115 */     this.a = paramDataInputStream.readInt();
/*     */   }
/*     */   
/*     */   public void a(DataOutputStream paramDataOutputStream) {
/* 119 */     paramDataOutputStream.writeInt(this.a);
/*     */   }
/*     */   
/*     */   public void a(kq paramkq) {
/* 123 */     paramkq.a(this);
/*     */   }
/*     */   
/*     */   public int a() {
/* 127 */     return 4;
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\lf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */