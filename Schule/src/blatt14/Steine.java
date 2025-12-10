package blatt14;

import java.util.stream.IntStream;

public class Steine {
    public static void zeicheI(int posx,char[][] tetra){
        boolean hor;
        if (Math.random() < 0.5) {
            hor = true;
        }
        else {
            hor = false;
        }
        if (hor) {
            IntStream.range(posx, posx+4).forEach(i -> tetra[i][0] = '4');
        }
        else {

        }

    }
}
