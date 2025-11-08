package org.bouncycastle.crypto;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface KeyParser {
  AsymmetricKeyParameter readKey(InputStream paramInputStream) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/KeyParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */