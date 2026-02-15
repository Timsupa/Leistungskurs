package blatt13;

public class MonteCarlo {
    static int regenImBrunen;
    static int regenAußen;
    static int regenGesamt = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < regenGesamt; i++) {
            double y = blatt13.Zufall.zufall(-0.5, 0.5);
            double x = blatt13.Zufall.zufall(-0.5, 0.5);
            if ((Math.pow(x,2) + Math.pow(y,2)) <= 0.5*0.5){
                regenImBrunen ++;
            }
            else {
                regenAußen++;
            }
        }
        double PI = (double) (4 * regenImBrunen) / regenGesamt;
        System.out.println("PI = " + PI);
        System.out.println("Im Brunen: " + regenImBrunen);
        System.out.println("Außen:" + regenAußen);
    }

}
