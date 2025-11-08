package org.bouncycastle.util;

public interface Selector<T> extends Cloneable {
  boolean match(T paramT);
  
  Object clone();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/Selector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */