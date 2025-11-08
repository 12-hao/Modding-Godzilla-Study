/*    */ package org.fife.rsta.ac.java.classreader.attributes;
/*    */ 
/*    */ import org.fife.rsta.ac.java.classreader.ClassFile;
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
/*    */ public class UnsupportedAttribute
/*    */   extends AttributeInfo
/*    */ {
/*    */   private String name;
/*    */   
/*    */   public UnsupportedAttribute(ClassFile cf, String name) {
/* 34 */     super(cf);
/* 35 */     this.name = name;
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
/*    */   public String getName() {
/* 47 */     return this.name;
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
/*    */   public String toString() {
/* 59 */     return "[UnsupportedAttribute: name=" + 
/* 60 */       getName() + "]";
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/java/classreader/attributes/UnsupportedAttribute.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */