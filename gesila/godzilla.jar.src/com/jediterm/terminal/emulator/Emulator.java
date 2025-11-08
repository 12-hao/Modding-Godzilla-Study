package com.jediterm.terminal.emulator;

import java.io.IOException;

public interface Emulator {
  boolean hasNext();
  
  void next() throws IOException;
  
  void resetEof();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/emulator/Emulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */