package org.bouncycastle.crypto.tls;

public class SupplementalDataEntry {
  protected int dataType;
  
  protected byte[] data;
  
  public SupplementalDataEntry(int paramInt, byte[] paramArrayOfbyte) {
    this.dataType = paramInt;
    this.data = paramArrayOfbyte;
  }
  
  public int getDataType() {
    return this.dataType;
  }
  
  public byte[] getData() {
    return this.data;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/SupplementalDataEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */