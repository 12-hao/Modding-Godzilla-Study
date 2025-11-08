package org.springframework.cglib.core;

import org.springframework.asm.ClassVisitor;

public interface ClassGenerator {
  void generateClass(ClassVisitor paramClassVisitor) throws Exception;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/cglib/core/ClassGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */