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
/*     */ public class Vector3D
/*     */ {
/*     */   public float x;
/*     */   public float y;
/*     */   public float z;
/*     */   
/*     */   public Vector3D() {
/*  62 */     this.x = 0.0F;
/*  63 */     this.y = 0.0F;
/*  64 */     this.z = 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  75 */     this.x = paramFloat1;
/*  76 */     this.y = paramFloat2;
/*  77 */     this.z = paramFloat3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D clone() {
/*  87 */     return new Vector3D(this.x, this.y, this.z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D cross(Vector3D paramVector3D1, Vector3D paramVector3D2) {
/*  98 */     return new Vector3D(paramVector3D1.y * paramVector3D2.z - paramVector3D2.y * paramVector3D1.z, paramVector3D1.z * paramVector3D2.x - paramVector3D2.z * paramVector3D1.x, paramVector3D1.x * paramVector3D2.y - paramVector3D2.x * paramVector3D1.y);
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
/*     */   public Vector3D cross(Vector3D paramVector3D) {
/* 111 */     return new Vector3D(this.y * paramVector3D.z - paramVector3D.y * this.z, this.z * paramVector3D.x - paramVector3D.z * this.x, this.x * paramVector3D.y - paramVector3D.x * this.y);
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
/*     */   public float dot(Vector3D paramVector3D1, Vector3D paramVector3D2) {
/* 126 */     return paramVector3D1.x * paramVector3D2.x + paramVector3D1.y * paramVector3D2.y + paramVector3D1.z * paramVector3D2.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float dot(Vector3D paramVector3D) {
/* 136 */     return this.x * paramVector3D.x + this.y * paramVector3D.y + this.z * paramVector3D.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D add(Vector3D paramVector3D1, Vector3D paramVector3D2) {
/* 147 */     return new Vector3D(paramVector3D1.x + paramVector3D2.x, paramVector3D1.y + paramVector3D2.y, paramVector3D1.z + paramVector3D2.z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D add(Vector3D paramVector3D) {
/* 157 */     return new Vector3D(this.x + paramVector3D.x, this.y + paramVector3D.y, this.z + paramVector3D.z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D subtract(Vector3D paramVector3D1, Vector3D paramVector3D2) {
/* 168 */     return new Vector3D(paramVector3D1.x - paramVector3D2.x, paramVector3D1.y - paramVector3D2.y, paramVector3D1.z - paramVector3D2.z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3D subtract(Vector3D paramVector3D) {
/* 178 */     return new Vector3D(this.x - paramVector3D.x, this.y - paramVector3D.y, this.z - paramVector3D.z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void normalize() {
/* 186 */     double d = Math.sqrt((this.x * this.x + this.y * this.y + this.z * this.z));
/* 187 */     this.x = (float)(this.x / d);
/* 188 */     this.y = (float)(this.y / d);
/* 189 */     this.z = (float)(this.z / d);
/*     */   }
/*     */ }


/* Location:              C:\Users\xemulated\Downloads\v1605_preview.jar!\paulscode\sound\Vector3D.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */