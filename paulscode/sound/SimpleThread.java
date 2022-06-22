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
/*     */ public class SimpleThread
/*     */   extends Thread
/*     */ {
/*     */   private static final boolean GET = false;
/*     */   private static final boolean SET = true;
/*     */   private static final boolean XXX = false;
/*     */   private boolean alive = true;
/*     */   private boolean kill = false;
/*     */   
/*     */   protected void cleanup() {
/*  81 */     kill(true, true);
/*  82 */     alive(true, false);
/*     */   }
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
/*     */   public void run() {
/* 101 */     cleanup();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void restart() {
/* 110 */     (new SimpleThread$1(this)).start();
/*     */   }
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
/*     */   private void rerun() {
/* 125 */     kill(true, true);
/* 126 */     while (alive(false, false))
/*     */     {
/* 128 */       snooze(100L);
/*     */     }
/* 130 */     alive(true, true);
/* 131 */     kill(true, false);
/* 132 */     run();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean alive() {
/* 142 */     return alive(false, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void kill() {
/* 151 */     kill(true, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean dying() {
/* 160 */     return kill(false, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private synchronized boolean alive(boolean paramBoolean1, boolean paramBoolean2) {
/* 171 */     if (paramBoolean1 == true)
/* 172 */       this.alive = paramBoolean2; 
/* 173 */     return this.alive;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private synchronized boolean kill(boolean paramBoolean1, boolean paramBoolean2) {
/* 184 */     if (paramBoolean1 == true)
/* 185 */       this.kill = paramBoolean2; 
/* 186 */     return this.kill;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void snooze(long paramLong) {
/*     */     try {
/* 196 */       Thread.sleep(paramLong);
/*     */     }
/* 198 */     catch (InterruptedException interruptedException) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\SimpleThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */