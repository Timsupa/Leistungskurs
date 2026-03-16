package blatt20;

public class Auto {
    private String marke;
    private String model;
    private int tank;
    private int geschwindigkeit;
    private int kilometerstand;
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
    public void setTank(int tank){
        this.tank = tank;
        if (tank < 0)
        {
            tank = 0;
        }
    }
    public void setGeschwindigkeit(int geschwindigkeit){
        this.geschwindigkeit = geschwindigkeit;
        if (geschwindigkeit < 0){
            geschwindigkeit = 0;
        }
    }
    public void setKilometerstand(int kilometerstand){
        this.kilometerstand = kilometerstand;
        if (kilometerstand < 0){
            kilometerstand = 0;
        }
    }
    public static void main(String[] args) {
        Auto a1 = new Auto();
        System.out.println("Geschwindigkeit: " + a1.geschwindigkeit);
        System.out.println("Kilometerstand: " + a1.kilometerstand);
        System.out.println("Tank: " + a1.tank);

    }
}
