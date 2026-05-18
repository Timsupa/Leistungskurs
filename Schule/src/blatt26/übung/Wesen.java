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

    public Wesen(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben) {
        this.mp = mp;
        this.geschwind = geschwind;
        this.glück = glück;
        this.magiVert = magiVert;
        this.magiStär = magiStär;
        this.stärke = stärke;
        this.vert = vert;
        this.leben = leben;
    }

    public void setLeben(int leben) {
        this.leben = leben;
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

    public int getGeschwind() {
        return geschwind;
    }

    public int getMp() {
        return mp;
    }
}
