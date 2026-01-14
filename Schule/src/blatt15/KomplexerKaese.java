package blatt15;
import blatt14.Simulation;
import schisch_visualizer.*;
import blatt14.MultiArrays;
import java.util.Scanner;

import static blatt15.Kaese.wasser;

public class KomplexerKaese {
    public static char[][] wasser3D(char[][] schnitt ,char[][] front,char[][] back) {
        char[][] feldNeu = MultiArrays.copy2DCharArray(schnitt);
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
        int zähler = 10;
        int temp = zähler+1;
        int temp2 = temp;
        SchischVisualizer sv = new SchischVisualizer();
        char[][] kaesU = new char[10][10];
        char[][][] kaes3 = MultiArrays.createEmpty3DCharArray(10,10,9);
        while (zähler-1 != 0) {
            for (int b = 0; b < kaes3.length; b++) {
                for (int i = 0; 10 > i; i++) {
                    kaes3[i][b][zähler] = '5';
                }
            }
            for (int b = 0; b < kaes3[0].length; b++) {
                for (int i = 0; 10 > i; i++) {
                    kaesU[b][i] = kaes3[b][i][zähler];
                }
            }
            sv.step(kaesU);
            Simulation.fuellen(kaesU, '0', 0.5);
            sv.step(kaesU);
            for (int x = 0; x < kaesU.length; x++) {
                if (kaesU[x][0] == '0') {
                    kaesU[x][0] = '2';
                }
            }
             while (temp != 0) {
                 kaesU = wasser(kaesU);
                 temp--;
             }
             sv.step(kaesU);
             temp= temp2;
             zähler--;
        }
        sv.start();
    }
    }

