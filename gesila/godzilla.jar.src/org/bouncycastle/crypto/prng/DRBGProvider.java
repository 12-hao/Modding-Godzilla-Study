package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;

interface DRBGProvider {
  SP80090DRBG get(EntropySource paramEntropySource);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/prng/DRBGProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */