package Server;

import java.io.*;
import java.net.*;

public class ClientHandler {
    private Socket clientSocket; //сокет для общения

    ClientHandler(Socket client) {
        this.clientSocket = client;
    }

    public void run() {
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));

             PrintWriter out = new PrintWriter(
                     clientSocket.getOutputStream(), true)) {

            String urlStr = in.readLine();
            System.out.println("Accepted request: " + urlStr);

            urlStr = urlStr.substring(urlStr.indexOf(' ') + 1, urlStr.length() - 8);
            System.out.println("URL: " + urlStr);

            URLConnection urlConnection = new URL(urlStr).openConnection();

            BufferedReader webReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String webPage;

            while ((webPage = webReader.readLine()) != null) {
                out.println(webPage);
                out.flush();
            }
            out.println("End!");

            in.close();
            out.close();
            clientSocket.close();

            System.out.println("Closing connections & channels - DONE.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







   /* try {

        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        String word = "";
        while (word != "exit") {
            word = in.readLine();
            System.out.println("client: " + word);
            out.write("(Server) You word: " + word + "\n");
            out.flush(); // выталкиваем все из буфера
        }
    } finally {
        // в любом случае сокет будет закрыт
        clientSocket.close();
        // потоки тоже хорошо бы закрыть
        in.close();
        out.close();
    }
} finally {
        System.out.println("Server close!");
        server.close();
        }
        } catch (IOException e) {
        System.err.println(e);
        }*/
}
