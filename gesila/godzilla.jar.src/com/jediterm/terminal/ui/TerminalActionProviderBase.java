/*   */ package com.jediterm.terminal.ui;
/*   */ 
/*   */ 
/*   */ 
/*   */ public abstract class TerminalActionProviderBase
/*   */   implements TerminalActionProvider
/*   */ {
/*   */   public TerminalActionProvider getNextProvider() {
/* 9 */     return null;
/*   */   }
/*   */   
/*   */   public void setNextProvider(TerminalActionProvider provider) {}
/*   */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/ui/TerminalActionProviderBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */