package blatt20.Aufgabe6;

public class Kart {
    private String modellName;
    private double maxGeschwindigkeit;
    private double beschleuingung;

    public Kart(String modellName, double beschleuingung, double maxGeschwindigkeit) {
        this.modellName = modellName;
        this.beschleuingung = beschleuingung;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public String getModellName() {
        return modellName;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public double getBeschleuingung() {
        return beschleuingung;
    }
    public double setBeschleuingung(double beschleuingung) {
        this.beschleuingung = beschleuingung;
        return beschleuingung;
    }
    public void beschleunige(){
        this.beschleuingung++;
    }
    public void bremse(){
        this.beschleuingung--;
    }
    public void drifte(){

    }
}
