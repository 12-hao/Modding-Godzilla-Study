package org.bouncycastle.crypto.tls;

public class ECBasisType {
  public static final short ec_basis_trinomial = 1;
  
  public static final short ec_basis_pentanomial = 2;
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 1 && paramShort <= 2);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/tls/ECBasisType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */