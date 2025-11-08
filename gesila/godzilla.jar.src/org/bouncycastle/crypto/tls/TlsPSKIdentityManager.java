package org.bouncycastle.crypto.tls;

public interface TlsPSKIdentityManager {
  byte[] getHint();
  
  byte[] getPSK(byte[] paramArrayOfbyte);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/TlsPSKIdentityManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */