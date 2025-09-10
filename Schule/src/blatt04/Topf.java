package blatt04;
import java.util.Scanner;
        import java.util.Random;
public class Topf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int topfx = rand.nextInt(101);
        int topfy = rand.nextInt(101);
        System.out.println(topfx + " " + topfy);
        int spielerx = 0;
        int spielery = 0;
        int dif;
        int olddif = 0;
        while(topfx != spielerx && topfy != spielery){
            System.out.println("w , a , s , d");
            String bew = input.next();
            if(bew.equals("a")){
                spielerx -= 1;
            }else if(bew.equals("s")){
                spielery -= 1;
            }else if(bew.equals("d")){
                spielerx += 1;
            } else if (bew.equals("w")) {
                spielery += 1;
            } else  {
                System.out.println("Fehler!");
                continue;
            }
            dif = spielerx + spielery - (topfx + topfy);
            if(dif > 0){
                dif = dif + dif * 2;
            }if(olddif > dif){
                System.out.println("wärmer");
            } else if (olddif < dif) {
                System.out.println("kälter");
            }
            olddif = dif;
        }
        System.out.println("Sie haben den Topf geschlagen");
    }
}
