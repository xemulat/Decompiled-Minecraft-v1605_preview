/*     */ import java.awt.Toolkit;
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.datatransfer.Transferable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import org.lwjgl.Sys;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bd
/*     */   extends lb
/*     */ {
/*  24 */   public static String currentID = "";
/*     */ 
/*     */   
/*  27 */   protected List e = new ArrayList();
/*     */   public boolean f = false;
/*     */   protected Minecraft b;
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/*  32 */     for (byte b = 0; b < this.e.size(); b++)
/*  33 */       ((fb)this.e.get(b)).a(this.b, paramInt1, paramInt2); 
/*     */   }
/*     */   public int c; public int d; protected jt g;
/*     */   
/*     */   protected void a(char paramChar, int paramInt) {
/*  38 */     if (paramInt == 1) {
/*  39 */       this.b.a((bd)null);
/*  40 */       this.b.e();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String c() {
/*     */     try {
/*  46 */       Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
/*  47 */       if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
/*  48 */         return (String)transferable.getTransferData(DataFlavor.stringFlavor);
/*     */       }
/*     */     }
/*  51 */     catch (Exception exception) {}
/*  52 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3) {
/*  56 */     if (paramInt3 == 0) {
/*  57 */       for (byte b = 0; b < this.e.size(); b++) {
/*  58 */         fb fb = this.e.get(b);
/*  59 */         if (fb.a(paramInt1, paramInt2)) {
/*  60 */           this.b.A.a("random.click", 1.0F, 1.0F);
/*  61 */           a(fb);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3) {}
/*     */ 
/*     */   
/*     */   protected void a(fb paramfb) {}
/*     */   
/*     */   public void a(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
/*  74 */     this.b = paramMinecraft;
/*  75 */     this.g = paramMinecraft.o;
/*  76 */     this.c = paramInt1;
/*  77 */     this.d = paramInt2;
/*  78 */     a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public void d() {
/*  85 */     while (Mouse.next()) {
/*  86 */       e();
/*     */     }
/*  88 */     while (Keyboard.next()) {
/*  89 */       f();
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/*  94 */     if (Mouse.getEventButtonState()) {
/*  95 */       a(Mouse.getEventX() * this.c / this.b.c, this.d - Mouse.getEventY() * this.d / this.b.d - 1, Mouse.getEventButton());
/*     */     } else {
/*     */       
/*  98 */       b(Mouse.getEventX() * this.c / this.b.c, this.d - Mouse.getEventY() * this.d / this.b.d - 1, Mouse.getEventButton());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() {
/* 103 */     if (Keyboard.getEventKeyState()) {
/* 104 */       if (Keyboard.getEventKey() == 79) {
/* 105 */         currentID += '1';
/* 106 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 108 */       else if (Keyboard.getEventKey() == 80) {
/* 109 */         currentID += '2';
/* 110 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 112 */       else if (Keyboard.getEventKey() == 81) {
/* 113 */         currentID += '3';
/* 114 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 116 */       else if (Keyboard.getEventKey() == 75) {
/* 117 */         currentID += '4';
/* 118 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 120 */       else if (Keyboard.getEventKey() == 76) {
/* 121 */         currentID += '5';
/* 122 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 124 */       else if (Keyboard.getEventKey() == 77) {
/* 125 */         currentID += '6';
/* 126 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 128 */       else if (Keyboard.getEventKey() == 71) {
/* 129 */         currentID += '7';
/* 130 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 132 */       else if (Keyboard.getEventKey() == 72) {
/* 133 */         currentID += '8';
/* 134 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 136 */       else if (Keyboard.getEventKey() == 73) {
/* 137 */         currentID += '9';
/* 138 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 140 */       else if (Keyboard.getEventKey() == 82) {
/* 141 */         currentID += '0';
/* 142 */         System.out.println("Current entered ID: " + currentID);
/*     */       }
/* 144 */       else if (Keyboard.getEventKey() == 74) {
/* 145 */         currentID = "";
/*     */       }
/* 147 */       else if (Keyboard.getEventKey() == 78) {
/*     */         try {
/* 149 */           if (ln.n.length > Integer.parseInt(currentID) && ln.n[Integer.parseInt(currentID)] != null) {
/* 150 */             if (Integer.parseInt(currentID) == 97) {
/* 151 */               Sys.alert("", "Block not available in preview version");
/*     */             } else {
/* 153 */               this.b.g.a(new eo(ln.n[Integer.parseInt(currentID)], 64), true);
/* 154 */               System.out.println("Given block to the player");
/*     */             }
/*     */           
/* 157 */           } else if (dd.c[Integer.parseInt(currentID)] != null) {
/* 158 */             this.b.g.a(new eo(dd.c[Integer.parseInt(currentID)], 1), true);
/* 159 */             System.out.println("Given item to the player");
/*     */           } else {
/*     */             
/* 162 */             System.out.println("No block or item with ID " + currentID);
/*     */           }
/*     */         
/* 165 */         } catch (Exception exception) {
/* 166 */           exception.printStackTrace();
/*     */         } 
/*     */       } 
/* 169 */       if (Keyboard.getEventKey() == 87) {
/* 170 */         this.b.h();
/*     */         return;
/*     */       } 
/* 173 */       a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void g() {}
/*     */ 
/*     */   
/*     */   public void h() {}
/*     */   
/*     */   public void i() {
/* 184 */     a(0);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 188 */     if (this.b.e != null) {
/* 189 */       a(0, 0, this.c, this.d, -1072689136, -804253680);
/*     */     } else {
/*     */       
/* 192 */       b(paramInt);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 197 */     GL11.glDisable(2896);
/* 198 */     GL11.glDisable(2912);
/* 199 */     he he = he.a;
/* 200 */     GL11.glBindTexture(3553, this.b.n.a("/dirt.png"));
/* 201 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 202 */     he.b();
/* 203 */     he.b(4210752);
/* 204 */     he.a(0.0D, this.d, 0.0D, 0.0D, (this.d / 32.0F + paramInt));
/* 205 */     he.a(this.c, this.d, 0.0D, (this.c / 32.0F), (this.d / 32.0F + paramInt));
/* 206 */     he.a(this.c, 0.0D, 0.0D, (this.c / 32.0F), (0 + paramInt));
/* 207 */     he.a(0.0D, 0.0D, 0.0D, 0.0D, (0 + paramInt));
/* 208 */     he.a();
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 212 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt) {}
/*     */   
/*     */   static {
/* 219 */     currentID = "";
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\bd.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */