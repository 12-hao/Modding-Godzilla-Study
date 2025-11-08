package org.bouncycastle.asn1;

import java.math.BigInteger;

public class DEREnumerated extends ASN1Enumerated {
  DEREnumerated(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  public DEREnumerated(BigInteger paramBigInteger) {
    super(paramBigInteger);
  }
  
  public DEREnumerated(int paramInt) {
    super(paramInt);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/asn1/DEREnumerated.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */