package org.bouncycastle.crypto.modes.gcm;

public interface GCMExponentiator {
  void init(byte[] paramArrayOfbyte);
  
  void exponentiateX(long paramLong, byte[] paramArrayOfbyte);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/modes/gcm/GCMExponentiator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */