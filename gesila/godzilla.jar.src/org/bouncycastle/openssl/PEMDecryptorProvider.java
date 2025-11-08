package org.bouncycastle.openssl;

import org.bouncycastle.operator.OperatorCreationException;

public interface PEMDecryptorProvider {
  PEMDecryptor get(String paramString) throws OperatorCreationException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/openssl/PEMDecryptorProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */