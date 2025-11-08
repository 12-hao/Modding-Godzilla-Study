package org.bouncycastle.pkcs;

import java.io.IOException;

public class PKCSIOException extends IOException {
  private Throwable cause;
  
  public PKCSIOException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public PKCSIOException(String paramString) {
    super(paramString);
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/pkcs/PKCSIOException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */