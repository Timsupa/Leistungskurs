package blatt26.aufgabe01;

public class Kreis extends GeometrischesObjekt implements AbstandEbene {
    private double umfang;
    private double fleachenInhalt;
    private int x;
    private int y;
    private int radius;
    @Override
    public double getFleachenInhalt() {
        this.fleachenInhalt = this.radius* this.radius * Math.PI;
        return this.fleachenInhalt;
    }
    @Override
    public double getUmfang() {
        this.umfang = this.radius*2 * Math.PI;
        return this.umfang;
    }

    public void distanz(GeometrischesObjekt geometrischesObjekt) {

    }
}
