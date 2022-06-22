/*     */ package com.jcraft.jorbis;
/*     */ 
/*     */ import com.jcraft.jogg.Buffer;
/*     */ import com.jcraft.jogg.Packet;
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
/*     */ public class Block
/*     */ {
/*  33 */   float[][] pcm = new float[0][];
/*  34 */   Buffer opb = new Buffer();
/*     */   
/*     */   int lW;
/*     */   
/*     */   int W;
/*     */   
/*     */   int nW;
/*     */   
/*     */   int pcmend;
/*     */   int mode;
/*     */   int eofflag;
/*     */   long granulepos;
/*     */   long sequence;
/*     */   DspState vd;
/*     */   int glue_bits;
/*     */   int time_bits;
/*     */   int floor_bits;
/*     */   int res_bits;
/*     */   
/*     */   public Block(DspState paramDspState) {
/*  54 */     this.vd = paramDspState;
/*  55 */     if (paramDspState.analysisp != 0) {
/*  56 */       this.opb.writeinit();
/*     */     }
/*     */   }
/*     */   
/*     */   public void init(DspState paramDspState) {
/*  61 */     this.vd = paramDspState;
/*     */   }
/*     */   
/*     */   public int clear() {
/*  65 */     if (this.vd != null && 
/*  66 */       this.vd.analysisp != 0) {
/*  67 */       this.opb.writeclear();
/*     */     }
/*     */     
/*  70 */     return 0;
/*     */   }
/*     */   
/*     */   public int synthesis(Packet paramPacket) {
/*  74 */     Info info = this.vd.vi;
/*     */ 
/*     */     
/*  77 */     this.opb.readinit(paramPacket.packet_base, paramPacket.packet, paramPacket.bytes);
/*     */ 
/*     */     
/*  80 */     if (this.opb.read(1) != 0)
/*     */     {
/*  82 */       return -1;
/*     */     }
/*     */ 
/*     */     
/*  86 */     int i = this.opb.read(this.vd.modebits);
/*  87 */     if (i == -1) {
/*  88 */       return -1;
/*     */     }
/*  90 */     this.mode = i;
/*  91 */     this.W = (info.mode_param[this.mode]).blockflag;
/*  92 */     if (this.W != 0) {
/*  93 */       this.lW = this.opb.read(1);
/*  94 */       this.nW = this.opb.read(1);
/*  95 */       if (this.nW == -1) {
/*  96 */         return -1;
/*     */       }
/*     */     } else {
/*  99 */       this.lW = 0;
/* 100 */       this.nW = 0;
/*     */     } 
/*     */ 
/*     */     
/* 104 */     this.granulepos = paramPacket.granulepos;
/* 105 */     this.sequence = paramPacket.packetno - 3L;
/* 106 */     this.eofflag = paramPacket.e_o_s;
/*     */ 
/*     */     
/* 109 */     this.pcmend = info.blocksizes[this.W];
/* 110 */     if (this.pcm.length < info.channels)
/* 111 */       this.pcm = new float[info.channels][]; 
/*     */     int j;
/* 113 */     for (j = 0; j < info.channels; j++) {
/* 114 */       if (this.pcm[j] == null || (this.pcm[j]).length < this.pcmend) {
/* 115 */         this.pcm[j] = new float[this.pcmend];
/*     */       } else {
/*     */         
/* 118 */         for (byte b = 0; b < this.pcmend; b++) {
/* 119 */           this.pcm[j][b] = 0.0F;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 125 */     j = info.map_type[(info.mode_param[this.mode]).mapping];
/* 126 */     return FuncMapping.mapping_P[j].inverse(this, this.vd.mode[this.mode]);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\com\jcraft\jorbis\Block.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */