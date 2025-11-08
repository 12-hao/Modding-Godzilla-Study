package org.bouncycastle.est;

public interface ESTClientProvider {
  ESTClient makeClient() throws ESTException;
  
  boolean isTrusted();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/est/ESTClientProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */