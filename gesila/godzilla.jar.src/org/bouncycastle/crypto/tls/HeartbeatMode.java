package org.bouncycastle.crypto.tls;

public class HeartbeatMode {
  public static final short peer_allowed_to_send = 1;
  
  public static final short peer_not_allowed_to_send = 2;
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 1 && paramShort <= 2);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/HeartbeatMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */