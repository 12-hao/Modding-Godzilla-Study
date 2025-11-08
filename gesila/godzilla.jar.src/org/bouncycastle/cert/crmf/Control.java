package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface Control {
  ASN1ObjectIdentifier getType();
  
  ASN1Encodable getValue();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cert/crmf/Control.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */