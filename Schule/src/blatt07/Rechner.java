package blatt07;

public class Rechner {
    public static void operation(double a, double b){
        System.out.println(sub(a, b));
        System.out.println(add(a, b));
        System.out.println(div(a, b));
        System.out.println(mult(a, b));
    }
    public static double sub(double a, double b){
        return a / b;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static double mult(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a - b;
    }
}

