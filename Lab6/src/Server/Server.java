package Server;

import java.net.*;
import java.io.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        try (ServerSocket server = new ServerSocket(port)) {
            while (!server.isClosed()) {
                System.out.println("Server started! Port: " + server.getLocalPort());
                Socket clientSocket = server.accept();
                new ServerClient(clientSocket).work();
            }
        }
    }
}
