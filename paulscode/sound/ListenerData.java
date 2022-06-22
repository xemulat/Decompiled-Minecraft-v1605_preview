/*     */ package paulscode.sound;
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
/*     */ public class ListenerData
/*     */ {
/*     */   public Vector3D position;
/*     */   public Vector3D lookAt;
/*     */   public Vector3D up;
/*  61 */   public float angle = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ListenerData() {
/*  68 */     this.position = new Vector3D(0.0F, 0.0F, 0.0F);
/*  69 */     this.lookAt = new Vector3D(0.0F, 0.0F, -1.0F);
/*  70 */     this.up = new Vector3D(0.0F, 1.0F, 0.0F);
/*  71 */     this.angle = 0.0F;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ListenerData(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10) {
/*  91 */     this.position = new Vector3D(paramFloat1, paramFloat2, paramFloat3);
/*  92 */     this.lookAt = new Vector3D(paramFloat4, paramFloat5, paramFloat6);
/*  93 */     this.up = new Vector3D(paramFloat7, paramFloat8, paramFloat9);
/*  94 */     this.angle = paramFloat10;
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
/*     */   public ListenerData(Vector3D paramVector3D1, Vector3D paramVector3D2, Vector3D paramVector3D3, float paramFloat) {
/* 107 */     this.position = paramVector3D1.clone();
/* 108 */     this.lookAt = paramVector3D2.clone();
/* 109 */     this.up = paramVector3D3.clone();
/* 110 */     this.angle = paramFloat;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setData(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10) {
/* 130 */     this.position.x = paramFloat1;
/* 131 */     this.position.y = paramFloat2;
/* 132 */     this.position.z = paramFloat3;
/* 133 */     this.lookAt.x = paramFloat4;
/* 134 */     this.lookAt.y = paramFloat5;
/* 135 */     this.lookAt.z = paramFloat6;
/* 136 */     this.up.x = paramFloat7;
/* 137 */     this.up.y = paramFloat8;
/* 138 */     this.up.z = paramFloat9;
/* 139 */     this.angle = paramFloat10;
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
/*     */   public void setData(Vector3D paramVector3D1, Vector3D paramVector3D2, Vector3D paramVector3D3, float paramFloat) {
/* 152 */     this.position.x = paramVector3D1.x;
/* 153 */     this.position.y = paramVector3D1.y;
/* 154 */     this.position.z = paramVector3D1.z;
/* 155 */     this.lookAt.x = paramVector3D2.x;
/* 156 */     this.lookAt.y = paramVector3D2.y;
/* 157 */     this.lookAt.z = paramVector3D2.z;
/* 158 */     this.up.x = paramVector3D3.x;
/* 159 */     this.up.y = paramVector3D3.y;
/* 160 */     this.up.z = paramVector3D3.z;
/* 161 */     this.angle = paramFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setData(ListenerData paramListenerData) {
/* 170 */     this.position.x = paramListenerData.position.x;
/* 171 */     this.position.y = paramListenerData.position.y;
/* 172 */     this.position.z = paramListenerData.position.z;
/* 173 */     this.lookAt.x = paramListenerData.lookAt.x;
/* 174 */     this.lookAt.y = paramListenerData.lookAt.y;
/* 175 */     this.lookAt.z = paramListenerData.lookAt.z;
/* 176 */     this.up.x = paramListenerData.up.x;
/* 177 */     this.up.y = paramListenerData.up.y;
/* 178 */     this.up.z = paramListenerData.up.z;
/* 179 */     this.angle = paramListenerData.angle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosition(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 190 */     this.position.x = paramFloat1;
/* 191 */     this.position.y = paramFloat2;
/* 192 */     this.position.z = paramFloat3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosition(Vector3D paramVector3D) {
/* 201 */     this.position.x = paramVector3D.x;
/* 202 */     this.position.y = paramVector3D.y;
/* 203 */     this.position.z = paramVector3D.z;
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
/*     */   public void setOrientation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 218 */     this.lookAt.x = paramFloat1;
/* 219 */     this.lookAt.y = paramFloat2;
/* 220 */     this.lookAt.z = paramFloat3;
/* 221 */     this.up.x = paramFloat4;
/* 222 */     this.up.y = paramFloat5;
/* 223 */     this.up.z = paramFloat6;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrientation(Vector3D paramVector3D1, Vector3D paramVector3D2) {
/* 233 */     this.lookAt.x = paramVector3D1.x;
/* 234 */     this.lookAt.y = paramVector3D1.y;
/* 235 */     this.lookAt.z = paramVector3D1.z;
/* 236 */     this.up.x = paramVector3D2.x;
/* 237 */     this.up.y = paramVector3D2.y;
/* 238 */     this.up.z = paramVector3D2.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAngle(float paramFloat) {
/* 247 */     this.angle = paramFloat;
/* 248 */     this.lookAt.x = -1.0F * (float)Math.sin(this.angle);
/* 249 */     this.lookAt.z = -1.0F * (float)Math.cos(this.angle);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\ListenerData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */