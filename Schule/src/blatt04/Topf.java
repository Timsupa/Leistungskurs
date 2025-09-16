package blatt04;
import java.util.Scanner;
        import java.util.Random;
public class Topf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        double topfx = rand.nextInt(101);//zufällige position des topfes wird zwischen 0-100 generiert
        double topfy = rand.nextInt(101);
        System.out.println(topfx + " " + topfy);
        double spielerx = 50;//spieler erscheint im mittelpunkt des feldes (100*100)
        double spielery = 50;
        double dif;
        double olddif =Math.sqrt(Math.pow(50 - topfx, 2) + Math.pow(50 - topfy, 2));//durch pythagoras die dif beim start des spiels ausrechnen damit sie später mit der neuen verglichen werden kann
        while(true){
            System.out.println("w , a , s , d");
            String bew = input.next();
            if(bew.equals("a")){//wenn a gedrückt wird geht er nach links
               spielerx -= 1;
            }else if(bew.equals("s")){//geht nach unten
               spielery -= 1;
            }else if(bew.equals("d")){//geht nach rechts
                spielerx += 1;
            } else if (bew.equals("w")) {//geht nach oben
                spielery += 1;
            } else  {
                System.out.println("Fehler!");//bei anderer taste wird eine fehlermeldung gegeben und das program startet vom anfang der while schleife
                continue;
            }
            if( spielerx == topfx && spielery == topfy ){//wenn x und y kordinate von spieler und topf gleich sind endet das spiel
                break;
            }
            dif = Math.sqrt(Math.pow(spielerx - topfx,2 ) + Math.pow(spielery - topfy, 2));//pytagoras um neue difference auszurechnen um sie mit der alten zu vergleichen
            if(olddif > dif){//wenn dif kleiner = wärmer
                System.out.println("wärmer");
            } else if (olddif < dif) {//wenn dif größer = kälter
                System.out.println("kälter");
            }
            olddif = dif;//"neue"dif wird zur alten damit in der nächsten schleife weiter verglichen werden kann
        }
        System.out.println("Sie haben den Topf geschlagen");
    }
}
