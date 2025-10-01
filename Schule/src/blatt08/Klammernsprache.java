package blatt08;

public class Klammernsprache {
    public static boolean istKlammernsprache(String str) {
        char[] ch = str.toCharArray();
        int a = 0;
        for (int i = 0; i < ch.length; i++) {
            if (a < 0) {
                return false;
            }
            if (ch[i] == '(') {
                a++;
            }
            else if (ch[i] == ')') {
                a--;
            }
        }
        return a == 0;
    }

    public static void main(String[] args) {
        istKlammernsprache("()()()(");
    }
}
