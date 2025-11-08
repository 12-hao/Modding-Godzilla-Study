/*    */ package com.formdev.flatlaf.extras.components;
/*    */ 
/*    */ import javax.swing.JScrollBar;
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
/*    */ public class FlatScrollBar
/*    */   extends JScrollBar
/*    */   implements FlatComponentExtension
/*    */ {
/*    */   public boolean isShowButtons() {
/* 35 */     return getClientPropertyBoolean("JScrollBar.showButtons", "ScrollBar.showButtons");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setShowButtons(boolean showButtons) {
/* 42 */     putClientProperty("JScrollBar.showButtons", Boolean.valueOf(showButtons));
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/formdev/flatlaf/extras/components/FlatScrollBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */