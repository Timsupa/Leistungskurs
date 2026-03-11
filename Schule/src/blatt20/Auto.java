package blatt20;

public class Auto {
    String marke;
    String model;
    int tank;
    int geschwindigkeit;
    int kilometerstand;
    Auto a1 = new Auto();
    public void beschleunigen(int v){
        this.geschwindigkeit = 0;
    }
    public void bremsen(int v) {
        this.geschwindigkeit = 0;
    }
    public void fahren(int km) {
        this.kilometerstand = km;
         }
    public Auto (){
        marke ="BMW";
        model ="M4";
        tank = 4512;
        geschwindigkeit = 632;
        kilometerstand = 1;
    }
    public Auto (String x , String y, int z, int g, int km){
        this.marke = y;
        this.model = x;
        this.tank = z;
        this.geschwindigkeit = g;
        this.kilometerstand = km;
    }
    public Auto(Auto x){
        this.marke = x.marke;
        this.model = x.model;
        this.tank = x.tank;
        this.geschwindigkeit = x.geschwindigkeit;
        this.kilometerstand = x.kilometerstand;

    }
    public static void main(String[] args) {
        Auto a1 = new Auto();
    }
}
