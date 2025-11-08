package org.bouncycastle.math.field;

public interface ExtensionField extends FiniteField {
  FiniteField getSubfield();
  
  int getDegree();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/math/field/ExtensionField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */