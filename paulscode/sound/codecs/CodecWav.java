/*     */ package paulscode.sound.codecs;
/*     */ 
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.nio.ShortBuffer;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import javax.sound.sampled.AudioInputStream;
/*     */ import javax.sound.sampled.AudioSystem;
/*     */ import javax.sound.sampled.UnsupportedAudioFileException;
/*     */ import paulscode.sound.ICodec;
/*     */ import paulscode.sound.SoundBuffer;
/*     */ import paulscode.sound.SoundSystemConfig;
/*     */ import paulscode.sound.SoundSystemLogger;
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
/*     */ public class CodecWav
/*     */   implements ICodec
/*     */ {
/*     */   private static final boolean GET = false;
/*     */   private static final boolean SET = true;
/*     */   private static final boolean XXX = false;
/*     */   private boolean endOfStream = false;
/*     */   private boolean initialized = false;
/*  86 */   private AudioInputStream myAudioInputStream = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SoundSystemLogger logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reverseByteOrder(boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CodecWav() {
/* 105 */     this.logger = SoundSystemConfig.getLogger();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean initialize(URL paramURL) {
/* 116 */     initialized(true, false);
/* 117 */     cleanup();
/*     */     
/* 119 */     if (paramURL == null) {
/*     */       
/* 121 */       errorMessage("url null in method 'initialize'");
/* 122 */       cleanup();
/* 123 */       return false;
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 128 */       this.myAudioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(paramURL.openStream()));
/*     */     
/*     */     }
/* 131 */     catch (UnsupportedAudioFileException unsupportedAudioFileException) {
/*     */       
/* 133 */       errorMessage("Unsupported audio format in method 'initialize'");
/* 134 */       printStackTrace(unsupportedAudioFileException);
/* 135 */       return false;
/*     */     }
/* 137 */     catch (IOException iOException) {
/*     */       
/* 139 */       errorMessage("Error setting up audio input stream in method 'initialize'");
/*     */       
/* 141 */       printStackTrace(iOException);
/* 142 */       return false;
/*     */     } 
/*     */     
/* 145 */     endOfStream(true, false);
/* 146 */     initialized(true, true);
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean initialized() {
/* 156 */     return initialized(false, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SoundBuffer read() {
/* 167 */     if (this.myAudioInputStream == null) {
/* 168 */       return null;
/*     */     }
/*     */     
/* 171 */     AudioFormat audioFormat = this.myAudioInputStream.getFormat();
/*     */ 
/*     */     
/* 174 */     if (audioFormat == null) {
/*     */       
/* 176 */       errorMessage("Audio Format null in method 'read'");
/* 177 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 181 */     int i = 0, j = 0;
/*     */ 
/*     */     
/* 184 */     byte[] arrayOfByte1 = new byte[SoundSystemConfig.getStreamingBufferSize()];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 191 */       while (!endOfStream(false, false) && i < arrayOfByte1.length)
/*     */       {
/* 193 */         if ((j = this.myAudioInputStream.read(arrayOfByte1, i, arrayOfByte1.length - i)) <= 0) {
/*     */ 
/*     */ 
/*     */           
/* 197 */           endOfStream(true, true);
/*     */           
/*     */           break;
/*     */         } 
/* 201 */         i += j;
/*     */       }
/*     */     
/* 204 */     } catch (IOException iOException) {
/*     */ 
/*     */       
/* 207 */       endOfStream(true, true);
/* 208 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 212 */     if (i <= 0) {
/* 213 */       return null;
/*     */     }
/*     */     
/* 216 */     if (i < arrayOfByte1.length) {
/* 217 */       arrayOfByte1 = trimArray(arrayOfByte1, i);
/*     */     }
/*     */ 
/*     */     
/* 221 */     byte[] arrayOfByte2 = convertAudioBytes(arrayOfByte1, (audioFormat.getSampleSizeInBits() == 16));
/*     */ 
/*     */ 
/*     */     
/* 225 */     return new SoundBuffer(arrayOfByte2, audioFormat);
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
/*     */   public SoundBuffer readAll() {
/* 241 */     if (this.myAudioInputStream == null) {
/*     */       
/* 243 */       errorMessage("Audio input stream null in method 'readAll'");
/* 244 */       return null;
/*     */     } 
/* 246 */     AudioFormat audioFormat = this.myAudioInputStream.getFormat();
/*     */ 
/*     */     
/* 249 */     if (audioFormat == null) {
/*     */       
/* 251 */       errorMessage("Audio Format null in method 'readAll'");
/* 252 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 256 */     byte[] arrayOfByte1 = null;
/*     */ 
/*     */     
/* 259 */     int i = audioFormat.getChannels() * (int)this.myAudioInputStream.getFrameLength() * audioFormat.getSampleSizeInBits() / 8;
/*     */ 
/*     */     
/* 262 */     if (i > 0) {
/*     */ 
/*     */       
/* 265 */       arrayOfByte1 = new byte[audioFormat.getChannels() * (int)this.myAudioInputStream.getFrameLength() * audioFormat.getSampleSizeInBits() / 8];
/*     */ 
/*     */ 
/*     */       
/* 269 */       int j = 0, k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 276 */         while ((j = this.myAudioInputStream.read(arrayOfByte1, k, arrayOfByte1.length - k)) != -1 && k < arrayOfByte1.length)
/*     */         {
/* 278 */           k += j;
/*     */         }
/*     */       }
/* 281 */       catch (IOException iOException) {
/*     */         
/* 283 */         errorMessage("Exception thrown while reading from the AudioInputStream (location #1).");
/*     */         
/* 285 */         printStackTrace(iOException);
/* 286 */         return null;
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 294 */       int j = 0, k = 0, m = 0;
/* 295 */       byte[] arrayOfByte = null;
/*     */ 
/*     */       
/* 298 */       arrayOfByte = new byte[SoundSystemConfig.getFileChunkSize()];
/*     */ 
/*     */       
/* 301 */       while (!endOfStream(false, false) && j < SoundSystemConfig.getMaxFileSize()) {
/*     */ 
/*     */         
/* 304 */         k = 0;
/* 305 */         m = 0;
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 310 */           while (k < arrayOfByte.length)
/*     */           {
/* 312 */             if ((m = this.myAudioInputStream.read(arrayOfByte, k, arrayOfByte.length - k)) <= 0) {
/*     */ 
/*     */ 
/*     */               
/* 316 */               endOfStream(true, true);
/*     */               break;
/*     */             } 
/* 319 */             k += m;
/*     */           }
/*     */         
/* 322 */         } catch (IOException iOException) {
/*     */           
/* 324 */           errorMessage("Exception thrown while reading from the AudioInputStream (location #2).");
/*     */           
/* 326 */           printStackTrace(iOException);
/* 327 */           return null;
/*     */         } 
/*     */ 
/*     */         
/* 331 */         j += k;
/*     */ 
/*     */         
/* 334 */         arrayOfByte1 = appendByteArrays(arrayOfByte1, arrayOfByte, k);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 340 */     byte[] arrayOfByte2 = convertAudioBytes(arrayOfByte1, (audioFormat.getSampleSizeInBits() == 16));
/*     */ 
/*     */ 
/*     */     
/* 344 */     SoundBuffer soundBuffer = new SoundBuffer(arrayOfByte2, audioFormat);
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 349 */       this.myAudioInputStream.close();
/*     */     }
/* 351 */     catch (IOException iOException) {}
/*     */ 
/*     */ 
/*     */     
/* 355 */     return soundBuffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean endOfStream() {
/* 364 */     return endOfStream(false, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanup() {
/* 372 */     if (this.myAudioInputStream != null) {
/*     */       
/*     */       try {
/* 375 */         this.myAudioInputStream.close();
/*     */       }
/* 377 */       catch (Exception exception) {}
/*     */     }
/* 379 */     this.myAudioInputStream = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioFormat getAudioFormat() {
/* 389 */     if (this.myAudioInputStream == null)
/* 390 */       return null; 
/* 391 */     return this.myAudioInputStream.getFormat();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private synchronized boolean initialized(boolean paramBoolean1, boolean paramBoolean2) {
/* 402 */     if (paramBoolean1 == true)
/* 403 */       this.initialized = paramBoolean2; 
/* 404 */     return this.initialized;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private synchronized boolean endOfStream(boolean paramBoolean1, boolean paramBoolean2) {
/* 415 */     if (paramBoolean1 == true)
/* 416 */       this.endOfStream = paramBoolean2; 
/* 417 */     return this.endOfStream;
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
/*     */   private static byte[] trimArray(byte[] paramArrayOfbyte, int paramInt) {
/* 429 */     byte[] arrayOfByte = null;
/* 430 */     if (paramArrayOfbyte != null && paramArrayOfbyte.length > paramInt) {
/*     */       
/* 432 */       arrayOfByte = new byte[paramInt];
/* 433 */       System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramInt);
/*     */     } 
/* 435 */     return arrayOfByte;
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
/*     */   private static byte[] convertAudioBytes(byte[] paramArrayOfbyte, boolean paramBoolean) {
/* 447 */     ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(paramArrayOfbyte.length);
/* 448 */     byteBuffer1.order(ByteOrder.nativeOrder());
/* 449 */     ByteBuffer byteBuffer2 = ByteBuffer.wrap(paramArrayOfbyte);
/* 450 */     byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
/* 451 */     if (paramBoolean) {
/*     */       
/* 453 */       ShortBuffer shortBuffer1 = byteBuffer1.asShortBuffer();
/* 454 */       ShortBuffer shortBuffer2 = byteBuffer2.asShortBuffer();
/* 455 */       while (shortBuffer2.hasRemaining())
/*     */       {
/* 457 */         shortBuffer1.put(shortBuffer2.get());
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 462 */       while (byteBuffer2.hasRemaining())
/*     */       {
/* 464 */         byteBuffer1.put(byteBuffer2.get());
/*     */       }
/*     */     } 
/* 467 */     byteBuffer1.rewind();
/*     */     
/* 469 */     if (!byteBuffer1.hasArray()) {
/*     */       
/* 471 */       byte[] arrayOfByte = new byte[byteBuffer1.capacity()];
/* 472 */       byteBuffer1.get(arrayOfByte);
/* 473 */       byteBuffer1.clear();
/*     */       
/* 475 */       return arrayOfByte;
/*     */     } 
/*     */     
/* 478 */     return byteBuffer1.array();
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
/*     */   private static byte[] appendByteArrays(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
/*     */     byte[] arrayOfByte;
/* 493 */     if (paramArrayOfbyte1 == null && paramArrayOfbyte2 == null)
/*     */     {
/*     */       
/* 496 */       return null;
/*     */     }
/* 498 */     if (paramArrayOfbyte1 == null) {
/*     */ 
/*     */       
/* 501 */       arrayOfByte = new byte[paramInt];
/*     */       
/* 503 */       System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, paramInt);
/* 504 */       paramArrayOfbyte2 = null;
/*     */     }
/* 506 */     else if (paramArrayOfbyte2 == null) {
/*     */ 
/*     */       
/* 509 */       arrayOfByte = new byte[paramArrayOfbyte1.length];
/*     */       
/* 511 */       System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
/* 512 */       paramArrayOfbyte1 = null;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 517 */       arrayOfByte = new byte[paramArrayOfbyte1.length + paramInt];
/* 518 */       System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
/*     */       
/* 520 */       System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramInt);
/*     */       
/* 522 */       paramArrayOfbyte1 = null;
/* 523 */       paramArrayOfbyte2 = null;
/*     */     } 
/*     */     
/* 526 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void errorMessage(String paramString) {
/* 535 */     this.logger.errorMessage("CodecWav", paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void printStackTrace(Exception paramException) {
/* 544 */     this.logger.printStackTrace(paramException, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\codecs\CodecWav.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */