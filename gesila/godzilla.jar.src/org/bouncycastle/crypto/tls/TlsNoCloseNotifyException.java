package org.bouncycastle.crypto.tls;

import java.io.EOFException;

public class TlsNoCloseNotifyException extends EOFException {
  public TlsNoCloseNotifyException() {
    super("No close_notify alert received before connection closed");
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/TlsNoCloseNotifyException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */