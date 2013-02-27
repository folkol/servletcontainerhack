package com.folkol;

import java.io.IOException;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        System.out.println("Launching Web Server...");

        WebServer webServer = new WebServer();
        webServer.start();
    }
}
