package blatt25;
public class Couch extends Sitzmoeglichkeit {
    private boolean eckCouch;

    public Couch(int max) {
        super(max, 0);
        eckCouch = false;
    }

    public boolean setEkCouch(boolean eckCouc) {
        if (getMaxPerso() > 3 && eckCouc == true) {
            this.eckCouch = true;
        }
        return eckCouch;
    }
}
