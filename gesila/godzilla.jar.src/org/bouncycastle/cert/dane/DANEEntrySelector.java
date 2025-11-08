package org.bouncycastle.cert.dane;

import org.bouncycastle.util.Selector;

public class DANEEntrySelector implements Selector {
  private final String domainName;
  
  DANEEntrySelector(String paramString) {
    this.domainName = paramString;
  }
  
  public boolean match(Object paramObject) {
    DANEEntry dANEEntry = (DANEEntry)paramObject;
    return dANEEntry.getDomainName().equals(this.domainName);
  }
  
  public Object clone() {
    return this;
  }
  
  public String getDomainName() {
    return this.domainName;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cert/dane/DANEEntrySelector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */