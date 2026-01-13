package blatt15;
import blatt14.Simulation;
import schisch_visualizer.*;
import blatt14.MultiArrays;

public class KomplexerKaese {
    public static char[][] wasser3D(char[][] schnitt ,char[][] front,char[][] back) {
        char[][] feldOld;
        int feldalt = 0;
        char[][] feldNeu = MultiArrays.copy2DCharArray(schnitt);

        if (feldalt == 1)
        for (int x = 0; x < schnitt.length; x++) {
            for (int y = 0; y < schnitt[x].length; y++) {
                if (schnitt[x][y] == '2') {
                    if (Simulation.getWesten(schnitt, false, x, y) == '0') {
                        feldNeu[x - 1][y] = '2';
                    }
                    if (Simulation.getSueden(schnitt, false, x, y) == '0') {
                        feldNeu[x][y + 1] = '2';
                    }
                    if (Simulation.getOsten(schnitt, false, x, y) == '0') {
                        feldNeu[x + 1][y] = '2';
                    }
                    if (Simulation.getNorden(schnitt, false, x, y) == '0') {
                        feldNeu[x][y - 1] = '2';
                    }
                }
            }
        }
        return feldNeu;


    }
    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] kaesU = MultiArrays.createEmpty2DCharArray(10, 10);
        for (int b = 0; b < kaesU.length; b++) {
            for (int i = 0; 10 > i; i++) {
                kaesU[i][b] = '5';
            }
        }
        sv.step(kaesU);
        Simulation.fuellen(kaesU, '0', 0.5);
        sv.step(kaesU);
    }
    }

