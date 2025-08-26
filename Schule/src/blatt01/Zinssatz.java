package blatt01;

public class Zinssatz {
        public static void main(String[] args) {
            double altesKapital = 1220.0;
            double zinssatz = 2.25;
            double zinsen = altesKapital *  zinssatz / 100;
            double neuesKapital  =  altesKapital + zinsen;
            System.out.println("Alten Kapital: " + altesKapital +"€");
            System.out.println("Zinssatz: " + zinssatz + "%\n");
            System.out.println("Zinsen:" + zinsen + "€");
            System.out.println("Neues Kapital: " + neuesKapital + "€");









    }
}
