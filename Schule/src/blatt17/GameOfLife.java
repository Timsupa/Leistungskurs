package blatt17;

import blatt14.Simulation;
import schisch_visualizer.SchischVisualizer;

import java.util.Scanner;

public class GameOfLife {
    public static char[][] initRandom(int warschein){
        SchischVisualizer sc = new SchischVisualizer();
        char[][] feld = new char[100][100];
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(blatt13.Zufall.zufallGanz(100) < warschein){
                    feld[i][j] = '9';
                }else {
                    feld[i][j] = 'F';
                }
            }
        }
        return feld;
    }
    public static void weiter (char[][] feld){
        int zähler = 0;
        SchischVisualizer sc = new SchischVisualizer();
        for(int i=1;i< feld.length-1;i++){
            for(int j=1;j<feld[0].length-1;j++){
                if(feld[i][j] == 'F'){
                    if (Simulation.getSueden(feld,false,i,j) == 9){
                        zähler++;
                    }else if (Simulation.getWesten(feld,false,i,j) == 9){
                        zähler++;
                    } else if (Simulation.getOsten(feld,false,i,j)== 9){
                        zähler++;
                    } else if (Simulation.getNorden(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getNordOst(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getSuedWest(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getNordWest(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getSuedOst(feld,false,i,j)== 9) {
                        zähler++;
                    }
                    if (zähler == 3) {
                        feld[i][j] = '9';
                    }
                    zähler = 0;
                    sc.step(feld);
                }else if(feld[i][j] == '9'){
                    if (Simulation.getSueden(feld,false,i,j) == 9){
                        zähler++;
                    }else if (Simulation.getWesten(feld,false,i,j) == 9){
                        zähler++;
                    } else if (Simulation.getOsten(feld,false,i,j)== 9){
                        zähler++;
                    } else if (Simulation.getNorden(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getNordOst(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getSuedWest(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getNordWest(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (Simulation.getSuedOst(feld,false,i,j)== 9) {
                        zähler++;
                    }
                    if (zähler < 2){
                        feld[i][j] = 'F';
                    } else if (zähler == 3 || zähler == 2) {

                    } else if (zähler > 3) {
                        feld[i][j] = 'F';
                    }
                    zähler = 0;
                    sc.step(feld);
                }
            }
        }
    }
    public static void main(String[] args) {
        SchischVisualizer sc = new SchischVisualizer();
        char[][] feld =initRandom(40);
        sc.step(feld);
        weiter(feld);
        sc.start();
    }
}
