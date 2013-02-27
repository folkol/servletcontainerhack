package com.folkol;

import java.io.IOException;

public class FileServlet implements Servlet {

    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException {
        httpResponse.getResponseStream().write("Hello world!".getBytes());
    }

}
