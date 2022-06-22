/*     */ package paulscode.sound;
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
/*     */ public class CommandThread
/*     */   extends SimpleThread
/*     */ {
/*     */   protected SoundSystemLogger logger;
/*     */   private SoundSystem soundSystem;
/*  65 */   protected String className = "CommandThread";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandThread(SoundSystem paramSoundSystem) {
/*  74 */     this.logger = SoundSystemConfig.getLogger();
/*     */     
/*  76 */     this.soundSystem = paramSoundSystem;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void cleanup() {
/*  86 */     kill();
/*     */     
/*  88 */     this.logger = null;
/*  89 */     this.soundSystem = null;
/*     */     
/*  91 */     super.cleanup();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/* 102 */     long l1 = System.currentTimeMillis();
/* 103 */     long l2 = l1;
/*     */     
/* 105 */     if (this.soundSystem == null) {
/*     */       
/* 107 */       errorMessage("SoundSystem was null in method run().", 0);
/* 108 */       cleanup();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 113 */     snooze(3600000L);
/*     */     
/* 115 */     while (!dying()) {
/*     */ 
/*     */       
/* 118 */       this.soundSystem.ManageSources();
/*     */ 
/*     */       
/* 121 */       this.soundSystem.CommandQueue(null);
/*     */ 
/*     */       
/* 124 */       l2 = System.currentTimeMillis();
/* 125 */       if (!dying() && l2 - l1 > 10000L) {
/*     */         
/* 127 */         l1 = l2;
/* 128 */         this.soundSystem.removeTemporarySources();
/*     */       } 
/*     */ 
/*     */       
/* 132 */       if (!dying()) {
/* 133 */         snooze(3600000L);
/*     */       }
/*     */     } 
/* 136 */     cleanup();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void message(String paramString, int paramInt) {
/* 145 */     this.logger.message(paramString, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void importantMessage(String paramString, int paramInt) {
/* 154 */     this.logger.importantMessage(paramString, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean errorCheck(boolean paramBoolean, String paramString) {
/* 165 */     return this.logger.errorCheck(paramBoolean, this.className, paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void errorMessage(String paramString, int paramInt) {
/* 174 */     this.logger.errorMessage(this.className, paramString, paramInt);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\CommandThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */