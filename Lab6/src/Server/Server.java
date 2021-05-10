package Server;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 4999;
        try (ServerSocket server = new ServerSocket(port)) {
            while (!server.isClosed()) {
                System.out.println("Server started! Port: " + server.getLocalPort());
                Socket clientSocket = server.accept();
                System.out.println("New connection! " + server.getInetAddress() +
                        " port " + clientSocket.getPort());
                System.out.print("Connection accepted.");

                new ClientHandler(clientSocket).run();

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wrong open server socket!");
        }
    }
}
