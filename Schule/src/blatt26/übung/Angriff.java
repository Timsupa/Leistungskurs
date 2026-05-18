package blatt26.übung;

public class Angriff extends Helden {
    private double waffenSt;
    private double schaden;

    public Angriff(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben, double waffenSt, double schaden) {
        super(mp, geschwind, glück, magiVert, magiStär, stärke, vert, leben);
        this.waffenSt = waffenSt;
        this.schaden = schaden;
    }

    public void setSchaden() {
        if (getKlasse() == Klasse.HEXE){

        } else if (getKlasse() == Klasse.KLERIKER) {
            this.schaden = waffenSt * getMagiStär();
        }
        if (Math.random() < getGlück()) {
            this.schaden = waffenSt * 1.3 * getStärke();
        }else
        this.schaden = waffenSt * getStärke();
    }
}
