package org.bouncycastle.util;

import java.util.Collection;

public interface Store<T> {
  Collection<T> getMatches(Selector<T> paramSelector) throws StoreException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/Store.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */