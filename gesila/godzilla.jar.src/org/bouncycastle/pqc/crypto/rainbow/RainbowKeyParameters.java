package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class RainbowKeyParameters extends AsymmetricKeyParameter {
  private int docLength;
  
  public RainbowKeyParameters(boolean paramBoolean, int paramInt) {
    super(paramBoolean);
    this.docLength = paramInt;
  }
  
  public int getDocLength() {
    return this.docLength;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/pqc/crypto/rainbow/RainbowKeyParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */