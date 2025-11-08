/*     */ package util.http;
/*     */
/*     */ import com.httpProxy.server.response.HttpResponseHeader;
/*     */ import com.httpProxy.server.response.HttpResponseStatus;
/*     */ import core.ApplicationContext;
/*     */ import core.shell.ShellEntity;
/*     */ import core.ui.component.dialog.HttpProgressBar;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.HttpCookie;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */
/*     */
/*     */
/*     */ public class HttpResponse
        /*     */ {
    /*     */   private byte[] result;
    /*     */   private final ShellEntity shellEntity;
    /*     */   private Map<String, List<String>> headerMap;
    /*     */   private String message;
    /*     */   private int responseCode;
    /*     */
    /*     */   public byte[] getResult() {
        /*  27 */     return this.result;
        /*     */   }
    /*     */
    /*     */   public Map<String, List<String>> getHeaderMap() {
        /*  31 */     return this.headerMap;
        /*     */   }
    /*     */
    /*     */   public void setResult(byte[] result) {
        /*  35 */     this.result = result;
        /*     */   }
    /*     */
    /*     */   public void setHeaderMap(Map<String, List<String>> headerMap) {
        /*  39 */     this.headerMap = headerMap;
        /*     */   }
    /*     */
    /*     */   public HttpResponse(HttpURLConnection http, ShellEntity shellEntity) throws IOException {
        /*  43 */     this.shellEntity = shellEntity;
        /*  44 */     handleHeader(http.getHeaderFields());
        /*  45 */     ReadAllData(getInputStream(http));
        /*     */   }
    /*     */
    /*     */   protected void handleHeader(Map<String, List<String>> map) {
        /*  49 */     this.headerMap = map;
        /*     */
        /*     */     try {
            /*  52 */       this.message = ((List<String>)map.get(null)).get(0);
            /*  53 */       Http http = this.shellEntity.getHttp();
            /*  54 */       http.getCookieManager().put(http.getUri(), map);
            /*  55 */       http.getCookieManager().getCookieStore().get(http.getUri());
            /*  56 */       List<HttpCookie> cookies = http.getCookieManager().getCookieStore().get(http.getUri());
            /*  57 */       StringBuilder sb = new StringBuilder();
            /*  58 */       cookies.forEach(cookie -> sb.append(String.format(" %s=%s;", new Object[] { cookie.getName(), cookie.getValue() })));
            /*     */
            /*     */
            /*  61 */       if (sb.length() > 0) {
                /*  62 */         String Cookie = sb.toString().trim();
                /*  63 */         if (Cookie.endsWith(";")) {
                    /*  64 */           Cookie = Cookie.substring(0, Cookie.length() - 1);
                    /*     */         }
                /*  66 */         this.shellEntity.getHeaders().put("Cookie", Cookie);
                /*     */       }
            /*  68 */     } catch (IOException var5) {
            /*  69 */       var5.printStackTrace();
            /*     */     }
        /*     */   }
    /*     */
    /*     */
    /*     */   protected InputStream getInputStream(HttpURLConnection httpURLConnection) throws IOException {
        /*  75 */     InputStream inputStream = httpURLConnection.getErrorStream();
        /*  76 */     if (inputStream != null) {
            /*  77 */       return inputStream;
            /*     */     }
        /*  79 */     return httpURLConnection.getInputStream();
        /*     */   }
    /*     */
    /*     */   protected void ReadAllData(InputStream inputStream) throws IOException {
        /*  83 */     int maxLen = 0;
        /*     */     try {
            /*  85 */       if (this.headerMap.get("Content-Length") != null && ((List)this.headerMap.get("Content-Length")).size() > 0) {
                /*  86 */         maxLen = Integer.parseInt(((List<String>)this.headerMap.get("Content-Length")).get(0));
                /*  87 */         this.result = ReadKnownNumData(inputStream, maxLen);
                /*     */       } else {
                /*  89 */         this.result = ReadUnknownNumData(inputStream);
                /*     */       }
            /*  91 */     } catch (NumberFormatException e) {
            /*  92 */       this.result = ReadUnknownNumData(inputStream);
            /*     */     }
        /*  94 */     this.result = this.shellEntity.getCryptionModule().decode(this.result);
        /*     */   }
    /*     */
    /*     */   protected byte[] ReadKnownNumData(InputStream inputStream, int num) throws IOException {
        /*  98 */     if (num > 0) {
            /*  99 */       byte[] temp = new byte[5120];
            /* 100 */       int readOneNum = 0;
            /* 101 */       int readNum = 0;
            /* 102 */       ByteArrayOutputStream bos = new ByteArrayOutputStream();
            /* 103 */       Boolean isShowBar = ApplicationContext.isShowHttpProgressBar.get();
            /* 104 */       if (isShowBar != null && isShowBar.booleanValue()) {
                /* 105 */         HttpProgressBar httpProgressBar = new HttpProgressBar("download threadId:" + Thread.currentThread().getId(), num);
                /* 106 */         while ((readOneNum = inputStream.read(temp)) != -1) {
                    /* 107 */           bos.write(temp, 0, readOneNum);
                    /* 108 */           httpProgressBar.setValue(readNum += readOneNum);
                    /*     */         }
                /*     */       } else {
                /* 111 */         while ((readOneNum = inputStream.read(temp)) != -1) {
                    /* 112 */           bos.write(temp, 0, readOneNum);
                    /*     */         }
                /*     */       }
            /* 115 */       return bos.toByteArray();
            /*     */     }
        /* 117 */     if (num == 0) {
            /* 118 */       return ReadUnknownNumData(inputStream);
            /*     */     }
        /* 120 */     return null;
        /*     */   }
    /*     */
    /*     */   protected byte[] ReadUnknownNumData(InputStream inputStream) throws IOException {
        /* 124 */     byte[] temp = new byte[5120];
        /* 125 */     int readOneNum = 0;
        /* 126 */     ByteArrayOutputStream bos = new ByteArrayOutputStream();
        /* 127 */     while ((readOneNum = inputStream.read(temp)) != -1) {
            /* 128 */       bos.write(temp, 0, readOneNum);
            /*     */     }
        /* 130 */     return bos.toByteArray();
        /*     */   }
    /*     */
    /*     */   public com.httpProxy.server.response.HttpResponse parseHttpResponse() {
        /* 134 */     com.httpProxy.server.response.HttpResponse httpResponse = new com.httpProxy.server.response.HttpResponse(new HttpResponseStatus(this.responseCode));
        /* 135 */     httpResponse.setResponseData(this.result);
        /* 136 */     HttpResponseHeader responseHeader = httpResponse.getHttpResponseHeader();
        /* 137 */     for (String keyString : this.headerMap.keySet()) {
            /* 138 */       List<String> headList = this.headerMap.get(keyString);
            /* 139 */       if (headList == null)
                /* 140 */         continue;  headList.parallelStream().forEach(v -> responseHeader.addHeader(keyString, v));
            /*     */     }
        /* 142 */     return httpResponse;
        /*     */   }
    /*     */ }


/* Location:              /Users/h12/Downloads/Godzilla_ekp1.1.jar!/util/http/HttpResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */