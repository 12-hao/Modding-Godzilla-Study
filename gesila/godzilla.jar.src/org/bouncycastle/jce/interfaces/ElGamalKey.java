package org.bouncycastle.jce.interfaces;

import javax.crypto.interfaces.DHKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

public interface ElGamalKey extends DHKey {
  ElGamalParameterSpec getParameters();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jce/interfaces/ElGamalKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */