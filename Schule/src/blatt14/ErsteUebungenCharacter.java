package blatt14;
import schisch_visualizer.*;

import java.util.stream.IntStream;

public class ErsteUebungenCharacter {
    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char [][] k = blatt14.MultiArrays.createEmpty2DCharArray(11,14);
        IntStream.range(0, k.length).forEach(i -> k[i][0] = '1');
        IntStream.range(0, k[0].length).forEach(j -> k[0][j] = '1');
        IntStream.range(0, k[0].length).forEach(i -> k[k.length-1][i] = '1');
        IntStream.range(0, k[2].length-2).forEach(k2 -> k[2][k2] = '1');
        IntStream.range(0, k[8].length-2).forEach(k2 -> k[8][k2] = '1');
        IntStream.range(0, k.length).forEach(i -> k[i][13] = '1');
        IntStream.range(4, k.length-4).forEach(k2 -> k[k2][3] = '1');
        IntStream.range(4, k.length-4).forEach(k2 -> k[k2][5] = '1');
        IntStream.range(6, k.length-2).forEach(k2 -> k[k2][11] = '1');
        IntStream.range(3, k.length-6).forEach(k2 -> k[k2][11] = '1');
        k[5][12] = 'P';


        sv.step(k);
        sv.start();
    }
}
