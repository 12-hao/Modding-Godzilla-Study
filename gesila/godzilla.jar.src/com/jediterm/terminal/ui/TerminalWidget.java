/*    */ package com.jediterm.terminal.ui;
/*    */ 
/*    */ import com.jediterm.terminal.TerminalDisplay;
/*    */ import com.jediterm.terminal.TtyConnector;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface TerminalWidget
/*    */ {
/*    */   JediTermWidget createTerminalSession(TtyConnector paramTtyConnector);
/*    */   
/*    */   JComponent getComponent();
/*    */   
/*    */   default JComponent getPreferredFocusableComponent() {
/* 18 */     return getComponent();
/*    */   }
/*    */   
/*    */   boolean canOpenSession();
/*    */   
/*    */   void setTerminalPanelListener(TerminalPanelListener paramTerminalPanelListener);
/*    */   
/*    */   Dimension getPreferredSize();
/*    */   
/*    */   TerminalSession getCurrentSession();
/*    */   
/*    */   TerminalDisplay getTerminalDisplay();
/*    */   
/*    */   void addListener(TerminalWidgetListener paramTerminalWidgetListener);
/*    */   
/*    */   void removeListener(TerminalWidgetListener paramTerminalWidgetListener);
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/ui/TerminalWidget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */