package blatt14;

public class Arraydimensionen {
    import schisch_visualize.;

    public static void main(String[] args) {
        char[][] gr = new char[3][90];
        for (int i = 0; i < gr.length; i++) {
            for (int j = 0; j < gr[i].length; j++) {
                gr[i][j] = (char)(Math.random()*'a'+'A');
            }
        }
    }
}
