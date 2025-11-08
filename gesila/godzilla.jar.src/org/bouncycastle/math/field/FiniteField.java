package org.bouncycastle.math.field;

import java.math.BigInteger;

public interface FiniteField {
  BigInteger getCharacteristic();
  
  int getDimension();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/math/field/FiniteField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */