package org.springframework.cglib.core;

public interface GeneratorStrategy {
  byte[] generate(ClassGenerator paramClassGenerator) throws Exception;
  
  boolean equals(Object paramObject);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/cglib/core/GeneratorStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */