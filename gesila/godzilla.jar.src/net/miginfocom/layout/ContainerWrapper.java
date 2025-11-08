package net.miginfocom.layout;

public interface ContainerWrapper extends ComponentWrapper {
  ComponentWrapper[] getComponents();
  
  int getComponentCount();
  
  Object getLayout();
  
  boolean isLeftToRight();
  
  void paintDebugCell(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/net/miginfocom/layout/ContainerWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */