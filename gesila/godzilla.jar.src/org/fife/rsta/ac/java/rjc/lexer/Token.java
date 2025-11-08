package org.fife.rsta.ac.java.rjc.lexer;

public interface Token extends TokenTypes {
  int getColumn();
  
  String getLexeme();
  
  int getLength();
  
  int getLine();
  
  int getOffset();
  
  int getType();
  
  boolean isBasicType();
  
  boolean isIdentifier();
  
  boolean isInvalid();
  
  boolean isOperator();
  
  boolean isType(int paramInt);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/java/rjc/lexer/Token.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */