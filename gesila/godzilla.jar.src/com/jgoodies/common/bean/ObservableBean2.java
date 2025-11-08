package com.jgoodies.common.bean;

import java.beans.PropertyChangeListener;

public interface ObservableBean2 extends ObservableBean {
  void addPropertyChangeListener(String paramString, PropertyChangeListener paramPropertyChangeListener);
  
  void removePropertyChangeListener(String paramString, PropertyChangeListener paramPropertyChangeListener);
  
  PropertyChangeListener[] getPropertyChangeListeners();
  
  PropertyChangeListener[] getPropertyChangeListeners(String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jgoodies/common/bean/ObservableBean2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */