/*     */ import java.io.File;
/*     */ import java.util.Random;
/*     */ import paulscode.sound.SoundSystem;
/*     */ import paulscode.sound.SoundSystemConfig;
/*     */ import paulscode.sound.codecs.CodecJOrbis;
/*     */ import paulscode.sound.codecs.CodecWav;
/*     */ import paulscode.sound.libraries.LibraryLWJGLOpenAL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class nr
/*     */ {
/*     */   private SoundSystem a;
/*  17 */   private dv b = new dv();
/*  18 */   private dv c = new dv();
/*  19 */   private dv d = new dv();
/*  20 */   private int e = 0;
/*     */   
/*     */   private fi f;
/*     */   private boolean g = false;
/*     */   
/*     */   public void a(fi paramfi) {
/*  26 */     this.c.b = false;
/*  27 */     this.f = paramfi;
/*     */     
/*  29 */     if (!this.g && (paramfi == null || paramfi.b || paramfi.a)) {
/*  30 */       d();
/*     */     }
/*     */   }
/*     */   
/*     */   private void d() {
/*     */     try {
/*  36 */       boolean bool1 = this.f.b;
/*  37 */       boolean bool2 = this.f.a;
/*     */       
/*  39 */       this.f.b = false;
/*  40 */       this.f.a = false;
/*  41 */       this.f.b();
/*     */       
/*  43 */       SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
/*     */       
/*  45 */       SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
/*  46 */       SoundSystemConfig.setCodec("mus", ej.class);
/*  47 */       SoundSystemConfig.setCodec("wav", CodecWav.class);
/*     */       
/*  49 */       this.a = new SoundSystem();
/*     */       
/*  51 */       this.f.b = bool1;
/*  52 */       this.f.a = bool2;
/*  53 */       this.f.b();
/*     */     }
/*  55 */     catch (Throwable throwable) {
/*  56 */       throwable.printStackTrace();
/*  57 */       System.err.println("error linking with the LibraryJavaSound plug-in");
/*     */     } 
/*     */     
/*  60 */     this.g = true;
/*     */   }
/*     */   
/*     */   public void a() {
/*  64 */     if (!this.g && (this.f.b || this.f.a)) {
/*  65 */       d();
/*     */     }
/*     */     
/*  68 */     if (!this.f.a) {
/*  69 */       this.a.stop("BgMusic");
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*  74 */     if (this.g) this.a.cleanup(); 
/*     */   }
/*     */   
/*     */   public void a(String paramString, File paramFile) {
/*  78 */     this.b.a(paramString, paramFile);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String paramString, File paramFile) {
/*  83 */     this.c.a(paramString, paramFile);
/*     */   }
/*     */   
/*     */   public void c(String paramString, File paramFile) {
/*  87 */     this.d.a(paramString, paramFile);
/*     */   }
/*     */ 
/*     */   
/*  91 */   private Random h = new Random();
/*  92 */   private int i = this.h.nextInt(12000);
/*     */   
/*     */   public void c() {
/*  95 */     if (!this.g || !this.f.a)
/*     */       return; 
/*  97 */     if (!this.a.playing("BgMusic") && !this.a.playing("streaming")) {
/*  98 */       if (this.i > 0) {
/*  99 */         this.i--;
/*     */         return;
/*     */       } 
/* 102 */       af af = this.d.a();
/* 103 */       if (af != null) {
/* 104 */         this.i = this.h.nextInt(24000) + 24000;
/* 105 */         this.a.backgroundMusic("BgMusic", af.b, af.a, false);
/* 106 */         this.a.play("BgMusic");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(fv paramfv, float paramFloat) {
/* 112 */     if (!this.g || !this.f.b)
/* 113 */       return;  if (paramfv == null)
/*     */       return; 
/* 115 */     float f1 = paramfv.ap + (paramfv.an - paramfv.ap) * paramFloat;
/*     */     
/* 117 */     double d1 = paramfv.ae + (paramfv.ah - paramfv.ae) * paramFloat;
/* 118 */     double d2 = paramfv.af + (paramfv.ai - paramfv.af) * paramFloat;
/* 119 */     double d3 = paramfv.ag + (paramfv.aj - paramfv.ag) * paramFloat;
/*     */     
/* 121 */     float f2 = ei.b(-f1 * 0.017453292F - 3.1415927F);
/* 122 */     float f3 = ei.a(-f1 * 0.017453292F - 3.1415927F);
/*     */     
/* 124 */     float f4 = -f3;
/* 125 */     float f5 = 0.0F;
/* 126 */     float f6 = -f2;
/*     */     
/* 128 */     float f7 = 0.0F;
/* 129 */     float f8 = 1.0F;
/* 130 */     float f9 = 0.0F;
/*     */     
/* 132 */     this.a.setListenerPosition((float)d1, (float)d2, (float)d3);
/* 133 */     this.a.setListenerOrientation(f4, f5, f6, f7, f8, f9);
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/* 137 */     if (!this.g || !this.f.b)
/* 138 */       return;  String str = "streaming";
/* 139 */     if (this.a.playing("streaming")) {
/* 140 */       this.a.stop("streaming");
/*     */     }
/* 142 */     if (paramString == null) {
/*     */       return;
/*     */     }
/*     */     
/* 146 */     af af = this.c.a(paramString);
/* 147 */     if (af != null && paramFloat4 > 0.0F) {
/* 148 */       if (this.a.playing("BgMusic")) {
/* 149 */         this.a.stop("BgMusic");
/*     */       }
/* 151 */       float f = 16.0F;
/* 152 */       this.a.newStreamingSource(true, str, af.b, af.a, false, paramFloat1, paramFloat2, paramFloat3, 2, f * 4.0F);
/* 153 */       this.a.setVolume(str, 0.5F);
/* 154 */       this.a.play(str);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/* 159 */     if (!this.g || !this.f.b)
/*     */       return; 
/* 161 */     af af = this.b.a(paramString);
/* 162 */     if (af != null && paramFloat4 > 0.0F) {
/* 163 */       this.e = (this.e + 1) % 256;
/* 164 */       String str = "sound_" + this.e;
/* 165 */       float f = 16.0F;
/* 166 */       if (paramFloat4 > 1.0F) f *= paramFloat4; 
/* 167 */       this.a.newSource((paramFloat4 > 1.0F), str, af.b, af.a, false, paramFloat1, paramFloat2, paramFloat3, 2, f);
/* 168 */       this.a.setPitch(str, paramFloat5);
/* 169 */       if (paramFloat4 > 1.0F) paramFloat4 = 1.0F; 
/* 170 */       this.a.setVolume(str, paramFloat4);
/* 171 */       this.a.play(str);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat1, float paramFloat2) {
/* 176 */     if (!this.g || !this.f.b)
/*     */       return; 
/* 178 */     af af = this.b.a(paramString);
/* 179 */     if (af != null) {
/* 180 */       this.e = (this.e + 1) % 256;
/* 181 */       String str = "sound_" + this.e;
/* 182 */       this.a.newSource(false, str, af.b, af.a, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
/* 183 */       if (paramFloat1 > 1.0F) paramFloat1 = 1.0F; 
/* 184 */       paramFloat1 *= 0.25F;
/* 185 */       this.a.setPitch(str, paramFloat2);
/* 186 */       this.a.setVolume(str, paramFloat1);
/* 187 */       this.a.play(str);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\nr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */