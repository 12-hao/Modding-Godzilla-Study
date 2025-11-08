package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;

interface CMSReadable {
  InputStream getInputStream() throws IOException, CMSException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cms/CMSReadable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */