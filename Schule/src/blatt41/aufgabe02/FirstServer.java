package blatt41.aufgabe02;

import blatt41.aufgabe01.Nachricht;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FirstServer extends Nachricht {
    int port;

    public FirstServer(int port) {
        this.port = port;
    }
    public void start() {
        try {
            ServerSocket servis = new ServerSocket(this.port);
            Socket client = servis.accept();

        } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
    public void communicate(Socket socket) throws IOException {
        start();
        setMessage("GEREI|Hallo");
        sendMessage(socket);
        receiveMessage(socket);
        setMessage("QST|Wie geht es dir?" );
        sendMessage(socket);
        receiveMessage(socket);
        setMessage("FIN|Danke");
        sendMessage(socket);
        socket.close();

    }
}
