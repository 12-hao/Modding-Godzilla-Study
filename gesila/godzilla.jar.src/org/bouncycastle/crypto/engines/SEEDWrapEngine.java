package org.bouncycastle.crypto.engines;

public class SEEDWrapEngine extends RFC3394WrapEngine {
  public SEEDWrapEngine() {
    super(new SEEDEngine());
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/engines/SEEDWrapEngine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */