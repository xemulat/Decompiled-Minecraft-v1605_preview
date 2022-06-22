/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
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
/*     */ public abstract class ef
/*     */ {
/*  18 */   private String a = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   abstract void a(DataOutput paramDataOutput);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   abstract void a(DataInput paramDataInput);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract byte a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/*  45 */     if (this.a == null) return ""; 
/*  46 */     return this.a;
/*     */   }
/*     */   
/*     */   public ef a(String paramString) {
/*  50 */     this.a = paramString;
/*  51 */     return this;
/*     */   }
/*     */   
/*     */   public static ef b(DataInput paramDataInput) {
/*  55 */     byte b = paramDataInput.readByte();
/*  56 */     if (b == 0) return new fp();
/*     */     
/*  58 */     ef ef1 = a(b);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     ef1.a = paramDataInput.readUTF();
/*  64 */     ef1.a(paramDataInput);
/*  65 */     return ef1;
/*     */   }
/*     */   
/*     */   public static void a(ef paramef, DataOutput paramDataOutput) {
/*  69 */     paramDataOutput.writeByte(paramef.a());
/*  70 */     if (paramef.a() == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  75 */     paramDataOutput.writeUTF(paramef.b());
/*     */     
/*  77 */     paramef.a(paramDataOutput);
/*     */   }
/*     */   
/*     */   public static ef a(byte paramByte) {
/*  81 */     switch (paramByte) {
/*     */       case 0:
/*  83 */         return new fp();
/*     */       case 1:
/*  85 */         return new in();
/*     */       case 2:
/*  87 */         return new lh();
/*     */       case 3:
/*  89 */         return new ie();
/*     */       case 4:
/*  91 */         return new ge();
/*     */       case 5:
/*  93 */         return new f();
/*     */       case 6:
/*  95 */         return new kg();
/*     */       case 7:
/*  97 */         return new ds();
/*     */       case 8:
/*  99 */         return new mr();
/*     */       case 9:
/* 101 */         return new jy();
/*     */       case 10:
/* 103 */         return new hc();
/*     */     } 
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   public static String b(byte paramByte) {
/* 109 */     switch (paramByte) {
/*     */       case 0:
/* 111 */         return "TAG_End";
/*     */       case 1:
/* 113 */         return "TAG_Byte";
/*     */       case 2:
/* 115 */         return "TAG_Short";
/*     */       case 3:
/* 117 */         return "TAG_Int";
/*     */       case 4:
/* 119 */         return "TAG_Long";
/*     */       case 5:
/* 121 */         return "TAG_Float";
/*     */       case 6:
/* 123 */         return "TAG_Double";
/*     */       case 7:
/* 125 */         return "TAG_Byte_Array";
/*     */       case 8:
/* 127 */         return "TAG_String";
/*     */       case 9:
/* 129 */         return "TAG_List";
/*     */       case 10:
/* 131 */         return "TAG_Compound";
/*     */     } 
/* 133 */     return "UNKNOWN";
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\ef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */