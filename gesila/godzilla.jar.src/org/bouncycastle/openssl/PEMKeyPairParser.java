package org.bouncycastle.openssl;

import java.io.IOException;

interface PEMKeyPairParser {
  PEMKeyPair parse(byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/openssl/PEMKeyPairParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */