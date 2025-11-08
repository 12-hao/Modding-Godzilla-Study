package core.socksServer;

public interface SocketStatus {
  String getErrorMessage();
  
  boolean isActive();
  
  boolean start();
  
  boolean stop();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/core/socksServer/SocketStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */