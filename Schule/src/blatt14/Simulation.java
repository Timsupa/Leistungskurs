package blatt14;

public class Simulation {
    public static char[][] fuellen(char[][] arr,char ersetzt,double war) {
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[0].length;j++){
                if (Math.random()<war) {
                    arr[k][j] = ersetzt;
                }
            }
        }
        return arr;
    }
    public static char[][] fuellen(char[][] arr,char ersetzt,char neutral) {
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[k][j] == neutral) {
                    arr[k][j] = ersetzt;
                }
            }
        }
        return arr;
    }
    public static char[][] platzieren(char zeichen,char[][] arr){
        boolean erst = false;
        while(erst==false){
            int k = blatt13.Zufall.zufallGanz(0,arr.length);
            int w = blatt13.Zufall.zufallGanz(0,arr[0].length);
            if (arr[k][w]==zeichen){
            }else{
                erst=true;
                arr[k][w] = zeichen;
            }
        }
        return arr;
    }
    public static char getNorden(char[][] arr,boolean rand,int posx,int posy){
        char ret;
        if(rand==false && posy != 0) {
            ret = arr[posx][posy - 1];
        }else {
            ret = arr[posx][arr.length];
        }
        return ret;
    }
    public static char getOsten(char[][] arr,boolean rand,int posx,int posy) {
        char ret;
        if(rand==false && posx != arr.length-1){
            ret = arr[posx+1][posy];
        }else {
            ret = arr[0][posy];
        }
        return ret;
    }
    public static char getSueden(char[][] arr,boolean rand,int posx,int posy) {
        char ret;
        if(rand==false && posy != arr[0].length-1){
            ret = arr[posx][posy+1];
        }else {
            ret = arr[posx][0];
        }
        return ret;
    }
    public static char getWesten(char[][] arr,boolean rand,int posx,int posy) {
        char ret;
        if(rand==false && posx != 0){
            ret = arr[posx-1][posy];
        }else {
            ret = arr[arr[posy].length][posy];
        }
        return ret;
    }
    public static char getNordOst(char[][] arr,boolean rand,int posx,int posy) {
      //TODO e)
    }

}
