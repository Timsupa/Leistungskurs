package blatt15;
import blatt13.Zufall;
import schisch_visualizer.*;
import java.util.stream.IntStream;
import java.util.Scanner;
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
        if (team == 1) {
            magenta =+ 4;
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld.length; j++) {
                    if (spielfeld[i][j] == '7') {
                        magenta++;
                    }
                }
            }
            ausgabe = magenta;
        }
        if (team == 2) {
            hellgrün =+4;
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
    public static void respawn(int spielerNum,char[][] spielfeld,int[] pX,int[]pY) {
        int pxT;
        int pyT;
        if (spielerNum < 4){
            pxT = pX[spielerNum];
            pyT = pY[spielerNum];
            if (zaehlen(spielfeld,1) < 5) {
                while (spielfeld[pxT][pyT] != '7') {
                    pxT = Zufall.zufallGanz(1, 78);
                    pyT = Zufall.zufallGanz(1, 78);
                }
                spielfeld[pxT][pyT] = 'P';
                pX[spielerNum] = pxT;
                pY[spielerNum] = pyT;
            }else {
                pxT = Zufall.zufallGanz(1, 78);
                pyT = Zufall.zufallGanz(1, 78);
                spielfeld[pxT][pyT] = 'P';
                pX[spielerNum] = pxT;
                pY[spielerNum] = pyT;
            }
        }
            pxT = pX[spielerNum];
            pyT = pY[spielerNum];
            if (zaehlen(spielfeld, 2) < 5) {
                while (spielfeld[pxT][pyT] != '9') {
                    pxT = Zufall.zufallGanz(1, 78);
                    pyT = Zufall.zufallGanz(1, 78);
                }
                spielfeld[pxT][pyT] = 'P';
                pX[spielerNum] = pxT;
                pY[spielerNum] = pyT;
            } else {
                pxT = Zufall.zufallGanz(1, 78);
                pyT = Zufall.zufallGanz(1, 78);
                spielfeld[pxT][pyT] = 'P';
                pX[spielerNum] = pxT;
                pY[spielerNum] = pyT;
            }
    }
    public static String reihenfolge() {
        String reihe = "";
        int[] spieler ={1, 2, 3, 4, 5, 6, 7, 8};
        // Fisher-Yates Shuffle Algorithmus von julius geklaut
        for (int i = spieler.length -1; i > 0; i--) {
            int j = Zufall.zufallGanz(0, i+1);
            // tausch
            int temp = spieler[i];
            spieler[i] = spieler[j];
            spieler[j] = temp;
        }
        for (int i = 0; i < spieler.length; i++) {
            reihe += spieler[i];
        }

        return reihe;
    }
    public static void zugZwei(char[][] spielfeld,int[] pX,int[] pY,int spielerNum) {
        if (spielerNum >= 4) {
            int zug = blatt13.Zufall.zufallGanz(1,4);
            if (zug == 1){
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                pX[spielerNum] = pX[spielerNum]+1;
                spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
            }
            if (zug == 2){
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                pX[spielerNum] = pX[spielerNum]-1;
                spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
            }
            if (zug == 3){
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                pY[spielerNum] = pX[spielerNum]+1;
                spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
            }
            if (zug == 4){
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                pY[spielerNum] = pX[spielerNum]-1;
                spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
            }
        }

    }
    public static void zugEins(char[][] spielfeld,int spielerNum,int[] pX,int[] pY) {
        int zufall = 0;
        if (spielerNum < 4) {
            zufall = Zufall.zufallGanz(1, 4);
            if (zufall == 3) {
                if (pX[spielerNum] == 78) {
                } else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    pX[spielerNum] = pX[spielerNum] + 1;
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
                }
            }
            if (zufall == 2) {
                if (pY[spielerNum] == 78) {
                } else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    pY[spielerNum] = pY[spielerNum] + 1;
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
                }
            }
            if (zufall == 1) {
                if (pX[spielerNum] == 1) {
                } else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    pX[spielerNum] = pX[spielerNum] - 1;
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
                }
            }
            if (zufall == 4) {
                if (pY[spielerNum] == 1) {
                } else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    pY[spielerNum] = pY[spielerNum] - 1;
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
                }
            }
        }
    }
    public static void schritt(char[][] spielfeld,int [] pX,int[] pY) {
        String reih = reihenfolge();
        for (int i = 0; i < 8; i++) {
            int spieler = Character.getNumericValue(reih.charAt(i)-1);
            if (spieler < 4) {
                zugEins(spielfeld,spieler,pX,pY);
            } else {
                zugZwei(spielfeld,pX,pY,spieler);
            }

        }
    }
    public static void auswertung(char[][] spielfeld,int [] pX,int[] pY) {
        int team1 = zaehlen(spielfeld,1);
        int team2 = zaehlen(spielfeld,2);
        int weiß = zaehlen(spielfeld,0);
        System.out.println(team1);
        String gewinner = "";
        if(team1 > team2){
            gewinner = "Magenta";
        }else if(team1 < team2){
            gewinner = "Hellgrün";
        }
        double team1prozent = (double) (team1 * 100) / (team1 + team2);
        double team2prozent  = (double) team2 * 100 / (team1 + team2);
        System.out.println("! Auswertung !");
        System.out.println("Team1: " + team1);
        System.out.println("Team2: " + team2);
        System.out.println();
        System.out.println("Prozentuale Wertung");
        System.out.println("Team1 Prozente: " + team1prozent + "%");
        System.out.println("Team2 Prozente: " + team2prozent + "%");
        System.out.println();
        System.out.println("Der Gewinner ist");
        System.out.println();
        System.out.println("  " + gewinner + "  " );
    }
    public static void startPositionen(char[][] spielfeld,int[]pX,int[]pY,int[]reihenfolge){
        for (int i = 0; i < 4; i++) {
            pX[i] = Zufall.zufallGanz(41,79);
            pY[i] = Zufall.zufallGanz(1,79);
            spielfeld[pX[i]][pY[i]] = 'P';
        }
        for (int i = 4; i < 8; i++) {
            pX[i] = Zufall.zufallGanz(1,39);
            pY[i] = Zufall.zufallGanz(1,79);
            spielfeld[pX[i]][pY[i]] = 'P';
        }
    }
    public static void simulatuon(char[][] spielfeld,int[]pX,int[]pY,int züge){
        SchischVisualizer schischVisualizer = new SchischVisualizer();
        Scanner scanner = new Scanner(System.in);
        while (züge != 0){
            schritt(spielfeld,pX,pY);
            schischVisualizer.step(spielfeld);
            züge--;
        }
        schischVisualizer.start();
        String stop = scanner.next();
        auswertung(spielfeld,pX,pY);
    }
    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] spielfeld = new char[80][80];
        int[] pX = new int[8];
        int[] pY = new int[8];
        int[] reihenfolge = new int[8];
        startPositionen(spielfeld, pX, pY, reihenfolge);
        sv.step(initialisiereSpielfeld(spielfeld));
        simulatuon(spielfeld,pX,pY,100);
    }
}
