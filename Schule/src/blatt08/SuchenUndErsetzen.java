package blatt08;
import java.util.Scanner;
import java.util.Scanner;

public class SuchenUndErsetzen {
    public static String ersetzen(String a,char c,char c1) {
        char[] b = a.toCharArray();
        for(int i = 0;i < b.length;i++){
            if(b[i] == c ){
                b[i] = c1;
            }
        }
        String out =new String(b);
        return out;
    }

    public static void main(String[] args) {
        String a ="fgazgfj";
        char c ='a';
        char c1 ='u';
        String ersetzen =ersetzen(a,c,c1);
        System.out.println(ersetzen);
    }
}
