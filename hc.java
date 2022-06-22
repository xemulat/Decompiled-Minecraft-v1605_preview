/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class hc extends ef {
/*   7 */   private Map a = new HashMap<Object, Object>();
/*     */   
/*     */   void a(DataOutput paramDataOutput) {
/*  10 */     for (ef ef1 : this.a.values()) {
/*  11 */       ef.a(ef1, paramDataOutput);
/*     */     }
/*  13 */     paramDataOutput.writeByte(0);
/*     */   }
/*     */   
/*     */   void a(DataInput paramDataInput) {
/*  17 */     this.a.clear();
/*     */     ef ef1;
/*  19 */     while ((ef1 = ef.b(paramDataInput)).a() != 0) {
/*  20 */       this.a.put(ef1.b(), ef1);
/*     */     }
/*     */   }
/*     */   
/*     */   public byte a() {
/*  25 */     return 10;
/*     */   }
/*     */   
/*     */   public void a(String paramString, ef paramef) {
/*  29 */     this.a.put(paramString, paramef.a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte paramByte) {
/*  33 */     this.a.put(paramString, (new in(paramByte)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, short paramShort) {
/*  37 */     this.a.put(paramString, (new lh(paramShort)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt) {
/*  41 */     this.a.put(paramString, (new ie(paramInt)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, long paramLong) {
/*  45 */     this.a.put(paramString, (new ge(paramLong)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat) {
/*  49 */     this.a.put(paramString, (new f(paramFloat)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, double paramDouble) {
/*  53 */     this.a.put(paramString, (new kg(paramDouble)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString1, String paramString2) {
/*  57 */     this.a.put(paramString1, (new mr(paramString2)).a(paramString1));
/*     */   }
/*     */   
/*     */   public void a(String paramString, byte[] paramArrayOfbyte) {
/*  61 */     this.a.put(paramString, (new ds(paramArrayOfbyte)).a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, hc paramhc) {
/*  65 */     this.a.put(paramString, paramhc.a(paramString));
/*     */   }
/*     */   
/*     */   public void a(String paramString, boolean paramBoolean) {
/*  69 */     a(paramString, paramBoolean ? 1 : 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(String paramString) {
/*  77 */     return this.a.containsKey(paramString);
/*     */   }
/*     */   
/*     */   public byte c(String paramString) {
/*  81 */     if (!this.a.containsKey(paramString)) return 0; 
/*  82 */     return ((in)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public short d(String paramString) {
/*  86 */     if (!this.a.containsKey(paramString)) return 0; 
/*  87 */     return ((lh)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public int e(String paramString) {
/*  91 */     if (!this.a.containsKey(paramString)) return 0; 
/*  92 */     return ((ie)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public long f(String paramString) {
/*  96 */     if (!this.a.containsKey(paramString)) return 0L; 
/*  97 */     return ((ge)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public float g(String paramString) {
/* 101 */     if (!this.a.containsKey(paramString)) return 0.0F; 
/* 102 */     return ((f)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public double h(String paramString) {
/* 106 */     if (!this.a.containsKey(paramString)) return 0.0D; 
/* 107 */     return ((kg)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public String i(String paramString) {
/* 111 */     if (!this.a.containsKey(paramString)) return ""; 
/* 112 */     return ((mr)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public byte[] j(String paramString) {
/* 116 */     if (!this.a.containsKey(paramString)) return new byte[0]; 
/* 117 */     return ((ds)this.a.get(paramString)).a;
/*     */   }
/*     */   
/*     */   public hc k(String paramString) {
/* 121 */     if (!this.a.containsKey(paramString)) return new hc(); 
/* 122 */     return (hc)this.a.get(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public jy l(String paramString) {
/* 127 */     if (!this.a.containsKey(paramString)) return new jy(); 
/* 128 */     return (jy)this.a.get(paramString);
/*     */   }
/*     */   
/*     */   public boolean m(String paramString) {
/* 132 */     return (c(paramString) != 0);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 136 */     return "" + this.a.size() + " entries";
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\hc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */