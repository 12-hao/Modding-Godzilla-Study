package org.fife.ui.rsyntaxtextarea;

import org.fife.ui.rtextarea.SmartHighlightPainter;

public interface OccurrenceMarker {
  Token getTokenToMark(RSyntaxTextArea paramRSyntaxTextArea);
  
  boolean isValidType(RSyntaxTextArea paramRSyntaxTextArea, Token paramToken);
  
  void markOccurrences(RSyntaxDocument paramRSyntaxDocument, Token paramToken, RSyntaxTextAreaHighlighter paramRSyntaxTextAreaHighlighter, SmartHighlightPainter paramSmartHighlightPainter);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/OccurrenceMarker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */