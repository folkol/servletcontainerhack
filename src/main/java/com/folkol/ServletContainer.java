package com.folkol;

import java.util.HashMap;
import java.util.Map;

public class ServletContainer {
    Map<String, Servlet> servlets = new HashMap<String, Servlet>();

    public ServletContainer() {
        setServletMapping(new FileServlet());
    }

    public void handle(HttpRequest httpRequest, HttpResponse httpResponse) {
        Servlet servlet = findServlet(httpRequest.getRequestURI());
        try {
            servlet.service(httpRequest, httpResponse);
        } catch (Exception e) {
            httpResponse.setStatusCode(500);
        }
    }

    /**
     * See <a href="http://jcp.org/aboutJava/communityprocess/final/jsr315/index.html">JSR315</a>
     * @param requestURI
     * @return
     */
    private Servlet findServlet(String requestURI) {
        // Find the servlet with the most specific patten that matches the Request-URI

        return getSevletMapping("/");
    }

    private void setServletMapping(FileServlet servlet) {
        servlets.put("/", servlet);
    }

    private Servlet getSevletMapping(String pattern) {
        return servlets.get(pattern);
    }
}
