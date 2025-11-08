package org.fife.rsta.ac.java;

import java.awt.Graphics;
import org.fife.ui.autocomplete.Completion;

public interface JavaSourceCompletion extends Completion {
  boolean equals(Object paramObject);
  
  void rendererText(Graphics paramGraphics, int paramInt1, int paramInt2, boolean paramBoolean);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/java/JavaSourceCompletion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */