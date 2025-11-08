/*    */ package com.intellij.uiDesigner.compiler;
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
/*    */ public class CodeGenerationException
/*    */   extends Exception
/*    */ {
/*    */   private String myComponentId;
/*    */   
/*    */   public CodeGenerationException(String componentId, String message) {
/* 22 */     super(message);
/* 23 */     this.myComponentId = componentId;
/*    */   }
/*    */   
/*    */   public String getComponentId() {
/* 27 */     return this.myComponentId;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/compiler/CodeGenerationException.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */