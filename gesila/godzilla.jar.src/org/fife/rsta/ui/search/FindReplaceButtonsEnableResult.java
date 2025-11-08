/*    */ package org.fife.rsta.ui.search;
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
/*    */ public class FindReplaceButtonsEnableResult
/*    */ {
/*    */   private boolean enable;
/*    */   private String error;
/*    */   
/*    */   public FindReplaceButtonsEnableResult(boolean enable, String error) {
/* 27 */     this.enable = enable;
/* 28 */     this.error = error;
/*    */   }
/*    */   
/*    */   public boolean getEnable() {
/* 32 */     return this.enable;
/*    */   }
/*    */   
/*    */   public String getError() {
/* 36 */     return this.error;
/*    */   }
/*    */   
/*    */   public void setEnable(boolean enable) {
/* 40 */     this.enable = enable;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ui/search/FindReplaceButtonsEnableResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */