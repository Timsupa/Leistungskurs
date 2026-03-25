package blatt20.Aufgabe6;

public class Item {
    private String name;
    private String wirkung;
    private boolean aktiv;

    private Charakter charakter;
    public Item(String name, String wirkung, boolean aktiv) {
        this.name = name;
        this.wirkung = wirkung;
        this.aktiv = aktiv;
    }
    public String getName() {
        return name;
    }
    public String getWirkung() {
        return wirkung;
    }
    public boolean setAktiv() {
        return aktiv;
    }
    public void wirkeAn(Charakter charakter) {
        this.aktiv = true;
    }
}

