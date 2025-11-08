package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface CMSTypedData extends CMSProcessable {
  ASN1ObjectIdentifier getContentType();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cms/CMSTypedData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */