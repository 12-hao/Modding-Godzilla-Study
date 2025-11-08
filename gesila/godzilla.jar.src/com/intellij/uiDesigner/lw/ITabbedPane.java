package com.intellij.uiDesigner.lw;

public interface ITabbedPane extends IContainer {
  public static final String TAB_TITLE_PROPERTY = "Tab Title";
  
  public static final String TAB_TOOLTIP_PROPERTY = "Tab Tooltip";
  
  StringDescriptor getTabProperty(IComponent paramIComponent, String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/ITabbedPane.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */