package org.fife.ui.autocomplete;

import javax.swing.Icon;
import javax.swing.text.JTextComponent;

public interface Completion extends Comparable<Completion> {
  int compareTo(Completion paramCompletion);
  
  String getAlreadyEntered(JTextComponent paramJTextComponent);
  
  Icon getIcon();
  
  String getInputText();
  
  CompletionProvider getProvider();
  
  int getRelevance();
  
  String getReplacementText();
  
  String getSummary();
  
  String getToolTipText();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/autocomplete/Completion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */