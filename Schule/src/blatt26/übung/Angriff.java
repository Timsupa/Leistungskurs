package blatt26.übung;

public class Angriff extends Wesen {
    private Waffen waffenSt;
    private double schaden;
    private String schadenart;

    public Angriff(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben, Waffen waffenSt, double schaden, Klasse klasse) {
        super(mp, geschwind, glück, magiVert, magiStär, stärke, vert, leben, klasse);
        this.waffenSt = waffenSt;
        this.schaden = schaden;
    }
    public double getWaffenSt() {
        return waffenSt.stearke;
    }

    public void setSchaden() {
        switch (getKlasse()){
            case HEXE :
                if (Math.random() < getGlück()) {
                    this.schaden = getMagiStär() + getWaffenSt() * 1.3;
                }else this.schaden = getMagiStär() + getWaffenSt();
            case OGER:
                if (Math.random() < getGlück()) {
                    this.schaden = getStärke() + getWaffenSt() * 1.3;
                }else this.schaden = getStärke() + getWaffenSt();
            case GOLEM:
                if (Math.random() < getGlück()) {
                    this.schaden = getStärke() + getWaffenSt() * 1.3;
                }else this.schaden = getStärke() + getWaffenSt();
            case KLERIKER:
                if (Math.random() < getGlück()) {
                    this.schaden = getMagiStär() +getWaffenSt() * 1.3;
                }else this.schaden = getMagiStär() + getWaffenSt();
            case ARBEITSLOSER:
                if (Math.random() < getGlück()) {
                    this.schaden = getMagiStär() + getWaffenSt() * 1.3;
                }else this.schaden = getMagiStär() + getWaffenSt();
        }
    }
    public void setLeben(double schaden) {
        switch (schadenart){
            case "MAGIE":
                setLeben(schaden - getVert() / getMagiStär());
                tot();
            case "NORMAL":
                setLeben(schaden - getVert());
                tot();
        }

    }
    public void tot() {
        if (getLeben() <= 0){
            System.out.println("Taferer Krieger ist zu fall gegangen");
        }
    }
}
