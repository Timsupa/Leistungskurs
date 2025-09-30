package blatt07;

public class Stein {
    public static double seitGGT(int a, int b) {
        double count = 0;
        double ggT = 0;
        double d;
        if (a % 2 == 0 && b % 2 == 0) {
            while (a != 0 || b != 0) {
                a /= 2;
                b /= 2;
                count++;
            }
            if (a == 0){
                d = b;
            }else  {
                d = a;
            }
        }else if (a%2 !=0 && b%2 != 0) {
            while (a != 0 && b != 0) {
                if (a > b) {
                    a = (a - b) / 2;
                    count++;
                }
            }
        }else if (a%2 !=0 && b%2 == 0) {
            while (b != 0) {
                b /= 2;
                count++;
            }
        }else if (a%2 ==0 && b%2 != 0) {
            while (a != 0) {
                a /= 2;
                count++;
            }
        }
        ggT = Math.pow(2,count);
        return count;
    }
}
