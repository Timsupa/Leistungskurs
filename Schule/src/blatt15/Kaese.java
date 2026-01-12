package blatt15;
import schisch_visualizer.*;
public class Kaese {
    public static void wasser (char[][] käs) {
        for (int i = 0; 10 > i;i++){
            for (int g = 0; 10 > g; g++){
                if (käs[i][g] == '0')
                    käs[i][g] = '2';
            }
        }
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
        for (int d = 0; d < kaesU.length; d++) {
            for (int g = 0; 10 > g; g++) {
                loch = blatt13.Zufall.zufallGanz(6);
                if (loch > 4) {
                    kaesU[d][g] = '0';
                }
            }
        }

        sv.step(kaesU);
        sv.start();
    }
}
