package blatt26.übung;

public class Helden extends Wesen {
    private Item item;

    public Helden(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben, Klasse klasse, Angriff angriff, Item item) {
        super(mp, geschwind, glück, magiVert, magiStär, stärke, vert, leben, klasse);
        this.item = item;
    }

    public void getItem(){
        this.item = item;
    }


}
