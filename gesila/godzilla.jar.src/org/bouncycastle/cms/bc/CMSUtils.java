package org.bouncycastle.cms.bc;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.operator.GenericKey;

class CMSUtils {
  static CipherParameters getBcKey(GenericKey paramGenericKey) {
    if (paramGenericKey.getRepresentation() instanceof CipherParameters)
      return (CipherParameters)paramGenericKey.getRepresentation(); 
    if (paramGenericKey.getRepresentation() instanceof byte[])
      return (CipherParameters)new KeyParameter((byte[])paramGenericKey.getRepresentation()); 
    throw new IllegalArgumentException("unknown generic key type");
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cms/bc/CMSUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */