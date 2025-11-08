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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FormErrorInfo
/*    */ {
/*    */   private String myComponentId;
/*    */   private String myErrorMessage;
/*    */   
/*    */   public FormErrorInfo(String componentId, String errorMessage) {
/* 27 */     this.myComponentId = componentId;
/* 28 */     this.myErrorMessage = errorMessage;
/*    */   }
/*    */   
/*    */   public String getComponentId() {
/* 32 */     return this.myComponentId;
/*    */   }
/*    */   
/*    */   public void setComponentId(String componentId) {
/* 36 */     this.myComponentId = componentId;
/*    */   }
/*    */   
/*    */   public String getErrorMessage() {
/* 40 */     return this.myErrorMessage;
/*    */   }
/*    */   
/*    */   public void setErrorMessage(String errorMessage) {
/* 44 */     this.myErrorMessage = errorMessage;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/compiler/FormErrorInfo.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */