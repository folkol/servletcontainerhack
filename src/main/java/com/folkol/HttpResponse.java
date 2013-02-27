package com.folkol;

import java.io.OutputStream;

public class HttpResponse {

    private OutputStream outputStream;
    private int statusCode;

    public HttpResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public OutputStream getResponseStream() {
        return outputStream;
    }
}
