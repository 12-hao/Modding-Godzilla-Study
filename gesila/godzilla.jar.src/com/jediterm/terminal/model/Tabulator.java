package com.jediterm.terminal.model;

public interface Tabulator {
  void clearTabStop(int paramInt);
  
  void clearAllTabStops();
  
  int getNextTabWidth(int paramInt);
  
  int getPreviousTabWidth(int paramInt);
  
  int nextTab(int paramInt);
  
  int previousTab(int paramInt);
  
  void setTabStop(int paramInt);
  
  void resize(int paramInt);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/model/Tabulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */