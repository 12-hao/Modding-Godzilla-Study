/*    */ package com.formdev.flatlaf.ui;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.plaf.ComponentUI;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FlatCheckBoxUI
/*    */   extends FlatRadioButtonUI
/*    */ {
/*    */   public static ComponentUI createUI(JComponent c) {
/* 46 */     return FlatUIUtils.createSharedUI(FlatCheckBoxUI.class, FlatCheckBoxUI::new);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getPropertyPrefix() {
/* 51 */     return "CheckBox.";
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/formdev/flatlaf/ui/FlatCheckBoxUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */