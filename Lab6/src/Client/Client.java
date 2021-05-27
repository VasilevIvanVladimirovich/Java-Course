package Client;

import java.net.*;
import java.io.*;
import java.util.Vector;
import java.util.stream.Stream;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Client {

    private static URL urlAddress;
    private static String addressServer;
    private static String portServer;

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        urlAddress = new URL(args[0]);
        addressServer = args[1];
        portServer = args[2];
        Socket s = new Socket(addressServer, Integer.parseInt(portServer));

        PrintWriter pr = new PrintWriter(s.getOutputStream()); //поток вывода на сервер
        pr.println(urlAddress);
        pr.flush();
        InputStreamReader inserver = new InputStreamReader(s.getInputStream());
        BufferedReader in = new BufferedReader(inserver);

        String site="";
        String line = null;
        while ((line = in.readLine()) != null) {
            {
                site += line + "\n";
            }
        }
        in.close();
        System.out.print(site);
    }
}
