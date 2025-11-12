package blatt10;

public class DNA {
    public static boolean istDNA(String arr) {
        int komplett = 0;
        if (arr.length()%2 != 0){
            return false;
        }
        for (int i = 0; i < arr.length()+1; i++) {
          if (arr.charAt(i) == 'A' && arr.charAt(i+1) == 'T'){
              komplett = 1;
           }else if (arr.charAt(i) == 'T' && arr.charAt(i+1) == 'A'){
              komplett = 1;
          }else if (arr.charAt(i) == 'G' && arr.charAt(i+1) == 'C'){
              komplett = 1;
          }else if (arr.charAt(i) == 'C' && arr.charAt(i+1) == 'G'){
              komplett = 1;
          }
          else {
              komplett = 0;
          }
          if (komplett == 0){return false;}
        }
        return true;
    }

}
