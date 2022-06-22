/*    */ import java.net.ConnectException;
/*    */ import java.net.UnknownHostException;
/*    */ import net.minecraft.client.Minecraft;
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
/*    */ class mp
/*    */   extends Thread
/*    */ {
/*    */   mp(mc parammc, Minecraft paramMinecraft, String paramString, int paramInt) {}
/*    */   
/*    */   public void run() {
/*    */     try {
/* 21 */       mc.a(this.d, new go(this.a, this.b, this.c));
/* 22 */       if (mc.a(this.d))
/* 23 */         return;  mc.b(this.d).a(new gk(this.a.i.b));
/* 24 */     } catch (UnknownHostException unknownHostException) {
/* 25 */       if (mc.a(this.d))
/* 26 */         return;  this.a.a(new cf("Failed to connect to the server", "Unknown host '" + this.b + "'"));
/* 27 */     } catch (ConnectException connectException) {
/* 28 */       if (mc.a(this.d))
/* 29 */         return;  this.a.a(new cf("Failed to connect to the server", connectException.getMessage()));
/* 30 */     } catch (Exception exception) {
/* 31 */       if (mc.a(this.d))
/* 32 */         return;  exception.printStackTrace();
/* 33 */       this.a.a(new cf("Failed to connect to the server", exception.toString()));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\mp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */