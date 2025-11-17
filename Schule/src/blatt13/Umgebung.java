package blatt13;

public class Umgebung {
    public static int findeExponent(double basis,double ugrenz){
        int expo = 2;
        double me = basis;
        while(ugrenz<=me){
            me = Math.pow(basis,expo);
            expo++;
        }
        return expo;
    }

    public static void main(String[] args) {
        System.out.println(findeExponent(0.9,0.0006));
    }
}
