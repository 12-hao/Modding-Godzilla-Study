package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@FunctionalInterface
@Beta
@GwtCompatible
public interface AsyncCallable<V> {
  ListenableFuture<V> call() throws Exception;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/google/common/util/concurrent/AsyncCallable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */