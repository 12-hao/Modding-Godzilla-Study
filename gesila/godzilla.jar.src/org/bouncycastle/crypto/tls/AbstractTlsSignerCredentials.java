package org.bouncycastle.crypto.tls;

public abstract class AbstractTlsSignerCredentials extends AbstractTlsCredentials implements TlsSignerCredentials {
  public SignatureAndHashAlgorithm getSignatureAndHashAlgorithm() {
    throw new IllegalStateException("TlsSignerCredentials implementation does not support (D)TLS 1.2+");
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/AbstractTlsSignerCredentials.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */