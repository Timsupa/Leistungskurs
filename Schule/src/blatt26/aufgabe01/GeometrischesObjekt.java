package blatt26.aufgabe01;

public class GeometrischesObjekt {
    private Punkt punkt;
    private int x;
    private int y;
    private int radius;
    private double fleachenInhalt;
    private double Umfang;

    public GeometrischesObjekt(Punkt punkt, double umfang, double fleachenInhalt, int radius, int y, int x) {
        this.punkt = punkt;
        Umfang = umfang;
        this.fleachenInhalt = fleachenInhalt;
        this.radius = radius;
        this.y = y;
        this.x = x;
    }
    public void fleacheninhalt() {

    }

}
