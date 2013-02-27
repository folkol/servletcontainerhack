package com.folkol;

import java.net.Socket;

public class HttpConnector {

    public HttpRequest createRequest(Socket client) {
        HttpRequest httpRequest = new HttpRequest();
        return httpRequest;
    }
}
