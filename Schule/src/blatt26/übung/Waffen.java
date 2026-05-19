package blatt26.übung;

public enum Waffen {
    BEIL(5),
    SCHWERT(40),
    STAB(10),
    ANDERERSTAB(3085),
    KLAPPMESSER(56),
    PFEFFERSPRAY(34),
    GLOCK17(10000000),
    BUTTERFLY(4637);
    final double stearke;
    Waffen (double stearke) {
        this.stearke = stearke;
    }
}

