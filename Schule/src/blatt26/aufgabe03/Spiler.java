package blatt26.aufgabe03;

public class Spiler {
    private Karten skarte;
    private Karten stkarte;
    private Karten pkarte;
    private int stern;
    private Karten akarten;
    private Karten[] hand;

    public Spiler() {
        this.skarte = Karten.SCHERE;
        this.pkarte = Karten.PAPIER;
        this.stkarte = Karten.STEIN;
        this.stern = 3;
        this.hand[0] = skarte;
        this.hand[1] = pkarte;
        this.hand[2] = stkarte;
    }
    public void minusAnzahlSterne(){
        this.stern --;
    }
    public void minusAnzahlKarten(Karten akarten) {
        if (akarten == Karten.SCHERE){
            skarte.menge -= 1;
        }
        if (akarten == Karten.PAPIER) {
            pkarte.menge -= 1;
        }
        if (akarten == Karten.STEIN) {
            stkarte.menge -= 1;
        }
    }
    public void setAktivKarten(Karten akarten) {
        this.akarten = akarten;
    }
    public void karten(Karten[] hand) {
        if (anzahlKartenHand(hand) > 0) {
            int u = (int) Math.random() * 2;
            switch (u) {
                case 0:
                    if (getAnzahlKarten(hand[0]) < 1){
                        karten(hand);
                    }
                    minusAnzahlKarten(hand[0]);
                    setAktivKarten(Karten.SCHERE);
                case 1:
                    if (getAnzahlKarten(hand[1]) < 1){
                        karten(hand);
                    }
                    setAktivKarten(Karten.PAPIER);
                    minusAnzahlKarten(hand[1]);
                case 2:
                    if (getAnzahlKarten(hand[2]) < 1){
                        karten(hand);
                    }
                    setAktivKarten(Karten.STEIN);
                    minusAnzahlKarten(hand[2]);
            }
        }
    }
    public int getAnzahlKarten(Karten akarten) {
        if (akarten == Karten.SCHERE) {
            return skarte.menge;
        }
        if (akarten == Karten.PAPIER) {
            return pkarte.menge;
        }else {
            return stkarte.menge;
        }
    }
    public int anzahlKartenHand(Karten[] hand) {
        return skarte.menge + pkarte.menge + stkarte.menge;
    }

}
