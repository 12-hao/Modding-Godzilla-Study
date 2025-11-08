package com.jediterm.terminal.ui;

import com.jediterm.terminal.RequestOrigin;
import org.jetbrains.annotations.NotNull;

public interface TerminalPanelListener {
  void onPanelResize(@NotNull RequestOrigin paramRequestOrigin);
  
  void onSessionChanged(TerminalSession paramTerminalSession);
  
  void onTitleChanged(String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/ui/TerminalPanelListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */