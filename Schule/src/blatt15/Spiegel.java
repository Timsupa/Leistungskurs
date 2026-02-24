package blatt15;

import schisch_visualizer.SchischVisualizer;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Spiegel {
    public static void zufallSpiegel(char[][] arr){
        SchischVisualizer schischVisualizer = new SchischVisualizer();
        for (int i = 2; i < arr.length-2; i++) {
            for (int j = 2; j < arr[0].length-2; j++) {
                if (arr[i-1][j] == '/' || arr[i-1][j+1] == '\\' || arr[i][j-1] == '/' || arr[i-1][j] == '\\') {

                }else {
                    if (blatt13.Zufall.zufallGanz(1, 4) == 2) {
                        if (blatt13.Zufall.zufallGanz(3, 4) == 4) {
                            arr[i][j] = '/';
                        } else {
                            arr[i][j] = '\\';
                        }
                    }
                }
            }
        }
        schischVisualizer.step(arr);
    }
    public static void zufallSpiegelSchwer(char[][] arr) {
        SchischVisualizer schischVisualizer = new SchischVisualizer();
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr[0].length-1; j++) {
                if (blatt13.Zufall.zufallGanz(1, 3) == 1) {
                    if (blatt13.Zufall.zufallGanz(1, 3) == 2) {
                        arr[i][j] = '/';
                    } else {
                        arr[i][j] = '\\';
                    }
                }
            }
        }
        schischVisualizer.step(arr);
    }
    public static void zufallZiele(char[][] arr) {
        SchischVisualizer schischVisualizer = new SchischVisualizer();
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr[0].length-1; j++) {
                if (arr[i-1][j-1] != '/' || arr[i-1][j+1] != '\\') {
                    if (blatt13.Zufall.zufallGanz(1, 7) == 2) {
                        arr[i][j] = 'O';
                    }
                }
            }
        }
        schischVisualizer.step(arr);
    }
    public static void generierePfeil(char[][] arr) {
        SchischVisualizer sc = new SchischVisualizer();
        arr[1][arr.length/2] = '>';
        sc.step(arr);
    }
    public static void spiegelSpiegel(char[][] arr,int richt,int posx, int posy) {
        arr[posx][posy] = ' ';
        outer:
        while (true) {
            if (richt == 1) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        if (arr[posx+1][posy] == '/') {
                            if (arr[posx+1][posy-1] == ' ') {
                                arr[posx+1][posy-1] = '^';
                                return;
                            }
                            else {
                                posx += 1;
                                posy -= 1;
                                richt = 3;
                                continue outer;
                            }
                        }else  if (arr[posx+1][posy] == '\\') {
                            if (arr[posx+1][posy+1] == ' ') {
                                arr[posx+1][posy+1] = 'V';
                                return;
                            }
                            else {
                                posx += 1;
                                posy += 1;
                                richt = 4;
                                continue outer;
                            }
                        }
                    }
                }
            }else if (richt == 2) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        if (arr[posx -1][posy] == '/') {
                            if (arr[posx -1][posy + 1] == ' ') {
                                arr[posx - 1][posy + 1] = 'V';
                                return;
                            } else {
                                posx -= 1;
                                posy -= 1;
                                richt = 4;
                                continue outer;
                            }
                        } else if (arr[posx - 1][posy] == '\\') {
                            if (arr[posx -1][posy - 1] == ' ') {
                                arr[posx - 1][posy - 1] = '^';
                                return;
                            } else {
                                posx += 1;
                                posy += 1;
                                richt = 3;
                                continue outer;
                            }
                        }
                    }
                }

            }else if (richt == 3) {

            }else if (richt == 4) {

            }

        }
    }
    public static void spiegelSimulation(char[][] arr,double dreh, int schritte,int pfeilab) {
        SchischVisualizer sc = new SchischVisualizer();
        zufallSpiegelSchwer(arr);
        IntStream.range(0, arr.length).forEach(i -> arr[i][0] = '8');
        IntStream.range(0, arr.length).forEach(i -> arr[i][arr.length - 1] = '8');
        IntStream.range(0, arr.length).forEach(i -> arr[0][i] = '8');
        IntStream.range(0, arr.length).forEach(i -> arr[arr.length - 1][i] = '8');
        zufallZiele(arr);
        generierePfeil(arr);
        sc.step(arr);
        int warum = pfeilab;
        int temp = warum;
        while (schritte != 0) {
            if (warum == 0) {
                generierePfeil(arr);
                warum = temp;
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (pfeilab == 0){
                        generierePfeil(arr);
                        pfeilab = temp;
                    }
                    if (arr[i][j] == '>') {
                        if (arr[i + 1][j] == '8') {
                            arr[i][j] = ' ';
                        }else  if (arr[i + 1][j] == '>' || arr[i + 1][j] == '<' || arr[i + 1][j] == 'V' || arr[i + 1][j] == '^') {
                            arr[i][j] = ' ';
                            arr[i + 1][j] = ' ';
                        } else if (arr[i+1][j] == '/') {
                            arr[i][j] = ' ';
                            arr[i+1][j-1] = '^';
                        } else if (arr[i+1][j] == '\\') {
                            arr[i][j] = ' ';
                            arr[i+1][j+1] = 'V';
                        } else {
                            if (arr[i + 1][j] == 'O') {
                                arr[i][j] = ' ';
                                arr[i + 1][j] = ' ';
                            } else {
                                arr[i][j] = ' ';
                                arr[i + 1][j] = '>';
                            }
                        }
                        pfeilab--;
                        sc.step(arr);
                    } else if (arr[i][j] == '<') {
                        if (arr[i - 1][j] == '8') {
                            arr[i][j] = ' ';
                        }else if (arr[i-1][j] == '/') {
                            arr[i][j] = ' ';
                            arr[i-1][j+1] = 'V';
                        } else if (arr[i-1][j] == '\\') {
                            arr[i][j] = ' ';
                            arr[i-1][j-1] = '^';
                        } else  if (arr[i - 1][j] == '>' || arr[i - 1][j] == '<' || arr[i - 1][j] == 'V' || arr[i - 1][j] == '^') {
                            arr[i][j] = ' ';
                            arr[i - 1][j] = ' ';
                        } else {
                            if (arr[i - 1][j] == 'O') {
                                arr[i][j] = ' ';
                                arr[i - 1][j] = ' ';
                            } else {
                                arr[i][j] = ' ';
                                arr[i - 1][j] = '<';
                            }
                        }
                        pfeilab--;
                        sc.step(arr);
                    } else if (arr[i][j] == 'V') {
                        if (arr[i][j + 1] == '8') {
                            arr[i][j] = ' ';
                        }else if (arr[i][j+1] == '/') {
                            arr[i][j] = ' ';
                            arr[i-1][j+1] = '<';
                        } else if (arr[i][j+1] == '\\') {
                            arr[i][j] = ' ';
                            arr[i+1][j+1] = '>';
                        }
                        else if (arr[i][j + 1] == '>' || arr[i][j +1] == '<' || arr[i][j +1] == 'V' || arr[i][j +1] == '^') {
                            arr[i][j] = ' ';
                            arr[i][j +1] = ' ';
                        }else {
                            if (arr[i][j + 1] == 'O') {
                                arr[i][j] = ' ';
                                arr[i][j + 1] = ' ';
                            } else {
                                arr[i][j + 1] = 'V';
                                arr[i][j] = ' ';
                            }
                        }
                        pfeilab--;
                        sc.step(arr);
                    } else if (arr[i][j] == '^') {
                        if (arr[i][j - 1] == '8') {
                            arr[i][j] = ' ';
                        }
                        else if (arr[i][j-1] == '/') {
                            arr[i][j] = ' ';
                            arr[i+1][j-1] = '>';
                        } else if (arr[i][j-1] == '\\') {
                            arr[i][j] = ' ';
                            arr[i-1][j-1] = '<';
                        }else if (arr[i][j -1] == '>' || arr[i ][j -1] == '<' || arr[i][j -1] == 'V' || arr[i][j -1] == '^') {
                            arr[i][j] = ' ';
                            arr[i][j -1] = ' ';
                        }else {
                            if (arr[i][j - 1] == 'O') {
                                arr[i][j] = ' ';
                                arr[i][j - 1] = ' ';
                            } else {
                                arr[i][j - 1] = '^';
                                arr[i][j] = ' ';
                            }
                        }
                        pfeilab--;
                        sc.step(arr);
                    }
                }
            }
            warum--;
            schritte--;
        }
        sc.step(arr);
        sc.start();
    }
    public static void main(String[] args) {
        char arr[][] = new char[50][50];
        spiegelSimulation(arr,0.9,5000,7);
    }
}
