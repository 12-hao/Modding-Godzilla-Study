package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsCipherFactory {
  TlsCipher createCipher(TlsContext paramTlsContext, int paramInt1, int paramInt2) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/TlsCipherFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */