package org.bouncycastle.jcajce.provider.config;

import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

public interface ProviderConfiguration {
  ECParameterSpec getEcImplicitlyCa();
  
  DHParameterSpec getDHDefaultParameters(int paramInt);
  
  Set getAcceptableNamedCurves();
  
  Map getAdditionalECParameters();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/jcajce/provider/config/ProviderConfiguration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */