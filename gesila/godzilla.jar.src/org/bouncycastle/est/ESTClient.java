package org.bouncycastle.est;

import java.io.IOException;

public interface ESTClient {
  ESTResponse doRequest(ESTRequest paramESTRequest) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/est/ESTClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */