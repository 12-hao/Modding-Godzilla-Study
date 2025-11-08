package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface InputExpanderProvider {
  InputExpander get(AlgorithmIdentifier paramAlgorithmIdentifier);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/operator/InputExpanderProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */