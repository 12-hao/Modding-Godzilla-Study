package com.jediterm.terminal.ui;

import java.util.List;

public interface TerminalActionProvider {
  List<TerminalAction> getActions();
  
  TerminalActionProvider getNextProvider();
  
  void setNextProvider(TerminalActionProvider paramTerminalActionProvider);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/ui/TerminalActionProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */