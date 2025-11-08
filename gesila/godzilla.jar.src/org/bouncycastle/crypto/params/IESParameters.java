package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class IESParameters implements CipherParameters {
  private byte[] derivation;
  
  private byte[] encoding;
  
  private int macKeySize;
  
  public IESParameters(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    this.derivation = paramArrayOfbyte1;
    this.encoding = paramArrayOfbyte2;
    this.macKeySize = paramInt;
  }
  
  public byte[] getDerivationV() {
    return this.derivation;
  }
  
  public byte[] getEncodingV() {
    return this.encoding;
  }
  
  public int getMacKeySize() {
    return this.macKeySize;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/params/IESParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */