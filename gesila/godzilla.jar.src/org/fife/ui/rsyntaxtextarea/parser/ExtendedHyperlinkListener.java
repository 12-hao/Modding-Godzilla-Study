package org.fife.ui.rsyntaxtextarea.parser;

import java.util.EventListener;
import javax.swing.event.HyperlinkEvent;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

public interface ExtendedHyperlinkListener extends EventListener {
  void linkClicked(RSyntaxTextArea paramRSyntaxTextArea, HyperlinkEvent paramHyperlinkEvent);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/parser/ExtendedHyperlinkListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */