package blatt15;
import blatt13.Zufall;
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
        if (team == '2') {
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
        }else if (spielerNum <= 4) {
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
    }
    public static String reihenfolge() {
        String reihe = "";
        int[] spieler = {1, 2, 3, 4, 5, 6, 7, 8};
        // Fisher-Yates Shuffle Algorithmus von julius geklaut
        for (int i = spieler.length - 1; i > 0; i--) {
            int j = Zufall.zufallGanz(0, i + 1);
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
        int weg = 1;
        if(pX[spielerNum] < 45){
            weg = -1;
        }else{
            weg = 1;
        }
        if (spielerNum < 4) {
            if (pX[spielerNum] != 78){
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                pX[spielerNum] = pX[spielerNum]+weg;
                spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
            }
            else {
                if (pY[spielerNum] != 78){
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = '7';
                    pY[spielerNum] = pY[spielerNum]+1;
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = 'P';
                }
                else {
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = '7';
                    pY[spielerNum] = pY[spielerNum]-1;
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = 'P';
                }
            }

        }
        if (spielerNum <= 4) {
            if (pX[spielerNum] != 78){
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                pX[spielerNum] = pX[spielerNum]+weg;
                spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
            }
            else {
                if (pY[spielerNum] != 78){
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = '9';
                    pY[spielerNum] = pY[spielerNum]+1;
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = 'P';
                }
                else {
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = '9';
                    pY[spielerNum] = pY[spielerNum]-1;
                    spielfeld[pY[spielerNum]][pX[spielerNum]] = 'P';
                }
            }
        }
    }
    public static void zugEins(char[][] spielfeld,int spielerNum,int[] pX,int[] pY) {
        int zufall = 0;
        if (spielerNum < 4) {
            zufall = Zufall.zufallGanz(1, 4);
            if (zufall== 3) {
                if (pX[spielerNum] == 78) {
                }else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    spielfeld[pX[spielerNum] + 1][pY[spielerNum]] = 'P';
                    pX[spielerNum] = pX[spielerNum] + 1;
                }
            }
            if(zufall== 2) {
                if (pY[spielerNum] == 78) {
                }else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    spielfeld[pX[spielerNum]][pY[spielerNum] + 1] = 'P';
                    pY[spielerNum] = pY[spielerNum] + 1;
                }
            }
            if(zufall== 1){
                if (pX[spielerNum] == 1) {
                }else {
                spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                spielfeld[pX[spielerNum]-1][pY[spielerNum]] = 'P';
                pX[spielerNum] = pX[spielerNum]-1;
                }
            }
            if(zufall == 4){
                if (pY[spielerNum] == 1) {
                }else {
                    spielfeld[pX[spielerNum]][pY[spielerNum]] = '7';
                    spielfeld[pX[spielerNum]][pY[spielerNum] - 1] = 'P';
                    pY[spielerNum] = pY[spielerNum] - 1;
                }
            }
            if (spielerNum >= 4) {
                zufall = Zufall.zufallGanz(1, 4);
                if (zufall == 3) {
                    if (pX[spielerNum] == 78) {
                    } else {
                        spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                        spielfeld[pX[spielerNum] + 1][pY[spielerNum]] = 'P';
                        pX[spielerNum] = pX[spielerNum] + 1;
                    }
                }
                if (zufall == 2) {
                    if (pY[spielerNum] == 78) {
                    } else {
                        spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                        spielfeld[pX[spielerNum]][pY[spielerNum] + 1] = 'P';
                        pY[spielerNum] = pY[spielerNum] + 1;
                    }
                }
                if (zufall == 1) {
                    if (pX[spielerNum] == 1) {
                    } else {
                        spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                        spielfeld[pX[spielerNum] - 1][pY[spielerNum]] = 'P';
                        pX[spielerNum] = pX[spielerNum] - 1;
                    }
                }
                if (zufall == 4) {
                    if (pY[spielerNum] == 1) {
                    } else {
                        spielfeld[pX[spielerNum]][pY[spielerNum]] = '9';
                        spielfeld[pX[spielerNum]][pY[spielerNum] - 1] = 'P';
                        pY[spielerNum] = pY[spielerNum] - 1;
                    }
                }
            }
        }
    }
    public static void schritt(char[][] spielfeld,int [] pX,int[] pY) {
        String reih = reihenfolge();
        for (int i = 0; i < reih.length(); i++) {
            int spieler = Character.getNumericValue(reih.charAt(i)) - 1;
            int zug12 = Zufall.zufallGanz(1, 2);
            if (zug12 == 1) {
                zugEins(spielfeld,spieler,pX,pY);
            }
            if (zug12 == 2) {
                zugZwei(spielfeld,pX,pY,spieler);
            }
        }
    }
    public static void auswertung(char[][] spielfeld,int [] pX,int[] pY) {
        int team1 = zaehlen(spielfeld,1);
        int team2 = zaehlen(spielfeld,2);
        int weiß = zaehlen(spielfeld,0);
        String gewinner = "";
        if(team1 > team2){
            gewinner = "Magenta";
        }else if(team1 < team2){
            gewinner = "Hellgrün";
        }
        System.out.println("! Auswertung !");
        System.out.println("Team1: " + team1);
        System.out.println("Team2: " + team2);
        System.out.println("Unberührt" + weiß);
        System.out.println();
        System.out.println("Prozentuale Wertung");
        double team1prozent = team1 * 100 / (team1 + team2);
        double team2prozent  = team2 * 100 / (team1 + team2);
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
        while (züge != 0){
            schritt(spielfeld,pX,pY);
            schischVisualizer.step(spielfeld);
            züge--;
        }
        schischVisualizer.start();
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
        simulatuon(spielfeld,pX,pY,1000);
    }
}
