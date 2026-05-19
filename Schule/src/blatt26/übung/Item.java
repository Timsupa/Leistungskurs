package blatt26.übung;

public enum Item {
    HEILKRUG(40),
    BIERKRUG(50),
    SEIL(0),
    RAKETE(-20),
    HEILIGESAAT(90),
    KLAPPMESSER(-59);
    final int verbesserungderumstaende;

    Item (int verbesserungderumstaende) {
        this.verbesserungderumstaende = verbesserungderumstaende;
    }

}
