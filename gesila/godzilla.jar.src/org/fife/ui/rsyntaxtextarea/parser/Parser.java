package org.fife.ui.rsyntaxtextarea.parser;

import java.net.URL;
import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;

public interface Parser {
  ExtendedHyperlinkListener getHyperlinkListener();
  
  URL getImageBase();
  
  boolean isEnabled();
  
  ParseResult parse(RSyntaxDocument paramRSyntaxDocument, String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/parser/Parser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */