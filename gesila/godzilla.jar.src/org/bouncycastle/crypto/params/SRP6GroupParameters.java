package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class SRP6GroupParameters {
  private BigInteger N;
  
  private BigInteger g;
  
  public SRP6GroupParameters(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    this.N = paramBigInteger1;
    this.g = paramBigInteger2;
  }
  
  public BigInteger getG() {
    return this.g;
  }
  
  public BigInteger getN() {
    return this.N;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/params/SRP6GroupParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */