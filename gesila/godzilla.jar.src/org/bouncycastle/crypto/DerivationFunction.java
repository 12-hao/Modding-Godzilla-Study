package org.bouncycastle.crypto;

public interface DerivationFunction {
  void init(DerivationParameters paramDerivationParameters);
  
  int generateBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws DataLengthException, IllegalArgumentException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/DerivationFunction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */