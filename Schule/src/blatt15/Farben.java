package blatt15;
import blatt13.Zufall;
import schisch_visualizer.*;
import java.util.stream.IntStream;
import java.util.Scanner;
public class Farben {
    static char[][] spielfeld = new char[80][80];
    static int[] pX = new int[8];
    static int[] pY = new int[8];
    static int[] reihenfolge = new int[8];

    public static char[][] initialisiereSpielfeld() {
        IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[i][0] = '8');
        IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[i][spielfeld.length - 1] = '8');
        IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[0][i] = '8');
        IntStream.range(0, spielfeld.length).forEach(i -> spielfeld[spielfeld.length - 1][i] = '8');
        return spielfeld;
    }

    public static int zaehlen(int team) {
        int ausgabe = 0;
        int magenta = 0;
        int hellgrün = 0;
        int white = 0;
        if (team == 0) {
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
            magenta = +4;
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
            hellgrün = +4;
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

    public static void respawn(int spielerNum) {
        int pxT;
        int pyT;
        if (spielerNum < 4) {
            pxT = pX[spielerNum];
            pyT = pY[spielerNum];
            if (zaehlen(1) < 5) {
                while (spielfeld[pxT][pyT] != '7') {
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
        }else {
            pxT = pX[spielerNum];
            pyT = pY[spielerNum];
            if (zaehlen(2) < 5) {
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

    public static void zugZwei(int spielerNum) {
        int x = 0;
        int y = 0;
        if (blatt14.Simulation.getWesten(spielfeld, false, pX[spielerNum], pY[spielerNum]) == '7' || blatt14.Simulation.getWesten(spielfeld, false, pX[spielerNum], pY[spielerNum]) == 'P') {
            x = pX[spielerNum];
            y = pY[spielerNum];
            pX[spielerNum]--;
        } else if (blatt14.Simulation.getOsten(spielfeld, false, pX[spielerNum], pY[spielerNum]) == '7' || blatt14.Simulation.getOsten(spielfeld, false, pX[spielerNum], pY[spielerNum]) == 'P') {
            x = pX[spielerNum];
            y = pY[spielerNum];
            pX[spielerNum]++;
        } else if (blatt14.Simulation.getNorden(spielfeld, false, pX[spielerNum], pY[spielerNum]) == '7' || blatt14.Simulation.getNorden(spielfeld, false, pX[spielerNum], pY[spielerNum]) == 'P') {
            x = pX[spielerNum];
            y = pY[spielerNum];
            pY[spielerNum]--;
        } else if (blatt14.Simulation.getSueden(spielfeld, false, pX[spielerNum], pY[spielerNum]) == '7' || blatt14.Simulation.getSueden(spielfeld, false, pX[spielerNum], pY[spielerNum]) == 'P') {
            x = pX[spielerNum];
            y = pY[spielerNum];
            pY[spielerNum]++;
        } else {
            if (pX[spielerNum] != 78) {
                x = pX[spielerNum];
                y = pY[spielerNum];
                pX[spielerNum]++;
            }else if(pX[spielerNum] == 78 && pY[spielerNum] != 78){
                x = pX[spielerNum];
                y = pY[spielerNum];
                pY[spielerNum]++;
            }
        }
        if (spielfeld[pX[spielerNum]][pY[spielerNum]] == 'P') {
            for (int i = 0; i < 8; i++) {
                if (i != spielerNum && spielfeld[pX[i]][pY[i]] != spielfeld[pX[spielerNum]][pY[spielerNum]]) {
                    respawn(i);
                    break;
                }
            }
        }
        spielfeld[x][y] = '9';
        spielfeld[pX[spielerNum]][pY[spielerNum]] = 'P';
    }
        public static void zugEins (int spielerNum){
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
        public static void schritt()
        {
            String reih = reihenfolge();
            for (int i = 0; i < 8; i++) {
                int spieler = Character.getNumericValue(reih.charAt(i)) - 1;
                if (spieler < 4) {
                    zugEins(spieler);
                } else {
                    zugZwei(spieler);
                }
            }
        }
        public static void auswertung()
        {
            int team1 = zaehlen(1);
            int team2 = zaehlen(2);
            int weiß = zaehlen(0);
            System.out.println(team1);
            String gewinner = "";
            if (team1 > team2) {
                gewinner = "Magenta";
            } else if (team1 < team2) {
                gewinner = "Hellgrün";
            }
            double team1prozent = (double) (team1 * 100) / (team1 + team2);
            double team2prozent = (double) team2 * 100 / (team1 + team2);
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
            System.out.println("  " + gewinner + "  ");
        }
        public static void startPositionen()
        {
            for (int i = 0; i < 4; i++) {
                pX[i] = Zufall.zufallGanz(41, 79);
                pY[i] = Zufall.zufallGanz(1, 79);
                spielfeld[pX[i]][pY[i]] = 'P';
            }
            for (int i = 4; i < 8; i++) {
                pX[i] = Zufall.zufallGanz(1, 39);
                pY[i] = Zufall.zufallGanz(1, 79);
                spielfeld[pX[i]][pY[i]] = 'P';
            }
        }
        public static void simulatuon (int züge){
            SchischVisualizer schischVisualizer = new SchischVisualizer();
            Scanner scanner = new Scanner(System.in);
            while (züge != 0) {
                schritt();
                schischVisualizer.step(spielfeld);
                züge--;
            }
            schischVisualizer.start();
            String stop = scanner.next();
            auswertung();
        }
        public static void main (String[]args){
            SchischVisualizer sv = new SchischVisualizer();

            startPositionen();
            sv.step(initialisiereSpielfeld());
            simulatuon( 1000);
        }
    }

