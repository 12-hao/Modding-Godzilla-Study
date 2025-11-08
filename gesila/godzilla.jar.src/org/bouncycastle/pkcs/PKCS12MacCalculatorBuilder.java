package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;

public interface PKCS12MacCalculatorBuilder {
  MacCalculator build(char[] paramArrayOfchar) throws OperatorCreationException;
  
  AlgorithmIdentifier getDigestAlgorithmIdentifier();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/pkcs/PKCS12MacCalculatorBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */