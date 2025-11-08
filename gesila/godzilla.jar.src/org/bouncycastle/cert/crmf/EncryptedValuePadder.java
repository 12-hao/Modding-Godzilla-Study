package org.bouncycastle.cert.crmf;

public interface EncryptedValuePadder {
  byte[] getPaddedData(byte[] paramArrayOfbyte);
  
  byte[] getUnpaddedData(byte[] paramArrayOfbyte);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cert/crmf/EncryptedValuePadder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */