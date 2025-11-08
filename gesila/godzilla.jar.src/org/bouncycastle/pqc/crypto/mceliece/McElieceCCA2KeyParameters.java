package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter {
  private String params;
  
  public McElieceCCA2KeyParameters(boolean paramBoolean, String paramString) {
    super(paramBoolean);
    this.params = paramString;
  }
  
  public String getDigest() {
    return this.params;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */