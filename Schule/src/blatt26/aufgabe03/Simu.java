package blatt26.aufgabe03;

public class Simu extends Spiler{
    public Simu(int sterne, Karten karten, boolean miene, boolean schuldenFrei, int anzahlKarten) {

    }

    public Simu() {
    }

    public void Simu(Spiler[] spilers, int counter){
        if (counter == spilers.length*2){
            System.out.println("Spiel zu Ende");
            for (int i=0; i<spilers.length; i++){
                if (getStern(spilers[i]) < 1){
                    System.out.println("Spieler " + i + " wurde in die Miene geschickt");
                }else {
                    System.out.println("Der Spieler"+ i + "hat" + getStern(spilers[i])*10000 + "gewonnen");
                }
            }
        }
        int kämpfer = blatt13.Zufall.zufallGanz(spilers.length);
        int kämpfer2 = blatt13.Zufall.zufallGanz(spilers.length);
        if (getAkarten(spilers[kämpfer]) != null && getAkarten(spilers[kämpfer2]) != null) {
            karten(getHand(spilers[kämpfer]));
            karten(getHand(spilers[kämpfer2]));
            switch(getAkarten(spilers[kämpfer]))
                {
                case STEIN:
                    if (getAkarten(spilers[kämpfer2]) == Karten.STEIN){
                        break;
                    } else if (getAkarten(spilers[kämpfer2]) == Karten.SCHERE) {
                        sternübertragung(spilers[kämpfer2],spilers[kämpfer]);
                    } else if (getAkarten(spilers[kämpfer2])== Karten.PAPIER) {
                        sternübertragung(spilers[kämpfer2],spilers[kämpfer]);
                    }
                    case PAPIER:
                        if (getAkarten(spilers[kämpfer2]) == Karten.STEIN){
                            sternübertragung(spilers[kämpfer],spilers[kämpfer2]);
                        } else if (getAkarten(spilers[kämpfer2]) == Karten.SCHERE) {
                            sternübertragung(spilers[kämpfer2],spilers[kämpfer]);
                        } else if (getAkarten(spilers[kämpfer2])== Karten.PAPIER) {
                            break;
                        }
                    case SCHERE:
                        if (getAkarten(spilers[kämpfer2]) == Karten.STEIN){
                            sternübertragung(spilers[kämpfer2],spilers[kämpfer]);
                        } else if (getAkarten(spilers[kämpfer2]) == Karten.SCHERE) {
                            break;
                        } else if (getAkarten(spilers[kämpfer2])== Karten.PAPIER) {
                            sternübertragung(spilers[kämpfer],spilers[kämpfer2]);
                        }
                }
        }else {
            counter++;
            Simu(spilers,counter);
        }

    }


}
