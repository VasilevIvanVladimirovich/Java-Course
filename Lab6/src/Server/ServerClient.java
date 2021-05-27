package Server;


import java.net.*;
import java.io.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ServerClient extends Thread implements Runnable {

    private Socket clientSocket;

    ServerClient(Socket client) {
        this.clientSocket = client;
    }

    public void work() {
        InputStreamReader inclient = null;
        try {
            inclient = new InputStreamReader(clientSocket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(inclient);
        String url = null;
        try {
            url = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("client: " + url);

        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element site = doc;
        System.out.print(site);
        PrintWriter out = null;
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print(site);
        out.close();
    }
}
