package blatt15;
import blatt14.MultiArrays;
import schisch_visualizer.*;
import blatt14.Simulation;
public class Kaese {
    public static char[][] wasser(char[][] käs) {

        char[][] feldNeu = MultiArrays.copy2DCharArray(käs);

        for (int x = 0; x < käs.length; x++) {
            for (int y = 0; y < käs[x].length; y++) {
                if (käs[x][y] == '2') {
                    if (Simulation.getWesten(käs, false, x, y) == '0') {
                        feldNeu[x - 1][y] = '2';
                    }
                    if (Simulation.getSueden(käs, false, x, y) == '0') {
                        feldNeu[x][y + 1] = '2';
                    }
                    if (Simulation.getOsten(käs, false, x, y) == '0') {
                        feldNeu[x + 1][y] = '2';
                    }
                    if (Simulation.getNorden(käs, false, x, y) == '0') {
                        feldNeu[x][y - 1] = '2';
                    }
                }
            }
        }
        return feldNeu;


    }

    public static void main(String[] args) {
        int loch = 0;
        SchischVisualizer sv = new SchischVisualizer();
        char[][] kaesU = blatt14.MultiArrays.createEmpty2DCharArray(10, 10);
        for (int b = 0; b < kaesU.length; b++) {
            for (int i = 0; 10 > i; i++) {
                kaesU[i][b] = '5';
            }
        }
        sv.step(kaesU);
        Simulation.fuellen(kaesU, '0', 0.5);
        sv.step(kaesU);

        //Oberste Zeile mit Wasser füllen
        for (int x = 0; x < kaesU.length; x++) {
            if (kaesU[x][0] == '0') {
                kaesU[x][0] = '2';
            }
        }

        sv.step(kaesU);
                kaesU = wasser(kaesU);
                sv.step(kaesU);
            sv.start();
        }
    }
