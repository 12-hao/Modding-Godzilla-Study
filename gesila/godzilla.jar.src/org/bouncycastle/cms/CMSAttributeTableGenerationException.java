package org.bouncycastle.cms;

public class CMSAttributeTableGenerationException extends CMSRuntimeException {
  Exception e;
  
  public CMSAttributeTableGenerationException(String paramString) {
    super(paramString);
  }
  
  public CMSAttributeTableGenerationException(String paramString, Exception paramException) {
    super(paramString);
    this.e = paramException;
  }
  
  public Exception getUnderlyingException() {
    return this.e;
  }
  
  public Throwable getCause() {
    return this.e;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cms/CMSAttributeTableGenerationException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */