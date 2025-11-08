package org.bouncycastle.cms;

import org.bouncycastle.operator.OperatorCreationException;

public interface SignerInformationVerifierProvider {
  SignerInformationVerifier get(SignerId paramSignerId) throws OperatorCreationException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cms/SignerInformationVerifierProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */