package com.jediterm.terminal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TerminalCopyPasteHandler {
  void setContents(@NotNull String paramString, boolean paramBoolean);
  
  @Nullable
  String getContents(boolean paramBoolean);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/TerminalCopyPasteHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */