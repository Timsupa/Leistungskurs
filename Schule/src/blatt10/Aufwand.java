package blatt10;

public class Aufwand {
    public static int zahlDerUmbrueche(char[] charr) {
        int o = 0;
        int b= 0;
        int count = 0;
        o++;
        o++;
        for (int i = 0; i < charr.length-1; i++) {
            b++;
            o+=2;
        if (charr[i] == '.') {
            b++;
            if (charr[i+1] == ' ') {
                b++;
                count++;
                o++;
                o++;
            }
            o++;
            o++;
            o++;
        }
    }
        System.out.println(o);
        System.out.println(b);
    return count;
}

    public static char[] umbrueche(String s) {
        int b= 0;
        int o = 0;
        char[] charr = s.toCharArray();
        o++;
        int c = zahlDerUmbrueche(charr);
        o++;
        int k = 0;
        o++;
        char[] charr2 = new char[charr.length+c];
        o++;
        while (c > 0) {
            b++;
            for (int i = 0; i < charr.length-1; i++) {
                b++;
                if (charr[i] == '.') {
                    b++;
                    if (charr[i+1] == ' ') {
                        b++;
                        charr2[i] = charr[i];
                        charr2[i+1] = '\n';
                        k++;
                        c--;
                        o++;
                        o++;
                        o++;
                        o++;
                    } else {
                        o++;
                        charr2[i+k] = charr[i];
                    }
                } else {
                    if (charr[i] == ' ' && charr[i-1] == '.') {
                        b++;
                        o++;
                    } else {
                        charr2[i] = charr[i];
                        o++;
                    }
                }
                o++;
                o++;
            }
        }

        System.out.println(o);
        System.out.println(b);
        return charr2;

    }

    public static void main(String[] args) {
        String eingabe = "Nussecken (1 Blech). Teig: 300g Mehl, 1 TL Backpulver, 130g Zucker, 1 Pkg Vanillezucker, 2 EL Leinsamen, 6 EL Wasser, 130g Margarine/Butter. Belag: 200g Margarine/Butter, 6 EL Wasser, 200g Zucker, 1 Pkg Vanillezucker, 400g gemahlene Haselnüsse/Mandeln. Außerdem: Erdbeer-/Himbeermarmelade, 100g Zartbitterschokolade. Schritte: Die Leinsamen in 6 EL Wasser aufquellen lassen. Alle Zutaten für den Teig vermischen und zu einem relativ weichen Teig zerkneten, dann auf einem mit Backpapier ausgelegten Backbleck dünn drücken. Marmelade dünn auf dem Teig verteilen. Margarine, Wasser, Zucker und Vanillezucker in einem Topf schmelzen und kurz aufkochen lassen, dann Nüsse dazugeben und alles vermischen. Belag auf der Marmelade verteilen. Im vorgeheizten Backofen bei 180° C Ober/Unterhitze oder 160° C Umluft ca. 30 Minuten backen. Glasur erwärmen und mit einem Löffel über das Blech sprenkeln (so wird es gleichmäßiger und geht schneller als die Ecken in Schokolade zu tunken), abkühlen lassen. Zu Ecken schneiden. ";
        char[] ausgabe = umbrueche(eingabe);
        System.out.println(eingabe);
        System.out.println(ausgabe);
        System.out.println(eingabe.length());
        //b) bedingungen 2089  operationen 5170
    }//c)) 1013  ARR= 7016 = 8029 byte
    //d )) es kann schnell zu fehlern bei "ausgabe" führen wenn etwas verändert wird
    //e)) worstcase= speicher&aufwand = wenn eingabe n charakter hat
    //bestcase = speicher&aufwand =wenn eingabe 0 charakter hat
}
