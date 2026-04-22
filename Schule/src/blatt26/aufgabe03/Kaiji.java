package blatt26.aufgabe03;

public abstract class Kaiji {
    private int sterne;
    private Karten karten;
    private boolean miene;
    private boolean schuldenFrei;
    private int anzahlKarten;
    private Karten akarten;

    public Kaiji(int sterne, Karten karten, boolean miene, boolean schuldenFrei,int anzahlKarten) {
        this.sterne = sterne;
        this.karten = karten;
        this.miene = miene;
        this.schuldenFrei = schuldenFrei;
        this.anzahlKarten = anzahlKarten;
        this.akarten = karten;
    }



    public void setSterne(int sterne) {
        this.sterne = sterne;
    }

    public void setKarten(Karten karten) {
        this.karten = karten;
    }
    public void setAktivKarten(Karten akarten) {
        this.akarten = akarten;
    }

    public void setMiene(boolean miene) {
        this.miene = miene;
    }

    public void setSchuldenFrei(boolean schuldenFrei) {
        this.schuldenFrei = schuldenFrei;
    }

    public void setAnzahlKarten(int anzahlKarten) {
        this.anzahlKarten = anzahlKarten;
    }
}
