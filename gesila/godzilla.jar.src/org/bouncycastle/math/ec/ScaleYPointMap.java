package org.bouncycastle.math.ec;

public class ScaleYPointMap implements ECPointMap {
  protected final ECFieldElement scale;
  
  public ScaleYPointMap(ECFieldElement paramECFieldElement) {
    this.scale = paramECFieldElement;
  }
  
  public ECPoint map(ECPoint paramECPoint) {
    return paramECPoint.scaleY(this.scale);
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/math/ec/ScaleYPointMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */