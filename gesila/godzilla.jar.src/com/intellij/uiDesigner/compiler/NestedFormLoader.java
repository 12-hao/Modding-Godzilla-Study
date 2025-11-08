package com.intellij.uiDesigner.compiler;

import com.intellij.uiDesigner.lw.LwRootContainer;

public interface NestedFormLoader {
  LwRootContainer loadForm(String paramString) throws Exception;
  
  String getClassToBindName(LwRootContainer paramLwRootContainer);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/compiler/NestedFormLoader.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */