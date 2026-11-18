package blatt41.aufgabe02;

import blatt41.aufgabe01.Nachricht;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FirstClient extends Nachricht {
    int port;
    String zieladresse;

    public FirstClient(int port, String zieladresse) {
        this.port = port;
        this.zieladresse = zieladresse;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setZieladresse(String zieladresse) {
        this.zieladresse = zieladresse;
    }
    public void connect() {
        try {
            Socket socket = new Socket(this.zieladresse, this.port);
            communicate(socket);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void communicate(Socket socket) throws IOException {
        receiveMessage(socket);
        setMessage("GRE|Hallo");
        sendMessage(socket);
        receiveMessage(socket);
        Scanner in = new Scanner(socket.getInputStream());
        String nutz = in.nextLine();
        setMessage("ANS|"+nutz );
        sendMessage(socket);
        receiveMessage(socket);
        setMessage("FIN|Danke");
        sendMessage(socket);
        socket.close();
    }


}
