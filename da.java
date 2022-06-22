/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public class da {
/*  9 */   private static List a = new ArrayList();
/* 10 */   private static List b = new ArrayList();
/*    */   
/*    */   public static synchronized int a(int paramInt) {
/* 13 */     int i = GL11.glGenLists(paramInt);
/* 14 */     a.add(Integer.valueOf(i));
/* 15 */     a.add(Integer.valueOf(paramInt));
/* 16 */     return i;
/*    */   }
/*    */   
/*    */   public static synchronized void a(IntBuffer paramIntBuffer) {
/* 20 */     GL11.glGenTextures(paramIntBuffer);
/* 21 */     for (int i = paramIntBuffer.position(); i < paramIntBuffer.limit(); i++) {
/* 22 */       b.add(Integer.valueOf(paramIntBuffer.get(i)));
/*    */     }
/*    */   }
/*    */   
/*    */   public static synchronized void a() {
/* 27 */     for (byte b1 = 0; b1 < a.size(); b1 += 2) {
/* 28 */       GL11.glDeleteLists(((Integer)a.get(b1)).intValue(), ((Integer)a.get(b1 + 1)).intValue());
/*    */     }
/* 30 */     IntBuffer intBuffer = c(b.size());
/* 31 */     intBuffer.flip();
/* 32 */     GL11.glDeleteTextures(intBuffer);
/* 33 */     for (byte b2 = 0; b2 < b.size(); b2++) {
/* 34 */       intBuffer.put(((Integer)b.get(b2)).intValue());
/*    */     }
/* 36 */     intBuffer.flip();
/* 37 */     GL11.glDeleteTextures(intBuffer);
/* 38 */     a.clear();
/* 39 */     b.clear();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static synchronized ByteBuffer b(int paramInt) {
/* 57 */     return ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static IntBuffer c(int paramInt) {
/* 72 */     return b(paramInt << 2).asIntBuffer();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static FloatBuffer d(int paramInt) {
/* 80 */     return b(paramInt << 2).asFloatBuffer();
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\da.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */