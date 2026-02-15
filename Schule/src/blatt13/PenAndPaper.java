package blatt13;

public class PenAndPaper {
    public static int wuerfel(int menge,int m){
        int sum = 0;
        for(int i=0;i<menge;i++) {
            sum = blatt13.Zufall.zufallGanz(1, m);
        }
        return sum;
    }
    public static boolean check(int wurf){
        int h = 12;
        if(wurf <=h){
            return false;
        }else if (wurf == 20){
            System.out.println("Kritische treffer");
            return true;
        }else if (wurf == 0) {
            System.out.println("Kritische Fehlschlag");
            return false;
        }
        return true;
    }
    public static boolean check(int vor,String vorNach){
        int h = wuerfel(1,20);
        int j = wuerfel(1,20);
        int wurf = 0;
        if(vorNach == "Vorteil"){
            if (h<=j){
                wurf= h;
            }else {
                wurf= j;
            }
        }else if (vorNach == "Nachteil"){
            if (h<=j){
                wurf= j;
            }else  {
                wurf= j;
            }
        }
        return check(wurf);
    }
    public static int angriff(int wurf,String vorNach,int rüstung,int menge,int bonus) {
        int schaden = 0;
        if (vorNach.contains("Vorteil") || vorNach.contains("Nachteil")) {
            if (check(wurf, vorNach)) {
                schaden = wuerfel(menge, wurf);
                if (check(rüstung, vorNach)) {
                    schaden += bonus;
                }
                return schaden;
            }
            } else {
                if (check(wurf)) {
                    schaden = wuerfel(menge, wurf);
                    if (check(rüstung)) {
                        schaden += bonus;
                    }
                    return schaden;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int lebenA = 70;
            int lebenB = 42;
            int rüstung1 = 14;
            int rüstung2 = 10;
            int bonusA = 1;
            int bonusB = 2;
            String B = "Vorteil";
            String A = "Nachteil";
            int länge = 3;
            while (true) {
                lebenA -= angriff(1, B, rüstung1,6, bonusB);
                if (lebenA <= 0) {
                    System.out.println("Bard");
                    break;
                }
                int temp = lebenB;
                lebenB -= angriff(1, A,rüstung2 ,8 , bonusA);
                if (lebenB <= 0) {
                    System.out.println("Barbar");
                    break;
                }
                if (lebenB < temp) {
                    lebenB -= wuerfel(1, 10);
                }
                länge--;
                if (länge == 0) {
                    B = "Nachteil";
                    A = "Vorteil";
                }
            }
        }
    }
}
