package blatt04;
import java.util.Scanner;
public class Reihen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchten Sie ausgeben");//nachfrage wie viele zahlen ausgegeben werden müssen
        int zahlen = input.nextInt();
        if ( zahlen <= 0){//bei minus zahl wird das program aus gemacht
            System.out.println("Diese Zahlen können nicht ausgegeben werden negative Zahlen sind nicht gestattet");
            System.exit(0);
        }
        int wiederholung = 0;
        int reihe12 = 0;
        int reihe22 = 0;
        int reihe44 = 1;
        int reihe4;
        double reihe33 = 0;
        System.out.println("Reihe 1: ");
        while (zahlen != wiederholung) {//solange zahlen und wiederholung nicht gleich sind geht die schleife weiter
            int reihe1 = reihe12 + 1;//a1 + d = a2(nächste zahl wird ausgerechnet)
            System.out.print(reihe1 + " ");//ausgabe der nächsten zahl
            wiederholung++;//wiederholung wird um 1 erhöht damit gesagt werden kann das eine Zahl ausgegeben wurde und die Schleife nicht undendlich ist
            reihe12 = reihe1;
        }
        System.out.println();//spalte
        System.out.println();
        System.out.println("Reihe 2: ");
        wiederholung = 0;//wiederholung wird auf 0 zurückgesetzt weil sont die bedingung der nächsten while schleife schon erfüllt ist
        while (zahlen != wiederholung) {//solange zahlen und wiederholung nicht gleich sind geht die schleife weiter
            int reihe2 = reihe22 + 2;//a1 + d = a2(nächste zahl wird ausgerechnet)
            System.out.print(reihe2 + " ");//ausgabe der nächsten zahl
            wiederholung++;//wiederholung wird um 1 erhöht damit gesagt werden kann das eine Zahl ausgegeben wurde und die Schleife nicht undendlich ist
            reihe22 = reihe2;
        }
        System.out.println();
        System.out.println();//spalte
        System.out.println("Reihe 3: ");
        wiederholung = 0;//wiederholung wird auf 0 zurückgesetzt weil sont die bedingung der nächsten while schleife schon erfüllt ist
        while (zahlen != wiederholung) {//solange zahlen und wiederholung nicht gleich sind geht die schleife weiter
            double reihe3 = Math.pow((reihe33 + 1), 2);//(a1 +1)^2(nächste zahl wird ausgerechnet)
            System.out.printf("%.0f ", reihe3);//ausgabe der nächsten zahl
            wiederholung++;//wiederholung wird um 1 erhöht damit gesagt werden kann das eine Zahl ausgegeben wurde und die Schleife nicht undendlich ist
            reihe33++;
        }
        System.out.println();//spalte
        System.out.println();
        System.out.println("Reihe 4: ");
        wiederholung = 0;//wiederholung wird auf 0 zurückgesetzt weil sont die bedingung der nächsten while schleife schon erfüllt ist
        while (zahlen != wiederholung) {//solange zahlen und wiederholung nicht gleich sind geht die schleife weiter
            if (wiederholung % 2 == 0) {//wenn wiederholung gerade ist wird das gerechnet für die nächste zahl
                reihe4 = reihe44 ;
            } else {//wenn ungerade das
                reihe4 = reihe44 * (-1);
                reihe44++;
            }
            System.out.print(reihe4 + " ");//ausgabe der nächsten zahl
            wiederholung++;//wiederholung wird um 1 erhöht damit gesagt werden kann das eine Zahl ausgegeben wurde und die Schleife nicht undendlich ist
        }
    }
}