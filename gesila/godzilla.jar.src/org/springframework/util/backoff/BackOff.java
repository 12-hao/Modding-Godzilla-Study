package org.springframework.util.backoff;

@FunctionalInterface
public interface BackOff {
  BackOffExecution start();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/util/backoff/BackOff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */