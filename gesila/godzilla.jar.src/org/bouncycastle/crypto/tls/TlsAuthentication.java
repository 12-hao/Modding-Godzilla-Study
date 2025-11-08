package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsAuthentication {
  void notifyServerCertificate(Certificate paramCertificate) throws IOException;
  
  TlsCredentials getClientCredentials(CertificateRequest paramCertificateRequest) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/TlsAuthentication.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */