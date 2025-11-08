package org.bouncycastle.crypto.params;

public class ECKeyParameters extends AsymmetricKeyParameter {
  ECDomainParameters params;
  
  protected ECKeyParameters(boolean paramBoolean, ECDomainParameters paramECDomainParameters) {
    super(paramBoolean);
    this.params = paramECDomainParameters;
  }
  
  public ECDomainParameters getParameters() {
    return this.params;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/params/ECKeyParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */