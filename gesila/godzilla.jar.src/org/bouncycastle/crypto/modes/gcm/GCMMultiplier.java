package org.bouncycastle.crypto.modes.gcm;

public interface GCMMultiplier {
  void init(byte[] paramArrayOfbyte);
  
  void multiplyH(byte[] paramArrayOfbyte);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/modes/gcm/GCMMultiplier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */