/*     */ package paulscode.sound;
/*     */ 
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
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
/*     */ public class StreamThread
/*     */   extends SimpleThread
/*     */ {
/*     */   private SoundSystemLogger logger;
/*     */   private List streamingSources;
/*  53 */   private final Object listLock = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamThread() {
/*  61 */     this.logger = SoundSystemConfig.getLogger();
/*     */     
/*  63 */     this.streamingSources = new LinkedList();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void cleanup() {
/*  73 */     kill();
/*  74 */     super.cleanup();
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
/*     */   public void run() {
/*     */     try {
/*  88 */       snooze(3600000L);
/*     */       
/*  90 */       while (!dying()) {
/*  91 */         while (!dying() && !this.streamingSources.isEmpty()) {
/*     */           
/*  93 */           synchronized (this.listLock) {
/*  94 */             ListIterator<Source> listIterator = this.streamingSources.listIterator();
/*  95 */             while (!dying() && listIterator.hasNext()) {
/*  96 */               Source source = listIterator.next();
/*  97 */               if (source == null) {
/*  98 */                 listIterator.remove(); continue;
/*  99 */               }  if (source.stopped()) {
/* 100 */                 if (!source.rawDataStream) listIterator.remove();  continue;
/* 101 */               }  if (!source.active()) {
/* 102 */                 if (source.toLoop || source.rawDataStream) source.toPlay = true; 
/* 103 */                 listIterator.remove(); continue;
/* 104 */               }  if (!source.paused()) {
/* 105 */                 source.checkFadeOut();
/* 106 */                 if (!source.stream() && !source.rawDataStream && (
/* 107 */                   source.channel == null || !source.channel.processBuffer())) {
/*     */                   
/* 109 */                   if (source.toLoop) {
/*     */                     
/* 111 */                     if (!source.playing()) {
/*     */ 
/*     */                       
/* 114 */                       if (source.checkFadeOut()) {
/*     */ 
/*     */ 
/*     */                         
/* 118 */                         source.preLoad = true;
/*     */ 
/*     */                         
/*     */                         continue;
/*     */                       } 
/*     */                       
/* 124 */                       source.incrementSoundSequence();
/* 125 */                       source.preLoad = true;
/*     */                     } 
/*     */                     
/*     */                     continue;
/*     */                   } 
/* 130 */                   if (!source.playing())
/*     */                   {
/*     */                     
/* 133 */                     if (!source.checkFadeOut()) {
/*     */ 
/*     */ 
/*     */                       
/* 137 */                       if (source.incrementSoundSequence()) { source.preLoad = true; continue; }
/* 138 */                        listIterator.remove();
/*     */                     } 
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */ 
/*     */           
/* 147 */           if (!dying() && !this.streamingSources.isEmpty()) snooze(20L); 
/*     */         } 
/* 149 */         if (!dying() && this.streamingSources.isEmpty()) snooze(3600000L);
/*     */       
/*     */       } 
/*     */     } finally {
/* 153 */       cleanup();
/*     */     } 
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
/*     */   public void watch(Source paramSource) {
/* 166 */     if (paramSource == null) {
/*     */       return;
/*     */     }
/* 169 */     if (this.streamingSources.contains(paramSource)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 175 */     synchronized (this.listLock) {
/*     */ 
/*     */ 
/*     */       
/* 179 */       ListIterator<Source> listIterator = this.streamingSources.listIterator();
/* 180 */       while (listIterator.hasNext()) {
/* 181 */         Source source = listIterator.next();
/* 182 */         if (source == null) {
/* 183 */           listIterator.remove(); continue;
/* 184 */         }  if (paramSource.channel == source.channel) {
/* 185 */           source.stop();
/* 186 */           listIterator.remove();
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 191 */       this.streamingSources.add(paramSource);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void message(String paramString) {
/* 201 */     this.logger.message(paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void importantMessage(String paramString) {
/* 210 */     this.logger.importantMessage(paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean errorCheck(boolean paramBoolean, String paramString) {
/* 221 */     return this.logger.errorCheck(paramBoolean, "StreamThread", paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void errorMessage(String paramString) {
/* 230 */     this.logger.errorMessage("StreamThread", paramString, 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\StreamThread.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */