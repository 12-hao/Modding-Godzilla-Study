package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public interface GOST3410PublicKey extends GOST3410Key, PublicKey {
  BigInteger getY();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jce/interfaces/GOST3410PublicKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */