package org.springframework.util.backoff;

@FunctionalInterface
public interface BackOffExecution {
  public static final long STOP = -1L;
  
  long nextBackOff();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/util/backoff/BackOffExecution.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */