package blatt15;
import schisch_visualizer.*;
import blatt14.Simulation;
public class Kaese {
    public static void wasser (char[][] käs) {
        boolean randwe = false;
        boolean randsü = false;
        boolean randddr = false;
        int temp = 0;
        int temp2 = 0;
        int g = 0;
        for (int i = 0; 10 > i;i++){
                if (käs[i][g] == '0'){
                    käs[i][g] = '2';
                }
                if (g == 10){
                    randsü = true;
                }else{
                    randsü = false;
                }
                if (i == 10){
                    randddr = true;
                }else{
                    randddr = false;
                }
                if(i == 0){
                    randwe = true;
                }else{
                    randwe = false;
                }
                temp = g;
                temp2 = i;
                while (Simulation.getSueden(käs,randsü,i,g) != '0' && Simulation.getWesten(käs,randwe,i,g) != '0' && Simulation.getOsten(käs,randddr,i,g) != '0'){
                    if (Simulation.getSueden(käs,randsü,i,g) != '0'){
                        g++;
                        käs[i][g] = '2';
                        g = temp;
                    }
                    if (Simulation.getOsten(käs,randddr,i,g) != '0'){

                    }}
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
