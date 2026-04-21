package blatt26.aufgabe01;

public class Rechteck extends GeometrischesObjekt{
    private double umfang;
    private double fleachenInhalt;
    private int x;
    private int y;

    @Override
    public double getFleachenInhalt(){
        this.fleachenInhalt = this.x* this.y;
        return this.fleachenInhalt;
    }
    @Override
    public double getUmfang() {
        this.umfang = this.x*2 + this.y *2;
        return this.umfang;
    }
    public void distanz(GeometrischesObjekt geometrischesObjekt) {
        this.distanz(geometrischesObjekt);
    }
}
