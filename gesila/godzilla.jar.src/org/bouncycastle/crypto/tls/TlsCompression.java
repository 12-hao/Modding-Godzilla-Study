package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

public interface TlsCompression {
  OutputStream compress(OutputStream paramOutputStream);
  
  OutputStream decompress(OutputStream paramOutputStream);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/TlsCompression.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */