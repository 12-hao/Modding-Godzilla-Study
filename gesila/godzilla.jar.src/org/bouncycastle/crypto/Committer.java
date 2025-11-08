package org.bouncycastle.crypto;

public interface Committer {
  Commitment commit(byte[] paramArrayOfbyte);
  
  boolean isRevealed(Commitment paramCommitment, byte[] paramArrayOfbyte);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/Committer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */