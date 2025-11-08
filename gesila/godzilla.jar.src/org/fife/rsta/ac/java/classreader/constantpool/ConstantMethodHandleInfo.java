/*    */ package org.fife.rsta.ac.java.classreader.constantpool;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConstantMethodHandleInfo
/*    */   extends ConstantPoolInfo
/*    */ {
/*    */   private int referenceKind;
/*    */   private int referenceIndex;
/*    */   
/*    */   public ConstantMethodHandleInfo(int referenceKind, int referenceIndex) {
/* 33 */     super(15);
/* 34 */     this.referenceKind = referenceKind;
/* 35 */     this.referenceIndex = referenceIndex;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getReferenceKind() {
/* 40 */     return this.referenceKind;
/*    */   }
/*    */   
/*    */   public int getReferenceIndex() {
/* 44 */     return this.referenceIndex;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 55 */     return "[ConstantMethodHandleInfo: referenceKind=" + 
/* 56 */       getReferenceKind() + "; referenceIndex=" + 
/* 57 */       getReferenceIndex() + "]";
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/java/classreader/constantpool/ConstantMethodHandleInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */