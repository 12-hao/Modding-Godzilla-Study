package org.bouncycastle.util;

public interface Memoable {
  Memoable copy();
  
  void reset(Memoable paramMemoable);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/Memoable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */