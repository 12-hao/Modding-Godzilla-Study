package org.bouncycastle.jce.interfaces;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;

public interface IESKey extends Key {
  PublicKey getPublic();
  
  PrivateKey getPrivate();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jce/interfaces/IESKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */