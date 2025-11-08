package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.dvcs.Data;

public abstract class DVCSRequestData {
  protected Data data;
  
  protected DVCSRequestData(Data paramData) {
    this.data = paramData;
  }
  
  public Data toASN1Structure() {
    return this.data;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/dvcs/DVCSRequestData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */