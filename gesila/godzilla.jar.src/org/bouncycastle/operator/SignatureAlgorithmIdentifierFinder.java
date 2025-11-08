package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface SignatureAlgorithmIdentifierFinder {
  AlgorithmIdentifier find(String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/operator/SignatureAlgorithmIdentifierFinder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */