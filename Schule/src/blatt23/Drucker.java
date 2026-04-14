package blatt23;

public class Drucker {
    private int auf;
    private double tintenstandS;
    private double tintenstandF;
    private boolean aufGlass;
    private int papiefach;
    private int restKontigent;
    private Verbindungsmodus verbindungsmodus;
    private Gerätemodus gerätemodus;
    private Patronenart patronenart;
    private Druckart druckart;
    private Abonnement abonnement;

    public Drucker(Abonnement abonnement) {
        this.abonnement = abonnement;
        this.druckart = Druckart.SPAREN;
        this.verbindungsmodus = Verbindungsmodus.OFFLINE;
        this.gerätemodus = Gerätemodus.STANDBY;
        this.patronenart = Patronenart.SCHWARZ;
        this.papiefach = 0;
        this.aufGlass = false;
    }
    public void zuLokal() {
        this.verbindungsmodus = Verbindungsmodus.LOKAL;
    }
    public void zuOnline() {
        this.verbindungsmodus = Verbindungsmodus.ONLINE;
    }
    public void zuOffline() {
        this.verbindungsmodus = Verbindungsmodus.OFFLINE;
    }
    public void papierAuffuellen(int paper){
        this.papiefach =+ paper;
    }
    public boolean scannen(){
        if (this.verbindungsmodus == Verbindungsmodus.ONLINE || this.verbindungsmodus == Verbindungsmodus.LOKAL){
            if (this.aufGlass == true) {
                return true;
            }
        }
        return false;
    }
    public void legeAufGlas(){
        this.aufGlass = true;
    }
    public void entferneVonGlas(){
        this.aufGlass = false;
    }
    private void tinteAuffuellen(Patronenart patronenart){

    }
    public int neuesKontigent(int zahl){
        switch (zahl){
            case 1: this.abonnement = Abonnement.XS;
            case 2: this.abonnement = Abonnement.S;
            case 3: this.abonnement = Abonnement.M;
            case 4: this.abonnement = Abonnement.L;
            case 5: this.abonnement = Abonnement.XL;
        }
        int kontigent = 0;
        switch (this.abonnement){
            case XS: kontigent = 10;
            case S: kontigent = 50;
            case M: kontigent = 100;
            case L: kontigent = 300;
            case XL: kontigent = 700;
        }
        return kontigent;
    }
    public void aboWechsel(int zahl){
       this.restKontigent = restKontigent + neuesKontigent(zahl);
        switch (zahl){
            case 1: this.abonnement = Abonnement.XS;
            case 2: this.abonnement = Abonnement.S;
            case 3: this.abonnement = Abonnement.M;
            case 4: this.abonnement = Abonnement.L;
            case 5: this.abonnement = Abonnement.XL;
        }
    }
    public void drucken(Patronenart farbe,Druckart druckart,int restKontigent){
       if (this.papiefach >0 && this.tintenstandS > 1 && this.restKontigent > 0 && this.tintenstandF > 2) {
           switch (farbe) {
               case SCHWARZ:
                   switch (druckart) {
                       case SPAREN:
                           this.papiefach--;
                           this.tintenstandS =- 0.3;
                           this.restKontigent--;
                       case NORMAL:
                           this.tintenstandS =- 0.5;
                           this.restKontigent--;
                           this.papiefach--;
                       case QUALITÄT:
                           this.tintenstandS =- 0.8;
                           this.restKontigent--;
                           this.papiefach--;
               }
               case FARBE:
                   switch (druckart) {
                       case SPAREN:
                           this.papiefach--;
                           this.tintenstandS =- 0.1;
                           this.restKontigent--;
                           this.tintenstandF =- 0.3;
                       case NORMAL:
                           this.papiefach--;
                           this.tintenstandS =- 0.2;
                           this.restKontigent--;
                           this.tintenstandF =- 0.6;
                       case QUALITÄT:
                           this.papiefach--;
                           this.tintenstandS =- 0.3;
                           this.restKontigent--;
                           this.tintenstandF =- 1.1;
                   }
           }
           Druckaufträge a = new Druckaufträge(this.papiefach,this.auf,this.patronenart,this.druckart,this.tintenstandF);
           System.out.println(a);
       }

    }
}
