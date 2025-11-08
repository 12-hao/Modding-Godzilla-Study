package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface TlsAgreementCredentials extends TlsCredentials {
  byte[] generateAgreement(AsymmetricKeyParameter paramAsymmetricKeyParameter) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/TlsAgreementCredentials.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */