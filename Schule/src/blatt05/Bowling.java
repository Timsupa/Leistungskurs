package blatt05;
import java.util.Scanner;
public class Bowling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int punkte = 0;
        int multiRunde = 0;
        int multi = 1;
        int frames = 10;
        int wurf = 2;
        int kegel = 0;
        int getrofen;
        while(frames>0){
            while (wurf != 0) {
                System.out.println("Wie viele Kegel haben sie getrofen");
                getrofen = input.nextInt();
                if(getrofen==kegel && wurf == 2){
                    kegel = 10;
                    multiRunde = 2;
                    multi ++;
                    wurf = 0;
                }else if(getrofen==kegel && wurf == 1){
                    kegel = 10;
                    multiRunde = 1;
                    multi ++;
                    wurf = 0;
                }else {
                    kegel += getrofen;
                    wurf --;
                }
            }
            if (multiRunde > 0) {
                punkte =punkte + (kegel * multi);
                multiRunde --;
            }
        }
    }
}
