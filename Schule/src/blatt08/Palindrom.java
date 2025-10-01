package blatt08;


import javax.swing.*;

public class Palindrom {
    public static String umdrehen(String str) {
        char[] charr = str.toCharArray();
        int len = charr.length;
        char[] palindrom = new char[len];
        for (int i = 0; i < charr.length; i++) {
            palindrom[i] = charr[len - 1];
            len--;
        }
        String palindromStr = new String(palindrom);
        return palindromStr;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = umdrehen(str1);
        System.out.println(str2);
        System.out.println(str1);
        isPalindrome("otto");
    }
    public static void isPalindrome(String str) {
       String ayran =  umdrehen(str);
       if (ayran.equals(str)){
           System.out.println(true);
        }else{
           System.out.println(false);
        }
    }
}

