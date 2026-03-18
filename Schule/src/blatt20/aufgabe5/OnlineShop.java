package blatt20.aufgabe5;

public class OnlineShop { //brutal falsch geschrieben (Rechtschreibung)
    public class Benutzerkonto{
        private String benutzername;
        private String eMail;
        private int geburtsfatum;
        private String akktuPasswort;
        private double gutscheinguthaben;

        public Benutzerkonto(String benutzername, String eMail, int geburtsfatum) {
            this.benutzername = benutzername;
            this.eMail = eMail;
            this.geburtsfatum = geburtsfatum;
            String akktuPasswort;
            int gutscheinguthaben;
        }
        public void setAkktuPasswort(String akktuPasswort) {
            this.akktuPasswort = akktuPasswort; // war nicht in der aufgabe aber waere ne coole idee vielleicht irgendwie ne bestimme zeichenanzahl oder so zu machen hab ich aber auch nicht
        }
        public void setGutscheinguthaben(int gutscheinguthaben) {
            this.gutscheinguthaben = gutscheinguthaben;
        }
        public String getBenutzername() {
            return benutzername;
        }

        public String geteMail() {
            return eMail;
        }

        public int getGeburtsfatum() {
            return geburtsfatum;
        }

        public String getAkktuPasswort() {
            return akktuPasswort;
        }

        public double getGutscheinguthaben() {
            return gutscheinguthaben;
        }
        public void passwortAenderung(String altesPasswort,int verscuhe, String mail) { // auch einfach rechtschreibfehler ich mach irgendwelche um irgendwas zu haben
            if (anmeldung(altesPasswort,mail)){
            int versuche = verscuhe;
            if (this.akktuPasswort.equals(altesPasswort)) {
                this.akktuPasswort = altesPasswort;
            }else {
                if (versuche >= 3) {
                    System.out.println("Verschwinden Sie");
                }
                System.out.println("Altes Passwort fals testen sie erneut");
                passwortAenderung(altesPasswort, versuche,mail);
            }
            }
        }
        public boolean anmeldung(String passwort,String EMail) {
            if (passwort.equals(this.akktuPasswort)&&EMail.equals(this.eMail)) {
                System.out.println("Angemeldet");
                return true;
            }else {
                System.out.println("Passwort falsch testen sie erneut");
            }
            return false;
        }
        public void Gutschein(String gutscheinCode,String paswort,String eMail) { // herr schisch sagt muss klein
            if (anmeldung(paswort,eMail)){
                if (gutscheinCode.equals("22 Bahnen ich tue eine Einhonr ueberfahren")) {
                    setGutscheinguthaben(+20);
                }
            }else {
                System.out.println("Passwort falsch testen sie erneut");
            }
        }
        public double getgutscheinguthaben() {
            System.out.println(getgutscheinguthaben());
            return getGutscheinguthaben();
        }
        public void gethilfe(String pass,String mail,String prob){
            if (anmeldung(pass,mail)) {
                System.out.println("Wir können ihnen nicht Helfen");
            }
        }

        // sieht alles gut aus, finde ich keine ahnung was ich hinschreiben soll
    }

}
