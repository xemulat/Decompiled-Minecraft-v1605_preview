/*     */ import org.lwjgl.input.Controller;
/*     */ import org.lwjgl.input.Controllers;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ 
/*     */ public class InputHandler
/*     */ {
/*     */   public static Controller[] gamepads;
/*     */   public static Controller activeGamepad;
/*  10 */   public static int EventDWheel = -1;
/*  11 */   public static int EventButton = -1;
/*  12 */   public static int EventDX = -1;
/*  13 */   public static int EventDY = -1;
/*  14 */   public static int EventX = -1;
/*  15 */   public static int EventY = -1;
/*     */   
/*     */   public static boolean axis4isMinusOne = true;
/*     */   public static boolean EventButtonState = false;
/*     */   public static boolean pushedGamepadEvent = false;
/*     */   public static boolean LastR1Press = false;
/*     */   public static boolean LastL1Press = false;
/*     */   public static boolean LastR2Press = false;
/*     */   public static boolean LastL2Press = false;
/*     */   public static boolean LastStartPress = false;
/*     */   
/*     */   public static void UpdateAxis3() {
/*  27 */     if (activeGamepad != null && 
/*  28 */       axis4isMinusOne && activeGamepad.getAxisValue(4) != -1.0D) {
/*  29 */       axis4isMinusOne = false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void CaptureGamepad() {
/*  36 */     gamepads = new Controller[Controllers.getControllerCount()];
/*  37 */     for (byte b = 0; b != gamepads.length; b++) {
/*     */       
/*     */       try {
/*  40 */         gamepads[b] = Controllers.getController(b);
/*  41 */         if (!gamepads[b].getName().toLowerCase().contains("controller (")) {
/*  42 */           gamepads[b] = null;
/*     */         } else {
/*  44 */           activeGamepad = gamepads[b];
/*  45 */           System.out.println("Captured: " + gamepads[b].getName());
/*     */         } 
/*  47 */       } catch (NullPointerException nullPointerException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void InputR1() {
/*  54 */     LastR1Press = activeGamepad.isButtonPressed(5);
/*  55 */     EventDWheel = LastR1Press ? -1 : 0;
/*  56 */     EventDX = 0;
/*  57 */     EventDY = 0;
/*  58 */     EventButton = -1;
/*  59 */     EventButtonState = false;
/*  60 */     pushedGamepadEvent = true;
/*     */   }
/*     */   public static void InputR2() {
/*  63 */     LastR2Press = (activeGamepad.getAxisValue(4) < -0.4F);
/*  64 */     EventDWheel = 0;
/*  65 */     EventDX = 0;
/*  66 */     EventDY = 0;
/*  67 */     EventButton = 0;
/*  68 */     EventButtonState = LastR2Press;
/*  69 */     pushedGamepadEvent = true;
/*     */   }
/*     */   public static void InputL1() {
/*  72 */     LastL1Press = activeGamepad.isButtonPressed(4);
/*  73 */     EventDWheel = LastL1Press ? 1 : 0;
/*  74 */     EventDX = 0;
/*  75 */     EventDY = 0;
/*  76 */     EventButton = -1;
/*  77 */     EventButtonState = false;
/*  78 */     pushedGamepadEvent = true;
/*     */   }
/*     */   public static void InputL2() {
/*  81 */     LastL2Press = (activeGamepad.getAxisValue(4) > 0.4F);
/*  82 */     EventDWheel = 0;
/*  83 */     EventDX = 0;
/*  84 */     EventDY = 0;
/*  85 */     EventButton = 1;
/*  86 */     EventButtonState = LastL2Press;
/*  87 */     pushedGamepadEvent = true;
/*     */   }
/*     */   
/*     */   public static void InputA() {
/*  91 */     LastAPress = activeGamepad.isButtonPressed(0);
/*  92 */     KBEventKey = 57;
/*  93 */     KBEventKeyState = LastAPress;
/*     */   }
/*     */   public static void InputStart() {
/*  96 */     LastStartPress = activeGamepad.isButtonPressed(7);
/*  97 */     KBEventKey = 1;
/*  98 */     KBEventKeyState = LastStartPress;
/*     */   }
/*     */   
/* 101 */   public static int KBEventKey = -1;
/*     */   
/*     */   public static boolean KBEventKeyState = false;
/*     */   public static boolean LastAPress = false;
/*     */   
/*     */   public static boolean NextKBEvent() {
/* 107 */     if (Keyboard.next()) {
/* 108 */       KBEventKey = Keyboard.getEventKey();
/* 109 */       KBEventKeyState = Keyboard.getEventKeyState();
/* 110 */       return true;
/* 111 */     }  if (activeGamepad != null) {
/* 112 */       if (LastAPress != activeGamepad.isButtonPressed(0)) {
/* 113 */         InputA();
/* 114 */         return true;
/* 115 */       }  if (LastStartPress != activeGamepad.isButtonPressed(7)) {
/* 116 */         InputStart();
/* 117 */         return true;
/*     */       } 
/*     */     } 
/* 120 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean NextEvent() {
/* 124 */     UpdateAxis3();
/* 125 */     if (Mouse.next()) {
/* 126 */       EventDWheel = Mouse.getEventDWheel();
/* 127 */       EventButton = Mouse.getEventButton();
/* 128 */       EventDX = Mouse.getEventDX();
/* 129 */       EventDY = Mouse.getEventDY();
/* 130 */       EventButtonState = Mouse.getEventButtonState();
/* 131 */       EventX = Mouse.getEventX();
/* 132 */       EventY = Mouse.getEventY();
/* 133 */       pushedGamepadEvent = false;
/* 134 */       return true;
/* 135 */     }  if (activeGamepad != null) {
/* 136 */       if (LastR1Press != activeGamepad.isButtonPressed(5)) {
/* 137 */         InputR1();
/* 138 */         return true;
/* 139 */       }  if (LastL1Press != activeGamepad.isButtonPressed(4)) {
/* 140 */         InputL1();
/* 141 */         return true;
/* 142 */       }  if (LastR2Press != ((activeGamepad.getAxisValue(4) < -0.4F))) {
/* 143 */         InputR2();
/* 144 */         return true;
/* 145 */       }  if (LastL2Press != ((activeGamepad.getAxisValue(4) > 0.4F))) {
/* 146 */         InputL2();
/* 147 */         return true;
/*     */       } 
/*     */     } 
/* 150 */     return false;
/*     */   }
/*     */   
/*     */   public static int GetDWheel() {
/* 154 */     return EventDWheel;
/*     */   }
/*     */   public static int GetEventButton() {
/* 157 */     return EventButton;
/*     */   }
/*     */   public static int GetEventDX() {
/* 160 */     return EventDX;
/*     */   }
/*     */   public static int GetEventDY() {
/* 163 */     return EventDY;
/*     */   }
/*     */   public static int GetEventX() {
/* 166 */     return EventX;
/*     */   }
/*     */   public static int GetEventY() {
/* 169 */     return EventY;
/*     */   }
/*     */   public static boolean GetEventButtonState() {
/* 172 */     return EventButtonState;
/*     */   }
/*     */   
/*     */   public static int GetKBEventKey() {
/* 176 */     return KBEventKey;
/*     */   }
/*     */   public static boolean GetKBEventKeyState() {
/* 179 */     return KBEventKeyState;
/*     */   }
/*     */   
/*     */   public static boolean IsKeyDown(int paramInt) {
/* 183 */     boolean bool = false;
/* 184 */     if (paramInt == 57 && activeGamepad != null) {
/* 185 */       bool = activeGamepad.isButtonPressed(0);
/*     */     }
/* 187 */     return (Keyboard.isKeyDown(paramInt) || bool);
/*     */   }
/*     */   
/*     */   public static boolean InputMouseAction(int paramInt) {
/* 191 */     if (activeGamepad != null && !axis4isMinusOne) {
/* 192 */       return (Mouse.isButtonDown(paramInt) || ((paramInt == 0) ? (activeGamepad.getAxisValue(4) < -0.4F) : (paramInt == 1 && activeGamepad.getAxisValue(4) > 0.4F)));
/*     */     }
/* 194 */     return Mouse.isButtonDown(paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\InputHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */