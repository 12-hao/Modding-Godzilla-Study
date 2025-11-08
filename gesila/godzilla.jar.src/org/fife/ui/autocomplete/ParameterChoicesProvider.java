package org.fife.ui.autocomplete;

import java.util.List;
import javax.swing.text.JTextComponent;

public interface ParameterChoicesProvider {
  List<Completion> getParameterChoices(JTextComponent paramJTextComponent, ParameterizedCompletion.Parameter paramParameter);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/autocomplete/ParameterChoicesProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */