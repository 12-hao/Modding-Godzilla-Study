package com.jgoodies.common.collect;

public interface ObservableList2<E> extends ObservableList<E> {
  void fireContentsChanged(int paramInt);
  
  void fireContentsChanged(int paramInt1, int paramInt2);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jgoodies/common/collect/ObservableList2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */