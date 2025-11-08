package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.Digest;

public class KDF1BytesGenerator extends BaseKDFBytesGenerator {
  public KDF1BytesGenerator(Digest paramDigest) {
    super(0, paramDigest);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/generators/KDF1BytesGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */