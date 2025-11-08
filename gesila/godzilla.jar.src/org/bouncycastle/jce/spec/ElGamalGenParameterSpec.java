package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class ElGamalGenParameterSpec implements AlgorithmParameterSpec {
  private int primeSize;
  
  public ElGamalGenParameterSpec(int paramInt) {
    this.primeSize = paramInt;
  }
  
  public int getPrimeSize() {
    return this.primeSize;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jce/spec/ElGamalGenParameterSpec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */