package com.nnn.controller;

import java.io.IOException;

import io.helidon.microprofile.server.Server;

public class Main {
public static void main(String[] args) throws IOException {



Server server = startServer();
System.out.println("http://localhost:" + server.port());

}

static Server startServer() {
return Server.create().start();
}


}
