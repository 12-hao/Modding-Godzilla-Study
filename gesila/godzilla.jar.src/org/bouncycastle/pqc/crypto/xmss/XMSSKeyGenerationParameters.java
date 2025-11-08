package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public final class XMSSKeyGenerationParameters extends KeyGenerationParameters {
  private final XMSSParameters xmssParameters;
  
  public XMSSKeyGenerationParameters(XMSSParameters paramXMSSParameters, SecureRandom paramSecureRandom) {
    super(paramSecureRandom, -1);
    this.xmssParameters = paramXMSSParameters;
  }
  
  public XMSSParameters getParameters() {
    return this.xmssParameters;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/pqc/crypto/xmss/XMSSKeyGenerationParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */