package blatt20.aufgabe4;

public class Smartphone {
    private String marke;
    private String model;
    public double akkustand;
    private int speicherplatz;
    private int speicherLimit;
    private int preis;
    private double displaygroesse;
    private String betriebsSystem;
    public int lautstärke;
    public int helligkeit;
    public Smartphone(double akkustand){
        marke ="BMW";
        model ="M4";
        preis = 4512;
        speicherplatz = 4512;
        this.akkustand = akkustand;
    }
    public void setSpeicherLimit(){
        speicherLimit = 560000;
    }
    public void setakkustand(double akkustand){
        this.akkustand = akkustand;
    }
    public void hatGenugSpeicher(){
        if (speicherplatz<speicherLimit){
            System.out.println("Hat genug");
        }else {
            System.out.println("Nicht genug");
        }
    }
    public boolean istAkkuLeer(){
        boolean ben = false;
        if (this.akkustand == 0){
            ben = true;
           return ben;
        }else {
            return ben;
        }
    }
    public void speicerLeeren( int speicherplatzGewollt){
        if (this.speicherplatz > speicherplatzGewollt){
            this.speicherplatz = speicherplatz;
        }
    }
    public void appInstallieren(int appGroesse){
        this.speicherplatz += appGroesse;
        if (speicherplatz > speicherLimit){
            this.speicherplatz -= appGroesse;
            System.out.println("Zu wenig Speicher");
        }

    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getAkkustand() {
        return akkustand;
    }

    public int getSpeicherplatz() {
        return speicherplatz;
    }

    public void setSpeicherplatz(int speicherplatz) {
        this.speicherplatz = speicherplatz;
    }

    public int getSpeicherLimit() {
        return speicherLimit;
    }

    public void setSpeicherLimit(int speicherLimit) {
        this.speicherLimit = speicherLimit;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public double getDisplaygroesse() {
        return displaygroesse;
    }

    public void setDisplaygroesse(double displaygroesse) {
        this.displaygroesse = displaygroesse;
    }

    public String getBetriebsSystem() {
        return betriebsSystem;
    }

    public void setBetriebsSystem() {
        this.betriebsSystem = "TempleOs";
    }

    public int getLautstärke() {
        return lautstärke;
    }

    public void setLautstärke(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public int getHelligkeit() {
        return helligkeit;
    }

    public void setHelligkeit(int helligkeit) {
        this.helligkeit = helligkeit;
    }

    public void einschalten(){
        if (istAkkuLeer()== false){
            System.out.println("Einschalten nicht möglich Akku leer");
        }else {
            System.out.println("Eingeschaltet");
            benutzung("An");
        }
    }
    public void setAkkustand(double akkustand) {
        this.akkustand = akkustand;
        if (akkustand > 100) {
            akkustand = 100;
        }else if (akkustand < 0){
            akkustand = 0;
        }
    }
    public void benutzung(String status) {
        if (status.equals("An")) {
            if (akkustand != 0) {
                akkustand --;
            }
        }
    }
    public void laden(String status) {
        if (status.equals("laden")) {
            if (akkustand != 100) {
                akkustand ++;
            }
        }
    }


}
