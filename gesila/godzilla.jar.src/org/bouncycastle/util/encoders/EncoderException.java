package org.bouncycastle.util.encoders;

public class EncoderException extends IllegalStateException {
  private Throwable cause;
  
  EncoderException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/encoders/EncoderException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */