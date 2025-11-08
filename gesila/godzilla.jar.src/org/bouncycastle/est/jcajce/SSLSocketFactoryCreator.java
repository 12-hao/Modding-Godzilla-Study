package org.bouncycastle.est.jcajce;

import javax.net.ssl.SSLSocketFactory;

public interface SSLSocketFactoryCreator {
  SSLSocketFactory createFactory() throws Exception;
  
  boolean isTrusted();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/est/jcajce/SSLSocketFactoryCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */