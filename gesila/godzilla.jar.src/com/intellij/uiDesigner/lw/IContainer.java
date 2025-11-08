package com.intellij.uiDesigner.lw;

import com.intellij.uiDesigner.shared.BorderType;

public interface IContainer extends IComponent {
  int getComponentCount();
  
  IComponent getComponent(int paramInt);
  
  int indexOfComponent(IComponent paramIComponent);
  
  boolean isXY();
  
  StringDescriptor getBorderTitle();
  
  BorderType getBorderType();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/IContainer.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */