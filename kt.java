/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class kt
/*     */   implements ad
/*     */ {
/*     */   private File a;
/*     */   private boolean b;
/*     */   
/*     */   public kt(File paramFile, boolean paramBoolean) {
/*  17 */     this.a = paramFile;
/*  18 */     this.b = paramBoolean;
/*     */   }
/*     */   
/*     */   private File a(int paramInt1, int paramInt2) {
/*  22 */     String str1 = "c." + Integer.toString(paramInt1, 36) + "." + Integer.toString(paramInt2, 36) + ".dat";
/*  23 */     String str2 = Integer.toString(paramInt1 & 0x3F, 36);
/*  24 */     String str3 = Integer.toString(paramInt2 & 0x3F, 36);
/*  25 */     File file = new File(this.a, str2);
/*  26 */     if (!file.exists())
/*  27 */       if (this.b) { file.mkdir(); }
/*  28 */       else { return null; }
/*     */        
/*  30 */     file = new File(file, str3);
/*  31 */     if (!file.exists())
/*  32 */       if (this.b) { file.mkdir(); }
/*  33 */       else { return null; }
/*     */        
/*  35 */     file = new File(file, str1);
/*  36 */     if (!file.exists() && 
/*  37 */       !this.b) return null;
/*     */     
/*  39 */     return file;
/*     */   }
/*     */   
/*     */   public fr a(cj paramcj, int paramInt1, int paramInt2) {
/*  43 */     File file = a(paramInt1, paramInt2);
/*  44 */     if (file != null && file.exists()) {
/*     */       try {
/*  46 */         FileInputStream fileInputStream = new FileInputStream(file);
/*  47 */         hc hc = w.a(fileInputStream);
/*  48 */         if (!hc.b("Level")) {
/*  49 */           System.out.println("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing level data, skipping");
/*  50 */           return null;
/*     */         } 
/*  52 */         if (!hc.k("Level").b("Blocks")) {
/*  53 */           System.out.println("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing block data, skipping");
/*  54 */           return null;
/*     */         } 
/*  56 */         fr fr = a(paramcj, hc.k("Level"));
/*  57 */         if (!fr.a(paramInt1, paramInt2)) {
/*  58 */           System.out.println("Chunk file at " + paramInt1 + "," + paramInt2 + " is in the wrong location; relocating. (Expected " + paramInt1 + ", " + paramInt2 + ", got " + fr.j + ", " + fr.k + ")");
/*  59 */           hc.a("xPos", paramInt1);
/*  60 */           hc.a("zPos", paramInt2);
/*  61 */           fr = a(paramcj, hc.k("Level"));
/*     */         } 
/*  63 */         return fr;
/*  64 */       } catch (Exception exception) {
/*  65 */         exception.printStackTrace();
/*     */       } 
/*     */     }
/*  68 */     return null;
/*     */   }
/*     */   
/*     */   public void a(cj paramcj, fr paramfr) {
/*  72 */     paramcj.l();
/*  73 */     File file = a(paramfr.j, paramfr.k);
/*  74 */     if (file.exists()) {
/*  75 */       paramcj.s -= file.length();
/*     */     }
/*     */     
/*     */     try {
/*  79 */       File file1 = new File(this.a, "tmp_chunk.dat");
/*     */       
/*  81 */       FileOutputStream fileOutputStream = new FileOutputStream(file1);
/*  82 */       hc hc1 = new hc();
/*  83 */       hc hc2 = new hc();
/*  84 */       hc1.a("Level", hc2);
/*  85 */       a(paramfr, paramcj, hc2);
/*  86 */       w.a(hc1, fileOutputStream);
/*  87 */       fileOutputStream.close();
/*     */       
/*  89 */       if (file.exists()) {
/*  90 */         file.delete();
/*     */       }
/*  92 */       file1.renameTo(file);
/*     */       
/*  94 */       paramcj.s += file.length();
/*  95 */     } catch (Exception exception) {
/*  96 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(fr paramfr, cj paramcj, hc paramhc) {
/* 101 */     paramcj.l();
/* 102 */     paramhc.a("xPos", paramfr.j);
/* 103 */     paramhc.a("zPos", paramfr.k);
/* 104 */     paramhc.a("LastUpdate", paramcj.c);
/* 105 */     paramhc.a("Blocks", paramfr.b);
/* 106 */     paramhc.a("Data", paramfr.e.a);
/* 107 */     paramhc.a("SkyLight", paramfr.f.a);
/* 108 */     paramhc.a("BlockLight", paramfr.g.a);
/* 109 */     paramhc.a("HeightMap", paramfr.h);
/* 110 */     paramhc.a("TerrainPopulated", paramfr.n);
/*     */     
/* 112 */     paramfr.r = false;
/* 113 */     jy jy1 = new jy();
/* 114 */     for (byte b = 0; b < paramfr.m.length; b++) {
/* 115 */       for (jx jx : paramfr.m[b]) {
/* 116 */         paramfr.r = true;
/* 117 */         hc hc1 = new hc();
/* 118 */         if (jx.c(hc1)) {
/* 119 */           jy1.a(hc1);
/*     */         }
/*     */       } 
/*     */     } 
/* 123 */     paramhc.a("Entities", jy1);
/*     */     
/* 125 */     jy jy2 = new jy();
/* 126 */     for (ht ht : paramfr.l.values()) {
/* 127 */       hc hc1 = new hc();
/* 128 */       ht.b(hc1);
/* 129 */       jy2.a(hc1);
/*     */     } 
/* 131 */     paramhc.a("TileEntities", jy2);
/*     */   }
/*     */ 
/*     */   
/*     */   public static fr a(cj paramcj, hc paramhc) {
/* 136 */     int i = paramhc.e("xPos");
/* 137 */     int j = paramhc.e("zPos");
/*     */     
/* 139 */     fr fr = new fr(paramcj, i, j);
/* 140 */     fr.b = paramhc.j("Blocks");
/* 141 */     fr.e = new mi(paramhc.j("Data"));
/* 142 */     fr.f = new mi(paramhc.j("SkyLight"));
/* 143 */     fr.g = new mi(paramhc.j("BlockLight"));
/* 144 */     fr.h = paramhc.j("HeightMap");
/* 145 */     fr.n = paramhc.m("TerrainPopulated");
/*     */     
/* 147 */     if (!fr.e.a()) {
/* 148 */       fr.e = new mi(fr.b.length);
/*     */     }
/*     */     
/* 151 */     if (fr.h == null || !fr.f.a()) {
/* 152 */       fr.h = new byte[256];
/* 153 */       fr.f = new mi(fr.b.length);
/* 154 */       fr.c();
/*     */     } 
/*     */     
/* 157 */     if (!fr.g.a()) {
/* 158 */       fr.g = new mi(fr.b.length);
/* 159 */       fr.a();
/*     */     } 
/*     */     
/* 162 */     jy jy1 = paramhc.l("Entities");
/* 163 */     if (jy1 != null) {
/* 164 */       for (byte b = 0; b < jy1.c(); b++) {
/* 165 */         hc hc1 = (hc)jy1.a(b);
/* 166 */         jx jx = ep.a(hc1, paramcj);
/* 167 */         fr.r = true;
/* 168 */         if (jx != null) {
/* 169 */           fr.a(jx);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 174 */     jy jy2 = paramhc.l("TileEntities");
/* 175 */     if (jy2 != null) {
/* 176 */       for (byte b = 0; b < jy2.c(); b++) {
/* 177 */         hc hc1 = (hc)jy2.a(b);
/* 178 */         ht ht = ht.c(hc1);
/* 179 */         if (ht != null) {
/* 180 */           fr.a(ht);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 185 */     return fr;
/*     */   }
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public void b() {}
/*     */   
/*     */   public void b(cj paramcj, fr paramfr) {}
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\kt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */