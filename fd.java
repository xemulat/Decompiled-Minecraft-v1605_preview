/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public abstract class fd {
/*  7 */   private static Map a = new HashMap<Object, Object>();
/*  8 */   private static Map b = new HashMap<Object, Object>();
/*    */   
/*    */   static void a(int paramInt, Class<?> paramClass) {
/* 11 */     if (a.containsKey(Integer.valueOf(paramInt))) throw new IllegalArgumentException("Duplicate packet id:" + paramInt); 
/* 12 */     if (b.containsKey(paramClass)) throw new IllegalArgumentException("Duplicate packet class:" + paramClass); 
/* 13 */     a.put(Integer.valueOf(paramInt), paramClass);
/* 14 */     b.put(paramClass, Integer.valueOf(paramInt));
/*    */   }
/*    */   
/*    */   static {
/* 18 */     a(0, fz.class);
/* 19 */     a(1, hf.class);
/* 20 */     a(2, gk.class);
/* 21 */     a(3, hz.class);
/*    */     
/* 23 */     a(10, eb.class);
/* 24 */     a(11, r.class);
/* 25 */     a(12, lx.class);
/* 26 */     a(13, cd.class);
/* 27 */     a(14, ey.class);
/* 28 */     a(15, di.class);
/* 29 */     a(16, dt.class);
/* 30 */     a(17, ks.class);
/* 31 */     a(18, gv.class);
/*    */     
/* 33 */     a(20, gg.class);
/* 34 */     a(21, gq.class);
/* 35 */     a(22, bi.class);
/* 36 */     a(23, jz.class);
/* 37 */     a(29, jj.class);
/*    */     
/* 39 */     a(30, lf.class);
/* 40 */     a(31, ke.class);
/* 41 */     a(32, jn.class);
/* 42 */     a(33, ii.class);
/* 43 */     a(34, jb.class);
/*    */     
/* 45 */     a(50, jq.class);
/* 46 */     a(51, bv.class);
/* 47 */     a(52, mn.class);
/* 48 */     a(53, kx.class);
/*    */     
/* 50 */     a(255, nt.class);
/*    */   }
/*    */   
/*    */   public static fd a(int paramInt) {
/*    */     try {
/* 55 */       Class<fd> clazz = (Class)a.get(Integer.valueOf(paramInt));
/* 56 */       if (clazz == null) return null; 
/* 57 */       return clazz.newInstance();
/* 58 */     } catch (Exception exception) {
/* 59 */       exception.printStackTrace();
/* 60 */       System.out.println("Skipping packet with id " + paramInt);
/* 61 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int b() {
/* 66 */     return ((Integer)b.get(getClass())).intValue();
/*    */   }
/*    */   
/*    */   public boolean j = false;
/*    */   
/*    */   public static fd b(DataInputStream paramDataInputStream) {
/* 72 */     int i = paramDataInputStream.read();
/* 73 */     if (i == -1) return null;
/*    */     
/* 75 */     fd fd1 = a(i);
/* 76 */     if (fd1 == null) throw new IOException("Bad packet id " + i); 
/* 77 */     fd1.a(paramDataInputStream);
/* 78 */     return fd1;
/*    */   }
/*    */   
/*    */   public static void a(fd paramfd, DataOutputStream paramDataOutputStream) {
/* 82 */     paramDataOutputStream.write(paramfd.b());
/* 83 */     paramfd.a(paramDataOutputStream);
/*    */   }
/*    */   
/*    */   public abstract void a(DataInputStream paramDataInputStream);
/*    */   
/*    */   public abstract void a(DataOutputStream paramDataOutputStream);
/*    */   
/*    */   public abstract void a(kq paramkq);
/*    */   
/*    */   public abstract int a();
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\fd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */