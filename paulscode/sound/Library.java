/*      */ package paulscode.sound;
/*      */ 
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.LinkedList;
/*      */ import java.util.List;
/*      */ import java.util.Set;
/*      */ import javax.sound.sampled.AudioFormat;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Library
/*      */ {
/*      */   private SoundSystemLogger logger;
/*      */   protected ListenerData listener;
/*   68 */   protected HashMap bufferMap = null;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected HashMap sourceMap;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MidiChannel midiChannel;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected List streamingChannels;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected List normalChannels;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String[] streamingChannelSourceNames;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String[] normalChannelSourceNames;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  103 */   private int nextStreamingChannel = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  108 */   private int nextNormalChannel = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected StreamThread streamThread;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Library() {
/*  124 */     this.logger = SoundSystemConfig.getLogger();
/*      */ 
/*      */     
/*  127 */     this.bufferMap = new HashMap<Object, Object>();
/*      */ 
/*      */     
/*  130 */     this.sourceMap = new HashMap<Object, Object>();
/*      */     
/*  132 */     this.listener = new ListenerData(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  137 */     this.streamingChannels = new LinkedList();
/*  138 */     this.normalChannels = new LinkedList();
/*  139 */     this.streamingChannelSourceNames = new String[SoundSystemConfig.getNumberStreamingChannels()];
/*      */     
/*  141 */     this.normalChannelSourceNames = new String[SoundSystemConfig.getNumberNormalChannels()];
/*      */ 
/*      */     
/*  144 */     this.streamThread = new StreamThread();
/*  145 */     this.streamThread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cleanup() {
/*  161 */     this.streamThread.kill();
/*  162 */     this.streamThread.interrupt();
/*      */ 
/*      */     
/*  165 */     for (byte b = 0; b < 50; b++) {
/*      */       
/*  167 */       if (!this.streamThread.alive()) {
/*      */         break;
/*      */       }
/*      */       try {
/*  171 */         Thread.sleep(100L);
/*      */       }
/*  173 */       catch (Exception exception) {}
/*      */     } 
/*      */ 
/*      */     
/*  177 */     if (this.streamThread.alive()) {
/*      */       
/*  179 */       errorMessage("Stream thread did not die!");
/*  180 */       message("Ignoring errors... continuing clean-up.");
/*      */     } 
/*      */     
/*  183 */     if (this.midiChannel != null) {
/*      */       
/*  185 */       this.midiChannel.cleanup();
/*  186 */       this.midiChannel = null;
/*      */     } 
/*      */     
/*  189 */     Channel channel = null;
/*  190 */     if (this.streamingChannels != null) {
/*      */       
/*  192 */       while (!this.streamingChannels.isEmpty()) {
/*      */         
/*  194 */         channel = this.streamingChannels.remove(0);
/*  195 */         channel.close();
/*  196 */         channel.cleanup();
/*  197 */         channel = null;
/*      */       } 
/*  199 */       this.streamingChannels.clear();
/*  200 */       this.streamingChannels = null;
/*      */     } 
/*  202 */     if (this.normalChannels != null) {
/*      */       
/*  204 */       while (!this.normalChannels.isEmpty()) {
/*      */         
/*  206 */         channel = this.normalChannels.remove(0);
/*  207 */         channel.close();
/*  208 */         channel.cleanup();
/*  209 */         channel = null;
/*      */       } 
/*  211 */       this.normalChannels.clear();
/*  212 */       this.normalChannels = null;
/*      */     } 
/*      */     
/*  215 */     Set set = this.sourceMap.keySet();
/*  216 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  221 */     while (iterator.hasNext()) {
/*      */       
/*  223 */       String str = iterator.next();
/*  224 */       Source source = (Source)this.sourceMap.get(str);
/*  225 */       if (source != null)
/*  226 */         source.cleanup(); 
/*      */     } 
/*  228 */     this.sourceMap.clear();
/*  229 */     this.sourceMap = null;
/*      */     
/*  231 */     this.listener = null;
/*  232 */     this.streamThread = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void init() {
/*  240 */     Channel channel = null;
/*      */     
/*      */     byte b;
/*  243 */     for (b = 0; b < SoundSystemConfig.getNumberStreamingChannels(); b++) {
/*      */       
/*  245 */       channel = createChannel(1);
/*  246 */       if (channel == null)
/*      */         break; 
/*  248 */       this.streamingChannels.add(channel);
/*      */     } 
/*      */     
/*  251 */     for (b = 0; b < SoundSystemConfig.getNumberNormalChannels(); b++) {
/*      */       
/*  253 */       channel = createChannel(0);
/*  254 */       if (channel == null)
/*      */         break; 
/*  256 */       this.normalChannels.add(channel);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean libraryCompatible() {
/*  266 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Channel createChannel(int paramInt) {
/*  278 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean loadSound(FilenameURL paramFilenameURL) {
/*  288 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void unloadSound(String paramString) {
/*  300 */     this.bufferMap.remove(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawDataStream(AudioFormat paramAudioFormat, boolean paramBoolean, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  317 */     this.sourceMap.put(paramString, new Source(paramAudioFormat, paramBoolean, paramString, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void newSource(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4) {
/*  340 */     this.sourceMap.put(paramString, new Source(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, null, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, false));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void quickPlay(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, FilenameURL paramFilenameURL, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, float paramFloat4, boolean paramBoolean4) {
/*  365 */     this.sourceMap.put(paramString, new Source(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramFilenameURL, null, paramFloat1, paramFloat2, paramFloat3, paramInt, paramFloat4, paramBoolean4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTemporary(String paramString, boolean paramBoolean) {
/*  380 */     Source source = (Source)this.sourceMap.get(paramString);
/*  381 */     if (source != null) {
/*  382 */       source.setTemporary(paramBoolean);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPosition(String paramString, float paramFloat1, float paramFloat2, float paramFloat3) {
/*  394 */     Source source = (Source)this.sourceMap.get(paramString);
/*  395 */     if (source != null) {
/*  396 */       source.setPosition(paramFloat1, paramFloat2, paramFloat3);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPriority(String paramString, boolean paramBoolean) {
/*  407 */     Source source = (Source)this.sourceMap.get(paramString);
/*  408 */     if (source != null) {
/*  409 */       source.setPriority(paramBoolean);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLooping(String paramString, boolean paramBoolean) {
/*  420 */     Source source = (Source)this.sourceMap.get(paramString);
/*  421 */     if (source != null) {
/*  422 */       source.setLooping(paramBoolean);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttenuation(String paramString, int paramInt) {
/*  432 */     Source source = (Source)this.sourceMap.get(paramString);
/*  433 */     if (source != null) {
/*  434 */       source.setAttenuation(paramInt);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDistOrRoll(String paramString, float paramFloat) {
/*  444 */     Source source = (Source)this.sourceMap.get(paramString);
/*  445 */     if (source != null) {
/*  446 */       source.setDistOrRoll(paramFloat);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int feedRawAudioData(String paramString, byte[] paramArrayOfbyte) {
/*  459 */     if (paramString == null || paramString.equals("")) {
/*      */       
/*  461 */       errorMessage("Sourcename not specified in method 'feedRawAudioData'");
/*      */       
/*  463 */       return -1;
/*      */     } 
/*      */     
/*  466 */     if (midiSourcename(paramString)) {
/*      */       
/*  468 */       errorMessage("Raw audio data can not be fed to the MIDI channel.");
/*      */       
/*  470 */       return -1;
/*      */     } 
/*      */ 
/*      */     
/*  474 */     Source source = (Source)this.sourceMap.get(paramString);
/*  475 */     if (source == null)
/*      */     {
/*  477 */       errorMessage("Source '" + paramString + "' not found in " + "method 'feedRawAudioData'");
/*      */     }
/*      */     
/*  480 */     return feedRawAudioData(source, paramArrayOfbyte);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int feedRawAudioData(Source paramSource, byte[] paramArrayOfbyte) {
/*  494 */     if (paramSource == null) {
/*      */       
/*  496 */       errorMessage("Source parameter null in method 'feedRawAudioData'");
/*      */       
/*  498 */       return -1;
/*      */     } 
/*  500 */     if (!paramSource.toStream) {
/*      */       
/*  502 */       errorMessage("Only a streaming source may be specified in method 'feedRawAudioData'");
/*      */       
/*  504 */       return -1;
/*      */     } 
/*  506 */     if (!paramSource.rawDataStream) {
/*      */       
/*  508 */       errorMessage("Streaming source already associated with a file or URL in method'feedRawAudioData'");
/*      */       
/*  510 */       return -1;
/*      */     } 
/*      */     
/*  513 */     if (!paramSource.playing() || paramSource.channel == null) {
/*      */       Channel channel;
/*      */       
/*  516 */       if (paramSource.channel != null && paramSource.channel.attachedSource == paramSource) {
/*      */         
/*  518 */         channel = paramSource.channel;
/*      */       } else {
/*  520 */         channel = getNextChannel(paramSource);
/*      */       } 
/*  522 */       int i = paramSource.feedRawAudioData(channel, paramArrayOfbyte);
/*  523 */       channel.attachedSource = paramSource;
/*  524 */       this.streamThread.watch(paramSource);
/*  525 */       this.streamThread.interrupt();
/*  526 */       return i;
/*      */     } 
/*      */     
/*  529 */     return paramSource.feedRawAudioData(paramSource.channel, paramArrayOfbyte);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void play(String paramString) {
/*  538 */     if (paramString == null || paramString.equals("")) {
/*      */       
/*  540 */       errorMessage("Sourcename not specified in method 'play'");
/*      */       
/*      */       return;
/*      */     } 
/*  544 */     if (midiSourcename(paramString)) {
/*      */       
/*  546 */       this.midiChannel.play();
/*      */     }
/*      */     else {
/*      */       
/*  550 */       Source source = (Source)this.sourceMap.get(paramString);
/*  551 */       if (source == null)
/*      */       {
/*  553 */         errorMessage("Source '" + paramString + "' not found in " + "method 'play'");
/*      */       }
/*      */       
/*  556 */       play(source);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void play(Source paramSource) {
/*  566 */     if (paramSource == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  571 */     if (paramSource.rawDataStream) {
/*      */       return;
/*      */     }
/*  574 */     if (!paramSource.active()) {
/*      */       return;
/*      */     }
/*  577 */     if (!paramSource.playing()) {
/*      */       
/*  579 */       Channel channel = getNextChannel(paramSource);
/*      */       
/*  581 */       if (paramSource != null && channel != null) {
/*      */         
/*  583 */         if (paramSource.channel != null && paramSource.channel.attachedSource != paramSource)
/*      */         {
/*  585 */           paramSource.channel = null; } 
/*  586 */         channel.attachedSource = paramSource;
/*  587 */         paramSource.play(channel);
/*  588 */         if (paramSource.toStream) {
/*      */           
/*  590 */           this.streamThread.watch(paramSource);
/*  591 */           this.streamThread.interrupt();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void stop(String paramString) {
/*  603 */     if (paramString == null || paramString.equals("")) {
/*      */       
/*  605 */       errorMessage("Sourcename not specified in method 'stop'");
/*      */       return;
/*      */     } 
/*  608 */     if (midiSourcename(paramString)) {
/*      */       
/*  610 */       this.midiChannel.stop();
/*      */     }
/*      */     else {
/*      */       
/*  614 */       Source source = (Source)this.sourceMap.get(paramString);
/*  615 */       if (source != null) {
/*  616 */         source.stop();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void pause(String paramString) {
/*  626 */     if (paramString == null || paramString.equals("")) {
/*      */       
/*  628 */       errorMessage("Sourcename not specified in method 'stop'");
/*      */       return;
/*      */     } 
/*  631 */     if (midiSourcename(paramString)) {
/*      */       
/*  633 */       this.midiChannel.pause();
/*      */     }
/*      */     else {
/*      */       
/*  637 */       Source source = (Source)this.sourceMap.get(paramString);
/*  638 */       if (source != null) {
/*  639 */         source.pause();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rewind(String paramString) {
/*  649 */     if (midiSourcename(paramString)) {
/*      */       
/*  651 */       this.midiChannel.rewind();
/*      */     }
/*      */     else {
/*      */       
/*  655 */       Source source = (Source)this.sourceMap.get(paramString);
/*  656 */       if (source != null) {
/*  657 */         source.rewind();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void flush(String paramString) {
/*  667 */     if (midiSourcename(paramString)) {
/*  668 */       errorMessage("You can not flush the MIDI channel");
/*      */     } else {
/*      */       
/*  671 */       Source source = (Source)this.sourceMap.get(paramString);
/*  672 */       if (source != null) {
/*  673 */         source.flush();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void cull(String paramString) {
/*  684 */     Source source = (Source)this.sourceMap.get(paramString);
/*  685 */     if (source != null) {
/*  686 */       source.cull();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void activate(String paramString) {
/*  695 */     Source source = (Source)this.sourceMap.get(paramString);
/*  696 */     if (source != null) {
/*      */       
/*  698 */       source.activate();
/*  699 */       if (source.toPlay) {
/*  700 */         play(source);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMasterVolume(float paramFloat) {
/*  710 */     SoundSystemConfig.setMasterGain(paramFloat);
/*  711 */     if (this.midiChannel != null) {
/*  712 */       this.midiChannel.resetGain();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVolume(String paramString, float paramFloat) {
/*  722 */     if (midiSourcename(paramString)) {
/*      */       
/*  724 */       this.midiChannel.setVolume(paramFloat);
/*      */     }
/*      */     else {
/*      */       
/*  728 */       Source source = (Source)this.sourceMap.get(paramString);
/*  729 */       if (source != null) {
/*      */         
/*  731 */         float f = paramFloat;
/*  732 */         if (f < 0.0F) {
/*  733 */           f = 0.0F;
/*  734 */         } else if (f > 1.0F) {
/*  735 */           f = 1.0F;
/*      */         } 
/*  737 */         source.sourceVolume = f;
/*  738 */         source.positionChanged();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getVolume(String paramString) {
/*  751 */     if (midiSourcename(paramString))
/*      */     {
/*  753 */       return this.midiChannel.getVolume();
/*      */     }
/*      */ 
/*      */     
/*  757 */     Source source = (Source)this.sourceMap.get(paramString);
/*  758 */     if (source != null) {
/*  759 */       return source.sourceVolume;
/*      */     }
/*  761 */     return 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPitch(String paramString, float paramFloat) {
/*  772 */     if (!midiSourcename(paramString)) {
/*      */       
/*  774 */       Source source = (Source)this.sourceMap.get(paramString);
/*  775 */       if (source != null) {
/*      */         
/*  777 */         float f = paramFloat;
/*  778 */         if (f < 0.5F) {
/*  779 */           f = 0.5F;
/*  780 */         } else if (f > 2.0F) {
/*  781 */           f = 2.0F;
/*      */         } 
/*  783 */         source.setPitch(f);
/*  784 */         source.positionChanged();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float getPitch(String paramString) {
/*  796 */     if (!midiSourcename(paramString)) {
/*      */       
/*  798 */       Source source = (Source)this.sourceMap.get(paramString);
/*  799 */       if (source != null)
/*  800 */         return source.getPitch(); 
/*      */     } 
/*  802 */     return 1.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void moveListener(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  813 */     setListenerPosition(this.listener.position.x + paramFloat1, this.listener.position.y + paramFloat2, this.listener.position.z + paramFloat3);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListenerPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  826 */     this.listener.setPosition(paramFloat1, paramFloat2, paramFloat3);
/*      */     
/*  828 */     Set set = this.sourceMap.keySet();
/*  829 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  834 */     while (iterator.hasNext()) {
/*      */       
/*  836 */       String str = iterator.next();
/*  837 */       Source source = (Source)this.sourceMap.get(str);
/*  838 */       if (source != null) {
/*  839 */         source.positionChanged();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void turnListener(float paramFloat) {
/*  850 */     setListenerAngle(this.listener.angle + paramFloat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListenerAngle(float paramFloat) {
/*  860 */     this.listener.setAngle(paramFloat);
/*      */     
/*  862 */     Set set = this.sourceMap.keySet();
/*  863 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  868 */     while (iterator.hasNext()) {
/*      */       
/*  870 */       String str = iterator.next();
/*  871 */       Source source = (Source)this.sourceMap.get(str);
/*  872 */       if (source != null) {
/*  873 */         source.positionChanged();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListenerOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  889 */     this.listener.setOrientation(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*      */     
/*  891 */     Set set = this.sourceMap.keySet();
/*  892 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  897 */     while (iterator.hasNext()) {
/*      */       
/*  899 */       String str = iterator.next();
/*  900 */       Source source = (Source)this.sourceMap.get(str);
/*  901 */       if (source != null) {
/*  902 */         source.positionChanged();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListenerData(ListenerData paramListenerData) {
/*  913 */     this.listener.setData(paramListenerData);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void copySources(HashMap paramHashMap) {
/*  922 */     if (paramHashMap == null)
/*      */       return; 
/*  924 */     Set set = paramHashMap.keySet();
/*  925 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  930 */     this.sourceMap.clear();
/*      */ 
/*      */     
/*  933 */     while (iterator.hasNext()) {
/*      */       
/*  935 */       String str = iterator.next();
/*  936 */       Source source = (Source)paramHashMap.get(str);
/*  937 */       if (source != null) {
/*      */         
/*  939 */         loadSound(source.filenameURL);
/*  940 */         this.sourceMap.put(str, new Source(source, null));
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeSource(String paramString) {
/*  951 */     Source source = (Source)this.sourceMap.get(paramString);
/*  952 */     if (source != null)
/*  953 */       source.cleanup(); 
/*  954 */     this.sourceMap.remove(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeTemporarySources() {
/*  962 */     Set set = this.sourceMap.keySet();
/*  963 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  968 */     while (iterator.hasNext()) {
/*      */       
/*  970 */       String str = iterator.next();
/*  971 */       Source source = (Source)this.sourceMap.get(str);
/*  972 */       if (source != null && source.temporary && !source.playing()) {
/*      */ 
/*      */         
/*  975 */         source.cleanup();
/*  976 */         iterator.remove();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Channel getNextChannel(Source paramSource) {
/*      */     int j;
/*      */     List<Channel> list;
/*      */     String[] arrayOfString;
/*  997 */     if (paramSource == null) {
/*  998 */       return null;
/*      */     }
/* 1000 */     String str = paramSource.sourcename;
/* 1001 */     if (str == null) {
/* 1002 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1011 */     if (paramSource.toStream) {
/*      */       
/* 1013 */       j = this.nextStreamingChannel;
/* 1014 */       list = this.streamingChannels;
/* 1015 */       arrayOfString = this.streamingChannelSourceNames;
/*      */     }
/*      */     else {
/*      */       
/* 1019 */       j = this.nextNormalChannel;
/* 1020 */       list = this.normalChannels;
/* 1021 */       arrayOfString = this.normalChannelSourceNames;
/*      */     } 
/*      */     
/* 1024 */     int i = list.size();
/*      */     
/*      */     byte b;
/* 1027 */     for (b = 0; b < i; b++) {
/*      */       
/* 1029 */       if (str.equals(arrayOfString[b])) {
/* 1030 */         return list.get(b);
/*      */       }
/*      */     } 
/* 1033 */     int k = j;
/*      */ 
/*      */     
/* 1036 */     for (b = 0; b < i; b++) {
/*      */       Source source;
/* 1038 */       String str1 = arrayOfString[k];
/* 1039 */       if (str1 == null) {
/* 1040 */         source = null;
/*      */       } else {
/* 1042 */         source = (Source)this.sourceMap.get(str1);
/*      */       } 
/* 1044 */       if (source == null || !source.playing()) {
/*      */         
/* 1046 */         if (paramSource.toStream) {
/*      */           
/* 1048 */           this.nextStreamingChannel = k + 1;
/* 1049 */           if (this.nextStreamingChannel >= i) {
/* 1050 */             this.nextStreamingChannel = 0;
/*      */           }
/*      */         } else {
/*      */           
/* 1054 */           this.nextNormalChannel = k + 1;
/* 1055 */           if (this.nextNormalChannel >= i)
/* 1056 */             this.nextNormalChannel = 0; 
/*      */         } 
/* 1058 */         arrayOfString[k] = str;
/* 1059 */         return list.get(k);
/*      */       } 
/* 1061 */       k++;
/* 1062 */       if (k >= i) {
/* 1063 */         k = 0;
/*      */       }
/*      */     } 
/* 1066 */     k = j;
/*      */     
/* 1068 */     for (b = 0; b < i; b++) {
/*      */       Source source;
/* 1070 */       String str1 = arrayOfString[k];
/* 1071 */       if (str1 == null) {
/* 1072 */         source = null;
/*      */       } else {
/* 1074 */         source = (Source)this.sourceMap.get(str1);
/*      */       } 
/* 1076 */       if (source == null || !source.playing() || !source.priority) {
/*      */         
/* 1078 */         if (paramSource.toStream) {
/*      */           
/* 1080 */           this.nextStreamingChannel = k + 1;
/* 1081 */           if (this.nextStreamingChannel >= i) {
/* 1082 */             this.nextStreamingChannel = 0;
/*      */           }
/*      */         } else {
/*      */           
/* 1086 */           this.nextNormalChannel = k + 1;
/* 1087 */           if (this.nextNormalChannel >= i)
/* 1088 */             this.nextNormalChannel = 0; 
/*      */         } 
/* 1090 */         arrayOfString[k] = str;
/* 1091 */         return list.get(k);
/*      */       } 
/* 1093 */       k++;
/* 1094 */       if (k >= i) {
/* 1095 */         k = 0;
/*      */       }
/*      */     } 
/* 1098 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void replaySources() {
/* 1108 */     Set set = this.sourceMap.keySet();
/* 1109 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1114 */     while (iterator.hasNext()) {
/*      */       
/* 1116 */       String str = iterator.next();
/* 1117 */       Source source = (Source)this.sourceMap.get(str);
/* 1118 */       if (source != null)
/*      */       {
/* 1120 */         if (source.toPlay && !source.playing()) {
/*      */           
/* 1122 */           play(str);
/* 1123 */           source.toPlay = false;
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void queueSound(String paramString, FilenameURL paramFilenameURL) {
/* 1138 */     if (midiSourcename(paramString)) {
/*      */       
/* 1140 */       this.midiChannel.queueSound(paramFilenameURL);
/*      */     }
/*      */     else {
/*      */       
/* 1144 */       Source source = (Source)this.sourceMap.get(paramString);
/* 1145 */       if (source != null) {
/* 1146 */         source.queueSound(paramFilenameURL);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dequeueSound(String paramString1, String paramString2) {
/* 1159 */     if (midiSourcename(paramString1)) {
/*      */       
/* 1161 */       this.midiChannel.dequeueSound(paramString2);
/*      */     }
/*      */     else {
/*      */       
/* 1165 */       Source source = (Source)this.sourceMap.get(paramString1);
/* 1166 */       if (source != null) {
/* 1167 */         source.dequeueSound(paramString2);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fadeOut(String paramString, FilenameURL paramFilenameURL, long paramLong) {
/* 1187 */     if (midiSourcename(paramString)) {
/*      */       
/* 1189 */       this.midiChannel.fadeOut(paramFilenameURL, paramLong);
/*      */     }
/*      */     else {
/*      */       
/* 1193 */       Source source = (Source)this.sourceMap.get(paramString);
/* 1194 */       if (source != null) {
/* 1195 */         source.fadeOut(paramFilenameURL, paramLong);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fadeOutIn(String paramString, FilenameURL paramFilenameURL, long paramLong1, long paramLong2) {
/* 1216 */     if (midiSourcename(paramString)) {
/*      */       
/* 1218 */       this.midiChannel.fadeOutIn(paramFilenameURL, paramLong1, paramLong2);
/*      */     }
/*      */     else {
/*      */       
/* 1222 */       Source source = (Source)this.sourceMap.get(paramString);
/* 1223 */       if (source != null) {
/* 1224 */         source.fadeOutIn(paramFilenameURL, paramLong1, paramLong2);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void checkFadeVolumes() {
/* 1241 */     if (this.midiChannel != null) {
/* 1242 */       this.midiChannel.resetGain();
/*      */     }
/*      */     
/* 1245 */     for (byte b = 0; b < this.streamingChannels.size(); b++) {
/*      */       
/* 1247 */       Channel channel = this.streamingChannels.get(b);
/* 1248 */       if (channel != null) {
/*      */         
/* 1250 */         Source source = channel.attachedSource;
/* 1251 */         if (source != null)
/* 1252 */           source.checkFadeOut(); 
/*      */       } 
/*      */     } 
/* 1255 */     Object object1 = null;
/* 1256 */     Object object2 = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadMidi(boolean paramBoolean, String paramString, FilenameURL paramFilenameURL) {
/* 1268 */     if (paramFilenameURL == null) {
/*      */       
/* 1270 */       errorMessage("Filename/URL not specified in method 'loadMidi'.");
/*      */       
/*      */       return;
/*      */     } 
/* 1274 */     if (!paramFilenameURL.getFilename().matches(".*[mM][iI][dD][iI]?$")) {
/*      */ 
/*      */       
/* 1277 */       errorMessage("Filename/identifier doesn't end in '.mid' or'.midi' in method loadMidi.");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1282 */     if (this.midiChannel == null) {
/*      */       
/* 1284 */       this.midiChannel = new MidiChannel(paramBoolean, paramString, paramFilenameURL);
/*      */     }
/*      */     else {
/*      */       
/* 1288 */       this.midiChannel.switchSource(paramBoolean, paramString, paramFilenameURL);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void unloadMidi() {
/* 1297 */     if (this.midiChannel != null)
/* 1298 */       this.midiChannel.cleanup(); 
/* 1299 */     this.midiChannel = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean midiSourcename(String paramString) {
/* 1309 */     if (this.midiChannel == null || paramString == null) {
/* 1310 */       return false;
/*      */     }
/* 1312 */     if (this.midiChannel.getSourcename() == null || paramString.equals("")) {
/* 1313 */       return false;
/*      */     }
/* 1315 */     if (paramString.equals(this.midiChannel.getSourcename())) {
/* 1316 */       return true;
/*      */     }
/* 1318 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Source getSource(String paramString) {
/* 1329 */     return (Source)this.sourceMap.get(paramString);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MidiChannel getMidiChannel() {
/* 1339 */     return this.midiChannel;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMidiChannel(MidiChannel paramMidiChannel) {
/* 1349 */     if (this.midiChannel != null && this.midiChannel != paramMidiChannel) {
/* 1350 */       this.midiChannel.cleanup();
/*      */     }
/* 1352 */     this.midiChannel = paramMidiChannel;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void listenerMoved() {
/* 1360 */     Set set = this.sourceMap.keySet();
/* 1361 */     Iterator<String> iterator = set.iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1366 */     while (iterator.hasNext()) {
/*      */       
/* 1368 */       String str = iterator.next();
/* 1369 */       Source source = (Source)this.sourceMap.get(str);
/* 1370 */       if (source != null)
/*      */       {
/* 1372 */         source.listenerMoved();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public HashMap getSources() {
/* 1383 */     return this.sourceMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ListenerData getListenerData() {
/* 1392 */     return this.listener;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getTitle() {
/* 1401 */     return "No Sound";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getDescription() {
/* 1410 */     return "Silent Mode";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getClassName() {
/* 1419 */     return "Library";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void message(String paramString) {
/* 1428 */     this.logger.message(paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void importantMessage(String paramString) {
/* 1437 */     this.logger.importantMessage(paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean errorCheck(boolean paramBoolean, String paramString) {
/* 1448 */     return this.logger.errorCheck(paramBoolean, getClassName(), paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void errorMessage(String paramString) {
/* 1457 */     this.logger.errorMessage(getClassName(), paramString, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void printStackTrace(Exception paramException) {
/* 1466 */     this.logger.printStackTrace(paramException, 1);
/*      */   }
/*      */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\Library.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */