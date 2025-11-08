package org.bouncycastle.jcajce.provider.asymmetric.util;

public class PrimeCertaintyCalculator {
  public static int getDefaultCertainty(int paramInt) {
    return (paramInt <= 1024) ? 80 : (96 + 16 * (paramInt - 1) / 1024);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jcajce/provider/asymmetric/util/PrimeCertaintyCalculator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */