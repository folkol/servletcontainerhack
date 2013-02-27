package com.folkol;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    ServletContainer servletContainer = new ServletContainer();
    HttpConnector httpConnector = new HttpConnector();

    public void start() throws IOException {
        ServerSocket listen = new ServerSocket(8080);

        while (true) {
            Socket client = listen.accept();
            try {
                serve(client);
            } finally {
                client.close();
            }
        }
    }

    private void serve(Socket client) throws IOException {
        HttpRequest httpRequest = httpConnector.createRequest(client);
        HttpResponse httpResponse = new HttpResponse(client.getOutputStream());

        servletContainer.handle(httpRequest, httpResponse);
    }

}
