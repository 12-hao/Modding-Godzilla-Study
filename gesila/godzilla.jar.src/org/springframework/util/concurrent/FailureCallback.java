package org.springframework.util.concurrent;

@FunctionalInterface
public interface FailureCallback {
  void onFailure(Throwable paramThrowable);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/util/concurrent/FailureCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */