package blatt20.aufgabe5;

public class OnilneShop {
    public class Benutzerkonto{
        private String benutzername;
        private String eMail;
        private int geburtsfatum;
        private String akktuPasswort;
        private int gutscheinguthaben;

        public Benutzerkonto(String benutzername, String eMail, int geburtsfatum) {
            this.benutzername = benutzername;
            this.eMail = eMail;
            this.geburtsfatum = geburtsfatum;
            String akktuPasswort;
            int gutscheinguthaben;
        }
        public void setAkktuPasswort(String akktuPasswort) {
            this.akktuPasswort = akktuPasswort;
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

        public int getGutscheinguthaben() {
            return gutscheinguthaben;
        }
        public void passwortAenderung(String altesPasswort,int verscuhe) {
            int versuche = verscuhe;
            if (this.akktuPasswort.equals(altesPasswort)) {
                this.akktuPasswort = altesPasswort;
            }else {
                if (versuche >= 3){
                    System.out.println("Verschwinden Sie");
                }
                System.out.println("Altes Passwort fals testen sie erneut");
                passwortAenderung(altesPasswort,versuche);
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
        public void Gutschein(String gutscheinCode,String paswort,String EMail) {
            anmeldung(paswort,eMail);
        }
    }

}
