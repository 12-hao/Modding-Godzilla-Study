package org.springframework.asm.commons;

import org.springframework.asm.Label;

public interface TableSwitchGenerator {
  void generateCase(int paramInt, Label paramLabel);
  
  void generateDefault();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/asm/commons/TableSwitchGenerator.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */