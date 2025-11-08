package org.fife.rsta.ui.search;

import java.util.EventListener;

public interface SearchListener extends EventListener {
  void searchEvent(SearchEvent paramSearchEvent);
  
  String getSelectedText();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ui/search/SearchListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */