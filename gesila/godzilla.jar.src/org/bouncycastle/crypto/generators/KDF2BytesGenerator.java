package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.Digest;

public class KDF2BytesGenerator extends BaseKDFBytesGenerator {
  public KDF2BytesGenerator(Digest paramDigest) {
    super(1, paramDigest);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/generators/KDF2BytesGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */