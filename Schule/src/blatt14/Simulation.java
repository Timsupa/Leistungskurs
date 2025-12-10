package blatt14;

import blatt13.Zufall;

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
            int k = Zufall.zufallGanz(0,arr.length);
            int w = Zufall.zufallGanz(0,arr[0].length);
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
    public static char getNordWest(char[][] arr,boolean rand,int posx,int posy) {
        if (posx == 0) {
            if (rand == false) {
                return '-';
            } else {
                posx = arr.length-1;
            }
        } else {
            posx--;
        }
        if (posy == 0) {
            if (rand == false) {
                return '-';
            } else {
                posy = arr[0].length-1;
            }
        } else {
            posy++;
        }
        return arr[posx][posy];
    }
    public static char getNordOst(char[][] arr,boolean rand,int posx,int posy) {
        if (posx == arr.length-1) {
            if (rand == false) {
                return '-';
            } else {
                posx = 0;
            }
        } else {
            posx++;
        }
        if (posy == 0) {
            if (rand == false) {
                return '-';
            } else {
                posy = arr[0].length-1;
            }
        } else {
            posy++;
        }
        return arr[posx][posy];
    }
    public static char getSuedOst(char[][] arr,boolean rand,int posx,int posy) {
        if (posx == arr.length-1) {
            if (rand == false) {
                return '-';
            } else {
                posx = 0;
            }
        } else {
            posx++;
        }
        if (posy == arr[0].length-1) {
            if (rand == false) {
                return '-';
            } else {
                posy = 0;
            }
        } else {
            posy--;
        }
        return arr[posx][posy];
    }
    public static char getSuedWest(char[][] arr,boolean rand,int posx,int posy) {
        if (posx == 0) {
            if (rand == false) {
                return '-';
            } else {
                posx = arr.length-1;
            }
        } else {
            posx++;
        }
        if (posy == arr[0].length-1) {
            if (rand == false) {
                return '-';
            } else {
                posy = 0;
            }
        } else {
            posy--;
        }
        return arr[posx][posy];
    }
        public static void main (String[]args){

        }
        public static int zeahlenVier(char[][] arr,boolean rand,int posx,int posy,int such){
            int zeahler = 0;
            if (getNorden(arr,rand,posx,posy)== such){
                zeahler =+ 1;
            }
            if (getOsten(arr,rand,posx,posy)== such){
                zeahler =+ 1;
            }
            if (getSueden(arr,rand,posx,posy)== such){
                zeahler =+ 1;
            }
            if (getWesten(arr,rand,posx,posy)== such){
                zeahler =+ 1;
            }
            return zeahler;
        }
        public static int zeahlenAcht(char[][] arr,boolean rand,int posx,int posy,int such){
        int zeahler = zeahlenVier(arr,rand,posx,posy,such);
        if (getSuedOst(arr,rand,posx,posy) == such){
            zeahler =+ 1;
        }
        if (getNordOst(arr,rand,posx,posy) == such){
            zeahler =+ 1;
        }
        if (getSuedWest(arr,rand,posx,posy) == such){
            zeahler =+ 1;
        }
        if (getWesten(arr,rand,posx,posy) == such){
            zeahler =+ 1;
        }
        return zeahler;
        }

    }
