package blatt13;

public class QuadratApproximation {
    public static int flaecheQuadrat(int seitel){
        int flea = seitel*seitel;
        return flea;
    }
    public static double flaecheQuadrat(double seitel){
        double flea = seitel*seitel;
        return flea;
    }
    public static double sucheSeitenlaenge(int flae) {
        double seit = 0;
        double diff = flae;
        while(diff>0.00001){
            if(flae < seit){
                seit-=0.1;
            }else {
                seit+=0.1;
            }
            diff = flae - flaecheQuadrat(seit);
        }
        return seit;
    }

    public static void main(String[] args) {
        System.out.println(sucheSeitenlaenge(9));
    }
}
