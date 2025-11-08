package org.bouncycastle.est;

import java.io.IOException;

public interface ESTHijacker {
  ESTResponse hijack(ESTRequest paramESTRequest, Source paramSource) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/est/ESTHijacker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */