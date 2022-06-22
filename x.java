/*    */ 
/*    */ 
/*    */ 
/*    */ public class x
/*    */   extends bo
/*    */ {
/*  7 */   private static ln[] aV = new ln[] { ln.w, ln.aj, ln.ak, ln.t, ln.ao, ln.H, ln.ai, ln.I, ln.ah, ln.G, ln.aw, ln.ax, ln.aT };
/*    */   
/*    */   private int aW;
/*    */   
/*    */   public x(int paramInt1, int paramInt2) {
/* 12 */     super(paramInt1, 2, paramInt2, aV);
/* 13 */     this.aW = paramInt2;
/*    */   }
/*    */   
/*    */   public boolean a(ln paramln) {
/* 17 */     if (paramln == ln.ap) return (this.aW == 3); 
/* 18 */     if (paramln == ln.ax || paramln == ln.aw) return (this.aW >= 2); 
/* 19 */     if (paramln == ln.ah || paramln == ln.G) return (this.aW >= 2); 
/* 20 */     if (paramln == ln.ai || paramln == ln.H) return (this.aW >= 1); 
/* 21 */     if (paramln == ln.aN || paramln == ln.aO) return (this.aW >= 2); 
/* 22 */     if (paramln.bl == fs.d) return true; 
/* 23 */     if (paramln.bl == fs.e) return true; 
/* 24 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */