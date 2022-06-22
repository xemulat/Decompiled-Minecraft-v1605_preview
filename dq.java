/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dq
/*     */ {
/*     */   public static final dq a() {
/*  17 */     return a;
/*     */   }
/*     */   
/*     */   private dq() {
/*  21 */     this.b = new ArrayList();
/*  22 */     (new dm()).a(this);
/*  23 */     (new mq()).a(this);
/*  24 */     (new ku()).a(this);
/*  25 */     (new hh()).a(this);
/*  26 */     (new fa()).a(this);
/*  27 */     (new m()).a(this);
/*  28 */     a(new eo(dd.aI, 3), new Object[] { "###", Character.valueOf('#'), dd.aH });
/*  29 */     a(new eo(dd.aJ, 1), new Object[] { "#", "#", "#", Character.valueOf('#'), dd.aI });
/*  30 */     a(new eo(ln.aY, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ln.x, Character.valueOf('X'), dd.l });
/*  31 */     a(new eo(ln.an, 1), new Object[] { "###", "XXX", "###", Character.valueOf('#'), ln.x, Character.valueOf('X'), dd.aJ });
/*  32 */     a(new eo(ln.aU, 1), new Object[] { "##", "##", Character.valueOf('#'), dd.aB });
/*  33 */     a(new eo(ln.aW, 1), new Object[] { "##", "##", Character.valueOf('#'), dd.aG });
/*  34 */     a(new eo(ln.al, 1), new Object[] { "##", "##", Character.valueOf('#'), dd.aF });
/*  35 */     a(new eo(ln.ab, 1), new Object[] { "###", "###", "###", Character.valueOf('#'), dd.I });
/*  36 */     a(new eo(ln.am, 1), new Object[] { "X#X", "#X#", "X#X", Character.valueOf('X'), dd.K, Character.valueOf('#'), ln.E });
/*  37 */     a(new eo(ln.ak, 3), new Object[] { "###", Character.valueOf('#'), ln.w });
/*  38 */     a(new eo(ln.aF, 1), new Object[] { "# #", "###", "# #", Character.valueOf('#'), dd.B });
/*  39 */     a(new eo(dd.at, 1), new Object[] { "##", "##", "##", Character.valueOf('#'), ln.x });
/*  40 */     a(new eo(dd.az, 1), new Object[] { "##", "##", "##", Character.valueOf('#'), dd.m });
/*  41 */     a(new eo(dd.as, 1), new Object[] { "###", "###", " X ", Character.valueOf('#'), ln.x, Character.valueOf('X'), dd.B });
/*  42 */     a(new eo(ln.x, 4), new Object[] { "#", Character.valueOf('#'), ln.J });
/*  43 */     a(new eo(dd.B, 4), new Object[] { "#", "#", Character.valueOf('#'), ln.x });
/*  44 */     a(new eo(ln.aq, 4), new Object[] { "X", "#", Character.valueOf('X'), dd.k, Character.valueOf('#'), dd.B });
/*  45 */     a(new eo(dd.C, 4), new Object[] { "# #", " # ", Character.valueOf('#'), ln.x });
/*  46 */     a(new eo(ln.aG, 16), new Object[] { "X X", "X#X", "X X", Character.valueOf('X'), dd.m, Character.valueOf('#'), dd.B });
/*  47 */     a(new eo(dd.ax, 1), new Object[] { "# #", "###", Character.valueOf('#'), dd.m });
/*  48 */     a(new eo(dd.aL, 1), new Object[] { "A", "B", Character.valueOf('A'), ln.au, Character.valueOf('B'), dd.ax });
/*  49 */     a(new eo(dd.aM, 1), new Object[] { "A", "B", Character.valueOf('A'), ln.aB, Character.valueOf('B'), dd.ax });
/*  50 */     a(new eo(dd.aC, 1), new Object[] { "# #", "###", Character.valueOf('#'), ln.x });
/*  51 */     a(new eo(dd.au, 1), new Object[] { "# #", " # ", Character.valueOf('#'), dd.m });
/*  52 */     a(new eo(dd.g, 1), new Object[] { "A ", " B", Character.valueOf('A'), dd.m, Character.valueOf('B'), dd.an });
/*  53 */     a(new eo(dd.S, 1), new Object[] { "###", Character.valueOf('#'), dd.R });
/*  54 */     a(new eo(ln.at, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), ln.x });
/*  55 */     a(new eo(ln.aH, 4), new Object[] { "#  ", "## ", "###", Character.valueOf('#'), ln.w });
/*  56 */     a(new eo(dd.aq, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dd.B, Character.valueOf('X'), ln.ab });
/*  57 */     a(new eo(dd.ar, 1), new Object[] { "###", "#X#", "###", Character.valueOf('#'), ln.ah, Character.valueOf('X'), dd.h });
/*  58 */     a(new eo(ln.aJ, 1), new Object[] { "X", "#", Character.valueOf('#'), ln.w, Character.valueOf('X'), dd.B });
/*  59 */     a(new eo(ln.aQ, 1), new Object[] { "X", "#", Character.valueOf('#'), dd.B, Character.valueOf('X'), dd.aA });
/*  60 */     a(new eo(ln.aR, 1), new Object[] { "#", "#", Character.valueOf('#'), ln.t });
/*  61 */     a(new eo(ln.aK, 1), new Object[] { "###", Character.valueOf('#'), ln.t });
/*  62 */     a(new eo(ln.aM, 1), new Object[] { "###", Character.valueOf('#'), ln.x });
/*  63 */     a(new eo(ln.PillarBlock, 4), new Object[] { "#X#", "X X", "#X#", Character.valueOf('#'), ln.x, Character.valueOf('X'), dd.B });
/*  64 */     a(new eo(ln.QuadWindowGlassBlock, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), ln.w, Character.valueOf('X'), ln.M });
/*  65 */     Collections.sort(this.b, new fj(this));
/*  66 */     System.out.println(this.b.size() + " recipes");
/*     */   }
/*     */   
/*     */   void a(eo parameo, Object... paramVarArgs) {
/*  70 */     String str = "";
/*  71 */     byte b1 = 0;
/*  72 */     int i = 0;
/*  73 */     byte b2 = 0;
/*  74 */     if (paramVarArgs[b1] instanceof String[]) {
/*  75 */       String[] arrayOfString = (String[])paramVarArgs[b1++];
/*  76 */       for (byte b = 0; b < arrayOfString.length; b++) {
/*  77 */         String str1 = arrayOfString[b];
/*  78 */         b2++;
/*  79 */         i = str1.length();
/*  80 */         str = str + str1;
/*     */       } 
/*     */     } else {
/*     */       
/*  84 */       while (paramVarArgs[b1] instanceof String) {
/*  85 */         String str1 = (String)paramVarArgs[b1++];
/*  86 */         b2++;
/*  87 */         i = str1.length();
/*  88 */         str = str + str1;
/*     */       } 
/*     */     } 
/*  91 */     HashMap<Object, Object> hashMap = new HashMap<>();
/*  92 */     while (b1 < paramVarArgs.length) {
/*  93 */       Character character = (Character)paramVarArgs[b1];
/*  94 */       int j = 0;
/*  95 */       if (paramVarArgs[b1 + 1] instanceof dd) {
/*  96 */         j = ((dd)paramVarArgs[b1 + 1]).aQ;
/*     */       }
/*  98 */       else if (paramVarArgs[b1 + 1] instanceof ln) {
/*  99 */         j = ((ln)paramVarArgs[b1 + 1]).ba;
/*     */       } 
/* 101 */       hashMap.put(character, Integer.valueOf(j));
/* 102 */       b1 += 2;
/*     */     } 
/* 104 */     int[] arrayOfInt = new int[i * b2];
/* 105 */     for (byte b3 = 0; b3 < i * b2; b3++) {
/* 106 */       char c = str.charAt(b3);
/* 107 */       if (hashMap.containsKey(Character.valueOf(c))) {
/* 108 */         arrayOfInt[b3] = ((Integer)hashMap.get(Character.valueOf(c))).intValue();
/*     */       } else {
/*     */         
/* 111 */         arrayOfInt[b3] = -1;
/*     */       } 
/*     */     } 
/* 114 */     this.b.add(new br(i, b2, arrayOfInt, parameo));
/*     */   }
/*     */   
/*     */   public eo a(int[] paramArrayOfint) {
/* 118 */     for (byte b = 0; b < this.b.size(); b++) {
/* 119 */       br br = this.b.get(b);
/* 120 */       if (br.a(paramArrayOfint)) {
/* 121 */         return br.b(paramArrayOfint);
/*     */       }
/*     */     } 
/* 124 */     return null;
/*     */   }
/*     */ 
/*     */   
/* 128 */   private static final dq a = new dq();
/*     */   private List b;
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\dq.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */