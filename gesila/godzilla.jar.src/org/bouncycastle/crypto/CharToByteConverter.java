package org.bouncycastle.crypto;

public interface CharToByteConverter {
  String getType();
  
  byte[] convert(char[] paramArrayOfchar);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/CharToByteConverter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */