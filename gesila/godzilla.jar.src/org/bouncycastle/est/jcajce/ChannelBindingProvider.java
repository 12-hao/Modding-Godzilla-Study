package org.bouncycastle.est.jcajce;

import java.net.Socket;

public interface ChannelBindingProvider {
  boolean canAccessChannelBinding(Socket paramSocket);
  
  byte[] getChannelBinding(Socket paramSocket, String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/est/jcajce/ChannelBindingProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */