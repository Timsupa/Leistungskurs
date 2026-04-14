package blatt23;

public enum Abonnement {
    XS(0.99,10),
    S(3.99,50),
    M(5.99,100),
    L(11.99,300),
    XL(24.99,700);
    final double preis;
    final int seiten;
    Abonnement( double preis, int seiten) {
        this.preis = preis;
        this.seiten = seiten;
    }
}
