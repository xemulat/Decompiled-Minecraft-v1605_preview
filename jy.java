/*    */ import java.io.DataInput;
/*    */ import java.io.DataOutput;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class jy extends ef {
/*  7 */   private List a = new ArrayList();
/*    */   private byte b;
/*    */   
/*    */   void a(DataOutput paramDataOutput) {
/* 11 */     if (this.a.size() > 0) { this.b = ((ef)this.a.get(0)).a(); }
/* 12 */     else { this.b = 1; }
/*    */     
/* 14 */     paramDataOutput.writeByte(this.b);
/* 15 */     paramDataOutput.writeInt(this.a.size());
/* 16 */     for (byte b = 0; b < this.a.size(); b++) {
/* 17 */       ((ef)this.a.get(b)).a(paramDataOutput);
/*    */     }
/*    */   }
/*    */   
/*    */   void a(DataInput paramDataInput) {
/* 22 */     this.b = paramDataInput.readByte();
/* 23 */     int i = paramDataInput.readInt();
/*    */     
/* 25 */     this.a = new ArrayList();
/* 26 */     for (byte b = 0; b < i; b++) {
/* 27 */       ef ef1 = ef.a(this.b);
/* 28 */       ef1.a(paramDataInput);
/* 29 */       this.a.add(ef1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public byte a() {
/* 34 */     return 9;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 38 */     return "" + this.a.size() + " entries of type " + ef.b(this.b);
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
/*    */   public void a(ef paramef) {
/* 53 */     this.b = paramef.a();
/* 54 */     this.a.add(paramef);
/*    */   }
/*    */   
/*    */   public ef a(int paramInt) {
/* 58 */     return this.a.get(paramInt);
/*    */   }
/*    */   
/*    */   public int c() {
/* 62 */     return this.a.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\jy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */