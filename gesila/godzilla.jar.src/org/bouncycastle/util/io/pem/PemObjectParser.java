package org.bouncycastle.util.io.pem;

import java.io.IOException;

public interface PemObjectParser {
  Object parseObject(PemObject paramPemObject) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/io/pem/PemObjectParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */