package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public interface FutureCallback<V> {
  void onSuccess(V paramV);
  
  void onFailure(Throwable paramThrowable);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/google/common/util/concurrent/FutureCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */