package itx.examples.springboot.demo.dto;

import java.util.List;
import java.util.Map;

public class RequestInfo {

    private final String url;
    private final String queryString;
    private final String body;
    private final String encoding;
    private final String method;
    private final Map<String, String> cookies;
    private final String contentType;
    private final Map<String, List<String>> headers;

    public RequestInfo(String url, String queryString, String body, String encoding, String method,
                       Map<String, String> cookies, String contentType, Map<String, List<String>> headers) {
        this.url = url;
        this.queryString = queryString;
        this.body = body;
        this.encoding = encoding;
        this.method = method;
        this.cookies = cookies;
        this.contentType = contentType;
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public String getQueryString() {
        return queryString;
    }

    public String getBody() {
        return body;
    }

    public String getEncoding() {
        return encoding;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    public String getContentType() {
        return contentType;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

}
