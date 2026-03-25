package blatt20.Aufgabe6;

public class Rennen {
    private String name;
    private  int anzahlRunde;
    private String status;

    public Rennen(String name, String status, int anzahlRunde) {
        this.name = name;
        this.status = status;
        this.anzahlRunde = anzahlRunde;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getAnzahlRunde() {
        return anzahlRunde;
    }
    public void  starteRennen(){

    }
}
