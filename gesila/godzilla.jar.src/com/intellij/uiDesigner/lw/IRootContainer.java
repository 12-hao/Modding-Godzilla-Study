package com.intellij.uiDesigner.lw;

public interface IRootContainer extends IContainer {
  String getClassToBind();
  
  String getButtonGroupName(IComponent paramIComponent);
  
  String[] getButtonGroupComponentIds(String paramString);
  
  boolean isInspectionSuppressed(String paramString1, String paramString2);
  
  IButtonGroup[] getButtonGroups();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/IRootContainer.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */