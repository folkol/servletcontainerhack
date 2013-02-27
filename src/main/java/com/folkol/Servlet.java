package com.folkol;

import java.io.IOException;

public interface Servlet {

    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException;

}
