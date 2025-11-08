package org.bouncycastle.asn1;

public class DERObjectIdentifier extends ASN1ObjectIdentifier {
  public DERObjectIdentifier(String paramString) {
    super(paramString);
  }
  
  DERObjectIdentifier(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  DERObjectIdentifier(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    super(paramASN1ObjectIdentifier, paramString);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/asn1/DERObjectIdentifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */