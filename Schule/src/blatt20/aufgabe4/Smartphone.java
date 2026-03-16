package blatt20.aufgabe4;

public class Smartphone {
    private String marke;
    private String model;
    public double akkustand;
    private int speicherplatz;
    private int preis;
    public Smartphone(double akkustand){
        marke ="BMW";
        model ="M4";
        preis = 4512;
        speicherplatz = 4512;
        this.akkustand = akkustand;
    }

    public void setAkkustand(double akkustand) {
        this.akkustand = akkustand;
        if (akkustand > 100) {
            akkustand = 100;
        }else if (akkustand < 0){
            akkustand = 0;
        }
    }
    public void akkustand(String status) {
        if (status.equals("akkustand")) {
            if (akkustand == 100) {
                akkustand = 100;
            }
        }
    }
    public void laden(String status) {
        if (status.equals("laden")) {
            if (akkustand == 0) {
                akkustand = 0;
            }
        }
    }


}
