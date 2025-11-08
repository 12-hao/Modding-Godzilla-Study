package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

public class BadBlockException extends BadPaddingException {
  private final Throwable cause;
  
  public BadBlockException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jcajce/provider/util/BadBlockException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */