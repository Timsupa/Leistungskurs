package blatt17;
import blatt14.Simulation;

import schisch_visualizer.SchischVisualizer;

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
                if(feld[i-1][j-1] == 'F'){
                 if (blatt14.Simulation.getSueden(feld,false,i,j) == 9){
                     zähler++;
                 }else if (blatt14.Simulation.getWesten(feld,false,i,j) == 9){
                     zähler++;
                 } else if (blatt14.Simulation.getOsten(feld,false,i,j)== 9){
                     zähler++;
                 } else if (blatt14.Simulation.getNorden(feld,false,i,j)== 9) {
                     zähler++;
                 } else if (blatt14.Simulation.getNordOst(feld,false,i,j)== 9) {
                     zähler++;
                 } else if (blatt14.Simulation.getSuedWest(feld,false,i,j)== 9) {
                     zähler++;
                 } else if (blatt14.Simulation.getNordWest(feld,false,i,j)== 9) {
                     zähler++;
                 } else if (blatt14.Simulation.getSuedOst(feld,false,i,j)== 9) {
                     zähler++;
                 }
                 if (zähler == 3) {
                     feld[i][j] = '9';
                 }
                    zähler = 0;
                }else if(feld[i-1][j-1] == '9'){
                    if (blatt14.Simulation.getSueden(feld,false,i,j) == 9){
                        zähler++;
                    }else if (blatt14.Simulation.getWesten(feld,false,i,j) == 9){
                        zähler++;
                    } else if (blatt14.Simulation.getOsten(feld,false,i,j)== 9){
                        zähler++;
                    } else if (blatt14.Simulation.getNorden(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (blatt14.Simulation.getNordOst(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (blatt14.Simulation.getSuedWest(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (blatt14.Simulation.getNordWest(feld,false,i,j)== 9) {
                        zähler++;
                    } else if (blatt14.Simulation.getSuedOst(feld,false,i,j)== 9) {
                        zähler++;
                    }
                    if (zähler < 2){
                        feld[i][j] = 'F';
                    } else if (zähler == 3 || zähler == 2) {

                    } else if (zähler > 3) {
                        feld[i][j] = 'F';
                    }
                }
                sc.step(feld);
                sc.start();
            }
        }
    }
    public static void main(String[] args) {
        char[][] feld =initRandom(5);
        weiter(feld);
    }
}
