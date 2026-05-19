package blatt26.übung;

public class Reinfolge extends Wesen{
    private Wesen[] reinbold;

    public Reinfolge(int mp, int geschwind, double glück, int magiVert, int magiStär, int stärke, int vert, int leben, Klasse klasse, Wesen[] reinbold) {
        super(mp, geschwind, glück, magiVert, magiStär, stärke, vert, leben, klasse);
        this.reinbold = reinbold;
    }
    public Wesen[] getReinbold(Wesen[] wesens) {
        for (int i = 0; i < wesens.length - 1;i++) {
            for (int j = 0; j < wesens.length - 1;j++) {
                if (getGeschwind(wesens[j]) > getGeschwind(wesens[j + 1])) {
                    blatt11.BubbleSort.swap(wesens,j);
                }
            }
        }
        return reinbold;
    }
}
