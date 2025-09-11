package blatt04;
import java.util.Scanner;
public class Zeitumrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gebe eine positive Zahl an Sekunde ein:");
        int sekunde = input.nextInt();
        int sekunde2 = 0;
        int tag = 0;
        int stunde = 0;
        int minute = 0;
        while (sekunde != 0){
            if (sekunde >= 86400){//wenn die sekunden mehr sekunden sekunden haben als ein tag werden diese abgezogen und tag 1 hinzugefügt dies pasiert auch bei stunde und minute
                tag ++;
                sekunde -= 86400;
            }else if (sekunde >= 3600){
                stunde++;
                sekunde -= 3600;
            }else if (sekunde >= 60){
                minute++;
                sekunde -= 60;
            } else if (sekunde < 60) {//wenn die sekunden nun weniger als eine minute sind werden die rest sekunden aufgeschrieben in einer neuen varieable und die alten mit sich selber dividiert damit die schleife endet
                sekunde2 = sekunde;
                sekunde -= sekunde2;
            }
        }
        System.out.println(tag + " Tage, " + stunde + " Stunde, " + minute + " Minute " + sekunde2 + " Sekunden");
    }
}
//Das Program durchläuft 127 sich selbst
//c) ja stimmt ich habe es unter 10 fals google mir die richtige definition gegeben hat
