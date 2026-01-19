package blatt15;
import schisch_visualizer.*;
import java.util.stream.IntStream;
public class Farben {
    public static char[][] initialisiereSpielfeld(char[][] spielfeld) {
       IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[i][0] = '8');
       IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[i][spielfeld.length-1] = '8');
       IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[0][i] = '8');
       IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[spielfeld.length-1][i] = '8');
       return spielfeld;
    }
    public static int zaehlen(char[][] spielfeld,int team) {
        int ausgabe = 0;
        int magenta = 0;
        int hellgrün = 0;
        int white = 0;
        if (team == 0){
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld.length; j++) {
                    if (spielfeld[i][j] == ' ') {
                        white++;
                    }
                }
            }
            ausgabe = white;
        }
        if (team == '1') {
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld.length; j++) {
                    if (spielfeld[i][j] == '7') {
                        magenta++;
                    }
                }
            }
            ausgabe = magenta;
        }
        if (team == '2') {
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld.length; j++) {
                    if (spielfeld[i][j] == '9') {
                        hellgrün++;
                    }
                }
            }
            ausgabe = hellgrün;
        }
        return ausgabe;
    }
    public static void startPositionen(char[][] spielfeld,int[]pX,int[]pY,int[]reihenfolge){
        for (int i = 0; i < 4; i++) {
            pX[i] = blatt13.Zufall.zufallGanz(41,79);
            pY[i] = blatt13.Zufall.zufallGanz(1,79);
            spielfeld[pX[i]][pY[i]] = 'P';
        }
        for (int i = 4; i < 8; i++) {
            pX[i] = blatt13.Zufall.zufallGanz(1,39);
            pY[i] = blatt13.Zufall.zufallGanz(1,79);
            spielfeld[pX[i]][pY[i]] = 'P';
        }
    }
    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] spielfeld = new char[80][80];
        int[] pX = new int[8];
        int[] pY = new int[8];
        int[] reihenfolge = new int[8];
        startPositionen(spielfeld, pX, pY, reihenfolge);
        sv.step(initialisiereSpielfeld(spielfeld));
        sv.start();
        System.out.println(zaehlen(spielfeld,'3'));
    }
}
