package blatt16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Schreibprozess {
    public static void main(String[] args) throws IOException {
        File h = new File("io");
        if (h.exists()) {
            h.mkdir();
        }else if (!h.isDirectory()) {
            h.mkdir();
        }
        File file = new File("io\\Test01.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("Was geht Yallah\n Oh was geht\nBist du Trymacs\n mmh ja\n sag Vallah\n nein");
        fw.close();
        File html = new File("io\\Test02.html");
        FileWriter fwhtml = new FileWriter(html);
        fwhtml.write("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<title>\n" +
                        "HTML aus Java?\n" +
                        "</title></head>\n" +
                        "<body>\n" +
                        "<h1>\n" +
                        "HTML aus Java?</h1>\n" +
                        "<p>\n" +
                        "Es geht Wirklich</p>"
                );
        fwhtml.close();
    }
}
