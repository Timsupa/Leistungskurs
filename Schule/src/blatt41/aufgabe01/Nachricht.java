package blatt41.aufgabe01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Nachricht {
    String protokoll;
    String nachricht;

    public Nachricht(String protokoll, String nachricht) {
        this.protokoll = protokoll;
        this.nachricht = nachricht;
    }
    public Nachricht() {
        this.protokoll = "";
        this.nachricht = "";
    }
    public String prepareMessage() {
        if (this.nachricht != null && this.protokoll != null) {}
        String protokollnachricht = this.protokoll + "|" + this.nachricht;
        return protokollnachricht;
    }
    public boolean isValid(String protokollnachricht){
        if (protokollnachricht.equals("")) {
            return false;
        } else if (protokollnachricht.indexOf("|") >= 0) {
            return true;
        }
        return false;
    }
    public String getProtokoll(String protokollnachricht) {
        String protokoll = protokollnachricht.substring(0, protokollnachricht.indexOf("|"));
        return protokoll;
    }
    public String getNachricht(String protokollnachricht) {
        String nachricht = protokollnachricht.substring(protokollnachricht.indexOf("|") + 1);
        return nachricht;
    }
    public void setMessage(String protokollnachricht) {
        if (isValid(protokollnachricht)){
            this.protokoll = getProtokoll(protokollnachricht);
            this.nachricht = getNachricht(protokollnachricht);
        }else {

        }
    }
    public void sendMessage(Socket socket) throws IOException {
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println(prepareMessage());
    }
    public Nachricht receiveMessage(Socket socket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = in.readLine();
        this.setMessage(message);
        System.out.println(prepareMessage());
        return this;
    }
}
