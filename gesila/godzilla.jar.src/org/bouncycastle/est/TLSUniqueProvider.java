package org.bouncycastle.est;

public interface TLSUniqueProvider {
  boolean isTLSUniqueAvailable();
  
  byte[] getTLSUnique();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/est/TLSUniqueProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */