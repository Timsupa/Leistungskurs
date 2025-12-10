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
//todo e
}
