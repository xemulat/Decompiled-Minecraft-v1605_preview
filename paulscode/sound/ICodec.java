package paulscode.sound;

import java.net.URL;
import javax.sound.sampled.AudioFormat;

public interface ICodec {
  void reverseByteOrder(boolean paramBoolean);
  
  boolean initialize(URL paramURL);
  
  boolean initialized();
  
  SoundBuffer read();
  
  SoundBuffer readAll();
  
  boolean endOfStream();
  
  void cleanup();
  
  AudioFormat getAudioFormat();
}


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\ICodec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */