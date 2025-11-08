/*    */ package org.fife.rsta.ac.java.rjc.lang;
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
/*    */ public class Annotation
/*    */ {
/*    */   private Type type;
/*    */   
/*    */   public Annotation(Type type) {
/* 20 */     this.type = type;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 26 */     return "@" + this.type.toString();
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/java/rjc/lang/Annotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */