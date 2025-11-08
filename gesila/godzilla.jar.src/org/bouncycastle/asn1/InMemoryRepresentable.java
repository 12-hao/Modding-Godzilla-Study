package org.bouncycastle.asn1;

import java.io.IOException;

public interface InMemoryRepresentable {
  ASN1Primitive getLoadedObject() throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/asn1/InMemoryRepresentable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */