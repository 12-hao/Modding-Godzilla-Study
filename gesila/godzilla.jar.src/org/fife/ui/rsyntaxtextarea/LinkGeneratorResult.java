package org.fife.ui.rsyntaxtextarea;

import javax.swing.event.HyperlinkEvent;

public interface LinkGeneratorResult {
  HyperlinkEvent execute();
  
  int getSourceOffset();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/LinkGeneratorResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */