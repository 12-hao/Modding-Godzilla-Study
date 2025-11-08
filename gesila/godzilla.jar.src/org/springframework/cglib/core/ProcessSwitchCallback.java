package org.springframework.cglib.core;

import org.springframework.asm.Label;

public interface ProcessSwitchCallback {
  void processCase(int paramInt, Label paramLabel) throws Exception;
  
  void processDefault() throws Exception;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/cglib/core/ProcessSwitchCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */