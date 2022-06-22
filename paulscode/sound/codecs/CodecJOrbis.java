/*     */ package paulscode.sound.codecs;
/*     */ 
/*     */ import com.jcraft.jogg.Packet;
/*     */ import com.jcraft.jogg.Page;
/*     */ import com.jcraft.jogg.StreamState;
/*     */ import com.jcraft.jogg.SyncState;
/*     */ import com.jcraft.jorbis.Block;
/*     */ import com.jcraft.jorbis.Comment;
/*     */ import com.jcraft.jorbis.DspState;
/*     */ import com.jcraft.jorbis.Info;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.net.UnknownServiceException;
/*     */ import javax.sound.sampled.AudioFormat;
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
/*     */ public class CodecJOrbis
/*     */   implements ICodec
/*     */ {
/*     */   private static final boolean GET = false;
/*     */   private static final boolean SET = true;
/*     */   private static final boolean XXX = false;
/*     */   protected URL url;
/*  81 */   protected URLConnection urlConnection = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private InputStream inputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private AudioFormat audioFormat;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean endOfStream = false;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean initialized = false;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   private byte[] buffer = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int bufferSize;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   private int count = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   private int index = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int convertedBufferSize;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private float[][][] pcmInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int[] pcmIndex;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   private Packet joggPacket = new Packet();
/*     */ 
/*     */ 
/*     */   
/* 145 */   private Page joggPage = new Page();
/*     */ 
/*     */ 
/*     */   
/* 149 */   private StreamState joggStreamState = new StreamState();
/*     */ 
/*     */ 
/*     */   
/* 153 */   private SyncState joggSyncState = new SyncState();
/*     */ 
/*     */ 
/*     */   
/* 157 */   private DspState jorbisDspState = new DspState();
/*     */ 
/*     */ 
/*     */   
/* 161 */   private Block jorbisBlock = new Block(this.jorbisDspState);
/*     */ 
/*     */ 
/*     */   
/* 165 */   private Comment jorbisComment = new Comment();
/*     */ 
/*     */ 
/*     */   
/* 169 */   private Info jorbisInfo = new Info();
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
/*     */   public CodecJOrbis() {
/* 181 */     this.logger = SoundSystemConfig.getLogger();
/*     */   }
/*     */ 
/*     */ 
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
/*     */ 
/*     */   
/*     */   public boolean initialize(URL paramURL) {
/* 199 */     initialized(true, false);
/*     */     
/* 201 */     if (this.joggStreamState != null)
/* 202 */       this.joggStreamState.clear(); 
/* 203 */     if (this.jorbisBlock != null)
/* 204 */       this.jorbisBlock.clear(); 
/* 205 */     if (this.jorbisDspState != null)
/* 206 */       this.jorbisDspState.clear(); 
/* 207 */     if (this.jorbisInfo != null)
/* 208 */       this.jorbisInfo.clear(); 
/* 209 */     if (this.joggSyncState != null) {
/* 210 */       this.joggSyncState.clear();
/*     */     }
/* 212 */     if (this.inputStream != null) {
/*     */       
/*     */       try {
/*     */         
/* 216 */         this.inputStream.close();
/*     */       }
/* 218 */       catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */     
/* 222 */     this.url = paramURL;
/* 223 */     this.bufferSize = SoundSystemConfig.getStreamingBufferSize() / 2;
/*     */     
/* 225 */     this.buffer = null;
/* 226 */     this.count = 0;
/* 227 */     this.index = 0;
/*     */     
/* 229 */     this.joggStreamState = new StreamState();
/* 230 */     this.jorbisBlock = new Block(this.jorbisDspState);
/* 231 */     this.jorbisDspState = new DspState();
/* 232 */     this.jorbisInfo = new Info();
/* 233 */     this.joggSyncState = new SyncState();
/*     */ 
/*     */     
/*     */     try {
/* 237 */       this.urlConnection = paramURL.openConnection();
/*     */     }
/* 239 */     catch (UnknownServiceException unknownServiceException) {
/*     */       
/* 241 */       errorMessage("Unable to create a UrlConnection in method 'initialize'.");
/*     */       
/* 243 */       printStackTrace(unknownServiceException);
/* 244 */       cleanup();
/* 245 */       return false;
/*     */     }
/* 247 */     catch (IOException iOException) {
/*     */       
/* 249 */       errorMessage("Unable to create a UrlConnection in method 'initialize'.");
/*     */       
/* 251 */       printStackTrace(iOException);
/* 252 */       cleanup();
/* 253 */       return false;
/*     */     } 
/*     */     
/* 256 */     if (this.urlConnection != null) {
/*     */       
/*     */       try {
/*     */         
/* 260 */         this.inputStream = openInputStream();
/*     */       }
/* 262 */       catch (IOException iOException) {
/*     */         
/* 264 */         errorMessage("Unable to acquire inputstream in method 'initialize'.");
/*     */         
/* 266 */         printStackTrace(iOException);
/* 267 */         cleanup();
/* 268 */         return false;
/*     */       } 
/*     */     }
/*     */     
/* 272 */     endOfStream(true, false);
/*     */     
/* 274 */     this.joggSyncState.init();
/* 275 */     this.joggSyncState.buffer(this.bufferSize);
/* 276 */     this.buffer = this.joggSyncState.data;
/*     */ 
/*     */     
/*     */     try {
/* 280 */       if (!readHeader())
/*     */       {
/* 282 */         errorMessage("Error reading the header");
/* 283 */         return false;
/*     */       }
/*     */     
/* 286 */     } catch (IOException iOException) {
/*     */       
/* 288 */       errorMessage("Error reading the header");
/* 289 */       return false;
/*     */     } 
/*     */     
/* 292 */     this.convertedBufferSize = this.bufferSize * 2;
/*     */     
/* 294 */     this.jorbisDspState.synthesis_init(this.jorbisInfo);
/* 295 */     this.jorbisBlock.init(this.jorbisDspState);
/*     */     
/* 297 */     int i = this.jorbisInfo.channels;
/* 298 */     int j = this.jorbisInfo.rate;
/*     */     
/* 300 */     this.audioFormat = new AudioFormat(j, 16, i, true, false);
/*     */ 
/*     */     
/* 303 */     this.pcmInfo = new float[1][][];
/* 304 */     this.pcmIndex = new int[this.jorbisInfo.channels];
/*     */     
/* 306 */     initialized(true, true);
/*     */     
/* 308 */     return true;
/*     */   }
/*     */   
/*     */   protected InputStream openInputStream() {
/* 312 */     return this.urlConnection.getInputStream();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean initialized() {
/* 321 */     return initialized(false, false);
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
/* 332 */     byte[] arrayOfByte = readBytes();
/*     */     
/* 334 */     if (arrayOfByte == null) {
/* 335 */       return null;
/*     */     }
/* 337 */     return new SoundBuffer(arrayOfByte, this.audioFormat);
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
/*     */   public SoundBuffer readAll() {
/* 349 */     byte[] arrayOfByte = readBytes();
/*     */     
/* 351 */     while (!endOfStream(false, false)) {
/*     */       
/* 353 */       arrayOfByte = appendByteArrays(arrayOfByte, readBytes());
/* 354 */       if (arrayOfByte != null && arrayOfByte.length >= SoundSystemConfig.getMaxFileSize()) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/* 359 */     return new SoundBuffer(arrayOfByte, this.audioFormat);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean endOfStream() {
/* 368 */     return endOfStream(false, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanup() {
/* 376 */     this.joggStreamState.clear();
/* 377 */     this.jorbisBlock.clear();
/* 378 */     this.jorbisDspState.clear();
/* 379 */     this.jorbisInfo.clear();
/* 380 */     this.joggSyncState.clear();
/*     */     
/* 382 */     if (this.inputStream != null) {
/*     */       
/*     */       try {
/*     */         
/* 386 */         this.inputStream.close();
/*     */       }
/* 388 */       catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */     
/* 392 */     this.joggStreamState = null;
/* 393 */     this.jorbisBlock = null;
/* 394 */     this.jorbisDspState = null;
/* 395 */     this.jorbisInfo = null;
/* 396 */     this.joggSyncState = null;
/* 397 */     this.inputStream = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioFormat getAudioFormat() {
/* 407 */     return this.audioFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean readHeader() {
/* 418 */     this.index = this.joggSyncState.buffer(this.bufferSize);
/*     */     
/* 420 */     int i = this.inputStream.read(this.joggSyncState.data, this.index, this.bufferSize);
/* 421 */     if (i < 0) {
/* 422 */       i = 0;
/*     */     }
/* 424 */     this.joggSyncState.wrote(i);
/*     */     
/* 426 */     if (this.joggSyncState.pageout(this.joggPage) != 1) {
/*     */ 
/*     */       
/* 429 */       if (i < this.bufferSize) {
/* 430 */         return true;
/*     */       }
/* 432 */       errorMessage("Ogg header not recognized in method 'readHeader'.");
/* 433 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 437 */     this.joggStreamState.init(this.joggPage.serialno());
/*     */     
/* 439 */     this.jorbisInfo.init();
/* 440 */     this.jorbisComment.init();
/* 441 */     if (this.joggStreamState.pagein(this.joggPage) < 0) {
/*     */       
/* 443 */       errorMessage("Problem with first Ogg header page in method 'readHeader'.");
/*     */       
/* 445 */       return false;
/*     */     } 
/*     */     
/* 448 */     if (this.joggStreamState.packetout(this.joggPacket) != 1) {
/*     */       
/* 450 */       errorMessage("Problem with first Ogg header packet in method 'readHeader'.");
/*     */       
/* 452 */       return false;
/*     */     } 
/*     */     
/* 455 */     if (this.jorbisInfo.synthesis_headerin(this.jorbisComment, this.joggPacket) < 0) {
/*     */       
/* 457 */       errorMessage("File does not contain Vorbis header in method 'readHeader'.");
/*     */       
/* 459 */       return false;
/*     */     } 
/*     */     
/* 462 */     byte b = 0;
/* 463 */     while (b < 2) {
/*     */       
/* 465 */       while (b < 2) {
/*     */         
/* 467 */         int j = this.joggSyncState.pageout(this.joggPage);
/* 468 */         if (j == 0)
/*     */           break; 
/* 470 */         if (j == 1) {
/*     */           
/* 472 */           this.joggStreamState.pagein(this.joggPage);
/* 473 */           while (b < 2) {
/*     */             
/* 475 */             j = this.joggStreamState.packetout(this.joggPacket);
/* 476 */             if (j == 0) {
/*     */               break;
/*     */             }
/* 479 */             if (j == -1) {
/*     */               
/* 481 */               errorMessage("Secondary Ogg header corrupt in method 'readHeader'.");
/*     */               
/* 483 */               return false;
/*     */             } 
/*     */             
/* 486 */             this.jorbisInfo.synthesis_headerin(this.jorbisComment, this.joggPacket);
/*     */             
/* 488 */             b++;
/*     */           } 
/*     */         } 
/*     */       } 
/* 492 */       this.index = this.joggSyncState.buffer(this.bufferSize);
/* 493 */       i = this.inputStream.read(this.joggSyncState.data, this.index, this.bufferSize);
/* 494 */       if (i < 0)
/* 495 */         i = 0; 
/* 496 */       if (i == 0 && b < 2) {
/*     */         
/* 498 */         errorMessage("End of file reached before finished readingOgg header in method 'readHeader'");
/*     */         
/* 500 */         return false;
/*     */       } 
/*     */       
/* 503 */       this.joggSyncState.wrote(i);
/*     */     } 
/*     */     
/* 506 */     this.index = this.joggSyncState.buffer(this.bufferSize);
/* 507 */     this.buffer = this.joggSyncState.data;
/*     */     
/* 509 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private byte[] readBytes() {
/* 518 */     if (!initialized(false, false)) {
/* 519 */       return null;
/*     */     }
/* 521 */     if (endOfStream(false, false)) {
/* 522 */       return null;
/*     */     }
/* 524 */     byte[] arrayOfByte = null;
/*     */     
/* 526 */     switch (this.joggSyncState.pageout(this.joggPage)) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case -1:
/*     */       case 0:
/* 533 */         endOfStream(true, true);
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case 1:
/* 539 */         this.joggStreamState.pagein(this.joggPage);
/* 540 */         if (this.joggPage.granulepos() == 0L) {
/*     */           
/* 542 */           endOfStream(true, true);
/*     */           
/*     */           break;
/*     */         } 
/*     */         while (true) {
/* 547 */           switch (this.joggStreamState.packetout(this.joggPacket)) {
/*     */             case -1:
/*     */             case 0:
/*     */               break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             case 1:
/* 559 */               arrayOfByte = appendByteArrays(arrayOfByte, decodeCurrentPacket());
/*     */           } 
/*     */ 
/*     */         
/*     */         } 
/* 564 */         if (this.joggPage.eos() != 0)
/* 565 */           endOfStream(true, true); 
/*     */         break;
/*     */     } 
/* 568 */     if (!endOfStream(false, false)) {
/*     */       
/* 570 */       this.index = this.joggSyncState.buffer(this.bufferSize);
/* 571 */       if (this.index == -1) {
/* 572 */         endOfStream(true, true);
/*     */       } else {
/*     */         
/* 575 */         this.buffer = this.joggSyncState.data;
/*     */ 
/*     */         
/*     */         try {
/* 579 */           this.count = this.inputStream.read(this.buffer, this.index, this.bufferSize);
/*     */         }
/* 581 */         catch (Exception exception) {
/*     */           
/* 583 */           printStackTrace(exception);
/* 584 */           return arrayOfByte;
/*     */         } 
/* 586 */         this.joggSyncState.wrote(this.count);
/* 587 */         if (this.count == 0)
/* 588 */           endOfStream(true, true); 
/*     */       } 
/*     */     } 
/* 591 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private byte[] decodeCurrentPacket() {
/* 600 */     byte[] arrayOfByte = new byte[this.convertedBufferSize];
/*     */ 
/*     */ 
/*     */     
/* 604 */     if (this.jorbisBlock.synthesis(this.joggPacket) == 0) {
/* 605 */       this.jorbisDspState.synthesis_blockin(this.jorbisBlock);
/*     */     }
/*     */     
/* 608 */     int j = this.convertedBufferSize / this.jorbisInfo.channels * 2;
/* 609 */     int k = 0;
/*     */     int i;
/* 611 */     while (k < this.convertedBufferSize && (i = this.jorbisDspState.synthesis_pcmout(this.pcmInfo, this.pcmIndex)) > 0) {
/*     */       int m;
/*     */       
/* 614 */       if (i < j) {
/* 615 */         m = i;
/*     */       } else {
/* 617 */         m = j;
/* 618 */       }  for (byte b = 0; b < this.jorbisInfo.channels; b++) {
/*     */         
/* 620 */         int n = b * 2;
/* 621 */         for (byte b1 = 0; b1 < m; b1++) {
/*     */           
/* 623 */           int i1 = (int)(this.pcmInfo[0][b][this.pcmIndex[b] + b1] * 32767.0F);
/*     */           
/* 625 */           if (i1 > 32767)
/*     */           {
/* 627 */             i1 = 32767;
/*     */           }
/* 629 */           if (i1 < -32768)
/*     */           {
/* 631 */             i1 = -32768;
/*     */           }
/* 633 */           if (i1 < 0)
/* 634 */             i1 |= 0x8000; 
/* 635 */           arrayOfByte[k + n] = (byte)i1;
/*     */           
/* 637 */           arrayOfByte[k + n + 1] = (byte)(i1 >>> 8);
/*     */ 
/*     */           
/* 640 */           n += 2 * this.jorbisInfo.channels;
/*     */         } 
/*     */       } 
/* 643 */       k += m * this.jorbisInfo.channels * 2;
/* 644 */       this.jorbisDspState.synthesis_read(m);
/*     */     } 
/* 646 */     arrayOfByte = trimArray(arrayOfByte, k);
/*     */     
/* 648 */     return arrayOfByte;
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
/* 659 */     if (paramBoolean1 == true)
/* 660 */       this.initialized = paramBoolean2; 
/* 661 */     return this.initialized;
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
/* 672 */     if (paramBoolean1 == true)
/* 673 */       this.endOfStream = paramBoolean2; 
/* 674 */     return this.endOfStream;
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
/* 686 */     byte[] arrayOfByte = null;
/* 687 */     if (paramArrayOfbyte != null && paramArrayOfbyte.length > paramInt) {
/*     */       
/* 689 */       arrayOfByte = new byte[paramInt];
/* 690 */       System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramInt);
/*     */     } 
/* 692 */     return arrayOfByte;
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
/*     */   private static byte[] appendByteArrays(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
/*     */     byte[] arrayOfByte;
/* 705 */     if (paramArrayOfbyte1 == null && paramArrayOfbyte2 == null)
/*     */     {
/*     */       
/* 708 */       return null;
/*     */     }
/* 710 */     if (paramArrayOfbyte1 == null) {
/*     */ 
/*     */       
/* 713 */       arrayOfByte = new byte[paramArrayOfbyte2.length];
/*     */       
/* 715 */       System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, 0, paramArrayOfbyte2.length);
/* 716 */       paramArrayOfbyte2 = null;
/*     */     }
/* 718 */     else if (paramArrayOfbyte2 == null) {
/*     */ 
/*     */       
/* 721 */       arrayOfByte = new byte[paramArrayOfbyte1.length];
/*     */       
/* 723 */       System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
/* 724 */       paramArrayOfbyte1 = null;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 729 */       arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte2.length];
/* 730 */       System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
/*     */       
/* 732 */       System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte2.length);
/*     */       
/* 734 */       paramArrayOfbyte1 = null;
/* 735 */       paramArrayOfbyte2 = null;
/*     */     } 
/*     */     
/* 738 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void errorMessage(String paramString) {
/* 747 */     this.logger.errorMessage("CodecJOrbis", paramString, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void printStackTrace(Exception paramException) {
/* 756 */     this.logger.printStackTrace(paramException, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\codecs\CodecJOrbis.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */