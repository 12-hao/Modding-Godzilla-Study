package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class LocaleString extends LocalizedMessage {
  public LocaleString(String paramString1, String paramString2) {
    super(paramString1, paramString2);
  }
  
  public LocaleString(String paramString1, String paramString2, String paramString3) throws NullPointerException, UnsupportedEncodingException {
    super(paramString1, paramString2, paramString3);
  }
  
  public LocaleString(String paramString1, String paramString2, String paramString3, Object[] paramArrayOfObject) throws NullPointerException, UnsupportedEncodingException {
    super(paramString1, paramString2, paramString3, paramArrayOfObject);
  }
  
  public String getLocaleString(Locale paramLocale) {
    return getEntry(null, paramLocale, null);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/i18n/LocaleString.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */