package blatt20.Aufgabe6;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Main {
    public static void main(String[] args) {
      /*  Charakter charakter = new Charakter("Mario","Mittel","Roter Feuerball");
        Charakter charakter2 = new Charakter("Koopa","Leicht","drei grüne Panzer");
        Item item = new Item("Turbo-Pilz","Beschleunigung erhöhen kurzzeitig",false);
        Item item2 = new Item("Stern","Macht für kurze Zeit unverwundbar und schneller. Wenn man während der Zeit, in der der Stern wirkt von einem Blitz getroffen wird, bleibt man groß",false);
        Kart kart = new Kart("Triumph-Schlitten",0.7,0.9);
        Kart kart2 = new Kart("Toad-Kart",0.8,0.4);
        Strecke strecke = new Strecke();
        Strecke strecke2 = new Strecke();
        Rennen rennen = new Rennen("Sinnvoll","Besetzt",20);
        Rennen rennen2 = new Rennen("Schnellen","Besetzt",20);*/
        Charakter charakter = new Charakter("Mike",Gewichtsklasse.MITTEL,"doener");
        System.out.println(charakter.getGewichtsklasse());
    }
}
