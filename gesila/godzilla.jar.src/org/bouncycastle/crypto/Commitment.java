package org.bouncycastle.crypto;

public class Commitment {
  private final byte[] secret;
  
  private final byte[] commitment;
  
  public Commitment(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.secret = paramArrayOfbyte1;
    this.commitment = paramArrayOfbyte2;
  }
  
  public byte[] getSecret() {
    return this.secret;
  }
  
  public byte[] getCommitment() {
    return this.commitment;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/Commitment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */