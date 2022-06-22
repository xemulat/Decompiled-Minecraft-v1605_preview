/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.PrintWriter;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ public class fi
/*     */ {
/*  12 */   private static final String[] x = new String[] { "FAR", "NORMAL", "SHORT", "TINY" };
/*  13 */   private static final String[] y = new String[] { "Peaceful", "Easy", "Normal", "Hard" };
/*     */   
/*     */   public boolean a = true;
/*     */   public boolean b = true;
/*     */   public boolean c = false;
/*     */   public boolean d = false;
/*  19 */   public int e = 0;
/*     */   
/*     */   public boolean f = true;
/*     */   public boolean g = false;
/*     */   public boolean h = false;
/*     */   public boolean i = true;
/*  25 */   public ij j = new ij("Forward", 17);
/*  26 */   public ij k = new ij("Left", 30);
/*  27 */   public ij l = new ij("Back", 31);
/*  28 */   public ij m = new ij("Right", 32);
/*  29 */   public ij n = new ij("Jump", 57);
/*  30 */   public ij o = new ij("Inventory", 23);
/*  31 */   public ij p = new ij("Drop", 16);
/*  32 */   public ij q = new ij("Chat", 20);
/*  33 */   public ij r = new ij("Toggle fog", 33);
/*     */   
/*  35 */   public ij[] s = new ij[] { this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r };
/*     */ 
/*     */   
/*     */   protected Minecraft t;
/*     */   
/*     */   private File z;
/*     */   
/*  42 */   public int u = 10;
/*  43 */   public int v = 2;
/*     */   public boolean w = false;
/*     */   
/*     */   public fi(Minecraft paramMinecraft, File paramFile) {
/*  47 */     this.t = paramMinecraft;
/*  48 */     this.z = new File(paramFile, "options.txt");
/*  49 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public fi() {}
/*     */   
/*     */   public String a(int paramInt) {
/*  56 */     return (this.s[paramInt]).a + ": " + Keyboard.getKeyName((this.s[paramInt]).b);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/*  60 */     (this.s[paramInt1]).b = paramInt2;
/*  61 */     b();
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {
/*  65 */     if (paramInt1 == 0) {
/*  66 */       this.a = !this.a;
/*  67 */       this.t.A.a();
/*     */     } 
/*  69 */     if (paramInt1 == 1) {
/*  70 */       this.b = !this.b;
/*  71 */       this.t.A.a();
/*     */     } 
/*  73 */     if (paramInt1 == 2) this.c = !this.c; 
/*  74 */     if (paramInt1 == 3) this.d = !this.d; 
/*  75 */     if (paramInt1 == 4) this.e = this.e + paramInt2 & 0x3; 
/*  76 */     if (paramInt1 == 5) this.f = !this.f; 
/*  77 */     if (paramInt1 == 6) {
/*  78 */       this.g = !this.g;
/*  79 */       this.t.n.b();
/*     */     } 
/*  81 */     if (paramInt1 == 7) this.h = !this.h; 
/*  82 */     if (paramInt1 == 8) this.v = this.v + paramInt2 & 0x3; 
/*  83 */     if (paramInt1 == 9) {
/*  84 */       this.i = !this.i;
/*  85 */       this.t.f.a();
/*     */     } 
/*  87 */     b();
/*     */   }
/*     */   
/*     */   public String b(int paramInt) {
/*  91 */     if (paramInt == 0) return "Music: " + (this.a ? "ON" : "OFF"); 
/*  92 */     if (paramInt == 1) return "Sound: " + (this.b ? "ON" : "OFF"); 
/*  93 */     if (paramInt == 2) return "Invert mouse: " + (this.c ? "ON" : "OFF"); 
/*  94 */     if (paramInt == 3) return "Show FPS: " + (this.d ? "ON" : "OFF"); 
/*  95 */     if (paramInt == 4) return "Render distance: " + x[this.e]; 
/*  96 */     if (paramInt == 5) return "View bobbing: " + (this.f ? "ON" : "OFF"); 
/*  97 */     if (paramInt == 6) return "3d anaglyph: " + (this.g ? "ON" : "OFF"); 
/*  98 */     if (paramInt == 7) return "Limit framerate: " + (this.h ? "ON" : "OFF"); 
/*  99 */     if (paramInt == 8) return "Difficulty: " + y[this.v]; 
/* 100 */     if (paramInt == 9) return "Graphics: " + (this.i ? "FANCY" : "FAST"); 
/* 101 */     return "";
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     try {
/* 106 */       if (!this.z.exists())
/* 107 */         return;  BufferedReader bufferedReader = new BufferedReader(new FileReader(this.z));
/* 108 */       String str = "";
/* 109 */       while ((str = bufferedReader.readLine()) != null) {
/* 110 */         String[] arrayOfString = str.split(":");
/* 111 */         if (arrayOfString[0].equals("music")) this.a = arrayOfString[1].equals("true"); 
/* 112 */         if (arrayOfString[0].equals("sound")) this.b = arrayOfString[1].equals("true"); 
/* 113 */         if (arrayOfString[0].equals("invertYMouse")) this.c = arrayOfString[1].equals("true"); 
/* 114 */         if (arrayOfString[0].equals("showFrameRate")) this.d = arrayOfString[1].equals("true"); 
/* 115 */         if (arrayOfString[0].equals("viewDistance")) this.e = Integer.parseInt(arrayOfString[1]); 
/* 116 */         if (arrayOfString[0].equals("bobView")) this.f = arrayOfString[1].equals("true"); 
/* 117 */         if (arrayOfString[0].equals("anaglyph3d")) this.g = arrayOfString[1].equals("true"); 
/* 118 */         if (arrayOfString[0].equals("limitFramerate")) this.h = arrayOfString[1].equals("true"); 
/* 119 */         if (arrayOfString[0].equals("difficulty")) this.v = Integer.parseInt(arrayOfString[1]); 
/* 120 */         if (arrayOfString[0].equals("fancyGraphics")) this.i = arrayOfString[1].equals("true");
/*     */         
/* 122 */         for (byte b = 0; b < this.s.length; b++) {
/* 123 */           if (arrayOfString[0].equals("key_" + (this.s[b]).a)) {
/* 124 */             (this.s[b]).b = Integer.parseInt(arrayOfString[1]);
/*     */           }
/*     */         } 
/*     */       } 
/* 128 */       bufferedReader.close();
/* 129 */     } catch (Exception exception) {
/* 130 */       System.out.println("Failed to load options");
/* 131 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/*     */     try {
/* 137 */       PrintWriter printWriter = new PrintWriter(new FileWriter(this.z));
/*     */       
/* 139 */       printWriter.println("music:" + this.a);
/* 140 */       printWriter.println("sound:" + this.b);
/* 141 */       printWriter.println("invertYMouse:" + this.c);
/* 142 */       printWriter.println("showFrameRate:" + this.d);
/* 143 */       printWriter.println("viewDistance:" + this.e);
/* 144 */       printWriter.println("bobView:" + this.f);
/* 145 */       printWriter.println("anaglyph3d:" + this.g);
/* 146 */       printWriter.println("limitFramerate:" + this.h);
/* 147 */       printWriter.println("difficulty:" + this.v);
/* 148 */       printWriter.println("fancyGraphics:" + this.i);
/*     */       
/* 150 */       for (byte b = 0; b < this.s.length; b++) {
/* 151 */         printWriter.println("key_" + (this.s[b]).a + ":" + (this.s[b]).b);
/*     */       }
/*     */       
/* 154 */       printWriter.close();
/* 155 */     } catch (Exception exception) {
/* 156 */       System.out.println("Failed to save options");
/* 157 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */