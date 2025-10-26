package blatt08;

import static blatt08.Palindrom.umdrehen;

public static boolean istBinär(int a){
    boolean istEs = false;
    String intString = new String(Integer.toString(a));
    if(intString.contains("(")) {
        if("2".equals(intString.charAt(intString.length()))) {
            istEs = true;
        }else {
            istEs = false;
        }
    }else{
        istEs = false;
    }
    return istEs;
}
public static boolean istDezimal(int a){
    boolean istEs = false;
    String intString = new String(Integer.toString(a));
    if(intString.contains("(")) {
        istEs = false;
    }else {
        istEs = true;
    }
    return istEs;
}
public static boolean istHexadezimal(int a){
    boolean istEs = false;
    String intString = new String(Integer.toString(a));
    if(intString.contains("(")) {
        if("6".equals(intString.charAt(intString.length()))&&"1".equals(intString.charAt(intString.length()-1))) {
            istEs = true;
        }
    }else  {
        istEs = false;
    }
    return istEs;
}
public static int zuDezimal(int a) {
    int dezimal = 0;
    boolean dezi = istDezimal(a);
    boolean binär = istBinär(a);
    boolean hex = istHexadezimal(a);
    String intString = new String(Integer.toString(a));
    if (dezi == true) {
        dezimal = a;
    } else if (binär == true) {
        int temp = 2;
        String temp2 = umdrehen(intString);
        char[] rech = temp2.toCharArray();
        for (int i = 1; i < intString.length(); i++) {
            if (rech[i] == '(' || rech[i] == ')') {
                continue;
            }
            if (i == 1) {
                if (rech[i] == 1) {
                    dezimal += 1;
                }
            }else{
                if (rech[i] == 1) {
                    dezimal += temp;
                    temp = temp*2;
                }
            }
        }
    } else if (hex = true) {
        int multi = 0;
        char[] rech2 = intString.toCharArray();
        for (int i = 0; i < intString.length()-1; i++) {
            if (rech2[i] == '(' || rech2[i] == ')') {
                continue;
            }
            if(rech2[i] == 1 || rech2[i] == 2  || rech2[i] == 3 || rech2[i] == 4 || rech2[i] == 5 || rech2[i] == 6 || rech2[i] == 7 || rech2[i] == 8 || rech2[i] == 9) {
                dezimal += rech2[i]*Math.pow(16,multi);
            } else if (rech2[i] == 'A') {
                dezimal += 10*Math.pow(16,multi);
            }else if (rech2[i] == 'B') {
                dezimal += 11*Math.pow(16,multi);
            }else if (rech2[i] == 'C') {
                dezimal += 12*Math.pow(16,multi);
            }else if (rech2[i] == 'D') {
                dezimal += 13*Math.pow(16,multi);
            } else if (rech2[i] == 'E') {
                dezimal += 14*Math.pow(16,multi);
            }else if (rech2[i] == 'F') {
                dezimal += 15*Math.pow(16,multi);
            }
            multi++;
        }
    }
    return dezimal;
}

