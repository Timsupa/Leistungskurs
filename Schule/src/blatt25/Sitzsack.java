package blatt25;

public class Sitzsack extends Sitzmoeglichkeit {
    private int volumen;
    public Sitzsack(int vordefiniertesVolumen) {
        super(4,0);
        this.volumen = vordefiniertesVolumen;
    }

    @Override
    public void hinsetzen() {
        if (this.volumen < 20 || this.volumen >= 90-this.getCurrPerso()*10) {
            return;
        }
        super.hinsetzen();
        this.volumen -= 2;

    }
    public void auffuellen(int menge){
        if (this.volumen+menge < 100) {
            this.volumen += menge;
        }else {
            System.out.println("Das wird nicht passen, zu viel Volumen");
            return;
        }
    }
    public void aufstehen(){

    }
}
