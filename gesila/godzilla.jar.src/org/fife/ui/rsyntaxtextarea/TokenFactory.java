package org.fife.ui.rsyntaxtextarea;

import javax.swing.text.Segment;

interface TokenFactory {
  TokenImpl createToken();
  
  TokenImpl createToken(Segment paramSegment, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  TokenImpl createToken(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void resetAllTokens();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/TokenFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */