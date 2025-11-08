package org.bouncycastle.crypto.prng.drbg;

public interface SP80090DRBG {
  int getBlockSize();
  
  int generate(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean);
  
  void reseed(byte[] paramArrayOfbyte);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/prng/drbg/SP80090DRBG.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */