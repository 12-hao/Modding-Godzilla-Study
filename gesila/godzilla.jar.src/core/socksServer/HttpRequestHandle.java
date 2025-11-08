package core.socksServer;

import com.httpProxy.server.request.HttpRequest;
import com.httpProxy.server.response.HttpResponse;

public interface HttpRequestHandle {
  HttpResponse sendHttpRequest(HttpRequest paramHttpRequest);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/core/socksServer/HttpRequestHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */