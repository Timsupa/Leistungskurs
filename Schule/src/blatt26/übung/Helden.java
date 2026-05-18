package blatt26.übung;

public class Helden extends Wesen {
    private Angriff angriff;
    private Item item;
    private Klasse held;

    public Helden(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben) {
        super(mp, geschwind, glück, magiVert, magiStär, stärke, vert, leben);
    }
    public Klasse getKlasse(){
        this.held = held;
        return held;
    }
    public void getItem(){
        this.item = item;
    }
    public void getAngriff(Angriff angriff){
        this.angriff = angriff;
    }
    public void einstecken(){
        setLeben(getLeben() - ((2*getMagiVert() + 2*getVert()) - getAngriff()));

    }
}
