package org.bouncycastle.crypto.engines;

public class AESWrapPadEngine extends RFC5649WrapEngine {
  public AESWrapPadEngine() {
    super(new AESEngine());
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/engines/AESWrapPadEngine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */