package org.bouncycastle.openssl;

public class EncryptionException extends PEMException {
  private Throwable cause;
  
  public EncryptionException(String paramString) {
    super(paramString);
  }
  
  public EncryptionException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/openssl/EncryptionException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */