package blatt26.übung;

public abstract class Wesen {
    private int leben;
    private int vert;
    private int stärke;
    private int magiStär;
    private int magiVert;
    private double glück;
    private int geschwind;
    private int mp;
    private Klasse klasse;

    public Wesen(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben, Klasse klasse) {
        this.mp = mp;
        this.geschwind = geschwind;
        this.glück = glück;
        this.magiVert = magiVert;
        this.magiStär = magiStär;
        this.stärke = stärke;
        this.vert = vert;
        this.leben = leben;
        this.klasse = klasse;
    }

    public void setLeben(int leben) {
        this.leben = leben;
    }
    public Klasse getKlasse(){
        this.klasse = klasse;
        return klasse;
    }

    public int getLeben() {
        return leben;
    }

    public int getVert() {
        return vert;
    }

    public int getStärke() {
        return stärke;
    }

    public int getMagiStär() {
        return magiStär;
    }

    public int getMagiVert() {
        return magiVert;
    }

    public double getGlück() {
        return glück;
    }

    public int getGeschwind(Wesen wesen) {
        return geschwind;
    }

    public int getMp() {
        return mp;
    }


}
