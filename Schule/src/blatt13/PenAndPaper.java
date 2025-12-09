package blatt13;

public class PenAndPaper {
    public static int wuerfel(){
        int sum = 0;
        sum = blatt13.Zufall.zufallGanz(1,20);
        return sum;
    }
    public static boolean check(int vor){
        int h = wuerfel();
        if(vor<=h){
            return true;
        }else if (h == 20){
            return true;
        }else if (h == 0) {
            return false;
        }
        return false;
    }
    public static int check(int vor,String vorNach){
        if(vorNach == "Vorteil"){
            int h = wuerfel();
            int j = wuerfel();
            if (h<=j){
                return h;
            }else {
                return j;
            }
        }
    }

}
