package blatt25;

public abstract class Sitzmoeglichkeit {
    private int maxPerso;
    private int currPerso;

    public Sitzmoeglichkeit(int maxPerso, int currPerso) {
        this.maxPerso = maxPerso;
        this.currPerso = currPerso;
    }

    public int getMaxPerso() {
        return maxPerso;
    }
    public int getCurrPerso() {
        return currPerso;
    }
    public void hinsetzen(){
        if(1+ currPerso <= maxPerso) {
            this.currPerso ++;
        }else {
            System.out.println("kein Platz");
        }
    }
    public void aufstehen(){
        if(currPerso > 0) {
            this.currPerso--;
        }
    }
}
