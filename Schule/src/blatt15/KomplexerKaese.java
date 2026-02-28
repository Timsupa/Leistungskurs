package blatt15;
import blatt14.Simulation;
import schisch_visualizer.*;
import blatt14.MultiArrays;

import static blatt15.Kaese.wasser;

public class KomplexerKaese {
    public static boolean komplexWasser(char[][] kaese2, int x, int y) {
        if (kaese2[x][y] == ' ') {
            return true;
        }
        return false;
    }

    public static char[][] komplexwasser(char[][] kaese1, char[][] kaese2) {
        for (int i = 0; i < kaese2.length; i++) {
            for (int j = 0; j < kaese2[i].length; j++) {
                if (kaese1[i][j] == '2') {
                    if (komplexWasser(kaese2, i, j)) {
                        kaese2[i][j] = '2';
                    }
                }
            }
        }
        return kaese2;
    }

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] kaese1 = Kaese.kaesefill(10, 10, 0.5);
        char[][] kaese2 = Kaese.kaesefill(10, 10, 0.5);
        for (int i = 0; i < 100; i++) {
            Kaese.wasser(kaese1);
            sv.step(kaese1);
            char[][] neu = Kaese.wasser(kaese1);
            while (!MultiArrays.istIdentisch(kaese1, neu)) {
                kaese1 = neu;
                kaese2 = komplexwasser(kaese1, kaese2);
                neu = Kaese.wasser(kaese1);
            }
            sv.step(kaese1);
            kaese1 = kaese2;
            kaese2 = Kaese.kaesefill(10, 10, 0.5);
        }
        sv.start();

    }
}

