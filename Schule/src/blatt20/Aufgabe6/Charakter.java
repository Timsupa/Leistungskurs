package blatt20.Aufgabe6;
public class Charakter {
    private String name;
    private Gewichtsklasse gewichtsklasse;
    private String spezialitem;

    private Item item;
    private Kart kart;

    public Charakter(String name, Gewichtsklasse gewichtsklasse, String spezialitem) {
        this.name = name;
        this.gewichtsklasse = gewichtsklasse;
        this.spezialitem = spezialitem;
    }
    public String getName() {
        return name;
    }

    public String getSpezialitem() {
        return spezialitem;
    }


    public Gewichtsklasse getGewichtsklasse() {
        return gewichtsklasse;
    }
    public void lenkeKart(Kart kart) {

    }
    public void halteItem(Item halteItem) {

    }
    public void wirftItem(Item wirftItem) {

    }

}


