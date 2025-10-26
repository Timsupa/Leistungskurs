package blatt08;

public static boolean istDezimal(int a){
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
public static boolean istDezimal(String a){
    boolean istEs = false;
    String intString = new String(a);
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

