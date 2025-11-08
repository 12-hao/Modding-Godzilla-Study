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
/*    */ final class SearchUtil
/*    */ {
/*    */   public static String getToolTip(FindReplaceButtonsEnableResult res) {
/* 37 */     String tooltip = res.getError();
/* 38 */     if (tooltip != null && tooltip.indexOf('\n') > -1) {
/* 39 */       tooltip = tooltip.replaceFirst("\\\n", "</b><br><pre>");
/* 40 */       tooltip = "<html><b>" + tooltip;
/*    */     } 
/* 42 */     return tooltip;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ui/search/SearchUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */