package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface DatagramTransport {
  int getReceiveLimit() throws IOException;
  
  int getSendLimit() throws IOException;
  
  int receive(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException;
  
  void send(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  void close() throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/DatagramTransport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */